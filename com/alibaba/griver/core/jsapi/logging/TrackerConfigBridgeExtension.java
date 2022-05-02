package com.alibaba.griver.core.jsapi.logging;

import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitorAnalyticsConfigManager;

@Keep
public class TrackerConfigBridgeExtension extends SimpleBridgeExtension {
    private static final String QUERY_TRACKER_CONFIG = "queryTrackerConfig";
    private static final String SHOULD_TRACK = "isTrackerEnable";
    private static final String TAG = "TrackerConfigBridgeExtension";
    private static final String TRIGGER_UPLOAD = "triggerUpload";

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public void trackerConfig(@BindingNode(App.class) App app, @BindingParam(name = {"requestType"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        if (app == null) {
            GriverLogger.e(TAG, "app is null, callback fail");
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        String appId = app.getAppId();
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1524423207) {
            if (hashCode != -474352175) {
                if (hashCode == -186541902 && str.equals(QUERY_TRACKER_CONFIG)) {
                    c = 1;
                }
            } else if (str.equals(SHOULD_TRACK)) {
                c = 0;
            }
        } else if (str.equals(TRIGGER_UPLOAD)) {
            c = 2;
        }
        if (c == 0) {
            queryTrackerEnable(appId, bridgeCallback);
        } else if (c == 1) {
            queryTrackerConfig(appId, bridgeCallback);
        } else if (c == 2) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    private void queryTrackerConfig(String str, BridgeCallback bridgeCallback) {
        try {
            bridgeCallback.sendJSONResponse(JSONUtils.parseObject(GriverMonitorAnalyticsConfigManager.getAnalyticsMonitorConfig(str)));
        } catch (Exception e) {
            GriverLogger.e(TAG, "parse config failed", e);
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        }
    }

    private void queryTrackerEnable(String str, BridgeCallback bridgeCallback) {
        boolean analyticsMonitorEnabled = GriverMonitorAnalyticsConfigManager.analyticsMonitorEnabled(str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", (Object) str);
        jSONObject.put("enable", (Object) Boolean.valueOf(analyticsMonitorEnabled));
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
