package com.alipay.multigateway.sdk.util;

import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.mobile.framework.LauncherApplicationAgent;
import com.alipay.mobile.framework.service.common.RpcService;

public class EnvironmentUtil {
    private static final String TAG = "EnvironmentUtil";
    private static Boolean sIsUsingMpaasRpc;
    private static Boolean sIsUsingQuake;

    public static boolean isUsingQuake() {
        Boolean bool = sIsUsingQuake;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Class.forName("com.alipay.imobile.network.quake.Quake");
            Boolean valueOf = Boolean.valueOf(Quake.instance() != null);
            sIsUsingQuake = valueOf;
            return valueOf.booleanValue();
        } catch (ClassNotFoundException e) {
            sIsUsingQuake = Boolean.FALSE;
            LoggerWrapper.e(TAG, "isUsingQuake occurs error", e);
            return false;
        }
    }

    public static boolean isUsingMpaasRpc() {
        Boolean bool = sIsUsingMpaasRpc;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Class.forName("com.alipay.mobile.framework.LauncherApplicationAgent");
            Class.forName("com.alipay.mobile.framework.service.common.RpcService");
            Class.forName("com.alipay.mobile.common.rpc.RpcInterceptor");
            Boolean valueOf = Boolean.valueOf(LauncherApplicationAgent.getInstance().getMicroApplicationContext().findServiceByInterface(RpcService.class.getName()) != null);
            sIsUsingMpaasRpc = valueOf;
            return valueOf.booleanValue();
        } catch (ClassNotFoundException e) {
            sIsUsingMpaasRpc = Boolean.FALSE;
            LoggerWrapper.e(TAG, "isUsingMpaasRpc occurs error", e);
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
