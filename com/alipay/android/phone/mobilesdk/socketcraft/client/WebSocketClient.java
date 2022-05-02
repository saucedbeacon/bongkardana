package com.alipay.android.phone.mobilesdk.socketcraft.client;

import com.alibaba.ariver.websocket.WSConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketAdapter;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.SSLExtensionsFactory;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public abstract class WebSocketClient extends WebSocketAdapter implements WebSocket, Runnable {
    static final /* synthetic */ boolean $assertionsDisabled = (!WebSocketClient.class.desiredAssertionStatus());
    private static final String TAG = "WebSocketClient";
    private CountDownLatch closeLatch;
    private CountDownLatch connectLatch;
    private int connectTimeout;
    private Draft draft;
    /* access modifiers changed from: private */
    public WebSocketImpl engine;
    private Map<String, String> headers;
    private InputStream istream;
    /* access modifiers changed from: private */
    public OutputStream ostream;
    private Proxy proxy;
    private Socket socket;
    private SSLSocketFactory sslSocketFactory;
    protected URI uri;
    private Thread writeThread;

    public abstract void onClose(int i, String str, boolean z);

    public void onCloseInitiated(int i, String str) {
    }

    public void onClosing(int i, String str, boolean z) {
    }

    public void onDns(String str, long j) {
    }

    public abstract void onError(Exception exc);

    public void onFragment(Framedata framedata) {
    }

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(ServerHandshake serverHandshake);

    public void onSSLHandshake(long j) {
    }

    public void onTcpConnect(String str, long j) {
    }

    public final void onWriteDemand(WebSocket webSocket) {
    }

    public void onWsHandshake(long j) {
    }

    public WebSocketClient(URI uri2) {
        this(uri2, new Draft_17());
    }

    public WebSocketClient(URI uri2, Draft draft2) {
        this(uri2, draft2, (Map<String, String>) null, 0);
    }

    public WebSocketClient(URI uri2, Draft draft2, Map<String, String> map, int i) {
        this.uri = null;
        this.engine = null;
        this.socket = null;
        this.proxy = Proxy.NO_PROXY;
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.connectTimeout = 0;
        if (uri2 == null) {
            throw new IllegalArgumentException();
        } else if (draft2 != null) {
            this.uri = uri2;
            this.draft = draft2;
            this.headers = map;
            this.connectTimeout = i;
            this.engine = new WebSocketImpl((WebSocketListener) this, draft2);
        } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
    }

    public URI getURI() {
        return this.uri;
    }

    public Draft getDraft() {
        return this.draft;
    }

    public void connect() {
        if (this.writeThread == null) {
            Thread thread = new Thread(this);
            this.writeThread = thread;
            thread.start();
            return;
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }

    public boolean connectBlocking() {
        connect();
        this.connectLatch.await();
        return this.engine.isOpen();
    }

    public void close() {
        if (this.writeThread != null) {
            this.engine.close(1000);
        }
    }

    public void closeBlocking() {
        close();
        this.closeLatch.await();
    }

    public void send(String str) {
        this.engine.send(str);
    }

    public void send(byte[] bArr) {
        this.engine.send(bArr);
    }

    public void run() {
        long currentTimeMillis;
        int read;
        try {
            if (this.socket == null) {
                this.socket = new Socket(this.proxy);
            } else if (this.socket.isClosed()) {
                throw new SocketException("Socket is closed");
            }
            if (!this.socket.isBound()) {
                connectNetwork();
            }
            this.istream = this.socket.getInputStream();
            this.ostream = this.socket.getOutputStream();
            currentTimeMillis = System.currentTimeMillis();
            sendHandshake();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            onWsHandshake(currentTimeMillis2);
            SCLogCatUtil.info(TAG, "WebSocketHandshark timing: ".concat(String.valueOf(currentTimeMillis2)));
            Thread thread = new Thread(new WebsocketWriteThread());
            this.writeThread = thread;
            thread.start();
            byte[] bArr = new byte[WebSocketImpl.RCVBUF];
            while (!isClosed() && !isClosing() && (read = this.istream.read(bArr)) != -1) {
                try {
                    this.engine.decode(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.engine.eot();
                } catch (RuntimeException e) {
                    onError(e);
                    this.engine.closeConnection(1006, e.getMessage());
                }
            }
            this.engine.eot();
            if (!$assertionsDisabled && !this.socket.isClosed()) {
                throw new AssertionError();
            }
        } catch (Exception e2) {
            onWebsocketError(this.engine, e2);
            this.engine.closeConnection(-1, e2.getMessage());
        } catch (Throwable th) {
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
            onWsHandshake(currentTimeMillis3);
            SCLogCatUtil.info(TAG, "WebSocketHandshark timing: ".concat(String.valueOf(currentTimeMillis3)));
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private void connectNetwork() {
        String str = " null ";
        long currentTimeMillis = System.currentTimeMillis();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.uri.getHost());
            if (allByName == null || allByName.length <= 0) {
                StringBuilder sb = new StringBuilder("Unknown host : ");
                sb.append(this.uri.getHost());
                throw new UnknownHostException(sb.toString());
            }
            InetAddress inetAddress = allByName[0];
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (inetAddress != null) {
                str = inetAddress.getHostAddress();
            }
            onDns(str, currentTimeMillis2);
            StringBuilder sb2 = new StringBuilder("DNS timing: ");
            sb2.append(currentTimeMillis2);
            sb2.append(", ip: ");
            sb2.append(str);
            SCLogCatUtil.info(TAG, sb2.toString());
            long currentTimeMillis3 = System.currentTimeMillis();
            try {
                this.socket.connect(new InetSocketAddress(inetAddress, getPort()), this.connectTimeout);
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                String hostAddress = inetAddress.getHostAddress();
                onTcpConnect(hostAddress, currentTimeMillis4);
                StringBuilder sb3 = new StringBuilder("Connection timing: ");
                sb3.append(currentTimeMillis4);
                sb3.append(", ip: ");
                sb3.append(hostAddress);
                SCLogCatUtil.info(TAG, sb3.toString());
                SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
                if (sSLSocketFactory != null) {
                    SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(this.socket, this.uri.getHost(), getPort(), true);
                    SSLExtensionsFactory.getInstance().enableTlsExtensions(sSLSocket, this.uri.getHost());
                    long currentTimeMillis5 = System.currentTimeMillis();
                    try {
                        sSLSocket.startHandshake();
                        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
                        onSSLHandshake(currentTimeMillis6);
                        StringBuilder sb4 = new StringBuilder("SSL timing: ");
                        sb4.append(currentTimeMillis6);
                        sb4.append(", ip: ");
                        sb4.append(inetAddress.getHostAddress());
                        SCLogCatUtil.info(TAG, sb4.toString());
                        this.socket = sSLSocket;
                    } catch (Throwable th) {
                        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis5;
                        onSSLHandshake(currentTimeMillis7);
                        StringBuilder sb5 = new StringBuilder("SSL timing: ");
                        sb5.append(currentTimeMillis7);
                        sb5.append(", ip: ");
                        sb5.append(inetAddress.getHostAddress());
                        SCLogCatUtil.info(TAG, sb5.toString());
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                long currentTimeMillis8 = System.currentTimeMillis() - currentTimeMillis3;
                String hostAddress2 = inetAddress.getHostAddress();
                onTcpConnect(hostAddress2, currentTimeMillis8);
                StringBuilder sb6 = new StringBuilder("Connection timing: ");
                sb6.append(currentTimeMillis8);
                sb6.append(", ip: ");
                sb6.append(hostAddress2);
                SCLogCatUtil.info(TAG, sb6.toString());
                throw th2;
            }
        } catch (Throwable th3) {
            long currentTimeMillis9 = System.currentTimeMillis() - currentTimeMillis;
            onDns(str, currentTimeMillis9);
            StringBuilder sb7 = new StringBuilder("DNS timing: ");
            sb7.append(currentTimeMillis9);
            sb7.append(", ip: ");
            sb7.append(str);
            SCLogCatUtil.info(TAG, sb7.toString());
            throw th3;
        }
    }

    private int getPort() {
        int port = this.uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.uri.getScheme();
        if (scheme.equals(WSConstant.SCHEME_WSS)) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        if (scheme.equals(WSConstant.SCHEME_WS)) {
            return 80;
        }
        throw new RuntimeException("unkonow scheme".concat(String.valueOf(scheme)));
    }

    private void sendHandshake() {
        String path = this.uri.getPath();
        String query = this.uri.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(path);
            sb.append("?");
            sb.append(query);
            path = sb.toString();
        }
        int port = getPort();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.uri.getHost());
        sb2.append(port != 80 ? ":".concat(String.valueOf(port)) : "");
        String obj = sb2.toString();
        HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
        handshakeImpl1Client.setResourceDescriptor(path);
        handshakeImpl1Client.put(HttpHeaders.HOST, obj);
        Map<String, String> map = this.headers;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                handshakeImpl1Client.put((String) next.getKey(), (String) next.getValue());
            }
        }
        this.engine.startHandshake(handshakeImpl1Client);
    }

    public WebSocket.READYSTATE getReadyState() {
        return this.engine.getReadyState();
    }

    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        onMessage(str);
    }

    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        onMessage(byteBuffer);
    }

    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        onFragment(framedata);
    }

    public final void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        this.connectLatch.countDown();
        onOpen((ServerHandshake) handshakedata);
    }

    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        this.connectLatch.countDown();
        this.closeLatch.countDown();
        Thread thread = this.writeThread;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            if (this.socket != null) {
                this.socket.close();
            }
        } catch (IOException e) {
            onWebsocketError(this, e);
        }
        onClose(i, str, z);
    }

    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        onError(exc);
    }

    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        onCloseInitiated(i, str);
    }

    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        onClosing(i, str, z);
    }

    public WebSocket getConnection() {
        return this.engine;
    }

    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        Socket socket2 = this.socket;
        if (socket2 != null) {
            return (InetSocketAddress) socket2.getLocalSocketAddress();
        }
        return null;
    }

    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        Socket socket2 = this.socket;
        if (socket2 != null) {
            return (InetSocketAddress) socket2.getRemoteSocketAddress();
        }
        return null;
    }

    class WebsocketWriteThread implements Runnable {
        private WebsocketWriteThread() {
        }

        public void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = WebSocketClient.this.engine.outQueue.take();
                    WebSocketClient.this.ostream.write(take.array(), 0, take.limit());
                    WebSocketClient.this.ostream.flush();
                } catch (IOException unused) {
                    WebSocketClient.this.engine.eot();
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }

    public void setProxy(Proxy proxy2) {
        if (proxy2 != null) {
            this.proxy = proxy2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setSocket(Socket socket2) {
        if (this.socket == null) {
            this.socket = socket2;
            return;
        }
        throw new IllegalStateException("socket has already been set");
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        this.engine.sendFragmentedFrame(opcode, byteBuffer, z);
    }

    public boolean isOpen() {
        return this.engine.isOpen();
    }

    public boolean isFlushAndClose() {
        return this.engine.isFlushAndClose();
    }

    public boolean isClosed() {
        return this.engine.isClosed();
    }

    public boolean isClosing() {
        return this.engine.isClosing();
    }

    public boolean isConnecting() {
        return this.engine.isConnecting();
    }

    public boolean hasBufferedData() {
        return this.engine.hasBufferedData();
    }

    public void close(int i) {
        this.engine.close();
    }

    public void close(int i, String str) {
        this.engine.close(i, str);
    }

    public void closeConnection(int i, String str) {
        this.engine.closeConnection(i, str);
    }

    public void send(ByteBuffer byteBuffer) {
        this.engine.send(byteBuffer);
    }

    public void sendFrame(Framedata framedata) {
        this.engine.sendFrame(framedata);
    }

    public InetSocketAddress getLocalSocketAddress() {
        return this.engine.getLocalSocketAddress();
    }

    public InetSocketAddress getRemoteSocketAddress() {
        return this.engine.getRemoteSocketAddress();
    }

    public String getResourceDescriptor() {
        return this.uri.getPath();
    }
}
