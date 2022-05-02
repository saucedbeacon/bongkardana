package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.os.SystemClock;

public class DetectionTracker {

    /* renamed from: a  reason: collision with root package name */
    private static final DetectionTracker f10258a = new DetectionTracker();
    private long b = 0;

    private DetectionTracker() {
    }

    public static DetectionTracker getInstance() {
        return f10258a;
    }

    public long getLastDetectionTime() {
        return this.b;
    }

    public void recordDetection() {
        this.b = SystemClock.elapsedRealtime();
    }
}
