package com.alipay.zoloz.toyger.doc;

import com.alipay.zoloz.toyger.algorithm.TGFrame;

public class ToygerDocInfo {
    public ToygerDocAttr attr;
    public TGFrame frame;
    public ToygerDocBlobConfig mBlobConfig;

    public ToygerDocInfo() {
    }

    public ToygerDocInfo(TGFrame tGFrame, ToygerDocAttr toygerDocAttr) {
        this.frame = tGFrame;
        this.attr = toygerDocAttr;
    }

    public ToygerDocBlobConfig getBlobConfig() {
        return this.mBlobConfig;
    }

    public void setBlobConfig(ToygerDocBlobConfig toygerDocBlobConfig) {
        this.mBlobConfig = toygerDocBlobConfig;
    }
}
