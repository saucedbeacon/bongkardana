package com.alipay.plus.android.config.sdk.storage;

import android.text.TextUtils;

public class SimpleSecurityEncryptor implements ISecurityEncryptor {
    public String decrypt(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ 6);
        }
        return str;
    }

    public String encrypt(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ 6);
        }
        return str;
    }
}
