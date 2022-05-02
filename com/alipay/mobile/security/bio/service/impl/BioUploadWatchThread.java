package com.alipay.mobile.security.bio.service.impl;

import android.os.Handler;
import android.os.Looper;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadCallBack;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.thread.WatchThread;
import com.alipay.mobile.security.bio.workspace.Env;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class BioUploadWatchThread extends WatchThread {
    private List<BioUploadCallBack> mBioUploadCallBacks = new ArrayList();
    private BioUploadGW mBioUploadGW;
    private AtomicBoolean mClearUpFlag;
    private BlockingQueue<BioUploadItem> mImageCache = new LinkedBlockingQueue(5);
    public Handler mMainHandle;
    private AtomicBoolean mQuitLaterFlag = new AtomicBoolean(false);

    public synchronized void addBioUploadCallBack(BioUploadCallBack bioUploadCallBack) {
        if (!this.mBioUploadCallBacks.contains(bioUploadCallBack)) {
            this.mBioUploadCallBacks.add(bioUploadCallBack);
        }
    }

    public BioUploadWatchThread(String str, BioServiceManager bioServiceManager) {
        super(str);
        if (bioServiceManager != null) {
            try {
                Constructor<?> constructor = Class.forName(Env.getProtocolFormat(bioServiceManager.getBioApplicationContext()) != 2 ? "com.alipay.mobile.security.bio.service.impl.BioUploadJsonGWImpl" : "com.alipay.mobile.security.bio.service.impl.BioUploadPBGWImpl").getConstructor(new Class[]{BioServiceManager.class});
                constructor.setAccessible(true);
                this.mBioUploadGW = (BioUploadGW) constructor.newInstance(new Object[]{bioServiceManager});
            } catch (Throwable unused) {
            }
            this.mMainHandle = new Handler(Looper.getMainLooper());
            return;
        }
        throw new BioIllegalArgumentException("BioServiceManager can't be null.");
    }

    public void task() {
        BioUploadItem poll;
        try {
            if (!checkAndQuitUpload() && (poll = this.mImageCache.poll(50, TimeUnit.SECONDS)) != null) {
                this.mClearUpFlag.set(false);
                final BioUploadResult upload = this.mBioUploadGW.upload(poll);
                if (!this.mClearUpFlag.getAndSet(false) && !this.mBioUploadCallBacks.isEmpty() && upload != null && this.mMainHandle != null && poll.isNeedSendResponse) {
                    this.mMainHandle.post(new Runnable() {
                        public void run() {
                            BioUploadWatchThread.this.doCallback(upload);
                        }
                    });
                }
            }
        } catch (Exception unused) {
        }
    }

    public boolean isFulled() {
        return this.mImageCache.size() >= 5;
    }

    public void addBioUploadItem(BioUploadItem bioUploadItem) {
        try {
            if (!this.mImageCache.add(bioUploadItem)) {
                this.mMainHandle.post(new Runnable() {
                    public void run() {
                        BioUploadResult bioUploadResult = new BioUploadResult();
                        bioUploadResult.productRetCode = 4001;
                        BioUploadWatchThread.this.doCallback(bioUploadResult);
                    }
                });
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void doCallback(com.alipay.mobile.security.bio.service.BioUploadResult r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.mQuitLaterFlag     // Catch:{ all -> 0x0027 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)
            return
        L_0x000b:
            r0 = 0
            java.util.List<com.alipay.mobile.security.bio.service.BioUploadCallBack> r1 = r3.mBioUploadCallBacks     // Catch:{ all -> 0x0027 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0027 }
        L_0x0012:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0025
            if (r0 != 0) goto L_0x0025
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0027 }
            com.alipay.mobile.security.bio.service.BioUploadCallBack r0 = (com.alipay.mobile.security.bio.service.BioUploadCallBack) r0     // Catch:{ all -> 0x0027 }
            boolean r0 = r0.onResponse(r4)     // Catch:{ all -> 0x0027 }
            goto L_0x0012
        L_0x0025:
            monitor-exit(r3)
            return
        L_0x0027:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x002b
        L_0x002a:
            throw r4
        L_0x002b:
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.service.impl.BioUploadWatchThread.doCallback(com.alipay.mobile.security.bio.service.BioUploadResult):void");
    }

    public void release() {
        this.mBioUploadCallBacks.clear();
        this.mImageCache.clear();
        this.mBioUploadGW = null;
        kill();
    }

    public boolean isEmpty() {
        BlockingQueue<BioUploadItem> blockingQueue = this.mImageCache;
        return blockingQueue == null || blockingQueue.isEmpty();
    }

    public synchronized void clearBioUploadCallBacks() {
        if (this.mClearUpFlag == null) {
            this.mClearUpFlag = new AtomicBoolean(false);
        } else {
            this.mClearUpFlag.set(true);
        }
        this.mBioUploadCallBacks.clear();
    }

    public void clearUploadItems() {
        this.mImageCache.clear();
    }

    /* access modifiers changed from: package-private */
    public void quitLater() {
        this.mQuitLaterFlag.set(true);
    }

    private boolean checkAndQuitUpload() {
        if (!this.mImageCache.isEmpty() || !this.mQuitLaterFlag.get()) {
            return false;
        }
        release();
        this.mQuitLaterFlag.set(false);
        return true;
    }
}
