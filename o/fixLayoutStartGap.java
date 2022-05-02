package o;

import android.annotation.SuppressLint;
import com.alibaba.ariver.websocket.WSConstant;
import com.google.common.net.HttpHeaders;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

@SuppressLint({"Assert"})
public abstract class fixLayoutStartGap extends fixLayoutEndGap implements Runnable, WebSocket {
    static final /* synthetic */ boolean setMax = (!fixLayoutStartGap.class.desiredAssertionStatus());
    private CountDownLatch FastBitmap$CoordinateSystem = new CountDownLatch(1);
    /* access modifiers changed from: private */
    public OutputStream IsOverlapping;
    private Map<String, String> equals;
    private Socket getMax = null;
    protected URI getMin = null;
    private Proxy isInside = Proxy.NO_PROXY;
    /* access modifiers changed from: private */
    public updateLayoutStateToFillStart length = null;
    private InputStream setMin;
    private CountDownLatch toDoubleRange = new CountDownLatch(1);
    private Thread toFloatRange;
    private Draft toIntRange;
    private int toString = 0;

    public abstract void equals();

    public abstract void getMin(Exception exc);

    public abstract void setMin(String str);

    public abstract void toFloatRange();

    public fixLayoutStartGap(URI uri, Draft draft) {
        if (uri != null) {
            this.getMin = uri;
            this.toIntRange = draft;
            this.equals = null;
            this.toString = 5000;
            this.length = new updateLayoutStateToFillStart(this, draft);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void run() {
        int read;
        try {
            if (this.getMax == null) {
                this.getMax = new Socket(this.isInside);
            } else if (this.getMax.isClosed()) {
                throw new IOException();
            }
            if (!this.getMax.isBound()) {
                this.getMax.connect(new InetSocketAddress(this.getMin.getHost(), FastBitmap$CoordinateSystem()), this.toString);
            }
            this.setMin = this.getMax.getInputStream();
            this.IsOverlapping = this.getMax.getOutputStream();
            invoke();
            Thread thread = new Thread(new setMax(this, (byte) 0));
            this.toFloatRange = thread;
            thread.start();
            byte[] bArr = new byte[updateLayoutStateToFillStart.getMax];
            while (!toDoubleRange() && (read = this.setMin.read(bArr)) != -1) {
                try {
                    updateLayoutStateToFillStart updatelayoutstatetofillstart = this.length;
                    ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, read);
                    if (!updateLayoutStateToFillStart.toDoubleRange) {
                        if (!wrap.hasRemaining()) {
                            throw new AssertionError();
                        }
                    }
                    if (updateLayoutStateToFillStart.getMin) {
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder("process(");
                        sb.append(wrap.remaining());
                        sb.append("): {");
                        sb.append(wrap.remaining() > 1000 ? "too big to display" : new String(wrap.array(), wrap.position(), wrap.remaining()));
                        sb.append("}");
                        printStream.println(sb.toString());
                    }
                    if (updatelayoutstatetofillstart.IsOverlapping != WebSocket.READYSTATE.NOT_YET_CONNECTED) {
                        updatelayoutstatetofillstart.length(wrap);
                    } else if (updatelayoutstatetofillstart.setMax(wrap)) {
                        if (!updateLayoutStateToFillStart.toDoubleRange && updatelayoutstatetofillstart.toString.hasRemaining() == wrap.hasRemaining()) {
                            if (wrap.hasRemaining()) {
                                throw new AssertionError();
                            }
                        }
                        if (wrap.hasRemaining()) {
                            updatelayoutstatetofillstart.length(wrap);
                        } else if (updatelayoutstatetofillstart.toString.hasRemaining()) {
                            updatelayoutstatetofillstart.length(updatelayoutstatetofillstart.toString);
                        }
                    }
                    if (!updateLayoutStateToFillStart.toDoubleRange && !updatelayoutstatetofillstart.setMin() && !updatelayoutstatetofillstart.equals()) {
                        if (wrap.hasRemaining()) {
                            throw new AssertionError();
                        }
                    }
                } catch (IOException unused) {
                    this.length.getMin();
                } catch (RuntimeException e) {
                    getMin((Exception) e);
                    updateLayoutStateToFillStart updatelayoutstatetofillstart2 = this.length;
                    e.getMessage();
                    updatelayoutstatetofillstart2.getMax();
                }
            }
            this.length.getMin();
            if (!setMax && !this.getMax.isClosed()) {
                throw new AssertionError();
            }
        } catch (Exception e2) {
            getMin(e2);
            updateLayoutStateToFillStart updatelayoutstatetofillstart3 = this.length;
            e2.getMessage();
            updatelayoutstatetofillstart3.getMax();
        }
    }

    private int FastBitmap$CoordinateSystem() {
        int port = this.getMin.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.getMin.getScheme();
        if (scheme.equals(WSConstant.SCHEME_WSS)) {
            return com.alipay.android.phone.mobilesdk.socketcraft.WebSocket.DEFAULT_WSS_PORT;
        }
        if (scheme.equals(WSConstant.SCHEME_WS)) {
            return 80;
        }
        throw new RuntimeException("unkonow scheme".concat(String.valueOf(scheme)));
    }

    private void invoke() throws InvalidHandshakeException {
        String path = this.getMin.getPath();
        String query = this.getMin.getQuery();
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
        int FastBitmap$CoordinateSystem2 = FastBitmap$CoordinateSystem();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getMin.getHost());
        sb2.append(FastBitmap$CoordinateSystem2 != 80 ? ":".concat(String.valueOf(FastBitmap$CoordinateSystem2)) : "");
        String obj = sb2.toString();
        isSmoothScrollbarEnabled issmoothscrollbarenabled = new isSmoothScrollbarEnabled();
        if (path != null) {
            issmoothscrollbarenabled.setMax = path;
            issmoothscrollbarenabled.setMin.put(HttpHeaders.HOST, obj);
            Map<String, String> map = this.equals;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    issmoothscrollbarenabled.setMin.put((String) next.getKey(), (String) next.getValue());
                }
            }
            updateLayoutStateToFillStart updatelayoutstatetofillstart = this.length;
            if (updateLayoutStateToFillStart.toDoubleRange || updatelayoutstatetofillstart.IsOverlapping != WebSocket.READYSTATE.CONNECTING) {
                updatelayoutstatetofillstart.hashCode = updatelayoutstatetofillstart.isInside.length((scrollVerticallyBy) issmoothscrollbarenabled);
                updatelayoutstatetofillstart.FastBitmap$CoordinateSystem = issmoothscrollbarenabled.setMin();
                if (updateLayoutStateToFillStart.toDoubleRange || updatelayoutstatetofillstart.FastBitmap$CoordinateSystem != null) {
                    updatelayoutstatetofillstart.getMin(Draft.setMax((resolveIsInfinite) updatelayoutstatetofillstart.hashCode));
                    return;
                }
                throw new AssertionError();
            }
            throw new AssertionError("shall only be called once");
        }
        throw new IllegalArgumentException("http resource descriptor must not be null");
    }

    public final void length(String str) {
        setMin(str);
    }

    public final void getMin() {
        this.FastBitmap$CoordinateSystem.countDown();
        toFloatRange();
    }

    public final void getMax() {
        this.FastBitmap$CoordinateSystem.countDown();
        this.toDoubleRange.countDown();
        Thread thread = this.toFloatRange;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            if (this.getMax != null) {
                this.getMax.close();
            }
        } catch (IOException e) {
            getMin((Exception) e);
        }
        equals();
    }

    public final void setMin(Exception exc) {
        getMin(exc);
    }

    public final InetSocketAddress setMin() {
        Socket socket = this.getMax;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    class setMax implements Runnable {
        private setMax() {
        }

        /* synthetic */ setMax(fixLayoutStartGap fixlayoutstartgap, byte b) {
            this();
        }

        public final void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = fixLayoutStartGap.this.length.toIntRange.take();
                    fixLayoutStartGap.this.IsOverlapping.write(take.array(), 0, take.limit());
                    fixLayoutStartGap.this.IsOverlapping.flush();
                } catch (IOException unused) {
                    fixLayoutStartGap.this.length.getMin();
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }

    public final void getMin(Socket socket) {
        if (this.getMax == null) {
            this.getMax = socket;
            return;
        }
        throw new IllegalStateException("socket has already been set");
    }

    public final void setMin(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        updateLayoutStateToFillStart updatelayoutstatetofillstart = this.length;
        List<Framedata> length2 = updatelayoutstatetofillstart.isInside.length(opcode, byteBuffer, z);
        if (updatelayoutstatetofillstart.setMax()) {
            for (Framedata max : length2) {
                updatelayoutstatetofillstart.getMax(max);
            }
            return;
        }
        throw new WebsocketNotConnectedException();
    }

    public final boolean IsOverlapping() {
        return this.length.setMax();
    }

    public final boolean isInside() {
        return this.length.equals();
    }

    public final boolean toDoubleRange() {
        return this.length.isInside();
    }

    public final boolean values() {
        return this.length.setMin();
    }

    public final void getMax(Framedata framedata) {
        this.length.getMax(framedata);
    }

    public final InetSocketAddress length() {
        return this.length.equals.setMin();
    }

    public final boolean toIntRange() throws InterruptedException {
        if (this.toFloatRange == null) {
            Thread thread = new Thread(this);
            this.toFloatRange = thread;
            thread.start();
            this.FastBitmap$CoordinateSystem.await();
            return this.length.setMax();
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }
}
