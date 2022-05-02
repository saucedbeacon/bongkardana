package com.alipay.zoloz.zface.utils;

import android.os.SystemClock;
import com.alipay.zoloz.zface.services.ZFaceRecordService;
import java.util.HashMap;

public class ToygerMonitor {
    private static final int ONE_SECOND = 1000;
    private static ToygerMonitor toygerMonitorInstance;
    private float duration;
    private int fps;
    public long fpsStartTime;
    private int frameCount = 0;
    private long initCostTime;
    private long initStartTime;
    private boolean isEnd = false;

    private void fpsStart() {
        this.isEnd = false;
        this.frameCount = 0;
        this.fpsStartTime = SystemClock.uptimeMillis();
    }

    public void oneFrameUpdate(ZFaceRecordService zFaceRecordService) {
        if (!isEnd()) {
            if (this.frameCount == 0) {
                fpsStart();
            }
            this.frameCount++;
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.fpsStartTime)) / 1000.0f;
            this.duration = uptimeMillis;
            if (uptimeMillis >= 1.0f) {
                fpsEnd(zFaceRecordService);
            }
        }
    }

    private void fpsEnd(ZFaceRecordService zFaceRecordService) {
        this.fps = (int) (((float) this.frameCount) / this.duration);
        this.isEnd = true;
        HashMap hashMap = new HashMap();
        hashMap.put("fps", String.valueOf(getFps()));
        hashMap.put("algLoadTime", String.valueOf(this.initCostTime));
        if (zFaceRecordService != null) {
            zFaceRecordService.write(ZFaceRecordService.TOYGER_FACE_FPS, hashMap);
        }
    }

    public int getFps() {
        return this.fps;
    }

    public boolean isEnd() {
        return this.isEnd;
    }

    public void initStart() {
        this.initStartTime = SystemClock.uptimeMillis();
        this.isEnd = false;
    }

    public void initEnd() {
        this.initCostTime = SystemClock.uptimeMillis() - this.initStartTime;
    }
}
