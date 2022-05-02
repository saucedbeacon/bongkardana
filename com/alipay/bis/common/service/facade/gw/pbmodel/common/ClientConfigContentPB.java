package com.alipay.bis.common.service.facade.gw.pbmodel.common;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class ClientConfigContentPB extends Message {
    public static final String DEFAULT_ANDROIDCFG = "";
    public static final String DEFAULT_H5CFG = "";
    public static final String DEFAULT_IOSCFG = "";
    public static final Integer DEFAULT_SAMPLEMODE = 0;
    public static final String DEFAULT_TOKEN = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final int TAG_ANDROIDCFG = 5;
    public static final int TAG_H5CFG = 7;
    public static final int TAG_IOSCFG = 6;
    public static final int TAG_SAMPLEMODE = 3;
    public static final int TAG_TOKEN = 1;
    public static final int TAG_TYPE = 2;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String androidcfg;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String h5cfg;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String ioscfg;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public Integer sampleMode;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String token;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public Integer type;

    public ClientConfigContentPB(ClientConfigContentPB clientConfigContentPB) {
        super(clientConfigContentPB);
        if (clientConfigContentPB != null) {
            this.token = clientConfigContentPB.token;
            this.type = clientConfigContentPB.type;
            this.sampleMode = clientConfigContentPB.sampleMode;
            this.androidcfg = clientConfigContentPB.androidcfg;
            this.ioscfg = clientConfigContentPB.ioscfg;
            this.h5cfg = clientConfigContentPB.h5cfg;
        }
    }

    public ClientConfigContentPB() {
    }

    public final ClientConfigContentPB fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.token = (String) obj;
        } else if (i == 2) {
            this.type = (Integer) obj;
        } else if (i == 3) {
            this.sampleMode = (Integer) obj;
        } else if (i == 5) {
            this.androidcfg = (String) obj;
        } else if (i == 6) {
            this.ioscfg = (String) obj;
        } else if (i == 7) {
            this.h5cfg = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientConfigContentPB)) {
            return false;
        }
        ClientConfigContentPB clientConfigContentPB = (ClientConfigContentPB) obj;
        return equals((Object) this.token, (Object) clientConfigContentPB.token) && equals((Object) this.type, (Object) clientConfigContentPB.type) && equals((Object) this.sampleMode, (Object) clientConfigContentPB.sampleMode) && equals((Object) this.androidcfg, (Object) clientConfigContentPB.androidcfg) && equals((Object) this.ioscfg, (Object) clientConfigContentPB.ioscfg) && equals((Object) this.h5cfg, (Object) clientConfigContentPB.h5cfg);
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
        String str2 = this.androidcfg;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.ioscfg;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.h5cfg;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.hashCode = i3;
        return i3;
    }
}
