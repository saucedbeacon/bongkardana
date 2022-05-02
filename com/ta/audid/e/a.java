package com.ta.audid.e;

import com.ta.audid.a.c;
import com.ta.audid.f.e;
import com.ta.audid.g.d;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f9837a;

    public static String F() {
        try {
            return a("imei");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String G() {
        try {
            return a("imsi");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.Class<com.ta.audid.e.a> r0 = com.ta.audid.e.a.class
            monitor-enter(r0)
            com.ta.audid.a r1 = com.ta.audid.a.a()     // Catch:{ all -> 0x0079 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)
            return
        L_0x000f:
            boolean r2 = b()     // Catch:{ Exception -> 0x0077 }
            if (r2 == 0) goto L_0x0031
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0077 }
            if (r1 != 0) goto L_0x0022
            java.util.Map<java.lang.String, java.lang.String> r1 = f9837a     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = "imei"
            r1.put(r2, r4)     // Catch:{ Exception -> 0x0077 }
        L_0x0022:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0077 }
            if (r4 != 0) goto L_0x0075
            java.util.Map<java.lang.String, java.lang.String> r4 = f9837a     // Catch:{ Exception -> 0x0077 }
            java.lang.String r1 = "imsi"
            r4.put(r1, r5)     // Catch:{ Exception -> 0x0077 }
            monitor-exit(r0)
            return
        L_0x0031:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0077 }
            r2.<init>()     // Catch:{ Exception -> 0x0077 }
            f9837a = r2     // Catch:{ Exception -> 0x0077 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0077 }
            if (r2 != 0) goto L_0x0045
            java.util.Map<java.lang.String, java.lang.String> r2 = f9837a     // Catch:{ Exception -> 0x0077 }
            java.lang.String r3 = "imei"
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077 }
        L_0x0045:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0077 }
            if (r4 != 0) goto L_0x0052
            java.util.Map<java.lang.String, java.lang.String> r4 = f9837a     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = "imsi"
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0077 }
        L_0x0052:
            java.lang.String r4 = com.ta.audid.a.c.e((android.content.Context) r1)     // Catch:{ Exception -> 0x0077 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0077 }
            if (r5 != 0) goto L_0x0063
            java.util.Map<java.lang.String, java.lang.String> r5 = f9837a     // Catch:{ Exception -> 0x0077 }
            java.lang.String r1 = "gsid"
            r5.put(r1, r4)     // Catch:{ Exception -> 0x0077 }
        L_0x0063:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0077 }
            java.util.Map<java.lang.String, java.lang.String> r5 = f9837a     // Catch:{ Exception -> 0x0077 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0077 }
            java.lang.String r4 = com.ta.audid.e.e.e(r4)     // Catch:{ Exception -> 0x0077 }
            com.ta.audid.f.e.f(r4)     // Catch:{ Exception -> 0x0077 }
        L_0x0075:
            monitor-exit(r0)
            return
        L_0x0077:
            monitor-exit(r0)
            return
        L_0x0079:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.e.a.a(java.lang.String, java.lang.String):void");
    }

    private static synchronized String a(String str) {
        synchronized (a.class) {
            if (com.ta.audid.a.a().getContext() == null) {
                return "";
            }
            if (f9837a != null) {
                String str2 = f9837a.get(str);
                return str2;
            } else if (b()) {
                String str3 = f9837a.get(str);
                return str3;
            } else {
                c();
                return "";
            }
        }
    }

    private static void c() {
        try {
            f9837a.clear();
            f9837a = null;
            e.f("");
        } catch (Exception unused) {
        }
    }

    private static boolean b() {
        if (com.ta.audid.a.a().getContext() == null) {
            return false;
        }
        try {
            Map<String, String> a2 = d.a(e.d(e.N()));
            f9837a = a2;
            if (c.e(com.ta.audid.a.a().getContext()).equals(a2.get("gsid"))) {
                return true;
            }
            c();
            return false;
        } catch (Exception unused) {
            c();
            return false;
        }
    }
}
