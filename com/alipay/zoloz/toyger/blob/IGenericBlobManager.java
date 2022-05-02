package com.alipay.zoloz.toyger.blob;

import com.alipay.zoloz.toyger.algorithm.TGFrame;

public interface IGenericBlobManager {
    void addMonitorFrame(TGFrame tGFrame);

    void cleanAllData();

    byte[] generateMonitorBlob(String str);

    byte[] getKey();

    boolean isUTF8();
}
