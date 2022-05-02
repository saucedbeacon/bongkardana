package com.alibaba.ariver.kernel.common.utils;

import android.text.TextUtils;
import androidx.annotation.Nullable;

public class TypeUtils {
    private static long a(long j) {
        return j <= 16777215 ? j | -16777216 : j;
    }

    @Nullable
    public static Integer parseColorInt(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                if (str.charAt(0) == '#') {
                    return Integer.valueOf((int) a(Long.parseLong(str.substring(1), 16)));
                }
                return Integer.valueOf((int) a((long) Integer.parseInt(str)));
            }
            if (obj instanceof Integer) {
                return Integer.valueOf((int) a((long) ((Integer) obj).intValue()));
            }
            return null;
        } catch (Throwable th) {
            RVLogger.e("parseColorException!", th);
        }
    }

    @Nullable
    public static Long parseColorLong(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                if (str.charAt(0) == '#') {
                    return Long.valueOf(a(Long.parseLong(str.substring(1), 16)));
                }
                return Long.valueOf(a(Long.parseLong(str)));
            } else if (obj instanceof Integer) {
                return Long.valueOf(a((long) ((Integer) obj).intValue()));
            } else {
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                return null;
            }
        } catch (Throwable th) {
            RVLogger.e("parseColorException!", th);
        }
    }

    public static double parseDouble(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            RVLogger.e("parse double exception.", th);
            return 0.0d;
        }
    }

    public static int parseInt(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable th) {
            RVLogger.e("parse int exception.", th);
            return 0;
        }
    }

    public static long parseLong(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable th) {
            RVLogger.e("parse long exception.", th);
            return 0;
        }
    }

    public static float parseFloat(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Throwable th) {
            RVLogger.e("parse long exception.", th);
            return 0.0f;
        }
    }
}
