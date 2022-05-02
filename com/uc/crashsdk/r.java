package com.uc.crashsdk;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.c;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static PendingIntent f9896a;

    public static void a() {
        if (f9896a == null && p.h() >= 0) {
            try {
                Context a2 = e.a();
                Intent launchIntentForPackage = a2.getPackageManager().getLaunchIntentForPackage(a2.getPackageName());
                launchIntentForPackage.addFlags(335544320);
                f9896a = PendingIntent.getActivity(a2, 0, launchIntentForPackage, 0);
            } catch (Throwable th) {
                a.a(th, false);
            }
        }
    }

    public static boolean b() {
        if (f9896a == null) {
            c.c("Restart intent is null!");
            return false;
        }
        try {
            c.b("restarting ...");
            ((AlarmManager) e.a().getSystemService("alarm")).set(1, System.currentTimeMillis() + 200, f9896a);
            return true;
        } catch (Throwable th) {
            a.a(th, false);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[SYNTHETIC, Splitter:B:26:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069 A[SYNTHETIC, Splitter:B:30:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096 A[SYNTHETIC, Splitter:B:38:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r11) {
        /*
            java.lang.String r0 = "restartBrowser"
            com.uc.crashsdk.a.c.a(r0)
            if (r11 != 0) goto L_0x0008
            return
        L_0x0008:
            int r11 = c()
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r4 = com.uc.crashsdk.p.h()
            r5 = 0
            r6 = 1
            if (r4 < 0) goto L_0x0072
            if (r11 <= 0) goto L_0x0029
            long r7 = (long) r11
            long r7 = r0 - r7
            int r4 = com.uc.crashsdk.p.h()
            long r9 = (long) r4
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0072
        L_0x0029:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 / r2
            com.uc.crashsdk.b.m()
            java.io.File r2 = new java.io.File
            java.lang.String r3 = com.uc.crashsdk.b.d()
            r2.<init>(r3)
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005c }
            r4.<init>(r2)     // Catch:{ Exception -> 0x005c }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r4.write(r2)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r4.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0065
        L_0x004f:
            r2 = move-exception
            com.uc.crashsdk.a.a.a(r2, r6)
            goto L_0x0065
        L_0x0054:
            r11 = move-exception
            r3 = r4
            goto L_0x0067
        L_0x0057:
            r2 = move-exception
            r3 = r4
            goto L_0x005d
        L_0x005a:
            r11 = move-exception
            goto L_0x0067
        L_0x005c:
            r2 = move-exception
        L_0x005d:
            com.uc.crashsdk.a.a.a(r2, r6)     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x0065
            r3.close()     // Catch:{ IOException -> 0x004f }
        L_0x0065:
            r2 = 1
            goto L_0x0073
        L_0x0067:
            if (r3 == 0) goto L_0x0071
            r3.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r6)
        L_0x0071:
            throw r11
        L_0x0072:
            r2 = 0
        L_0x0073:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "restartBrowser, lastTime: "
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r11 = ", currentTime: "
            r3.append(r11)
            r3.append(r0)
            java.lang.String r11 = ", needRestart: "
            r3.append(r11)
            r3.append(r2)
            java.lang.String r11 = r3.toString()
            com.uc.crashsdk.a.c.a(r11)
            if (r2 == 0) goto L_0x00a1
            com.uc.crashsdk.d.a((boolean) r6)     // Catch:{ all -> 0x009a }
            goto L_0x009e
        L_0x009a:
            r11 = move-exception
            com.uc.crashsdk.a.a.a(r11, r5)
        L_0x009e:
            b()
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.r.a(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[SYNTHETIC, Splitter:B:23:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052 A[SYNTHETIC, Splitter:B:30:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c() {
        /*
            java.lang.String r0 = com.uc.crashsdk.b.d()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            r2 = -1
            if (r0 != 0) goto L_0x0011
            return r2
        L_0x0011:
            r0 = 0
            r3 = 1
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003e, all -> 0x003a }
            r4.<init>(r1)     // Catch:{ Exception -> 0x003e, all -> 0x003a }
            long r0 = r1.length()     // Catch:{ Exception -> 0x0038 }
            int r1 = (int) r0     // Catch:{ Exception -> 0x0038 }
            byte[] r0 = new byte[r1]     // Catch:{ Exception -> 0x0038 }
            int r1 = r4.read(r0)     // Catch:{ Exception -> 0x0038 }
            if (r1 <= 0) goto L_0x002f
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0038 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0038 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0038 }
            r2 = r0
        L_0x002f:
            r4.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x004e
        L_0x0033:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r3)
            goto L_0x004e
        L_0x0038:
            r0 = move-exception
            goto L_0x0041
        L_0x003a:
            r1 = move-exception
            r4 = r0
            r0 = r1
            goto L_0x0050
        L_0x003e:
            r1 = move-exception
            r4 = r0
            r0 = r1
        L_0x0041:
            com.uc.crashsdk.a.a.a(r0, r3)     // Catch:{ all -> 0x004f }
            if (r4 == 0) goto L_0x004e
            r4.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            com.uc.crashsdk.a.a.a(r0, r3)
        L_0x004e:
            return r2
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            if (r4 == 0) goto L_0x005a
            r4.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r1 = move-exception
            com.uc.crashsdk.a.a.a(r1, r3)
        L_0x005a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.r.c():int");
    }
}
