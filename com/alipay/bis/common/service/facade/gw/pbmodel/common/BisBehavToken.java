package com.alipay.bis.common.service.facade.gw.pbmodel.common;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class BisBehavToken extends Message {
    public static final String DEFAULT_APDID = "";
    public static final String DEFAULT_APPID = "";
    public static final String DEFAULT_BEHID = "";
    public static final String DEFAULT_BIZID = "";
    public static final Integer DEFAULT_SAMPLEMODE = 0;
    public static final String DEFAULT_TOKEN = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final String DEFAULT_UID = "";
    public static final String DEFAULT_VERIFYID = "";
    public static final String DEFAULT_VTOKEN = "";
    public static final int TAG_APDID = 6;
    public static final int TAG_APPID = 7;
    public static final int TAG_BEHID = 8;
    public static final int TAG_BIZID = 9;
    public static final int TAG_SAMPLEMODE = 3;
    public static final int TAG_TOKEN = 1;
    public static final int TAG_TYPE = 2;
    public static final int TAG_UID = 5;
    public static final int TAG_VERIFYID = 10;
    public static final int TAG_VTOKEN = 11;
    @ProtoField(label = Message.Label.REQUIRED, tag = 6, type = Message.Datatype.STRING)
    public String apdid;
    @ProtoField(label = Message.Label.REQUIRED, tag = 7, type = Message.Datatype.STRING)
    public String appid;
    @ProtoField(label = Message.Label.REQUIRED, tag = 8, type = Message.Datatype.STRING)
    public String behid;
    @ProtoField(label = Message.Label.REQUIRED, tag = 9, type = Message.Datatype.STRING)
    public String bizid;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public Integer sampleMode;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.STRING)
    public String token;
    @ProtoField(label = Message.Label.REQUIRED, tag = 2, type = Message.Datatype.INT32)
    public Integer type;
    @ProtoField(label = Message.Label.REQUIRED, tag = 5, type = Message.Datatype.STRING)
    public String uid;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public String verifyid;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public String vtoken;

    public BisBehavToken(BisBehavToken bisBehavToken) {
        super(bisBehavToken);
        if (bisBehavToken != null) {
            this.token = bisBehavToken.token;
            this.type = bisBehavToken.type;
            this.sampleMode = bisBehavToken.sampleMode;
            this.uid = bisBehavToken.uid;
            this.apdid = bisBehavToken.apdid;
            this.appid = bisBehavToken.appid;
            this.behid = bisBehavToken.behid;
            this.bizid = bisBehavToken.bizid;
            this.verifyid = bisBehavToken.verifyid;
            this.vtoken = bisBehavToken.vtoken;
        }
    }

    public BisBehavToken() {
    }

    public final BisBehavToken fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.token = (String) obj;
                break;
            case 2:
                this.type = (Integer) obj;
                break;
            case 3:
                this.sampleMode = (Integer) obj;
                break;
            case 5:
                this.uid = (String) obj;
                break;
            case 6:
                this.apdid = (String) obj;
                break;
            case 7:
                this.appid = (String) obj;
                break;
            case 8:
                this.behid = (String) obj;
                break;
            case 9:
                this.bizid = (String) obj;
                break;
            case 10:
                this.verifyid = (String) obj;
                break;
            case 11:
                this.vtoken = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BisBehavToken)) {
            return false;
        }
        BisBehavToken bisBehavToken = (BisBehavToken) obj;
        return equals((Object) this.token, (Object) bisBehavToken.token) && equals((Object) this.type, (Object) bisBehavToken.type) && equals((Object) this.sampleMode, (Object) bisBehavToken.sampleMode) && equals((Object) this.uid, (Object) bisBehavToken.uid) && equals((Object) this.apdid, (Object) bisBehavToken.apdid) && equals((Object) this.appid, (Object) bisBehavToken.appid) && equals((Object) this.behid, (Object) bisBehavToken.behid) && equals((Object) this.bizid, (Object) bisBehavToken.bizid) && equals((Object) this.verifyid, (Object) bisBehavToken.verifyid) && equals((Object) this.vtoken, (Object) bisBehavToken.vtoken);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.token;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.sampleMode;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str2 = this.uid;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.apdid;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.appid;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.behid;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.bizid;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.verifyid;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.vtoken;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        int i3 = hashCode9 + i2;
        this.hashCode = i3;
        return i3;
    }
}
