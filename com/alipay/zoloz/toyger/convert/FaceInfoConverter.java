package com.alipay.zoloz.toyger.convert;

import android.graphics.Point;
import com.alipay.zoloz.toyger.blob.model.FaceInfo;
import java.util.ArrayList;
import o.clearOldPosition;
import o.flagRemovedAndOffsetPosition;
import o.offsetPosition;

public class FaceInfoConverter implements IOriginalConverter<flagRemovedAndOffsetPosition> {
    public flagRemovedAndOffsetPosition converter(Object obj) {
        if (!(obj instanceof FaceInfo)) {
            return null;
        }
        FaceInfo faceInfo = (FaceInfo) obj;
        flagRemovedAndOffsetPosition flagremovedandoffsetposition = new flagRemovedAndOffsetPosition();
        if (faceInfo.rect != null) {
            offsetPosition offsetposition = new offsetPosition();
            offsetposition.top = Integer.valueOf(faceInfo.rect.top);
            offsetposition.right = Integer.valueOf(faceInfo.rect.right);
            offsetposition.bottom = Integer.valueOf(faceInfo.rect.bottom);
            offsetposition.left = Integer.valueOf(faceInfo.rect.left);
            flagremovedandoffsetposition.rect = offsetposition;
        }
        if (faceInfo.points != null) {
            flagremovedandoffsetposition.points = new ArrayList();
            for (Point next : faceInfo.points) {
                clearOldPosition clearoldposition = new clearOldPosition();
                clearoldposition.x = Integer.valueOf(next.x);
                clearoldposition.y = Integer.valueOf(next.y);
                flagremovedandoffsetposition.points.add(clearoldposition);
            }
        }
        flagremovedandoffsetposition.confidence = Float.valueOf(faceInfo.confidence);
        flagremovedandoffsetposition.quality = Float.valueOf(faceInfo.quality);
        flagremovedandoffsetposition.feature = faceInfo.feature;
        flagremovedandoffsetposition.feaVersion = faceInfo.feaVersion;
        return flagremovedandoffsetposition;
    }
}
