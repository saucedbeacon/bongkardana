package com.alipay.mobile.verifyidentity.base.message;

public class VIRespone {
    public static final int ACCOUNT_INVALID = 3000;
    public static final int CANCEL = 1003;
    public static final int CONTAINER_EMPTY = 2001;
    public static final int FAIL = 1001;
    public static final int FIND_PASS = 1007;
    public static final int FORCE_CLOSE = 1004;
    public static final int INVALID_PARAMS = 1006;
    public static final int INVALID_VERIFY_TYPE = 2003;
    public static final int MODULE_DATA_EMPTY = 2002;
    public static final int NO_PRODUCT = 1008;
    public static final int SET_PASS = 1009;
    public static final int SUCCESS = 1000;
    public static final int TIMEOUT = 1005;
    public static final int VERIFY_FAIL = 2006;
    public static final int VID_EMPTY = 2000;
    private Message message;
    private Message responseMessage;
    private int result = 1000;
    private String verifyId;

    public VIRespone(int i) {
        this.result = i;
    }

    public Message getMessage() {
        return this.message;
    }

    public void setMessage(Message message2) {
        this.message = message2;
    }

    public Message getResponseMessage() {
        return this.responseMessage;
    }

    public void setResponseMessage(Message message2) {
        this.responseMessage = message2;
    }

    public String getVerifyId() {
        return this.verifyId;
    }

    public void setVerifyId(String str) {
        this.verifyId = str;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int i) {
        this.result = i;
    }
}
