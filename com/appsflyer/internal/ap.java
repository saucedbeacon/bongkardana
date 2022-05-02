package com.appsflyer.internal;

public class ap {
    /* renamed from: ˋ  reason: contains not printable characters */
    public static void m1341(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
