package o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class removeByteArrayDDpEx extends SSLSocketFactory {
    private static final String TLS_CONTEXT = "TLS";
    private static final String[] TLS_V12_ONLY = {"TLSv1.2"};
    final SSLSocketFactory delegate;

    public removeByteArrayDDpEx() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance(TLS_CONTEXT);
        instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
        this.delegate = instance.getSocketFactory();
    }

    public final String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return enableTls12Only(this.delegate.createSocket(socket, str, i, z));
    }

    public final Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return enableTls12Only(this.delegate.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return enableTls12Only(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-15068091, oncanceled);
            onCancelLoad.getMin(-15068091, oncanceled);
        }
        return enableTls12Only(this.delegate.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return enableTls12Only(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final X509TrustManager defaultTrustManager() throws GeneralSecurityException {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            return (X509TrustManager) trustManagers[0];
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers:");
        sb.append(Arrays.toString(trustManagers));
        throw new IllegalStateException(sb.toString());
    }

    private Socket enableTls12Only(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(TLS_V12_ONLY);
        }
        return socket;
    }
}
