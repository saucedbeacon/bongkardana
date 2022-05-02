package com.alipay.iap.android.aplog.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.common.utils.NetworkUtils;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetUtil {
    private static final long NETWORK_TYPE_FUZZ_TIME = 5000;
    private static final long NETWORK_TYPE_FUZZ_TIME_STRICT = 1000;
    private static final String NOT_GET_NETWORK_TYPE = "unknown";
    private static final String TAG = "LogNetUtil";
    public static final String TYPE_GSM = "GSM";
    public static final String TYPE_TDS_HSDPSA = "TDS-HSDPSA";
    public static final String TYPE_TDS_HSUPA = "TDS-HSUPA";
    public static final String TYPE_TD_CDMA = "TD-CDMA";
    public static final String TYPE_WIFI = "WIFI";
    private static long mPreviousNetworkTime;
    private static long mPreviousNetworkTimeStrict;
    private static String mPreviousNetworkType;
    private static String mPreviousNetworkTypeStrict;

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getNetworkTypeOptimized(Context context) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - mPreviousNetworkTime > 5000) {
            mPreviousNetworkType = NetworkUtils.getNetworkTypeString(context);
            mPreviousNetworkTime = uptimeMillis;
        }
        if (TextUtils.isEmpty(mPreviousNetworkType) || "unknown".equals(mPreviousNetworkType)) {
            mPreviousNetworkType = NetworkUtils.getNetworkTypeString(context);
            mPreviousNetworkTime = uptimeMillis;
        }
        if (TextUtils.isEmpty(mPreviousNetworkType)) {
            mPreviousNetworkType = "unknown";
        }
        return mPreviousNetworkType;
    }

    public static String getNetworkTypeOptimizedStrict(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - mPreviousNetworkTimeStrict > 1000) {
            mPreviousNetworkTypeStrict = getNetworkType(context);
            mPreviousNetworkTimeStrict = currentTimeMillis;
        }
        return mPreviousNetworkTypeStrict;
    }

    public static NetworkInfo getActiveNetworkInfo() {
        Context applicationContext = LoggerFactory.getLogContext().getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getNetworkType() {
        return getNetworkType(getActiveNetworkInfo());
    }

    public static String getNetworkType(Context context) {
        return getNetworkType(getActiveNetworkInfo(context));
    }

    public static String getNetworkType(NetworkInfo networkInfo) {
        String str = null;
        if (networkInfo == null) {
            return null;
        }
        if ("WIFI".equalsIgnoreCase(networkInfo.getTypeName())) {
            return "WIFI";
        }
        if (!TextUtils.isEmpty(networkInfo.getSubtypeName())) {
            str = networkInfo.getSubtypeName();
        } else if (networkInfo.getSubtype() == 16) {
            str = TYPE_GSM;
        } else if (networkInfo.getSubtype() == 17) {
            str = TYPE_TD_CDMA;
        } else if (networkInfo.getSubtype() == 18) {
            str = TYPE_TDS_HSDPSA;
        } else if (networkInfo.getSubtype() == 19) {
            str = TYPE_TDS_HSUPA;
        }
        if (str == null || TextUtils.isEmpty(networkInfo.getExtraInfo())) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|");
        sb.append(networkInfo.getExtraInfo());
        return sb.toString();
    }

    public static boolean isNetworkConnected(Context context) {
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    public static String getIpAddressString() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if ((nextElement instanceof Inet4Address) && !nextElement.isLoopbackAddress()) {
                            return nextElement.getHostAddress();
                        }
                    }
                }
            }
            return "";
        } catch (SocketException unused) {
            return "";
        }
    }

    public static boolean isNetworkUseWifi() {
        return "WIFI".equals(getNetworkType());
    }
}
