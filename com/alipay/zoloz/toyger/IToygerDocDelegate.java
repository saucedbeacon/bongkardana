package com.alipay.zoloz.toyger;

import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.doc.ToygerDocAttr;
import com.alipay.zoloz.toyger.doc.ToygerDocInfo;
import com.alipay.zoloz.toyger.doc.ToygerDocState;

public interface IToygerDocDelegate {
    public static final int LOG_DEBUG = 1;
    public static final int LOG_DEVICE = 2;
    public static final int LOG_MONITOR = 3;

    void handleEventTriggered(int i, String str);

    void handleFinish(int i, ToygerDocInfo toygerDocInfo);

    void handleInfoReady(TGFrame tGFrame, ToygerDocAttr toygerDocAttr);

    void handleLog(int i, String str, byte[] bArr);

    void handleStateUpdated(ToygerDocState toygerDocState, ToygerDocAttr toygerDocAttr);
}
