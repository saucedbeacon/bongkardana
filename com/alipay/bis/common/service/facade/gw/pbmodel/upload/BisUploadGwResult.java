package com.alipay.bis.common.service.facade.gw.pbmodel.upload;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class BisUploadGwResult extends Message {
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_RETCODE = "";
    public static final String DEFAULT_RETMESSAGE = "";
    public static final int TAG_EXTINFO = 3;
    public static final int TAG_RETCODE = 1;
    public static final int TAG_RETMESSAGE = 2;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String extInfo;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.STRING)
    public String retCode;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String retMessage;

    public BisUploadGwResult(BisUploadGwResult bisUploadGwResult) {
        super(bisUploadGwResult);
        if (bisUploadGwResult != null) {
            this.retCode = bisUploadGwResult.retCode;
            this.retMessage = bisUploadGwResult.retMessage;
            this.extInfo = bisUploadGwResult.extInfo;
        }
    }

    public BisUploadGwResult() {
    }

    public final BisUploadGwResult fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.retCode = (String) obj;
        } else if (i == 2) {
            this.retMessage = (String) obj;
        } else if (i == 3) {
            this.extInfo = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BisUploadGwResult)) {
            return false;
        }
        BisUploadGwResult bisUploadGwResult = (BisUploadGwResult) obj;
        return equals((Object) this.retCode, (Object) bisUploadGwResult.retCode) && equals((Object) this.retMessage, (Object) bisUploadGwResult.retMessage) && equals((Object) this.extInfo, (Object) bisUploadGwResult.extInfo);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.retCode;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.retMessage;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.extInfo;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }
}
