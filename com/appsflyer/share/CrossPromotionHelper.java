package com.appsflyer.share;

import android.content.Context;
import android.os.AsyncTask;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.an;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {
    public static void trackAndOpenStore(Context context, String str, String str2) {
        trackAndOpenStore(context, str, str2, (Map<String, String>) null);
    }

    public static void trackAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator r4 = m1348(context, str, str2, map, ServerConfigHandler.getUrl(Constants.BASE_URL_APP_APPSFLYER_COM));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("af_campaign", str2);
        AppsFlyerLib.getInstance().trackEvent(context, "af_cross_promotion", hashMap);
        new a(new an(), context, AppsFlyerLib.getInstance().isTrackingStopped()).execute(new String[]{r4.generateLink()});
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }
        LinkGenerator r4 = m1348(context, str, str2, (Map<String, String>) null, ServerConfigHandler.getUrl("https://%simpression.%s"));
        new a((an) null, (Context) null, AppsFlyerLib.getInstance().isTrackingStopped()).execute(new String[]{r4.generateLink()});
    }

    /* renamed from: ˊ  reason: contains not printable characters */
    private static LinkGenerator m1348(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.f8930 = str3;
        linkGenerator.f8932 = str;
        linkGenerator.addParameter(Constants.URL_SITE_ID, context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        if (string != null) {
            linkGenerator.addParameter(Constants.URL_ADVERTISING_ID, string);
        }
        return linkGenerator;
    }

    static class a extends AsyncTask<String, Void, Void> {

        /* renamed from: ˊ  reason: contains not printable characters */
        private boolean f8924;

        /* renamed from: ˋ  reason: contains not printable characters */
        private an f8925;

        /* renamed from: ॱ  reason: contains not printable characters */
        private WeakReference<Context> f8926;

        a(an anVar, Context context, boolean z) {
            this.f8925 = anVar;
            this.f8926 = new WeakReference<>(context);
            this.f8924 = z;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a2, code lost:
            if (r2 != null) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
            return null;
         */
        /* renamed from: ˋ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                boolean r0 = r5.f8924
                r1 = 0
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                r0 = 0
                r6 = r6[r0]     // Catch:{ all -> 0x00a7 }
                java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x00a7 }
                r2.<init>(r6)     // Catch:{ all -> 0x00a7 }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ all -> 0x00a7 }
                java.lang.Object r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)     // Catch:{ all -> 0x00a7 }
                java.net.URLConnection r2 = (java.net.URLConnection) r2     // Catch:{ all -> 0x00a7 }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x00a7 }
                r3 = 10000(0x2710, float:1.4013E-41)
                r2.setConnectTimeout(r3)     // Catch:{ all -> 0x00a5 }
                r2.setInstanceFollowRedirects(r0)     // Catch:{ all -> 0x00a5 }
                int r3 = r2.getResponseCode()     // Catch:{ all -> 0x00a5 }
                r4 = 200(0xc8, float:2.8E-43)
                if (r3 != r4) goto L_0x0038
                java.lang.String r3 = "Cross promotion impressions success: "
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00a5 }
                java.lang.String r6 = r3.concat(r6)     // Catch:{ all -> 0x00a5 }
                com.appsflyer.AFLogger.afInfoLog(r6, r0)     // Catch:{ all -> 0x00a5 }
                goto L_0x00a2
            L_0x0038:
                r4 = 301(0x12d, float:4.22E-43)
                if (r3 == r4) goto L_0x005b
                r4 = 302(0x12e, float:4.23E-43)
                if (r3 != r4) goto L_0x0041
                goto L_0x005b
            L_0x0041:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
                java.lang.String r4 = "call to "
                r0.<init>(r4)     // Catch:{ all -> 0x00a5 }
                r0.append(r6)     // Catch:{ all -> 0x00a5 }
                java.lang.String r6 = " failed: "
                r0.append(r6)     // Catch:{ all -> 0x00a5 }
                r0.append(r3)     // Catch:{ all -> 0x00a5 }
                java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x00a5 }
                com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ all -> 0x00a5 }
                goto L_0x00a2
            L_0x005b:
                java.lang.String r3 = "Cross promotion redirection success: "
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00a5 }
                java.lang.String r6 = r3.concat(r6)     // Catch:{ all -> 0x00a5 }
                com.appsflyer.AFLogger.afInfoLog(r6, r0)     // Catch:{ all -> 0x00a5 }
                com.appsflyer.internal.an r6 = r5.f8925     // Catch:{ all -> 0x00a5 }
                if (r6 == 0) goto L_0x00a2
                java.lang.ref.WeakReference<android.content.Context> r6 = r5.f8926     // Catch:{ all -> 0x00a5 }
                java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x00a5 }
                if (r6 == 0) goto L_0x00a2
                java.lang.String r6 = "Location"
                java.lang.String r6 = r2.getHeaderField(r6)     // Catch:{ all -> 0x00a5 }
                com.appsflyer.internal.an r0 = r5.f8925     // Catch:{ all -> 0x00a5 }
                r0.f8877 = r6     // Catch:{ all -> 0x00a5 }
                com.appsflyer.internal.an r6 = r5.f8925     // Catch:{ all -> 0x00a5 }
                java.lang.ref.WeakReference<android.content.Context> r0 = r5.f8926     // Catch:{ all -> 0x00a5 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00a5 }
                android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x00a5 }
                java.lang.String r3 = r6.f8877     // Catch:{ all -> 0x00a5 }
                if (r3 == 0) goto L_0x00a2
                android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x00a5 }
                java.lang.String r4 = "android.intent.action.VIEW"
                java.lang.String r6 = r6.f8877     // Catch:{ all -> 0x00a5 }
                android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ all -> 0x00a5 }
                r3.<init>(r4, r6)     // Catch:{ all -> 0x00a5 }
                r6 = 268435456(0x10000000, float:2.5243549E-29)
                android.content.Intent r6 = r3.setFlags(r6)     // Catch:{ all -> 0x00a5 }
                r0.startActivity(r6)     // Catch:{ all -> 0x00a5 }
            L_0x00a2:
                if (r2 == 0) goto L_0x00b6
                goto L_0x00b3
            L_0x00a5:
                r6 = move-exception
                goto L_0x00a9
            L_0x00a7:
                r6 = move-exception
                r2 = r1
            L_0x00a9:
                java.lang.String r0 = r6.getMessage()     // Catch:{ all -> 0x00b7 }
                r3 = 1
                com.appsflyer.AFLogger.afErrorLog(r0, r6, r3)     // Catch:{ all -> 0x00b7 }
                if (r2 == 0) goto L_0x00b6
            L_0x00b3:
                r2.disconnect()
            L_0x00b6:
                return r1
            L_0x00b7:
                r6 = move-exception
                if (r2 == 0) goto L_0x00bd
                r2.disconnect()
            L_0x00bd:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.a.doInBackground(java.lang.String[]):java.lang.Void");
        }
    }
}
