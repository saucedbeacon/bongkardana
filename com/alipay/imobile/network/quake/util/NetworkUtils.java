package com.alipay.imobile.network.quake.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class NetworkUtils {
    public static final int NETWORK_TYPE_2G = 1;
    public static final int NETWORK_TYPE_3G = 2;
    public static final int NETWORK_TYPE_4G = 4;
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_HSPAP = 15;
    public static final int NETWORK_TYPE_INVALID = 0;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_WIFI = 3;

    private NetworkUtils() {
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static int getMobileNetworkClass(int i) {
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
                return 2;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    @TargetApi(3)
    public static int getMobileNetworkClass(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 0;
        }
        return getMobileNetworkClass(networkInfo.getSubtype());
    }

    public static int getNetType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public static int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
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

    public static SSLSocketFactory getTrustAllSslSocketFactory() {
        try {
            AnonymousClass1 r1 = new X509TrustManager() {
                public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public final X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            SSLContext instance = SSLContext.getInstance("TLS");
            String str = Quake.TAG;
            StringBuilder sb = new StringBuilder("sslContext.getProtocol()=%s");
            sb.append(instance.getProtocol());
            LoggerWrapper.i(str, sb.toString());
            instance.init((KeyManager[]) null, new TrustManager[]{r1}, new SecureRandom());
            return instance.getSocketFactory();
        } catch (Exception e) {
            LoggerWrapper.e(Quake.TAG, "unable to general ssl socket factory", e);
            return null;
        }
    }

    public static boolean is2GMobileNetwork(Context context) {
        return context != null && getNetworkType(context) == 1;
    }

    public static boolean is3GMobileNetwork(Context context) {
        return context != null && getNetworkType(context) == 2;
    }

    public static boolean is3GMobileNetwork(NetworkInfo networkInfo) {
        return networkInfo != null && getMobileNetworkClass(networkInfo) == 2;
    }

    public static boolean is4GMobileNetwork(Context context) {
        return context != null && getNetworkType(context) == 4;
    }

    public static boolean is4GMobileNetwork(NetworkInfo networkInfo) {
        return networkInfo != null && getMobileNetworkClass(networkInfo) == 4;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
            if (allNetworkInfo == null) {
                LoggerWrapper.d(Quake.TAG, "can not get network info");
                return false;
            }
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (LoggerWrapper.isDebuggable()) {
                    LoggerWrapper.d(Quake.TAG, LoggerWrapper.buildMessage("Detailed=%s, Extra=%s, Reason=%s, State=%s, Subtype=%s, stN=%s, Type=%s, tN=%s, isA=%s, isC=%s, isConing=%s, isF=%s, isR=%s, des=%s, toS=%s", networkInfo.getDetailedState().toString(), networkInfo.getExtraInfo(), networkInfo.getReason(), networkInfo.getState(), Integer.valueOf(networkInfo.getSubtype()), networkInfo.getSubtypeName(), Integer.valueOf(networkInfo.getType()), networkInfo.getTypeName(), Boolean.valueOf(networkInfo.isAvailable()), Boolean.valueOf(networkInfo.isConnected()), Boolean.valueOf(networkInfo.isConnectedOrConnecting()), Boolean.valueOf(networkInfo.isFailover()), Boolean.valueOf(networkInfo.isRoaming()), Integer.valueOf(networkInfo.describeContents()), networkInfo.toString()));
                }
                if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerWrapper.e(Quake.TAG, "", e);
            return false;
        }
    }

    public static boolean isWiFiMobileNetwork(Context context) {
        return context != null && getNetworkType(context) == 3;
    }
}
