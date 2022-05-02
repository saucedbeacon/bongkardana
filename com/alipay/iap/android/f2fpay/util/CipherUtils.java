package com.alipay.iap.android.f2fpay.util;

import com.alipay.iap.android.f2fpay.cipher.a;
import com.alipay.iap.android.f2fpay.cipher.b;

public class CipherUtils {
    public static byte[] decryptAes(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        return a.a(bArr, bArr2, bArr3);
    }

    public static byte[] encryptData(byte[] bArr, String str) throws Exception {
        return b.a(bArr, str);
    }

    public static byte[] generateAesKey() {
        return a.a();
    }
}
