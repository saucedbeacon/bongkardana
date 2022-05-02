package com.alipay.iap.android.aplog.util;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class RSAUtil {
    private static final String ALGORITHM = "RSA";
    private static final int MAX_DECRYPT_BLOCK = 128;
    private static final int MAX_ENCRYPT_BLOCK = 117;
    private static final String TAG = "LogRSAUtil";
    private static final String TRANSFORM = "RSA/ECB/PKCS1Padding";
    private static Cipher decryptCipher;
    private static Cipher encryptCipher;

    private static PublicKey getPublicKeyFromX509(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Base64.decode(str2)));
    }

    private static PrivateKey getPrivatekeyFromPKCS8(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        encryptCipher = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r7 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0054 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051 A[SYNTHETIC, Splitter:B:31:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized byte[] encrypt(byte[] r6, java.lang.String r7) {
        /*
            java.lang.Class<com.alipay.iap.android.aplog.util.RSAUtil> r0 = com.alipay.iap.android.aplog.util.RSAUtil.class
            monitor-enter(r0)
            r1 = 0
            javax.crypto.Cipher r2 = encryptCipher     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = "RSA"
            java.security.PublicKey r7 = getPublicKeyFromX509(r2, r7)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            java.lang.String r2 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            encryptCipher = r2     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r3 = 1
            r2.init(r3, r7)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
        L_0x001a:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r7.<init>()     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r2 = 0
        L_0x0020:
            int r3 = r6.length     // Catch:{ Exception -> 0x0046 }
            if (r2 >= r3) goto L_0x0038
            javax.crypto.Cipher r3 = encryptCipher     // Catch:{ Exception -> 0x0046 }
            int r4 = r6.length     // Catch:{ Exception -> 0x0046 }
            int r4 = r4 - r2
            r5 = 117(0x75, float:1.64E-43)
            if (r4 >= r5) goto L_0x002e
            int r4 = r6.length     // Catch:{ Exception -> 0x0046 }
            int r5 = r4 - r2
        L_0x002e:
            byte[] r3 = r3.doFinal(r6, r2, r5)     // Catch:{ Exception -> 0x0046 }
            r7.write(r3)     // Catch:{ Exception -> 0x0046 }
            int r2 = r2 + 117
            goto L_0x0020
        L_0x0038:
            r7.flush()     // Catch:{ Exception -> 0x0046 }
            byte[] r1 = r7.toByteArray()     // Catch:{ Exception -> 0x0046 }
        L_0x003f:
            r7.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004b
        L_0x0043:
            r6 = move-exception
            goto L_0x004f
        L_0x0045:
            r7 = r1
        L_0x0046:
            encryptCipher = r1     // Catch:{ all -> 0x004d }
            if (r7 == 0) goto L_0x004b
            goto L_0x003f
        L_0x004b:
            monitor-exit(r0)
            return r1
        L_0x004d:
            r6 = move-exception
            r1 = r7
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            throw r6     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x0059
        L_0x0058:
            throw r6
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.RSAUtil.encrypt(byte[], java.lang.String):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        decryptCipher = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r7 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0054 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051 A[SYNTHETIC, Splitter:B:31:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized byte[] decrypt(byte[] r6, java.lang.String r7) {
        /*
            java.lang.Class<com.alipay.iap.android.aplog.util.RSAUtil> r0 = com.alipay.iap.android.aplog.util.RSAUtil.class
            monitor-enter(r0)
            r1 = 0
            javax.crypto.Cipher r2 = decryptCipher     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = "RSA"
            java.security.PrivateKey r7 = getPrivatekeyFromPKCS8(r2, r7)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            java.lang.String r2 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            decryptCipher = r2     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r3 = 2
            r2.init(r3, r7)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
        L_0x001a:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r7.<init>()     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r2 = 0
        L_0x0020:
            int r3 = r6.length     // Catch:{ Exception -> 0x0046 }
            if (r2 >= r3) goto L_0x0038
            javax.crypto.Cipher r3 = decryptCipher     // Catch:{ Exception -> 0x0046 }
            int r4 = r6.length     // Catch:{ Exception -> 0x0046 }
            int r4 = r4 - r2
            r5 = 128(0x80, float:1.794E-43)
            if (r4 >= r5) goto L_0x002e
            int r4 = r6.length     // Catch:{ Exception -> 0x0046 }
            int r5 = r4 - r2
        L_0x002e:
            byte[] r3 = r3.doFinal(r6, r2, r5)     // Catch:{ Exception -> 0x0046 }
            r7.write(r3)     // Catch:{ Exception -> 0x0046 }
            int r2 = r2 + 128
            goto L_0x0020
        L_0x0038:
            r7.flush()     // Catch:{ Exception -> 0x0046 }
            byte[] r1 = r7.toByteArray()     // Catch:{ Exception -> 0x0046 }
        L_0x003f:
            r7.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004b
        L_0x0043:
            r6 = move-exception
            goto L_0x004f
        L_0x0045:
            r7 = r1
        L_0x0046:
            decryptCipher = r1     // Catch:{ all -> 0x004d }
            if (r7 == 0) goto L_0x004b
            goto L_0x003f
        L_0x004b:
            monitor-exit(r0)
            return r1
        L_0x004d:
            r6 = move-exception
            r1 = r7
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            throw r6     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x0059
        L_0x0058:
            throw r6
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.RSAUtil.decrypt(byte[], java.lang.String):byte[]");
    }
}
