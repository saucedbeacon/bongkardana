package com.alibaba.griver.base.common.monitor;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorAnalyticsConfigExtension;
import com.alibaba.griver.api.ui.GriverAppExtension;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GriverMonitorAnalyticsConfigManager {
    public static void syncMonitorConfig(final App app, String str) {
        String appId = app.getAppId();
        JSONObject parseObject = JSONUtils.parseObject(GriverInnerConfig.getConfig(GriverConfigConstants.KEY_MONITOR_ANALYTICS_CONFIG, GriverConfigConstants.DEFAULT_MONITOR_ANALYTICS_CONFIG));
        if (!JSONUtils.getBoolean(parseObject, "enable", true)) {
            a((String) null);
            a(appId, false);
            a(appId, (JSONObject) null);
            return;
        }
        JSONArray jSONArray = JSONUtils.getJSONArray(parseObject, "blacklist", (JSONArray) null);
        if (jSONArray == null || !jSONArray.contains(appId)) {
            ((GriverMonitorAnalyticsConfigExtension) RVProxy.get(GriverMonitorAnalyticsConfigExtension.class)).syncMonitorConfig(app, str, new GriverMonitorAnalyticsConfigExtension.GriverMonitorConfigFetchCallback() {
                public final void onFetchSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        GriverLogger.w("GriverMonitorAnalyticsConfigManager", "sync analytics config success, but content is null, return");
                        return;
                    }
                    try {
                        String appId = app.getAppId();
                        boolean z = JSONUtils.getBoolean(jSONObject, "mdapControlConfig", false);
                        String string = BundleUtils.getString(app.getStartParams(), "_ariver_event");
                        if (TextUtils.isEmpty(string)) {
                            string = "eventConfig";
                        }
                        JSONObject jSONObject2 = JSONUtils.getJSONObject(jSONObject, string, (JSONObject) null);
                        GriverMonitorAnalyticsConfigManager.a(appId, z);
                        GriverMonitorAnalyticsConfigManager.a(appId, jSONObject2);
                        GriverMonitorAnalyticsConfigManager.b(appId, z);
                        GriverMonitorAnalyticsConfigManager.a(appId, JSONUtils.toString(jSONObject2));
                    } catch (Exception e) {
                        GriverLogger.e("GriverMonitorAnalyticsConfigManager", "handle analytics config content exception", e);
                    }
                }

                public final void onFetchFailed(String str, String str2) {
                    int length = str != null ? str.length() : 0;
                    int max = dispatchOnCancelled.setMax(length);
                    if (length != max) {
                        onCanceled oncanceled = new onCanceled(length, max, 1);
                        onCancelLoad.setMax(-827040751, oncanceled);
                        onCancelLoad.getMin(-827040751, oncanceled);
                    }
                    StringBuilder sb = new StringBuilder("sync analytics config failed, errorCode: ");
                    sb.append(str);
                    sb.append(", errorMessage: ");
                    sb.append(str2);
                    GriverLogger.e("GriverMonitorAnalyticsConfigManager", sb.toString());
                }
            });
            return;
        }
        a(appId);
        a(appId, false);
        a(appId, (JSONObject) null);
    }

    /* access modifiers changed from: private */
    public static void a(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", (Object) str);
        jSONObject.put("enable", (Object) Boolean.valueOf(z));
        a(str, "onTrackerEnableChange", jSONObject);
    }

    /* access modifiers changed from: private */
    public static void a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) jSONObject);
        a(str, "onTrackerConfigChange", jSONObject2);
    }

    private static void a(String str, String str2, JSONObject jSONObject) {
        App appByAppId = ((GriverAppExtension) RVProxy.get(GriverAppExtension.class)).getAppByAppId(str);
        if (appByAppId != null && appByAppId.getActivePage() != null) {
            EngineUtils.sendToRender(appByAppId.getActivePage().getRender(), str2, jSONObject, (SendToRenderCallback) null);
        }
    }

    public static synchronized boolean analyticsMonitorEnabled(String str) {
        synchronized (GriverMonitorAnalyticsConfigManager.class) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            SharedPreferences b = b();
            if (b == null) {
                return false;
            }
            boolean z = b.getBoolean(str, false);
            return z;
        }
    }

    public static synchronized String getAnalyticsMonitorConfig(String str) {
        synchronized (GriverMonitorAnalyticsConfigManager.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            SharedPreferences a2 = a();
            if (a2 == null) {
                return null;
            }
            String str2 = new String(Base64.decode(a2.getString(str, ""), 0));
            return str2;
        }
    }

    /* access modifiers changed from: private */
    public static synchronized void b(String str, boolean z) {
        synchronized (GriverMonitorAnalyticsConfigManager.class) {
            if (TextUtils.isEmpty(str)) {
                GriverLogger.w("GriverMonitorAnalyticsConfigManager", "appId is empty, do not save, return");
                return;
            }
            SharedPreferences b = b();
            if (b == null) {
                GriverLogger.w("GriverMonitorAnalyticsConfigManager", "get SharedPreference is null, do not save, return");
                return;
            }
            b.edit().putBoolean(str, z).apply();
            GriverLogger.d("GriverMonitorAnalyticsConfigManager", "save analytics control config success, enabled: ".concat(String.valueOf(z)));
        }
    }

    /* access modifiers changed from: private */
    public static synchronized void a(String str, String str2) {
        synchronized (GriverMonitorAnalyticsConfigManager.class) {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    SharedPreferences a2 = a();
                    if (a2 == null) {
                        GriverLogger.w("GriverMonitorAnalyticsConfigManager", "get SharedPreference is null, do not save");
                        return;
                    }
                    a2.edit().putString(str, Base64.encodeToString(str2.getBytes(), 0)).apply();
                    GriverLogger.d("GriverMonitorAnalyticsConfigManager", "save event config success");
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("appId or config is empty, do not save, appId: ");
            sb.append(str);
            sb.append(", config: ");
            sb.append(str2);
            GriverLogger.w("GriverMonitorAnalyticsConfigManager", sb.toString());
        }
    }

    private static void a(String str) {
        SharedPreferences a2 = a();
        SharedPreferences b = b();
        if (TextUtils.isEmpty(str)) {
            if (a2 != null) {
                a2.edit().clear().apply();
            }
            if (b != null) {
                b.edit().clear().apply();
                return;
            }
            return;
        }
        if (a2 != null) {
            a2.edit().remove(str).apply();
        }
        if (b != null) {
            b.edit().remove(str).apply();
        }
    }

    private static SharedPreferences a() {
        if (GriverEnv.getApplicationContext() == null) {
            return null;
        }
        return GriverEnv.getApplicationContext().getSharedPreferences("sp_griver_analytics_event_config", 4);
    }

    private static SharedPreferences b() {
        if (GriverEnv.getApplicationContext() == null) {
            return null;
        }
        return GriverEnv.getApplicationContext().getSharedPreferences("sp_griver_analytics_control_config", 4);
    }
}
