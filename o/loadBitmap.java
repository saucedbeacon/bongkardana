package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

public final class loadBitmap {
    private int getMax = 0;
    private boolean getMin;
    private boolean length;
    private final List<BrowserActionsIntent$BrowserActionsItemId> setMin;

    public loadBitmap(List<BrowserActionsIntent$BrowserActionsItemId> list) {
        this.setMin = list;
    }

    public final BrowserActionsIntent$BrowserActionsItemId getMax(SSLSocket sSLSocket) {
        BrowserActionsIntent$BrowserActionsItemId browserActionsIntent$BrowserActionsItemId;
        int i = this.getMax;
        int size = this.setMin.size();
        while (true) {
            if (i >= size) {
                browserActionsIntent$BrowserActionsItemId = null;
                break;
            }
            browserActionsIntent$BrowserActionsItemId = this.setMin.get(i);
            if (browserActionsIntent$BrowserActionsItemId.getMin(sSLSocket)) {
                this.getMax = i + 1;
                break;
            }
            i++;
        }
        if (browserActionsIntent$BrowserActionsItemId != null) {
            this.getMin = setMax(sSLSocket);
            setOnInflateListener.getMax.getMin(browserActionsIntent$BrowserActionsItemId, sSLSocket, this.length);
            return browserActionsIntent$BrowserActionsItemId;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.length);
        sb.append(", modes=");
        sb.append(this.setMin);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean length(IOException iOException) {
        this.length = true;
        if (!this.getMin || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z || (iOException instanceof SSLProtocolException)) {
            return true;
        }
        return false;
    }

    private boolean setMax(SSLSocket sSLSocket) {
        for (int i = this.getMax; i < this.setMin.size(); i++) {
            if (this.setMin.get(i).getMin(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
