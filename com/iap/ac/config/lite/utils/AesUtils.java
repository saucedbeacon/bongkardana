package com.iap.ac.config.lite.utils;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AesUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final IvParameterSpec f9827a = new IvParameterSpec("amcsalipayaesivs".getBytes());

    public static String decrypt(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, f9827a);
        return new String(instance.doFinal(Base64.decode(str, 0)));
    }
}
