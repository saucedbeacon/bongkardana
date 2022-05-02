package com.alipay.imobile.network.sslpinning.b;

import com.alipay.iap.android.common.errorcode.IAPError;

public class a {
    public static IAPError a() {
        return new IAPError("AE01015120000002", "Network error occurs");
    }

    public static IAPError b() {
        return new IAPError("AE01015120000007", "Certificate file parsing failed, is this file encoded in PEM or DER format?");
    }
}
