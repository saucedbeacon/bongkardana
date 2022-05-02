package com.alipay.iap.android.common.rpcintegration;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.alipaysecuritysdk.apdid.face.APSecuritySdk;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.iap.ac.android.biz.common.constants.ACConstants;
import java.util.HashMap;
import java.util.Locale;

public class EnvironmentInfoHost {
    private static final String TAG = "EnvironmentInfoHost";
    private static String appVersion = "";
    private static String cashierSdkVersion = "";
    private static IEnvironmentInfoCollector collectorRef = null;
    private static String sdkVersion = "";

    public interface IEnvironmentInfoCollector {
        EnvironmentInfo getEnvironmentInfo();
    }

    public static void setEnvironmentInfoCollector(IEnvironmentInfoCollector iEnvironmentInfoCollector) {
        if (iEnvironmentInfoCollector != null) {
            collectorRef = iEnvironmentInfoCollector;
        }
    }

    private static EnvironmentInfo getEnvironmentInfoFromCollector() {
        IEnvironmentInfoCollector iEnvironmentInfoCollector = collectorRef;
        if (iEnvironmentInfoCollector != null) {
            return iEnvironmentInfoCollector.getEnvironmentInfo();
        }
        LoggerWrapper.e(TAG, "the environment info collector is null.");
        return null;
    }

    public static EnvironmentInfo getEnvironmentInfo() {
        EnvironmentInfo environmentInfoFromCollector = getEnvironmentInfoFromCollector();
        return environmentInfoFromCollector == null ? new EnvironmentInfo() : environmentInfoFromCollector;
    }

    public static EnvironmentInfo getEnvironmentInfo(Context context) {
        EnvironmentInfo environmentInfoFromCollector = getEnvironmentInfoFromCollector();
        if (environmentInfoFromCollector != null) {
            return environmentInfoFromCollector;
        }
        if (context != null) {
            return getDefaultEnvironmentInfo(context);
        }
        throw new IllegalArgumentException("the argument 'context' can not be null");
    }

    private static EnvironmentInfo getDefaultEnvironmentInfo(@NonNull Context context) {
        EnvironmentInfo environmentInfo = new EnvironmentInfo();
        Object securitySdk = getSecuritySdk(context);
        if (securitySdk != null) {
            APSecuritySdk.TokenResult tokenResult = ((APSecuritySdk) securitySdk).getTokenResult();
            environmentInfo.clientKey = tokenResult.clientKey;
            environmentInfo.tokenId = tokenResult.apdidToken;
        } else {
            environmentInfo.clientKey = "";
            environmentInfo.tokenId = "";
        }
        environmentInfo.clientIp = "";
        environmentInfo.terminalType = ACConstants.MerchantType.IS_APP;
        environmentInfo.osType = "android";
        environmentInfo.osVersion = Build.VERSION.RELEASE;
        environmentInfo.appId = "";
        environmentInfo.longitude = "";
        environmentInfo.latitude = "";
        environmentInfo.LBSType = "";
        environmentInfo.LBSUpdateTime = "";
        environmentInfo.locale = getLocale(context);
        environmentInfo.appVersion = getAppVersion(context);
        environmentInfo.cashierSdkVersion = cashierSdkVersion;
        environmentInfo.sdkVersion = sdkVersion;
        environmentInfo.extendInfo = new HashMap();
        return environmentInfo;
    }

    private static String getLocale(Context context) {
        Locale locale = (Build.VERSION.SDK_INT < 24 || LocaleList.getDefault().isEmpty()) ? Locale.getDefault() : LocaleList.getDefault().get(0);
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("-");
        sb.append(locale.getCountry());
        return sb.toString();
    }

    private static String getAppVersion(Context context) {
        if (!TextUtils.isEmpty(appVersion)) {
            return appVersion;
        }
        try {
            appVersion = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            LoggerWrapper.e(TAG, "", e);
        }
        return appVersion;
    }

    private static Object getSecuritySdk(Context context) {
        try {
            Class<?> cls = Class.forName("com.alipay.alipaysecuritysdk.apdid.face.APSecuritySdk");
            return cls.getMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Take it easy, cannot find class APSecuritySdk.");
            sb.append(e.getMessage());
            LoggerWrapper.e(TAG, sb.toString());
            return null;
        }
    }
}
