package com.alibaba.griver.base.common.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.base.common.env.GriverEnv;
import java.lang.ref.WeakReference;
import o.IntRange;

public class PermissionUtils {
    public static boolean hasPermission(String... strArr) {
        for (String length : strArr) {
            if (IntRange.length((Context) GriverEnv.getApplicationContext(), length) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void requestPermission(String str, int i, IPermissionRequestCallback iPermissionRequestCallback) {
        WeakReference<Activity> topActivity;
        if (Build.VERSION.SDK_INT >= 23 && (topActivity = GriverEnv.getTopActivity()) != null && topActivity.get() != null) {
            topActivity.get().requestPermissions(new String[]{str}, i);
            RVNativePermissionRequestProxy rVNativePermissionRequestProxy = (RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class);
            if (rVNativePermissionRequestProxy != null) {
                rVNativePermissionRequestProxy.addPermRequstCallback(i, iPermissionRequestCallback);
            }
        }
    }

    public static void requestPermissions(String[] strArr, int i, IPermissionRequestCallback iPermissionRequestCallback) {
        WeakReference<Activity> topActivity;
        if (Build.VERSION.SDK_INT >= 23 && (topActivity = GriverEnv.getTopActivity()) != null && topActivity.get() != null) {
            topActivity.get().requestPermissions(strArr, i);
            RVNativePermissionRequestProxy rVNativePermissionRequestProxy = (RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class);
            if (rVNativePermissionRequestProxy != null) {
                rVNativePermissionRequestProxy.addPermRequstCallback(i, iPermissionRequestCallback);
            }
        }
    }

    public static boolean positivePermissionResult(int[] iArr) {
        return positivePermissionsResult(iArr);
    }

    public static boolean positivePermissionsResult(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i == -1) {
                return false;
            }
        }
        return true;
    }
}
