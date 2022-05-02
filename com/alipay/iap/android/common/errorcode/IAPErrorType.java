package com.alipay.iap.android.common.errorcode;

public enum IAPErrorType {
    system(0),
    biz(1),
    library(2);
    
    private int value;

    private IAPErrorType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
