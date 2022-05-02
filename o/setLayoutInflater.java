package o;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class setLayoutInflater {
    public static final setLayoutInflater getMax = new setLayoutInflater(CustomTabsIntent$ShareState.setMin(new setMin().length));
    final List<setMax> setMax;
    final CustomTabsSession$MockSession setMin;

    public static final class setMin {
        final List<setMax> length = new ArrayList();
    }

    private /* synthetic */ setLayoutInflater(List list) {
        this(list, (CustomTabsSession$MockSession) null);
    }

    setLayoutInflater(List<setMax> list, CustomTabsSession$MockSession customTabsSession$MockSession) {
        this.setMax = list;
        this.setMin = customTabsSession$MockSession;
    }

    public static String setMin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder("sha256/");
            sb.append(CustomTabsIntent$ShareState.setMax(evictAll.a(((X509Certificate) certificate).getPublicKey().getEncoded())).b());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static final class setMax {
        final String getMax;
        final evictAll length;
        final String setMax;
        final String setMin;

        /* access modifiers changed from: package-private */
        public final boolean getMin(String str) {
            if (!this.setMax.startsWith("*.")) {
                return str.equals(this.getMax);
            }
            String str2 = this.getMax;
            return str.regionMatches(false, str.indexOf(46) + 1, str2, 0, str2.length());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof setMax)) {
                return false;
            }
            setMax setmax = (setMax) obj;
            return this.setMax.equals(setmax.setMax) && this.setMin.equals(setmax.setMin) && this.length.equals(setmax.length);
        }

        public final int hashCode() {
            return ((((this.setMax.hashCode() + 527) * 31) + this.setMin.hashCode()) * 31) + this.length.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setMin);
            sb.append(this.length.b());
            return sb.toString();
        }
    }

    public final void length(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        for (setMax next : this.setMax) {
            if (next.getMin(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(next);
            }
        }
        if (!emptyList.isEmpty()) {
            CustomTabsSession$MockSession customTabsSession$MockSession = this.setMin;
            if (customTabsSession$MockSession != null) {
                list = customTabsSession$MockSession.setMax(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = emptyList.size();
                evictAll evictall = null;
                evictAll evictall2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    setMax setmax = (setMax) emptyList.get(i2);
                    if (setmax.setMin.equals("sha256/")) {
                        if (evictall == null) {
                            evictall = CustomTabsIntent$ShareState.setMax(evictAll.a(x509Certificate.getPublicKey().getEncoded()));
                        }
                        if (setmax.length.equals(evictall)) {
                            return;
                        }
                    } else if (setmax.setMin.equals("sha1/")) {
                        if (evictall2 == null) {
                            evictall2 = CustomTabsIntent$ShareState.length(evictAll.a(x509Certificate.getPublicKey().getEncoded()));
                        }
                        if (setmax.length.equals(evictall2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(setMin(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = emptyList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append("\n    ");
                sb.append((setMax) emptyList.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }
}
