package com.alibaba.griver.base.common.permission;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.permission.service.DefaultAuthenticationProxyImpl;
import com.alibaba.griver.api.h5.permission.GriverJSAPIPermissionProxy;

public class GriverAuthentication extends DefaultAuthenticationProxyImpl {
    public boolean hasPermissionModel(String str, Page page) {
        if (BundleUtils.getBoolean(page.getStartParams(), RVParams.isH5App, false)) {
            return true;
        }
        return super.hasPermissionModel(str, page);
    }

    public ApiPermissionCheckResult checkJSApi(Permission permission, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper, App app, @Nullable Page page) {
        if (!BundleUtils.getBoolean(page.getStartParams(), RVParams.isH5App, false)) {
            return super.checkJSApi(permission, nativeCallContext, bridgeResponseHelper, app, page);
        }
        GriverJSAPIPermissionProxy griverJSAPIPermissionProxy = (GriverJSAPIPermissionProxy) RVProxy.get(GriverJSAPIPermissionProxy.class);
        if (griverJSAPIPermissionProxy == null || !griverJSAPIPermissionProxy.hasDomainPermission(permission.authority(), page.getOriginalURI())) {
            return ApiPermissionCheckResult.DENY;
        }
        return ApiPermissionCheckResult.ALLOW;
    }
}
