package com.alipay.mobile.rome.syncservice.sync.c;

import android.text.TextUtils;
import com.alipay.mobile.rome.longlinkservice.ISyncCallback;
import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncMessage;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.sync.a.a;
import com.alipay.mobile.rome.syncservice.sync.b;
import com.alipay.mobile.rome.syncservice.sync.register.Biz;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    String f9493a;
    int b;
    SyncMessage c;
    String d;
    int e;
    String f;

    public e(SyncMessage syncMessage, String str, int i) {
        this.f9493a = syncMessage.biz;
        this.b = i;
        this.c = syncMessage;
        this.d = str;
        this.e = i;
        this.f = syncMessage.f9404id;
    }

    public final void run() {
        if (this.e >= a.b()) {
            c.a(c.f9491a, "DispatchMsgTask: start send number exceed 6");
            a.a(this.c);
            return;
        }
        ISyncCallback b2 = com.alipay.mobile.rome.syncservice.sync.register.c.b(this.f9493a);
        if (b2 == null) {
            String a2 = c.f9491a;
            StringBuilder sb = new StringBuilder("DispatchMsgTask: run: [ getBizCallback return null ][ biz=");
            sb.append(this.f9493a);
            sb.append(" ]");
            c.c(a2, sb.toString());
            a.d(this.f9493a);
        } else if (com.alipay.mobile.rome.syncservice.sync.register.a.a().b(this.f9493a) != Biz.BizDimeEnum.USER || !TextUtils.isEmpty(com.alipay.mobile.rome.syncsdk.a.a.a().f9405a)) {
            this.b++;
            String a3 = c.f9491a;
            StringBuilder sb2 = new StringBuilder("DispatchMsgTask: run: [ biz=");
            sb2.append(this.f9493a);
            sb2.append(" ][");
            sb2.append(this.d);
            sb2.append(" ] sendNum:");
            sb2.append(this.b);
            sb2.append(" startSendNum=");
            sb2.append(this.e);
            c.a(a3, sb2.toString());
            if (this.b > a.b()) {
                String str = this.c.userId;
                a.b(this.f9493a);
                a.a(this.c);
                b.a().a("dispatchMsgFailed", this.f9493a, str, "3002", com.alipay.mobile.rome.syncservice.d.b.b(this.d));
            } else if (this.b != 4 || this.e == 3) {
                try {
                    String str2 = this.c.f9404id.split(",")[0];
                    com.alipay.mobile.rome.syncservice.sync.b.a.a a4 = com.alipay.mobile.rome.syncservice.sync.b.a.a.a(com.alipay.mobile.rome.syncservice.d.a.f9473a);
                    int parseInt = Integer.parseInt(str2);
                    if (a4.d.get()) {
                        c.a(com.alipay.mobile.rome.syncservice.sync.b.a.a.f9486a, "addMsgSendNum...db recreating~");
                    } else {
                        com.alipay.mobile.rome.syncservice.sync.b.a.a.b bVar = a4.c;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("UPDATE ");
                        sb3.append("sync_dispatch");
                        sb3.append(" SET sendNum = sendNum + 1 ");
                        sb3.append(" WHERE id = ");
                        sb3.append(parseInt);
                        bVar.a(sb3.toString());
                    }
                    SyncMessage syncMessage = this.c;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f);
                    sb4.append(",");
                    sb4.append(this.b);
                    syncMessage.f9404id = sb4.toString();
                    SyncMessage syncMessage2 = this.c;
                    b2.onReceiveMessage(syncMessage2.clone(syncMessage2));
                } catch (Exception e2) {
                    String a5 = c.f9491a;
                    StringBuilder sb5 = new StringBuilder("DispatchMsgTask: run: [ addMsgSendNum ][ Exception=");
                    sb5.append(e2);
                    sb5.append(" ]");
                    c.d(a5, sb5.toString());
                    a.d(this.f9493a);
                }
            } else {
                a.a(this.f9493a);
                a.d(this.f9493a);
            }
        } else {
            String a6 = c.f9491a;
            StringBuilder sb6 = new StringBuilder("DispatchMsgTask: run: [ userId null ][ biz=");
            sb6.append(this.f9493a);
            sb6.append(" ]");
            c.c(a6, sb6.toString());
            a.d(this.f9493a);
        }
    }
}
