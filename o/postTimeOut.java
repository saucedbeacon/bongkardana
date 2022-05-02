package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import o.generateFinalKey;
import o.generateKey;
import okhttp3.TlsVersion;

public final class postTimeOut extends SSLSocketFactory {
    private static final String TLS12 = "TLSv1.2";
    private static final String[] TLS_V12_ONLY = {TLS12};
    private final SSLSocketFactory delegate;

    private postTimeOut(SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    public final String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return patch(this.delegate.createSocket(socket, str, i, z));
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return patch(this.delegate.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return patch(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return patch(this.delegate.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return patch(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private Socket patch(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(TLS_V12_ONLY);
        }
        return socket;
    }

    public static generateKey.getMax enableTls12OnPreLollipop(generateKey.getMax getmax) {
        if (getNegativeString.isJellyBeanAndAbove() && getNegativeString.isBelowLollipopMR1()) {
            try {
                SSLContext instance = SSLContext.getInstance(TLS12);
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                postTimeOut posttimeout = new postTimeOut(instance.getSocketFactory());
                getmax.values = posttimeout;
                getmax.toString = MPaaSSCLogCatImpl.toIntRange().getMin((SSLSocketFactory) posttimeout);
                generateFinalKey generatefinalkey = new generateFinalKey(new generateFinalKey.setMax(generateFinalKey.setMin).setMin(TlsVersion.TLS_1_2));
                ArrayList arrayList = new ArrayList();
                arrayList.add(generatefinalkey);
                arrayList.add(generateFinalKey.setMax);
                arrayList.add(generateFinalKey.getMax);
                getmax.setMax = initCloseCode.setMin(arrayList);
            } catch (Exception e) {
                updateActionSheetContent.e(DanaLogConstants.TAG.ENABLE_TLS_12_PRE_LOLLIPOP, "enableTls12OnPreLollipop error", e);
            }
        }
        return getmax;
    }
}
