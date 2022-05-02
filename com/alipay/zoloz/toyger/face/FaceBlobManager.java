package com.alipay.zoloz.toyger.face;

import android.graphics.Rect;
import android.graphics.RectF;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.alipay.zoloz.toyger.blob.CryptoManager;
import com.alipay.zoloz.toyger.blob.model.Blob;
import com.alipay.zoloz.toyger.blob.model.Content;
import com.alipay.zoloz.toyger.blob.model.FaceBlobElement;
import com.alipay.zoloz.toyger.blob.model.FaceInfo;
import com.alipay.zoloz.toyger.blob.model.Meta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FaceBlobManager extends BlobManager<ToygerFaceInfo> {
    public boolean isUTF8() {
        return true;
    }

    public FaceBlobManager(int i, ToygerFaceBlobConfig toygerFaceBlobConfig) {
        super(i);
        this.config = toygerFaceBlobConfig;
        this.crypto = new CryptoManager(toygerFaceBlobConfig.pubkey);
    }

    public byte[] generateBlob(List<ToygerFaceInfo> list, Map<String, Object> map) {
        Meta generateMeta = generateMeta(list, map);
        ArrayList arrayList = new ArrayList();
        for (ToygerFaceInfo next : list) {
            FaceBlobElement faceBlobElement = new FaceBlobElement();
            faceBlobElement.type = "face";
            faceBlobElement.subType = ToygerFaceElementType.getBlobElemType(next);
            faceBlobElement.version = "1.0";
            faceBlobElement.idx = 0;
            faceBlobElement.content = processFrame(next.frame);
            if (faceBlobElement.content == null) {
                return null;
            }
            faceBlobElement.faceInfos = new ArrayList();
            faceBlobElement.faceInfos.add(generateFaceInfo(next));
            arrayList.add(faceBlobElement);
        }
        Blob blob = new Blob();
        blob.blobElem = arrayList;
        blob.blobVersion = BlobStatic.BLOB_VERSION;
        Content content = new Content();
        content.blob = blob;
        content.meta = generateMeta;
        try {
            return this.crypto.encrypt(this.mConvertManager.convert(content));
        } catch (Exception unused) {
            return null;
        }
    }

    public byte[] getKey() {
        return this.crypto.getAESCypher();
    }

    public static Rect convertFaceRegion(RectF rectF, int i, int i2, int i3, boolean z) {
        Rect rect = new Rect();
        float f = (float) i;
        rect.left = (int) (rectF.left * f);
        rect.right = (int) (rectF.right * f);
        float f2 = (float) i2;
        rect.top = (int) (rectF.top * f2);
        rect.bottom = (int) (rectF.bottom * f2);
        return rect;
    }

    /* access modifiers changed from: protected */
    public FaceInfo generateFaceInfo(ToygerFaceInfo toygerFaceInfo) {
        FaceInfo faceInfo = new FaceInfo();
        int i = toygerFaceInfo.frame.rotation % 180 == 0 ? toygerFaceInfo.frame.width : toygerFaceInfo.frame.height;
        int i2 = i == toygerFaceInfo.frame.width ? toygerFaceInfo.frame.height : toygerFaceInfo.frame.width;
        int intValue = (i <= this.config.getDesiredWidth().intValue() || this.config.getDesiredWidth().intValue() <= 0) ? i : this.config.getDesiredWidth().intValue();
        faceInfo.rect = convertFaceRegion(((ToygerFaceAttr) toygerFaceInfo.attr).region(), intValue, (int) ((((float) intValue) / ((float) i)) * ((float) i2)), toygerFaceInfo.frame.rotation, false);
        faceInfo.quality = ((ToygerFaceAttr) toygerFaceInfo.attr).quality();
        return faceInfo;
    }

    public Meta generateMeta(List<ToygerFaceInfo> list, Map<String, Object> map) {
        Meta generateMeta = super.generateMeta(list, map);
        generateMeta.type = BlobStatic.META_TYPE_FACE;
        generateMeta.score = map;
        generateMeta.serialize = this.metaSerializer;
        generateMeta.collectInfo = new HashMap();
        try {
            generateMeta.score.put("dragonfly", Double.valueOf(Double.parseDouble(String.valueOf(map.get("dragonfly")))));
        } catch (Exception unused) {
            generateMeta.score.put("dragonfly", 0);
        }
        generateMeta.score.put(BlobStatic.DRAGONFLY_PASS, map.get(BlobStatic.DRAGONFLY_PASS));
        return generateMeta;
    }
}
