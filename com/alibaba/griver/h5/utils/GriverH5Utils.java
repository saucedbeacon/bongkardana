package com.alibaba.griver.h5.utils;

import android.app.Application;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class GriverH5Utils {
    public static String getApplicationDir() {
        Application applicationContext = GriverEnv.getApplicationContext();
        try {
            return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).applicationInfo.dataDir;
        } catch (Throwable th) {
            GriverLogger.e("GriverH5Utils", "exception detail", th);
            return null;
        }
    }
}
