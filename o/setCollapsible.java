package o;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class setCollapsible extends SSLSocketFactory {
    private static final String[] getMax = {"TLSv1.2"};
    final SSLSocketFactory getMin;

    public setCollapsible(SSLSocketFactory sSLSocketFactory) {
        this.getMin = sSLSocketFactory;
    }

    public final String[] getDefaultCipherSuites() {
        return this.getMin.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.getMin.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.getMin.createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(getMax);
        }
        return createSocket;
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.getMin.createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(getMax);
        }
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.getMin.createSocket(str, i, inetAddress, i2);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(getMax);
        }
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.getMin.createSocket(inetAddress, i);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(getMax);
        }
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.getMin.createSocket(inetAddress, i, inetAddress2, i2);
        if (createSocket instanceof SSLSocket) {
            ((SSLSocket) createSocket).setEnabledProtocols(getMax);
        }
        return createSocket;
    }
}
