package com.alibaba.griver.core.resource;

import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.resource.parser.a;
import com.alibaba.griver.api.resource.extensions.GriverParseFailedPoint;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.resource.utils.ErrorPageUtils;
import com.alibaba.griver.core.Griver;
import java.lang.ref.WeakReference;

public class GriverParseFailedExtension implements NodeAware<App>, GriverParseFailedPoint {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<App> f10355a;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void setNode(WeakReference<App> weakReference) {
        this.f10355a = weakReference;
    }

    public Class<App> getNodeType() {
        return App.class;
    }

    public void parseFailed(a aVar) {
        WeakReference<App> weakReference = this.f10355a;
        if (weakReference != null && weakReference.get() != null) {
            final App app = this.f10355a.get();
            try {
                app.exit();
            } catch (Exception e) {
                GriverLogger.w("GriverParseFailedExtension", "exit app failed", e);
            }
            GriverExecutors.getExecutor(ExecutorType.UI).execute(new Runnable() {
                public void run() {
                    Griver.openUrl(GriverEnv.getApplicationContext(), ErrorPageUtils.getErrorUrl(app.getAppId(), ErrorPageUtils.STATUS_LOAD_FAILED, ErrorPageUtils.ERROR_TYPE_MINI), new Bundle());
                }
            });
        }
    }
}
