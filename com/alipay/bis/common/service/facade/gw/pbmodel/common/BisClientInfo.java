package com.alipay.bis.common.service.facade.gw.pbmodel.common;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class BisClientInfo extends Message {
    public static final String DEFAULT_CLIENTVER = "";
    public static final String DEFAULT_MODEL = "";
    public static final String DEFAULT_OS = "";
    public static final String DEFAULT_OSVER = "";
    public static final int TAG_CLIENTVER = 4;
    public static final int TAG_MODEL = 1;
    public static final int TAG_OS = 2;
    public static final int TAG_OSVER = 3;
    @ProtoField(label = Message.Label.REQUIRED, tag = 4, type = Message.Datatype.STRING)
    public String clientVer;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.STRING)
    public String model;
    @ProtoField(label = Message.Label.REQUIRED, tag = 2, type = Message.Datatype.STRING)
    public String os;
    @ProtoField(label = Message.Label.REQUIRED, tag = 3, type = Message.Datatype.STRING)
    public String osVer;

    public BisClientInfo(BisClientInfo bisClientInfo) {
        super(bisClientInfo);
        if (bisClientInfo != null) {
            this.model = bisClientInfo.model;
            this.os = bisClientInfo.os;
            this.osVer = bisClientInfo.osVer;
            this.clientVer = bisClientInfo.clientVer;
        }
    }

    public BisClientInfo() {
    }

    public final BisClientInfo fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.model = (String) obj;
        } else if (i == 2) {
            this.os = (String) obj;
        } else if (i == 3) {
            this.osVer = (String) obj;
        } else if (i == 4) {
            this.clientVer = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BisClientInfo)) {
            return false;
        }
        BisClientInfo bisClientInfo = (BisClientInfo) obj;
        return equals((Object) this.model, (Object) bisClientInfo.model) && equals((Object) this.os, (Object) bisClientInfo.os) && equals((Object) this.osVer, (Object) bisClientInfo.osVer) && equals((Object) this.clientVer, (Object) bisClientInfo.clientVer);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.model;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.os;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.osVer;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.clientVer;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }
}
