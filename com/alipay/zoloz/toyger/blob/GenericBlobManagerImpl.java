package com.alipay.zoloz.toyger.blob;

import android.graphics.Rect;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.model.Blob;
import com.alipay.zoloz.toyger.blob.model.BlobElem;
import com.alipay.zoloz.toyger.blob.model.Content;
import com.alipay.zoloz.toyger.blob.model.Meta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericBlobManagerImpl extends BlobManager implements IGenericBlobManager {
    private List<BlobElem> mCacheBlobElem = new ArrayList();
    private String mType;

    public boolean isUTF8() {
        return false;
    }

    public GenericBlobManagerImpl(int i, String str, String str2) {
        super(i);
        this.mType = str;
        this.crypto = new CryptoManager(str2);
    }

    public void addMonitorFrame(TGFrame tGFrame) {
        this.mCacheBlobElem.add(generateMonitorBlobElem(tGFrame));
    }

    public byte[] generateMonitorBlob(String str) {
        if (this.mCacheBlobElem.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BlobStatic.BLOB_META_INVTP_TYPE, BlobStatic.INVTP_TYPE_MONITOR);
        hashMap.put("bis_token", str);
        hashMap.put(BlobStatic.BLOB_META_RETRY, "0");
        Meta generateMeta = generateMeta((List) null, hashMap);
        Blob blob = new Blob();
        blob.blobElem = this.mCacheBlobElem;
        blob.blobVersion = BlobStatic.BLOB_VERSION;
        Content content = new Content();
        content.blob = blob;
        content.meta = generateMeta;
        try {
            return this.crypto.encrypt(this.mConvertManager.convert(content));
        } catch (Exception unused) {
            return null;
        } finally {
            this.mCacheBlobElem.clear();
        }
    }

    public byte[] generateBlob(List list, Map map) {
        throw new RuntimeException("method is not implemented");
    }

    public byte[] getKey() {
        return this.crypto.getAESCypher();
    }

    public void cleanAllData() {
        this.mCacheBlobElem.clear();
    }

    private BlobElem generateMonitorBlobElem(TGFrame tGFrame) {
        byte[] processFrame = processFrame(tGFrame, BlobStatic.MONITOR_IMAGE_WIDTH, 15, new Rect());
        if (processFrame == null) {
            return null;
        }
        BlobElem blobElem = new BlobElem();
        if ("face".equals(this.mType)) {
            blobElem.type = "face";
        } else {
            blobElem.type = "doc";
        }
        blobElem.subType = BlobStatic.SUB_TYPE_SURVEILLANCE;
        blobElem.version = "1.0";
        blobElem.idx = this.mCacheBlobElem.size();
        blobElem.content = processFrame;
        return blobElem;
    }

    private Meta generateMeta() {
        Meta meta = new Meta();
        if ("face".equals(this.mType)) {
            meta.type = BlobStatic.META_TYPE_FACE;
        } else {
            meta.type = BlobStatic.META_TYPE_DOC;
        }
        meta.serialize = this.metaSerializer;
        meta.collectInfo = new HashMap();
        return meta;
    }
}
