package com.alipay.mobile.rome.syncservice.c.a;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.alipay.mobile.rome.syncservice.sync.a;
import com.alipay.msync.core.model.spcode.pb.ProtoBizError;
import com.alipay.msync.core.model.spcode.pb.ProtoSyncOpCode4001;
import com.squareup.wire.Message;
import java.util.ArrayList;

public final class e extends a {
    /* access modifiers changed from: protected */
    public final byte[] b() {
        return new byte[0];
    }

    public static byte[] a(String str, String str2, String str3, String str4, long j) {
        try {
            Integer a2 = a(str2);
            ProtoSyncOpCode4001 protoSyncOpCode4001 = new ProtoSyncOpCode4001();
            if (j == -1 && a2.intValue() != -1 && !TextUtils.isEmpty(str2)) {
                j = a.a().a(str2, str3);
            }
            ArrayList arrayList = new ArrayList();
            ProtoBizError protoBizError = new ProtoBizError();
            protoBizError.biz_order = a2;
            protoBizError.sync_key = Long.valueOf(j);
            protoBizError.error = str;
            protoBizError.error_code = str4;
            arrayList.add(protoBizError);
            protoSyncOpCode4001.biz_error = arrayList;
            protoSyncOpCode4001.principal_id = str3;
            return f.a((Message) protoSyncOpCode4001, 4001);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("send4001 Exception[");
            sb.append(e);
            sb.append("]");
            c.d("Operation4001", sb.toString());
            return null;
        }
    }

    private static Integer a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            Integer a2 = com.alipay.mobile.rome.syncservice.sync.register.a.a().a(str);
            if (a2 == null) {
                return -1;
            }
            return a2;
        }
    }
}
