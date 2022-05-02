package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ProtoBizError extends Message {
    public static final Integer DEFAULT_BIZ_ORDER = 0;
    public static final String DEFAULT_ERROR = "";
    public static final String DEFAULT_ERROR_CODE = "";
    public static final Long DEFAULT_SYNC_KEY = 0L;
    public static final int TAG_BIZ_ORDER = 1;
    public static final int TAG_ERROR = 3;
    public static final int TAG_ERROR_CODE = 4;
    public static final int TAG_SYNC_KEY = 2;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.INT32)
    public Integer biz_order;
    @ProtoField(label = Message.Label.REQUIRED, tag = 3, type = Message.Datatype.STRING)
    public String error;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String error_code;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public Long sync_key;

    public ProtoBizError(ProtoBizError protoBizError) {
        super(protoBizError);
        if (protoBizError != null) {
            this.biz_order = protoBizError.biz_order;
            this.sync_key = protoBizError.sync_key;
            this.error = protoBizError.error;
            this.error_code = protoBizError.error_code;
        }
    }

    public ProtoBizError() {
    }

    public final ProtoBizError fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.biz_order = (Integer) obj;
        } else if (i == 2) {
            this.sync_key = (Long) obj;
        } else if (i == 3) {
            this.error = (String) obj;
        } else if (i == 4) {
            this.error_code = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoBizError)) {
            return false;
        }
        ProtoBizError protoBizError = (ProtoBizError) obj;
        return equals((Object) this.biz_order, (Object) protoBizError.biz_order) && equals((Object) this.sync_key, (Object) protoBizError.sync_key) && equals((Object) this.error, (Object) protoBizError.error) && equals((Object) this.error_code, (Object) protoBizError.error_code);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Integer num = this.biz_order;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        Long l = this.sync_key;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 37;
        String str = this.error;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.error_code;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }
}
