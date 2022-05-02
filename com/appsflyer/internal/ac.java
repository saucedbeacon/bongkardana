package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class ac {
    private static int getMax = 0;
    private static long length = -7885450782686121151L;
    private static int setMax = 1;

    /* renamed from: ʽ  reason: contains not printable characters */
    private boolean f8651;

    /* renamed from: ˊ  reason: contains not printable characters */
    private String f8652 = "";

    /* renamed from: ˋ  reason: contains not printable characters */
    public String f8653;

    /* renamed from: ˎ  reason: contains not printable characters */
    boolean f8654 = true;

    /* renamed from: ˏ  reason: contains not printable characters */
    boolean f8655 = true;

    /* renamed from: ॱ  reason: contains not printable characters */
    private boolean f8656;

    /* renamed from: ॱॱ  reason: contains not printable characters */
    private WeakReference<Context> f8657;

    public ac(Context context, boolean z) {
        this.f8657 = new WeakReference<>(context);
        this.f8656 = z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (com.appsflyer.internal.am.f8691 == null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090 A[Catch:{ all -> 0x01d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092 A[Catch:{ all -> 0x01d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095 A[Catch:{ all -> 0x01d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098 A[Catch:{ all -> 0x01d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020a  */
    /* renamed from: ˋ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection m1218(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r18
            boolean r0 = r1.f8656
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            r3 = 2
            r4 = 1
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x01d6 }
            r5 = r19
            r0.<init>(r5)     // Catch:{ all -> 0x01d4 }
            boolean r6 = r1.f8655     // Catch:{ all -> 0x01d4 }
            r10 = 23536(0x5bf0, float:3.2981E-41)
            r11 = 3
            r12 = 14063(0x36ef, float:1.9706E-41)
            r13 = 4585(0x11e9, float:6.425E-42)
            r14 = 58109(0xe2fd, float:8.1428E-41)
            r15 = 6
            r16 = 5
            r17 = 0
            if (r6 == 0) goto L_0x00ae
            int r6 = getMax
            int r6 = r6 + 35
            int r2 = r6 % 128
            setMax = r2
            int r6 = r6 % r3
            if (r6 != 0) goto L_0x0038
            com.appsflyer.internal.am r2 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x01d4 }
            r6 = 13
            int r6 = r6 / 0
            if (r2 != 0) goto L_0x0043
            goto L_0x003c
        L_0x0038:
            com.appsflyer.internal.am r2 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x01d4 }
            if (r2 != 0) goto L_0x0043
        L_0x003c:
            com.appsflyer.internal.am r2 = new com.appsflyer.internal.am     // Catch:{ all -> 0x01d4 }
            r2.<init>()     // Catch:{ all -> 0x01d4 }
            com.appsflyer.internal.am.f8691 = r2     // Catch:{ all -> 0x01d4 }
        L_0x0043:
            com.appsflyer.internal.am r2 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x01d4 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x01d4 }
            java.lang.String r7 = r1.f8653     // Catch:{ all -> 0x01d4 }
            java.lang.String r8 = "server_request"
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ all -> 0x01d4 }
            r9[r17] = r7     // Catch:{ all -> 0x01d4 }
            r2.m1247(r8, r6, r9)     // Catch:{ all -> 0x01d4 }
            java.lang.String r2 = r1.f8653     // Catch:{ all -> 0x01d4 }
            char[] r6 = new char[r15]     // Catch:{ all -> 0x01d4 }
            r6[r17] = r14     // Catch:{ all -> 0x01d4 }
            r6[r4] = r13     // Catch:{ all -> 0x01d4 }
            r6[r3] = r12     // Catch:{ all -> 0x01d4 }
            r6[r11] = r10     // Catch:{ all -> 0x01d4 }
            r7 = 30872(0x7898, float:4.3261E-41)
            r8 = 4
            r6[r8] = r7     // Catch:{ all -> 0x01d4 }
            r7 = 40328(0x9d88, float:5.6512E-41)
            r6[r16] = r7     // Catch:{ all -> 0x01d4 }
            java.lang.String r6 = length(r6)     // Catch:{ all -> 0x01d4 }
            java.lang.String r6 = r6.intern()     // Catch:{ all -> 0x01d4 }
            byte[] r2 = r2.getBytes(r6)     // Catch:{ all -> 0x01d4 }
            int r2 = r2.length     // Catch:{ all -> 0x01d4 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d4 }
            java.lang.String r7 = "call = "
            r6.<init>(r7)     // Catch:{ all -> 0x01d4 }
            r6.append(r0)     // Catch:{ all -> 0x01d4 }
            java.lang.String r7 = "; size = "
            r6.append(r7)     // Catch:{ all -> 0x01d4 }
            r6.append(r2)     // Catch:{ all -> 0x01d4 }
            java.lang.String r7 = " byte"
            r6.append(r7)     // Catch:{ all -> 0x01d4 }
            if (r2 <= r4) goto L_0x0092
            r2 = 1
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            if (r2 == 0) goto L_0x0098
            java.lang.String r2 = "s"
            goto L_0x009a
        L_0x0098:
            java.lang.String r2 = ""
        L_0x009a:
            r6.append(r2)     // Catch:{ all -> 0x01d4 }
            java.lang.String r2 = "; body = "
            r6.append(r2)     // Catch:{ all -> 0x01d4 }
            java.lang.String r2 = r1.f8653     // Catch:{ all -> 0x01d4 }
            r6.append(r2)     // Catch:{ all -> 0x01d4 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x01d4 }
            com.appsflyer.AFFacebookDeferredDeeplink.AnonymousClass4.m1122(r2)     // Catch:{ all -> 0x01d4 }
        L_0x00ae:
            java.lang.String r2 = "AppsFlyer"
            int r2 = r2.hashCode()     // Catch:{ all -> 0x01d4 }
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ all -> 0x01d4 }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ all -> 0x01d4 }
            java.lang.Object r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)     // Catch:{ all -> 0x01d4 }
            java.net.URLConnection r2 = (java.net.URLConnection) r2     // Catch:{ all -> 0x01d4 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x01d4 }
            r6 = 30000(0x7530, float:4.2039E-41)
            r2.setReadTimeout(r6)     // Catch:{ all -> 0x01d2 }
            r2.setConnectTimeout(r6)     // Catch:{ all -> 0x01d2 }
            java.lang.String r6 = "POST"
            r2.setRequestMethod(r6)     // Catch:{ all -> 0x01d2 }
            r2.setDoInput(r4)     // Catch:{ all -> 0x01d2 }
            r2.setDoOutput(r4)     // Catch:{ all -> 0x01d2 }
            java.lang.String r6 = "Content-Type"
            java.lang.String r7 = "application/json"
            r2.setRequestProperty(r6, r7)     // Catch:{ all -> 0x01d2 }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ all -> 0x01d2 }
            java.io.BufferedWriter r7 = new java.io.BufferedWriter     // Catch:{ all -> 0x01d2 }
            java.io.OutputStreamWriter r8 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x01d2 }
            char[] r9 = new char[r15]     // Catch:{ all -> 0x01d2 }
            r9[r17] = r14     // Catch:{ all -> 0x01d2 }
            r9[r4] = r13     // Catch:{ all -> 0x01d2 }
            r9[r3] = r12     // Catch:{ all -> 0x01d2 }
            r9[r11] = r10     // Catch:{ all -> 0x01d2 }
            r10 = 30872(0x7898, float:4.3261E-41)
            r11 = 4
            r9[r11] = r10     // Catch:{ all -> 0x01d2 }
            r10 = 40328(0x9d88, float:5.6512E-41)
            r9[r16] = r10     // Catch:{ all -> 0x01d2 }
            java.lang.String r9 = length(r9)     // Catch:{ all -> 0x01d2 }
            java.lang.String r9 = r9.intern()     // Catch:{ all -> 0x01d2 }
            r8.<init>(r6, r9)     // Catch:{ all -> 0x01d2 }
            r7.<init>(r8)     // Catch:{ all -> 0x01d2 }
            java.lang.String r8 = r1.f8653     // Catch:{ all -> 0x01d2 }
            r7.write(r8)     // Catch:{ all -> 0x01d2 }
            r7.flush()     // Catch:{ all -> 0x01d2 }
            r7.close()     // Catch:{ all -> 0x01d2 }
            r6.close()     // Catch:{ all -> 0x01d2 }
            r2.connect()     // Catch:{ all -> 0x01d2 }
            int r6 = r2.getResponseCode()     // Catch:{ all -> 0x01d2 }
            boolean r7 = r1.f8654     // Catch:{ all -> 0x01d2 }
            r8 = 88
            if (r7 == 0) goto L_0x0125
            r7 = 88
            goto L_0x0127
        L_0x0125:
            r7 = 43
        L_0x0127:
            if (r7 == r8) goto L_0x012a
            goto L_0x0145
        L_0x012a:
            int r7 = setMax
            int r7 = r7 + 23
            int r9 = r7 % 128
            getMax = r9
            int r7 = r7 % r3
            com.appsflyer.AppsFlyerLibCore.getInstance()     // Catch:{ all -> 0x01d2 }
            java.lang.String r7 = com.appsflyer.AppsFlyerLibCore.m1170((java.net.HttpURLConnection) r2)     // Catch:{ all -> 0x01d2 }
            r1.f8652 = r7     // Catch:{ all -> 0x01d2 }
            int r7 = setMax
            int r7 = r7 + 7
            int r9 = r7 % 128
            getMax = r9
            int r7 = r7 % r3
        L_0x0145:
            boolean r7 = r1.f8655     // Catch:{ all -> 0x01d2 }
            if (r7 == 0) goto L_0x014b
            r7 = 0
            goto L_0x014c
        L_0x014b:
            r7 = 1
        L_0x014c:
            if (r7 == r4) goto L_0x0179
            com.appsflyer.internal.am r7 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x01d2 }
            if (r7 != 0) goto L_0x0159
            com.appsflyer.internal.am r7 = new com.appsflyer.internal.am     // Catch:{ all -> 0x01d2 }
            r7.<init>()     // Catch:{ all -> 0x01d2 }
            com.appsflyer.internal.am.f8691 = r7     // Catch:{ all -> 0x01d2 }
        L_0x0159:
            com.appsflyer.internal.am r7 = com.appsflyer.internal.am.f8691     // Catch:{ all -> 0x01d2 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x01d2 }
            java.lang.String r10 = r1.f8652     // Catch:{ all -> 0x01d2 }
            java.lang.String r11 = "server_response"
            java.lang.String[] r12 = new java.lang.String[r3]     // Catch:{ all -> 0x01d2 }
            java.lang.String r13 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01d2 }
            r12[r17] = r13     // Catch:{ all -> 0x01d2 }
            r12[r4] = r10     // Catch:{ all -> 0x01d2 }
            r7.m1247(r11, r9, r12)     // Catch:{ all -> 0x01d2 }
            int r7 = setMax
            int r7 = r7 + 73
            int r9 = r7 % 128
            getMax = r9
            int r7 = r7 % r3
        L_0x0179:
            r7 = 200(0xc8, float:2.8E-43)
            r9 = 31
            if (r6 != r7) goto L_0x0181
            r6 = 5
            goto L_0x0183
        L_0x0181:
            r6 = 31
        L_0x0183:
            if (r6 == r9) goto L_0x01cf
            java.lang.String r6 = "Status 200 ok"
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ all -> 0x01d2 }
            java.lang.ref.WeakReference<android.content.Context> r6 = r1.f8657     // Catch:{ all -> 0x01d2 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x01d2 }
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01d2 }
            java.lang.String r7 = "https://%sregister.%s/api/v4.11/androidevent?buildnumber=5.1.1&app_id="
            java.lang.String r7 = com.appsflyer.ServerConfigHandler.getUrl(r7)     // Catch:{ all -> 0x01d2 }
            boolean r0 = r0.startsWith(r7)     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01a4
            r17 = 1
        L_0x01a4:
            if (r17 == 0) goto L_0x01e9
            int r0 = getMax
            int r0 = r0 + 79
            int r7 = r0 % 128
            setMax = r7
            int r0 = r0 % r3
            if (r6 == 0) goto L_0x01b4
            r0 = 88
            goto L_0x01b6
        L_0x01b4:
            r0 = 91
        L_0x01b6:
            if (r0 == r8) goto L_0x01b9
            goto L_0x01e9
        L_0x01b9:
            android.content.SharedPreferences r0 = com.appsflyer.AppsFlyerLibCore.m1180((android.content.Context) r6)     // Catch:{ all -> 0x01d2 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x01d2 }
            java.lang.String r6 = "sentRegisterRequestToAF"
            r0.putBoolean(r6, r4)     // Catch:{ all -> 0x01d2 }
            r0.apply()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "Successfully registered for Uninstall Tracking"
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x01e9
        L_0x01cf:
            r1.f8651 = r4     // Catch:{ all -> 0x01d2 }
            goto L_0x01e9
        L_0x01d2:
            r0 = move-exception
            goto L_0x01da
        L_0x01d4:
            r0 = move-exception
            goto L_0x01d9
        L_0x01d6:
            r0 = move-exception
            r5 = r19
        L_0x01d9:
            r2 = 0
        L_0x01da:
            java.lang.String r5 = java.lang.String.valueOf(r19)
            java.lang.String r6 = "Error while calling "
            java.lang.String r5 = r6.concat(r5)
            com.appsflyer.AFLogger.afErrorLog(r5, r0)
            r1.f8651 = r4
        L_0x01e9:
            boolean r0 = r1.f8651
            if (r0 == 0) goto L_0x020a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Connection error: "
            r0.<init>(r4)
            java.lang.String r4 = r1.f8652
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
            int r0 = getMax
            int r0 = r0 + 115
            int r4 = r0 % 128
            setMax = r4
            int r0 = r0 % r3
            goto L_0x021d
        L_0x020a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Connection call succeeded: "
            r0.<init>(r3)
            java.lang.String r3 = r1.f8652
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
        L_0x021d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ac.m1218(java.lang.String):java.net.HttpURLConnection");
    }

    private static String length(char[] cArr) {
        char c;
        int length2;
        try {
            int i = setMax + 65;
            getMax = i % 128;
            int i2 = 1;
            if (!(i % 2 == 0)) {
                c = cArr[1];
                length2 = cArr.length / 1;
            } else {
                c = cArr[0];
                length2 = cArr.length - 1;
            }
            char[] cArr2 = new char[length2];
            while (true) {
                if ((i2 < cArr.length ? '\\' : 7) == 7) {
                    return new String(cArr2);
                }
                cArr2[i2 - 1] = (char) ((int) (((long) (cArr[i2] ^ (i2 * c))) ^ length));
                i2++;
                int i3 = getMax + 73;
                setMax = i3 % 128;
                int i4 = i3 % 2;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
