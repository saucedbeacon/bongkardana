package com.alipay.iap.android.aplog.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    public static String encrypt(String str) {
        if (str == null || "".equals(str.trim())) {
            throw new IllegalArgumentException("input is null");
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("md5");
            instance.update(str.getBytes("UTF8"));
            return hex(instance.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static String hex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(String.valueOf(hexString));
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }
}
