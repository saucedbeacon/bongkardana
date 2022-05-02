package com.alibaba.griver.base.common.utils;

import com.alibaba.griver.base.common.logger.GriverLogger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {
    public static synchronized byte[] encrypt(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] doFinal;
        synchronized (AESUtil.class) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(1, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
                doFinal = instance.doFinal(bArr2, i, i2);
            } catch (Throwable th) {
                GriverLogger.w("LogAESUtil", "encrypt exception", th);
                return null;
            }
        }
        return doFinal;
    }

    public static synchronized byte[] decrypt(byte[] bArr, byte[] bArr2, int i, int i2) {
        byte[] doFinal;
        synchronized (AESUtil.class) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(2, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
                doFinal = instance.doFinal(bArr2, i, i2);
            } catch (Throwable th) {
                GriverLogger.w("LogAESUtil", "decrypt failed", th);
                return null;
            }
        }
        return doFinal;
    }
}
