package com.alipay.zoloz.toyger.convert;

import com.alipay.zoloz.toyger.blob.model.Blob;
import com.alipay.zoloz.toyger.blob.model.BlobElem;
import com.alipay.zoloz.toyger.blob.model.Content;
import com.alipay.zoloz.toyger.blob.model.DocBlobElement;
import com.alipay.zoloz.toyger.blob.model.DocInfo;
import com.alipay.zoloz.toyger.blob.model.FaceBlobElement;
import com.alipay.zoloz.toyger.blob.model.FaceInfo;
import com.alipay.zoloz.toyger.blob.model.Meta;
import java.util.HashMap;
import java.util.Map;

public class ObjectConvertTools {
    private static Map<Class, IOriginalConverter<?>> mAllConverter = new HashMap<Class, IOriginalConverter<?>>() {
        {
            put(Content.class, new ContentConverter());
            put(Blob.class, new BlobConverter());
            put(BlobElem.class, new BlobElemConverter());
            put(FaceBlobElement.class, new FaceBlobElementConverter());
            put(DocBlobElement.class, new DocBlobElementConverter());
            put(FaceInfo.class, new FaceInfoConverter());
            put(DocInfo.class, new DocInfoConverter());
            put(Meta.class, new MetaConverter());
        }
    };

    public static Object convert(Object obj) {
        IOriginalConverter iOriginalConverter = mAllConverter.get(obj.getClass());
        if (iOriginalConverter != null) {
            return iOriginalConverter.converter(obj);
        }
        return null;
    }
}
