package o;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

public final class MPaaSMonitorPrinter extends MPaaSSCLogCatImpl {
    private MPaaSMonitorPrinter() {
    }

    @Nullable
    public final X509TrustManager setMax(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.setMax(sSLSocketFactory);
        }
        try {
            Object max = setMax((Object) sSLSocketFactory, Object.class, "sslParameters");
            if (max != null) {
                return (X509TrustManager) setMax(max, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    public final void getMin(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) MPaaSSCLogCatImpl.setMax(list).toArray(new String[0]));
            return;
        }
        super.getMin(sSLSocket, str, list);
    }

    @Nullable
    public final String setMin(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.setMin(sSLSocket);
    }

    public static MPaaSMonitorPrinter length() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new MPaaSMonitorPrinter();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final void getMax(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public final SSLContext setMin() {
        try {
            return SSLContext.getInstance("TLSv1.3", Conscrypt.newProviderBuilder().provideTrustManager().build());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", Conscrypt.newProviderBuilder().provideTrustManager().build());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }
}
