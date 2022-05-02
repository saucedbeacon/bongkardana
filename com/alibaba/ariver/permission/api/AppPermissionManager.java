package com.alibaba.ariver.permission.api;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.kernel.api.security.Accessor;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.api.security.Group;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.AppPermissionUtils;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import java.util.ArrayList;
import java.util.List;

public class AppPermissionManager implements PermissionManager {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10117a;
    private static List<String> b;
    private AuthenticationProxy c;
    private BizPermissionManager d;
    private String e;

    static {
        StringBuilder sb = new StringBuilder("AriverPermission:");
        sb.append(AppPermissionManager.class.getSimpleName());
        f10117a = sb.toString();
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        arrayList.add("registerWorker");
        b.add("handleLoggingAction");
    }

    public AppPermissionManager(BizPermissionManager bizPermissionManager) {
        this.d = bizPermissionManager;
    }

    public void init(Accessor accessor) {
        this.e = AppPermissionUtils.getPermissionAppId(accessor);
        this.c = (AuthenticationProxy) RVProxy.get(AuthenticationProxy.class);
    }

    public ApiPermissionCheckResult checkPermission(Permission permission, Accessor accessor, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        App app;
        Page page = null;
        if (accessor instanceof Page) {
            page = (Page) accessor;
            app = page.getApp();
        } else {
            app = accessor instanceof App ? (App) accessor : null;
        }
        if (page == null && app == null) {
            return ApiPermissionCheckResult.DENY;
        }
        ApiPermissionCheckResult checkJSApi = this.c.checkJSApi(permission, nativeCallContext, bridgeResponseHelper, app, page);
        if (ApiPermissionCheckResult.ALLOW == checkJSApi) {
            String str = f10117a;
            StringBuilder sb = new StringBuilder("checkPermission allowed:\t ");
            sb.append(nativeCallContext.getName());
            RVLogger.d(str, sb.toString());
            return this.c.checkSPJSApi(permission, nativeCallContext, bridgeResponseHelper, app, page);
        }
        if (ApiPermissionCheckResult.IGNORE == checkJSApi) {
            String str2 = f10117a;
            StringBuilder sb2 = new StringBuilder("checkPermission ignored:\t ");
            sb2.append(nativeCallContext.getName());
            RVLogger.d(str2, sb2.toString());
        }
        return checkJSApi;
    }

    public boolean asyncCheckPermission(Permission permission, Accessor accessor, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        if (!(accessor instanceof Page)) {
            return false;
        }
        return this.c.checkShowPermissionDialog(permission, nativeCallContext, bridgeResponseHelper, (Page) accessor);
    }

    public boolean bizCheckPermission(Permission permission, Accessor accessor, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        BizPermissionManager bizPermissionManager = this.d;
        if (bizPermissionManager != null && !bizPermissionManager.checkBizParamPermission(permission.authority(), this.e, nativeCallContext.getParams())) {
            String str = f10117a;
            StringBuilder sb = new StringBuilder();
            sb.append(permission.authority());
            sb.append(" is not supported by param!");
            RVLogger.d(str, sb.toString());
            if (bridgeResponseHelper != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(permission.authority());
                sb2.append(" is not supported by param!");
                bridgeResponseHelper.sendError(2, sb2.toString());
            }
        }
        return false;
    }

    public Group manageAccessorGroup(Accessor accessor) {
        return RVGroup.LEVEL_APP_DEFAULT;
    }
}
