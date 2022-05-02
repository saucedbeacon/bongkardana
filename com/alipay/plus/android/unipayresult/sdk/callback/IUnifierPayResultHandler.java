package com.alipay.plus.android.unipayresult.sdk.callback;

import com.alipay.plus.android.unipayresult.sdk.executor.UnifierPayResultInfo;

public interface IUnifierPayResultHandler {
    boolean handlePayResult(UnifierPayResultInfo unifierPayResultInfo);
}
