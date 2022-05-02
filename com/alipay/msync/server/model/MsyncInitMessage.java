package com.alipay.msync.server.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MsyncInitMessage extends Message {
    public static final String DEFAULT_ACTION = "";
    public static final String DEFAULT_APPID = "";
    public static final String DEFAULT_APPKEY = "";
    public static final String DEFAULT_APPVERSION = "";
    public static final String DEFAULT_CKEY = "";
    public static final String DEFAULT_DEVICEID = "";
    public static final String DEFAULT_IMEI = "";
    public static final String DEFAULT_IMSI = "";
    public static final String DEFAULT_LANGUAGE = "";
    public static final String DEFAULT_LINKEXTINFO = "";
    public static final String DEFAULT_LINKTOKEN = "";
    public static final String DEFAULT_LINKVERSION = "";
    public static final String DEFAULT_NETWORK = "";
    public static final String DEFAULT_OSTYPE = "";
    public static final String DEFAULT_PRODUCTID = "";
    public static final String DEFAULT_SESSIONID = "";
    public static final String DEFAULT_SIGNATURE = "";
    public static final Long DEFAULT_TIMESTAMP = 0L;
    public static final String DEFAULT_WORKSPACEID = "";
    public static final int TAG_ACTION = 7;
    public static final int TAG_APPID = 9;
    public static final int TAG_APPKEY = 15;
    public static final int TAG_APPVERSION = 4;
    public static final int TAG_CKEY = 10;
    public static final int TAG_DEVICEID = 5;
    public static final int TAG_IMEI = 12;
    public static final int TAG_IMSI = 11;
    public static final int TAG_LANGUAGE = 14;
    public static final int TAG_LINKEXTINFO = 19;
    public static final int TAG_LINKTOKEN = 1;
    public static final int TAG_LINKVERSION = 2;
    public static final int TAG_NETWORK = 3;
    public static final int TAG_OSTYPE = 6;
    public static final int TAG_PRODUCTID = 8;
    public static final int TAG_SESSIONID = 13;
    public static final int TAG_SIGNATURE = 18;
    public static final int TAG_TIMESTAMP = 17;
    public static final int TAG_WORKSPACEID = 16;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String action;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public String appId;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public String appKey;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String appVersion;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public String cKey;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String deviceId;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public String imei;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public String imsi;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public String language;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public String linkExtInfo;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String linkToken;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String linkVersion;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String network;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String osType;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String productId;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public String sessionId;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public String signature;
    @ProtoField(tag = 17, type = Message.Datatype.INT64)
    public Long timeStamp;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public String workspaceId;

    public MsyncInitMessage(MsyncInitMessage msyncInitMessage) {
        super(msyncInitMessage);
        if (msyncInitMessage != null) {
            this.linkToken = msyncInitMessage.linkToken;
            this.linkVersion = msyncInitMessage.linkVersion;
            this.network = msyncInitMessage.network;
            this.appVersion = msyncInitMessage.appVersion;
            this.deviceId = msyncInitMessage.deviceId;
            this.osType = msyncInitMessage.osType;
            this.action = msyncInitMessage.action;
            this.productId = msyncInitMessage.productId;
            this.appId = msyncInitMessage.appId;
            this.cKey = msyncInitMessage.cKey;
            this.imsi = msyncInitMessage.imsi;
            this.imei = msyncInitMessage.imei;
            this.sessionId = msyncInitMessage.sessionId;
            this.language = msyncInitMessage.language;
            this.appKey = msyncInitMessage.appKey;
            this.workspaceId = msyncInitMessage.workspaceId;
            this.timeStamp = msyncInitMessage.timeStamp;
            this.signature = msyncInitMessage.signature;
            this.linkExtInfo = msyncInitMessage.linkExtInfo;
        }
    }

    public MsyncInitMessage() {
    }

    public final MsyncInitMessage fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.linkToken = (String) obj;
                break;
            case 2:
                this.linkVersion = (String) obj;
                break;
            case 3:
                this.network = (String) obj;
                break;
            case 4:
                this.appVersion = (String) obj;
                break;
            case 5:
                this.deviceId = (String) obj;
                break;
            case 6:
                this.osType = (String) obj;
                break;
            case 7:
                this.action = (String) obj;
                break;
            case 8:
                this.productId = (String) obj;
                break;
            case 9:
                this.appId = (String) obj;
                break;
            case 10:
                this.cKey = (String) obj;
                break;
            case 11:
                this.imsi = (String) obj;
                break;
            case 12:
                this.imei = (String) obj;
                break;
            case 13:
                this.sessionId = (String) obj;
                break;
            case 14:
                this.language = (String) obj;
                break;
            case 15:
                this.appKey = (String) obj;
                break;
            case 16:
                this.workspaceId = (String) obj;
                break;
            case 17:
                this.timeStamp = (Long) obj;
                break;
            case 18:
                this.signature = (String) obj;
                break;
            case 19:
                this.linkExtInfo = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MsyncInitMessage)) {
            return false;
        }
        MsyncInitMessage msyncInitMessage = (MsyncInitMessage) obj;
        return equals((Object) this.linkToken, (Object) msyncInitMessage.linkToken) && equals((Object) this.linkVersion, (Object) msyncInitMessage.linkVersion) && equals((Object) this.network, (Object) msyncInitMessage.network) && equals((Object) this.appVersion, (Object) msyncInitMessage.appVersion) && equals((Object) this.deviceId, (Object) msyncInitMessage.deviceId) && equals((Object) this.osType, (Object) msyncInitMessage.osType) && equals((Object) this.action, (Object) msyncInitMessage.action) && equals((Object) this.productId, (Object) msyncInitMessage.productId) && equals((Object) this.appId, (Object) msyncInitMessage.appId) && equals((Object) this.cKey, (Object) msyncInitMessage.cKey) && equals((Object) this.imsi, (Object) msyncInitMessage.imsi) && equals((Object) this.imei, (Object) msyncInitMessage.imei) && equals((Object) this.sessionId, (Object) msyncInitMessage.sessionId) && equals((Object) this.language, (Object) msyncInitMessage.language) && equals((Object) this.appKey, (Object) msyncInitMessage.appKey) && equals((Object) this.workspaceId, (Object) msyncInitMessage.workspaceId) && equals((Object) this.timeStamp, (Object) msyncInitMessage.timeStamp) && equals((Object) this.signature, (Object) msyncInitMessage.signature) && equals((Object) this.linkExtInfo, (Object) msyncInitMessage.linkExtInfo);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.linkToken;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.linkVersion;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.network;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.appVersion;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.deviceId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.osType;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.action;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.productId;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.appId;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.cKey;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.imsi;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.imei;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.sessionId;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.language;
        int hashCode14 = (hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.appKey;
        int hashCode15 = (hashCode14 + (str15 != null ? str15.hashCode() : 0)) * 37;
        String str16 = this.workspaceId;
        int hashCode16 = (hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 37;
        Long l = this.timeStamp;
        int hashCode17 = (hashCode16 + (l != null ? l.hashCode() : 0)) * 37;
        String str17 = this.signature;
        int hashCode18 = (hashCode17 + (str17 != null ? str17.hashCode() : 0)) * 37;
        String str18 = this.linkExtInfo;
        if (str18 != null) {
            i2 = str18.hashCode();
        }
        int i3 = hashCode18 + i2;
        this.hashCode = i3;
        return i3;
    }
}
