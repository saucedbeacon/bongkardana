package com.alibaba.ariver.permission.extension;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.AppPermissionUtils;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.extension.PackageParsedPoint;
import com.alibaba.ariver.resource.api.extension.PluginPackageParsedPoint;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.ariver.resource.api.models.PluginModel;

public class AppPermissionInitExtension implements AppDestroyPoint, PackageParsedPoint, PluginPackageParsedPoint {

    /* renamed from: a  reason: collision with root package name */
    private AuthenticationProxy f10118a;

    public void onFinalized() {
    }

    private boolean a(@Nullable AppModel appModel, ResourcePackage resourcePackage) {
        Resource a2;
        if (!(appModel == null || (a2 = a(resourcePackage)) == null || a2.getBytes() == null)) {
            RVLogger.d("AriverPermission:AppPermissionInitExtension", "onResourceParsed, loadFromPkgFile");
            if (a2.getBytes() != null) {
                PermissionModel parsePermissionJson = AppPermissionUtils.parsePermissionJson(a2.getBytes());
                RVLogger.debug("AriverPermission:AppPermissionInitExtension", "onResourceParsed: ".concat(String.valueOf(parsePermissionJson)));
                if (parsePermissionJson != null) {
                    this.f10118a.setPermissionModel(appModel.getAppInfoModel().getAppId(), parsePermissionJson);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(@Nullable AppModel appModel) {
        PermissionModel permissionModel;
        if (appModel == null || (permissionModel = appModel.getPermissionModel()) == null) {
            return false;
        }
        RVLogger.d("AriverPermission:AppPermissionInitExtension", "onResourceParsed, loadFromAppConfig");
        this.f10118a.setPermissionModel(appModel.getAppInfoModel().getAppId(), permissionModel);
        return true;
    }

    private Resource a(ResourcePackage resourcePackage) {
        return resourcePackage.get(ResourceQuery.asUrl(RVConstants.FILE_API_PERMISSION).setNeedAutoCompleteHost());
    }

    public void onInitialized() {
        this.f10118a = (AuthenticationProxy) RVProxy.get(AuthenticationProxy.class);
    }

    public void onResourceParsed(AppModel appModel, ResourcePackage resourcePackage) {
        if (appModel == null || TextUtils.isEmpty(appModel.getAppInfoModel().getAppId())) {
            RVLogger.d("AriverPermission:AppPermissionInitExtension", "onResourceParsed appId is null, return");
            return;
        }
        StringBuilder sb = new StringBuilder("onResourceParsed ");
        sb.append(appModel.getAppInfoModel().getAppId());
        RVLogger.d("AriverPermission:AppPermissionInitExtension", sb.toString());
        if (!a(appModel) && !a(appModel, resourcePackage)) {
            this.f10118a.clearPermissionModel(appModel.getAppInfoModel().getAppId(), false);
        }
    }

    public void onPluginParsed(AppModel appModel, PluginModel pluginModel, ResourcePackage resourcePackage) {
        PermissionModel permissionModel;
        if (appModel == null || TextUtils.isEmpty(appModel.getAppInfoModel().getAppId())) {
            RVLogger.d("AriverPermission:AppPermissionInitExtension", "onPluginParsed appId is null, return");
            return;
        }
        PermissionModel permissionModel2 = null;
        StringBuilder sb = new StringBuilder("onPluginParsed getPermission with pluginModel: ");
        sb.append(pluginModel);
        sb.append(", permissionModel: ");
        sb.append(pluginModel.getPermission());
        RVLogger.d("AriverPermission:AppPermissionInitExtension", sb.toString());
        if (pluginModel.getPermission() != null) {
            permissionModel = PermissionModel.generateFromJSON(pluginModel.getPermission());
            RVLogger.d("AriverPermission:AppPermissionInitExtension", "onPluginParsed getPermission from appModel");
        } else {
            Resource a2 = a(resourcePackage);
            if (a2 != null) {
                permissionModel2 = PermissionModel.generateFromJSON(a2.getBytes());
            }
            StringBuilder sb2 = new StringBuilder("onPluginParsed getPermission from package (");
            sb2.append(a2 != null);
            sb2.append(")");
            RVLogger.d("AriverPermission:AppPermissionInitExtension", sb2.toString());
            permissionModel = permissionModel2;
        }
        if (permissionModel != null) {
            this.f10118a.setPluginPermissionModel(appModel.getAppId(), pluginModel, permissionModel);
        }
    }

    public void onAppDestroy(App app) {
        this.f10118a.clearPermissionModel(app.getAppId(), true);
    }
}
