package com.alipay.zoloz.toyger.convert;

import android.graphics.Point;
import com.alipay.zoloz.toyger.blob.model.DocFieldInfo;
import com.alipay.zoloz.toyger.blob.model.DocInfo;
import java.util.ArrayList;
import o.clearOldPosition;
import o.offsetPosition;
import o.saveOldPosition;
import o.shouldIgnore;

public class DocInfoConverter implements IOriginalConverter<shouldIgnore> {
    public shouldIgnore converter(Object obj) {
        if (!(obj instanceof DocInfo)) {
            return null;
        }
        shouldIgnore shouldignore = new shouldIgnore();
        DocInfo docInfo = (DocInfo) obj;
        shouldignore.docType = docInfo.docType;
        shouldignore.pageNo = Integer.valueOf(docInfo.pageNo);
        if (docInfo.faceRect != null) {
            offsetPosition offsetposition = new offsetPosition();
            offsetposition.top = Integer.valueOf(docInfo.faceRect.top);
            offsetposition.right = Integer.valueOf(docInfo.faceRect.right);
            offsetposition.bottom = Integer.valueOf(docInfo.faceRect.bottom);
            offsetposition.left = Integer.valueOf(docInfo.faceRect.left);
            shouldignore.faceRect = offsetposition;
        }
        if (docInfo.region != null) {
            shouldignore.region = new ArrayList();
            for (Point next : docInfo.region) {
                clearOldPosition clearoldposition = new clearOldPosition();
                clearoldposition.x = Integer.valueOf(next.x);
                clearoldposition.y = Integer.valueOf(next.y);
                shouldignore.region.add(clearoldposition);
            }
        }
        if (docInfo.fields != null) {
            shouldignore.fields = new ArrayList();
            for (DocFieldInfo next2 : docInfo.fields) {
                saveOldPosition saveoldposition = new saveOldPosition();
                saveoldposition.name = next2.name;
                saveoldposition.value = next2.value;
                saveoldposition.feature = next2.feature;
                saveoldposition.feaVer = next2.feaVersion;
                shouldignore.fields.add(saveoldposition);
            }
        }
        return shouldignore;
    }
}
