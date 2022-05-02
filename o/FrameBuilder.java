package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

public final class FrameBuilder {
    private final List<generateFinalKey> getMax;
    private boolean getMin;
    private boolean setMax;
    private int setMin = 0;

    public FrameBuilder(List<generateFinalKey> list) {
        this.getMax = list;
    }

    public final generateFinalKey setMax(SSLSocket sSLSocket) throws IOException {
        generateFinalKey generatefinalkey;
        int i = this.setMin;
        int size = this.getMax.size();
        while (true) {
            if (i >= size) {
                generatefinalkey = null;
                break;
            }
            generatefinalkey = this.getMax.get(i);
            if (generatefinalkey.getMin(sSLSocket)) {
                this.setMin = i + 1;
                break;
            }
            i++;
        }
        if (generatefinalkey != null) {
            this.setMax = setMin(sSLSocket);
            LimitExedeedException.length.setMax(generatefinalkey, sSLSocket, this.getMin);
            return generatefinalkey;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.getMin);
        sb.append(", modes=");
        sb.append(this.getMax);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean setMax(IOException iOException) {
        this.getMin = true;
        if (!this.setMax || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException)) {
            return true;
        }
        return false;
    }

    private boolean setMin(SSLSocket sSLSocket) {
        for (int i = this.setMin; i < this.getMax.size(); i++) {
            if (this.getMax.get(i).getMin(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
