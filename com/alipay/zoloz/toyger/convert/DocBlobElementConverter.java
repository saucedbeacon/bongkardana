package com.alipay.zoloz.toyger.convert;

import com.alipay.zoloz.toyger.blob.model.DocBlobElement;
import o.normalize;

public class DocBlobElementConverter extends BlobElemConverter {
    public normalize converter(Object obj) {
        normalize converter = super.converter(obj);
        if (converter == null) {
            return null;
        }
        if (obj instanceof DocBlobElement) {
            converter.fillTagValue(7, ObjectConvertTools.convert(((DocBlobElement) obj).docInfo));
        }
        return converter;
    }
}
