package com.alipay.mobile.rome.syncsdk.msg;

import java.io.Serializable;

public class MsgInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private String msgData;
    private String msgKey;
    private String msgTimestamp;
    private String perMsgId;
    private String userId;

    public MsgInfo() {
        this.msgData = "";
        this.userId = "";
        this.userId = "";
        this.msgData = "";
        this.msgKey = "";
        this.msgTimestamp = "";
        this.perMsgId = "";
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getMsgData() {
        return this.msgData;
    }

    public void setMsgData(String str) {
        this.msgData = str;
    }

    public String getMsgKey() {
        return this.msgKey;
    }

    public void setMsgKey(String str) {
        this.msgKey = str;
    }

    public String getTimestamp() {
        return this.msgTimestamp;
    }

    public void setTimestamp(String str) {
        this.msgTimestamp = str;
    }

    public String getPerMsgId() {
        return this.perMsgId;
    }

    public void setPerMsgId(String str) {
        this.perMsgId = str;
    }
}
