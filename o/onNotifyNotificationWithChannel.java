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

public final class onNotifyNotificationWithChannel implements HostnameVerifier {
    public static final onNotifyNotificationWithChannel getMax = new onNotifyNotificationWithChannel();

    private onNotifyNotificationWithChannel() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return getMax(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    private static boolean getMax(String str, X509Certificate x509Certificate) {
        if (CustomTabsIntent$ShareState.getMax(str)) {
            return setMin(str, x509Certificate);
        }
        return getMin(str, x509Certificate);
    }

    private static boolean setMin(String str, X509Certificate x509Certificate) {
        List<String> max = getMax(x509Certificate, 7);
        int size = max.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(max.get(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean getMin(String str, X509Certificate x509Certificate) {
        String str2;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> max = getMax(x509Certificate, 2);
        int size = max.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (setMin(lowerCase, max.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (!z) {
            onAreNotificationsEnabled onarenotificationsenabled = new onAreNotificationsEnabled(x509Certificate.getSubjectX500Principal());
            onarenotificationsenabled.getMax = 0;
            onarenotificationsenabled.setMax = 0;
            onarenotificationsenabled.length = 0;
            onarenotificationsenabled.equals = 0;
            onarenotificationsenabled.isInside = onarenotificationsenabled.setMin.toCharArray();
            String min = onarenotificationsenabled.setMin();
            String str3 = null;
            if (min != null) {
                do {
                    if (onarenotificationsenabled.getMax != onarenotificationsenabled.getMin) {
                        char c = onarenotificationsenabled.isInside[onarenotificationsenabled.getMax];
                        if (c != '\"') {
                            str2 = c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : onarenotificationsenabled.getMax() : onarenotificationsenabled.getMin();
                        } else {
                            onarenotificationsenabled.getMax++;
                            onarenotificationsenabled.setMax = onarenotificationsenabled.getMax;
                            onarenotificationsenabled.length = onarenotificationsenabled.setMax;
                            while (onarenotificationsenabled.getMax != onarenotificationsenabled.getMin) {
                                if (onarenotificationsenabled.isInside[onarenotificationsenabled.getMax] == '\"') {
                                    onarenotificationsenabled.getMax++;
                                    while (onarenotificationsenabled.getMax < onarenotificationsenabled.getMin && onarenotificationsenabled.isInside[onarenotificationsenabled.getMax] == ' ') {
                                        onarenotificationsenabled.getMax++;
                                    }
                                    str2 = new String(onarenotificationsenabled.isInside, onarenotificationsenabled.setMax, onarenotificationsenabled.length - onarenotificationsenabled.setMax);
                                } else {
                                    if (onarenotificationsenabled.isInside[onarenotificationsenabled.getMax] == '\\') {
                                        onarenotificationsenabled.isInside[onarenotificationsenabled.length] = onarenotificationsenabled.length();
                                    } else {
                                        onarenotificationsenabled.isInside[onarenotificationsenabled.length] = onarenotificationsenabled.isInside[onarenotificationsenabled.getMax];
                                    }
                                    onarenotificationsenabled.getMax++;
                                    onarenotificationsenabled.length++;
                                }
                            }
                            StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
                            sb.append(onarenotificationsenabled.setMin);
                            throw new IllegalStateException(sb.toString());
                        }
                        if ("cn".equalsIgnoreCase(min)) {
                            str3 = str2;
                        } else if (onarenotificationsenabled.getMax < onarenotificationsenabled.getMin) {
                            if (onarenotificationsenabled.isInside[onarenotificationsenabled.getMax] == ',' || onarenotificationsenabled.isInside[onarenotificationsenabled.getMax] == ';' || onarenotificationsenabled.isInside[onarenotificationsenabled.getMax] == '+') {
                                onarenotificationsenabled.getMax++;
                                min = onarenotificationsenabled.setMin();
                            } else {
                                StringBuilder sb2 = new StringBuilder("Malformed DN: ");
                                sb2.append(onarenotificationsenabled.setMin);
                                throw new IllegalStateException(sb2.toString());
                            }
                        }
                    }
                } while (min != null);
                StringBuilder sb3 = new StringBuilder("Malformed DN: ");
                sb3.append(onarenotificationsenabled.setMin);
                throw new IllegalStateException(sb3.toString());
            }
            if (str3 != null) {
                return setMin(lowerCase, str3);
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

    private static boolean setMin(String str, String str2) {
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
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
