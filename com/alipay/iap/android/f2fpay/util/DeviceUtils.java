package com.alipay.iap.android.f2fpay.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.utils.PermissionUtils;
import java.util.UUID;
import o.FontRes;

public class DeviceUtils {
    public static final String PLATFORM_TYPE = "ANDROID";

    /* renamed from: a  reason: collision with root package name */
    private static String f9328a;
    private static String b;

    @SuppressLint({"HardwareIds"})
    @Nullable
    public static String getDeviceId(@NonNull Context context) {
        String obj;
        if (PermissionUtils.hasPermission(context, "android.permission.READ_PHONE_STATE")) {
            obj = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } else {
            LoggerWrapper.e("DeviceUtils", "have no permission to get deviceId of the mobile phone.");
            if (TextUtils.isEmpty(f9328a)) {
                obj = UUID.randomUUID().toString();
            }
            return f9328a;
        }
        f9328a = obj;
        return f9328a;
    }

    @SuppressLint({"HardwareIds"})
    public static String[] getImeiAndImsi(@NonNull Context context) {
        if (hasPermission(context, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            f9328a = telephonyManager.getDeviceId();
            b = telephonyManager.getSubscriberId();
        } else {
            LoggerWrapper.e("DeviceUtils", "have no permission to get deviceId of the mobile phone.");
        }
        String[] strArr = new String[2];
        if (!TextUtils.isEmpty(f9328a) || !TextUtils.isEmpty(b)) {
            strArr[0] = f9328a;
            strArr[1] = b;
        } else {
            if (TextUtils.isEmpty(f9328a)) {
                f9328a = UUID.randomUUID().toString();
            }
            strArr[0] = f9328a;
        }
        return strArr;
    }

    public static String getVersion() {
        return Build.VERSION.RELEASE;
    }

    public static boolean hasPermission(@NonNull Context context, String str) {
        return FontRes.length(context, str) == 0;
    }

    public static boolean isOnline(@NonNull Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
