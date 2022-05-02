package com.alibaba.ariver.app.api;

import android.app.Activity;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.kernel.common.RVProxy;

public class PermissionUtil {
    public static void requestPermissions(Activity activity, String[] strArr, IPermissionRequestCallback iPermissionRequestCallback) {
        RVNativePermissionRequestProxy rVNativePermissionRequestProxy = (RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class);
        int requestCode = rVNativePermissionRequestProxy.getRequestCode();
        rVNativePermissionRequestProxy.addPermRequstCallback(requestCode, iPermissionRequestCallback);
        rVNativePermissionRequestProxy.requestPermissions(activity, strArr, requestCode);
    }
}
