package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ProtoSyncOpCode1001 extends Message {
    public static final List<ProtoBizSyncInfo> DEFAULT_BIZ_SYNC_INFO = Collections.emptyList();
    public static final Boolean DEFAULT_IS_NEW_DEVICE = Boolean.FALSE;
    public static final int TAG_BIZ_SYNC_INFO = 2;
    public static final int TAG_IS_NEW_DEVICE = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<ProtoBizSyncInfo> biz_sync_info;
    @ProtoField(tag = 1, type = Message.Datatype.BOOL)
    public Boolean is_new_device;

    public ProtoSyncOpCode1001(ProtoSyncOpCode1001 protoSyncOpCode1001) {
        super(protoSyncOpCode1001);
        if (protoSyncOpCode1001 != null) {
            this.is_new_device = protoSyncOpCode1001.is_new_device;
            this.biz_sync_info = copyOf(protoSyncOpCode1001.biz_sync_info);
        }
    }

    public ProtoSyncOpCode1001() {
    }

    public final ProtoSyncOpCode1001 fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.is_new_device = (Boolean) obj;
        } else if (i == 2) {
            this.biz_sync_info = immutableCopyOf((List) obj);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoSyncOpCode1001)) {
            return false;
        }
        ProtoSyncOpCode1001 protoSyncOpCode1001 = (ProtoSyncOpCode1001) obj;
        return equals((Object) this.is_new_device, (Object) protoSyncOpCode1001.is_new_device) && equals((List<?>) this.biz_sync_info, (List<?>) protoSyncOpCode1001.biz_sync_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Boolean bool = this.is_new_device;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 37;
        List<ProtoBizSyncInfo> list = this.biz_sync_info;
        int hashCode2 = hashCode + (list != null ? list.hashCode() : 1);
        this.hashCode = hashCode2;
        return hashCode2;
    }
}
