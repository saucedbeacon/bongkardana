package com.alipay.alipaysecuritysdk.apdid.d;

import android.content.Context;
import com.alipay.alipaysecuritysdk.apdid.g.c;
import com.alipay.alipaysecuritysdk.apdid.g.e;
import com.alipay.alipaysecuritysdk.common.c.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f9257a;

    public a(Context context) {
        this.f9257a = context;
    }

    public static String a(Context context, String str) {
        try {
            String a2 = e.a(str);
            if (!com.alipay.alipaysecuritysdk.common.e.e.c(a2)) {
                return a2;
            }
            String a3 = c.a(context, str);
            if (com.alipay.alipaysecuritysdk.common.e.e.c(a3)) {
                return "";
            }
            e.a(str, a3);
            return a3;
        } catch (Throwable th) {
            b.a("SEC_SDK-apdid", th);
            return "";
        }
    }

    public static String a(Context context) {
        try {
            String b = e.b();
            if (!com.alipay.alipaysecuritysdk.common.e.e.c(b)) {
                return b;
            }
            com.alipay.alipaysecuritysdk.apdid.g.a.a c = com.alipay.alipaysecuritysdk.apdid.g.a.c(context);
            if (c == null) {
                return "";
            }
            e.a(c);
            String str = c.f9261a;
            if (com.alipay.alipaysecuritysdk.common.e.e.d(str)) {
                return str;
            }
            return "";
        } catch (Throwable th) {
            b.a("SEC_SDK-apdid", th);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087 A[Catch:{ Exception -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0100 A[Catch:{ Exception -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144 A[Catch:{ Exception -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0158 A[Catch:{ Exception -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0162 A[Catch:{ Exception -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026a A[Catch:{ Exception -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x026b A[Catch:{ Exception -> 0x0299 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(java.util.Map<java.lang.String, java.lang.String> r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 4
            android.content.Context r1 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r1 = com.alipay.alipaysecuritysdk.apdid.g.d.b(r1)     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.face.Configuration r2 = com.alipay.alipaysecuritysdk.apdid.a.a.a()     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = r2.gateway     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.d(r1)     // Catch:{ Exception -> 0x0299 }
            if (r3 == 0) goto L_0x002e
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0299 }
            if (r3 != 0) goto L_0x002e
            android.content.Context r3 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.a.a((android.content.Context) r3)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r3 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.c.a(r3)     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.e.g()     // Catch:{ Exception -> 0x0299 }
            java.lang.String r3 = "SEC_SDK-apdid"
            java.lang.String r4 = "env change clear cache finished !!!"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ Exception -> 0x0299 }
        L_0x002e:
            boolean r1 = com.alipay.alipaysecuritysdk.common.e.e.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0299 }
            if (r1 != 0) goto L_0x0039
            android.content.Context r1 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.d.c(r1, r2)     // Catch:{ Exception -> 0x0299 }
        L_0x0039:
            if (r10 == 0) goto L_0x0047
            java.lang.String r1 = "forceReport"
            if (r11 == 0) goto L_0x0042
            java.lang.String r2 = "1"
            goto L_0x0044
        L_0x0042:
            java.lang.String r2 = "0"
        L_0x0044:
            r10.put(r1, r2)     // Catch:{ Exception -> 0x0299 }
        L_0x0047:
            java.lang.String r1 = "appName"
            java.lang.String r1 = com.alipay.alipaysecuritysdk.common.e.c.a(r10, r1)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            a(r2)     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.e.a()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.d.b r2 = new com.alipay.alipaysecuritysdk.apdid.d.b     // Catch:{ Exception -> 0x0299 }
            android.content.Context r3 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.apdid.d.b.a()     // Catch:{ Exception -> 0x0299 }
            android.content.Context r4 = r2.f9258a     // Catch:{ Exception -> 0x0299 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0299 }
            r5.<init>()     // Catch:{ Exception -> 0x0299 }
            java.lang.String r4 = com.alipay.alipaysecuritysdk.apdid.g.d.e(r4)     // Catch:{ Exception -> 0x0299 }
            r5.add(r4)     // Catch:{ Exception -> 0x0299 }
            boolean r4 = com.alipay.alipaysecuritysdk.apdid.c.c.a(r5)     // Catch:{ Exception -> 0x0299 }
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0078
        L_0x0076:
            r4 = 1
            goto L_0x0085
        L_0x0078:
            com.alipay.alipaysecuritysdk.apdid.c.c$1 r4 = new com.alipay.alipaysecuritysdk.apdid.c.c$1     // Catch:{ Exception -> 0x0299 }
            r4.<init>()     // Catch:{ Exception -> 0x0299 }
            boolean r4 = com.alipay.alipaysecuritysdk.apdid.c.c.a(r4)     // Catch:{ Exception -> 0x0299 }
            if (r4 == 0) goto L_0x0084
            goto L_0x0076
        L_0x0084:
            r4 = 0
        L_0x0085:
            if (r3 != 0) goto L_0x00f2
            if (r4 == 0) goto L_0x008a
            goto L_0x00f2
        L_0x008a:
            com.alipay.alipaysecuritysdk.apdid.e.e.a()     // Catch:{ Exception -> 0x0299 }
            android.content.Context r3 = r2.f9258a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r3 = com.alipay.alipaysecuritysdk.apdid.e.e.b(r3, r10)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r4 = com.alipay.alipaysecuritysdk.apdid.g.e.c()     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ Exception -> 0x0299 }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x009f
            goto L_0x00fe
        L_0x009f:
            java.lang.String r3 = "tid"
            java.lang.String r3 = com.alipay.alipaysecuritysdk.common.e.c.a(r10, r3)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r4 = "utdid"
            java.lang.String r4 = com.alipay.alipaysecuritysdk.common.e.c.a(r10, r4)     // Catch:{ Exception -> 0x0299 }
            boolean r7 = com.alipay.alipaysecuritysdk.common.e.e.d(r3)     // Catch:{ Exception -> 0x0299 }
            if (r7 == 0) goto L_0x00be
            java.lang.String r7 = com.alipay.alipaysecuritysdk.apdid.g.e.d()     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.a((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x0299 }
            if (r3 != 0) goto L_0x00be
            goto L_0x00fe
        L_0x00be:
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.d(r4)     // Catch:{ Exception -> 0x0299 }
            if (r3 == 0) goto L_0x00cf
            java.lang.String r3 = com.alipay.alipaysecuritysdk.apdid.g.e.e()     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ Exception -> 0x0299 }
            if (r3 != 0) goto L_0x00cf
            goto L_0x00fe
        L_0x00cf:
            android.content.Context r3 = r2.f9258a     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.apdid.g.e.a((android.content.Context) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x0299 }
            if (r3 != 0) goto L_0x00d8
            goto L_0x00fe
        L_0x00d8:
            android.content.Context r3 = r2.f9258a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r3 = a((android.content.Context) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.c(r3)     // Catch:{ Exception -> 0x0299 }
            if (r3 == 0) goto L_0x00e5
            goto L_0x00fe
        L_0x00e5:
            android.content.Context r2 = r2.f9258a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = a(r2)     // Catch:{ Exception -> 0x0299 }
            boolean r2 = com.alipay.alipaysecuritysdk.common.e.e.c(r2)     // Catch:{ Exception -> 0x0299 }
            if (r2 == 0) goto L_0x010d
            goto L_0x00fe
        L_0x00f2:
            android.content.Context r3 = r2.f9258a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r3 = a((android.content.Context) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.c(r3)     // Catch:{ Exception -> 0x0299 }
            if (r3 == 0) goto L_0x0100
        L_0x00fe:
            r2 = 1
            goto L_0x010e
        L_0x0100:
            android.content.Context r2 = r2.f9258a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = a(r2)     // Catch:{ Exception -> 0x0299 }
            boolean r2 = com.alipay.alipaysecuritysdk.common.e.e.c(r2)     // Catch:{ Exception -> 0x0299 }
            if (r2 == 0) goto L_0x010d
            goto L_0x00fe
        L_0x010d:
            r2 = 0
        L_0x010e:
            java.lang.String r3 = "SEC_SDK-apdid"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0299 }
            java.lang.String r7 = "check is update data info, detect:"
            r4.<init>(r7)     // Catch:{ Exception -> 0x0299 }
            r4.append(r2)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r7 = ", force:"
            r4.append(r7)     // Catch:{ Exception -> 0x0299 }
            r4.append(r11)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r3 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            long r7 = com.alipay.alipaysecuritysdk.common.collector.b.u()     // Catch:{ Exception -> 0x0299 }
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.d.b(r3, r4)     // Catch:{ Exception -> 0x0299 }
            if (r2 != 0) goto L_0x013c
            if (r11 != 0) goto L_0x013c
            monitor-exit(r9)
            return r5
        L_0x013c:
            com.alipay.alipaysecuritysdk.apdid.face.Configuration r11 = com.alipay.alipaysecuritysdk.apdid.a.a.a()     // Catch:{ Exception -> 0x0299 }
            boolean r11 = r11.needUmid     // Catch:{ Exception -> 0x0299 }
            if (r11 == 0) goto L_0x0149
            android.content.Context r11 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.f.a.b(r11)     // Catch:{ Exception -> 0x0299 }
        L_0x0149:
            java.lang.String r11 = "SEC_SDK-apdid"
            java.lang.String r2 = "prepare to collect data and send data to server"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r11, (java.lang.String) r2)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r11 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.rpc.model.a.b r11 = com.alipay.alipaysecuritysdk.apdid.rpc.b.a(r11, r5, r10)     // Catch:{ Exception -> 0x0299 }
            if (r11 != 0) goto L_0x0162
            java.lang.String r10 = "SEC_SDK-apdid"
            java.lang.String r2 = "rpc send data failed, response is null"
            com.alipay.alipaysecuritysdk.common.c.b.b(r10, r2)     // Catch:{ Exception -> 0x0299 }
            r2 = 4
            goto L_0x0252
        L_0x0162:
            int r2 = r11.a()     // Catch:{ Exception -> 0x0299 }
            r3 = 3
            if (r2 != r3) goto L_0x0172
            java.lang.String r2 = "SEC_SDK-apdid"
            java.lang.String r3 = "rpc send data failed, illegal appname or appkey"
            com.alipay.alipaysecuritysdk.common.c.b.b(r2, r3)     // Catch:{ Exception -> 0x0299 }
            r2 = 1
            goto L_0x0173
        L_0x0172:
            r2 = 4
        L_0x0173:
            int r3 = r11.a()     // Catch:{ Exception -> 0x0299 }
            r4 = 2
            if (r3 != r4) goto L_0x0182
            java.lang.String r2 = "SEC_SDK-apdid"
            java.lang.String r3 = "rpc send data failed, network failed"
            com.alipay.alipaysecuritysdk.common.c.b.b(r2, r3)     // Catch:{ Exception -> 0x0299 }
            r2 = 4
        L_0x0182:
            int r3 = r11.a()     // Catch:{ Exception -> 0x0299 }
            if (r3 != r6) goto L_0x0252
            java.lang.String r2 = "SEC_SDK-apdid"
            java.lang.String r3 = "rpc send data success !!!"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0299 }
            r11.e()     // Catch:{ Exception -> 0x0299 }
            r11.d()     // Catch:{ Exception -> 0x0299 }
            r11.c()     // Catch:{ Exception -> 0x0299 }
            r11.b()     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            boolean r3 = r11.e()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.d.a((android.content.Context) r2, (boolean) r3)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r3 = r11.h     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.d.d(r2, r3)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r3 = r11.d()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.d.a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r3 = r11.c()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.d.e(r2, r3)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r3 = r11.b()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.d.f(r2, r3)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.d.a((android.content.Context) r2, (java.lang.String) r1, (long) r3)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r11.i     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.d.a((android.content.Context) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = com.alipay.alipaysecuritysdk.apdid.e.e.b(r2, r10)     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.e.c(r2)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = r11.d     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.e.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = r11.c     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.e.b(r2)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = r11.e     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.e.d(r2)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = "tid"
            java.lang.String r2 = com.alipay.alipaysecuritysdk.common.e.c.a(r10, r2)     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.d(r2)     // Catch:{ Exception -> 0x0299 }
            if (r3 == 0) goto L_0x0209
            java.lang.String r3 = com.alipay.alipaysecuritysdk.apdid.g.e.d()     // Catch:{ Exception -> 0x0299 }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0299 }
            if (r3 != 0) goto L_0x0209
            com.alipay.alipaysecuritysdk.apdid.g.e.e(r2)     // Catch:{ Exception -> 0x0299 }
            goto L_0x020d
        L_0x0209:
            java.lang.String r2 = com.alipay.alipaysecuritysdk.apdid.g.e.d()     // Catch:{ Exception -> 0x0299 }
        L_0x020d:
            com.alipay.alipaysecuritysdk.apdid.g.e.e(r2)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = "utdid"
            java.lang.String r10 = com.alipay.alipaysecuritysdk.common.e.c.a(r10, r2)     // Catch:{ Exception -> 0x0299 }
            boolean r2 = com.alipay.alipaysecuritysdk.common.e.e.d(r10)     // Catch:{ Exception -> 0x0299 }
            if (r2 == 0) goto L_0x022b
            java.lang.String r2 = com.alipay.alipaysecuritysdk.apdid.g.e.e()     // Catch:{ Exception -> 0x0299 }
            boolean r2 = com.alipay.alipaysecuritysdk.common.e.e.a((java.lang.String) r10, (java.lang.String) r2)     // Catch:{ Exception -> 0x0299 }
            if (r2 != 0) goto L_0x022b
            com.alipay.alipaysecuritysdk.apdid.g.e.f(r10)     // Catch:{ Exception -> 0x0299 }
            goto L_0x022f
        L_0x022b:
            java.lang.String r10 = com.alipay.alipaysecuritysdk.apdid.g.e.e()     // Catch:{ Exception -> 0x0299 }
        L_0x022f:
            com.alipay.alipaysecuritysdk.apdid.g.e.f(r10)     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.e.a()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.a.a r10 = com.alipay.alipaysecuritysdk.apdid.g.e.f()     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.a.a(r2, r10)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r10 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.a.b(r10)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r10 = com.alipay.alipaysecuritysdk.apdid.g.e.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.c.a(r2, r1, r10)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r10 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.g.c.b(r10)     // Catch:{ Exception -> 0x0299 }
            r2 = 0
        L_0x0252:
            java.lang.String r10 = "rpc_request"
            java.lang.String r3 = "state"
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.common.c.a.a(r10, r3, r4)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r10 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r10 = a((android.content.Context) r10, (java.lang.String) r1)     // Catch:{ Exception -> 0x0299 }
            boolean r10 = com.alipay.alipaysecuritysdk.common.e.e.d(r10)     // Catch:{ Exception -> 0x0299 }
            if (r10 == 0) goto L_0x026b
            goto L_0x026c
        L_0x026b:
            r5 = r2
        L_0x026c:
            android.content.Context r10 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            android.content.Context r2 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r2 = a((android.content.Context) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r3 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.lang.String r3 = com.alipay.alipaysecuritysdk.apdid.g.d.f(r3)     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.c.a.a((android.content.Context) r10, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0299 }
            android.content.Context r10 = r9.f9257a     // Catch:{ Exception -> 0x0299 }
            java.util.Map<java.lang.String, java.lang.String> r11 = r11.i     // Catch:{ Exception -> 0x0299 }
            org.json.JSONObject r11 = com.alipay.alipaysecuritysdk.common.e.c.a(r11)     // Catch:{ Exception -> 0x0299 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.common.e.f r2 = com.alipay.alipaysecuritysdk.common.e.f.a()     // Catch:{ Exception -> 0x0299 }
            com.alipay.alipaysecuritysdk.apdid.b.b$1 r3 = new com.alipay.alipaysecuritysdk.apdid.b.b$1     // Catch:{ Exception -> 0x0299 }
            r3.<init>(r10, r1, r11)     // Catch:{ Exception -> 0x0299 }
            r2.b(r3)     // Catch:{ Exception -> 0x0299 }
            monitor-exit(r9)
            return r5
        L_0x0297:
            r10 = move-exception
            goto L_0x02a3
        L_0x0299:
            r10 = move-exception
            java.lang.String r11 = "SEC_SDK-apdid"
            java.lang.String r1 = "apdid main process error"
            com.alipay.alipaysecuritysdk.common.c.b.a(r11, r1, r10)     // Catch:{ all -> 0x0297 }
            monitor-exit(r9)
            return r0
        L_0x02a3:
            monitor-exit(r9)
            goto L_0x02a6
        L_0x02a5:
            throw r10
        L_0x02a6:
            goto L_0x02a5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.apdid.d.a.a(java.util.Map, boolean):int");
    }
}
