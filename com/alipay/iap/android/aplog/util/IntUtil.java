package com.alipay.iap.android.aplog.util;

public class IntUtil {
    private static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    public static String c10to64(long j) {
        return toUnsignedString(j, 6);
    }

    public static String c10to32(long j) {
        return toUnsignedString(j, 5);
    }

    public static String c10to16(long j) {
        return Long.toHexString(j).toUpperCase();
    }

    public static String c10to8(long j) {
        return Long.toOctalString(j);
    }

    public static String c10to4(long j) {
        return toUnsignedString(j, 2);
    }

    public static String c10to2(long j) {
        return Long.toBinaryString(j);
    }

    public static long c64to10(String str) {
        return toUnsignedLong(str, 6);
    }

    public static long c32to10(String str) {
        return toUnsignedLong(str, 5);
    }

    public static long c16to10(String str) {
        return toUnsignedLong(str, 4);
    }

    public static long c8to10(String str) {
        return toUnsignedLong(str, 3);
    }

    public static long c4to10(String str) {
        return toUnsignedLong(str, 2);
    }

    public static long c2to10(String str) {
        return toUnsignedLong(str, 1);
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

    private static long toUnsignedLong(String str, int i) {
        int pow = (int) Math.pow(2.0d, (double) i);
        int length = str.length();
        long j = 0;
        int i2 = 0;
        int i3 = length;
        while (i2 < length) {
            int i4 = i2 + 1;
            j += ((long) Integer.parseInt(String.valueOf(getNum(str.substring(i2, i4))))) * ((long) Math.pow((double) pow, (double) (i3 - 1)));
            i3--;
            i2 = i4;
        }
        return j;
    }

    public static int getNum(String str) {
        for (int i = 0; i < 64; i++) {
            if (str.equals(String.valueOf(digits[i]))) {
                return i;
            }
        }
        return 0;
    }
}
