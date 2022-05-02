package com.alibaba.ariver.app.api.permission;

import android.app.Activity;
import android.os.Build;
import java.util.concurrent.atomic.AtomicInteger;
import o.IResultReceiver;

public class RVNativePermissionRequestManager implements RVNativePermissionRequestProxy {
    protected IResultReceiver.Stub<IPermissionRequestCallback> callbackArray = new IResultReceiver.Stub<>();
    protected AtomicInteger lastRequestCode = new AtomicInteger(1024);

    public void addPermRequstCallback(int i, IPermissionRequestCallback iPermissionRequestCallback) {
        IResultReceiver.Stub<IPermissionRequestCallback> stub = this.callbackArray;
        if (stub != null) {
            stub.setMax(i, iPermissionRequestCallback);
        }
    }

    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IPermissionRequestCallback min;
        IResultReceiver.Stub<IPermissionRequestCallback> stub = this.callbackArray;
        if (stub != null && (min = stub.setMin(i)) != null) {
            min.onRequestPermissionResult(i, strArr, iArr);
            this.callbackArray.getMax(i);
        }
    }

    public int getRequestCode() {
        return this.lastRequestCode.addAndGet(1) & 255;
    }

    public void requestPermissions(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23 && activity != null) {
            activity.requestPermissions(strArr, i);
        }
    }
}
