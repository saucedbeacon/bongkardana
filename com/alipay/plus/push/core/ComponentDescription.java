package com.alipay.plus.push.core;

public class ComponentDescription {
    private String bizType;
    private PushMessageReceiver receiveCallback;

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public PushMessageReceiver getReceiveCallback() {
        return this.receiveCallback;
    }

    public void setReceiveCallback(PushMessageReceiver pushMessageReceiver) {
        this.receiveCallback = pushMessageReceiver;
    }
}
