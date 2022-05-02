package com.alibaba.ariver.kernel.common.utils;

import android.app.Application;
import android.content.res.Resources;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;

public class RVKernelUtils {
    public static final String TAG = "AriverKernel";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9146a;

    public static boolean isDebug() {
        if (f9146a == null) {
            Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
            boolean z = false;
            if (applicationContext == null) {
                return false;
            }
            try {
                if ((applicationContext.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
                f9146a = Boolean.valueOf(z);
            } catch (Throwable th) {
                RVLogger.e("AriverKernel", "exception detail", th);
            }
        }
        if (f9146a == null) {
            f9146a = Boolean.FALSE;
        }
        return f9146a.booleanValue();
    }

    public static String getClientVersion() {
        try {
            Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
            return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static Resources getResources() {
        return ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources(RVConstants.ARIVER_BUNDLE_NAME);
    }
}
