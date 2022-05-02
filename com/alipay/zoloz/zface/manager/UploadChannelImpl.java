package com.alipay.zoloz.zface.manager;

import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadItem;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.zoloz.toyger.upload.UploadContent;

public class UploadChannelImpl implements UploadChannel {
    private BioUploadService mBioUploadService;

    public UploadChannelImpl(BioServiceManager bioServiceManager) {
        if (bioServiceManager != null) {
            this.mBioUploadService = (BioUploadService) bioServiceManager.getBioService(BioUploadService.class);
            return;
        }
        throw new BioIllegalArgumentException("BioServiceManager is null...");
    }

    public void uploadFaceInfo(UploadContent uploadContent, String str, String str2) {
        if (uploadContent != null) {
            BioUploadItem bioUploadItem = new BioUploadItem();
            bioUploadItem.content = uploadContent.content;
            bioUploadItem.bisToken = str;
            bioUploadItem.contentSig = uploadContent.contentSig;
            bioUploadItem.isNeedSendResponse = true;
            this.mBioUploadService.upload(bioUploadItem);
        }
    }

    public void uploadNineShoot(UploadContent uploadContent, String str, String str2) {
        if (uploadContent == null || uploadContent.content == null) {
            new IllegalArgumentException("content is empty");
            return;
        }
        BioUploadItem bioUploadItem = new BioUploadItem();
        bioUploadItem.content = uploadContent.content;
        bioUploadItem.bisToken = str;
        bioUploadItem.isNeedSendResponse = false;
        bioUploadItem.contentSig = uploadContent.contentSig;
        this.mBioUploadService.upload(bioUploadItem);
    }

    public void uploadOtherFaceInfo(UploadContent uploadContent, String str, String str2) {
        if (uploadContent == null || uploadContent.content == null) {
            new IllegalArgumentException("other face info is empty");
            return;
        }
        BioUploadItem bioUploadItem = new BioUploadItem();
        bioUploadItem.content = uploadContent.content;
        bioUploadItem.bisToken = str;
        bioUploadItem.isNeedSendResponse = false;
        bioUploadItem.contentSig = uploadContent.contentSig;
        this.mBioUploadService.upload(bioUploadItem);
    }
}
