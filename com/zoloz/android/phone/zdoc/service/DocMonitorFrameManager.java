package com.zoloz.android.phone.zdoc.service;

import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.GenericBlobManager;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import java.util.Timer;
import java.util.TimerTask;

public class DocMonitorFrameManager {
    private String mBisToken;
    /* access modifiers changed from: private */
    public int mCurrentFrameNumber = 0;
    private GenericBlobManager mGenericBlobManager;
    private TimerTask mTimeTask;
    private Timer mTimer;
    /* access modifiers changed from: private */
    public ZdocRemoteConfig mZdocRemoteConfig;
    private int n = 1000;

    public DocMonitorFrameManager(ZdocRemoteConfig zdocRemoteConfig, String str, String str2) {
        this.mZdocRemoteConfig = zdocRemoteConfig;
        this.mGenericBlobManager = new GenericBlobManager(2, "doc", str);
        this.mBisToken = str2;
    }

    public void setTimerTask(final IMonitorCallback iMonitorCallback) {
        this.mTimer = new Timer();
        AnonymousClass1 r2 = new TimerTask() {
            public void run() {
                if (DocMonitorFrameManager.this.mCurrentFrameNumber < DocMonitorFrameManager.this.mZdocRemoteConfig.getMonitorMaxFrameCount()) {
                    iMonitorCallback.onTimeout();
                }
            }
        };
        this.mTimeTask = r2;
        this.mTimer.schedule(r2, 0, (long) this.mZdocRemoteConfig.getMonitorCaptureInterval());
    }

    public void addMonitorFrame(TGFrame tGFrame) {
        if (this.mGenericBlobManager != null && isValidateTGFrame(tGFrame)) {
            this.mGenericBlobManager.addMonitorFrame(tGFrame);
        }
    }

    private boolean isValidateTGFrame(TGFrame tGFrame) {
        return tGFrame != null && tGFrame.width > 0 && tGFrame.height > 0;
    }

    public byte[] getMonitorBlob() {
        GenericBlobManager genericBlobManager = this.mGenericBlobManager;
        if (genericBlobManager != null) {
            return genericBlobManager.generateMonitorBlob(this.mBisToken);
        }
        return null;
    }

    public boolean isUTF8() {
        GenericBlobManager genericBlobManager = this.mGenericBlobManager;
        return genericBlobManager != null && genericBlobManager.isUTF8();
    }

    public byte[] getKey() {
        GenericBlobManager genericBlobManager = this.mGenericBlobManager;
        if (genericBlobManager != null) {
            return genericBlobManager.getKey();
        }
        return null;
    }

    public void cancelTimer() {
        if (this.mTimer != null) {
            this.mTimeTask.cancel();
            this.mTimer.cancel();
            this.mTimer = null;
        }
    }

    public void destroy() {
        this.mGenericBlobManager.cleanAllData();
        this.mCurrentFrameNumber = 0;
        cancelTimer();
    }

    public void updateCurrentFrameNumber() {
        this.mCurrentFrameNumber++;
    }

    public void resetCurrentFrameNummer() {
        this.mCurrentFrameNumber = 0;
    }
}
