package com.alipay.iap.android.wallet.foundation.code;

import com.alipay.iap.android.wallet.acl.base.BaseResult;

public class ScannerResult extends BaseResult {
    public static final String ERROR_CODE = "ERROR_CODE";
    public static final String ERROR_OPERATION_FAILED = "OPERATION_FAILED";
    public static final String ERROR_USER_CANCEL = "USER_CANCEL";
    private String code;

    public ScannerResult(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }
}
