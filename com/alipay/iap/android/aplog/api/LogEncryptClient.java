package com.alipay.iap.android.aplog.api;

public interface LogEncryptClient {
    String decrypt(String str);

    byte[] decrypt(byte[] bArr);

    String encrypt(String str);

    byte[] encrypt(byte[] bArr);
}
