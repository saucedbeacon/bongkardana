package com.alipay.iap.android.f2fpay.client.callback;

import com.alipay.iap.android.f2fpay.client.pay.F2FPayResult;

public interface IF2FPayResultCallback {
    void onPayResultArrived(F2FPayResult f2FPayResult);
}
