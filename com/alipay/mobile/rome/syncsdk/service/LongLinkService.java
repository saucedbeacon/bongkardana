package com.alipay.mobile.rome.syncsdk.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.alipay.mobile.rome.longlinkservice.ConnectionListener;
import com.alipay.mobile.rome.syncsdk.a.c;
import com.alipay.mobile.rome.syncsdk.service.ConnStateFsm;

public class LongLinkService {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9414a = LongLinkService.class.getSimpleName();
    public static volatile a b = null;
    private static LongLinkService f;
    public Context c;
    public volatile BroadcastReceiver d;
    public BroadcastReceiver e;

    public static LongLinkService a() {
        if (f == null) {
            f = new LongLinkService();
        }
        return f;
    }

    private LongLinkService() {
    }

    public static a b() {
        return b;
    }

    public static void c() {
        c.b();
        if (b != null && !b.p()) {
            b.c();
        }
    }

    public static boolean d() {
        if (b == null) {
            return false;
        }
        return b.p();
    }

    public static void a(ConnectionListener connectionListener) {
        if (connectionListener == null) {
            com.alipay.mobile.rome.syncsdk.util.c.c(f9414a, "[removeConnectionListener] connectionListener is null");
        } else if (b != null) {
            String str = f9414a;
            StringBuilder sb = new StringBuilder("[removeConnectionListener] connectionListener = ");
            sb.append(connectionListener.getClass().getName());
            com.alipay.mobile.rome.syncsdk.util.c.c(str, sb.toString());
            b.z().deleteObserver(connectionListener);
        }
    }

    public static void e() {
        com.alipay.mobile.rome.syncsdk.util.c.b(f9414a, "setUserInfo： ");
        c.b();
        if (b.r()) {
            b.j();
        } else if (ConnStateFsm.State.DEVICE_BINDED == b.b()) {
            b.i();
        }
    }

    public static void a(e eVar) {
        com.alipay.mobile.rome.syncsdk.util.c.a(f9414a, "setPacketNotifer ");
        if (b != null) {
            b.a(eVar);
        }
    }

    public static void a(byte[] bArr) {
        com.alipay.mobile.rome.syncsdk.util.c.b(f9414a, "sendPacketUplinkSync ");
        if (b != null) {
            b.a(bArr);
        }
    }

    public final synchronized Context f() {
        return this.c;
    }
}
