package com.alibaba.griver.base.common.utils;

import android.app.ActivityManager;
import android.os.SystemClock;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import id.dana.danah5.akulaku.AkuEventParamsKey;

public class SystemUtils {
    private static ActivityManager.MemoryInfo a() {
        ActivityManager activityManager = (ActivityManager) GriverEnv.getApplicationContext().getSystemService(AkuEventParamsKey.KEY_ACTIVITY);
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    public static void printCurrentMemory() {
        try {
            ActivityManager.MemoryInfo a2 = a();
            if (a2 != null) {
                StringBuilder sb = new StringBuilder("current memory, availMem: ");
                sb.append(a2.availMem);
                sb.append(", totalMem: ");
                sb.append(a2.totalMem);
                sb.append(", threshold: ");
                sb.append(a2.threshold);
                sb.append(", lowMemory: ");
                sb.append(a2.lowMemory);
                GriverLogger.d("SystemUtils", sb.toString());
                return;
            }
            GriverLogger.d("SystemUtils", "current memory, null");
        } catch (Exception e) {
            GriverLogger.w("SystemUtils", "get current memory failed", e);
        }
    }

    public static long convert2ElapseTime(long j) {
        return SystemClock.elapsedRealtime() + (j - System.currentTimeMillis());
    }
}
