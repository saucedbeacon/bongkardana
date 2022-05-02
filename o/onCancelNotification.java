package o;

import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;

public final class onCancelNotification {
    public static long getMax(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int setMin(String str, int i) {
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

    public static boolean setMin(getPreventCornerOverlap getpreventcorneroverlap) {
        if (getpreventcorneroverlap.getMin.setMax.equals(FirebasePerformance.HttpMethod.HEAD)) {
            return false;
        }
        int i = getpreventcorneroverlap.length;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && getMax(setCardElevation.setMax(getpreventcorneroverlap.toFloatRange.setMin, "Content-Length")) == -1) {
            String max = setCardElevation.setMax(getpreventcorneroverlap.toFloatRange.setMin, HttpHeaders.TRANSFER_ENCODING);
            if (max == null) {
                max = null;
            }
            if ("chunked".equalsIgnoreCase(max)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
