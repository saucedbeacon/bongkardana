package com.alipay.iap.android.wallet.acl.base;

public class ResultError {
    public static final int ERROR_CODE_APP_SERVICE_ERROR = 1002;
    public static final int ERROR_CODE_AUTH_PENDING_AGREEMENT = 2001;
    public static final int ERROR_CODE_TIMEOUT = 1003;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 1000;
    public static final int ERROR_CODE_USER_CANCEL = 1001;
    public int errorCode;
    public String errorDesc;

    public /* synthetic */ ResultError() {
    }

    public ResultError(int i, String str) {
        this.errorCode = i;
        this.errorDesc = str;
    }
}
