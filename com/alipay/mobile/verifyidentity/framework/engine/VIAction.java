package com.alipay.mobile.verifyidentity.framework.engine;

public class VIAction {
    public static final String CALL_FIND_PASSWORD = "find_password";
    private String action;

    public VIAction(String str) {
        this.action = str;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getAction() {
        return this.action;
    }
}
