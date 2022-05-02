package com.appsflyer.internal;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerParameters;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public final class am {

    /* renamed from: ˋ  reason: contains not printable characters */
    public static am f8691;

    /* renamed from: ʻ  reason: contains not printable characters */
    private final String f8692 = "android_id";

    /* renamed from: ʻॱ  reason: contains not printable characters */
    private final String f8693 = "channel";

    /* renamed from: ʼ  reason: contains not printable characters */
    private final String f8694 = "imei";

    /* renamed from: ʼॱ  reason: contains not printable characters */
    private final String f8695 = "server_request";

    /* renamed from: ʽ  reason: contains not printable characters */
    private final String f8696 = ServerParameters.ADVERTISING_ID_PARAM;

    /* renamed from: ʽॱ  reason: contains not printable characters */
    private final String f8697 = "exception";

    /* renamed from: ʾ  reason: contains not printable characters */
    private final String f8698 = "server_response";

    /* renamed from: ʿ  reason: contains not printable characters */
    private final String f8699 = "r_debugging_on";

    /* renamed from: ˈ  reason: contains not printable characters */
    private final String f8700 = "public_api_call";

    /* renamed from: ˉ  reason: contains not printable characters */
    private boolean f8701 = true;

    /* renamed from: ˊ  reason: contains not printable characters */
    public boolean f8702;

    /* renamed from: ˊˊ  reason: contains not printable characters */
    private JSONObject f8703;

    /* renamed from: ˊˋ  reason: contains not printable characters */
    private JSONArray f8704;

    /* renamed from: ˊॱ  reason: contains not printable characters */
    private final String f8705 = "sdk_version";

    /* renamed from: ˊᐝ  reason: contains not printable characters */
    private final String f8706 = "yyyy-MM-dd HH:mm:ssZ";

    /* renamed from: ˋˊ  reason: contains not printable characters */
    private final String f8707 = "MM-dd HH:mm:ss.SSS";

    /* renamed from: ˋˋ  reason: contains not printable characters */
    private boolean f8708;

    /* renamed from: ˋॱ  reason: contains not printable characters */
    private final String f8709 = "originalAppsFlyerId";

    /* renamed from: ˌ  reason: contains not printable characters */
    private String f8710 = "-1";

    /* renamed from: ˍ  reason: contains not printable characters */
    private int f8711 = 0;

    /* renamed from: ˎ  reason: contains not printable characters */
    public boolean f8712;

    /* renamed from: ˏ  reason: contains not printable characters */
    private final String f8713 = H5GetLogInfoBridge.RESULT_BRAND;

    /* renamed from: ˏॱ  reason: contains not printable characters */
    private final String f8714 = "app_id";

    /* renamed from: ͺ  reason: contains not printable characters */
    private final String f8715 = "devkey";

    /* renamed from: ॱ  reason: contains not printable characters */
    private final String f8716 = H5GetLogInfoBridge.RESULT_MODEL;

    /* renamed from: ॱˊ  reason: contains not printable characters */
    private final String f8717 = "uid";

    /* renamed from: ॱˋ  reason: contains not printable characters */
    private final String f8718 = "preInstall";

    /* renamed from: ॱˎ  reason: contains not printable characters */
    private final String f8719 = "data";

    /* renamed from: ॱॱ  reason: contains not printable characters */
    private final String f8720 = "platform_version";

    /* renamed from: ॱᐝ  reason: contains not printable characters */
    private final String f8721 = "r_debugging_off";

    /* renamed from: ᐝ  reason: contains not printable characters */
    private final String f8722 = TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_PLATFORM;

    /* renamed from: ᐝॱ  reason: contains not printable characters */
    private final String f8723 = MyProfileMenuAction.APP_VERSION;

    public am() {
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
        this.f8708 = z;
        this.f8712 = true ^ z;
        this.f8704 = new JSONArray();
        this.f8711 = 0;
        this.f8702 = false;
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    public final synchronized void m1250(String str) {
        this.f8710 = str;
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    public final synchronized void m1252() {
        this.f8702 = true;
        m1247("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    public final synchronized void m1248() {
        m1247("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f8702 = false;
        this.f8701 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˎ  reason: contains not printable characters */
    public final synchronized void m1249() {
        this.f8703 = null;
        this.f8704 = null;
        f8691 = null;
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    private synchronized void m1244(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.f8703.put(H5GetLogInfoBridge.RESULT_BRAND, str);
            this.f8703.put(H5GetLogInfoBridge.RESULT_MODEL, str2);
            this.f8703.put(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_PLATFORM, "Android");
            this.f8703.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.f8703.put(ServerParameters.ADVERTISING_ID_PARAM, str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.f8703.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.f8703.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    private synchronized void m1242(String str, String str2, String str3, String str4) {
        try {
            this.f8703.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.f8703.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f8703.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f8703.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private synchronized void m1243(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.f8703.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.f8703.put(MyProfileMenuAction.APP_VERSION, str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.f8703.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.f8703.put("preInstall", str4);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: ˊ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String m1246() {
        /*
            r3 = this;
            monitor-enter(r3)
            org.json.JSONObject r0 = r3.f8703     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            java.lang.String r1 = "data"
            org.json.JSONArray r2 = r3.f8704     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            org.json.JSONObject r0 = r3.f8703     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            r3.m1245()     // Catch:{ JSONException -> 0x0018, all -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0017:
            r0 = 0
        L_0x0018:
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.am.m1246():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)(8:6|7|8|9|10|11|13|14)|15|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x007f */
    /* renamed from: ॱ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m1253(java.lang.String r11, android.content.pm.PackageManager r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x008c }
            com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.getInstance()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "remote_debug_static_data"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0019
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x007f }
            r11.<init>(r2)     // Catch:{ all -> 0x007f }
            r10.f8703 = r11     // Catch:{ all -> 0x007f }
            goto L_0x007f
        L_0x0019:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x008c }
            r2.<init>()     // Catch:{ all -> 0x008c }
            r10.f8703 = r2     // Catch:{ all -> 0x008c }
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ all -> 0x008c }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x008c }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "advertiserId"
            java.lang.String r7 = r0.getString(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r8 = r1.f8599     // Catch:{ all -> 0x008c }
            java.lang.String r9 = r1.f8603     // Catch:{ all -> 0x008c }
            r3 = r10
            r3.m1244(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "5.1.1."
            r1.<init>(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r2 = com.appsflyer.AppsFlyerLibCore.f8575     // Catch:{ all -> 0x008c }
            r1.append(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "AppsFlyerKey"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "KSAppsFlyerId"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x008c }
            java.lang.String r4 = "uid"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x008c }
            r10.m1242(r1, r2, r3, r4)     // Catch:{ all -> 0x008c }
            r1 = 0
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r11, r1)     // Catch:{ all -> 0x0074 }
            int r12 = r12.versionCode     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = "channel"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "preInstallName"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0074 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0074 }
            r10.m1243(r11, r12, r1, r2)     // Catch:{ all -> 0x0074 }
        L_0x0074:
            java.lang.String r11 = "remote_debug_static_data"
            org.json.JSONObject r12 = r10.f8703     // Catch:{ all -> 0x008c }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x008c }
            r0.set((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ all -> 0x008c }
        L_0x007f:
            org.json.JSONObject r11 = r10.f8703     // Catch:{ JSONException -> 0x008a }
            java.lang.String r12 = "launch_counter"
            java.lang.String r0 = r10.f8710     // Catch:{ JSONException -> 0x008a }
            r11.put(r12, r0)     // Catch:{ JSONException -> 0x008a }
            monitor-exit(r10)
            return
        L_0x008a:
            monitor-exit(r10)
            return
        L_0x008c:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.am.m1253(java.lang.String, android.content.pm.PackageManager):void");
    }

    /* renamed from: ᐝ  reason: contains not printable characters */
    private synchronized void m1245() {
        this.f8704 = null;
        this.f8704 = new JSONArray();
        this.f8711 = 0;
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    public final synchronized void m1251() {
        this.f8701 = false;
        m1245();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        return;
     */
    /* renamed from: ˊ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m1247(java.lang.String r12, java.lang.String r13, java.lang.String... r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f8712     // Catch:{ all -> 0x00b5 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r11.f8701     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x000f
            boolean r0 = r11.f8702     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x00b3
            int r0 = r11.f8711     // Catch:{ all -> 0x00b5 }
            r3 = 98304(0x18000, float:1.37753E-40)
            if (r0 < r3) goto L_0x001d
            goto L_0x00b3
        L_0x001d:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = ""
            int r5 = r14.length     // Catch:{ all -> 0x00b1 }
            if (r5 <= 0) goto L_0x0045
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r0.<init>()     // Catch:{ all -> 0x00b1 }
            int r5 = r14.length     // Catch:{ all -> 0x00b1 }
            int r5 = r5 - r1
        L_0x002d:
            if (r5 <= 0) goto L_0x003c
            r6 = r14[r5]     // Catch:{ all -> 0x00b1 }
            r0.append(r6)     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ all -> 0x00b1 }
            int r5 = r5 + -1
            goto L_0x002d
        L_0x003c:
            r14 = r14[r2]     // Catch:{ all -> 0x00b1 }
            r0.append(r14)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b1 }
        L_0x0045:
            java.text.SimpleDateFormat r14 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "MM-dd HH:mm:ss.SSS"
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b1 }
            r14.<init>(r5, r6)     // Catch:{ all -> 0x00b1 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b1 }
            java.lang.String r14 = r14.format(r3)     // Catch:{ all -> 0x00b1 }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 5
            if (r12 == 0) goto L_0x0080
            java.lang.String r7 = "%18s %5s _/%s [%s] %s %s"
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00b1 }
            r8[r2] = r14     // Catch:{ all -> 0x00b1 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b1 }
            long r9 = r14.getId()     // Catch:{ all -> 0x00b1 }
            java.lang.Long r14 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00b1 }
            r8[r1] = r14     // Catch:{ all -> 0x00b1 }
            java.lang.String r14 = "AppsFlyer_5.1.1"
            r8[r5] = r14     // Catch:{ all -> 0x00b1 }
            r8[r4] = r12     // Catch:{ all -> 0x00b1 }
            r8[r3] = r13     // Catch:{ all -> 0x00b1 }
            r8[r6] = r0     // Catch:{ all -> 0x00b1 }
            java.lang.String r12 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a0
        L_0x0080:
            java.lang.String r12 = "%18s %5s %s/%s %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b1 }
            r6[r2] = r14     // Catch:{ all -> 0x00b1 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b1 }
            long r7 = r14.getId()     // Catch:{ all -> 0x00b1 }
            java.lang.Long r14 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00b1 }
            r6[r1] = r14     // Catch:{ all -> 0x00b1 }
            r6[r5] = r13     // Catch:{ all -> 0x00b1 }
            java.lang.String r13 = "AppsFlyer_5.1.1"
            r6[r4] = r13     // Catch:{ all -> 0x00b1 }
            r6[r3] = r0     // Catch:{ all -> 0x00b1 }
            java.lang.String r12 = java.lang.String.format(r12, r6)     // Catch:{ all -> 0x00b1 }
        L_0x00a0:
            org.json.JSONArray r13 = r11.f8704     // Catch:{ all -> 0x00b1 }
            r13.put(r12)     // Catch:{ all -> 0x00b1 }
            int r13 = r11.f8711     // Catch:{ all -> 0x00b1 }
            byte[] r12 = r12.getBytes()     // Catch:{ all -> 0x00b1 }
            int r12 = r12.length     // Catch:{ all -> 0x00b1 }
            int r13 = r13 + r12
            r11.f8711 = r13     // Catch:{ all -> 0x00b1 }
            monitor-exit(r11)
            return
        L_0x00b1:
            monitor-exit(r11)
            return
        L_0x00b3:
            monitor-exit(r11)
            return
        L_0x00b5:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x00b9
        L_0x00b8:
            throw r12
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.am.m1247(java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
