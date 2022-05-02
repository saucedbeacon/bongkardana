package o;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class setParseMode {
    public static final setParseMode setMin = new setParseMode(new LinkedHashSet(new setMax().getMax), (executeLowPri) null);
    final Set<setMin> length;
    @Nullable
    final executeLowPri setMax;

    public static final class setMax {
        public final List<setMin> getMax = new ArrayList();
    }

    public setParseMode(Set<setMin> set, @Nullable executeLowPri executelowpri) {
        this.length = set;
        this.setMax = executelowpri;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setParseMode)) {
            return false;
        }
        setParseMode setparsemode = (setParseMode) obj;
        if (!initCloseCode.setMin((Object) this.setMax, (Object) setparsemode.setMax) || !this.length.equals(setparsemode.length)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        executeLowPri executelowpri = this.setMax;
        return ((executelowpri != null ? executelowpri.hashCode() : 0) * 31) + this.length.hashCode();
    }

    public static String length(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder("sha256/");
            sb.append(printConnMonitorLog.of(((X509Certificate) certificate).getPublicKey().getEncoded()).sha256().base64());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public static final class setMin {
        final printConnMonitorLog getMax;
        final String length;
        final String setMax;
        final String setMin;

        public setMin(String str, String str2) {
            String str3;
            this.setMax = str;
            if (str.startsWith("*.")) {
                StringBuilder sb = new StringBuilder("http://");
                sb.append(str.substring(2));
                str3 = Draft_76.getMin(sb.toString()).getMin;
            } else {
                str3 = Draft_76.getMin("http://".concat(String.valueOf(str))).getMin;
            }
            this.setMin = str3;
            if (str2.startsWith("sha1/")) {
                this.length = "sha1/";
                this.getMax = printConnMonitorLog.decodeBase64(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.length = "sha256/";
                this.getMax = printConnMonitorLog.decodeBase64(str2.substring(7));
            } else {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(String.valueOf(str2)));
            }
            if (this.getMax == null) {
                throw new IllegalArgumentException("pins must be base64: ".concat(String.valueOf(str2)));
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean length(String str) {
            if (!this.setMax.startsWith("*.")) {
                return str.equals(this.setMin);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 != this.setMin.length()) {
                return false;
            }
            String str2 = this.setMin;
            if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            return this.setMax.equals(setmin.setMax) && this.length.equals(setmin.length) && this.getMax.equals(setmin.getMax);
        }

        public final int hashCode() {
            return ((((this.setMax.hashCode() + 527) * 31) + this.length.hashCode()) * 31) + this.getMax.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.length);
            sb.append(this.getMax.base64());
            return sb.toString();
        }
    }

    public final void setMax(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List emptyList = Collections.emptyList();
        for (setMin next : this.length) {
            if (next.length(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(next);
            }
        }
        if (!emptyList.isEmpty()) {
            executeLowPri executelowpri = this.setMax;
            if (executelowpri != null) {
                list = executelowpri.setMin(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = emptyList.size();
                printConnMonitorLog printconnmonitorlog = null;
                printConnMonitorLog printconnmonitorlog2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    setMin setmin = (setMin) emptyList.get(i2);
                    if (setmin.length.equals("sha256/")) {
                        if (printconnmonitorlog == null) {
                            printconnmonitorlog = printConnMonitorLog.of(x509Certificate.getPublicKey().getEncoded()).sha256();
                        }
                        if (setmin.getMax.equals(printconnmonitorlog)) {
                            return;
                        }
                    } else if (setmin.length.equals("sha1/")) {
                        if (printconnmonitorlog2 == null) {
                            printconnmonitorlog2 = printConnMonitorLog.of(x509Certificate.getPublicKey().getEncoded()).sha1();
                        }
                        if (setmin.getMax.equals(printconnmonitorlog2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("unsupported hashAlgorithm: ");
                        sb.append(setmin.length);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb2.append("\n    ");
                sb2.append(length(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = emptyList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb2.append("\n    ");
                sb2.append((setMin) emptyList.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }
}
