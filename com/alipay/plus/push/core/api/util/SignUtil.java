package com.alipay.plus.push.core.api.util;

import android.util.Base64;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import o.getTabbarModel;

public class SignUtil {
    public static String sign(String str, String str2, String str3) {
        try {
            PrivateKey privateKeyFromX509 = getPrivateKeyFromX509(SuperGwUtils.SIGN_TYPE, str2);
            Signature instance = Signature.getInstance("SHA256WithRSA");
            instance.initSign(privateKeyFromX509);
            instance.update(str.getBytes(str3));
            return new String(Base64.encode(instance.sign(), 0));
        } catch (Exception unused) {
            return null;
        }
    }

    private static PrivateKey getPrivateKeyFromX509(String str, String str2) {
        try {
            return KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2.getBytes(getTabbarModel.ENC), 0)));
        } catch (Exception unused) {
            return null;
        }
    }
}
