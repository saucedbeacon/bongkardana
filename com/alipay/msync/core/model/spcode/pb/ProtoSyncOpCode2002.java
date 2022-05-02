package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ProtoSyncOpCode2002 extends Message {
    public static final List<ProtoBizSyncInfo> DEFAULT_BIZ_SYNC_INFO = Collections.emptyList();
    public static final Boolean DEFAULT_HAS_MORE_DATA = Boolean.FALSE;
    public static final String DEFAULT_PRINCIPAL_ID = "";
    public static final Integer DEFAULT_PRINCIPAL_ID_TYPE = 0;
    public static final int TAG_BIZ_SYNC_INFO = 1;
    public static final int TAG_HAS_MORE_DATA = 2;
    public static final int TAG_PRINCIPAL_ID = 4;
    public static final int TAG_PRINCIPAL_ID_TYPE = 3;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public List<ProtoBizSyncInfo> biz_sync_info;
    @ProtoField(tag = 2, type = Message.Datatype.BOOL)
    public Boolean has_more_data;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String principal_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public Integer principal_id_type;

    public ProtoSyncOpCode2002(ProtoSyncOpCode2002 protoSyncOpCode2002) {
        super(protoSyncOpCode2002);
        if (protoSyncOpCode2002 != null) {
            this.biz_sync_info = copyOf(protoSyncOpCode2002.biz_sync_info);
            this.has_more_data = protoSyncOpCode2002.has_more_data;
            this.principal_id_type = protoSyncOpCode2002.principal_id_type;
            this.principal_id = protoSyncOpCode2002.principal_id;
        }
    }

    public ProtoSyncOpCode2002() {
    }

    public final ProtoSyncOpCode2002 fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.biz_sync_info = immutableCopyOf((List) obj);
        } else if (i == 2) {
            this.has_more_data = (Boolean) obj;
        } else if (i == 3) {
            this.principal_id_type = (Integer) obj;
        } else if (i == 4) {
            this.principal_id = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoSyncOpCode2002)) {
            return false;
        }
        ProtoSyncOpCode2002 protoSyncOpCode2002 = (ProtoSyncOpCode2002) obj;
        return equals((List<?>) this.biz_sync_info, (List<?>) protoSyncOpCode2002.biz_sync_info) && equals((Object) this.has_more_data, (Object) protoSyncOpCode2002.has_more_data) && equals((Object) this.principal_id_type, (Object) protoSyncOpCode2002.principal_id_type) && equals((Object) this.principal_id, (Object) protoSyncOpCode2002.principal_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        List<ProtoBizSyncInfo> list = this.biz_sync_info;
        int hashCode = (list != null ? list.hashCode() : 1) * 37;
        Boolean bool = this.has_more_data;
        int i2 = 0;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Integer num = this.principal_id_type;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.principal_id;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }
}
