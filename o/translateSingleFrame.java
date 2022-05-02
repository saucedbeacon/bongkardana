package o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import o.Draft;
import okhttp3.Protocol;

public abstract class translateSingleFrame {
    public static final translateSingleFrame NONE = new translateSingleFrame() {
    };

    public interface length {
        translateSingleFrame setMin(checkAlloc checkalloc);
    }

    public void callEnd(checkAlloc checkalloc) {
    }

    public void callFailed(checkAlloc checkalloc, IOException iOException) {
    }

    public void callStart(checkAlloc checkalloc) {
    }

    public void connectEnd(checkAlloc checkalloc, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol) {
    }

    public void connectFailed(checkAlloc checkalloc, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol, IOException iOException) {
    }

    public void connectStart(checkAlloc checkalloc, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(checkAlloc checkalloc, Draft.HandshakeState handshakeState) {
    }

    public void connectionReleased(checkAlloc checkalloc, Draft.HandshakeState handshakeState) {
    }

    public void dnsEnd(checkAlloc checkalloc, String str, List<InetAddress> list) {
    }

    public void dnsStart(checkAlloc checkalloc, String str) {
    }

    public void requestBodyEnd(checkAlloc checkalloc, long j) {
    }

    public void requestBodyStart(checkAlloc checkalloc) {
    }

    public void requestHeadersEnd(checkAlloc checkalloc, InvalidDataException invalidDataException) {
    }

    public void requestHeadersStart(checkAlloc checkalloc) {
    }

    public void responseBodyEnd(checkAlloc checkalloc, long j) {
    }

    public void responseBodyStart(checkAlloc checkalloc) {
    }

    public void responseHeadersEnd(checkAlloc checkalloc, InvalidHandshakeException invalidHandshakeException) {
    }

    public void responseHeadersStart(checkAlloc checkalloc) {
    }

    public void secureConnectEnd(checkAlloc checkalloc, @Nullable createBuffer createbuffer) {
    }

    public void secureConnectStart(checkAlloc checkalloc) {
    }

    static length factory(translateSingleFrame translatesingleframe) {
        return new length() {
            public final translateSingleFrame setMin(checkAlloc checkalloc) {
                return translateSingleFrame.this;
            }
        };
    }
}
