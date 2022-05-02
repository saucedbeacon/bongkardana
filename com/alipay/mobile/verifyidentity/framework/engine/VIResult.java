package com.alipay.mobile.verifyidentity.framework.engine;

public class VIResult {
    private String bizResponseData;
    private String message;
    private int result;
    private String verifyId;

    public VIResult(int i) {
        this.result = i;
    }

    public VIResult(int i, String str) {
        this.result = i;
        this.message = str;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int i) {
        this.result = i;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getBizResponseData() {
        return this.bizResponseData;
    }

    public void setBizResponseData(String str) {
        this.bizResponseData = str;
    }

    public String getVerifyId() {
        return this.verifyId;
    }

    public void setVerifyId(String str) {
        this.verifyId = str;
    }
}
