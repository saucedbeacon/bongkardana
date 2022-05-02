package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ProtoSyncOpCode5001 extends Message {
    public static final List<ProtoClientSyncData> DEFAULT_CLIENT_SYNC_DATA = Collections.emptyList();
    public static final Long DEFAULT_SEQ = 0L;
    public static final int TAG_CLIENT_SYNC_DATA = 2;
    public static final int TAG_SEQ = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<ProtoClientSyncData> client_sync_data;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.INT64)
    public Long seq;

    public ProtoSyncOpCode5001(ProtoSyncOpCode5001 protoSyncOpCode5001) {
        super(protoSyncOpCode5001);
        if (protoSyncOpCode5001 != null) {
            this.seq = protoSyncOpCode5001.seq;
            this.client_sync_data = copyOf(protoSyncOpCode5001.client_sync_data);
        }
    }

    public ProtoSyncOpCode5001() {
    }

    public final ProtoSyncOpCode5001 fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.seq = (Long) obj;
        } else if (i == 2) {
            this.client_sync_data = immutableCopyOf((List) obj);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoSyncOpCode5001)) {
            return false;
        }
        ProtoSyncOpCode5001 protoSyncOpCode5001 = (ProtoSyncOpCode5001) obj;
        return equals((Object) this.seq, (Object) protoSyncOpCode5001.seq) && equals((List<?>) this.client_sync_data, (List<?>) protoSyncOpCode5001.client_sync_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Long l = this.seq;
        int hashCode = (l != null ? l.hashCode() : 0) * 37;
        List<ProtoClientSyncData> list = this.client_sync_data;
        int hashCode2 = hashCode + (list != null ? list.hashCode() : 1);
        this.hashCode = hashCode2;
        return hashCode2;
    }
}
