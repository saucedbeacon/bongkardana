package o;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.Nullable;

public class getByteArrayDDp {
    public X509TrustManager x509TrustManager() {
        return new X509TrustManager() {
            public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public final X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }

    @Nullable
    public SSLSocketFactory sslSocketFactory() {
        try {
            TrustManager[] trustManagerArr = {new X509TrustManager() {
                public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public final X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }};
            SSLContext instance = SSLContext.getInstance("SSL");
            instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
            return instance.getSocketFactory();
        } catch (NullPointerException | KeyManagementException | NoSuchAlgorithmException e) {
            StringBuilder sb = new StringBuilder("Couldn't get a dummy socket factory for development mode: ");
            sb.append(e.getLocalizedMessage());
            createLoadingDialog.e(sb.toString());
            return null;
        }
    }

    public HostnameVerifier hostnameVerifier() {
        return new HostnameVerifier() {
            public final boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        };
    }
}
