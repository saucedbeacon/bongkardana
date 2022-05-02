package com.alibaba.ariver.app.api.permission;

public interface IPermissionRequestCallback {
    void onRequestPermissionResult(int i, String[] strArr, int[] iArr);
}
