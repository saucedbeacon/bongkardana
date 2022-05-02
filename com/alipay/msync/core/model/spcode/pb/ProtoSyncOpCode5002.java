package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ProtoSyncOpCode5002 extends Message {
    public static final List<ProtoClientSyncAck> DEFAULT_ACK_MSG = Collections.emptyList();
    public static final Long DEFAULT_SEQ = 0L;
    public static final Integer DEFAULT_SERVER_IP = 0;
    public static final int TAG_ACK_MSG = 2;
    public static final int TAG_SEQ = 1;
    public static final int TAG_SERVER_IP = 3;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<ProtoClientSyncAck> ack_msg;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.INT64)
    public Long seq;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public Integer server_ip;

    public ProtoSyncOpCode5002(ProtoSyncOpCode5002 protoSyncOpCode5002) {
        super(protoSyncOpCode5002);
        if (protoSyncOpCode5002 != null) {
            this.seq = protoSyncOpCode5002.seq;
            this.ack_msg = copyOf(protoSyncOpCode5002.ack_msg);
            this.server_ip = protoSyncOpCode5002.server_ip;
        }
    }

    public ProtoSyncOpCode5002() {
    }

    public final ProtoSyncOpCode5002 fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.seq = (Long) obj;
        } else if (i == 2) {
            this.ack_msg = immutableCopyOf((List) obj);
        } else if (i == 3) {
            this.server_ip = (Integer) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoSyncOpCode5002)) {
            return false;
        }
        ProtoSyncOpCode5002 protoSyncOpCode5002 = (ProtoSyncOpCode5002) obj;
        return equals((Object) this.seq, (Object) protoSyncOpCode5002.seq) && equals((List<?>) this.ack_msg, (List<?>) protoSyncOpCode5002.ack_msg) && equals((Object) this.server_ip, (Object) protoSyncOpCode5002.server_ip);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Long l = this.seq;
        int i2 = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 37;
        List<ProtoClientSyncAck> list = this.ack_msg;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 1)) * 37;
        Integer num = this.server_ip;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }
}
