package com.alipay.bis.common.service.facade.gw.zim;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class ZimValidateGwResponsePB extends Message {
    public static final Boolean DEFAULT_HASNEXT = Boolean.FALSE;
    public static final String DEFAULT_NEXTPROTOCOL = "";
    public static final Integer DEFAULT_PRODUCTRETCODE = 0;
    public static final String DEFAULT_RETCODESUB = "";
    public static final String DEFAULT_RETMESSAGESUB = "";
    public static final Integer DEFAULT_VALIDATIONRETCODE = 0;
    public static final int TAG_EXTPARAMS = 5;
    public static final int TAG_HASNEXT = 3;
    public static final int TAG_NEXTPROTOCOL = 4;
    public static final int TAG_PRODUCTRETCODE = 2;
    public static final int TAG_RETCODESUB = 6;
    public static final int TAG_RETMESSAGESUB = 7;
    public static final int TAG_VALIDATIONRETCODE = 1;
    @ProtoField(tag = 5)
    public MapStringString extParams;
    @ProtoField(tag = 3, type = Message.Datatype.BOOL)
    public Boolean hasNext;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String nextProtocol;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public Integer productRetCode;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String retCodeSub;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String retMessageSub;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer validationRetCode;

    public ZimValidateGwResponsePB(ZimValidateGwResponsePB zimValidateGwResponsePB) {
        super(zimValidateGwResponsePB);
        if (zimValidateGwResponsePB != null) {
            this.validationRetCode = zimValidateGwResponsePB.validationRetCode;
            this.productRetCode = zimValidateGwResponsePB.productRetCode;
            this.hasNext = zimValidateGwResponsePB.hasNext;
            this.nextProtocol = zimValidateGwResponsePB.nextProtocol;
            this.extParams = zimValidateGwResponsePB.extParams;
            this.retCodeSub = zimValidateGwResponsePB.retCodeSub;
            this.retMessageSub = zimValidateGwResponsePB.retMessageSub;
        }
    }

    public ZimValidateGwResponsePB() {
    }

    public final ZimValidateGwResponsePB fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.validationRetCode = (Integer) obj;
                break;
            case 2:
                this.productRetCode = (Integer) obj;
                break;
            case 3:
                this.hasNext = (Boolean) obj;
                break;
            case 4:
                this.nextProtocol = (String) obj;
                break;
            case 5:
                this.extParams = (MapStringString) obj;
                break;
            case 6:
                this.retCodeSub = (String) obj;
                break;
            case 7:
                this.retMessageSub = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZimValidateGwResponsePB)) {
            return false;
        }
        ZimValidateGwResponsePB zimValidateGwResponsePB = (ZimValidateGwResponsePB) obj;
        return equals((Object) this.validationRetCode, (Object) zimValidateGwResponsePB.validationRetCode) && equals((Object) this.productRetCode, (Object) zimValidateGwResponsePB.productRetCode) && equals((Object) this.hasNext, (Object) zimValidateGwResponsePB.hasNext) && equals((Object) this.nextProtocol, (Object) zimValidateGwResponsePB.nextProtocol) && equals((Object) this.extParams, (Object) zimValidateGwResponsePB.extParams) && equals((Object) this.retCodeSub, (Object) zimValidateGwResponsePB.retCodeSub) && equals((Object) this.retMessageSub, (Object) zimValidateGwResponsePB.retMessageSub);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Integer num = this.validationRetCode;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        Integer num2 = this.productRetCode;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool = this.hasNext;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.nextProtocol;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        MapStringString mapStringString = this.extParams;
        int hashCode5 = (hashCode4 + (mapStringString != null ? mapStringString.hashCode() : 0)) * 37;
        String str2 = this.retCodeSub;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.retMessageSub;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = hashCode6 + i2;
        this.hashCode = i3;
        return i3;
    }
}
