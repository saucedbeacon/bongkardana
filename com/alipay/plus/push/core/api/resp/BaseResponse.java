package com.alipay.plus.push.core.api.resp;

public class BaseResponse {
    private String code;
    private String data;
    private String message;
    private boolean success;

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseResponse{code='");
        sb.append(this.code);
        sb.append('\'');
        sb.append(", data='");
        sb.append(this.data);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", success=");
        sb.append(this.success);
        sb.append('}');
        return sb.toString();
    }
}
