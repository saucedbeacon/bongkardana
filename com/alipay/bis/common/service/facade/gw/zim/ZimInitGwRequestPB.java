package com.alipay.bis.common.service.facade.gw.zim;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class ZimInitGwRequestPB extends Message {
    public static final String DEFAULT_BIZDATA = "";
    public static final String DEFAULT_CHANNEL = "";
    public static final String DEFAULT_MERCHANT = "";
    public static final String DEFAULT_METAINFO = "";
    public static final String DEFAULT_PRODUCENODE = "";
    public static final String DEFAULT_PRODUCTNAME = "";
    public static final String DEFAULT_ZIMID = "";
    public static final int TAG_BIZDATA = 6;
    public static final int TAG_CHANNEL = 2;
    public static final int TAG_MERCHANT = 3;
    public static final int TAG_METAINFO = 7;
    public static final int TAG_PRODUCENODE = 5;
    public static final int TAG_PRODUCTNAME = 4;
    public static final int TAG_ZIMID = 1;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String bizData;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String channel;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String merchant;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String metaInfo;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String produceNode;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String productName;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String zimId;

    public ZimInitGwRequestPB(ZimInitGwRequestPB zimInitGwRequestPB) {
        super(zimInitGwRequestPB);
        if (zimInitGwRequestPB != null) {
            this.zimId = zimInitGwRequestPB.zimId;
            this.channel = zimInitGwRequestPB.channel;
            this.merchant = zimInitGwRequestPB.merchant;
            this.productName = zimInitGwRequestPB.productName;
            this.produceNode = zimInitGwRequestPB.produceNode;
            this.bizData = zimInitGwRequestPB.bizData;
            this.metaInfo = zimInitGwRequestPB.metaInfo;
        }
    }

    public ZimInitGwRequestPB() {
    }

    public final ZimInitGwRequestPB fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.zimId = (String) obj;
                break;
            case 2:
                this.channel = (String) obj;
                break;
            case 3:
                this.merchant = (String) obj;
                break;
            case 4:
                this.productName = (String) obj;
                break;
            case 5:
                this.produceNode = (String) obj;
                break;
            case 6:
                this.bizData = (String) obj;
                break;
            case 7:
                this.metaInfo = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZimInitGwRequestPB)) {
            return false;
        }
        ZimInitGwRequestPB zimInitGwRequestPB = (ZimInitGwRequestPB) obj;
        return equals((Object) this.zimId, (Object) zimInitGwRequestPB.zimId) && equals((Object) this.channel, (Object) zimInitGwRequestPB.channel) && equals((Object) this.merchant, (Object) zimInitGwRequestPB.merchant) && equals((Object) this.productName, (Object) zimInitGwRequestPB.productName) && equals((Object) this.produceNode, (Object) zimInitGwRequestPB.produceNode) && equals((Object) this.bizData, (Object) zimInitGwRequestPB.bizData) && equals((Object) this.metaInfo, (Object) zimInitGwRequestPB.metaInfo);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.zimId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.channel;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.merchant;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.productName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.produceNode;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.bizData;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.metaInfo;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        int i3 = hashCode6 + i2;
        this.hashCode = i3;
        return i3;
    }
}
