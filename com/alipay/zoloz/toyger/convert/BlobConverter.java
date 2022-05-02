package com.alipay.zoloz.toyger.convert;

import com.alipay.zoloz.toyger.blob.model.Blob;
import com.alipay.zoloz.toyger.blob.model.BlobElem;
import java.util.ArrayList;
import o.getOldPosition;
import o.normalize;

public class BlobConverter implements IOriginalConverter<getOldPosition> {
    public getOldPosition converter(Object obj) {
        if (!(obj instanceof Blob)) {
            return null;
        }
        Blob blob = (Blob) obj;
        getOldPosition getoldposition = new getOldPosition();
        getoldposition.blobVersion = blob.blobVersion;
        getoldposition.blobElem = new ArrayList();
        for (BlobElem convert : blob.blobElem) {
            Object convert2 = ObjectConvertTools.convert(convert);
            if (convert2 != null) {
                getoldposition.blobElem.add((normalize) convert2);
            }
        }
        return getoldposition;
    }
}
