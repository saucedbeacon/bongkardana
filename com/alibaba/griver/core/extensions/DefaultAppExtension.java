package com.alibaba.griver.core.extensions;

import android.os.Handler;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.point.app.AppExitPoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.api.common.page.GriverAppEvent;
import com.alibaba.griver.api.ui.GriverAppExtension;
import com.alibaba.griver.base.common.monitor.GriverMonitor;

public class DefaultAppExtension implements AppExitPoint, AppStartPoint {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onAppStart(App app) {
        ((GriverAppExtension) RVProxy.get(GriverAppExtension.class)).onAppStart(app);
        ExtensionPoint.as(GriverAppEvent.class).node(app).create().onAppStart(app);
    }

    public void onAppExit(App app) {
        ((GriverAppExtension) RVProxy.get(GriverAppExtension.class)).onAppExit(app);
        ExtensionPoint.as(GriverAppEvent.class).node(app).create().onAppExit(app);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                GriverMonitor.upload();
            }
        }, 1000);
    }
}
