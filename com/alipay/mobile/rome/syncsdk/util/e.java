package com.alipay.mobile.rome.syncsdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import org.apache.http.HttpHost;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9461a = e.class.getSimpleName();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r5.length() > 0) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r5) {
        /*
            java.lang.String r0 = "internet"
            java.lang.String r1 = "wifi"
            r2 = 0
            java.lang.String r3 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch:{ Exception -> 0x0049 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ Exception -> 0x0049 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0049 }
            if (r5 == 0) goto L_0x0062
            java.lang.String r3 = r5.getTypeName()     // Catch:{ Exception -> 0x0049 }
            if (r3 == 0) goto L_0x0045
            int r4 = r3.length()     // Catch:{ Exception -> 0x0049 }
            if (r4 <= 0) goto L_0x0045
            boolean r4 = r1.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x0049 }
            if (r4 == 0) goto L_0x0028
            r0 = r1
            goto L_0x0063
        L_0x0028:
            boolean r1 = r0.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x0049 }
            if (r1 == 0) goto L_0x002f
            goto L_0x0063
        L_0x002f:
            java.lang.String r0 = "mobile"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x0049 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r5 = r5.getExtraInfo()     // Catch:{ Exception -> 0x0049 }
            if (r5 == 0) goto L_0x0062
            int r0 = r5.length()     // Catch:{ Exception -> 0x0049 }
            if (r0 <= 0) goto L_0x0062
        L_0x0043:
            r0 = r5
            goto L_0x0063
        L_0x0045:
            java.lang.String r5 = "unknown"
            goto L_0x0043
        L_0x0049:
            r5 = move-exception
            java.lang.String r0 = f9461a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "getActiveNetType: [ Exception "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r5 = " ]"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.alipay.mobile.rome.syncsdk.util.c.d(r0, r5)
        L_0x0062:
            r0 = r2
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncsdk.util.e.a(android.content.Context):java.lang.String");
    }

    public static boolean b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            String str = f9461a;
            StringBuilder sb = new StringBuilder("isNetAvailable: [ Exception ");
            sb.append(e);
            sb.append(" ]");
            c.d(str, sb.toString());
            return false;
        }
    }

    public static HttpHost a() {
        try {
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (defaultHost == null || defaultHost.length() <= 0 || defaultPort <= 0) {
                return null;
            }
            return new HttpHost(defaultHost, defaultPort);
        } catch (Exception e) {
            String str = f9461a;
            StringBuilder sb = new StringBuilder("getProxy: [ Exception ");
            sb.append(e);
            sb.append(" ]");
            c.d(str, sb.toString());
            return null;
        }
    }

    public static int c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.getType();
            }
            return -1;
        } catch (Exception e) {
            String str = f9461a;
            StringBuilder sb = new StringBuilder("getNetworkType: [ Exception ");
            sb.append(e);
            sb.append(" ]");
            c.d(str, sb.toString());
            return -1;
        }
    }
}
