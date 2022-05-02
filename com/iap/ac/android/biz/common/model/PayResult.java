package com.iap.ac.android.biz.common.model;

public class PayResult {
    public String resultCode;
    public String resultMessage;

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setResultMessage(String str) {
        this.resultMessage = str;
    }
}
