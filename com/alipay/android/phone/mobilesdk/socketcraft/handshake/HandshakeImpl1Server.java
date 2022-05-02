package com.alipay.android.phone.mobilesdk.socketcraft.handshake;

public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder {
    private short httpstatus;
    private String httpstatusmessage;

    public String getHttpStatusMessage() {
        return this.httpstatusmessage;
    }

    public short getHttpStatus() {
        return this.httpstatus;
    }

    public void setHttpStatusMessage(String str) {
        this.httpstatusmessage = str;
    }

    public void setHttpStatus(short s) {
        this.httpstatus = s;
    }
}
