package com.alibaba.griver.base.stagemonitor.impl;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitor;
import java.util.Map;

public class GriverWhiteScreenStageMonitor extends GriverStageMonitor {
    public static final String MONITOR_TOKEN = "default_url";

    public void transitToError(String str) {
    }

    public static String getMonitorToken(App app, String str) {
        if (app != null && !TextUtils.isEmpty(str)) {
            long startToken = app.getStartToken();
            String appId = app.getAppId();
            if (!TextUtils.isEmpty(appId)) {
                StringBuilder sb = new StringBuilder();
                sb.append(appId);
                sb.append(startToken);
                sb.append(UrlUtils.getPathAndHash(str));
                return sb.toString();
            }
        }
        return "default_url";
    }

    public void upload(App app) {
        try {
            GriverMonitor.event(GriverMonitorConstants.EVENT_APP_WHITE_SCREEN, "GriverAppContainer", a(app));
        } catch (Exception e) {
            GriverLogger.e("WhiteScreenStageMonitor", "get common data failed", e);
        }
    }

    private Map<String, String> a(App app) {
        MonitorMap.Builder builder = new MonitorMap.Builder();
        try {
            AppModel appModel = (AppModel) app.getData(AppModel.class);
            if (appModel != null) {
                builder.appId(appModel.getAppId()).version(appModel).env(GriverEnv.getEnvironment()).needAsynAppType(true);
            } else {
                builder.appId(app.getAppId()).env(GriverEnv.getEnvironment()).needAsynAppType(true);
            }
            if (this.paramMap.size() == 0) {
                addParam(GriverMonitorConstants.KEY_RENDERED, "break");
            }
            builder.appendAll(GriverMonitor.convertObjectToString(this.stageMap));
            builder.appendAll(GriverMonitor.convertObjectToString(this.paramMap));
        } catch (Exception e) {
            GriverLogger.w("WhiteScreenStageMonitor", "parse performance data failed", e);
        }
        return builder.build();
    }
}
