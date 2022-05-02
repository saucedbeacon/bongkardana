package com.alipay.mobile.rome.syncservice.c;

import android.os.Message;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.alipay.mobile.rome.syncservice.model.DownstreamDataRequest;
import com.alipay.mobile.rome.syncservice.model.a;
import com.alipay.mobile.rome.syncservice.sync.d.b;
import com.alipay.msync.core.model.spcode.pb.ProtoClientSyncAck;
import com.alipay.msync.core.model.spcode.pb.ProtoSyncOpCode5002;
import java.util.ArrayList;
import java.util.List;

public final class e extends a<ProtoSyncOpCode5002> {
    /* access modifiers changed from: protected */
    public final void a(a aVar, DownstreamDataRequest.DataSource dataSource) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        ProtoSyncOpCode5002 protoSyncOpCode5002 = (ProtoSyncOpCode5002) obj;
        if (protoSyncOpCode5002 != null && protoSyncOpCode5002.ack_msg != null) {
            for (ProtoClientSyncAck next : protoSyncOpCode5002.ack_msg) {
                if (next != null) {
                    com.alipay.mobile.rome.syncservice.sync.register.a.a().a(next.biz_order, next.biz_type);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ a b(Object obj) {
        ProtoSyncOpCode5002 protoSyncOpCode5002 = (ProtoSyncOpCode5002) obj;
        if (protoSyncOpCode5002 == null) {
            return null;
        }
        List<ProtoClientSyncAck> list = protoSyncOpCode5002.ack_msg;
        if (list == null || list.isEmpty()) {
            c.d(this.f9468a, "handleSyncUplinkAckMsg: ackMsgList is null or size 0 ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("handleSyncUplinkAckMsg 5002 size=");
        sb.append(list.size());
        StringBuffer stringBuffer = new StringBuffer(sb.toString());
        for (ProtoClientSyncAck next : list) {
            b bVar = new b();
            bVar.biz = com.alipay.mobile.rome.syncservice.sync.register.a.a().b(next.biz_order);
            bVar.b = next.cmk;
            String[] split = bVar.b.split("_");
            bVar.e = com.alipay.mobile.rome.syncservice.d.b.a(split[0]);
            bVar.d = Integer.parseInt(split[1]);
            bVar.f9495a = Long.parseLong(split[2]);
            StringBuilder sb2 = new StringBuilder(" [");
            sb2.append(bVar.biz);
            sb2.append("(");
            sb2.append(bVar.b);
            sb2.append(")]");
            stringBuffer.append(sb2.toString());
            arrayList.add(bVar);
        }
        c.b(this.f9468a, stringBuffer.toString());
        a aVar = new a();
        aVar.e = protoSyncOpCode5002.seq.intValue();
        aVar.f = arrayList;
        return aVar;
    }

    public e() {
        this.b = 5002;
    }

    /* access modifiers changed from: protected */
    public final void a(a aVar) {
        if (aVar != null) {
            com.alipay.mobile.rome.syncservice.up.b a2 = com.alipay.mobile.rome.syncservice.up.b.a();
            int i = aVar.e;
            List<b> list = aVar.f;
            if (list == null || list.isEmpty()) {
                c.a(com.alipay.mobile.rome.syncservice.up.b.f9503a, "recvSyncUplinkAck uplinkMsgItemList is null or size 0");
                return;
            }
            Message obtainMessage = a2.b.obtainMessage(3, list);
            obtainMessage.arg1 = i;
            a2.b.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return (ProtoSyncOpCode5002) f.a(bArr, ProtoSyncOpCode5002.class);
    }
}
