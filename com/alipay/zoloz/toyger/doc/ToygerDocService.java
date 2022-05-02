package com.alipay.zoloz.toyger.doc;

import android.graphics.Rect;
import com.alipay.zoloz.toyger.ToygerService;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import java.util.ArrayList;
import java.util.HashMap;

public class ToygerDocService {
    public static HashMap<String, Object> generateDocBlob(TGFrame tGFrame, ToygerDocBlobConfig toygerDocBlobConfig, Rect rect, int i, String str, String str2) {
        DocBlobManager docBlobManager = new DocBlobManager(i);
        docBlobManager.setCropRect(rect);
        docBlobManager.setBlobConfig(toygerDocBlobConfig);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ToygerDocInfo(tGFrame, new ToygerDocAttr()));
        HashMap hashMap = new HashMap();
        hashMap.put("bis_token", str);
        hashMap.put(BlobStatic.BLOB_META_INVTP_TYPE, "normal");
        hashMap.put(BlobStatic.BLOB_META_RETRY, str2);
        byte[] generateBlob = docBlobManager.generateBlob(arrayList, hashMap);
        byte[] key = docBlobManager.getKey();
        HashMap<String, Object> hashMap2 = new HashMap<>(6);
        hashMap2.put("content", generateBlob);
        hashMap2.put("key", key);
        hashMap2.put(ToygerService.KEY_RES_9_IS_UTF8, Boolean.TRUE);
        hashMap2.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(toygerDocBlobConfig.pageNo));
        hashMap2.put(ZdocRecordService.PRE_COMPRESS_SIZE, Long.toString((long) tGFrame.data.length));
        hashMap2.put(ZdocRecordService.POST_COMPRESS_SIZE, Long.toString(docBlobManager.getPicSize()));
        return hashMap2;
    }
}
