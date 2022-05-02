package com.alipay.iap.android.aplog.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

public class NetworkUtils {
    public static final int ANDROID_NETWORK_CLASS_2_G = 1;
    public static final int ANDROID_NETWORK_CLASS_3_G = 2;
    public static final int ANDROID_NETWORK_CLASS_4_G = 3;
    public static final int NETWORK_TYPE_2G = 1;
    public static final int NETWORK_TYPE_3G = 2;
    public static final int NETWORK_TYPE_4G = 4;
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_HSPAP = 15;
    public static final int NETWORK_TYPE_INVALID = 0;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_WIFI = 3;
    public static final String TAG = "LogNetworkUtils";

    public static boolean isWiFiMobileNetwork(Context context) {
        return context != null && getNetworkType(context) == 3;
    }

    public static boolean is4GMobileNetwork(NetworkInfo networkInfo) {
        return networkInfo != null && getMobileNetworkClass(networkInfo) == 4;
    }

    public static boolean is4GMobileNetwork(Context context) {
        return context != null && getNetworkType(context) == 4;
    }

    public static boolean is3GMobileNetwork(Context context) {
        return context != null && getNetworkType(context) == 2;
    }

    public static boolean is3GMobileNetwork(NetworkInfo networkInfo) {
        return networkInfo != null && getMobileNetworkClass(networkInfo) == 2;
    }

    public static boolean is2GMobileNetwork(Context context) {
        return context != null && getNetworkType(context) == 1;
    }

    public static int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 3;
        }
        if (type == 0) {
            return getMobileNetworkClass(activeNetworkInfo);
        }
        return 0;
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static int getNetType(Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    @TargetApi(3)
    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    @TargetApi(3)
    public static int getMobileNetworkClass(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 0;
        }
        return getMobileNetworkClass(networkInfo.getSubtype());
    }

    public static int getMobileNetworkClass(int i) {
        Class<TelephonyManager> cls = TelephonyManager.class;
        try {
            Integer num = (Integer) cls.getMethod("getNetworkClass", new Class[]{Integer.TYPE}).invoke(TelephonyManager.class, new Object[]{Integer.valueOf(i)});
            if (num.intValue() == 1) {
                return 1;
            }
            if (num.intValue() == 2) {
                return 2;
            }
            return num.intValue() == 3 ? 4 : 0;
        } catch (Throwable unused) {
            if (i != 18) {
                switch (i) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        break;
                    case 13:
                        return 4;
                    default:
                        return 0;
                }
            }
            return 2;
        }
    }
}
