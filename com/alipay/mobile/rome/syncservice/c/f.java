package com.alipay.mobile.rome.syncservice.c;

import com.alipay.mobile.rome.syncservice.model.c;
import com.alipay.mobile.rome.syncservice.sync.d.a;
import com.alipay.mobile.rome.syncservice.sync.register.Biz;
import com.alipay.mobile.security.bio.service.local.rpc.IRpcException;
import com.alipay.msync.core.model.spcode.pb.ProtoSyncOpCode8001;
import com.squareup.wire.Message;
import java.util.Iterator;
import java.util.List;

public final class f extends b<ProtoSyncOpCode8001> {
    /* access modifiers changed from: protected */
    public final long a(a aVar) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final Message a(List<c> list, Boolean bool, Integer num, String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(com.alipay.mobile.rome.syncservice.model.a aVar) {
    }

    /* access modifiers changed from: protected */
    public final void a(a aVar, long j) {
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ com.alipay.mobile.rome.syncservice.model.a b(Object obj) {
        String str;
        ProtoSyncOpCode8001 protoSyncOpCode8001 = (ProtoSyncOpCode8001) obj;
        if (protoSyncOpCode8001 == null) {
            return null;
        }
        com.alipay.mobile.rome.syncservice.model.a aVar = new com.alipay.mobile.rome.syncservice.model.a();
        aVar.d = "8001";
        List<Integer> list = protoSyncOpCode8001.biz_order;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                Biz a2 = next != null ? com.alipay.mobile.rome.syncservice.sync.register.a.a().a(next) : null;
                if (a2 == null) {
                    String str2 = this.f9468a;
                    StringBuilder sb = new StringBuilder("handleDownstreamDataPacket local doesn't exist this biz[");
                    sb.append(next);
                    sb.append("]");
                    com.alipay.mobile.rome.syncsdk.util.c.a(str2, sb.toString());
                    return null;
                }
                if (a2.f == Biz.BizDimeEnum.USER) {
                    str = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
                } else {
                    str = a2.f == Biz.BizDimeEnum.DEVICE ? com.alipay.mobile.rome.syncsdk.a.a.a().e() : "";
                }
                String str3 = a2.f9498a;
                int a3 = com.alipay.mobile.rome.syncservice.sync.b.a.a.a(com.alipay.mobile.rome.syncservice.d.a.f9473a).c.a(str, str3);
                String str4 = this.f9468a;
                StringBuilder sb2 = new StringBuilder("deleteData[ ");
                sb2.append(str3);
                sb2.append(" / ");
                sb2.append(str);
                sb2.append(" ] count:");
                sb2.append(a3);
                com.alipay.mobile.rome.syncsdk.util.c.a(str4, sb2.toString());
                String str5 = a2.f9498a;
                com.alipay.mobile.rome.syncservice.sync.a a4 = com.alipay.mobile.rome.syncservice.sync.a.a();
                Biz.BizDimeEnum b = com.alipay.mobile.rome.syncservice.sync.register.a.a().b(str5);
                if (b == Biz.BizDimeEnum.DEVICE) {
                    a4.b("deviceId_".concat(String.valueOf(str5)));
                } else if (b == Biz.BizDimeEnum.USER) {
                    StringBuilder sb3 = new StringBuilder("sync_");
                    sb3.append(str);
                    sb3.append("_");
                    sb3.append(str5);
                    a4.b(sb3.toString());
                }
                String str6 = a2.f9498a;
                com.alipay.mobile.rome.syncservice.sync.register.a a5 = com.alipay.mobile.rome.syncservice.sync.register.a.a();
                a5.j.f9500a.edit().remove(str6).commit();
                StringBuilder sb4 = new StringBuilder("deleteBizConfigInfo:");
                sb4.append(str6);
                sb4.append(" successful");
                com.alipay.mobile.rome.syncsdk.util.c.b("DynamicBizConfigStorage", sb4.toString());
                a5.b.remove(str6);
                a5.c.remove(next);
                a5.d.remove(str6);
                a5.e.remove(str6);
                a5.f.remove(next);
                a5.g.remove(next);
                a5.h.remove(next);
                a5.i.remove(next);
            }
        }
        return aVar;
    }

    public f() {
        this.b = IRpcException.ErrorCode.RESPONSE_DATA_NOT_MODIFIED;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public ProtoSyncOpCode8001 a(byte[] bArr) {
        try {
            ProtoSyncOpCode8001 protoSyncOpCode8001 = (ProtoSyncOpCode8001) com.alipay.mobile.rome.syncsdk.util.f.a(bArr, ProtoSyncOpCode8001.class);
            if (protoSyncOpCode8001 == null) {
                return null;
            }
            return protoSyncOpCode8001;
        } catch (Exception e) {
            String str = this.f9468a;
            StringBuilder sb = new StringBuilder("parsePBData: [ Exception=");
            sb.append(e);
            sb.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.d(str, sb.toString());
            return null;
        }
    }
}
