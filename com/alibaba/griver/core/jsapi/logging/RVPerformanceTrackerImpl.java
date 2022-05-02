package com.alibaba.griver.core.jsapi.logging;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitor;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager;
import com.alibaba.griver.base.stagemonitor.impl.GriverFullLinkStageMonitor;
import com.alibaba.griver.base.stagemonitor.impl.GriverWhiteScreenStageMonitor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RVPerformanceTrackerImpl implements RVPerformanceTracker {
    public static final String RV_PERFORMANCE_APP_STARTUP_TYPE = "RV_APP_STARTUP";
    public static final String RV_PERFORMANCE_PAGE_TYPE = "RV_APP_PAGE";
    public static final String TAG = "RVPerformanceTracker";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, RVPerformanceModel> f10308a = new ConcurrentHashMap();
    private Map<String, RVPerformanceModel> b = new ConcurrentHashMap();

    public void setPerformanceStageReentrantWhiteList(List<String> list) {
    }

    public void init(String str, String str2, Long l, String str3) {
        try {
            a(str, str2, l, str3);
        } catch (Throwable th) {
            RVLogger.e(TAG, "performance logger init error.", th);
        }
    }

    private void a(String str, String str2, Long l, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(l);
        String obj = sb.toString();
        if ("RV_APP_STARTUP".equals(str)) {
            String concat = GriverFullLinkStageMonitor.MONITOR_TOKEN.concat(String.valueOf(obj));
            if (GriverStageMonitorManager.getInstance().getStageMonitor(concat) == null) {
                GriverStageMonitorManager.getInstance().registerStageMonitor(concat, new GriverFullLinkStageMonitor());
            }
            if (this.f10308a.containsKey(obj)) {
                RVLogger.d(TAG, "app perf already init");
                return;
            }
        }
        if ("RV_APP_PAGE".equals(str)) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "default_url";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(l);
            sb2.append(UrlUtils.getPathAndHash(str3));
            obj = sb2.toString();
            if (GriverStageMonitorManager.getInstance().getStageMonitor(obj) == null) {
                GriverStageMonitorManager.getInstance().registerStageMonitor(obj, new GriverWhiteScreenStageMonitor());
                GriverStageMonitorManager.getInstance().getStageMonitor(obj).addParam(GriverMonitorConstants.KEY_PAGE_URL, str3);
            }
            if (this.b.containsKey(obj)) {
                RVLogger.d(TAG, "page perf already init");
                return;
            }
        }
        RVPerformanceModel rVPerformanceModel = new RVPerformanceModel();
        rVPerformanceModel.setCurrentAppId(str2);
        rVPerformanceModel.setInitScene(str);
        rVPerformanceModel.setCurrentStartToken(l);
        if ("RV_APP_STARTUP".equals(str)) {
            this.f10308a.put(obj, rVPerformanceModel);
        } else {
            this.b.put(obj, rVPerformanceModel);
        }
    }

    public void track(App app, String str, String str2) {
        track(app, str, str2, SystemClock.elapsedRealtime());
    }

    public void track(App app, String str, String str2, long j) {
        if (!TextUtils.equals(str2, PerfId.jumpAppStart) || j != 0) {
            track(app, str, str2, (Map<String, Object>) null, (Map<String, Object>) null, j);
        }
    }

    public void track(App app, String str, String str2, Map<String, Object> map, Map<String, Object> map2, long j) {
        RVPerformanceModel rVPerformanceModel;
        GriverStageMonitor stageMonitor;
        if (j < 0) {
            j = SystemClock.elapsedRealtime();
        }
        long j2 = j;
        if (RVKernelUtils.isDebug()) {
            RVLogger.d(TAG, String.format("Track[Stage] %s, [timeStamp] %d", new Object[]{str2, Long.valueOf(j2)}));
        }
        String appPerfKey = RVPerformanceLogHelper.getAppPerfKey(app);
        String pagePerfKey = RVPerformanceLogHelper.getPagePerfKey(app, str);
        RVPerformanceModel rVPerformanceModel2 = this.f10308a.get(appPerfKey);
        RVPerformanceModel rVPerformanceModel3 = this.b.get(pagePerfKey);
        if (!(app == null || app.getStartParams() == null)) {
            RVPerformanceLogHelper.safelyFillForConcurrentMap(GriverMonitorConstants.KEY_START_MODE, app.getStartParams().getString(GriverMonitorConstants.KEY_START_MODE), map);
        }
        if (!(rVPerformanceModel2 == null || (stageMonitor = GriverStageMonitorManager.getInstance().getStageMonitor(GriverFullLinkStageMonitor.MONITOR_TOKEN.concat(String.valueOf(appPerfKey)))) == null)) {
            stageMonitor.transitToNext(str2, j2);
        }
        if (rVPerformanceModel3 == null) {
            RVPerformanceModel rVPerformanceModel4 = this.b.get(RVPerformanceLogHelper.getPagePerfKey(app, ""));
            if (rVPerformanceModel4 != null) {
                rVPerformanceModel = rVPerformanceModel4;
            } else {
                return;
            }
        } else {
            rVPerformanceModel = rVPerformanceModel3;
        }
        rVPerformanceModel.track(str2, str, map, map2, j2);
    }

    public void uploadPerfLog(App app, String str, String str2) {
        try {
            a(app, str, str2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(com.alibaba.ariver.app.api.App r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "RVPerformanceTracker"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = "logPerf : "
            r1.<init>(r2)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r8.getAppId()     // Catch:{ all -> 0x00e5 }
            r1.append(r2)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch:{ all -> 0x00e5 }
            r1.append(r9)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch:{ all -> 0x00e5 }
            r1.append(r10)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e5 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.debug(r0, r1)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "RV_APP_PAGE"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = com.alibaba.griver.core.jsapi.logging.RVPerformanceLogHelper.getPagePerfKey(r8, r9)     // Catch:{ all -> 0x00e5 }
            java.util.Map<java.lang.String, com.alibaba.griver.core.jsapi.logging.RVPerformanceModel> r1 = r7.b     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x00e5 }
            com.alibaba.griver.core.jsapi.logging.RVPerformanceModel r1 = (com.alibaba.griver.core.jsapi.logging.RVPerformanceModel) r1     // Catch:{ all -> 0x00e5 }
            if (r1 != 0) goto L_0x0077
            java.lang.String r0 = ""
            java.lang.String r0 = com.alibaba.griver.core.jsapi.logging.RVPerformanceLogHelper.getPagePerfKey(r8, r0)     // Catch:{ all -> 0x00e5 }
            java.util.Map<java.lang.String, com.alibaba.griver.core.jsapi.logging.RVPerformanceModel> r1 = r7.b     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x00e5 }
            com.alibaba.griver.core.jsapi.logging.RVPerformanceModel r1 = (com.alibaba.griver.core.jsapi.logging.RVPerformanceModel) r1     // Catch:{ all -> 0x00e5 }
            goto L_0x0077
        L_0x004d:
            java.lang.String r0 = com.alibaba.griver.core.jsapi.logging.RVPerformanceLogHelper.getAppPerfKey(r8)     // Catch:{ all -> 0x00e5 }
            java.util.Map<java.lang.String, com.alibaba.griver.core.jsapi.logging.RVPerformanceModel> r1 = r7.f10308a     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x00e5 }
            com.alibaba.griver.core.jsapi.logging.RVPerformanceModel r1 = (com.alibaba.griver.core.jsapi.logging.RVPerformanceModel) r1     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = "full_link"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00e5 }
            com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager r3 = com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager.getInstance()     // Catch:{ all -> 0x00e5 }
            com.alibaba.griver.base.stagemonitor.GriverStageMonitor r3 = r3.getStageMonitor(r2)     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x0070
            r3.upload(r8)     // Catch:{ all -> 0x00e5 }
        L_0x0070:
            com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager r3 = com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager.getInstance()     // Catch:{ all -> 0x00e5 }
            r3.unRegisterStageMonitor(r2)     // Catch:{ all -> 0x00e5 }
        L_0x0077:
            if (r1 != 0) goto L_0x007b
            monitor-exit(r7)
            return
        L_0x007b:
            r1.fillAppInfo(r8)     // Catch:{ all -> 0x00e5 }
            java.util.Map r2 = r1.getCommonDatas()     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x008d
            java.util.Map r2 = r1.getCommonDatas()     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "url"
            r2.put(r3, r9)     // Catch:{ all -> 0x00e5 }
        L_0x008d:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x00e5 }
            java.util.Map r9 = r1.getCommonDatas()     // Catch:{ all -> 0x00e5 }
            r3.<init>(r9)     // Catch:{ all -> 0x00e5 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x00e5 }
            java.util.Map r9 = r1.getExtDatas()     // Catch:{ all -> 0x00e5 }
            r4.<init>(r9)     // Catch:{ all -> 0x00e5 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x00e5 }
            java.util.Map r9 = r1.getPerformanceStages()     // Catch:{ all -> 0x00e5 }
            r5.<init>(r9)     // Catch:{ all -> 0x00e5 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x00e5 }
            java.util.Map r9 = r1.getEvents()     // Catch:{ all -> 0x00e5 }
            r6.<init>(r9)     // Catch:{ all -> 0x00e5 }
            r1.clear()     // Catch:{ all -> 0x00e5 }
            java.lang.String r9 = "RV_APP_STARTUP"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x00e5 }
            if (r9 == 0) goto L_0x00c3
            java.util.Map<java.lang.String, com.alibaba.griver.core.jsapi.logging.RVPerformanceModel> r8 = r7.f10308a     // Catch:{ all -> 0x00e5 }
            r8.remove(r0)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r7)
            return
        L_0x00c3:
            java.util.Map<java.lang.String, com.alibaba.griver.core.jsapi.logging.RVPerformanceModel> r9 = r7.b     // Catch:{ all -> 0x00e5 }
            r9.remove(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.Class<com.alibaba.ariver.app.api.monitor.RVMonitor> r9 = com.alibaba.ariver.app.api.monitor.RVMonitor.class
            java.lang.Object r9 = com.alibaba.ariver.kernel.common.RVProxy.get(r9)     // Catch:{ all -> 0x00e5 }
            r1 = r9
            com.alibaba.ariver.app.api.monitor.RVMonitor r1 = (com.alibaba.ariver.app.api.monitor.RVMonitor) r1     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = "RV_APP_PAGE"
            r1.performance(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00e5 }
            com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager r9 = com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager.getInstance()     // Catch:{ all -> 0x00e5 }
            com.alibaba.griver.base.stagemonitor.GriverStageMonitor r9 = r9.getStageMonitor(r0)     // Catch:{ all -> 0x00e5 }
            if (r9 == 0) goto L_0x00e3
            r9.upload(r8)     // Catch:{ all -> 0x00e5 }
        L_0x00e3:
            monitor-exit(r7)
            return
        L_0x00e5:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.jsapi.logging.RVPerformanceTrackerImpl.a(com.alibaba.ariver.app.api.App, java.lang.String, java.lang.String):void");
    }

    public void addData2Performance(App app, String str, String str2, String str3) {
        RVPerformanceModel a2 = a(app);
        RVPerformanceModel a3 = a(app, str);
        if (a2 != null) {
            a2.addData2Performance(str2, str3);
        }
        if (a3 != null) {
            a3.addData2Performance(str2, str3);
        }
    }

    public void addDatas2Performance(App app, String str, String str2, Map<String, String> map) {
        RVPerformanceModel a2 = a(app);
        RVPerformanceModel a3 = a(app, str);
        if (a2 != null) {
            a2.addDatas2Performance(str2, map);
        }
        if (a3 != null) {
            a3.addDatas2Performance(str2, map);
        }
    }

    public void addEvent2Performance(App app, String str, String str2, Map<String, String> map) {
        RVPerformanceModel a2 = a(app);
        RVPerformanceModel a3 = a(app, str);
        if (a2 != null) {
            a2.addEvent2Performance(str2, map);
        }
        if (a3 != null) {
            a3.addEvent2Performance(str2, map);
        }
    }

    private RVPerformanceModel a(App app, String str) {
        RVPerformanceModel rVPerformanceModel = this.b.get(RVPerformanceLogHelper.getPagePerfKey(app, str));
        if (rVPerformanceModel != null) {
            return rVPerformanceModel;
        }
        return this.b.get(RVPerformanceLogHelper.getPagePerfKey(app, ""));
    }

    private RVPerformanceModel a(App app) {
        return this.f10308a.get(RVPerformanceLogHelper.getAppPerfKey(app));
    }
}
