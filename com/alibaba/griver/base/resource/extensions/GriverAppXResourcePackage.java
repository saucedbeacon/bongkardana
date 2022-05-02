package com.alibaba.griver.base.resource.extensions;

import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.content.AppxResourcePackage;
import com.alibaba.ariver.resource.parser.ParseContext;
import com.alibaba.ariver.resource.parser.a;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.ToastUtils;

public class GriverAppXResourcePackage extends AppxResourcePackage {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10236a = false;
    private ResourceContext b;

    public GriverAppXResourcePackage(ResourceContext resourceContext) {
        super(resourceContext);
        this.b = resourceContext;
    }

    public void onVerifyError(a aVar) {
        super.onVerifyError(aVar);
        this.f10236a = true;
        GriverMonitor.error(GriverMonitorConstants.ERROR_VERIFY_APP_FAIL, "GriverAppContainer", new MonitorMap.Builder().appId(appId()).version(getAppModel()).exception(aVar).message(GriverMonitorConstants.MESSAGE_VERIFY_APPX_ERROR).needAsynAppType(true).build());
        if (GriverEnv.isDebuggable()) {
            ToastUtils.showToast(GriverEnv.getApplicationContext(), "Mini program framework(APPX) verify error.", 0);
        }
    }

    public boolean verifyFailed() {
        return this.f10236a;
    }

    public void onParseDone() {
        super.onParseDone();
        GriverMonitor.event(GriverMonitorConstants.EVENT_VERIFY_APP, "GriverAppContainer", new MonitorMap.Builder().appId(appId()).version(getAppModel()).needAsynAppType(true).build());
    }

    public void afterParsePackage(ParseContext parseContext) {
        super.afterParsePackage(parseContext);
        if (this.f10236a) {
            GriverLogger.w("GriverAppXResourcePackage", "verify failed, do not send load monitor");
        } else if (getAppModel() == null) {
            GriverLogger.w("GriverAppXResourcePackage", "can not find app model, do not sent load monitor");
        } else {
            GriverMonitor.event(GriverMonitorConstants.EVENT_LOAD_OFFLINE_PACKAGE, "GriverAppContainer", new MonitorMap.Builder().appId(getAppModel().getAppId()).version(getAppModel()).append(GriverMonitorConstants.KEY_PACKEGE_TYPE, "resource").needAsynAppType(true).build());
        }
    }
}
