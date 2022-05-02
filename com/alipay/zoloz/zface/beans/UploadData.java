package com.alipay.zoloz.zface.beans;

import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import java.util.Map;

public class UploadData {
    private Map<String, String> extParams;
    private BioUploadResult mBioUploadResult;
    private String mOriginalData = JSON.toJSONString(this.mBioUploadResult);

    public UploadData(BioUploadResult bioUploadResult) {
        this.mBioUploadResult = bioUploadResult;
        this.extParams = bioUploadResult.extParams;
    }

    public String getOriginalData() {
        return this.mOriginalData;
    }

    public BioUploadResult getBioUploadResult() {
        return this.mBioUploadResult;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UploadData{, extParams=");
        sb.append(this.extParams);
        sb.append('}');
        return sb.toString();
    }
}
