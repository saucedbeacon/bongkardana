package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import o.printConnMonitorLog;

public final class ProtoClientSyncData extends Message {
    public static final printConnMonitorLog DEFAULT_BINARY_PAYLOAD = printConnMonitorLog.EMPTY;
    public static final String DEFAULT_BIZ_ID = "";
    public static final Integer DEFAULT_BIZ_ORDER = 0;
    public static final String DEFAULT_BIZ_TYPE = "";
    public static final String DEFAULT_CMK = "";
    public static final String DEFAULT_PAYLOAD = "";
    public static final int TAG_BINARY_PAYLOAD = 5;
    public static final int TAG_BIZ_ID = 3;
    public static final int TAG_BIZ_ORDER = 1;
    public static final int TAG_BIZ_TYPE = 6;
    public static final int TAG_CMK = 2;
    public static final int TAG_PAYLOAD = 4;
    @ProtoField(tag = 5, type = Message.Datatype.BYTES)
    public printConnMonitorLog binary_payload;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String biz_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer biz_order;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String biz_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String cmk;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String payload;

    public ProtoClientSyncData(ProtoClientSyncData protoClientSyncData) {
        super(protoClientSyncData);
        if (protoClientSyncData != null) {
            this.biz_order = protoClientSyncData.biz_order;
            this.cmk = protoClientSyncData.cmk;
            this.biz_id = protoClientSyncData.biz_id;
            this.payload = protoClientSyncData.payload;
            this.binary_payload = protoClientSyncData.binary_payload;
            this.biz_type = protoClientSyncData.biz_type;
        }
    }

    public ProtoClientSyncData() {
    }

    public final ProtoClientSyncData fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.biz_order = (Integer) obj;
                break;
            case 2:
                this.cmk = (String) obj;
                break;
            case 3:
                this.biz_id = (String) obj;
                break;
            case 4:
                this.payload = (String) obj;
                break;
            case 5:
                this.binary_payload = (printConnMonitorLog) obj;
                break;
            case 6:
                this.biz_type = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoClientSyncData)) {
            return false;
        }
        ProtoClientSyncData protoClientSyncData = (ProtoClientSyncData) obj;
        return equals((Object) this.biz_order, (Object) protoClientSyncData.biz_order) && equals((Object) this.cmk, (Object) protoClientSyncData.cmk) && equals((Object) this.biz_id, (Object) protoClientSyncData.biz_id) && equals((Object) this.payload, (Object) protoClientSyncData.payload) && equals((Object) this.binary_payload, (Object) protoClientSyncData.binary_payload) && equals((Object) this.biz_type, (Object) protoClientSyncData.biz_type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Integer num = this.biz_order;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        String str = this.cmk;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.biz_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.payload;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        printConnMonitorLog printconnmonitorlog = this.binary_payload;
        int hashCode5 = (hashCode4 + (printconnmonitorlog != null ? printconnmonitorlog.hashCode() : 0)) * 37;
        String str4 = this.biz_type;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.hashCode = i3;
        return i3;
    }
}
