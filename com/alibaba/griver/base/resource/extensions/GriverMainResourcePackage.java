package com.alibaba.griver.base.resource.extensions;

import androidx.annotation.NonNull;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.content.MainResourcePackage;
import com.alibaba.ariver.resource.parser.ParseContext;
import com.alibaba.ariver.resource.parser.a;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.resource.ResourceConstants;
import com.alibaba.griver.api.resource.extensions.GriverParseFailedPoint;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.base.resource.point.BeforeGetMainPackageResourcePoint;

public class GriverMainResourcePackage extends MainResourcePackage {

    /* renamed from: a  reason: collision with root package name */
    private ResourceContext f10237a;
    private boolean b = false;

    public GriverMainResourcePackage(@NonNull ResourceContext resourceContext) {
        super(resourceContext);
        this.f10237a = resourceContext;
    }

    public Resource get(@NonNull ResourceQuery resourceQuery) {
        if (BundleUtils.getBoolean(this.f10237a.getStartParams(), RVParams.isH5App, false)) {
            try {
                resourceQuery = ExtensionPoint.as(BeforeGetMainPackageResourcePoint.class).node(this.f10237a.getApp()).create().beforeQuery(resourceQuery);
            } catch (Exception e) {
                GriverLogger.e("GriverMainResourcePackage", "map url failed", e);
            }
        }
        return super.get(resourceQuery);
    }

    public void onVerifyError(a aVar) {
        super.onVerifyError(aVar);
        this.b = true;
        BundleUtils.getBoolean(this.f10237a.getStartParams(), RVParams.isH5App, false);
        GriverMonitor.error(GriverMonitorConstants.ERROR_VERIFY_APP_FAIL, "GriverAppContainer", new MonitorMap.Builder().appId(appId()).version(getAppModel()).code(String.valueOf(aVar.getCode())).exception(aVar).message(GriverMonitorConstants.MESSAGE_VERIFY_MAIN_PACKAGE_ERROR).needAsynAppType(true).build());
        AppModel queryAppInfo = GriverAppCenter.queryAppInfo(appId(), version());
        if (queryAppInfo != null && AppInfoUtils.getAppType(queryAppInfo) == 2) {
            ExtensionPoint.as(GriverParseFailedPoint.class).node(this.f10237a.getApp()).create().parseFailed(aVar);
        }
    }

    public boolean needWaitForSetup() {
        if (BundleUtils.getBoolean(this.f10237a.getStartParams(), RVParams.isH5App, false)) {
            return false;
        }
        return super.needWaitForSetup();
    }

    public boolean verifyFailed() {
        return this.b;
    }

    public void onParseDone() {
        super.onParseDone();
        GriverMonitor.event(GriverMonitorConstants.EVENT_VERIFY_APP, "GriverAppContainer", new MonitorMap.Builder().appId(appId()).version(getAppModel()).needAsynAppType(true).build());
    }

    public void afterParsePackage(ParseContext parseContext) {
        super.afterParsePackage(parseContext);
        if (this.b) {
            GriverLogger.w("GriverMainResourcePackage", "verify failed, do not send load monitor");
        } else if (getAppModel() == null) {
            GriverLogger.w("GriverMainResourcePackage", "can not find app model, do not sent load monitor");
        } else {
            GriverMonitor.event(GriverMonitorConstants.EVENT_LOAD_OFFLINE_PACKAGE, "GriverAppContainer", new MonitorMap.Builder().appId(getAppModel().getAppId()).version(getAppModel()).append(GriverMonitorConstants.KEY_PACKEGE_TYPE, "main").needAsynAppType(true).build());
        }
    }

    public void beforeParsePackage(ParseContext parseContext) {
        super.beforeParsePackage(parseContext);
        if (AppInfoUtils.isEmbeddedApp(getAppModel())) {
            parseContext.appId = ResourceConstants.TINY_WEB_EMBEDDED_APPID;
        }
    }
}
