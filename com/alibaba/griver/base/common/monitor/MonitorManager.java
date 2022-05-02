package com.alibaba.griver.base.common.monitor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MonitorManager {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f9163a = new ArrayList();
    private static final Random b = new Random(System.currentTimeMillis());

    static {
        f9163a.add(GriverMonitorConstants.EVENT_REGISTER_WORKER_SUCCESS);
    }

    protected static boolean shouldNotMonitor(String str, Map<String, String> map) {
        if (a(str, map) && !f9163a.contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean jsapiEnabled() {
        JSONObject jSONObject;
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_MONITOR_SWITCH, GriverConfigConstants.DEFAULT_MONITOR_SWITCH);
        try {
            jSONObject = JSON.parseObject(config);
        } catch (Exception e) {
            GriverLogger.e("MonitorManager", "parse monitor config failed: ".concat(String.valueOf(config)), e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = JSON.parseObject(GriverConfigConstants.DEFAULT_MONITOR_SWITCH);
        }
        return jSONObject.getBooleanValue(GriverConfigConstants.PARAM_MONITOR_JSAPI_SWITCH);
    }

    private static boolean a(String str, Map<String, String> map) {
        JSONObject jSONObject;
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_MONITOR_SWITCH, GriverConfigConstants.DEFAULT_MONITOR_SWITCH);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = JSON.parseObject(config);
        } catch (Exception e) {
            GriverLogger.e("MonitorManager", "parse monitor config failed: ".concat(String.valueOf(config)), e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!jSONObject.getBooleanValue(GriverConfigConstants.PARAM_MONITOR_MAIN_SWITCH)) {
            return false;
        }
        if (!jSONObject.containsKey(str)) {
            return true;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("get detail config for: ");
            sb.append(str);
            sb.append(" failed");
            GriverLogger.w("MonitorManager", sb.toString());
        }
        if (jSONObject2 == null || !jSONObject2.getBooleanValue("enable")) {
            return false;
        }
        if (!jSONObject2.containsKey(GriverMonitorConstants.KEY_SAMPLE_RATE)) {
            return true;
        }
        double doubleValue = jSONObject2.getDoubleValue(GriverMonitorConstants.KEY_SAMPLE_RATE);
        if (map != null) {
            map.put(GriverMonitorConstants.KEY_SAMPLE_RATE, String.valueOf(doubleValue));
        }
        double nextInt = (double) b.nextInt(1000);
        Double.isNaN(nextInt);
        double d = nextInt / 1000.0d;
        GriverLogger.d("MonitorManager", "random sample rate:".concat(String.valueOf(d)));
        if (d < doubleValue) {
            return true;
        }
        GriverLogger.w("MonitorManager", "do not fit the sample rate, do not upload");
        return false;
    }

    public static boolean exceedThreshold(String str, double d) {
        return d >= getThreshold(str);
    }

    public static double getThreshold(String str) {
        if (!GriverMonitorConstants.defaultThresholdMap.containsKey(str)) {
            return 0.0d;
        }
        double doubleValue = GriverMonitorConstants.defaultThresholdMap.get(str).doubleValue();
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_MONITOR_SWITCH, GriverConfigConstants.DEFAULT_MONITOR_SWITCH);
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(config);
        } catch (Exception e) {
            GriverLogger.e("MonitorManager", "parse monitor config failed: ".concat(String.valueOf(config)), e);
        }
        if (jSONObject != null && jSONObject.containsKey(str)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2.containsKey(GriverMonitorConstants.KEY_THRESHOLD)) {
                    try {
                        return jSONObject2.getDoubleValue(GriverMonitorConstants.KEY_THRESHOLD);
                    } catch (Exception unused) {
                        GriverLogger.w("MonitorManager", "parse double value config failed for threshold, use default");
                        return doubleValue;
                    }
                } else {
                    GriverLogger.w("MonitorManager", "does not have cloud threshold, use default");
                    return doubleValue;
                }
            } catch (Exception unused2) {
                GriverLogger.w("MonitorManager", "parse monitor config failed for threshold, use default");
            }
        }
        return doubleValue;
    }
}
