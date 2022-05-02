package com.facebook.stetho.server.http;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.stetho.server.LeakyBufferedInputStream;
import com.facebook.stetho.server.SocketLike;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LightHttpServer {
    private static final String TAG = "LightHttpServer";
    private final HandlerRegistry mHandlerRegistry;

    public LightHttpServer(HandlerRegistry handlerRegistry) {
        this.mHandlerRegistry = handlerRegistry;
    }

    public void serve(SocketLike socketLike) throws IOException {
        LeakyBufferedInputStream leakyBufferedInputStream = new LeakyBufferedInputStream(socketLike.getInput(), 1024);
        OutputStream output = socketLike.getOutput();
        HttpMessageReader httpMessageReader = new HttpMessageReader(leakyBufferedInputStream);
        HttpMessageWriter httpMessageWriter = new HttpMessageWriter(new BufferedOutputStream(output));
        SocketLike socketLike2 = new SocketLike(socketLike, leakyBufferedInputStream);
        LightHttpRequest lightHttpRequest = new LightHttpRequest();
        LightHttpResponse lightHttpResponse = new LightHttpResponse();
        while (true) {
            LightHttpRequest readRequestMessage = readRequestMessage(lightHttpRequest, httpMessageReader);
            if (readRequestMessage != null) {
                lightHttpResponse.reset();
                if (dispatchToHandler(socketLike2, readRequestMessage, lightHttpResponse)) {
                    writeFullResponse(lightHttpResponse, httpMessageWriter, output);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private boolean dispatchToHandler(SocketLike socketLike, LightHttpRequest lightHttpRequest, LightHttpResponse lightHttpResponse) throws IOException {
        PrintWriter printWriter;
        HttpHandler lookup = this.mHandlerRegistry.lookup(lightHttpRequest.uri.getPath());
        if (lookup == null) {
            lightHttpResponse.code = 404;
            lightHttpResponse.reasonPhrase = "Not found";
            lightHttpResponse.body = LightHttpBody.create("No handler found\n", "text/plain");
            return true;
        }
        try {
            return lookup.handleRequest(socketLike, lightHttpRequest, lightHttpResponse);
        } catch (RuntimeException e) {
            lightHttpResponse.code = 500;
            lightHttpResponse.reasonPhrase = "Internal Server Error";
            StringWriter stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            printWriter.close();
            lightHttpResponse.body = LightHttpBody.create(stringWriter.toString(), "text/plain");
            return true;
        } catch (Throwable th) {
            printWriter.close();
            throw th;
        }
    }

    @Nullable
    private static LightHttpRequest readRequestMessage(LightHttpRequest lightHttpRequest, HttpMessageReader httpMessageReader) throws IOException {
        lightHttpRequest.reset();
        String readLine = httpMessageReader.readLine();
        if (readLine == null) {
            return null;
        }
        String[] split = readLine.split(" ", 3);
        if (split.length == 3) {
            lightHttpRequest.method = split[0];
            lightHttpRequest.uri = Uri.parse(split[1]);
            lightHttpRequest.protocol = split[2];
            readHeaders(lightHttpRequest, httpMessageReader);
            return lightHttpRequest;
        }
        throw new IOException("Invalid request line: ".concat(String.valueOf(readLine)));
    }

    private static void readHeaders(LightHttpMessage lightHttpMessage, HttpMessageReader httpMessageReader) throws IOException {
        while (true) {
            String readLine = httpMessageReader.readLine();
            if (readLine == null) {
                throw new EOFException();
            } else if (!"".equals(readLine)) {
                String[] split = readLine.split(": ", 2);
                if (split.length == 2) {
                    String str = split[0];
                    String str2 = split[1];
                    lightHttpMessage.headerNames.add(str);
                    lightHttpMessage.headerValues.add(str2);
                } else {
                    throw new IOException("Malformed header: ".concat(String.valueOf(readLine)));
                }
            } else {
                return;
            }
        }
    }

    private static void writeFullResponse(LightHttpResponse lightHttpResponse, HttpMessageWriter httpMessageWriter, OutputStream outputStream) throws IOException {
        lightHttpResponse.prepare();
        writeResponseMessage(lightHttpResponse, httpMessageWriter);
        if (lightHttpResponse.body != null) {
            lightHttpResponse.body.writeTo(outputStream);
        }
    }

    public static void writeResponseMessage(LightHttpResponse lightHttpResponse, HttpMessageWriter httpMessageWriter) throws IOException {
        StringBuilder sb = new StringBuilder("HTTP/1.1 ");
        sb.append(lightHttpResponse.code);
        sb.append(" ");
        sb.append(lightHttpResponse.reasonPhrase);
        httpMessageWriter.writeLine(sb.toString());
        int size = lightHttpResponse.headerNames.size();
        for (int i = 0; i < size; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) lightHttpResponse.headerNames.get(i));
            sb2.append(": ");
            sb2.append((String) lightHttpResponse.headerValues.get(i));
            httpMessageWriter.writeLine(sb2.toString());
        }
        httpMessageWriter.writeLine();
        httpMessageWriter.flush();
    }

    static class HttpMessageReader {
        private final StringBuilder mBuffer = new StringBuilder();
        private final BufferedInputStream mIn;
        private final NewLineDetector mNewLineDetector = new NewLineDetector();

        public HttpMessageReader(BufferedInputStream bufferedInputStream) {
            this.mIn = bufferedInputStream;
        }

        @Nullable
        public String readLine() throws IOException {
            while (true) {
                int read = this.mIn.read();
                if (read < 0) {
                    return null;
                }
                char c = (char) read;
                this.mNewLineDetector.accept(c);
                int state = this.mNewLineDetector.state();
                if (state == 1) {
                    this.mBuffer.append(c);
                } else if (state != 2 && state == 3) {
                    String obj = this.mBuffer.toString();
                    this.mBuffer.setLength(0);
                    return obj;
                }
            }
        }

        static class NewLineDetector {
            private static final int STATE_ON_CR = 2;
            private static final int STATE_ON_CRLF = 3;
            private static final int STATE_ON_OTHER = 1;
            private int state;

            private NewLineDetector() {
                this.state = 1;
            }

            public void accept(char c) {
                int i = this.state;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            StringBuilder sb = new StringBuilder("Unknown state: ");
                            sb.append(this.state);
                            throw new IllegalArgumentException(sb.toString());
                        } else if (c == 13) {
                            this.state = 2;
                        } else {
                            this.state = 1;
                        }
                    } else if (c == 10) {
                        this.state = 3;
                    } else {
                        this.state = 1;
                    }
                } else if (c == 13) {
                    this.state = 2;
                }
            }

            public int state() {
                return this.state;
            }
        }
    }

    public static class HttpMessageWriter {
        private static final byte[] CRLF = "\r\n".getBytes();
        private final BufferedOutputStream mOut;

        public HttpMessageWriter(BufferedOutputStream bufferedOutputStream) {
            this.mOut = bufferedOutputStream;
        }

        public void writeLine(String str) throws IOException {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                this.mOut.write(str.charAt(i));
            }
            this.mOut.write(CRLF);
        }

        public void writeLine() throws IOException {
            this.mOut.write(CRLF);
        }

        public void flush() throws IOException {
            this.mOut.flush();
        }
    }
}
