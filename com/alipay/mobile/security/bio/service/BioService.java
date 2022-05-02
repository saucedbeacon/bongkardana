package com.alipay.mobile.security.bio.service;

public abstract class BioService {
    protected BioServiceManager mBioServiceManager;

    public void onCreate(BioServiceManager bioServiceManager) {
    }

    public void onDestroy() {
    }

    public final void create(BioServiceManager bioServiceManager) {
        this.mBioServiceManager = bioServiceManager;
        onCreate(bioServiceManager);
    }

    public final void destroy() {
        onDestroy();
        this.mBioServiceManager = null;
    }
}
