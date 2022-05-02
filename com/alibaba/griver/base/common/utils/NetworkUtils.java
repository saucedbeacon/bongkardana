package com.alibaba.griver.base.common.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.alibaba.ariver.kernel.common.network.NetworkUtil;
import com.alibaba.griver.base.common.logger.GriverLogger;
import o.FontRes;

public class NetworkUtils {
    public static final int CODE_LACK_PERMISSION = 0;
    public static final String NETWORK_TYPE_2G = "2G";
    public static final String NETWORK_TYPE_3G = "3G";
    public static final String NETWORK_TYPE_4G = "4G";
    public static final String NETWORK_TYPE_5G = "5G";
    public static final String NETWORK_TYPE_NONE = "NONE";
    public static final String NETWORK_TYPE_UNKNOWN = "UNKNOWN";

    public interface NetworkDetailCallback {
        void getNetworkError(int i, String str);

        void getNetworkType(String str);
    }

    @RequiresApi(api = 24)
    public static void getDetailNetwork(Context context, NetworkDetailCallback networkDetailCallback) {
        String str;
        try {
            str = NetworkUtil.getDetailNetworkType(context);
        } catch (Exception e) {
            GriverLogger.e("NetworkUtils", "get detail network exception", e);
            str = NETWORK_TYPE_NONE;
        }
        if (AndroidVersionUtils.isQAndAbove()) {
            String str2 = "UNKNOWN";
            if (TextUtils.equals(str2, str) || TextUtils.equals(NETWORK_TYPE_NONE, str)) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (FontRes.length(context, "android.permission.READ_PHONE_STATE") != 0) {
                    networkDetailCallback.getNetworkError(0, "Lack Permission");
                    return;
                }
                int dataNetworkType = telephonyManager.getDataNetworkType();
                if (dataNetworkType != 18) {
                    if (dataNetworkType != 20) {
                        switch (dataNetworkType) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                                str2 = "2G";
                                break;
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
                                str2 = "4G";
                                break;
                        }
                    } else {
                        str2 = NETWORK_TYPE_5G;
                    }
                    networkDetailCallback.getNetworkType(str2);
                    return;
                }
                str2 = "3G";
                networkDetailCallback.getNetworkType(str2);
                return;
            }
        }
        networkDetailCallback.getNetworkType(str);
    }
}
