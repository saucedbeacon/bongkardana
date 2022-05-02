package com.appsflyer;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

public abstract class OneLinkHttpTask implements Runnable {

    /* renamed from: ˊ  reason: contains not printable characters */
    private HttpsUrlConnectionProvider f8637;

    /* renamed from: ˋ  reason: contains not printable characters */
    private AppsFlyerLibCore f8638;

    /* renamed from: ˎ  reason: contains not printable characters */
    public String f8639;

    /* access modifiers changed from: protected */
    /* renamed from: ˊ  reason: contains not printable characters */
    public abstract void m1207(String str);

    /* access modifiers changed from: protected */
    /* renamed from: ˎ  reason: contains not printable characters */
    public abstract void m1208(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    /* access modifiers changed from: protected */
    /* renamed from: ˏ  reason: contains not printable characters */
    public abstract void m1209();

    /* access modifiers changed from: protected */
    /* renamed from: ॱ  reason: contains not printable characters */
    public abstract String m1210();

    public OneLinkHttpTask(AppsFlyerLibCore appsFlyerLibCore) {
        this.f8638 = appsFlyerLibCore;
    }

    public void setConnProvider(HttpsUrlConnectionProvider httpsUrlConnectionProvider) {
        this.f8637 = httpsUrlConnectionProvider;
    }

    public static class HttpsUrlConnectionProvider {
        /* renamed from: ˊ  reason: contains not printable characters */
        static HttpsURLConnection m1211(String str) throws IOException {
            return (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.String r3 = r9.m1210()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "oneLinkUrl: "
            java.lang.String r4 = r5.concat(r4)
            com.appsflyer.AFLogger.afRDLog(r4)
            javax.net.ssl.HttpsURLConnection r4 = com.appsflyer.OneLinkHttpTask.HttpsUrlConnectionProvider.m1211(r3)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "content-type"
            java.lang.String r6 = "application/json"
            r4.addRequestProperty(r5, r6)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "authorization"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r6.<init>()     // Catch:{ all -> 0x0086 }
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0086 }
            java.lang.String r8 = "AppsFlyerKey"
            java.lang.String r7 = r7.getString(r8)     // Catch:{ all -> 0x0086 }
            r6.append(r7)     // Catch:{ all -> 0x0086 }
            r6.append(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0086 }
            java.lang.String r6 = com.appsflyer.internal.af.m1229(r6)     // Catch:{ all -> 0x0086 }
            r4.addRequestProperty(r5, r6)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "af-timestamp"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0086 }
            r4.addRequestProperty(r5, r1)     // Catch:{ all -> 0x0086 }
            r1 = 3000(0xbb8, float:4.204E-42)
            r4.setReadTimeout(r1)     // Catch:{ all -> 0x0086 }
            r4.setConnectTimeout(r1)     // Catch:{ all -> 0x0086 }
            r9.m1208(r4)     // Catch:{ all -> 0x0086 }
            int r1 = r4.getResponseCode()     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = com.appsflyer.AppsFlyerLibCore.m1170((java.net.HttpURLConnection) r4)     // Catch:{ all -> 0x0086 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r1 != r4) goto L_0x006d
            java.lang.String r1 = "Status 200 ok"
            com.appsflyer.AFLogger.afInfoLog(r1)     // Catch:{ all -> 0x0084 }
            goto L_0x00ae
        L_0x006d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = "Response code = "
            r0.<init>(r4)     // Catch:{ all -> 0x0084 }
            r0.append(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = " content = "
            r0.append(r1)     // Catch:{ all -> 0x0084 }
            r0.append(r2)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0084 }
            goto L_0x00ae
        L_0x0084:
            r0 = move-exception
            goto L_0x0089
        L_0x0086:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0089:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Error while calling "
            java.lang.String r1 = r4.concat(r1)
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r3 = " stacktrace: "
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ae:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00c5
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Connection call succeeded: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            r9.m1207(r2)
            return
        L_0x00c5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Connection error: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.afWarnLog(r0)
            r9.m1209()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.OneLinkHttpTask.run():void");
    }
}
