package com.alipay.alipaysecuritysdk.apdid.g;

import com.alipay.alipaysecuritysdk.apdid.g.a.a;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static String f9264a = "";
    private static String b = "";
    private static String c = "";
    private static String d = "";
    private static String e = "";
    private static Map<String, String> f = new HashMap();

    public static synchronized void a() {
        synchronized (e.class) {
            for (String str : f.keySet()) {
                f.get(str);
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.Class<com.alipay.alipaysecuritysdk.apdid.g.e> r0 = com.alipay.alipaysecuritysdk.apdid.g.e.class
            monitor-enter(r0)
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = com.alipay.alipaysecuritysdk.apdid.g.d.a(r8)     // Catch:{ all -> 0x0012 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = r3
        L_0x0012:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0026 }
            long r8 = com.alipay.alipaysecuritysdk.apdid.g.d.g(r8, r9)     // Catch:{ all -> 0x0026 }
            long r3 = r3 - r8
            long r8 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x0026 }
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x002c
            r8 = 1
            monitor-exit(r0)
            return r8
        L_0x0026:
            r8 = move-exception
            java.lang.String r9 = "SEC_SDK-apdid"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r9, (java.lang.Throwable) r8)     // Catch:{ all -> 0x002f }
        L_0x002c:
            r8 = 0
            monitor-exit(r0)
            return r8
        L_0x002f:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.apdid.g.e.a(android.content.Context, java.lang.String):boolean");
    }

    public static synchronized String a(String str) {
        synchronized (e.class) {
            String concat = "apdidTokenCache".concat(String.valueOf(str));
            if (f.containsKey(concat)) {
                String str2 = f.get(concat);
                if (com.alipay.alipaysecuritysdk.common.e.e.d(str2)) {
                    return str2;
                }
            }
            return "";
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (e.class) {
            str = f9264a;
        }
        return str;
    }

    public static synchronized String c() {
        String str;
        synchronized (e.class) {
            str = b;
        }
        return str;
    }

    public static synchronized String d() {
        String str;
        synchronized (e.class) {
            str = d;
        }
        return str;
    }

    public static synchronized String e() {
        String str;
        synchronized (e.class) {
            str = e;
        }
        return str;
    }

    public static synchronized a f() {
        a aVar;
        synchronized (e.class) {
            aVar = new a(f9264a, b, c, d, e);
        }
        return aVar;
    }

    public static synchronized void a(String str, String str2) {
        synchronized (e.class) {
            String concat = "apdidTokenCache".concat(String.valueOf(str));
            if (f.containsKey(concat)) {
                f.remove(concat);
            }
            f.put(concat, str2);
        }
    }

    public static void b(String str) {
        f9264a = str;
    }

    public static void c(String str) {
        b = str;
    }

    public static void d(String str) {
        c = str;
    }

    public static void e(String str) {
        d = str;
    }

    public static void f(String str) {
        e = str;
    }

    public static void g() {
        f.clear();
        f9264a = "";
        b = "";
        d = "";
        e = "";
        c = "";
    }

    public static synchronized void a(a aVar) {
        synchronized (e.class) {
            if (aVar != null) {
                f9264a = aVar.f9261a;
                b = aVar.b;
                d = aVar.d;
                e = aVar.e;
                c = aVar.c;
            }
            a();
        }
    }
}
