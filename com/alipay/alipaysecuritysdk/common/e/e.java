package com.alipay.alipaysecuritysdk.common.e;

import com.alipay.alipaysecuritysdk.common.c.b;

public final class e {
    public static String e(String str) {
        return str == null ? "" : str;
    }

    public static int a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean b(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            byte b = bytes[i];
            if ((b < 0 || b > 31) && b < Byte.MAX_VALUE) {
                z = false;
            }
            if (z) {
                return false;
            }
            i++;
        }
    }

    public static boolean c(String str) {
        if (str != null) {
            try {
                int length = str.length();
                if (length != 0) {
                    for (int i = 0; i < length; i++) {
                        if (!Character.isWhitespace(str.charAt(i))) {
                            return false;
                        }
                    }
                }
            } catch (Throwable th) {
                b.a("SEC_SDK-tool", th);
            }
        }
        return true;
    }

    public static boolean d(String str) {
        return !c(str);
    }

    public static boolean a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
