package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.blob.BlobStatic;

public class ToygerFaceElementType {
    public static String getBlobElemType(ToygerFaceInfo toygerFaceInfo) {
        int i = toygerFaceInfo.frame.frameType;
        if (i == 0) {
            return BlobStatic.SUB_TYPE_PANO;
        }
        if (i != 1) {
            return i != 2 ? "" : BlobStatic.SUB_TYPE_NANO;
        }
        return BlobStatic.SUB_TYPE_DARK;
    }
}
