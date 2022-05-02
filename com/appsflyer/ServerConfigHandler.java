package com.appsflyer;

public class ServerConfigHandler {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    @androidx.annotation.Nullable
    /* renamed from: ˊ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static org.json.JSONObject m1212(java.lang.String r5) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b6, all -> 0x008d }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x00b6, all -> 0x008d }
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            java.lang.String r2 = "disableProxy"
            r3 = 0
            boolean r5 = r5.getBoolean(r2, r3)     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            java.lang.String r2 = "monitor"
            boolean r2 = r1.optBoolean(r2, r3)     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            if (r2 == 0) goto L_0x002c
            if (r5 != 0) goto L_0x002c
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            if (r5 != 0) goto L_0x0026
            com.appsflyer.internal.am r5 = new com.appsflyer.internal.am     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            r5.<init>()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            com.appsflyer.internal.am.f8691 = r5     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
        L_0x0026:
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            r5.m1252()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            goto L_0x004c
        L_0x002c:
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            if (r5 != 0) goto L_0x0037
            com.appsflyer.internal.am r5 = new com.appsflyer.internal.am     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            r5.<init>()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            com.appsflyer.internal.am.f8691 = r5     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
        L_0x0037:
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            r5.m1251()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            if (r5 != 0) goto L_0x0047
            com.appsflyer.internal.am r5 = new com.appsflyer.internal.am     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            r5.<init>()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            com.appsflyer.internal.am.f8691 = r5     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
        L_0x0047:
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            r5.m1248()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
        L_0x004c:
            java.lang.String r5 = "ol_id"
            boolean r5 = r1.has(r5)     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            if (r5 == 0) goto L_0x00d8
            java.lang.String r5 = "ol_scheme"
            java.lang.String r5 = r1.optString(r5, r0)     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            java.lang.String r2 = "ol_domain"
            java.lang.String r2 = r1.optString(r2, r0)     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            java.lang.String r3 = "ol_ver"
            java.lang.String r0 = r1.optString(r3, r0)     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            if (r5 == 0) goto L_0x0071
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            java.lang.String r4 = "onelinkScheme"
            r3.set((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
        L_0x0071:
            if (r2 == 0) goto L_0x007c
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            java.lang.String r3 = "onelinkDomain"
            r5.set((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
        L_0x007c:
            if (r0 == 0) goto L_0x00d8
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            java.lang.String r2 = "onelinkVersion"
            r5.set((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ JSONException -> 0x008b, all -> 0x0088 }
            goto L_0x00d8
        L_0x0088:
            r5 = move-exception
            r0 = r1
            goto L_0x008e
        L_0x008b:
            r0 = r1
            goto L_0x00b7
        L_0x008d:
            r5 = move-exception
        L_0x008e:
            java.lang.String r1 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r1, r5)
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691
            if (r5 != 0) goto L_0x00a0
            com.appsflyer.internal.am r5 = new com.appsflyer.internal.am
            r5.<init>()
            com.appsflyer.internal.am.f8691 = r5
        L_0x00a0:
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691
            r5.m1251()
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691
            if (r5 != 0) goto L_0x00b0
            com.appsflyer.internal.am r5 = new com.appsflyer.internal.am
            r5.<init>()
            com.appsflyer.internal.am.f8691 = r5
        L_0x00b0:
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691
            r5.m1248()
            goto L_0x00d7
        L_0x00b6:
        L_0x00b7:
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691
            if (r5 != 0) goto L_0x00c2
            com.appsflyer.internal.am r5 = new com.appsflyer.internal.am
            r5.<init>()
            com.appsflyer.internal.am.f8691 = r5
        L_0x00c2:
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691
            r5.m1251()
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691
            if (r5 != 0) goto L_0x00d2
            com.appsflyer.internal.am r5 = new com.appsflyer.internal.am
            r5.<init>()
            com.appsflyer.internal.am.f8691 = r5
        L_0x00d2:
            com.appsflyer.internal.am r5 = com.appsflyer.internal.am.f8691
            r5.m1248()
        L_0x00d7:
            r1 = r0
        L_0x00d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.ServerConfigHandler.m1212(java.lang.String):org.json.JSONObject");
    }

    public static String getUrl(String str) {
        return String.format(str, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AppsFlyerLibCore.getInstance().getHostName()});
    }
}
