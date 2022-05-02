package com.alibaba.ariver.app.api.permission;

import android.app.Activity;
import com.alibaba.ariver.kernel.common.Proxiable;

public interface RVNativePermissionRequestProxy extends Proxiable {
    void addPermRequstCallback(int i, IPermissionRequestCallback iPermissionRequestCallback);

    int getRequestCode();

    void onRequestPermissionResult(int i, String[] strArr, int[] iArr);

    void requestPermissions(Activity activity, String[] strArr, int i);
}
