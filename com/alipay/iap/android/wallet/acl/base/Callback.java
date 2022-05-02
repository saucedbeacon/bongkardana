package com.alipay.iap.android.wallet.acl.base;

import com.alipay.iap.android.wallet.acl.base.Result;

public interface Callback<T extends Result> {
    void result(T t);
}
