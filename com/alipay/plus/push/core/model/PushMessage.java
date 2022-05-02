package com.alipay.plus.push.core.model;

import java.util.Map;

public class PushMessage {
    private Map<String, String> extras;
    private String message;
    private String msgId;
    private int msgType;
    private String rawMessage;
    private long sentTime;
    private String title;

    public int getMsgType() {
        return this.msgType;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public String getMsgId() {
        return this.msgId;
    }

    public void setMsgId(String str) {
        this.msgId = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public Map<String, String> getExtras() {
        return this.extras;
    }

    public void setExtras(Map<String, String> map) {
        this.extras = map;
    }

    public long getSentTime() {
        return this.sentTime;
    }

    public void setSentTime(long j) {
        this.sentTime = j;
    }

    public Object getRawMessage() {
        return this.rawMessage;
    }

    public void setRawMessage(String str) {
        this.rawMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMessage{msgType=");
        sb.append(this.msgType);
        sb.append(", msgId='");
        sb.append(this.msgId);
        sb.append('\'');
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", extras=");
        sb.append(this.extras);
        sb.append(", sentTime=");
        sb.append(this.sentTime);
        sb.append(", rawMessage='");
        sb.append(this.rawMessage);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
