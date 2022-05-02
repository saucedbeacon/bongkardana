package com.alibaba.griver.base.common.monitor;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorProxy;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GriverMonitor {
    public static void event(final String str, final String str2, final Map<String, String> map) {
        GriverExecutors.getSingleMonitorThreadExecutor().execute(new Runnable() {
            public final void run() {
                if (MonitorManager.shouldNotMonitor(str, map)) {
                    StringBuilder sb = new StringBuilder("monitor do not upload: ");
                    sb.append(str);
                    GriverLogger.w("GriverMonitor", sb.toString());
                    return;
                }
                GriverMonitor.a(map);
                GriverMonitor.b(map);
                GriverMonitor.c(map);
                GriverMonitor.a("EVENT", str, str2, map);
                GriverMonitor.b("EVENT", str, str2, map);
                GriverMonitor.a().event(str, str2, map);
            }
        });
    }

    public static void performance(final String str, final String str2, final Map<String, String> map) {
        GriverExecutors.getSingleMonitorThreadExecutor().execute(new Runnable() {
            public final void run() {
                if (MonitorManager.shouldNotMonitor(str, map)) {
                    StringBuilder sb = new StringBuilder("monitor do not upload: ");
                    sb.append(str);
                    GriverLogger.w("GriverMonitor", sb.toString());
                    return;
                }
                GriverMonitor.a(map);
                GriverMonitor.b(map);
                GriverMonitor.c(map);
                GriverMonitor.a("PERFORMANCE", str, str2, map);
                GriverMonitor.b("PERFORMANCE", str, str2, map);
                DebugMonitor.writeDebugMonitor(str, str2, map);
                GriverMonitor.a().performance(str, str2, map);
            }
        });
    }

    public static void error(final String str, final String str2, final Map<String, String> map) {
        GriverExecutors.getSingleMonitorThreadExecutor().execute(new Runnable() {
            public final void run() {
                if (MonitorManager.shouldNotMonitor(str, map)) {
                    StringBuilder sb = new StringBuilder("monitor do not upload: ");
                    sb.append(str);
                    GriverLogger.w("GriverMonitor", sb.toString());
                    return;
                }
                GriverMonitor.a(map);
                GriverMonitor.b(map);
                GriverMonitor.c(map);
                GriverMonitor.a("Error", str, str2, map);
                GriverMonitor.b("Error", str, str2, map);
                GriverMonitor.a().error(str, str2, map);
            }
        });
    }

    public static void pageStart(final Object obj, final String str) {
        GriverExecutors.getSingleMonitorThreadExecutor().execute(new Runnable() {
            public final void run() {
                if (MonitorManager.shouldNotMonitor(GriverMonitorConstants.EVENT_NATIVE_PAGE_START, (Map<String, String>) null)) {
                    GriverLogger.w("GriverMonitor", "monitor not enabled, do not upload native page start");
                    return;
                }
                StringBuilder sb = new StringBuilder("page start monitor: ");
                sb.append(str);
                GriverLogger.d("GriverMonitor", sb.toString());
                GriverMonitor.a().pageStart(obj, str);
            }
        });
    }

    public static void pageExit(final Object obj, final String str, final String str2, final Map<String, String> map) {
        GriverExecutors.getSingleMonitorThreadExecutor().execute(new Runnable() {
            public final void run() {
                if (MonitorManager.shouldNotMonitor(GriverMonitorConstants.EVENT_NATIVE_PAGE_END, (Map<String, String>) null)) {
                    GriverLogger.w("GriverMonitor", "monitor not enabled, do not upload native page exit");
                    return;
                }
                StringBuilder sb = new StringBuilder("page exit monitor: ");
                sb.append(str);
                GriverLogger.d("GriverMonitor", sb.toString());
                GriverMonitor.a().pageExit(obj, str, str2, map);
            }
        });
    }

    public static void pageDestroy(final Object obj) {
        GriverExecutors.getSingleMonitorThreadExecutor().execute(new Runnable() {
            public final void run() {
                if (MonitorManager.shouldNotMonitor(GriverMonitorConstants.EVENT_NATIVE_PAGE_DESTROY, (Map<String, String>) null)) {
                    GriverLogger.w("GriverMonitor", "monitor not enabled, do not upload native page destroy");
                    return;
                }
                StringBuilder sb = new StringBuilder("page destroy monitor: ");
                sb.append(obj);
                GriverLogger.d("GriverMonitor", sb.toString());
                GriverMonitor.a().pageDestroy(obj);
            }
        });
    }

    public static void upload() {
        GriverExecutors.getSingleMonitorThreadExecutor().execute(new Runnable() {
            public final void run() {
                GriverMonitor.a().upload();
            }
        });
    }

    /* access modifiers changed from: private */
    public static GriverMonitorProxy a() {
        return (GriverMonitorProxy) RVProxy.get(GriverMonitorProxy.class);
    }

    public static Map<String, String> getCommonExceptionMap(Throwable th) {
        HashMap hashMap = new HashMap();
        if (th == null) {
            GriverLogger.w("GriverMonitor", "exception is null, return empty map");
            return hashMap;
        }
        hashMap.put(GriverMonitorConstants.KEY_EXCEPTION_CLASS, th.getClass().getName());
        hashMap.put(GriverMonitorConstants.KEY_EXCEPTION_MESSAGE, th.getLocalizedMessage());
        return hashMap;
    }

    public static HashMap<String, String> convertObjectToString(Map<String, ? extends Object> map) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                hashMap.put(next.getKey(), next.getValue() == null ? "" : next.getValue().toString());
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static void a(String str, String str2, String str3, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("MONITOR ");
        sb.append(str);
        sb.append("\n");
        sb.append("monitorId: ");
        sb.append(str2);
        sb.append("\n");
        sb.append("bizType: ");
        sb.append(str3);
        sb.append("\n");
        sb.append("extras: \n");
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(":");
                sb.append((String) next.getValue());
                sb.append("\n");
            }
        }
        GriverLogger.d("GriverMonitor", sb.toString());
    }

    /* access modifiers changed from: private */
    public static void b(String str, String str2, String str3, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("MONITOR ");
        sb.append(str);
        sb.append(",");
        sb.append("monitorId: ");
        sb.append(str2);
        sb.append(",");
        sb.append("bizType: ");
        sb.append(str3);
        sb.append(",");
        sb.append("extras: ,");
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(":");
                sb.append((String) next.getValue());
                sb.append(",");
            }
        }
        GriverLogger.d("GriverMonitor", sb.toString());
    }

    /* access modifiers changed from: private */
    public static void a(Map<String, String> map) {
        if (map != null) {
            if (SummaryActivity.CHECKED.equalsIgnoreCase(map.get(GriverMonitorConstants.KEY_NEED_ASYNC_APP_TYPE)) && map.containsKey("appId")) {
                List<AppModel> queryAppInfo = GriverAppCenter.queryAppInfo(map.get("appId"));
                String str = GriverMonitorConstants.APP_TYPE_MINI;
                boolean z = false;
                if (queryAppInfo == null || queryAppInfo.size() <= 0) {
                    String str2 = map.get("appId");
                    if (TextUtils.isEmpty(str2) || str2.endsWith(GriverBaseConstants.H5_ONLINE_SUFFIX)) {
                        z = true;
                    }
                    if (z) {
                        str = GriverMonitorConstants.APP_TYPE_H5;
                    }
                    map.put("appType", str);
                } else if (AppInfoUtils.isTinyApp(queryAppInfo.get(0))) {
                    if (AppInfoUtils.isEmbeddedApp(queryAppInfo.get(0))) {
                        map.put(GriverMonitorConstants.KEY_MINI_PROGRAM_TYPE, GriverMonitorConstants.MINI_PROGRAM_TYPE_PWA);
                    } else {
                        map.put(GriverMonitorConstants.KEY_MINI_PROGRAM_TYPE, GriverMonitorConstants.MINI_PROGRAM_TYPE_DSL);
                    }
                    map.put("appType", str);
                } else {
                    map.put("appType", GriverMonitorConstants.APP_TYPE_H5);
                }
            }
            map.remove(GriverMonitorConstants.KEY_NEED_ASYNC_APP_TYPE);
        }
    }

    /* access modifiers changed from: private */
    public static void b(Map<String, String> map) {
        if (map != null && map.size() != 0 && map.containsKey("appId") && map.get("appId") != null) {
            String str = map.get("appId");
            if (TextUtils.equals(GriverBaseConstants.H5_PURE_ONLINE_ID, str)) {
                map.put("appId", "");
                map.put(GriverMonitorConstants.KEY_LOAD_TYPE, "online");
            } else if (str.contains(GriverBaseConstants.H5_ONLINE_SUFFIX)) {
                map.put("appId", str.replace(GriverBaseConstants.H5_ONLINE_SUFFIX, ""));
                map.put(GriverMonitorConstants.KEY_LOAD_TYPE, "online");
            }
        }
    }

    /* access modifiers changed from: private */
    public static void c(Map<String, String> map) {
        AppModel queryHighestAppInfo;
        if (map != null && map.size() != 0 && GriverMonitorConstants.APP_TYPE_MINI.equals(map.get("appType")) && !TextUtils.isEmpty(map.get("appId")) && (queryHighestAppInfo = GriverAppCenter.queryHighestAppInfo(map.get("appId"))) != null && queryHighestAppInfo.getAppInfoModel() != null) {
            if (!TextUtils.isEmpty(queryHighestAppInfo.getAppInfoModel().getDeveloperVersion())) {
                map.put("version", queryHighestAppInfo.getAppInfoModel().getDeveloperVersion());
            }
            if (!TextUtils.isEmpty(queryHighestAppInfo.getAppInfoModel().getVersion())) {
                map.put("deployVersion", queryHighestAppInfo.getAppInfoModel().getVersion());
            }
        }
    }
}
