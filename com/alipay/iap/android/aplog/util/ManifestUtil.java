package com.alipay.iap.android.aplog.util;

import android.content.Context;
import android.os.Bundle;
import com.alipay.iap.android.aplog.core.LoggerFactory;

public class ManifestUtil {
    private static final String TAG = "ManifestUtil";

    public static String getLoggingGWFromManifest() {
        Context applicationContext = LoggerFactory.getLogContext().getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            Bundle bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
            return "https://mas-log1.saas.dana.id";
        } catch (Exception e) {
            LoggerFactory.getTraceLogger().warn(TAG, (Throwable) e);
            return null;
        }
    }
}
