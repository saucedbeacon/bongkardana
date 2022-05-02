package com.alipay.zoloz.toyger.monitor;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.GenericBlobManager;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class NineshotService implements Runnable {
    private final int UPLOAD_MONITOR_PIC;
    private String mBisToken;
    private int mCaptureInterval;
    private int mCurrentCount;
    private BlockingDeque<TGFrame> mFrameQueue;
    private GenericBlobManager mGenericBlobManager;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private boolean mNeedUpload;
    private int mUploadCount;

    public NineshotService(String str, int i, String str2, String str3) {
        this(str, i, 2, str2, 9, 1, str3);
    }

    public NineshotService(String str, int i, int i2, String str2, String str3) {
        this(str, i, i2, str2, 9, 1, str3);
    }

    public NineshotService(String str, int i, int i2, String str2, int i3, int i4, String str3) {
        boolean z = true;
        this.UPLOAD_MONITOR_PIC = 1;
        this.mFrameQueue = new LinkedBlockingDeque(1);
        this.mBisToken = str;
        this.mNeedUpload = i != 1 ? false : z;
        this.mUploadCount = i3;
        this.mCaptureInterval = i4;
        this.mGenericBlobManager = new GenericBlobManager(i2, str3, str2);
        this.mCurrentCount = 0;
        if (this.mNeedUpload) {
            HandlerThread handlerThread = new HandlerThread("nine-show-service");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.mHandlerThread.getLooper());
            this.mHandler = handler;
            handler.post(this);
        }
    }

    public void run() {
        Handler handler;
        try {
            TGFrame poll = this.mFrameQueue.poll(1, TimeUnit.SECONDS);
            if (poll != null) {
                this.mGenericBlobManager.addMonitorFrame(poll);
                this.mCurrentCount++;
            }
        } catch (InterruptedException unused) {
        }
        if (this.mCurrentCount < this.mUploadCount && (handler = this.mHandler) != null) {
            handler.postDelayed(this, (long) this.mCaptureInterval);
        }
    }

    public void shootFrame(TGFrame tGFrame) {
        if (this.mNeedUpload && this.mFrameQueue.remainingCapacity() > 0) {
            this.mFrameQueue.offer(tGFrame.deepCopy());
        }
    }

    public byte[] getContent() {
        if (this.mNeedUpload) {
            return this.mGenericBlobManager.generateMonitorBlob(this.mBisToken);
        }
        return null;
    }

    public byte[] getKey() {
        return this.mGenericBlobManager.getKey();
    }

    public boolean isUtf8() {
        return this.mGenericBlobManager.isUTF8();
    }

    public boolean isNeedUpload() {
        return this.mNeedUpload;
    }

    public void reset() {
        this.mGenericBlobManager.cleanAllData();
    }

    public void release() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this);
            this.mHandler = null;
            if (this.mHandlerThread != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.mHandlerThread.quitSafely();
                } else {
                    this.mHandlerThread.quit();
                }
            }
            this.mHandlerThread = null;
            this.mFrameQueue.clear();
        }
    }
}
