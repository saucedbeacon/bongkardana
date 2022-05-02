package com.alipay.zoloz.zface.manager;

import com.alipay.zoloz.toyger.upload.UploadContent;

public interface UploadChannel {
    void uploadFaceInfo(UploadContent uploadContent, String str, String str2);

    void uploadNineShoot(UploadContent uploadContent, String str, String str2);

    void uploadOtherFaceInfo(UploadContent uploadContent, String str, String str2);
}
