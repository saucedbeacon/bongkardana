package com.alibaba.griver.base.stagemonitor.impl;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.constants.GriverErrors;
import com.alibaba.griver.base.api.GriverPerformanceStages;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitor;
import java.util.Map;

public class GriverFullLinkStageMonitor extends GriverStageMonitor {
    public static final String MONITOR_TOKEN = "full_link";

    public static String getMonitorToken(App app) {
        if (app == null) {
            return MONITOR_TOKEN;
        }
        StringBuilder sb = new StringBuilder(MONITOR_TOKEN);
        sb.append(app.getAppId());
        sb.append(app.getStartToken());
        return sb.toString();
    }

    public void transitToError(String str) {
        this.paramMap.put(GriverMonitorConstants.KEY_OPEN_APP_ERROR, str);
    }

    public void upload(App app) {
        try {
            GriverMonitor.performance("RV_APP_STARTUP", "GriverAppContainer", a(app));
        } catch (Exception e) {
            GriverLogger.e("FullLinkStepMonitor", "get common data failed", e);
        }
    }

    private Map<String, String> a(App app) {
        MonitorMap.Builder builder = new MonitorMap.Builder();
        try {
            AppModel appModel = (AppModel) app.getData(AppModel.class);
            if (appModel != null) {
                builder.appId(appModel.getAppId()).url(app.getStartUrl()).version(appModel).env(GriverEnv.getEnvironment()).needAsynAppType(true);
            } else {
                builder.appId(app.getAppId()).url(app.getStartUrl()).env(GriverEnv.getEnvironment()).needAsynAppType(true);
            }
            if (!a(this.stageMap, "appxPageLoaded")) {
                if (!a(this.stageMap, "firstScreen") && this.paramMap.get(GriverMonitorConstants.KEY_OPEN_APP_ERROR) == null) {
                    transitToNext(GriverPerformanceStages.KEY_APP_STARTUP_BREAK);
                    transitToError(GriverErrors.ERROR_APP_CLOSED_ABNORMAL);
                }
            }
            if (AppInfoUtils.isTinyApp(appModel) && this.paramMap.get(GriverMonitorConstants.KEY_APP_SOURCE_TYPE) == null) {
                addParam(GriverMonitorConstants.KEY_APP_SOURCE_TYPE, GriverMonitorConstants.MINI_PROGRAM_APP_SOURCE_TYPE_LOCAL);
            }
            builder.appendAll(GriverMonitor.convertObjectToString(this.stageMap));
            builder.appendAll(GriverMonitor.convertObjectToString(this.paramMap));
            if (a(this.stageMap, "firstScreen")) {
                builder.append(GriverMonitorConstants.KEY_LAUNCH_COST, String.valueOf(((Long) this.stageMap.get("firstScreen")).longValue() - ((Long) this.stageMap.get(PerfId.jumpAppStart)).longValue()));
            } else if (a(this.stageMap, "appxPageLoaded")) {
                builder.append(GriverMonitorConstants.KEY_LAUNCH_COST, String.valueOf(((Long) this.stageMap.get("appxPageLoaded")).longValue() - ((Long) this.stageMap.get(PerfId.jumpAppStart)).longValue()));
            }
        } catch (Exception e) {
            GriverLogger.w("FullLinkStepMonitor", "parse performance data failed", e);
        }
        return builder.build();
    }

    private boolean a(Map<String, Long> map, String str) {
        return map != null && map.containsKey(str) && map.get(str) != null && map.get(str).longValue() > 0;
    }
}
