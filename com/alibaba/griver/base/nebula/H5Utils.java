package com.alibaba.griver.base.nebula;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;

public class H5Utils {
    public static final String TAG = "H5Utils";

    public static void handleTinyAppKeyEvent(String str, String str2) {
    }

    public static boolean isWebWorkerSupported() {
        return false;
    }

    public static boolean addChooseImageCrossOrigin(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(H5ResourceHandlerUtil.RESOURCE) && str.endsWith(H5ResourceHandlerUtil.IMAGE);
    }

    public static boolean containNebulaAddcors(String str) {
        return !TextUtils.isEmpty(str) && str.indexOf("nebula-addcors") > 0;
    }

    @Nullable
    public static SharedPreferences getSharedPreference(Context context, String str) {
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }

    public static int getUid(Context context) {
        try {
            if (context.getApplicationInfo().uid != 0) {
                return context.getApplicationInfo().uid;
            }
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 1).uid;
        } catch (PackageManager.NameNotFoundException e) {
            RVLogger.e(TAG, "exception detail", e);
            return 0;
        } catch (RuntimeException e2) {
            RVLogger.e(TAG, "exception detail", e2);
            return 0;
        }
    }

    public static String getApplicationDir() {
        Application applicationContext = GriverEnv.getApplicationContext();
        try {
            return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).applicationInfo.dataDir;
        } catch (Throwable th) {
            GriverLogger.e(TAG, "exception detail", th);
            return null;
        }
    }

    public static int parseInt(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable th) {
            GriverLogger.e(TAG, "parse int exception.", th);
            return 0;
        }
    }
}
