package com.alipay.iap.android.common.utils;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class NetworkUtils {
    public static final int NETWORK_TYPE_2G = 1;
    public static final String NETWORK_TYPE_2G_STR = "2g";
    public static final int NETWORK_TYPE_3G = 2;
    public static final String NETWORK_TYPE_3G_STR = "3g";
    public static final int NETWORK_TYPE_4G = 4;
    public static final String NETWORK_TYPE_4G_STR = "4g";
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_HSPAP = 15;
    public static final int NETWORK_TYPE_INVALID = 0;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_OFFLINE = 0;
    public static final String NETWORK_TYPE_OFFLINE_STR = "offline";
    public static final int NETWORK_TYPE_UNKOWN = -1;
    public static final String NETWORK_TYPE_UNKOWN_PREFIX_STR = "android-";
    public static final String NETWORK_TYPE_UNKOWN_STR = "unknown";
    public static final int NETWORK_TYPE_WIFI = 3;
    public static final String NETWORK_TYPE_WIFI_STR = "wifi";
    private static final String TAG = "NetworkUtils";
    /* access modifiers changed from: private */
    public static int mCurrentNetworkType;
    private static final BroadcastReceiver mNetworkBroadcastReceiver = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            int access$000 = NetworkUtils.mCurrentNetworkType;
            int unused = NetworkUtils.mCurrentNetworkType = NetworkUtils.getNetworkType(context);
            LoggerWrapper.i(NetworkUtils.TAG, String.format("NetworkUtils onReceive! network changed: %s -> %s.", new Object[]{NetworkUtils.getNetworkTypeDesc(access$000), NetworkUtils.getNetworkTypeDesc(NetworkUtils.mCurrentNetworkType)}));
            if (access$000 == NetworkUtils.mCurrentNetworkType) {
                LoggerWrapper.i(NetworkUtils.TAG, "Network type not changed, will not notify listeners");
                return;
            }
            synchronized (NetworkUtils.mNetworkStateListeners) {
                for (NetworkStateListener networkStateListener : NetworkUtils.mNetworkStateListeners) {
                    if (networkStateListener != null) {
                        networkStateListener.onNetworkChanged(access$000, NetworkUtils.mCurrentNetworkType);
                    }
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public static final Set<NetworkStateListener> mNetworkStateListeners = new LinkedHashSet();

    public interface NetworkStateListener {
        void onNetworkChanged(int i, int i2);
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

    public static boolean isMobileNetwork(int i) {
        return i == 1 || i == 2 || i == 4;
    }

    public static boolean isWiFiMobileNetwork(int i) {
        return i == 3;
    }

    private NetworkUtils() {
    }

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

    public static int getNetworkTypeInt(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        if (!activeNetworkInfo.isConnected()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 3;
        }
        if (type == 0) {
            return getMobileNetworkClassWithUnknown(activeNetworkInfo.getSubtype());
        }
        return -1;
    }

    public static String getNetworkTypeString(Context context) {
        int networkTypeInt = getNetworkTypeInt(context);
        if (networkTypeInt == -1) {
            return "unknown";
        }
        if (networkTypeInt == 0) {
            return "offline";
        }
        if (networkTypeInt == 1) {
            return "2g";
        }
        if (networkTypeInt == 2) {
            return "3g";
        }
        if (networkTypeInt != 3) {
            return networkTypeInt != 4 ? "android-".concat(String.valueOf(networkTypeInt)) : "4g";
        }
        return "wifi";
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static int getNetType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
            if (allNetworkInfo == null) {
                LoggerWrapper.d(TAG, "can not get network info");
                return false;
            }
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (LoggerWrapper.isDebuggable()) {
                    LoggerWrapper.d(TAG, LoggerWrapper.buildMessage("Detailed=%s, Extra=%s, Reason=%s, State=%s, Subtype=%s, stN=%s, Type=%s, tN=%s, isA=%s, isC=%s, isConing=%s, isF=%s, isR=%s, des=%s, toS=%s", networkInfo.getDetailedState().toString(), networkInfo.getExtraInfo(), networkInfo.getReason(), networkInfo.getState(), Integer.valueOf(networkInfo.getSubtype()), networkInfo.getSubtypeName(), Integer.valueOf(networkInfo.getType()), networkInfo.getTypeName(), Boolean.valueOf(networkInfo.isAvailable()), Boolean.valueOf(networkInfo.isConnected()), Boolean.valueOf(networkInfo.isConnectedOrConnecting()), Boolean.valueOf(networkInfo.isFailover()), Boolean.valueOf(networkInfo.isRoaming()), Integer.valueOf(networkInfo.describeContents()), networkInfo.toString()));
                }
                if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerWrapper.e(TAG, "", e);
            return false;
        }
    }

    public static SSLSocketFactory getTrustAllSslSocketFactory() {
        try {
            AnonymousClass1 r2 = new X509TrustManager() {
                public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                }

                public final X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            SSLContext instance = SSLContext.getInstance("TLS");
            StringBuilder sb = new StringBuilder("sslContext.getProtocol()=%s");
            sb.append(instance.getProtocol());
            LoggerWrapper.e(TAG, sb.toString());
            instance.init((KeyManager[]) null, new TrustManager[]{r2}, new SecureRandom());
            return instance.getSocketFactory();
        } catch (Exception e) {
            LoggerWrapper.e(TAG, "unable to general ssl socket factory", e);
            return null;
        }
    }

    @TargetApi(3)
    public static int getMobileNetworkClass(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 0;
        }
        return getMobileNetworkClass(networkInfo.getSubtype());
    }

    public static int getMobileNetworkClassWithUnknown(int i) {
        int mobileNetworkClass = getMobileNetworkClass(i);
        return mobileNetworkClass == 0 ? i : mobileNetworkClass;
    }

    public static void addNetworkStateListener(@NonNull Context context, @NonNull NetworkStateListener networkStateListener) {
        synchronized (mNetworkStateListeners) {
            if (mNetworkStateListeners.isEmpty()) {
                initializeNetworkStateListener(context);
            }
            mNetworkStateListeners.add(networkStateListener);
        }
    }

    public static void removeNetworkStateListener(@NonNull Context context, @NonNull NetworkStateListener networkStateListener) {
        synchronized (mNetworkStateListeners) {
            if (!mNetworkStateListeners.isEmpty()) {
                mNetworkStateListeners.remove(networkStateListener);
                if (mNetworkStateListeners.isEmpty()) {
                    LoggerWrapper.d(TAG, "Network listeners is empty. will unregister receiver!");
                    try {
                        context.unregisterReceiver(mNetworkBroadcastReceiver);
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("removeNetworkStateListener error: ");
                        sb.append(th.getMessage());
                        LoggerWrapper.e(TAG, sb.toString());
                    }
                }
            }
        }
    }

    private static void initializeNetworkStateListener(@NonNull Context context) {
        mCurrentNetworkType = getNetworkType(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(mNetworkBroadcastReceiver, intentFilter);
    }

    /* access modifiers changed from: private */
    @NonNull
    public static String getNetworkTypeDesc(int i) {
        if (isMobileNetwork(i)) {
            return "Mobile (2G/3G/4G/...)";
        }
        return isWiFiMobileNetwork(i) ? "WiFi" : "Invalid";
    }

    public static abstract class NetworkSwitchListener implements NetworkStateListener {
        /* access modifiers changed from: protected */
        public abstract void onInvalid2Mobile();

        /* access modifiers changed from: protected */
        public abstract void onInvalid2Wifi();

        /* access modifiers changed from: protected */
        public abstract void onMobile2Invalid();

        /* access modifiers changed from: protected */
        public abstract void onMobile2Wifi();

        /* access modifiers changed from: protected */
        public abstract void onWifi2Invalid();

        /* access modifiers changed from: protected */
        public abstract void onWifi2Mobile();

        public final void onNetworkChanged(int i, int i2) {
            if (i == 0) {
                if (NetworkUtils.isMobileNetwork(i2)) {
                    onInvalid2Mobile();
                } else if (NetworkUtils.isWiFiMobileNetwork(i2)) {
                    onInvalid2Wifi();
                }
            } else if (NetworkUtils.isMobileNetwork(i)) {
                if (i2 == 0) {
                    onMobile2Invalid();
                } else if (NetworkUtils.isWiFiMobileNetwork(i2)) {
                    onMobile2Wifi();
                }
            } else if (!NetworkUtils.isWiFiMobileNetwork(i)) {
            } else {
                if (i2 == 0) {
                    onWifi2Invalid();
                } else if (NetworkUtils.isMobileNetwork(i2)) {
                    onWifi2Mobile();
                }
            }
        }
    }
}
