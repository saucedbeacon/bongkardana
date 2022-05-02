package com.alipay.mobile.rome.syncservice.c;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.alipay.mobile.rome.syncservice.sync.register.a;
import com.alipay.msync.core.model.spcode.pb.ProtoBizSyncData;
import com.alipay.msync.core.model.spcode.pb.ProtoBizSyncInfo;
import com.alipay.msync.core.model.spcode.pb.ProtoSyncOpCode2001;
import com.alipay.msync.core.model.spcode.pb.ProtoSyncOpCode2002;
import com.squareup.wire.Message;
import java.util.LinkedList;
import java.util.List;

public final class d extends b<ProtoSyncOpCode2001> {
    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 2002;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        ProtoSyncOpCode2001 protoSyncOpCode2001 = (ProtoSyncOpCode2001) obj;
        if (protoSyncOpCode2001 != null && protoSyncOpCode2001.biz_sync_data != null) {
            for (ProtoBizSyncData next : protoSyncOpCode2001.biz_sync_data) {
                if (next != null) {
                    a.a().a(next.biz_order, next.biz_type, next.multi_device, protoSyncOpCode2001.principal_id_type, next.persistent_biz);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ com.alipay.mobile.rome.syncservice.model.a b(Object obj) {
        int i;
        ProtoSyncOpCode2001 protoSyncOpCode2001 = (ProtoSyncOpCode2001) obj;
        if (protoSyncOpCode2001 == null || !a(protoSyncOpCode2001.principal_id, protoSyncOpCode2001.not_check_principal, protoSyncOpCode2001.biz_sync_data)) {
            return null;
        }
        com.alipay.mobile.rome.syncservice.model.a aVar = new com.alipay.mobile.rome.syncservice.model.a();
        aVar.c = protoSyncOpCode2001.has_more_data;
        aVar.g = protoSyncOpCode2001.principal_id;
        aVar.h = protoSyncOpCode2001.principal_id_type;
        List<com.alipay.mobile.rome.syncservice.sync.d.a> a2 = a(protoSyncOpCode2001.biz_sync_data, protoSyncOpCode2001.principal_id, protoSyncOpCode2001.not_check_principal);
        if (protoSyncOpCode2001.biz_sync_data == null) {
            i = 0;
        } else {
            i = protoSyncOpCode2001.biz_sync_data.size();
        }
        aVar.f9478a = a(a2, i);
        aVar.b = protoSyncOpCode2001.server_ip;
        return aVar;
    }

    public d() {
        this.b = 2001;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public ProtoSyncOpCode2001 a(byte[] bArr) {
        try {
            ProtoSyncOpCode2001 protoSyncOpCode2001 = (ProtoSyncOpCode2001) f.a(bArr, ProtoSyncOpCode2001.class);
            if (protoSyncOpCode2001 != null) {
                return protoSyncOpCode2001;
            }
            a("pbError", "UNKNOWN", (String) null, "3005");
            return null;
        } catch (Exception e) {
            String str = this.f9468a;
            StringBuilder sb = new StringBuilder("parsePBData: [ Exception=");
            sb.append(e);
            sb.append(" ]");
            c.d(str, sb.toString());
            a("pbError", "UNKNOWN", (String) null, "3005");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(com.alipay.mobile.rome.syncservice.model.a aVar) {
        if (aVar != null) {
            List<com.alipay.mobile.rome.syncservice.model.c> list = aVar.f9478a;
            if (list == null || list.isEmpty()) {
                c.d(this.f9468a, "dispatchBizData bizDataList is null.");
                return;
            }
            List<com.alipay.mobile.rome.syncservice.sync.d.a> list2 = list.get(0).f9480a;
            if (list2 != null) {
                for (com.alipay.mobile.rome.syncservice.sync.d.a next : list2) {
                    if (next != null && next.l) {
                        com.alipay.mobile.rome.syncservice.sync.e.a.b(next);
                        com.alipay.mobile.rome.syncservice.sync.e.a.c(next);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Message a(List<com.alipay.mobile.rome.syncservice.model.c> list, Boolean bool, Integer num, String str) {
        ProtoSyncOpCode2002 protoSyncOpCode2002 = null;
        if (list != null && !list.isEmpty()) {
            com.alipay.mobile.rome.syncservice.model.c cVar = list.get(0);
            if (cVar.f9480a != null && !cVar.f9480a.isEmpty()) {
                protoSyncOpCode2002 = new ProtoSyncOpCode2002();
                LinkedList linkedList = new LinkedList();
                List<com.alipay.mobile.rome.syncservice.sync.d.a> list2 = cVar.f9480a;
                if (list2 != null && list2.size() > 0) {
                    for (com.alipay.mobile.rome.syncservice.sync.d.a next : list2) {
                        long a2 = com.alipay.mobile.rome.syncservice.sync.a.a().a(next.c, next.b);
                        if (Long.parseLong(next.d) < a2) {
                            next.d = String.valueOf(a2);
                        }
                        ProtoBizSyncInfo protoBizSyncInfo = new ProtoBizSyncInfo();
                        protoBizSyncInfo.biz_order = a.a().a(next.c);
                        protoBizSyncInfo.sync_key = Long.valueOf(Long.parseLong(next.d));
                        linkedList.add(protoBizSyncInfo);
                    }
                    protoSyncOpCode2002.biz_sync_info = linkedList;
                }
                protoSyncOpCode2002.has_more_data = bool;
                protoSyncOpCode2002.principal_id = str;
                protoSyncOpCode2002.principal_id_type = num;
            }
        }
        return protoSyncOpCode2002;
    }

    /* access modifiers changed from: protected */
    public final long a(com.alipay.mobile.rome.syncservice.sync.d.a aVar) {
        if (aVar == null) {
            return -16;
        }
        return com.alipay.mobile.rome.syncservice.sync.a.a().a(aVar.c, aVar.b);
    }

    /* access modifiers changed from: protected */
    public final void a(com.alipay.mobile.rome.syncservice.sync.d.a aVar, long j) {
        if (aVar == null || Long.parseLong(aVar.d) <= j) {
            return;
        }
        if (!TextUtils.isEmpty(aVar.f)) {
            aVar.l = true;
        } else if (TextUtils.isEmpty(aVar.f)) {
            com.alipay.mobile.rome.syncservice.sync.a.a().a(aVar.c, Long.parseLong(aVar.d), aVar.b);
        }
    }
}
