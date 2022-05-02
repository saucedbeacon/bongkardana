package com.alipay.mobile.rome.syncservice.sync.e;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.model.ResultCodeEnum;
import com.alipay.mobile.rome.syncservice.model.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9496a = a.class.getSimpleName();

    public static d a(com.alipay.mobile.rome.syncservice.sync.d.a aVar) {
        if (aVar == null) {
            return new d(ResultCodeEnum.ERROR);
        }
        aVar.g = 0;
        String str = f9496a;
        StringBuilder sb = new StringBuilder("insertToDB biz:");
        sb.append(aVar.c);
        sb.append(" sKey:");
        sb.append(aVar.d);
        c.b(str, sb.toString());
        try {
            if (!TextUtils.isEmpty(aVar.f)) {
                d a2 = com.alipay.mobile.rome.syncservice.sync.b.a.a.a(com.alipay.mobile.rome.syncservice.d.a.f9473a).c.a(aVar);
                if (a2.f9481a == ResultCodeEnum.ERROR) {
                    String str2 = f9496a;
                    StringBuilder sb2 = new StringBuilder("insertToDB: ");
                    sb2.append(ResultCodeEnum.ERROR);
                    c.d(str2, sb2.toString());
                }
                return a2;
            }
            c.b(f9496a, "syncPacket.md  is null or syncPacket.pf <= 0, msg will not insert to db.");
            return new d(ResultCodeEnum.SUCCESS);
        } catch (Exception e) {
            String str3 = f9496a;
            StringBuilder sb3 = new StringBuilder("insertToDB: [ Exception=");
            sb3.append(e);
            sb3.append(" ]");
            c.d(str3, sb3.toString());
            return new d(ResultCodeEnum.ERROR, String.valueOf(e));
        }
    }

    public static void b(com.alipay.mobile.rome.syncservice.sync.d.a aVar) {
        if (Long.parseLong(aVar.d) > com.alipay.mobile.rome.syncservice.sync.a.a().a(aVar.c, aVar.b)) {
            com.alipay.mobile.rome.syncservice.sync.a.a().a(aVar.c, Long.parseLong(aVar.d), aVar.b);
        }
    }

    public static void c(com.alipay.mobile.rome.syncservice.sync.d.a aVar) {
        if (!TextUtils.isEmpty(aVar.f)) {
            com.alipay.mobile.rome.syncservice.sync.c.a.c(aVar.c);
        }
    }
}
