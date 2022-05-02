package com.alipay.zoloz.toyger.h5;

import android.graphics.Rect;
import com.alipay.zoloz.toyger.ToygerService;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ToygerH5Service {
    public static HashMap<String, Object> generateH5Blob(int i, int i2, int i3, int i4, float f, byte[] bArr, String str) {
        TGFrame tGFrame = new TGFrame();
        tGFrame.data = bArr;
        tGFrame.frameMode = 0;
        tGFrame.width = i;
        tGFrame.height = i2;
        tGFrame.rotation = i3;
        ToygerH5BlobConfig toygerH5BlobConfig = new ToygerH5BlobConfig();
        toygerH5BlobConfig.pubkey = str;
        toygerH5BlobConfig.desiredWidth = i4;
        toygerH5BlobConfig.uploadRatio = f;
        return generateH5Blob(tGFrame, toygerH5BlobConfig, new Rect(0, 0, i, i2));
    }

    public static HashMap<String, Object> generateH5Blob(TGFrame tGFrame, ToygerH5BlobConfig toygerH5BlobConfig, Rect rect) {
        H5BlobManager h5BlobManager = new H5BlobManager(1);
        h5BlobManager.setCropRect(rect);
        h5BlobManager.setBlobConfig(toygerH5BlobConfig);
        ArrayList arrayList = new ArrayList();
        ToygerH5Info toygerH5Info = new ToygerH5Info();
        toygerH5Info.frame = tGFrame;
        toygerH5Info.attr = new ToygerH5Attr();
        arrayList.add(toygerH5Info);
        byte[] generateBlob = h5BlobManager.generateBlob(arrayList, (Map<String, Object>) null);
        byte[] key = h5BlobManager.getKey();
        HashMap<String, Object> hashMap = new HashMap<>(6);
        hashMap.put("content", generateBlob);
        hashMap.put("key", key);
        hashMap.put(ToygerService.KEY_RES_9_IS_UTF8, Boolean.TRUE);
        return hashMap;
    }
}
