package com.alipay.iap.android.common.utils.security;

import android.util.Base64;
import com.alibaba.fastjson.parser.JSONLexer;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import o.onActivityPostCreated;

public class RSAHelper {
    private static final String DEFAULT_ALGORITHM = "RSA";
    private static final String DEFAULT_TRANSFORMATION = "RSA/ECB/PKCS1Padding";
    private static final String TAG = "RSAHelper";
    private static char getMax = '맴';
    private static char getMin = '妉';
    private static int isInside = 1;
    private static char length = '☓';
    private static char setMax = '嗀';
    private static int setMin;

    private RSAHelper() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004e, code lost:
        return r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encrypt(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = setMin
            r1 = 85
            int r0 = r0 + r1
            int r2 = r0 % 128
            isInside = r2
            r2 = 2
            int r0 = r0 % r2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r5 = 0
            if (r0 == r3) goto L_0x001a
            java.security.PublicKey r7 = getPublicKey(r7)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x004e }
            goto L_0x0021
        L_0x001a:
            java.security.PublicKey r7 = getPublicKey(r7)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x004e }
            super.hashCode()     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x004e, all -> 0x004c }
        L_0x0021:
            byte[] r6 = encrypt((java.lang.String) r6, (java.security.PublicKey) r7)
            if (r6 != 0) goto L_0x0042
            int r6 = setMin     // Catch:{ Exception -> 0x0040 }
            int r6 = r6 + 9
            int r7 = r6 % 128
            isInside = r7     // Catch:{ Exception -> 0x0040 }
            int r6 = r6 % r2
            r7 = 96
            if (r6 != 0) goto L_0x0037
            r6 = 96
            goto L_0x0039
        L_0x0037:
            r6 = 89
        L_0x0039:
            if (r6 == r7) goto L_0x003c
            return r5
        L_0x003c:
            int r1 = r1 / r4
            return r5
        L_0x003e:
            r6 = move-exception
            throw r6
        L_0x0040:
            r6 = move-exception
            throw r6
        L_0x0042:
            java.lang.String r7 = new java.lang.String
            byte[] r6 = android.util.Base64.encode(r6, r2)
            r7.<init>(r6)
            return r7
        L_0x004c:
            r6 = move-exception
            throw r6
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.utils.security.RSAHelper.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    public static byte[] encrypt(String str, PublicKey publicKey) {
        if (!(str != null)) {
            return null;
        }
        int i = isInside + 117;
        setMin = i % 128;
        int i2 = i % 2;
        if ((str.equals("") ? 30 : ',') == 30) {
            return null;
        }
        byte[] encryptBytes = encryptBytes(str.getBytes(Charset.forName(length(new char[]{53679, 61552, 40314, 61435, 61244, 1663}).intern())), publicKey);
        int i3 = isInside + 7;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return encryptBytes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if ((r5 == null ? 'E' : 'b') != 'b') goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r6 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        r4 = 'I';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        r4 = '^';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (r4 == '^') goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        r5 = isInside + 33;
        setMin = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        if ((r5 % 2) == 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r1 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5 = 6 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0045, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0 = javax.crypto.Cipher.getInstance(DEFAULT_TRANSFORMATION);
        r0.init(1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0055, code lost:
        return r0.doFinal(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0056, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((r5 != null) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] encryptBytes(byte[] r5, java.security.PublicKey r6) {
        /*
            int r0 = setMin
            int r0 = r0 + 97
            int r1 = r0 % 128
            isInside = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x001c
            r0 = 86
            int r0 = r0 / r3
            if (r5 != 0) goto L_0x0016
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x001a:
            r5 = move-exception
            throw r5
        L_0x001c:
            r0 = 98
            if (r5 != 0) goto L_0x0023
            r4 = 69
            goto L_0x0025
        L_0x0023:
            r4 = 98
        L_0x0025:
            if (r4 == r0) goto L_0x0028
        L_0x0027:
            return r2
        L_0x0028:
            r0 = 94
            if (r6 != 0) goto L_0x002f
            r4 = 73
            goto L_0x0031
        L_0x002f:
            r4 = 94
        L_0x0031:
            if (r4 == r0) goto L_0x0048
            int r5 = isInside
            int r5 = r5 + 33
            int r6 = r5 % 128
            setMin = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0040
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x0043
            return r2
        L_0x0043:
            r5 = 6
            int r5 = r5 / r3
            return r2
        L_0x0046:
            r5 = move-exception
            throw r5
        L_0x0048:
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0056 }
            r0.init(r1, r6)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0056 }
            byte[] r5 = r0.doFinal(r5)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0056 }
            return r5
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.utils.security.RSAHelper.encryptBytes(byte[], java.security.PublicKey):byte[]");
    }

    public static byte[] decrypt(String str, PrivateKey privateKey) {
        if ((str != null ? 14 : '@') == 14) {
            int i = isInside + 71;
            setMin = i % 128;
            int i2 = i % 2;
            if ((str.equals("") ? 5 : JSONLexer.EOI) != 5) {
                return decryptBytes(str.getBytes(Charset.forName(length(new char[]{53679, 61552, 40314, 61435, 61244, 1663}).intern())), privateKey);
            }
        }
        int i3 = setMin + 47;
        isInside = i3 % 128;
        byte[] bArr = null;
        if (i3 % 2 != 0) {
            return bArr;
        }
        int length2 = bArr.length;
        return bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r4 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r5 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = setMin + 95;
        isInside = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if ((r4 % 2) != 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r4 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r4 = '/';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r4 == 30) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r4 = setMin + 25;
        isInside = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        if ((r4 % 2) != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4 = 49 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004b, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = javax.crypto.Cipher.getInstance(DEFAULT_TRANSFORMATION);
        r0.init(2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0059, code lost:
        return r0.doFinal(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r4 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] decryptBytes(byte[] r4, java.security.PrivateKey r5) {
        /*
            int r0 = isInside
            int r0 = r0 + 85
            int r1 = r0 % 128
            setMin = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            if (r0 == 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r3 = 0
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x001c
            goto L_0x001b
        L_0x0016:
            r0 = 99
            int r0 = r0 / r2
            if (r4 != 0) goto L_0x001c
        L_0x001b:
            return r3
        L_0x001c:
            if (r5 != 0) goto L_0x004c
            int r4 = setMin     // Catch:{ Exception -> 0x004a }
            int r4 = r4 + 95
            int r5 = r4 % 128
            isInside = r5     // Catch:{ Exception -> 0x004a }
            int r4 = r4 % r1
            r5 = 30
            if (r4 != 0) goto L_0x002e
            r4 = 30
            goto L_0x0030
        L_0x002e:
            r4 = 47
        L_0x0030:
            if (r4 == r5) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            super.hashCode()     // Catch:{ all -> 0x0048 }
        L_0x0036:
            int r4 = setMin
            int r4 = r4 + 25
            int r5 = r4 % 128
            isInside = r5
            int r4 = r4 % r1
            if (r4 != 0) goto L_0x0047
            r4 = 49
            int r4 = r4 / r2
            return r3
        L_0x0045:
            r4 = move-exception
            throw r4
        L_0x0047:
            return r3
        L_0x0048:
            r4 = move-exception
            throw r4
        L_0x004a:
            r4 = move-exception
            throw r4
        L_0x004c:
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x005a }
            r0.init(r1, r5)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x005a }
            byte[] r4 = r0.doFinal(r4)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x005a }
            return r4
        L_0x005a:
            return r3
        L_0x005b:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.utils.security.RSAHelper.decryptBytes(byte[], java.security.PrivateKey):byte[]");
    }

    private static PublicKey getPublicKey(String str) throws NoSuchAlgorithmException, InvalidKeySpecException {
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        try {
            int i = isInside + 53;
            setMin = i % 128;
            if ((i % 2 != 0 ? 9 : '8') != 9) {
                return generatePublic;
            }
            int i2 = 89 / 0;
            return generatePublic;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String length(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i = isInside + 3;
        setMin = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (i3 < cArr.length) {
            cArr3[0] = cArr[i3];
            int i4 = i3 + 1;
            cArr3[1] = cArr[i4];
            onActivityPostCreated.setMax(cArr3, length, setMax, getMin, getMax);
            cArr2[i3] = cArr3[0];
            cArr2[i4] = cArr3[1];
            i3 += 2;
            int i5 = setMin + 115;
            isInside = i5 % 128;
            int i6 = i5 % 2;
        }
        return new String(cArr2, 1, cArr2[0]);
    }
}
