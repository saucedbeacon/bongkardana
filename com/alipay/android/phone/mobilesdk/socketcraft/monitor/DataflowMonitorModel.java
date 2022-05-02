package com.alipay.android.phone.mobilesdk.socketcraft.monitor;

public class DataflowMonitorModel {
    public static final String METHOD_NAME_CLOSE = "close";
    public static final String METHOD_NAME_CONNECTION = "connect";
    public static final String METHOD_NAME_RECEIVE = "receive";
    public static final String METHOD_NAME_SEND = "send";
    public String methodName;
    public String ownerId;
    public int receiveSize = 0;
    public int sendSize = 0;
    public String url;

    public DataflowMonitorModel(String str, String str2, String str3, int i, int i2) {
        this.url = str;
        this.ownerId = str2;
        this.methodName = str3;
        this.sendSize = i;
        this.receiveSize = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataflowMonitorModel{url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", methodName=");
        sb.append(this.methodName);
        sb.append(", sendSize=");
        sb.append(this.sendSize);
        sb.append(", receiveSize=");
        sb.append(this.receiveSize);
        sb.append('}');
        return sb.toString();
    }
}
