package com.alipay.plus.push.core.api.req;

public class PushReportReq {
    private String appVersion;
    private String channel;
    private String connectType;
    private String deliveryToken;
    private String imei;
    private String imsi;
    private String model;
    private String osType;
    private Integer thirdChannel;
    private String thirdChannelDeviceToken;

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public String getConnectType() {
        return this.connectType;
    }

    public void setConnectType(String str) {
        this.connectType = str;
    }

    public String getDeliveryToken() {
        return this.deliveryToken;
    }

    public void setDeliveryToken(String str) {
        this.deliveryToken = str;
    }

    public String getImei() {
        return this.imei;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public String getImsi() {
        return this.imsi;
    }

    public void setImsi(String str) {
        this.imsi = str;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public String getOsType() {
        return this.osType;
    }

    public void setOsType(String str) {
        this.osType = str;
    }

    public String getThirdChannelDeviceToken() {
        return this.thirdChannelDeviceToken;
    }

    public void setThirdChannelDeviceToken(String str) {
        this.thirdChannelDeviceToken = str;
    }

    public int getThirdChannel() {
        return this.thirdChannel.intValue();
    }

    public void setThirdChannel(int i) {
        this.thirdChannel = Integer.valueOf(i);
    }
}
