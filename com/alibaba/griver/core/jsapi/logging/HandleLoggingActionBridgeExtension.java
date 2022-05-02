package com.alibaba.griver.core.jsapi.logging;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.monitor.RVMonitor;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.GriverMonitorAnalyticsConfigManager;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.SystemUtils;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.util.HashMap;
import java.util.Map;

@Keep
public class HandleLoggingActionBridgeExtension implements BridgeExtension {
    private static final int LOG_LIMIT = 1000;
    private static final String LOG_TYPE_BEHAVIOR = "behavior";
    private static final String LOG_TYPE_ERROR = "error";
    private static final String LOG_TYPE_PERFORMANCE = "performance";
    private static final String TAG = RVLogger.makeLogTag("HandleLoggingActionBridgeExtension");
    private int mLogCount;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public void handleLoggingAction(@BindingRequest JSONObject jSONObject, @BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        RVLogger.d(TAG, "handleLoggingAction invoke params : ".concat(String.valueOf(jSONObject)));
        if (jSONObject == null || jSONObject.isEmpty()) {
            RVLogger.w(TAG, "invalid params ".concat(String.valueOf(jSONObject)));
            if (bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "params is null"));
            }
        }
        boolean z = true;
        int i = this.mLogCount + 1;
        this.mLogCount = i;
        if (i <= 1000) {
            z = false;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder("handleLoggingAction mLogCount: ");
        sb.append(this.mLogCount);
        RVLogger.d(str, sb.toString());
        if (z) {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder("handleLoggingAction over limit, LogCount : ");
            sb2.append(this.mLogCount);
            RVLogger.d(str2, sb2.toString());
            if (bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                return;
            }
        }
        doCommonLog(page, jSONObject, bridgeCallback);
    }

    private void doCommonLog(Page page, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        String string = JSONUtils.getString(jSONObject, "type");
        String string2 = JSONUtils.getString(jSONObject, "subType");
        JSONObject jSONObject2 = JSONUtils.getJSONObject(jSONObject, "commonData", new JSONObject());
        JSONObject jSONObject3 = JSONUtils.getJSONObject(jSONObject, "extData", new JSONObject());
        Map jsonToMap = JSONUtils.jsonToMap(jSONObject2, new HashMap());
        Map jsonToMap2 = JSONUtils.jsonToMap(jSONObject3, new HashMap());
        MonitorMap.Builder builder = new MonitorMap.Builder();
        builder.appendAll(GriverMonitor.convertObjectToString(jsonToMap)).appendAll(GriverMonitor.convertObjectToString(jsonToMap2));
        AppModel appModel = (AppModel) page.getApp().getData(AppModel.class);
        if (appModel != null) {
            builder.append("sourceSite", JSONUtils.getString(appModel.getExtendInfos(), GriverBaseConstants.KEY_SOURCE_SITE));
        }
        builder.version(page.getApp());
        Map<String, String> build = builder.build();
        if (LOG_TYPE_BEHAVIOR.equals(string)) {
            if (appModel != null) {
                try {
                    JSONObject parseObject = JSONUtils.parseObject(GriverMonitorAnalyticsConfigManager.getAnalyticsMonitorConfig(appModel.getAppId()));
                    if (parseObject != null && TextUtils.equals("test", JSONUtils.getString(parseObject, "configStatus"))) {
                        build.put("debugLogToken", JSONUtils.getString(parseObject, "debugLogToken"));
                    }
                } catch (Exception e) {
                    GriverLogger.e(TAG, "parse analytics monitor failed, do not put debugLogToken", e);
                }
            }
            StringBuilder sb = new StringBuilder(GriverMonitorConstants.APPX_BEHAVIOR_BIZ_TYPE_PREFIX);
            sb.append(page.getApp().getAppId());
            GriverMonitor.event(string2, sb.toString(), build);
            if (bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        } else if ("error".equals(string)) {
            GriverMonitor.error(string2, GriverMonitorConstants.APPX_PERFORMANCE_ERROR_BIZ_TYPE, build);
            if (bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        } else if ("performance".equals(string)) {
            try {
                if (TextUtils.equals(string2, "workerFrameworkLoaded")) {
                    ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(page.getApp(), page.getOriginalURI(), "appxWorkerFrameworkLoaded", SystemUtils.convert2ElapseTime(Long.parseLong(build.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME))));
                } else if (TextUtils.equals(string2, "appLoaded")) {
                    ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(page.getApp(), page.getOriginalURI(), PerfId.appxLoaded, SystemUtils.convert2ElapseTime(Long.parseLong(build.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME))));
                } else if (TextUtils.equals(string2, "pageLoaded")) {
                    ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(page.getApp(), page.getOriginalURI(), "appxPageLoaded", SystemUtils.convert2ElapseTime(Long.parseLong(build.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME))));
                    page.setPageLoaded();
                }
            } catch (Exception e2) {
                GriverLogger.e(TAG, "track performance from appx failed", e2);
            }
            GriverMonitor.performance(string2, GriverMonitorConstants.APPX_PERFORMANCE_ERROR_BIZ_TYPE, build);
            if (bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        } else {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "type invalid"));
        }
    }

    private void doLog(Page page, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        String str;
        String str2;
        String str3;
        Page page2 = page;
        JSONObject jSONObject2 = jSONObject;
        BridgeCallback bridgeCallback2 = bridgeCallback;
        String string = JSONUtils.getString(jSONObject2, "type");
        String string2 = JSONUtils.getString(jSONObject2, "subType");
        String string3 = JSONUtils.getString(jSONObject2, "spmId");
        JSONObject jSONObject3 = JSONUtils.getJSONObject(jSONObject2, "commonData", new JSONObject());
        JSONObject jSONObject4 = JSONUtils.getJSONObject(jSONObject2, "extData", new JSONObject());
        String string4 = JSONUtils.getString(jSONObject2, "actionType");
        if ("reportEvent".equalsIgnoreCase(string4)) {
            JSONObject jSONObject5 = JSONUtils.getJSONObject(jSONObject2, "params", new JSONObject());
            String string5 = JSONUtils.getString(jSONObject5, "eventId");
            String string6 = JSONUtils.getString(jSONObject5, "bizType");
            String string7 = JSONUtils.getString(jSONObject5, "spmId");
            str2 = "performance";
            if ("10073".equalsIgnoreCase(string5)) {
                str3 = str2;
            } else if ("10201".equalsIgnoreCase(string5)) {
                str3 = "error";
            } else {
                jSONObject4.put("param", (Object) jSONObject2);
                str3 = LOG_TYPE_BEHAVIOR;
            }
            jSONObject4 = JSONUtils.getJSONObject(jSONObject5, "extData", jSONObject4);
            String string8 = JSONUtils.getString(jSONObject4, "state");
            jSONObject4.put("bizType", (Object) string6);
            jSONObject4.put("spmId", (Object) string7);
            if (str3.equals(LOG_TYPE_BEHAVIOR)) {
                jSONObject4.put("param", (Object) jSONObject2);
            }
            str = string8;
            string = str3;
            string3 = string7;
        } else {
            str2 = "performance";
            if (!TextUtils.isEmpty(string4)) {
                jSONObject4.put("param", (Object) jSONObject2);
                str = string2;
                string = LOG_TYPE_BEHAVIOR;
            } else {
                str = string2;
            }
        }
        Map jsonToMap = JSONUtils.jsonToMap(jSONObject3, new HashMap());
        Map jsonToMap2 = JSONUtils.jsonToMap(jSONObject4, new HashMap());
        if (!TextUtils.isEmpty(string3)) {
            jsonToMap.put("spmId", string3);
        }
        if (LOG_TYPE_BEHAVIOR.equals(string)) {
            RVPerformanceLogHelper.fillAppCommonInfo(page.getApp(), jsonToMap);
            RVPerformanceLogHelper.fillPageCommonInfo(page2, jsonToMap);
            ((RVMonitor) RVProxy.get(RVMonitor.class)).behavior(page, str, jsonToMap, jsonToMap2, bridgeCallback);
        } else if ("error".equals(string)) {
            String string9 = JSONUtils.getString(jSONObject4, "errorCode");
            String string10 = JSONUtils.getString(jSONObject4, "msg");
            RVPerformanceLogHelper.fillAppCommonInfo(page.getApp(), jsonToMap);
            RVPerformanceLogHelper.fillPageCommonInfo(page2, jsonToMap);
            ((RVMonitor) RVProxy.get(RVMonitor.class)).error(page, str, string9, string10, jsonToMap, jsonToMap2);
            if (bridgeCallback2 != null) {
                bridgeCallback2.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        } else if (str2.equals(string)) {
            handlePerformanceLog(page.getApp(), page.getPageURI(), str, jsonToMap, jsonToMap2);
            if (bridgeCallback2 != null) {
                bridgeCallback2.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        } else {
            bridgeCallback2.sendBridgeResponse(new BridgeResponse.Error(2, "type invalid"));
        }
    }

    private void handlePerformanceLog(App app, String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(app, str, str2, map, map2, -1);
    }
}
