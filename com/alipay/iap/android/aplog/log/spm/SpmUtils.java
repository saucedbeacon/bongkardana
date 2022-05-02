package com.alipay.iap.android.aplog.log.spm;

public class SpmUtils {
    private static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    public static String objectToString(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj.toString());
            sb.append('@');
            sb.append(Integer.toHexString(obj.hashCode()));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj.getClass().getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(obj.hashCode()));
        return sb2.toString();
    }

    public static String getViewKey(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj.toString());
            sb.append(obj.hashCode());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj.getClass().getName());
        sb2.append(obj.hashCode());
        return sb2.toString();
    }

    public static String c10to64(long j) {
        return toUnsignedString(j, 6);
    }

    private static String toUnsignedString(long j, int i) {
        int pow = (int) Math.pow(2.0d, (double) i);
        char[] cArr = new char[pow];
        long j2 = (long) ((1 << i) - 1);
        int i2 = pow;
        do {
            i2--;
            cArr[i2] = digits[(int) (j & j2)];
            j >>>= i;
        } while (j != 0);
        return new String(cArr, i2, pow - i2);
    }
}
