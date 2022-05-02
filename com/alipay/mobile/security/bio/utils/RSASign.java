package com.alipay.mobile.security.bio.utils;

import android.util.Base64;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class RSASign {
    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

    public static boolean doCheck(byte[] bArr, byte[] bArr2, InputStream inputStream) {
        try {
            RSAPublicKey loadPublicKey = loadPublicKey(inputStream);
            Signature instance = Signature.getInstance("SHA1WithRSA");
            instance.initVerify(loadPublicKey);
            instance.update(bArr);
            return instance.verify(bArr2);
        } catch (Exception | SignatureException unused) {
            return false;
        }
    }

    private static RSAPublicKey loadPublicKey(InputStream inputStream) throws Exception {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return loadPublicKeyByStr(sb.toString());
                }
                if (readLine.charAt(0) != '-') {
                    sb.append(readLine);
                    sb.append(13);
                }
            }
        } catch (IOException unused) {
            throw new Exception("公钥数据流读取错误");
        } catch (NullPointerException unused2) {
            throw new Exception("公钥输入流为空");
        }
    }

    private static RSAPublicKey loadPublicKeyByStr(String str) throws Exception {
        try {
            return (RSAPublicKey) KeyFactory.getInstance(SuperGwUtils.SIGN_TYPE).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException unused) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused2) {
            throw new Exception("公钥非法");
        } catch (NullPointerException unused3) {
            throw new Exception("公钥数据为空");
        }
    }
}
