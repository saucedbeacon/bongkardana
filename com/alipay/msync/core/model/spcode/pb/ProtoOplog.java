package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import o.printConnMonitorLog;

public final class ProtoOplog extends Message {
    public static final printConnMonitorLog DEFAULT_BINARY_PAYLOAD = printConnMonitorLog.EMPTY;
    public static final String DEFAULT_BIZ_ID = "";
    public static final String DEFAULT_EXT = "";
    public static final Long DEFAULT_MCT = 0L;
    public static final Long DEFAULT_MK = 0L;
    public static final String DEFAULT_PAYLOAD = "";
    public static final Integer DEFAULT_ST = 0;
    public static final int TAG_BINARY_PAYLOAD = 6;
    public static final int TAG_BIZ_ID = 4;
    public static final int TAG_EXT = 7;
    public static final int TAG_MCT = 2;
    public static final int TAG_MK = 3;
    public static final int TAG_PAYLOAD = 5;
    public static final int TAG_ST = 1;
    @ProtoField(tag = 6, type = Message.Datatype.BYTES)
    public printConnMonitorLog binary_payload;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String biz_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String ext;
    @ProtoField(label = Message.Label.REQUIRED, tag = 2, type = Message.Datatype.INT64)
    public Long mct;
    @ProtoField(label = Message.Label.REQUIRED, tag = 3, type = Message.Datatype.INT64)
    public Long mk;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String payload;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer st;

    public ProtoOplog(ProtoOplog protoOplog) {
        super(protoOplog);
        if (protoOplog != null) {
            this.st = protoOplog.st;
            this.mct = protoOplog.mct;
            this.mk = protoOplog.mk;
            this.biz_id = protoOplog.biz_id;
            this.payload = protoOplog.payload;
            this.binary_payload = protoOplog.binary_payload;
            this.ext = protoOplog.ext;
        }
    }

    public ProtoOplog() {
    }

    public final ProtoOplog fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.st = (Integer) obj;
                break;
            case 2:
                this.mct = (Long) obj;
                break;
            case 3:
                this.mk = (Long) obj;
                break;
            case 4:
                this.biz_id = (String) obj;
                break;
            case 5:
                this.payload = (String) obj;
                break;
            case 6:
                this.binary_payload = (printConnMonitorLog) obj;
                break;
            case 7:
                this.ext = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoOplog)) {
            return false;
        }
        ProtoOplog protoOplog = (ProtoOplog) obj;
        return equals((Object) this.st, (Object) protoOplog.st) && equals((Object) this.mct, (Object) protoOplog.mct) && equals((Object) this.mk, (Object) protoOplog.mk) && equals((Object) this.biz_id, (Object) protoOplog.biz_id) && equals((Object) this.payload, (Object) protoOplog.payload) && equals((Object) this.binary_payload, (Object) protoOplog.binary_payload) && equals((Object) this.ext, (Object) protoOplog.ext);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Integer num = this.st;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        Long l = this.mct;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.mk;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        String str = this.biz_id;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.payload;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        printConnMonitorLog printconnmonitorlog = this.binary_payload;
        int hashCode6 = (hashCode5 + (printconnmonitorlog != null ? printconnmonitorlog.hashCode() : 0)) * 37;
        String str3 = this.ext;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = hashCode6 + i2;
        this.hashCode = i3;
        return i3;
    }
}
