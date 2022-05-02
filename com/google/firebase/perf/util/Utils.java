package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.firebase.perf.logging.AndroidLogger;
import o.Draft_76;

public class Utils {
    private static Boolean isDebugLoggingEnabled;

    public static int saturatedIntCast(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static String stripSensitiveInfo(@NonNull String str) {
        Draft_76 min = Draft_76.setMin(str);
        if (min == null) {
            return str;
        }
        Draft_76.getMin floatRange = min.toFloatRange();
        floatRange.setMax = Draft_76.setMin("", " \"':;<=>@[]^`{}|/\\?#", false, false);
        floatRange.getMin = Draft_76.setMin("", " \"':;<=>@[]^`{}|/\\?#", false, false);
        floatRange.toIntRange = null;
        floatRange.IsOverlapping = null;
        return floatRange.toString();
    }

    public static String truncateURL(String str, int i) {
        int lastIndexOf;
        if (str.length() <= i) {
            return str;
        }
        if (str.charAt(i) == '/') {
            return str.substring(0, i);
        }
        Draft_76 min = Draft_76.setMin(str);
        if (min == null) {
            return str.substring(0, i);
        }
        if (min.toIntRange().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, i - 1)) < 0) {
            return str.substring(0, i);
        }
        return str.substring(0, lastIndexOf);
    }

    public static int bufferToInt(@NonNull byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < 4 && i < bArr.length) {
            i2 |= (bArr[i] & 255) << (i * 8);
            i++;
        }
        return i2;
    }

    public static boolean isDebugLoggingEnabled(@NonNull Context context) {
        Boolean bool = isDebugLoggingEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            isDebugLoggingEnabled = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            AndroidLogger instance = AndroidLogger.getInstance();
            StringBuilder sb = new StringBuilder("No perf logcat meta data found ");
            sb.append(e.getMessage());
            instance.debug(sb.toString());
            return false;
        }
    }

    public static void checkArgument(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
