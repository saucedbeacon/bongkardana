package com.alipay.iap.android.common.errorcode;

public class IAPException extends Exception {
    private IAPError error;

    public IAPException(IAPError iAPError) {
        this.error = iAPError;
    }

    public IAPException(IAPError iAPError, String str) {
        super(str);
        this.error = iAPError;
    }

    public IAPException(IAPError iAPError, String str, Throwable th) {
        super(str, th);
        this.error = iAPError;
    }

    public IAPError getError() {
        return this.error;
    }
}
