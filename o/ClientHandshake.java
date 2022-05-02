package o;

import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import o.Draft_75;

public final class ClientHandshake {
    private static final printConnMonitorLog setMax = printConnMonitorLog.encodeUtf8("\t ,=");
    private static final printConnMonitorLog setMin = printConnMonitorLog.encodeUtf8("\"\\");

    private static long setMin(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static boolean length(Draft_75 draft_75) {
        return setMin(draft_75).contains("*");
    }

    private static Set<String> setMin(Draft_75 draft_75) {
        Set<String> emptySet = Collections.emptySet();
        int length = draft_75.length.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            if (HttpHeaders.VARY.equalsIgnoreCase(draft_75.length[i2])) {
                String str = draft_75.length[i2 + 1];
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : str.split(",")) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    public static void length(getPreferedSize getpreferedsize, Draft_76 draft_76, Draft_75 draft_75) {
        if (getpreferedsize != getPreferedSize.setMin && fromOpcode.getMin(draft_76, draft_75).isEmpty()) {
        }
    }

    public static int getMin(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int setMax(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    public static int getMin(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long getMax(InvalidHandshakeException invalidHandshakeException) {
        return setMin(invalidHandshakeException.toIntRange.length("Content-Length"));
    }

    public static boolean length(InvalidHandshakeException invalidHandshakeException, Draft_75 draft_75, InvalidDataException invalidDataException) {
        for (String next : setMin(invalidHandshakeException.toIntRange)) {
            if (!initCloseCode.setMin((Object) draft_75.getMin(next), (Object) invalidDataException.length.getMin(next))) {
                return false;
            }
        }
        return true;
    }

    public static boolean getMin(InvalidHandshakeException invalidHandshakeException) {
        return length(invalidHandshakeException.toIntRange);
    }

    public static Draft_75 setMin(InvalidHandshakeException invalidHandshakeException) {
        Draft_75 draft_75 = invalidHandshakeException.IsOverlapping.getMin.length;
        Set<String> min = setMin(invalidHandshakeException.toIntRange);
        if (min.isEmpty()) {
            return new Draft_75(new Draft_75.length());
        }
        Draft_75.length length = new Draft_75.length();
        int length2 = draft_75.length.length / 2;
        for (int i = 0; i < length2; i++) {
            int i2 = i * 2;
            String str = draft_75.length[i2];
            if (min.contains(str)) {
                length.getMax(str, draft_75.length[i2 + 1]);
            }
        }
        return new Draft_75(length);
    }

    public static boolean setMax(InvalidHandshakeException invalidHandshakeException) {
        if (invalidHandshakeException.getMin.getMin.equals(FirebasePerformance.HttpMethod.HEAD)) {
            return false;
        }
        int i = invalidHandshakeException.getMax;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && setMin(invalidHandshakeException.toIntRange.length("Content-Length")) == -1) {
            String length = invalidHandshakeException.toIntRange.length(HttpHeaders.TRANSFER_ENCODING);
            if (length == null) {
                length = null;
            }
            if ("chunked".equalsIgnoreCase(length)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
