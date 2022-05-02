package com.alipay.mobile.rome.syncsdk.transport.c;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.a.b;
import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.service.e;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.f;
import com.alipay.msync.server.model.MsyncInitReturnMessage;

public class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9445a = j.class.getSimpleName();
    private final a b;

    public j(a aVar) {
        this.b = aVar;
    }

    public final boolean b(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        return aVar != null && aVar.a() == 0;
    }

    public final void a(com.alipay.mobile.rome.syncsdk.transport.b.a aVar) {
        String str;
        this.b.a(System.currentTimeMillis());
        byte[] e = aVar.e();
        if (e == null || e.length <= 0) {
            str = "";
        } else {
            MsyncInitReturnMessage msyncInitReturnMessage = (MsyncInitReturnMessage) f.a(e, MsyncInitReturnMessage.class);
            if (msyncInitReturnMessage == null) {
                c.d(f9445a, "processPacket parsePBObject exception, pb is null.");
                return;
            }
            if (msyncInitReturnMessage.keepLiveTime != null && msyncInitReturnMessage.keepLiveTime.intValue() > 0) {
                b.c(msyncInitReturnMessage.keepLiveTime.intValue());
            }
            if (msyncInitReturnMessage.heartTimeOut != null && msyncInitReturnMessage.heartTimeOut.intValue() > 0) {
                b.a(msyncInitReturnMessage.heartTimeOut.intValue());
            }
            String str2 = msyncInitReturnMessage.cdid;
            if (!TextUtils.isEmpty(str2)) {
                com.alipay.mobile.rome.syncsdk.a.a.a().a(this.b.f9416a, str2);
            }
            str = msyncInitReturnMessage.action;
            if (msyncInitReturnMessage.nextConnectItvl.intValue() >= 10 && msyncInitReturnMessage.nextConnectItvl.intValue() <= 600) {
                String str3 = f9445a;
                StringBuilder sb = new StringBuilder("ImplRegister processPacket: [ flow control =");
                sb.append(msyncInitReturnMessage.nextConnectItvl);
                sb.append(" ]");
                c.c(str3, sb.toString());
                long intValue = (long) (msyncInitReturnMessage.nextConnectItvl.intValue() * 1000);
                this.b.e();
                com.alipay.mobile.rome.syncsdk.service.f.a().b(intValue);
                return;
            }
        }
        String str4 = f9445a;
        StringBuilder sb2 = new StringBuilder("processPacket： [ action=");
        sb2.append(str);
        sb2.append(" ][ replyTimeout=");
        sb2.append(b.a());
        sb2.append(" ][ keepLiveTime=");
        sb2.append(b.c());
        sb2.append(" ]");
        c.a(str4, sb2.toString());
        this.b.s();
        e l = this.b.l();
        if (l == null) {
            c.d(f9445a, "processPacket: [ longLinkNotifer=null ]");
            return;
        }
        this.b.b(System.currentTimeMillis());
        String str5 = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
        String f = com.alipay.mobile.rome.syncsdk.a.a.a().f();
        int i = k.f9446a[this.b.b().ordinal()];
        if (i == 1) {
            if ("unbind".equals(str)) {
                c.a(f9445a, "processPacket: [ unbind don't need send device register 1001 ]");
            } else {
                l.b();
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(f)) {
                this.b.i();
            }
        } else if (i == 2) {
            l.a();
            if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(f)) {
                this.b.j();
            }
        } else if (i == 3) {
            l.c();
            if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(f)) {
                this.b.j();
            }
        }
        com.alipay.mobile.rome.syncsdk.a.c.d();
        if (com.alipay.mobile.rome.syncsdk.transport.a.a().equals("https")) {
            com.alipay.mobile.rome.syncsdk.service.f.a().b(b.c());
        }
    }
}
