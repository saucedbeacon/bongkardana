package com.alibaba.ariver.permission;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.service.TinyAppInnerProxy;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.security.BridgeAccessPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.security.AccessControlManagement;
import com.alibaba.ariver.kernel.api.security.Accessor;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.api.security.DefaultGroup;
import com.alibaba.ariver.kernel.api.security.Group;
import com.alibaba.ariver.kernel.api.security.Guard;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.api.extension.IgnorePermissionPoint;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import java.util.ArrayList;
import java.util.List;

public class a implements AccessControlManagement {

    /* renamed from: a  reason: collision with root package name */
    public static String f10116a = "AriverPermission:DefaultAccessControlManagement";
    private static List<String> e;
    private NativeCallContext b;
    private BridgeResponseHelper c;
    private BridgeAccessPoint d;
    private boolean f = "yes".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_checkInnerAppPermissionForH5", "no"));

    static {
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add("registerWorker");
        e.add("handleLoggingAction");
        e.add("initialTraceDebug");
        e.add("postMethodTrace");
    }

    public a(NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper, ExtensionManager extensionManager) {
        this.b = nativeCallContext;
        this.c = bridgeResponseHelper;
        this.d = ExtensionPoint.as(BridgeAccessPoint.class).extensionManager(extensionManager).useCache(true).node(nativeCallContext.getNode()).create();
    }

    public boolean needPermissionCheck(Accessor accessor, List<? extends Guard> list) {
        if (e.contains(this.b.getName())) {
            RVLogger.d(f10116a, "needPermissionCheck ignore by WHITE_LIST");
            return false;
        } else if (TextUtils.isEmpty(this.b.getPluginId())) {
            if (a(false)) {
                return false;
            }
            return this.d.needPermissionCheck(accessor, list);
        } else if (a(true)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean a(boolean z) {
        App app;
        Page page = (Page) this.b.getNode().bubbleFindNode(Page.class);
        if (page == null || (app = page.getApp()) == null) {
            return false;
        }
        IgnorePermissionPoint create = ExtensionPoint.as(IgnorePermissionPoint.class).node(app).useCache(true).create();
        if (create == null || !create.ignoreAppPermission(app.getAppId())) {
            TinyAppInnerProxy tinyAppInnerProxy = (TinyAppInnerProxy) RVProxy.get(TinyAppInnerProxy.class);
            if (!z && tinyAppInnerProxy != null) {
                if (tinyAppInnerProxy.isInner(app) && !tinyAppInnerProxy.isEmbedWebViewInnerAppBlack(page)) {
                    if (!this.f) {
                        RVLogger.d(f10116a, "commonCheckIgnorePermission ignore by isInner");
                        return true;
                    } else if (app.isTinyApp()) {
                        RVLogger.d(f10116a, "commonCheckIgnorePermission ignore by isInner");
                        return true;
                    }
                }
                if (RVResourceUtils.needSkipPermissionCheck(app) && !tinyAppInnerProxy.isEmbedWebViewInnerAppBlack(page)) {
                    RVLogger.d(f10116a, "commonCheckIgnorePermission ignore by checkPermission");
                    return true;
                }
            }
            return false;
        }
        RVLogger.d(f10116a, "commonCheckIgnorePermission ignore by IgnorePermissionPoint");
        return true;
    }

    public Group manageAccessorGroup(Accessor accessor) {
        if (TextUtils.isEmpty(this.b.getPluginId())) {
            return this.d.manageAccessorGroup(accessor);
        }
        return DefaultGroup.EXTERNAL;
    }

    public boolean bizPermissionCheck(Permission permission, Accessor accessor) {
        return this.d.bizCheckPermission(permission, accessor, this.b, this.c);
    }

    public ApiPermissionCheckResult permissionCheck(Permission permission, Accessor accessor) {
        return this.d.checkPermission(permission, accessor, this.b, this.c);
    }

    public boolean asyncPermissionCheck(Permission permission, Accessor accessor) {
        return this.d.asyncCheckPermission(permission, accessor, this.b, this.c);
    }
}
