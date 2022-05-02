package com.ta.audid.g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f9846a = {"Unknown", "Unknown"};

    public static boolean isConnectInternet(Context context) {
        if (context == null) {
            return true;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
                return true;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}
