package com.alibaba.ariver.permission.view;

public interface PermissionPermitListener {
    void onFailed(int i, String str, boolean z);

    void onSuccess();
}
