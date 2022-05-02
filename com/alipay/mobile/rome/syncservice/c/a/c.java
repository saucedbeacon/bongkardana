package com.alipay.mobile.rome.syncservice.c.a;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.a.a;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.alipay.msync.core.model.spcode.pb.ProtoBizSyncInfo;
import com.alipay.msync.core.model.spcode.pb.ProtoSyncOpCode3001;
import com.squareup.wire.Message;
import java.util.LinkedList;
import java.util.List;

public final class c extends a {
    public final byte[] b() {
        byte[] bArr = null;
        try {
            String str = a.a().f9405a;
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(a.a().f())) {
                    ProtoSyncOpCode3001 protoSyncOpCode3001 = new ProtoSyncOpCode3001();
                    protoSyncOpCode3001.user_id = str;
                    List<Integer> list = com.alipay.mobile.rome.syncservice.sync.register.a.a().f;
                    if (list != null && !list.isEmpty()) {
                        LinkedList linkedList = new LinkedList();
                        for (Integer next : list) {
                            ProtoBizSyncInfo protoBizSyncInfo = new ProtoBizSyncInfo();
                            protoBizSyncInfo.biz_order = next;
                            protoBizSyncInfo.sync_key = Long.valueOf(com.alipay.mobile.rome.syncservice.sync.a.a().a(com.alipay.mobile.rome.syncservice.sync.register.a.a().b(next), (String) null));
                            linkedList.add(protoBizSyncInfo);
                        }
                        protoSyncOpCode3001.biz_sync_info = linkedList;
                    }
                    StringBuilder sb = new StringBuilder(64);
                    bArr = f.a((Message) protoSyncOpCode3001, 3001);
                    StringBuilder sb2 = new StringBuilder("sendSync3001 dataLength(");
                    sb2.append(bArr.length);
                    sb2.append(") bizTypeNum:");
                    sb2.append(list == null ? 0 : list.size());
                    sb2.append(" ");
                    sb2.append(sb);
                    com.alipay.mobile.rome.syncsdk.util.c.a("Operation3001", sb2.toString());
                    return bArr;
                }
            }
            com.alipay.mobile.rome.syncsdk.util.c.c("Operation3001", "sendSync3001：[ userId or session isEmpty ]");
            return null;
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("sendSync3001:  [ Exception=");
            sb3.append(e);
            sb3.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.d("Operation3001", sb3.toString());
        }
    }
}
