package com.alibaba.griver.base.common.utils;

import android.os.Bundle;

public class StartupParamsUtils {
    public static synchronized Bundle filterBundle(String str, String str2, Bundle bundle) {
        Bundle filterBundle;
        synchronized (StartupParamsUtils.class) {
            filterBundle = filterBundle(str, str2, bundle, true);
        }
        return filterBundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.os.Bundle filterBundle(java.lang.String r7, java.lang.String r8, android.os.Bundle r9, boolean r10) {
        /*
            java.lang.Class<com.alibaba.griver.base.common.utils.StartupParamsUtils> r0 = com.alibaba.griver.base.common.utils.StartupParamsUtils.class
            monitor-enter(r0)
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0086 }
            r1.<init>()     // Catch:{ all -> 0x0086 }
            if (r9 == 0) goto L_0x0084
            int r2 = r9.size()     // Catch:{ all -> 0x0086 }
            if (r2 != 0) goto L_0x0011
            goto L_0x0084
        L_0x0011:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0086 }
            r1.<init>(r9)     // Catch:{ all -> 0x0086 }
            java.lang.String r9 = "[\"isTinyApp\",\"isH5app\",\"onlineHost\",\"bundlePath\",\"enableTabBar\",\"tabBarItems\",\"templateApp\",\"templateAppId\",\"tabItemCount\",\"tabBarJson\",\"launchParamsTag\",\"tinyPubRes\",\"restartFromToken\",\"restartFromLpid\",\"isRestart\",\"appVersion\",\"version\",\"nbupdate\",\"nboffline\",\"nburl\",\"nboffmode\",\"nup\",\"nol\",\"nbu\",\"isRemoteDebug\",\"MINI-PROGRAM-WEB-VIEW-TAG\",\"startAppSessionId\",\"appEngineType\",\"appxRouteFramework\"]"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.util.List r9 = com.alibaba.fastjson.JSON.parseArray((java.lang.String) r9, r2)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "mini_reserved_launch_param"
            java.lang.String r3 = "[\"isTinyApp\",\"isH5app\",\"onlineHost\",\"bundlePath\",\"enableTabBar\",\"tabBarItems\",\"templateApp\",\"templateAppId\",\"tabItemCount\",\"tabBarJson\",\"launchParamsTag\",\"tinyPubRes\",\"restartFromToken\",\"restartFromLpid\",\"isRestart\",\"appVersion\",\"version\",\"nbupdate\",\"nboffline\",\"nburl\",\"nboffmode\",\"nup\",\"nol\",\"nbu\",\"isRemoteDebug\",\"MINI-PROGRAM-WEB-VIEW-TAG\",\"startAppSessionId\",\"appEngineType\",\"appxRouteFramework\"]"
            java.lang.String r2 = com.alibaba.griver.base.common.config.GriverInnerConfig.getConfig(r2, r3)     // Catch:{ Exception -> 0x002d }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.util.List r9 = com.alibaba.fastjson.JSON.parseArray((java.lang.String) r2, r3)     // Catch:{ Exception -> 0x002d }
            goto L_0x0035
        L_0x002d:
            r2 = move-exception
            java.lang.String r3 = "StartupParamsUtils"
            java.lang.String r4 = "parse config failed"
            com.alibaba.griver.base.common.logger.GriverLogger.w(r3, r4, r2)     // Catch:{ all -> 0x0086 }
        L_0x0035:
            java.util.Set r2 = r1.keySet()     // Catch:{ all -> 0x0086 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0086 }
        L_0x003d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0082
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0086 }
            boolean r4 = r9.contains(r3)     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x003d
            if (r10 == 0) goto L_0x006f
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r4 = new com.alibaba.griver.base.common.monitor.MonitorMap$Builder     // Catch:{ all -> 0x0086 }
            r4.<init>()     // Catch:{ all -> 0x0086 }
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r4 = r4.appId(r7)     // Catch:{ all -> 0x0086 }
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r4 = r4.url(r8)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "paramName"
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r4 = r4.append(r5, r3)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "mini_reserved_launch_param_exception"
            java.lang.String r6 = "GriverAppContainer"
            java.util.Map r4 = r4.build()     // Catch:{ all -> 0x0086 }
            com.alibaba.griver.base.common.monitor.GriverMonitor.error(r5, r6, r4)     // Catch:{ all -> 0x0086 }
        L_0x006f:
            java.lang.String r4 = "StartupParamsUtils"
            java.lang.String r5 = "Found reserved startup parameter with key: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = r5.concat(r3)     // Catch:{ all -> 0x0086 }
            com.alibaba.griver.base.common.logger.GriverLogger.d(r4, r3)     // Catch:{ all -> 0x0086 }
            r2.remove()     // Catch:{ all -> 0x0086 }
            goto L_0x003d
        L_0x0082:
            monitor-exit(r0)
            return r1
        L_0x0084:
            monitor-exit(r0)
            return r1
        L_0x0086:
            r7 = move-exception
            monitor-exit(r0)
            goto L_0x008a
        L_0x0089:
            throw r7
        L_0x008a:
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.StartupParamsUtils.filterBundle(java.lang.String, java.lang.String, android.os.Bundle, boolean):android.os.Bundle");
    }
}
