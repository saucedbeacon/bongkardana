package com.alipay.iap.android.aplog.network;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

public class NetWorkProvider {
    public static NetWorkProvider INSTANCE = null;
    private static final long NETWORK_TYPE_FUZZ_TIME = 2000;
    public static final String NETWORK_UNKNOWN = "unknown";
    private static long mPreviousNetworkTime = 0;
    private static int mPreviousNetworkType = -1;
    private Context mContext;
    private LogNetworkConnReceiver mLogNetworkConnReceiver;

    public NetWorkProvider(Context context) {
        this.mContext = context;
        registerLogNetworkConnReceiver(context);
    }

    public static synchronized NetWorkProvider createInstance(Context context) {
        NetWorkProvider netWorkProvider;
        synchronized (NetWorkProvider.class) {
            if (INSTANCE == null) {
                INSTANCE = new NetWorkProvider(context);
            }
            netWorkProvider = INSTANCE;
        }
        return netWorkProvider;
    }

    public static synchronized NetWorkProvider getInstance() {
        NetWorkProvider netWorkProvider;
        synchronized (NetWorkProvider.class) {
            if (INSTANCE != null) {
                netWorkProvider = INSTANCE;
            } else {
                throw new IllegalStateException("need createInstance before use");
            }
        }
        return netWorkProvider;
    }

    public void registerLogNetworkConnReceiver(Context context) {
        LogNetworkConnReceiver logNetworkConnReceiver = new LogNetworkConnReceiver(context);
        this.mLogNetworkConnReceiver = logNetworkConnReceiver;
        logNetworkConnReceiver.register();
    }

    public String getCurrentNetworkType2Str() {
        int currentNetworkType = getCurrentNetworkType();
        if (currentNetworkType == 1) {
            return "2g";
        }
        if (currentNetworkType == 2) {
            return "3g";
        }
        if (currentNetworkType != 3) {
            return currentNetworkType != 4 ? "unknown" : "4g";
        }
        return "wifi";
    }

    public int getCurrentNetworkType() {
        int i = mPreviousNetworkType;
        if (i == -1 || i == 0) {
            updateNetworkTypeOptimized(this.mContext);
        }
        return mPreviousNetworkType;
    }

    /* access modifiers changed from: private */
    public int updateNetworkTypeOptimized(Context context) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - mPreviousNetworkTime > 2000) {
            mPreviousNetworkType = NetworkUtils.getNetworkType(context);
            mPreviousNetworkTime = uptimeMillis;
        }
        return mPreviousNetworkType;
    }

    public class LogNetworkConnReceiver extends RigorousNetworkConnReceiver {
        public LogNetworkConnReceiver(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onReceivee(Context context, Intent intent) {
            int unused = NetWorkProvider.this.updateNetworkTypeOptimized(context);
        }
    }
}
