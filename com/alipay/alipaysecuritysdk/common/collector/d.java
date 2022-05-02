package com.alipay.alipaysecuritysdk.common.collector;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Base64;
import com.alipay.alipaysecuritysdk.common.c.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public String f9274a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    private Context k;
    private volatile int l = 0;

    private d() {
    }

    public static d a(Context context) {
        WifiManager wifiManager;
        d dVar = new d();
        dVar.k = context;
        try {
            if (com.alipay.alipaysecuritysdk.common.e.d.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
                NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
                StringBuilder sb = new StringBuilder();
                sb.append(networkInfo.isConnected());
                dVar.e = sb.toString();
            }
            if (com.alipay.alipaysecuritysdk.common.e.d.b(context, "android.permission.ACCESS_WIFI_STATE") && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null && wifiManager.isWifiEnabled()) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                dVar.c = connectionInfo.getBSSID();
                dVar.d = Base64.encodeToString(connectionInfo.getSSID().getBytes(), 8);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(connectionInfo.getRssi());
                dVar.f = sb2.toString();
            }
        } catch (Exception e2) {
            b.a("SEC_SDK-tool", (Throwable) e2);
        }
        return dVar;
    }
}
