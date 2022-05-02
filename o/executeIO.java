package o;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class executeIO implements HostnameVerifier {
    public static final executeIO length = new executeIO();

    private executeIO() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return length(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public static boolean length(String str, X509Certificate x509Certificate) {
        if (initCloseCode.setMax(str)) {
            return getMax(str, x509Certificate);
        }
        return setMax(str, x509Certificate);
    }

    private static boolean getMax(String str, X509Certificate x509Certificate) {
        List<String> max = getMax(x509Certificate, 7);
        int size = max.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(max.get(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean setMax(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String min : getMax(x509Certificate, 2)) {
            if (getMin(lowerCase, min)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getMax(X509Certificate x509Certificate) {
        List<String> max = getMax(x509Certificate, 7);
        List<String> max2 = getMax(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(max.size() + max2.size());
        arrayList.addAll(max);
        arrayList.addAll(max2);
        return arrayList;
    }

    private static List<String> getMax(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (!(next == null || next.size() < 2 || (num = (Integer) next.get(0)) == null || num.intValue() != i || (str = (String) next.get(1)) == null)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private static boolean getMin(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('.');
                str = sb.toString();
            }
            if (!str2.endsWith(".")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append('.');
                str2 = sb2.toString();
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length2 = str.length() - substring.length();
            if (length2 <= 0 || str.lastIndexOf(46, length2 - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
