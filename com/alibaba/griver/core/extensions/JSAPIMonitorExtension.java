package com.alibaba.griver.core.extensions;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.point.NativeCallResultPoint;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorManager;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.MonitorUtils;
import com.alibaba.griver.core.common.monitor.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JSAPIMonitorExtension implements NativeCallResultPoint {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f10303a;
    private Random b;

    public void onFinalized() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        f10303a = arrayList;
        arrayList.add("internalAPI");
        f10303a.add("postMessage");
        f10303a.add("onAppPerfEvent");
        f10303a.add("getAppInfo");
        f10303a.add("remoteLog");
        f10303a.add("tinyAppConfig");
        f10303a.add("setAppxVersion");
        f10303a.add("getConfig4Appx");
        f10303a.add("registerWorker");
        f10303a.add("handleLoggingAction");
        f10303a.add("NBComponent.render");
        f10303a.add("NBComponent.sendMessage");
        f10303a.add("postWebViewMessage");
        f10303a.add("onCubeAppPerfEvent");
        f10303a.add("monitorH5Performance");
        f10303a.add("loadSubPackage");
        f10303a.add("setInputTextChanged");
        f10303a.add("hideCustomKeyBoard");
        f10303a.add(RDConstant.TINY_DEBUG_CONSOLE);
    }

    public void onSendBack(NativeCallContext nativeCallContext, JSONObject jSONObject) {
        Page page;
        MonitorMap.Builder builder = new MonitorMap.Builder();
        String name = nativeCallContext.getName();
        builder.apiName(name);
        if (b.a(name)) {
            b.a(nativeCallContext, jSONObject);
        }
        if (!f10303a.contains(name) && a()) {
            if (jSONObject != null) {
                Integer integer = jSONObject.getInteger("error");
                if (integer == null || integer.intValue() == 0) {
                    builder.append("status", "success");
                } else {
                    builder.append("status", "error").code(String.valueOf(integer)).message(jSONObject.getString("errorMessage"));
                }
            } else {
                builder.append("status", "success");
            }
            if (!(!(nativeCallContext.getNode() instanceof Page) || (page = (Page) nativeCallContext.getNode()) == null || page.getApp() == null)) {
                App app = page.getApp();
                builder.appId(app.getAppId()).version(app).needAsynAppType(true).append("sourceInfo", MonitorUtils.getSourceInfoFromStartupParams(app.getStartParams()));
            }
            GriverMonitor.event(GriverMonitorConstants.EVENT_API_CALL, "GriverAppContainer", builder.build());
        }
    }

    private boolean a() {
        if (MonitorManager.jsapiEnabled()) {
            return true;
        }
        GriverLogger.d("JSAPIMonitorExtension", "jsapi monitor is not enable");
        return false;
    }

    public void onInitialized() {
        this.b = new Random(System.currentTimeMillis());
    }
}
