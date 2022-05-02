package com.alipay.zoloz.toyger.h5;

import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.blob.model.FaceInfo;

public class ToygerH5Info extends ToygerBiometricInfo<ToygerH5Attr> {
    private FaceInfo mFaceInfo;
    private String subType;
    private String type;

    public FaceInfo getFaceInfo() {
        return this.mFaceInfo;
    }

    public void setFaceInfo(FaceInfo faceInfo) {
        this.mFaceInfo = faceInfo;
    }

    public String getSubType() {
        return this.subType;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}
