package com.alibaba.griver.base.resource.extensions;

import androidx.annotation.Nullable;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.content.NormalResourcePackage;
import com.alibaba.ariver.resource.parser.ParseContext;
import com.alibaba.ariver.resource.parser.a;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;

public class GriverNormalResourcePackage extends NormalResourcePackage {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10238a;
    ResourceContext mainContext;

    public GriverNormalResourcePackage(String str, ResourceContext resourceContext) {
        super(str, resourceContext);
        this.mainContext = resourceContext;
    }

    public void onVerifyError(a aVar) {
        super.onVerifyError(aVar);
        this.f10238a = true;
        GriverMonitor.error(GriverMonitorConstants.ERROR_VERIFY_APP_FAIL, "GriverAppContainer", new MonitorMap.Builder().appId(appId()).version(getAppModel()).code(String.valueOf(aVar.getCode())).exception(aVar).message(GriverMonitorConstants.MESSAGE_VERIFY_NORMAL_PACKAGE_ERROR).needAsynAppType(true).build());
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    public boolean isVerifFailed() {
        return this.f10238a;
    }

    public void onParseDone() {
        super.onParseDone();
        GriverMonitor.event(GriverMonitorConstants.EVENT_VERIFY_APP, "GriverAppContainer", new MonitorMap.Builder().appId(appId()).version(getAppModel()).needAsynAppType(true).build());
    }

    public void afterParsePackage(ParseContext parseContext) {
        super.afterParsePackage(parseContext);
        if (this.f10238a) {
            GriverLogger.w("GriverNormalResourcePackage", "verify failed, do not send load monitor");
        } else if (getAppModel() == null) {
            GriverLogger.w("GriverNormalResourcePackage", "can not find app model, do not sent load monitor");
        } else {
            GriverMonitor.event(GriverMonitorConstants.EVENT_LOAD_OFFLINE_PACKAGE, "GriverAppContainer", new MonitorMap.Builder().appId(getAppModel().getAppId()).version(getAppModel()).append(GriverMonitorConstants.KEY_PACKEGE_TYPE, "resource").needAsynAppType(true).build());
        }
    }
}
