package com.alipay.zoloz.toyger.blob;

import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;

public class CryptoManager {
    private static final int AES_LENGTH = 16;
    private static final String TAG = "CryptoManager";
    private byte[] aesCypher;
    private byte[] aesKey;
    private RSAPublicKey publicKey;

    public CryptoManager(String str) {
        try {
            this.publicKey = RSAEncrypt.loadPublicKeyByStr(str);
            byte[] randomBytes = randomBytes(16);
            this.aesKey = randomBytes;
            this.aesCypher = RSAEncrypt.encrypt(this.publicKey, randomBytes);
        } catch (Exception unused) {
            throw new IllegalArgumentException("fail to init crypto manager");
        }
    }

    public byte[] encrypt(byte[] bArr) {
        return AESEncrypt.encrypt(bArr, this.aesKey);
    }

    public byte[] getAESCypher() {
        return this.aesCypher;
    }

    private byte[] randomBytes(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
