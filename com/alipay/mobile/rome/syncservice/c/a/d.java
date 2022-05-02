package com.alipay.mobile.rome.syncservice.c.a;

import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.alipay.msync.core.model.spcode.pb.ProtoSyncOpCode3002;
import com.squareup.wire.Message;

public final class d extends a {
    public final byte[] b() {
        c.b("Operation3002", "sendSync3002");
        try {
            return f.a((Message) new ProtoSyncOpCode3002(), 3002);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("sendSync3002:  [ Exception=");
            sb.append(e);
            sb.append(" ]");
            c.d("Operation3002", sb.toString());
            return null;
        }
    }
}
