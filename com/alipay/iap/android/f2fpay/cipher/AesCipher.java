package com.alipay.iap.android.f2fpay.cipher;

import android.os.SystemClock;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.util.Base64Utils;
import com.alipay.iap.android.f2fpay.util.CipherUtils;

public class AesCipher {
    private static char[] getMax = {'U', 43689, 21948, 218, 43980};
    private static int length = 1;
    private static long setMax = 8231585793249618685L;
    private static int setMin;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f9307a;
    private byte[] b;
    private String c;

    private AesCipher(byte[] bArr, String str, byte[] bArr2) {
        try {
            this.f9307a = bArr2;
            this.b = bArr;
            this.c = str;
        } catch (Exception e) {
            throw e;
        }
    }

    public static AesCipher create(byte[] bArr, String str, byte[] bArr2) {
        AesCipher aesCipher = new AesCipher(bArr, str, bArr2);
        try {
            int i = length + 69;
            setMin = i % 128;
            int i2 = i % 2;
            return aesCipher;
        } catch (Exception e) {
            throw e;
        }
    }

    public static AesCipher createRandom(String str, byte[] bArr) {
        AesCipher aesCipher;
        int i = length + 25;
        setMin = i % 128;
        char c2 = 2;
        Object[] objArr = null;
        if ((i % 2 != 0 ? 'L' : 31) != 31) {
            aesCipher = create(CipherUtils.generateAesKey(), str, bArr);
            int length2 = objArr.length;
        } else {
            aesCipher = create(CipherUtils.generateAesKey(), str, bArr);
        }
        int i2 = setMin + 97;
        length = i2 % 128;
        if (i2 % 2 == 0) {
            c2 = '^';
        }
        if (c2 != '^') {
            return aesCipher;
        }
        super.hashCode();
        return aesCipher;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r4 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String decrypt(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = length
            int r0 = r0 + 27
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 5
            if (r0 == 0) goto L_0x000f
            r0 = 5
            goto L_0x0011
        L_0x000f:
            r0 = 91
        L_0x0011:
            r2 = 0
            byte[] r4 = r3.decryptBytes(r4)
            if (r0 == r1) goto L_0x001b
            if (r4 == 0) goto L_0x002e
            goto L_0x001e
        L_0x001b:
            int r0 = r2.length     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x002e
        L_0x001e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            int r4 = length
            int r4 = r4 + 43
            int r1 = r4 % 128
            setMin = r1
            int r4 = r4 % 2
            return r0
        L_0x002e:
            return r2
        L_0x002f:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.f2fpay.cipher.AesCipher.decrypt(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if ((r6 != null) != true) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r0 = length + 105;
        setMin = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if ((r0 % 2) == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r0 = '+';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r0 = 'N';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r0 == '+') goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = r6.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4 = 17 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        r3 = r6.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0081, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0082, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r6 != null ? '#' : '0') != '0') goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] decryptBytes(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = length
            int r0 = r0 + 105
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0020
            super.hashCode()     // Catch:{ all -> 0x001e }
            r0 = 48
            if (r6 == 0) goto L_0x0019
            r4 = 35
            goto L_0x001b
        L_0x0019:
            r4 = 48
        L_0x001b:
            if (r4 == r0) goto L_0x0027
            goto L_0x0032
        L_0x001e:
            r6 = move-exception
            throw r6
        L_0x0020:
            if (r6 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == r2) goto L_0x0032
        L_0x0027:
            int r0 = length
            int r0 = r0 + 13
            int r4 = r0 % 128
            setMin = r4
            int r0 = r0 % 2
            goto L_0x0054
        L_0x0032:
            int r0 = length
            int r0 = r0 + 105
            int r4 = r0 % 128
            setMin = r4
            int r0 = r0 % 2
            r4 = 43
            if (r0 == 0) goto L_0x0043
            r0 = 43
            goto L_0x0045
        L_0x0043:
            r0 = 78
        L_0x0045:
            if (r0 == r4) goto L_0x004c
            int r3 = r6.length()     // Catch:{ Exception -> 0x0081 }
            goto L_0x0054
        L_0x004c:
            int r0 = r6.length()
            r4 = 17
            int r4 = r4 / r3
            r3 = r0
        L_0x0054:
            int r0 = o.dispatchOnCancelled.setMax(r3)     // Catch:{ Exception -> 0x0081 }
            if (r3 == r0) goto L_0x006b
            o.onCanceled r4 = new o.onCanceled
            r4.<init>(r3, r0, r2)
            r0 = 1402043226(0x53917b5a, float:1.24967951E12)
            o.onCancelLoad.setMax(r0, r4)     // Catch:{ Exception -> 0x0081 }
            o.onCancelLoad.getMin(r0, r4)     // Catch:{ Exception -> 0x0069 }
            goto L_0x006b
        L_0x0069:
            r6 = move-exception
            throw r6
        L_0x006b:
            byte[] r0 = r5.b     // Catch:{ Exception -> 0x0078 }
            byte[] r6 = com.alipay.iap.android.f2fpay.util.Base64Utils.decode(r6)     // Catch:{ Exception -> 0x0078 }
            byte[] r2 = r5.f9307a     // Catch:{ Exception -> 0x0078 }
            byte[] r6 = com.alipay.iap.android.f2fpay.util.CipherUtils.decryptAes(r0, r6, r2)     // Catch:{ Exception -> 0x0078 }
            return r6
        L_0x0078:
            r6 = move-exception
            java.lang.String r0 = "AesCipher"
            java.lang.String r2 = ""
            com.alipay.iap.android.common.log.LoggerWrapper.e(r0, r2, r6)
            return r1
        L_0x0081:
            r6 = move-exception
            throw r6
        L_0x0083:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.f2fpay.cipher.AesCipher.decryptBytes(java.lang.String):byte[]");
    }

    public String encrypted() {
        int i = length + 47;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            String encodeToString = Base64Utils.encodeToString(CipherUtils.encryptData(Base64Utils.encodeToString(this.b).getBytes(length(1 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), 5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()), this.c));
            int i3 = setMin + 67;
            length = i3 % 128;
            int i4 = i3 % 2;
            return encodeToString;
        } catch (Exception e) {
            LoggerWrapper.e("AesCipher", "", e);
            return null;
        }
    }

    private static String length(int i, char c2, int i2) {
        char[] cArr = new char[i2];
        int i3 = 0;
        while (true) {
            if ((i3 < i2 ? '3' : 8) == 8) {
                break;
            }
            int i4 = length + 119;
            setMin = i4 % 128;
            int i5 = i4 % 2;
            cArr[i3] = (char) ((int) ((((long) getMax[i + i3]) ^ (((long) i3) * setMax)) ^ ((long) c2)));
            i3++;
        }
        String str = new String(cArr);
        int i6 = setMin + 107;
        length = i6 % 128;
        if ((i6 % 2 == 0 ? '.' : 'H') != '.') {
            return str;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return str;
    }
}
