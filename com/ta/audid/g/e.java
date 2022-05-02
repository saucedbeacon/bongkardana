package com.ta.audid.g;

import com.alibaba.griver.base.common.utils.MD5Util;
import com.google.common.base.Ascii;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class e {
    private static final char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String h(String str) {
        return a(U(), str);
    }

    private static String a(String str, String str2) {
        try {
            byte[] a2 = a(str.getBytes(), str2.getBytes());
            if (a2 != null) {
                return toHexString(a2);
            }
            return "0000000000000000";
        } catch (Exception e) {
            m.d("", e);
            return "0000000000000000";
        }
    }

    private static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5);
            instance.update(bArr);
            return instance.digest();
        } catch (Exception e) {
            m.e("", e, new Object[0]);
            return null;
        }
    }

    private static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(hexChar[(bArr[i] & 240) >>> 4]);
            sb.append(hexChar[bArr[i] & Ascii.SI]);
        }
        return sb.toString();
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        for (int i = 0; i < 64; i++) {
            bArr3[i] = 54;
            bArr4[i] = 92;
        }
        byte[] bArr5 = new byte[64];
        if (bArr.length > 64) {
            bArr = a(bArr);
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr5[i2] = bArr[i2];
        }
        if (bArr.length < 64) {
            for (int length = bArr.length; length < 64; length++) {
                bArr5[length] = 0;
            }
        }
        byte[] bArr6 = new byte[64];
        for (int i3 = 0; i3 < 64; i3++) {
            bArr6[i3] = (byte) (bArr5[i3] ^ bArr3[i3]);
        }
        byte[] bArr7 = new byte[(bArr2.length + 64)];
        for (int i4 = 0; i4 < 64; i4++) {
            bArr7[i4] = bArr6[i4];
        }
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            bArr7[i5 + 64] = bArr2[i5];
        }
        byte[] a2 = a(bArr7);
        byte[] bArr8 = new byte[64];
        for (int i6 = 0; i6 < 64; i6++) {
            bArr8[i6] = (byte) (bArr5[i6] ^ bArr4[i6]);
        }
        byte[] bArr9 = new byte[(a2.length + 64)];
        for (int i7 = 0; i7 < 64; i7++) {
            bArr9[i7] = bArr8[i7];
        }
        for (int i8 = 0; i8 < a2.length; i8++) {
            bArr9[i8 + 64] = a2[i8];
        }
        return a(bArr9);
    }

    private static String U() {
        byte[] bytes = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn".getBytes();
        byte b = 0;
        while (b < 32) {
            try {
                bytes[b] = (byte) (bytes[b] + b);
                b = (byte) (b + 1);
            } catch (Exception unused) {
                return null;
            }
        }
        return toHexString(bytes);
    }
}
