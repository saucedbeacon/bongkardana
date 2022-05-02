package com.alipay.imobile.network.quake.util;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f9395a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    public static String a(long j) {
        return a(j, 6);
    }

    private static String a(long j, int i) {
        int pow = (int) Math.pow(2.0d, (double) i);
        char[] cArr = new char[pow];
        long j2 = ((long) (1 << i)) - 1;
        int i2 = pow;
        do {
            i2--;
            cArr[i2] = f9395a[(int) (j & j2)];
            j >>>= i;
        } while (j != 0);
        return new String(cArr, i2, pow - i2);
    }
}
