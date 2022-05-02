package com.iap.ac.android.container.adapter.appcontainer.provider;

import com.alipay.mobile.nebula.provider.H5JSApiPermissionProvider;
import com.iap.ac.android.common.container.provider.JsApiPermissionProvider;

public class AppJSApiPermissionProvider implements H5JSApiPermissionProvider {
    private H5JSApiPermissionProvider oldProvider;
    private JsApiPermissionProvider permissionProvider;

    public AppJSApiPermissionProvider(H5JSApiPermissionProvider h5JSApiPermissionProvider, JsApiPermissionProvider jsApiPermissionProvider) {
        this.oldProvider = h5JSApiPermissionProvider;
        this.permissionProvider = jsApiPermissionProvider;
    }

    public boolean hasDomainPermission(String str, String str2) {
        H5JSApiPermissionProvider h5JSApiPermissionProvider = this.oldProvider;
        if (h5JSApiPermissionProvider != null) {
            return h5JSApiPermissionProvider.hasDomainPermission(str, str2);
        }
        return this.permissionProvider.hasDomainPermission(str, str2);
    }

    public boolean hasThisPermission(String str, String str2) {
        H5JSApiPermissionProvider h5JSApiPermissionProvider = this.oldProvider;
        if (h5JSApiPermissionProvider != null) {
            return h5JSApiPermissionProvider.hasThisPermission(str, str2);
        }
        return false;
    }
}
