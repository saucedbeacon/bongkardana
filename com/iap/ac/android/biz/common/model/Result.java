package com.iap.ac.android.biz.common.model;

import android.text.TextUtils;

public class Result {
    public boolean closeWebpage = true;
    public String merchantResultPageUrl;
    public String resultCode;
    public String resultMessage;
    public String thirdPartyError;

    public Result() {
    }

    public Result(PayResult payResult, boolean z) {
        if (payResult != null) {
            this.resultCode = payResult.getResultCode();
            if (z) {
                if (TextUtils.equals(payResult.getResultCode(), PayResultCode.PAY_PENDING)) {
                    this.resultCode = ResultCode.PROCESSING;
                } else if (TextUtils.equals(payResult.getResultCode(), PayResultCode.PAY_SUCCESS)) {
                    this.resultCode = "SUCCESS";
                }
            }
            this.resultMessage = payResult.getResultMessage();
            return;
        }
        this.resultCode = ResultCode.UNKNOWN_EXCEPTION;
        this.resultMessage = "Oops! System busy. Try again later!";
    }
}
