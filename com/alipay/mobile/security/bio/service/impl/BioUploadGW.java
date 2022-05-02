package com.alipay.mobile.security.bio.service.impl;

import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioStoreService;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadServiceCore;

public abstract class BioUploadGW<Request> {
    public static final int BASE64_FLAGS = 10;
    protected BioServiceManager mBioServiceManager;
    protected BioStoreService mBioStoreService;
    private BioUploadServiceCore mBioUploadServiceCore;

    public abstract BioUploadResult upload(BioUploadItem bioUploadItem);

    public BioUploadGW(BioServiceManager bioServiceManager) {
        if (bioServiceManager != null) {
            this.mBioServiceManager = bioServiceManager;
            this.mBioStoreService = (BioStoreService) bioServiceManager.getBioService(BioStoreService.class);
            return;
        }
        throw new BioIllegalArgumentException("BioServiceManager can't be null");
    }

    /* access modifiers changed from: package-private */
    public BioUploadResult doUpload(Request request, boolean z) {
        if (this.mBioUploadServiceCore == null) {
            this.mBioUploadServiceCore = (BioUploadServiceCore) this.mBioServiceManager.getBioService(BioUploadServiceCore.class);
        }
        BioUploadServiceCore bioUploadServiceCore = this.mBioUploadServiceCore;
        if (bioUploadServiceCore != null) {
            return bioUploadServiceCore.upload(request, z);
        }
        BioUploadResult bioUploadResult = new BioUploadResult();
        bioUploadResult.productRetCode = 3002;
        bioUploadResult.subCode = ZcodeConstants.ZCODE_SYSTEM_EXC;
        bioUploadResult.subMsg = ZcodeConstants.getMessage(ZcodeConstants.ZCODE_SYSTEM_EXC);
        return bioUploadResult;
    }
}
