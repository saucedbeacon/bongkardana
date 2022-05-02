package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.protocol.module.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;
import javax.annotation.Nullable;

public class DecompressionHelper {
    static final String DEFLATE_ENCODING = "deflate";
    static final String GZIP_ENCODING = "gzip";

    public static InputStream teeInputWithDecompression(NetworkPeerManager networkPeerManager, String str, InputStream inputStream, OutputStream outputStream, @Nullable String str2, ResponseHandler responseHandler) throws IOException {
        CountingOutputStream countingOutputStream;
        if (str2 != null) {
            boolean equals = "gzip".equals(str2);
            boolean equals2 = DEFLATE_ENCODING.equals(str2);
            if (equals || equals2) {
                countingOutputStream = new CountingOutputStream(outputStream);
                if (equals) {
                    outputStream = GunzippingOutputStream.create(countingOutputStream);
                } else if (equals2) {
                    outputStream = new InflaterOutputStream(countingOutputStream);
                }
                return new ResponseHandlingInputStream(inputStream, str, outputStream, countingOutputStream, networkPeerManager, responseHandler);
            }
            Console.MessageLevel messageLevel = Console.MessageLevel.WARNING;
            Console.MessageSource messageSource = Console.MessageSource.NETWORK;
            StringBuilder sb = new StringBuilder("Unsupported Content-Encoding in response for request #");
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            CLog.writeToConsole(networkPeerManager, messageLevel, messageSource, sb.toString());
        }
        countingOutputStream = null;
        return new ResponseHandlingInputStream(inputStream, str, outputStream, countingOutputStream, networkPeerManager, responseHandler);
    }
}
