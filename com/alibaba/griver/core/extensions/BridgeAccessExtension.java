package com.alibaba.griver.core.extensions;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.service.TinyAppInnerProxy;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.security.BridgeAccessPoint;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.api.security.Accessor;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.api.security.Group;
import com.alibaba.ariver.kernel.api.security.Guard;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.api.AppPermissionManager;
import com.alibaba.ariver.permission.api.BizPermissionManager;
import com.alibaba.ariver.permission.api.PermissionManager;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.permission.model.RVGroupInit;
import com.alibaba.griver.base.nebula.H5DevConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

public class BridgeAccessExtension implements BridgeAccessPoint, NodeAware<Page> {

    /* renamed from: a  reason: collision with root package name */
    private PermissionManager f10300a;
    private Page b = null;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public boolean needPermissionCheck(Accessor accessor, List<? extends Guard> list) {
        Page page;
        if (((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean(H5DevConfig.H5_JSAPI_PERMISSION, false)) {
            StringBuilder sb = new StringBuilder("accessor");
            sb.append(accessor.hashCode());
            sb.append(" debug app permission check switch is close");
            RVLogger.d("AriverPermission:BridgeAccessExtension", sb.toString());
            return false;
        }
        if (this.f10300a == null) {
            AppPermissionManager appPermissionManager = new AppPermissionManager((BizPermissionManager) null);
            this.f10300a = appPermissionManager;
            appPermissionManager.init(accessor);
        }
        Page page2 = this.b;
        if (page2 == null || page2.getApp() == null || ((AuthenticationProxy) RVProxy.get(AuthenticationProxy.class)).hasPermissionModel(this.b.getApp().getAppId(), this.b)) {
            TinyAppInnerProxy tinyAppInnerProxy = (TinyAppInnerProxy) RVProxy.get(TinyAppInnerProxy.class);
            if (tinyAppInnerProxy == null || (page = this.b) == null || page.getApp() == null || !tinyAppInnerProxy.isInner(this.b.getApp())) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder("accessor");
            sb2.append(accessor.hashCode());
            sb2.append("isInner app ");
            RVLogger.d("AriverPermission:BridgeAccessExtension", sb2.toString());
            return false;
        }
        StringBuilder sb3 = new StringBuilder("accessor");
        sb3.append(accessor.hashCode());
        sb3.append(" dont have permission model");
        RVLogger.d("AriverPermission:BridgeAccessExtension", sb3.toString());
        return false;
    }

    public boolean bizCheckPermission(Permission permission, Accessor accessor, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        boolean bizCheckPermission = this.f10300a.bizCheckPermission(permission, accessor, nativeCallContext, bridgeResponseHelper);
        StringBuilder sb = new StringBuilder("accessor");
        sb.append(accessor.hashCode());
        sb.append(" bizCheckPermission check permission = ");
        sb.append(permission.authority());
        sb.append(", result=");
        sb.append(bizCheckPermission);
        RVLogger.d("AriverPermission:BridgeAccessExtension", sb.toString());
        return bizCheckPermission;
    }

    public ApiPermissionCheckResult checkPermission(Permission permission, Accessor accessor, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        ApiPermissionCheckResult checkPermission = this.f10300a.checkPermission(permission, accessor, nativeCallContext, bridgeResponseHelper);
        StringBuilder sb = new StringBuilder("accessor");
        sb.append(accessor.hashCode());
        sb.append(" custom check permission = ");
        sb.append(permission.authority());
        sb.append(", result=");
        sb.append(checkPermission);
        RVLogger.d("AriverPermission:BridgeAccessExtension", sb.toString());
        return checkPermission;
    }

    public boolean asyncCheckPermission(Permission permission, Accessor accessor, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper) {
        boolean asyncCheckPermission = this.f10300a.asyncCheckPermission(permission, accessor, nativeCallContext, bridgeResponseHelper);
        StringBuilder sb = new StringBuilder("accessor");
        sb.append(accessor.hashCode());
        sb.append(" asyncCheckPermission = ");
        sb.append(permission.authority());
        sb.append(", result=");
        sb.append(asyncCheckPermission);
        RVLogger.d("AriverPermission:BridgeAccessExtension", sb.toString());
        return asyncCheckPermission;
    }

    public Group manageAccessorGroup(Accessor accessor) {
        RVGroupInit.init((Map<String, Map<String, Permission>>) null);
        Group manageAccessorGroup = this.f10300a.manageAccessorGroup(accessor);
        StringBuilder sb = new StringBuilder("accessor");
        sb.append(accessor.hashCode());
        sb.append(" group=");
        sb.append(manageAccessorGroup.groupName());
        RVLogger.d("AriverPermission:BridgeAccessExtension", sb.toString());
        return manageAccessorGroup;
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.b = weakReference.get();
    }

    public Class getNodeType() {
        return Page.class;
    }
}
