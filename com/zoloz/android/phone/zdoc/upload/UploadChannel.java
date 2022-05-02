package com.zoloz.android.phone.zdoc.upload;

import com.alipay.zoloz.toyger.upload.UploadContent;

public abstract class UploadChannel {
    public abstract void uploadNineShoot(UploadContent uploadContent, String str, String str2);

    public abstract void uploadPaperInfo(UploadContent uploadContent, String str, String str2);
}
