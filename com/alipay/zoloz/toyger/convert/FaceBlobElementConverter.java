package com.alipay.zoloz.toyger.convert;

import com.alipay.zoloz.toyger.blob.model.FaceBlobElement;
import com.alipay.zoloz.toyger.blob.model.FaceInfo;
import java.util.ArrayList;
import o.flagRemovedAndOffsetPosition;
import o.normalize;

public class FaceBlobElementConverter extends BlobElemConverter {
    public normalize converter(Object obj) {
        normalize converter = super.converter(obj);
        if (converter == null) {
            return null;
        }
        if (obj instanceof FaceBlobElement) {
            converter.faceInfos = new ArrayList();
            for (FaceInfo convert : ((FaceBlobElement) obj).faceInfos) {
                Object convert2 = ObjectConvertTools.convert(convert);
                if (convert2 != null && (convert2 instanceof flagRemovedAndOffsetPosition)) {
                    converter.faceInfos.add((flagRemovedAndOffsetPosition) convert2);
                }
            }
        }
        return converter;
    }
}
