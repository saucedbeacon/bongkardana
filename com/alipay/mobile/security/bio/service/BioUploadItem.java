package com.alipay.mobile.security.bio.service;

public class BioUploadItem {
    public String bisToken;
    public byte[] content;
    public byte[] contentSig;
    public boolean isNeedSendResponse = false;

    public String toString() {
        StringBuilder sb = new StringBuilder("BioUploadItem{, bisToken='");
        sb.append(this.bisToken);
        sb.append('\'');
        sb.append(", isNeedSendResponse=");
        sb.append(this.isNeedSendResponse);
        sb.append('}');
        return sb.toString();
    }
}
