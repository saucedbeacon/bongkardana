package com.alipay.zoloz.config;

import android.content.Context;
import com.alipay.mobile.security.bio.utils.FileUtil;

public class RSAKeyParser {
    public static String getPublicKey(Context context, int i) {
        byte[] bArr;
        if (i == 0) {
            try {
                bArr = FileUtil.getAssetsData(context, "bid-log-key-public.key");
            } catch (Exception unused) {
                return "";
            }
        } else {
            bArr = FileUtil.getAssetsData(context, "bid-log-key-public_t.key");
        }
        return new String(bArr);
    }
}
