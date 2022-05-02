package com.alibaba.griver.base.stagemonitor;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

public class GriverStageMonitorManager {
    private static volatile GriverStageMonitorManager b;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, GriverStageMonitor> f10241a = new ConcurrentHashMap<>();

    private GriverStageMonitorManager() {
    }

    public static GriverStageMonitorManager getInstance() {
        if (b == null) {
            synchronized (GriverStageMonitorManager.class) {
                if (b == null) {
                    b = new GriverStageMonitorManager();
                }
            }
        }
        return b;
    }

    public void registerStageMonitor(String str, GriverStageMonitor griverStageMonitor) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f10241a.get(str) != null) {
                this.f10241a.remove(str);
            }
            this.f10241a.put(str, griverStageMonitor);
        }
    }

    public void unRegisterStageMonitor(String str) {
        if (!TextUtils.isEmpty(str) && this.f10241a.get(str) != null) {
            this.f10241a.remove(str);
        }
    }

    public GriverStageMonitor getStageMonitor(String str) {
        return this.f10241a.get(str);
    }
}
