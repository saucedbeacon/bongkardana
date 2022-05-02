package com.alipay.iap.android.common.product.delegate;

public interface IAPUserDelegate {
    void addUserChangeObserver(IAPUserChangeObserver iAPUserChangeObserver);

    boolean checkPermission();

    String getLoginId();

    String getUserId();

    IAPLoginUserInfo getUserInfo();

    void removeUserChangeObserver(IAPUserChangeObserver iAPUserChangeObserver);
}
