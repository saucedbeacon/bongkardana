package com.alipay.mobile.security.bio.service.impl;

import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadCallBack;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadService;

public class BioUploadServiceImpl extends BioUploadService {
    private BioUploadWatchThread mBioUploadWatchThread;

    public void addCallBack(BioUploadCallBack bioUploadCallBack) {
        BioUploadWatchThread bioUploadWatchThread = this.mBioUploadWatchThread;
        if (bioUploadWatchThread != null && bioUploadCallBack != null) {
            bioUploadWatchThread.addBioUploadCallBack(bioUploadCallBack);
        }
    }

    public int upload(BioUploadItem bioUploadItem) {
        BioUploadWatchThread bioUploadWatchThread = this.mBioUploadWatchThread;
        if (bioUploadWatchThread == null) {
            return 0;
        }
        bioUploadWatchThread.addBioUploadItem(bioUploadItem);
        return 0;
    }

    public boolean isFulled() {
        BioUploadWatchThread bioUploadWatchThread = this.mBioUploadWatchThread;
        if (bioUploadWatchThread != null) {
            return bioUploadWatchThread.isFulled();
        }
        return false;
    }

    public void onCreate(BioServiceManager bioServiceManager) {
        BioUploadWatchThread bioUploadWatchThread = new BioUploadWatchThread("BioUploadService", bioServiceManager);
        this.mBioUploadWatchThread = bioUploadWatchThread;
        bioUploadWatchThread.start();
    }

    public void clearUp() {
        BioUploadWatchThread bioUploadWatchThread = this.mBioUploadWatchThread;
        if (bioUploadWatchThread != null && bioUploadWatchThread.isEmpty()) {
            this.mBioUploadWatchThread.clearUploadItems();
            this.mBioUploadWatchThread.clearBioUploadCallBacks();
        }
    }

    public void onDestroy() {
        BioUploadWatchThread bioUploadWatchThread = this.mBioUploadWatchThread;
        if (bioUploadWatchThread == null) {
            return;
        }
        if (bioUploadWatchThread.isEmpty()) {
            this.mBioUploadWatchThread.release();
            this.mBioUploadWatchThread = null;
            return;
        }
        this.mBioUploadWatchThread.quitLater();
    }
}
