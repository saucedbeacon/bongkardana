package com.alipay.zoloz.toyger.convert;

import com.alipay.zoloz.toyger.blob.model.BlobElem;
import o.normalize;
import o.printConnMonitorLog;

class BlobElemConverter implements IOriginalConverter<normalize> {
    BlobElemConverter() {
    }

    public normalize converter(Object obj) {
        if (!(obj instanceof BlobElem)) {
            return null;
        }
        BlobElem blobElem = (BlobElem) obj;
        normalize normalize = new normalize();
        normalize.type = blobElem.type;
        normalize.subType = blobElem.subType;
        normalize.idx = Integer.valueOf(blobElem.idx);
        normalize.version = blobElem.version;
        if (blobElem.content != null) {
            normalize.content = printConnMonitorLog.of(blobElem.content);
        }
        return normalize;
    }
}
