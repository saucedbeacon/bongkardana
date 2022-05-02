package com.alipay.iap.android.common.task.threadpool;

import java.lang.reflect.Method;

public class ProcessCpuTracker {
    private static int[] SYSTEM_CPU_FORMAT = null;
    private static final String TAG = ProcessCpuTracker.class.getSimpleName();
    private static final String TOTAL_STAT_FILE = "/proc/stat";
    private static Method readProcFileMethod = null;
    private long mBaseIdleTime;
    private long mBaseIrqTime;
    private long mBaseSystemTime;
    private long mBaseUserTime;
    private long mRelIdleTime;
    private long mRelIrqTime;
    private long mRelSystemTime;
    private long mRelUserTime;
    private long[] mTotalCpuData = new long[7];

    @Deprecated
    public ProcessCpuTracker update() {
        return this;
    }

    @Deprecated
    public float getCpuIdlePercent() {
        long j = this.mRelUserTime + this.mRelSystemTime + this.mRelIrqTime;
        long j2 = this.mRelIdleTime;
        long j3 = j + j2;
        if (j3 > 0) {
            return (((float) j2) * 100.0f) / ((float) j3);
        }
        return -1.0f;
    }
}
