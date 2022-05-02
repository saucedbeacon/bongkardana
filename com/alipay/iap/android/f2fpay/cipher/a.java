package com.alipay.iap.android.f2fpay.cipher;

import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static KeyGenerator f9308a;

    public static byte[] a() {
        if (f9308a == null) {
            try {
                KeyGenerator instance = KeyGenerator.getInstance("AES");
                f9308a = instance;
                instance.init(128);
            } catch (NoSuchAlgorithmException e) {
                LoggerWrapper.e(F2FPayConstants.TAG, "generateKey", e);
                return null;
            }
        }
        return f9308a.generateKey().getEncoded();
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, ivParameterSpec);
        return instance.doFinal(bArr2);
    }
}
