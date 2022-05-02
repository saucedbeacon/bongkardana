package com.alipay.zoloz.toyger.blob;

import com.alipay.zoloz.toyger.algorithm.TGFrame;

public class GenericBlobManager {
    private static final String TAG = "TOYGER";
    public static final String TYPE_DOC = "doc";
    public static final String TYPE_FACE = "face";
    private IGenericBlobManager blobManager;
    private boolean mHasOom = false;

    public GenericBlobManager(int i, String str, String str2) {
        this.blobManager = new GenericBlobManagerImpl(i, str, str2);
    }

    public void addMonitorFrame(TGFrame tGFrame) {
        if (!this.mHasOom) {
            try {
                this.blobManager.addMonitorFrame(tGFrame);
            } catch (OutOfMemoryError unused) {
                this.mHasOom = true;
                this.blobManager.cleanAllData();
            }
        }
    }

    public byte[] generateMonitorBlob(String str) {
        try {
            return this.blobManager.generateMonitorBlob(str);
        } catch (Exception unused) {
            this.blobManager.cleanAllData();
            return null;
        }
    }

    public boolean isUTF8() {
        return this.blobManager.isUTF8();
    }

    public byte[] getKey() {
        return this.blobManager.getKey();
    }

    public void cleanAllData() {
        this.blobManager.cleanAllData();
    }
}
