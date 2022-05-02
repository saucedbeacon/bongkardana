package com.alipay.mobile.rome.syncsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alipay.mobile.rome.longlinkservice.ConnectionListener;
import com.alipay.mobile.rome.syncsdk.b;
import com.alipay.mobile.rome.syncsdk.service.LongLinkNetInfoReceiver;
import com.alipay.mobile.rome.syncsdk.service.LongLinkService;
import com.alipay.mobile.rome.syncsdk.service.a;
import com.alipay.mobile.rome.syncsdk.service.e;
import com.alipay.mobile.rome.syncsdk.util.AppStatusUtils;
import com.alipay.mobile.rome.syncsdk.util.c;

public final class b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f9408a = b.class.getSimpleName();
    private static b b;
    private volatile e c;
    /* access modifiers changed from: private */
    public volatile a d;

    private b(Context context) {
        LongLinkService a2 = LongLinkService.a();
        a2.c = context;
        if (a2.c != null) {
            LongLinkService.b = new a(context);
            c.b(LongLinkService.f9414a, "registerNetInfoReceiver: ");
            try {
                a2.d = new LongLinkNetInfoReceiver();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                a2.c.registerReceiver(a2.d, intentFilter);
            } catch (IllegalArgumentException e) {
                String str = LongLinkService.f9414a;
                StringBuilder sb = new StringBuilder("registerNetInfoReceiver: [ IllegalArgumentException=");
                sb.append(e);
                sb.append(" ]");
                c.d(str, sb.toString());
            }
            a2.e = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    String g = LongLinkService.f9414a;
                    StringBuilder sb = new StringBuilder("ScreenStatusReceiver Action=");
                    sb.append(intent.getAction());
                    c.b(g, sb.toString());
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        AppStatusUtils.f9456a = AppStatusUtils.ScreenStatus.SCREEN_OFF;
                        b.a(LongLinkService.this.c).d();
                    } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                        AppStatusUtils.f9456a = AppStatusUtils.ScreenStatus.SCREEN_ON;
                        if (AppStatusUtils.a() == AppStatusUtils.AppStatus.FOREGROUND) {
                            b.a(LongLinkService.this.c).c();
                        }
                    }
                }
            };
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            intentFilter2.addAction("android.intent.action.SCREEN_ON");
            a2.c.registerReceiver(a2.e, intentFilter2);
        }
        this.c = new c(this);
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b(context);
            }
            bVar = b;
        }
        return bVar;
    }

    public final synchronized void a(a aVar) {
        c.b(f9408a, "init longlink [ bindService ]  ");
        this.d = aVar;
        if (aVar == null) {
            c.b(f9408a, "bindService: [ callback=null ]");
            return;
        }
        LongLinkService.a();
        LongLinkService.a(this.c);
    }

    public final synchronized void a(String str, String str2) {
        String str3 = f9408a;
        StringBuilder sb = new StringBuilder("setUserInfo [ userId=");
        sb.append(str);
        sb.append(" ][ sessionId=");
        sb.append(str2);
        sb.append(" ]");
        c.b(str3, sb.toString());
        com.alipay.mobile.rome.syncsdk.a.a.a().f9405a = str;
        com.alipay.mobile.rome.syncsdk.a.a.a().b = str2;
        LongLinkService.a();
        LongLinkService.e();
    }

    public final synchronized void a() {
        c.b(f9408a, "setConnActionActive: ");
        com.alipay.mobile.rome.syncsdk.a.c.g();
    }

    public final synchronized boolean b() {
        LongLinkService.a();
        return LongLinkService.d();
    }

    public static void a(ConnectionListener connectionListener) {
        LongLinkService a2 = LongLinkService.a();
        if (connectionListener == null) {
            c.c(LongLinkService.f9414a, "[addConnectionListener] connectionListener is null.");
            return;
        }
        if (LongLinkService.b == null) {
            LongLinkService.b = new a(a2.c);
        }
        String str = LongLinkService.f9414a;
        StringBuilder sb = new StringBuilder("[addConnectionListener] connectionListener = ");
        sb.append(connectionListener.getClass().getName());
        c.c(str, sb.toString());
        LongLinkService.b.z().addObserver(connectionListener);
    }

    public static void b(ConnectionListener connectionListener) {
        LongLinkService.a();
        LongLinkService.a(connectionListener);
    }

    public final synchronized void c() {
        c.b(f9408a, "startLink");
        LongLinkService.a();
        if (LongLinkService.d()) {
            c.c(f9408a, "startLink: [ already connected ] ");
            return;
        }
        LongLinkService.a();
        LongLinkService.c();
    }

    public final synchronized void d() {
        c.b(f9408a, "stopLink： ");
        LongLinkService a2 = LongLinkService.a();
        com.alipay.mobile.rome.syncsdk.a.c.b();
        if (LongLinkService.b == null) {
            LongLinkService.b = new a(a2.c);
        }
        LongLinkService.b.e();
        if (!(a2.e == null || a2.c == null)) {
            a2.c.unregisterReceiver(a2.e);
            a2.e = null;
        }
    }

    public final synchronized void a(byte[] bArr) {
        LongLinkService.a();
        LongLinkService.a(bArr);
    }
}
