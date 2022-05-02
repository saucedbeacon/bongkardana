package com.iap.ac.android.common.utils.security;

import android.os.Process;
import android.util.Base64;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSAHelper {
    private static final String DEFAULT_ALGORITHM = "RSA";
    private static final String DEFAULT_TRANSFORMATION = "RSA/ECB/PKCS1Padding";
    private static int IsOverlapping = 1;
    private static final String TAG = "RSAHelper";
    private static short[] getMax = null;
    private static int getMin = -2007496714;
    private static int length = -1804035244;
    private static byte[] setMax = {-95, -109, Byte.MAX_VALUE, 106, 103};
    private static int setMin = 100;
    private static int toIntRange;

    private RSAHelper() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if ((r4 == null ? 17 : 'Z') != 17) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r4 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        return new java.lang.String(android.util.Base64.encode(r4, 2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encrypt(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            java.security.PublicKey r5 = getPublicKey(r5)     // Catch:{ NoSuchAlgorithmException | InvalidKeySpecException -> 0x004b }
            int r1 = toIntRange
            int r1 = r1 + 27
            int r2 = r1 % 128
            IsOverlapping = r2
            r2 = 2
            int r1 = r1 % r2
            int r1 = toIntRange
            int r1 = r1 + 107
            int r3 = r1 % 128
            IsOverlapping = r3
            int r1 = r1 % r2
            r3 = 13
            if (r1 != 0) goto L_0x001f
            r1 = 38
            goto L_0x0021
        L_0x001f:
            r1 = 13
        L_0x0021:
            if (r1 == r3) goto L_0x003a
            byte[] r4 = encrypt((java.lang.String) r4, (java.security.PublicKey) r5)     // Catch:{ Exception -> 0x0038 }
            super.hashCode()     // Catch:{ all -> 0x0036 }
            r5 = 17
            if (r4 != 0) goto L_0x0031
            r1 = 17
            goto L_0x0033
        L_0x0031:
            r1 = 90
        L_0x0033:
            if (r1 == r5) goto L_0x0040
            goto L_0x0041
        L_0x0036:
            r4 = move-exception
            throw r4
        L_0x0038:
            r4 = move-exception
            throw r4
        L_0x003a:
            byte[] r4 = encrypt((java.lang.String) r4, (java.security.PublicKey) r5)
            if (r4 != 0) goto L_0x0041
        L_0x0040:
            return r0
        L_0x0041:
            java.lang.String r5 = new java.lang.String
            byte[] r4 = android.util.Base64.encode(r4, r2)
            r5.<init>(r4)
            return r5
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.common.utils.security.RSAHelper.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    private static PublicKey getPublicKey(String str) throws NoSuchAlgorithmException, InvalidKeySpecException {
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        int i = toIntRange + 81;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        return generatePublic;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        if (r7.equals("") != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        if (r0 != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] encrypt(java.lang.String r7, java.security.PublicKey r8) {
        /*
            r0 = 88
            if (r7 == 0) goto L_0x0007
            r1 = 88
            goto L_0x0009
        L_0x0007:
            r1 = 56
        L_0x0009:
            r2 = 0
            if (r1 == r0) goto L_0x000d
            goto L_0x0032
        L_0x000d:
            int r0 = toIntRange     // Catch:{ Exception -> 0x0092 }
            int r0 = r0 + 85
            int r1 = r0 % 128
            IsOverlapping = r1     // Catch:{ Exception -> 0x0092 }
            int r0 = r0 % 2
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            java.lang.String r4 = ""
            if (r0 == r1) goto L_0x0029
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x0047
            goto L_0x0032
        L_0x0029:
            boolean r0 = r7.equals(r4)
            super.hashCode()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x0047
        L_0x0032:
            int r7 = IsOverlapping     // Catch:{ Exception -> 0x0045 }
            int r7 = r7 + 109
            int r8 = r7 % 128
            toIntRange = r8     // Catch:{ Exception -> 0x0045 }
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x0044
            super.hashCode()     // Catch:{ all -> 0x0042 }
            return r2
        L_0x0042:
            r7 = move-exception
            throw r7
        L_0x0044:
            return r2
        L_0x0045:
            r7 = move-exception
            throw r7
        L_0x0047:
            int r0 = android.text.TextUtils.getTrimmedLength(r4)
            int r0 = -101 - r0
            int r1 = android.view.View.resolveSize(r3, r3)
            int r1 = r1 + -104
            byte r1 = (byte) r1
            r4 = 1804035244(0x6b8764ac, float:3.273608E26)
            int r5 = android.graphics.Color.blue(r3)
            int r5 = r5 + r4
            r4 = 2007496799(0x77a7f85f, float:6.813681E33)
            int r6 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r6 = r6 >> 16
            int r6 = r6 + r4
            int r3 = android.graphics.Color.green(r3)
            short r3 = (short) r3
            java.lang.String r0 = setMax(r0, r1, r5, r6, r3)
            java.lang.String r0 = r0.intern()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            byte[] r7 = r7.getBytes(r0)
            byte[] r7 = encryptBytes(r7, r8)
            int r8 = toIntRange
            int r8 = r8 + 71
            int r0 = r8 % 128
            IsOverlapping = r0
            int r8 = r8 % 2
            if (r8 != 0) goto L_0x008f
            int r8 = r2.length     // Catch:{ all -> 0x008d }
            return r7
        L_0x008d:
            r7 = move-exception
            throw r7
        L_0x008f:
            return r7
        L_0x0090:
            r7 = move-exception
            throw r7
        L_0x0092:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.common.utils.security.RSAHelper.encrypt(java.lang.String, java.security.PublicKey):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        if ((r3 == null ? 27 : '?') != '?') goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0025, code lost:
        if (r3 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        if (r4 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0034, code lost:
        r3 = IsOverlapping + 117;
        toIntRange = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0 = javax.crypto.Cipher.getInstance(DEFAULT_TRANSFORMATION);
        r0.init(1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        return r0.doFinal(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] encryptBytes(byte[] r3, java.security.PublicKey r4) {
        /*
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x004f }
            int r0 = r0 + 31
            int r1 = r0 % 128
            toIntRange = r1     // Catch:{ Exception -> 0x004f }
            int r0 = r0 % 2
            r1 = 14
            if (r0 == 0) goto L_0x0011
            r0 = 91
            goto L_0x0013
        L_0x0011:
            r0 = 14
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x0025
            int r0 = r2.length     // Catch:{ all -> 0x0023 }
            r0 = 63
            if (r3 != 0) goto L_0x001e
            r1 = 27
            goto L_0x0020
        L_0x001e:
            r1 = 63
        L_0x0020:
            if (r1 == r0) goto L_0x0032
            goto L_0x0027
        L_0x0023:
            r3 = move-exception
            throw r3
        L_0x0025:
            if (r3 != 0) goto L_0x0032
        L_0x0027:
            int r3 = toIntRange     // Catch:{ Exception -> 0x004f }
            int r3 = r3 + 57
            int r4 = r3 % 128
            IsOverlapping = r4     // Catch:{ Exception -> 0x004f }
            int r3 = r3 % 2
            return r2
        L_0x0032:
            if (r4 != 0) goto L_0x003f
            int r3 = IsOverlapping
            int r3 = r3 + 117
            int r4 = r3 % 128
            toIntRange = r4
            int r3 = r3 % 2
            return r2
        L_0x003f:
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x004e }
            r1 = 1
            r0.init(r1, r4)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x004e }
            byte[] r3 = r0.doFinal(r3)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x004e }
            return r3
        L_0x004e:
            return r2
        L_0x004f:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.common.utils.security.RSAHelper.encryptBytes(byte[], java.security.PublicKey):byte[]");
    }

    public static byte[] decrypt(String str, PrivateKey privateKey) {
        if (str != null) {
            int i = IsOverlapping + 15;
            toIntRange = i % 128;
            int i2 = i % 2;
            if ((str.equals("") ? 'Q' : 20) != 'Q') {
                return decryptBytes(str.getBytes(Charset.forName(setMax((Process.myPid() >> 22) - 101, (byte) (-104 - ExpandableListView.getPackedPositionGroup(0)), 1804035244 - (ViewConfiguration.getWindowTouchSlop() >> 8), (Process.myPid() >> 22) + 2007496799, (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())), privateKey);
            }
        }
        int i3 = IsOverlapping + 61;
        toIntRange = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public static byte[] decryptBytes(byte[] bArr, PrivateKey privateKey) {
        byte[] bArr2 = null;
        if ((bArr == null ? 13 : 'U') != 'U') {
            int i = toIntRange + 17;
            IsOverlapping = i % 128;
            if ((i % 2 == 0 ? 'a' : 1) == 1) {
                return bArr2;
            }
            int length2 = bArr2.length;
            return bArr2;
        }
        if (!(privateKey == null)) {
            try {
                Cipher instance = Cipher.getInstance(DEFAULT_TRANSFORMATION);
                instance.init(2, privateKey);
                return instance.doFinal(bArr);
            } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
                return bArr2;
            }
        } else {
            int i2 = IsOverlapping + 7;
            toIntRange = i2 % 128;
            int i3 = i2 % 2;
            return bArr2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        if ((r1 ? ';' : 'Z') != ';') goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r1 != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, byte r7, int r8, int r9, short r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = setMin     // Catch:{ Exception -> 0x00aa }
            int r6 = r6 + r1
            r1 = -1
            r2 = 0
            r3 = 1
            if (r6 != r1) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x0014
            r4 = 1
            goto L_0x0015
        L_0x0014:
            r4 = 0
        L_0x0015:
            if (r4 == r3) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            byte[] r6 = setMax
            if (r6 == 0) goto L_0x0026
            int r4 = length
            int r4 = r4 + r8
            byte r6 = r6[r4]
            int r4 = setMin
            int r6 = r6 + r4
            byte r6 = (byte) r6
            goto L_0x003b
        L_0x0026:
            short[] r6 = getMax
            int r4 = length
            int r4 = r4 + r8
            short r6 = r6[r4]
            int r4 = setMin
            int r6 = r6 + r4
            short r6 = (short) r6
            int r4 = toIntRange     // Catch:{ Exception -> 0x00aa }
            int r4 = r4 + 53
            int r5 = r4 % 128
            IsOverlapping = r5     // Catch:{ Exception -> 0x00a8 }
            int r4 = r4 % 2
        L_0x003b:
            if (r6 <= 0) goto L_0x003f
            r4 = 1
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            if (r4 == 0) goto L_0x00a3
            int r4 = IsOverlapping
            int r4 = r4 + 113
            int r5 = r4 % 128
            toIntRange = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0050
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            if (r4 == 0) goto L_0x0065
            int r8 = r8 + r6
            int r8 = r8 >> 5
            int r4 = length
            int r8 = r8 << r4
            r4 = 59
            if (r1 == 0) goto L_0x0060
            r1 = 59
            goto L_0x0062
        L_0x0060:
            r1 = 90
        L_0x0062:
            if (r1 == r4) goto L_0x006d
            goto L_0x006e
        L_0x0065:
            int r8 = r8 + r6
            int r8 = r8 + -2
            int r4 = length
            int r8 = r8 + r4
            if (r1 == 0) goto L_0x006e
        L_0x006d:
            r2 = 1
        L_0x006e:
            int r8 = r8 + r2
            int r1 = getMin
            int r9 = r9 + r1
            char r9 = (char) r9
            r0.append(r9)
        L_0x0076:
            if (r3 >= r6) goto L_0x00a3
            int r1 = toIntRange
            int r1 = r1 + 99
            int r2 = r1 % 128
            IsOverlapping = r2
            int r1 = r1 % 2
            byte[] r1 = setMax     // Catch:{ Exception -> 0x00a8 }
            if (r1 == 0) goto L_0x0094
            byte[] r1 = setMax
            int r2 = r8 + -1
            byte r8 = r1[r8]
            int r8 = r8 + r10
            byte r8 = (byte) r8
        L_0x008e:
            r8 = r8 ^ r7
            int r9 = r9 + r8
            char r8 = (char) r9
            r9 = r8
            r8 = r2
            goto L_0x009d
        L_0x0094:
            short[] r1 = getMax     // Catch:{ Exception -> 0x00a8 }
            int r2 = r8 + -1
            short r8 = r1[r8]
            int r8 = r8 + r10
            short r8 = (short) r8
            goto L_0x008e
        L_0x009d:
            r0.append(r9)
            int r3 = r3 + 1
            goto L_0x0076
        L_0x00a3:
            java.lang.String r6 = r0.toString()
            return r6
        L_0x00a8:
            r6 = move-exception
            throw r6
        L_0x00aa:
            r6 = move-exception
            goto L_0x00ad
        L_0x00ac:
            throw r6
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.common.utils.security.RSAHelper.setMax(int, byte, int, int, short):java.lang.String");
    }
}
