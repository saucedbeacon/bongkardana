package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ProtoBizSyncData extends Message {
    public static final Integer DEFAULT_BIZ_ORDER = 0;
    public static final String DEFAULT_BIZ_TYPE = "";
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Boolean DEFAULT_MULTI_DEVICE = Boolean.FALSE;
    public static final List<ProtoOplog> DEFAULT_OPLOG = Collections.emptyList();
    public static final Boolean DEFAULT_PERSISTENT_BIZ = Boolean.FALSE;
    public static final Long DEFAULT_SYNC_KEY = 0L;
    public static final int TAG_BIZ_ORDER = 1;
    public static final int TAG_BIZ_TYPE = 5;
    public static final int TAG_HAS_MORE = 2;
    public static final int TAG_MULTI_DEVICE = 6;
    public static final int TAG_OPLOG = 4;
    public static final int TAG_PERSISTENT_BIZ = 7;
    public static final int TAG_SYNC_KEY = 3;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.INT32)
    public Integer biz_order;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String biz_type;
    @ProtoField(label = Message.Label.REQUIRED, tag = 2, type = Message.Datatype.BOOL)
    public Boolean has_more;
    @ProtoField(tag = 6, type = Message.Datatype.BOOL)
    public Boolean multi_device;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public List<ProtoOplog> oplog;
    @ProtoField(tag = 7, type = Message.Datatype.BOOL)
    public Boolean persistent_biz;
    @ProtoField(label = Message.Label.REQUIRED, tag = 3, type = Message.Datatype.INT64)
    public Long sync_key;

    public ProtoBizSyncData(ProtoBizSyncData protoBizSyncData) {
        super(protoBizSyncData);
        if (protoBizSyncData != null) {
            this.biz_order = protoBizSyncData.biz_order;
            this.has_more = protoBizSyncData.has_more;
            this.sync_key = protoBizSyncData.sync_key;
            this.oplog = copyOf(protoBizSyncData.oplog);
            this.biz_type = protoBizSyncData.biz_type;
            this.multi_device = protoBizSyncData.multi_device;
            this.persistent_biz = protoBizSyncData.persistent_biz;
        }
    }

    public ProtoBizSyncData() {
    }

    public final ProtoBizSyncData fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.biz_order = (Integer) obj;
                break;
            case 2:
                this.has_more = (Boolean) obj;
                break;
            case 3:
                this.sync_key = (Long) obj;
                break;
            case 4:
                this.oplog = immutableCopyOf((List) obj);
                break;
            case 5:
                this.biz_type = (String) obj;
                break;
            case 6:
                this.multi_device = (Boolean) obj;
                break;
            case 7:
                this.persistent_biz = (Boolean) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoBizSyncData)) {
            return false;
        }
        ProtoBizSyncData protoBizSyncData = (ProtoBizSyncData) obj;
        return equals((Object) this.biz_order, (Object) protoBizSyncData.biz_order) && equals((Object) this.has_more, (Object) protoBizSyncData.has_more) && equals((Object) this.sync_key, (Object) protoBizSyncData.sync_key) && equals((List<?>) this.oplog, (List<?>) protoBizSyncData.oplog) && equals((Object) this.biz_type, (Object) protoBizSyncData.biz_type) && equals((Object) this.multi_device, (Object) protoBizSyncData.multi_device) && equals((Object) this.persistent_biz, (Object) protoBizSyncData.persistent_biz);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Integer num = this.biz_order;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        Boolean bool = this.has_more;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l = this.sync_key;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 37;
        List<ProtoOplog> list = this.oplog;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 1)) * 37;
        String str = this.biz_type;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool2 = this.multi_device;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.persistent_biz;
        if (bool3 != null) {
            i2 = bool3.hashCode();
        }
        int i3 = hashCode6 + i2;
        this.hashCode = i3;
        return i3;
    }
}
