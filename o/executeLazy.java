package o;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class executeLazy implements enableTlsExtensions {
    private final Map<X500Principal, Set<X509Certificate>> length = new LinkedHashMap();

    public executeLazy(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.length.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.length.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public final X509Certificate getMax(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.length.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof executeLazy) || !((executeLazy) obj).length.equals(this.length)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.length.hashCode();
    }
}
