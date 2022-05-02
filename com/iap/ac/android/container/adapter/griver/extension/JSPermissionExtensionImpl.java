package com.iap.ac.android.container.adapter.griver.extension;

import com.alibaba.griver.api.h5.permission.GriverH5JSAPIPermissionExtension;
import com.iap.ac.android.common.container.provider.JsApiPermissionProvider;

public class JSPermissionExtensionImpl implements GriverH5JSAPIPermissionExtension {
    private static final String TAG = "JSPermissionProvider";
    private JsApiPermissionProvider permissionProvider;

    public JSPermissionExtensionImpl(JsApiPermissionProvider jsApiPermissionProvider) {
        this.permissionProvider = jsApiPermissionProvider;
    }

    public boolean hasPermission(String str, String str2) {
        JsApiPermissionProvider jsApiPermissionProvider = this.permissionProvider;
        if (jsApiPermissionProvider != null) {
            return jsApiPermissionProvider.hasDomainPermission(str, str2);
        }
        return true;
    }
}
