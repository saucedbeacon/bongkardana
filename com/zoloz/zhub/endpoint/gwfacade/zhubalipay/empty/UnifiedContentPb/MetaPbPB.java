package com.zoloz.zhub.endpoint.gwfacade.zhubalipay.empty.UnifiedContentPb;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class MetaPbPB extends Message {
    public static final String DEFAULT_BISTOKEN = "";
    public static final String DEFAULT_COLLECTINFOSTR = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_INVTPTYPE = "";
    public static final String DEFAULT_SCORESTR = "";
    public static final Integer DEFAULT_SERIALIZE = 0;
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_VERSION = "";
    public static final int TAG_BISTOKEN = 6;
    public static final int TAG_COLLECTINFOSTR = 4;
    public static final int TAG_EXTINFO = 8;
    public static final int TAG_INVTPTYPE = 7;
    public static final int TAG_SCORESTR = 3;
    public static final int TAG_SERIALIZE = 5;
    public static final int TAG_TYPE = 2;
    public static final int TAG_VERSION = 1;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String bistoken;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String collectInfoStr;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String extInfo;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String invtpType;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String scoreStr;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public Integer serialize;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String version;

    public MetaPbPB(MetaPbPB metaPbPB) {
        super(metaPbPB);
        if (metaPbPB != null) {
            this.version = metaPbPB.version;
            this.type = metaPbPB.type;
            this.scoreStr = metaPbPB.scoreStr;
            this.collectInfoStr = metaPbPB.collectInfoStr;
            this.serialize = metaPbPB.serialize;
            this.bistoken = metaPbPB.bistoken;
            this.invtpType = metaPbPB.invtpType;
            this.extInfo = metaPbPB.extInfo;
        }
    }

    public MetaPbPB() {
    }

    public final MetaPbPB fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.version = (String) obj;
                break;
            case 2:
                this.type = (String) obj;
                break;
            case 3:
                this.scoreStr = (String) obj;
                break;
            case 4:
                this.collectInfoStr = (String) obj;
                break;
            case 5:
                this.serialize = (Integer) obj;
                break;
            case 6:
                this.bistoken = (String) obj;
                break;
            case 7:
                this.invtpType = (String) obj;
                break;
            case 8:
                this.extInfo = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetaPbPB)) {
            return false;
        }
        MetaPbPB metaPbPB = (MetaPbPB) obj;
        return equals((Object) this.version, (Object) metaPbPB.version) && equals((Object) this.type, (Object) metaPbPB.type) && equals((Object) this.scoreStr, (Object) metaPbPB.scoreStr) && equals((Object) this.collectInfoStr, (Object) metaPbPB.collectInfoStr) && equals((Object) this.serialize, (Object) metaPbPB.serialize) && equals((Object) this.bistoken, (Object) metaPbPB.bistoken) && equals((Object) this.invtpType, (Object) metaPbPB.invtpType) && equals((Object) this.extInfo, (Object) metaPbPB.extInfo);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.version;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.scoreStr;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.collectInfoStr;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Integer num = this.serialize;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        String str5 = this.bistoken;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.invtpType;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.extInfo;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        int i3 = hashCode7 + i2;
        this.hashCode = i3;
        return i3;
    }
}
