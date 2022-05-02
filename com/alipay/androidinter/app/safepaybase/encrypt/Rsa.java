package com.alipay.androidinter.app.safepaybase.encrypt;

import android.util.Base64;
import com.alipay.androidinter.app.safepaybase.log.LogTracer;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import o.getTabbarModel;
import o.onActivityPreCreated;

public class Rsa {
    private static final String ALGORITHM = "RSA";
    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";
    private static int getMin = 1;
    private static long length = 4438372797201507635L;
    private static int setMax;

    private static PublicKey getPublicKeyFromX509(String str, String str2) throws Exception {
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
            int i = setMax + 27;
            getMin = i % 128;
            if ((i % 2 == 0 ? 'B' : 'J') != 'B') {
                return generatePublic;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return generatePublic;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8 A[SYNTHETIC, Splitter:B:34:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6 A[SYNTHETIC, Splitter:B:51:0x00e6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encrypt(java.lang.String r9, java.lang.String r10) {
        /*
            com.alipay.androidinter.app.safepaybase.log.LogTracer r0 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "key:"
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Rsa.encrypt"
            r0.traceInfo(r2, r1)
            r0 = 0
            r1 = 2
            r2 = 0
            r3 = 1
            java.lang.String r4 = "RSA"
            java.security.PublicKey r10 = getPublicKeyFromX509(r4, r10)     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            java.lang.String r4 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r4.init(r3, r10)     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r10 = 9
            char[] r10 = new char[r10]     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5 = 35147(0x894b, float:4.9251E-41)
            r10[r2] = r5     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5 = 28389(0x6ee5, float:3.9781E-41)
            r10[r3] = r5     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5 = 35102(0x891e, float:4.9188E-41)
            r10[r1] = r5     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5 = 3
            r6 = 35714(0x8b82, float:5.0046E-41)
            r10[r5] = r6     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5 = 4
            r6 = 53698(0xd1c2, float:7.5247E-41)
            r10[r5] = r6     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5 = 5
            r6 = 27983(0x6d4f, float:3.9213E-41)
            r10[r5] = r6     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5 = 6
            r6 = 7138(0x1be2, float:1.0002E-41)
            r10[r5] = r6     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5 = 7
            r6 = 49915(0xc2fb, float:6.9946E-41)
            r10[r5] = r6     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5 = 8
            r6 = 7615(0x1dbf, float:1.0671E-41)
            r10[r5] = r6     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            java.lang.String r10 = length(r10)     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            java.lang.String r10 = r10.intern()     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            byte[] r9 = r9.getBytes(r10)     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            int r10 = r4.getBlockSize()     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r5.<init>()     // Catch:{ Exception -> 0x00bd, all -> 0x00bb }
            r6 = 0
        L_0x007c:
            int r7 = r9.length     // Catch:{ Exception -> 0x00b9 }
            if (r6 >= r7) goto L_0x0081
            r7 = 1
            goto L_0x0082
        L_0x0081:
            r7 = 0
        L_0x0082:
            if (r7 == r3) goto L_0x0099
            byte[] r9 = r5.toByteArray()     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = android.util.Base64.encodeToString(r9, r1)     // Catch:{ Exception -> 0x00b9 }
            r5.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x00cb
        L_0x0090:
            r9 = move-exception
            com.alipay.androidinter.app.safepaybase.log.LogTracer r10 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()
            r10.printExceptionStackTrace(r9)
            goto L_0x00cb
        L_0x0099:
            int r7 = r9.length     // Catch:{ Exception -> 0x00b9 }
            int r7 = r7 - r6
            if (r7 >= r10) goto L_0x00af
            int r7 = setMax
            int r7 = r7 + 83
            int r8 = r7 % 128
            getMin = r8
            int r7 = r7 % r1
            if (r7 != 0) goto L_0x00ac
            int r7 = r9.length     // Catch:{ Exception -> 0x00b9 }
            int r7 = r7 * r6
            goto L_0x00b0
        L_0x00ac:
            int r7 = r9.length     // Catch:{ Exception -> 0x00b9 }
            int r7 = r7 - r6
            goto L_0x00b0
        L_0x00af:
            r7 = r10
        L_0x00b0:
            byte[] r7 = r4.doFinal(r9, r6, r7)     // Catch:{ Exception -> 0x00b9 }
            r5.write(r7)     // Catch:{ Exception -> 0x00b9 }
            int r6 = r6 + r10
            goto L_0x007c
        L_0x00b9:
            r9 = move-exception
            goto L_0x00bf
        L_0x00bb:
            r9 = move-exception
            goto L_0x00e4
        L_0x00bd:
            r9 = move-exception
            r5 = r0
        L_0x00bf:
            com.alipay.androidinter.app.safepaybase.log.LogTracer r10 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()     // Catch:{ all -> 0x00e2 }
            r10.printExceptionStackTrace(r9)     // Catch:{ all -> 0x00e2 }
            if (r5 == 0) goto L_0x00cb
            r5.close()     // Catch:{ IOException -> 0x0090 }
        L_0x00cb:
            int r9 = setMax
            int r9 = r9 + 41
            int r10 = r9 % 128
            getMin = r10
            int r9 = r9 % r1
            if (r9 != 0) goto L_0x00d8
            r9 = 1
            goto L_0x00d9
        L_0x00d8:
            r9 = 0
        L_0x00d9:
            if (r9 == r3) goto L_0x00dc
            return r0
        L_0x00dc:
            r9 = 17
            int r9 = r9 / r2
            return r0
        L_0x00e0:
            r9 = move-exception
            throw r9
        L_0x00e2:
            r9 = move-exception
            r0 = r5
        L_0x00e4:
            if (r0 == 0) goto L_0x00f2
            r0.close()     // Catch:{ IOException -> 0x00ea }
            goto L_0x00f2
        L_0x00ea:
            r10 = move-exception
            com.alipay.androidinter.app.safepaybase.log.LogTracer r0 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()
            r0.printExceptionStackTrace(r10)
        L_0x00f2:
            goto L_0x00f4
        L_0x00f3:
            throw r9
        L_0x00f4:
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.androidinter.app.safepaybase.encrypt.Rsa.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        if (((r10.length << r7) < r3 ? 'G' : kotlin.text.Typography.amp) != 'G') goto L_0x00a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00db A[SYNTHETIC, Splitter:B:44:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e3 A[SYNTHETIC, Splitter:B:50:0x00e3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] encryptToByteArray(java.lang.String r10, java.lang.String r11) {
        /*
            r0 = 0
            java.lang.String r1 = "RSA"
            java.security.PublicKey r11 = getPublicKeyFromX509(r1, r11)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r2 = 1
            r1.init(r2, r11)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r11 = 9
            char[] r3 = new char[r11]     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 35147(0x894b, float:4.9251E-41)
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 28389(0x6ee5, float:3.9781E-41)
            r3[r2] = r4     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 35102(0x891e, float:4.9188E-41)
            r6 = 2
            r3[r6] = r4     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 3
            r7 = 35714(0x8b82, float:5.0046E-41)
            r3[r4] = r7     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 4
            r7 = 53698(0xd1c2, float:7.5247E-41)
            r3[r4] = r7     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 5
            r7 = 27983(0x6d4f, float:3.9213E-41)
            r3[r4] = r7     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 6
            r7 = 7138(0x1be2, float:1.0002E-41)
            r3[r4] = r7     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 7
            r7 = 49915(0xc2fb, float:6.9946E-41)
            r3[r4] = r7     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4 = 8
            r7 = 7615(0x1dbf, float:1.0671E-41)
            r3[r4] = r7     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.lang.String r3 = length(r3)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.lang.String r3 = r3.intern()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            byte[] r10 = r10.getBytes(r3)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            int r3 = r1.getBlockSize()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r4.<init>()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
            r7 = 0
        L_0x005d:
            int r8 = r10.length     // Catch:{ Exception -> 0x00cc }
            if (r7 >= r8) goto L_0x0063
            r8 = 9
            goto L_0x0065
        L_0x0063:
            r8 = 27
        L_0x0065:
            if (r8 == r11) goto L_0x0082
            byte[] r0 = r4.toByteArray()     // Catch:{ Exception -> 0x00cc }
            r4.close()     // Catch:{ IOException -> 0x0079 }
            int r10 = getMin
            int r10 = r10 + 109
            int r11 = r10 % 128
            setMax = r11
            int r10 = r10 % r6
            goto L_0x00de
        L_0x0079:
            r10 = move-exception
            com.alipay.androidinter.app.safepaybase.log.LogTracer r11 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()
            r11.printExceptionStackTrace(r10)
            goto L_0x00de
        L_0x0082:
            int r8 = getMin
            int r8 = r8 + 85
            int r9 = r8 % 128
            setMax = r9
            int r8 = r8 % r6
            if (r8 == 0) goto L_0x008f
            r8 = 1
            goto L_0x0090
        L_0x008f:
            r8 = 0
        L_0x0090:
            if (r8 == r2) goto L_0x0097
            int r8 = r10.length     // Catch:{ Exception -> 0x00cc }
            int r8 = r8 - r7
            if (r8 >= r3) goto L_0x00a4
            goto L_0x00af
        L_0x0097:
            int r8 = r10.length     // Catch:{ Exception -> 0x00cc }
            int r8 = r8 << r7
            r9 = 71
            if (r8 >= r3) goto L_0x00a0
            r8 = 71
            goto L_0x00a2
        L_0x00a0:
            r8 = 38
        L_0x00a2:
            if (r8 == r9) goto L_0x00af
        L_0x00a4:
            int r8 = getMin
            int r8 = r8 + 89
            int r9 = r8 % 128
            setMax = r9
            int r8 = r8 % r6
            r8 = r3
            goto L_0x00ba
        L_0x00af:
            int r8 = setMax
            int r8 = r8 + 105
            int r9 = r8 % 128
            getMin = r9
            int r8 = r8 % r6
            int r8 = r10.length     // Catch:{ Exception -> 0x00cc }
            int r8 = r8 - r7
        L_0x00ba:
            byte[] r8 = r1.doFinal(r10, r7, r8)     // Catch:{ Exception -> 0x00cc }
            r4.write(r8)     // Catch:{ Exception -> 0x00cc }
            int r7 = r7 + r3
            int r8 = setMax
            int r8 = r8 + 47
            int r9 = r8 % 128
            getMin = r9
            int r8 = r8 % r6
            goto L_0x005d
        L_0x00cc:
            r10 = move-exception
            goto L_0x00d2
        L_0x00ce:
            r10 = move-exception
            goto L_0x00e1
        L_0x00d0:
            r10 = move-exception
            r4 = r0
        L_0x00d2:
            com.alipay.androidinter.app.safepaybase.log.LogTracer r11 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()     // Catch:{ all -> 0x00df }
            r11.printExceptionStackTrace(r10)     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00de
            r4.close()     // Catch:{ IOException -> 0x0079 }
        L_0x00de:
            return r0
        L_0x00df:
            r10 = move-exception
            r0 = r4
        L_0x00e1:
            if (r0 == 0) goto L_0x00ef
            r0.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00ef
        L_0x00e7:
            r11 = move-exception
            com.alipay.androidinter.app.safepaybase.log.LogTracer r0 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()
            r0.printExceptionStackTrace(r11)
        L_0x00ef:
            goto L_0x00f1
        L_0x00f0:
            throw r10
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.androidinter.app.safepaybase.encrypt.Rsa.encryptToByteArray(java.lang.String, java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090 A[SYNTHETIC, Splitter:B:43:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1 A[SYNTHETIC, Splitter:B:50:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String decrypt(java.lang.String r9, java.lang.String r10) {
        /*
            r0 = 0
            r1 = 2
            java.security.spec.PKCS8EncodedKeySpec r2 = new java.security.spec.PKCS8EncodedKeySpec     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            byte[] r10 = android.util.Base64.decode(r10, r1)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.lang.String r10 = "RSA"
            java.security.KeyFactory r10 = java.security.KeyFactory.getInstance(r10)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.security.PrivateKey r10 = r10.generatePrivate(r2)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.lang.String r2 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            r2.init(r1, r10)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            byte[] r9 = android.util.Base64.decode(r9, r1)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            int r10 = r2.getBlockSize()     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            r3.<init>()     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            r4 = 0
            r5 = 0
        L_0x002d:
            int r6 = r9.length     // Catch:{ Exception -> 0x0081 }
            r7 = 1
            if (r5 >= r6) goto L_0x0033
            r6 = 1
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            if (r6 == 0) goto L_0x0061
            int r6 = r9.length     // Catch:{ Exception -> 0x0081 }
            int r6 = r6 - r5
            if (r6 >= r10) goto L_0x003c
            r6 = 1
            goto L_0x003d
        L_0x003c:
            r6 = 0
        L_0x003d:
            if (r6 == r7) goto L_0x004d
            int r6 = getMin     // Catch:{ Exception -> 0x004b }
            int r6 = r6 + 115
            int r7 = r6 % 128
            setMax = r7     // Catch:{ Exception -> 0x004b }
            int r6 = r6 % 2
            r6 = r10
            goto L_0x0058
        L_0x004b:
            r9 = move-exception
            throw r9
        L_0x004d:
            int r6 = r9.length     // Catch:{ Exception -> 0x0081 }
            int r6 = r6 - r5
            int r7 = setMax
            int r7 = r7 + 29
            int r8 = r7 % 128
            getMin = r8
            int r7 = r7 % r1
        L_0x0058:
            byte[] r6 = r2.doFinal(r9, r5, r6)     // Catch:{ Exception -> 0x0081 }
            r3.write(r6)     // Catch:{ Exception -> 0x0081 }
            int r5 = r5 + r10
            goto L_0x002d
        L_0x0061:
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x0081 }
            byte[] r10 = r3.toByteArray()     // Catch:{ Exception -> 0x0081 }
            r9.<init>(r10)     // Catch:{ Exception -> 0x0081 }
            r3.close()     // Catch:{ IOException -> 0x0077 }
            int r10 = setMax
            int r10 = r10 + 55
            int r0 = r10 % 128
            getMin = r0
            int r10 = r10 % r1
            goto L_0x007f
        L_0x0077:
            r10 = move-exception
            com.alipay.androidinter.app.safepaybase.log.LogTracer r0 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()
            r0.printExceptionStackTrace(r10)
        L_0x007f:
            r0 = r9
            goto L_0x009c
        L_0x0081:
            r9 = move-exception
            goto L_0x0087
        L_0x0083:
            r9 = move-exception
            goto L_0x009f
        L_0x0085:
            r9 = move-exception
            r3 = r0
        L_0x0087:
            com.alipay.androidinter.app.safepaybase.log.LogTracer r10 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()     // Catch:{ all -> 0x009d }
            r10.printExceptionStackTrace(r9)     // Catch:{ all -> 0x009d }
            if (r3 == 0) goto L_0x009c
            r3.close()     // Catch:{ IOException -> 0x0094 }
            goto L_0x009c
        L_0x0094:
            r9 = move-exception
            com.alipay.androidinter.app.safepaybase.log.LogTracer r10 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()
            r10.printExceptionStackTrace(r9)
        L_0x009c:
            return r0
        L_0x009d:
            r9 = move-exception
            r0 = r3
        L_0x009f:
            if (r0 == 0) goto L_0x00b8
            r0.close()     // Catch:{ IOException -> 0x00b0 }
            int r10 = getMin     // Catch:{ Exception -> 0x00ae }
            int r10 = r10 + 45
            int r0 = r10 % 128
            setMax = r0     // Catch:{ Exception -> 0x00ae }
            int r10 = r10 % r1
            goto L_0x00b8
        L_0x00ae:
            r9 = move-exception
            throw r9
        L_0x00b0:
            r10 = move-exception
            com.alipay.androidinter.app.safepaybase.log.LogTracer r0 = com.alipay.androidinter.app.safepaybase.log.LogTracer.getInstance()
            r0.printExceptionStackTrace(r10)
        L_0x00b8:
            goto L_0x00ba
        L_0x00b9:
            throw r9
        L_0x00ba:
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.androidinter.app.safepaybase.encrypt.Rsa.decrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String sign(String str, String str2) {
        String str3 = null;
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 2)));
            Signature instance = Signature.getInstance("SHA1WithRSA");
            instance.initSign(generatePrivate);
            instance.update(str.getBytes(getTabbarModel.ENC));
            String encodeToString = Base64.encodeToString(instance.sign(), 2);
            int i = getMin + 75;
            setMax = i % 128;
            if (i % 2 == 0) {
                return encodeToString;
            }
            super.hashCode();
            return encodeToString;
        } catch (Exception e) {
            LogTracer.getInstance().printExceptionStackTrace(e);
            return str3;
        }
    }

    public static boolean doCheck(String str, String str2, String str3) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3, 2)));
            Signature instance = Signature.getInstance("SHA1WithRSA");
            instance.initVerify(generatePublic);
            instance.update(str.getBytes(getTabbarModel.ENC));
            boolean verify = instance.verify(Base64.decode(str2, 2));
            int i = getMin + 107;
            setMax = i % 128;
            int i2 = i % 2;
            return verify;
        } catch (Exception e) {
            LogTracer.getInstance().printExceptionStackTrace(e);
            return false;
        }
    }

    private static String length(char[] cArr) {
        try {
            int i = getMin + 31;
            setMax = i % 128;
            if (i % 2 != 0) {
            }
            char[] length2 = onActivityPreCreated.length(length, cArr);
            int i2 = 4;
            while (true) {
                if ((i2 < length2.length ? 0 : ':') != 0) {
                    String str = new String(length2, 4, length2.length - 4);
                    int i3 = getMin + 113;
                    setMax = i3 % 128;
                    int i4 = i3 % 2;
                    return str;
                }
                int i5 = getMin + 85;
                setMax = i5 % 128;
                int i6 = i5 % 2;
                length2[i2] = (char) ((int) (((long) (length2[i2] ^ length2[i2 % 4])) ^ (((long) (i2 - 4)) * length)));
                i2++;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
