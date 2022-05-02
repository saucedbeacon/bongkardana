package com.alipay.mobile.security.bio.service.impl;

import android.util.Base64;
import com.alipay.mobile.security.bio.security.AESEncrypt;
import com.alipay.mobile.security.bio.security.RSAEncrypt;
import com.alipay.mobile.security.bio.security.RandomHelper;
import com.alipay.mobile.security.bio.service.BioStoreParameter;
import com.alipay.mobile.security.bio.service.BioStoreResult;
import com.alipay.mobile.security.bio.service.BioStoreService;

public class BioStoreServiceImpl extends BioStoreService {
    public String encrypt(String str, String str2) {
        byte[] bArr;
        try {
            byte[] random = RandomHelper.random(16);
            byte[] encrypt = RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(str2), random);
            byte[] encrypt2 = AESEncrypt.encrypt(str.getBytes(), random);
            bArr = new byte[(encrypt.length + encrypt2.length)];
            try {
                System.arraycopy(encrypt2, 0, bArr, 0, encrypt2.length);
                System.arraycopy(encrypt, 0, bArr, encrypt2.length, encrypt.length);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            bArr = null;
        }
        return Base64.encodeToString(bArr, 8);
    }

    public byte[] getRandom() {
        return RandomHelper.random(16);
    }

    public byte[] encryptWithRandom(byte[] bArr, String str, byte[] bArr2) {
        try {
            byte[] encrypt = RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(str), bArr2);
            byte[] encrypt2 = AESEncrypt.encrypt(bArr, bArr2);
            byte[] bArr3 = new byte[(encrypt.length + encrypt2.length)];
            try {
                System.arraycopy(encrypt2, 0, bArr3, 0, encrypt2.length);
                System.arraycopy(encrypt, 0, bArr3, encrypt2.length, encrypt.length);
                return bArr3;
            } catch (Exception unused) {
                return bArr3;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public BioStoreResult encryptWithRandom(BioStoreParameter bioStoreParameter) {
        if (bioStoreParameter != null) {
            BioStoreResult bioStoreResult = new BioStoreResult();
            try {
                byte[] encrypt = RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(bioStoreParameter.publicKey), bioStoreParameter.random);
                byte[] encrypt2 = AESEncrypt.encrypt(bioStoreParameter.content, bioStoreParameter.random);
                bioStoreResult.encodeSeed = encrypt;
                bioStoreResult.encodeContent = encrypt2;
            } catch (Exception unused) {
            }
            return bioStoreResult;
        }
        throw new IllegalArgumentException("parameter can not be null");
    }
}
