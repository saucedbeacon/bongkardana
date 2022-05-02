package com.alipay.mobile.rome.syncsdk.a;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.b.a;
import com.alipay.mobile.rome.syncsdk.service.LongLinkService;
import com.alipay.mobile.rome.syncsdk.service.f;
import com.alipay.mobile.rome.syncsdk.util.AppStatusUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9407a = c.class.getSimpleName();
    private static volatile String b = AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
    private static volatile int c = 0;
    private static volatile boolean d = false;

    public static synchronized boolean a() {
        synchronized (c.class) {
            String str = f9407a;
            StringBuilder sb = new StringBuilder("  flowControlByServer=");
            sb.append(d);
            com.alipay.mobile.rome.syncsdk.util.c.a(str, sb.toString());
            if (AppStatusUtils.a() == AppStatusUtils.AppStatus.BACKGROUND) {
                return true;
            }
            if (AppStatusUtils.f9456a == AppStatusUtils.ScreenStatus.SCREEN_OFF) {
                return true;
            }
            Context f = LongLinkService.a().f();
            String a2 = a.a().a(f, "flow_control");
            if (!TextUtils.isEmpty(a2)) {
                try {
                    com.alipay.mobile.rome.syncsdk.util.c.a(f9407a, "checkFlowControl: fc=".concat(String.valueOf(a2)));
                    String[] split = a2.split(",");
                    long parseLong = Long.parseLong(split[0]) - System.currentTimeMillis();
                    long parseLong2 = Long.parseLong(split[1]);
                    if (parseLong <= 0 || parseLong2 <= 0) {
                        a(false);
                        a.a().b(f, "flow_control");
                    } else {
                        f.a().a(Math.min(parseLong, parseLong2));
                    }
                } catch (Exception e) {
                    com.alipay.mobile.rome.syncsdk.util.c.d(f9407a, "checkFlowControl: e=".concat(String.valueOf(e)));
                }
            }
            boolean z = d;
            return z;
        }
    }

    public static synchronized void b() {
        synchronized (c.class) {
            com.alipay.mobile.rome.syncsdk.util.c.b(f9407a, "resetFailCount ");
            c = 0;
        }
    }

    public static synchronized void c() {
        synchronized (c.class) {
            c++;
            String str = f9407a;
            StringBuilder sb = new StringBuilder("addFailCount [ failCount=");
            sb.append(c);
            sb.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.b(str, sb.toString());
        }
    }

    public static synchronized void d() {
        synchronized (c.class) {
            if (c > 0) {
                c--;
            }
            String str = f9407a;
            StringBuilder sb = new StringBuilder("decreaseFailCount [ failCount=");
            sb.append(c);
            sb.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.b(str, sb.toString());
        }
    }

    public static synchronized void e() {
        synchronized (c.class) {
            c = 9;
            String str = f9407a;
            StringBuilder sb = new StringBuilder("setFailCountForOnceEnable [ failCount=");
            sb.append(c);
            sb.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.b(str, sb.toString());
        }
    }

    public static synchronized boolean f() {
        boolean z;
        synchronized (c.class) {
            z = false;
            if (c < 10) {
                z = true;
            }
            String str = f9407a;
            StringBuilder sb = new StringBuilder("[isReconnEnable =");
            sb.append(z);
            sb.append(" ][ failCount=");
            sb.append(c);
            sb.append(" ][ MAX_FAIL_COUNT=10 ]");
            com.alipay.mobile.rome.syncsdk.util.c.b(str, sb.toString());
        }
        return z;
    }

    public static synchronized void a(String str) {
        synchronized (c.class) {
            String str2 = f9407a;
            StringBuilder sb = new StringBuilder("setConnAction [ connAction=");
            sb.append(str);
            sb.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.b(str2, sb.toString());
            b = str;
        }
    }

    public static synchronized void g() {
        synchronized (c.class) {
            com.alipay.mobile.rome.syncsdk.util.c.a(f9407a, "setConnActionActive");
            b = AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
        }
    }

    public static synchronized String h() {
        String str;
        synchronized (c.class) {
            String str2 = f9407a;
            StringBuilder sb = new StringBuilder("getConnAction [ connAction=");
            sb.append(b);
            sb.append(" ]");
            com.alipay.mobile.rome.syncsdk.util.c.b(str2, sb.toString());
            str = b;
        }
        return str;
    }

    public static synchronized void a(boolean z) {
        synchronized (c.class) {
            com.alipay.mobile.rome.syncsdk.util.c.b(f9407a, "setFlowCotrol:".concat(String.valueOf(z)));
            d = z;
        }
    }
}
