package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ProtoSyncOpCode3001 extends Message {
    public static final List<ProtoBizSyncInfo> DEFAULT_BIZ_SYNC_INFO = Collections.emptyList();
    public static final String DEFAULT_USER_ID = "";
    public static final int TAG_BIZ_SYNC_INFO = 2;
    public static final int TAG_USER_ID = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<ProtoBizSyncInfo> biz_sync_info;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.STRING)
    public String user_id;

    public ProtoSyncOpCode3001(ProtoSyncOpCode3001 protoSyncOpCode3001) {
        super(protoSyncOpCode3001);
        if (protoSyncOpCode3001 != null) {
            this.user_id = protoSyncOpCode3001.user_id;
            this.biz_sync_info = copyOf(protoSyncOpCode3001.biz_sync_info);
        }
    }

    public ProtoSyncOpCode3001() {
    }

    public final ProtoSyncOpCode3001 fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.user_id = (String) obj;
        } else if (i == 2) {
            this.biz_sync_info = immutableCopyOf((List) obj);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoSyncOpCode3001)) {
            return false;
        }
        ProtoSyncOpCode3001 protoSyncOpCode3001 = (ProtoSyncOpCode3001) obj;
        return equals((Object) this.user_id, (Object) protoSyncOpCode3001.user_id) && equals((List<?>) this.biz_sync_info, (List<?>) protoSyncOpCode3001.biz_sync_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.user_id;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        List<ProtoBizSyncInfo> list = this.biz_sync_info;
        int hashCode2 = hashCode + (list != null ? list.hashCode() : 1);
        this.hashCode = hashCode2;
        return hashCode2;
    }
}
