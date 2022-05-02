package com.alipay.mobile.rome.syncservice.up;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.sync.d.b;
import java.util.List;

public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f9505a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b bVar, Looper looper) {
        super(looper);
        this.f9505a = bVar;
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i != 10) {
            switch (i) {
                case 0:
                    c.a(b.f9503a, "SEND_SYNC_UNPLINK_DELAYED");
                    this.f9505a.a((b) message.obj);
                    return;
                case 1:
                    c.a(b.f9503a, "SYNC_UNPLINK_EXPIRED");
                    this.f9505a.c((b) message.obj);
                    return;
                case 2:
                    b.a(this.f9505a);
                    return;
                case 3:
                    c.a(b.f9503a, "RECV_SYNC_UNPLINK_ACK");
                    b.a(this.f9505a, message.arg1, (List) message.obj);
                    return;
                case 4:
                    b.a(this.f9505a, (c) message.obj);
                    return;
                case 5:
                    c.a(b.f9503a, "CANCEL_SYNC_UPLINK");
                    b.c(this.f9505a, (b) message.obj);
                    return;
                case 6:
                    b.a(this.f9505a, (String) message.obj);
                    return;
                default:
                    return;
            }
        } else {
            a aVar = (a) message.obj;
            if (aVar != null) {
                b.a(this.f9505a, aVar.f9502a, aVar.b, aVar.c);
            }
        }
    }
}
