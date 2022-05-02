package com.alipay.iap.android.aplog.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {
    private static final String ALGORITHM = "AES";
    private static final String SHA1PRNG = "SHA1PRNG";
    private static final String TAG = "LogAESUtil";
    private static Cipher decryptCipher;
    private static Cipher encryptCipher;

    public static synchronized byte[] encrypt(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] doFinal;
        synchronized (AESUtil.class) {
            try {
                if (encryptCipher == null) {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ALGORITHM);
                    Cipher instance = Cipher.getInstance(ALGORITHM);
                    encryptCipher = instance;
                    instance.init(1, secretKeySpec);
                }
                doFinal = encryptCipher.doFinal(bArr2, i, i2);
            } catch (Throwable unused) {
                encryptCipher = null;
                return null;
            }
        }
        return doFinal;
    }

    public static synchronized byte[] decrypt(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] doFinal;
        synchronized (AESUtil.class) {
            try {
                if (decryptCipher == null) {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ALGORITHM);
                    Cipher instance = Cipher.getInstance(ALGORITHM);
                    decryptCipher = instance;
                    instance.init(2, secretKeySpec);
                }
                doFinal = decryptCipher.doFinal(bArr2, i, i2);
            } catch (Throwable unused) {
                decryptCipher = null;
                return null;
            }
        }
        return doFinal;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|(5:5|6|7|10|11)|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getRawKey(byte[] r4) {
        /*
            java.lang.String r0 = "AES"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0)     // Catch:{ all -> 0x002a }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x002a }
            r2 = 17
            java.lang.String r3 = "SHA1PRNG"
            if (r1 < r2) goto L_0x0015
            java.lang.String r1 = "Crypto"
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r3, r1)     // Catch:{ all -> 0x0015 }
            goto L_0x0019
        L_0x0015:
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r3)     // Catch:{ all -> 0x002a }
        L_0x0019:
            r1.setSeed(r4)     // Catch:{ all -> 0x002a }
            r4 = 128(0x80, float:1.794E-43)
            r0.init(r4, r1)     // Catch:{ all -> 0x002a }
            javax.crypto.SecretKey r4 = r0.generateKey()     // Catch:{ all -> 0x002a }
            byte[] r4 = r4.getEncoded()     // Catch:{ all -> 0x002a }
            return r4
        L_0x002a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.AESUtil.getRawKey(byte[]):byte[]");
    }
}
