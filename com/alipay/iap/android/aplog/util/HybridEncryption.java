package com.alipay.iap.android.aplog.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.util.Base64;
import java.util.UUID;

public class HybridEncryption {
    private static HybridEncryption INSTANCE = null;
    private static final String TAG = "Hybrid";
    private static String preLoad;
    private boolean isCreatePairError;
    private boolean isGenerateSeedError;
    private boolean isRandomUUIDError;
    private String publicKey;
    private byte[] rawSeed;
    private byte[] secureSeed;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(AESUtil.class.getName());
        sb.append(RSAUtil.class.getName());
        sb.append(Base64.class.getName());
        sb.append(LoggingUtil.class.getName());
        sb.append(MD5Util.class.getName());
        preLoad = sb.toString();
    }

    private HybridEncryption(Context context) {
        this.publicKey = obtainPublicKey(context);
    }

    private HybridEncryption(String str) {
        this.publicKey = str;
    }

    public static HybridEncryption getInstance() {
        HybridEncryption hybridEncryption = INSTANCE;
        if (hybridEncryption != null) {
            return hybridEncryption;
        }
        throw new IllegalStateException("need createInstance befor use");
    }

    public static synchronized HybridEncryption createInstance(Context context) {
        HybridEncryption hybridEncryption;
        synchronized (HybridEncryption.class) {
            if (INSTANCE == null) {
                INSTANCE = new HybridEncryption(context);
            }
            hybridEncryption = INSTANCE;
        }
        return hybridEncryption;
    }

    public static synchronized HybridEncryption createInstance(String str) {
        HybridEncryption hybridEncryption;
        synchronized (HybridEncryption.class) {
            if (INSTANCE == null) {
                INSTANCE = new HybridEncryption(str);
            }
            hybridEncryption = INSTANCE;
        }
        return hybridEncryption;
    }

    private String obtainPublicKey(Context context) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null || applicationInfo.metaData == null) {
            return null;
        }
        Bundle bundle = applicationInfo.metaData;
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCpffOiYcozIfgIiaOPWsmfktv7Sl/9Af3mIgYz7vkTXoGq4iMN+t5BLV6KjddVEI/9oLtAYV8qx7FhFrUoi3smcYfX35ETPUiHi1gLizeXKVSRYhIm2kiDF5lGfDgcS7uJZvmKjbdYy/RphnH+WQvQyeEH+4rjYSkdhIRE2W52BwIDAQAB";
    }

    public byte[] getSecureSeed() {
        return this.secureSeed;
    }

    public byte[] encrypt(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        if (this.rawSeed == null || this.secureSeed == null) {
            try {
                bArr2 = UUID.randomUUID().toString().getBytes();
            } catch (Throwable unused) {
                if (!this.isRandomUUIDError) {
                    this.isRandomUUIDError = true;
                }
                bArr2 = null;
            }
            if (bArr2 == null) {
                try {
                    bArr2 = String.valueOf(System.currentTimeMillis()).getBytes();
                } catch (Throwable unused2) {
                    if (!this.isGenerateSeedError) {
                        this.isGenerateSeedError = true;
                    }
                }
            }
            byte[] rawKey = AESUtil.getRawKey(bArr2);
            this.rawSeed = rawKey;
            this.secureSeed = RSAUtil.encrypt(rawKey, this.publicKey);
        }
        byte[] bArr3 = this.rawSeed;
        if (!(bArr3 == null || this.secureSeed == null)) {
            try {
                return AESUtil.encrypt(bArr3, bArr, i, i2);
            } catch (Throwable unused3) {
                if (!this.isCreatePairError) {
                    this.isCreatePairError = true;
                }
            }
        }
        return null;
    }
}
