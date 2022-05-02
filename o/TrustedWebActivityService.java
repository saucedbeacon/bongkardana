package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public abstract class TrustedWebActivityService {
    public abstract X509Certificate length(X509Certificate x509Certificate);

    public static TrustedWebActivityService getMin(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new getMin(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new setMax(x509TrustManager.getAcceptedIssuers());
        }
    }

    static final class getMin extends TrustedWebActivityService {
        private final Method getMax;
        private final X509TrustManager getMin;

        getMin(X509TrustManager x509TrustManager, Method method) {
            this.getMax = method;
            this.getMin = x509TrustManager;
        }

        public final X509Certificate length(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.getMax.invoke(this.getMin, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
            }
            return null;
        }
    }

    static final class setMax extends TrustedWebActivityService {
        private final Map<X500Principal, List<X509Certificate>> setMin = new LinkedHashMap();

        public setMax(X509Certificate... x509CertificateArr) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                List list = this.setMin.get(subjectX500Principal);
                if (list == null) {
                    list = new ArrayList(1);
                    this.setMin.put(subjectX500Principal, list);
                }
                list.add(x509Certificate);
            }
        }

        public final X509Certificate length(X509Certificate x509Certificate) {
            List<X509Certificate> list = this.setMin.get(x509Certificate.getIssuerX500Principal());
            if (list == null) {
                return null;
            }
            for (X509Certificate x509Certificate2 : list) {
                try {
                    x509Certificate.verify(x509Certificate2.getPublicKey());
                    return x509Certificate2;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }
}
