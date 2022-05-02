package com.iap.ac.android.rpc.ssl.task;

import com.alipay.mobile.common.rpc.RpcException;
import java.io.Serializable;

public class DownloadError implements Serializable {
    public String errorCode;
    public String errorMessage;
    public String memo;

    public DownloadError(String str, String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.memo = "";
    }

    public DownloadError(String str, String str2, String str3) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.memo = str3;
    }

    public DownloadError(RpcException rpcException) {
        StringBuilder sb = new StringBuilder("");
        sb.append(rpcException.getCode());
        this.errorCode = sb.toString();
        this.errorMessage = rpcException.getMsg();
        this.memo = "";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.errorCode);
        sb.append(", errorMessage='");
        sb.append(this.errorMessage);
        sb.append("', memo='");
        sb.append(this.memo);
        sb.append("'}");
        return sb.toString();
    }
}
