package com.alibaba.griver.base.stagemonitor;

import android.os.SystemClock;
import com.alibaba.ariver.app.api.App;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GriverStageMonitor {
    protected ConcurrentHashMap<String, Object> paramMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, Long> stageMap = new ConcurrentHashMap<>();

    public abstract void transitToError(String str);

    public abstract void upload(App app);

    public void transitToNext(String str) {
        if (str != null) {
            transitToNext(str, SystemClock.elapsedRealtime());
        }
    }

    public void transitToNext(String str, long j) {
        if (str != null) {
            this.stageMap.put(str, Long.valueOf(j));
        }
    }

    public void addParam(String str, Object obj) {
        if (str != null && obj != null) {
            this.paramMap.put(str, obj);
        }
    }
}
