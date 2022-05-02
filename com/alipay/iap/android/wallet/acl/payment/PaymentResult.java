package com.alipay.iap.android.wallet.acl.payment;

import com.alipay.iap.android.wallet.acl.base.BaseResult;

public class PaymentResult extends BaseResult {
    public static final String CODE_FAILURE = "4000";
    public static final String CODE_PENDING = "8000";
    public static final String CODE_SUCCESS = "9000";
    public static final String CODE_USER_CANCEL = "6001";
    private String resultCode;
    private String resultMessage;

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    public void setResultMessage(String str) {
        this.resultMessage = str;
    }
}
