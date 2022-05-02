package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ProtoSyncOpCode8001 extends Message {
    public static final List<Integer> DEFAULT_BIZ_ORDER = Collections.emptyList();
    public static final int TAG_BIZ_ORDER = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.INT32)
    public List<Integer> biz_order;

    public ProtoSyncOpCode8001(ProtoSyncOpCode8001 protoSyncOpCode8001) {
        super(protoSyncOpCode8001);
        if (protoSyncOpCode8001 != null) {
            this.biz_order = copyOf(protoSyncOpCode8001.biz_order);
        }
    }

    public ProtoSyncOpCode8001() {
    }

    public final ProtoSyncOpCode8001 fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.biz_order = immutableCopyOf((List) obj);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoSyncOpCode8001)) {
            return false;
        }
        return equals((List<?>) this.biz_order, (List<?>) ((ProtoSyncOpCode8001) obj).biz_order);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        List<Integer> list = this.biz_order;
        int hashCode = list != null ? list.hashCode() : 1;
        this.hashCode = hashCode;
        return hashCode;
    }
}
