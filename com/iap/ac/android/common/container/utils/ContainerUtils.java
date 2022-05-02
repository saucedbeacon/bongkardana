package com.iap.ac.android.common.container.utils;

import android.app.Activity;
import android.os.Build;
import com.iap.ac.android.common.log.ACLog;

public class ContainerUtils {
    private static final String TAG = "ContainerUtils";

    public static boolean isACContainerExist() {
        try {
            return Class.forName("com.iap.ac.android.container.ACContainer") != null;
        } catch (ClassNotFoundException e) {
            ACLog.w(TAG, "ACContainer library not found.", e);
            return false;
        }
    }

    public static boolean isAppContainerExist() {
        try {
            return Class.forName("com.alipay.iap.android.webapp.sdk.kit.AppContainerKit") != null;
        } catch (ClassNotFoundException e) {
            ACLog.w(TAG, "AppContainer library not found.", e);
            return false;
        }
    }

    public static boolean isActivityRunning(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return true;
        }
        return false;
    }
}
