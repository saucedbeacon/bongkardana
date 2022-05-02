package com.alipay.plus.push.core.rpc.report.pb;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class DeviceInfoReqPbPB {
    public static final String DEFAULT_APPID = "";
    public static final String DEFAULT_APPVERSION = "";
    public static final String DEFAULT_CHANNEL = "";
    public static final String DEFAULT_CONNECTTYPE = "";
    public static final String DEFAULT_DELIVERYTOKEN = "";
    public static final String DEFAULT_IMEI = "";
    public static final String DEFAULT_IMSI = "";
    public static final String DEFAULT_MODEL = "";
    public static final Integer DEFAULT_OSTYPE = 0;
    public static final String DEFAULT_PUSHVERSION = "";
    public static final Integer DEFAULT_THIRDCHANNEL = 0;
    public static final String DEFAULT_THIRDCHANNELDEVICETOKEN = "";
    public static final String DEFAULT_WORKSPACEID = "";
    public static final int TAG_APPID = 1;
    public static final int TAG_APPVERSION = 7;
    public static final int TAG_CHANNEL = 12;
    public static final int TAG_CONNECTTYPE = 8;
    public static final int TAG_DELIVERYTOKEN = 3;
    public static final int TAG_IMEI = 5;
    public static final int TAG_IMSI = 6;
    public static final int TAG_MODEL = 9;
    public static final int TAG_OSTYPE = 4;
    public static final int TAG_PUSHVERSION = 13;
    public static final int TAG_THIRDCHANNEL = 11;
    public static final int TAG_THIRDCHANNELDEVICETOKEN = 10;
    public static final int TAG_WORKSPACEID = 2;
    public String appId;
    public String appVersion;
    public String channel;
    public String connectType;
    public String deliveryToken;
    public String imei;
    public String imsi;
    public String model;
    public Integer osType;
    public String pushVersion;
    public Integer thirdChannel;
    public String thirdChannelDeviceToken;
    public String workspaceId;

    public DeviceInfoReqPbPB(DeviceInfoReqPbPB deviceInfoReqPbPB) {
        this.appId = deviceInfoReqPbPB.appId;
        this.workspaceId = deviceInfoReqPbPB.workspaceId;
        this.deliveryToken = deviceInfoReqPbPB.deliveryToken;
        this.osType = deviceInfoReqPbPB.osType;
        this.imei = deviceInfoReqPbPB.imei;
        this.imsi = deviceInfoReqPbPB.imsi;
        this.appVersion = deviceInfoReqPbPB.appVersion;
        this.connectType = deviceInfoReqPbPB.connectType;
        this.model = deviceInfoReqPbPB.model;
        this.thirdChannelDeviceToken = deviceInfoReqPbPB.thirdChannelDeviceToken;
        this.thirdChannel = deviceInfoReqPbPB.thirdChannel;
        this.channel = deviceInfoReqPbPB.channel;
        this.pushVersion = deviceInfoReqPbPB.pushVersion;
    }

    public static class Builder {
        DeviceInfoReqPbPB deviceInfoReqPbPB = new DeviceInfoReqPbPB();

        public Builder appId(String str) {
            this.deviceInfoReqPbPB.appId = str;
            return this;
        }

        public Builder workspaceId(String str) {
            this.deviceInfoReqPbPB.workspaceId = str;
            return this;
        }

        public Builder deliveryToken(String str) {
            this.deviceInfoReqPbPB.deliveryToken = str;
            return this;
        }

        public Builder osType(Integer num) {
            this.deviceInfoReqPbPB.osType = num;
            return this;
        }

        public Builder imei(String str) {
            this.deviceInfoReqPbPB.imei = str;
            return this;
        }

        public Builder imsi(String str) {
            this.deviceInfoReqPbPB.imsi = str;
            return this;
        }

        public Builder appVersion(String str) {
            this.deviceInfoReqPbPB.appVersion = str;
            return this;
        }

        public Builder connectType(String str) {
            this.deviceInfoReqPbPB.connectType = str;
            return this;
        }

        public Builder model(String str) {
            this.deviceInfoReqPbPB.model = str;
            return this;
        }

        public Builder thirdChannelDeviceToken(String str) {
            this.deviceInfoReqPbPB.thirdChannelDeviceToken = str;
            return this;
        }

        public Builder thirdChannel(Integer num) {
            this.deviceInfoReqPbPB.thirdChannel = num;
            return this;
        }

        public Builder channel(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1111283304, oncanceled);
                onCancelLoad.getMin(-1111283304, oncanceled);
            }
            this.deviceInfoReqPbPB.channel = str;
            return this;
        }

        public DeviceInfoReqPbPB build() {
            return this.deviceInfoReqPbPB;
        }

        public Builder pushVersion(String str) {
            this.deviceInfoReqPbPB.pushVersion = str;
            return this;
        }
    }

    public DeviceInfoReqPbPB() {
    }

    public final DeviceInfoReqPbPB fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.appId = (String) obj;
                break;
            case 2:
                this.workspaceId = (String) obj;
                break;
            case 3:
                this.deliveryToken = (String) obj;
                break;
            case 4:
                this.osType = (Integer) obj;
                break;
            case 5:
                this.imei = (String) obj;
                break;
            case 6:
                this.imsi = (String) obj;
                break;
            case 7:
                this.appVersion = (String) obj;
                break;
            case 8:
                this.connectType = (String) obj;
                break;
            case 9:
                this.model = (String) obj;
                break;
            case 10:
                this.thirdChannelDeviceToken = (String) obj;
                break;
            case 11:
                this.thirdChannel = (Integer) obj;
                break;
            case 12:
                this.channel = (String) obj;
                break;
            case 13:
                break;
        }
        this.pushVersion = (String) obj;
        return this;
    }
}
