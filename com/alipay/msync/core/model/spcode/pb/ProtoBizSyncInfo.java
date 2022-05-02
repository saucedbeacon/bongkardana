package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ProtoBizSyncInfo extends Message {
    public static final Integer DEFAULT_BIZ_ORDER = 0;
    public static final String DEFAULT_BIZ_TYPE = "";
    public static final Long DEFAULT_SYNC_KEY = 0L;
    public static final int TAG_BIZ_ORDER = 1;
    public static final int TAG_BIZ_TYPE = 3;
    public static final int TAG_SYNC_KEY = 2;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.INT32)
    public Integer biz_order;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String biz_type;
    @ProtoField(label = Message.Label.REQUIRED, tag = 2, type = Message.Datatype.INT64)
    public Long sync_key;

    public ProtoBizSyncInfo(ProtoBizSyncInfo protoBizSyncInfo) {
        super(protoBizSyncInfo);
        if (protoBizSyncInfo != null) {
            this.biz_order = protoBizSyncInfo.biz_order;
            this.sync_key = protoBizSyncInfo.sync_key;
            this.biz_type = protoBizSyncInfo.biz_type;
        }
    }

    public ProtoBizSyncInfo() {
    }

    public final ProtoBizSyncInfo fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.biz_order = (Integer) obj;
        } else if (i == 2) {
            this.sync_key = (Long) obj;
        } else if (i == 3) {
            this.biz_type = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoBizSyncInfo)) {
            return false;
        }
        ProtoBizSyncInfo protoBizSyncInfo = (ProtoBizSyncInfo) obj;
        return equals((Object) this.biz_order, (Object) protoBizSyncInfo.biz_order) && equals((Object) this.sync_key, (Object) protoBizSyncInfo.sync_key) && equals((Object) this.biz_type, (Object) protoBizSyncInfo.biz_type);
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
        String str = this.biz_type;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }
}
