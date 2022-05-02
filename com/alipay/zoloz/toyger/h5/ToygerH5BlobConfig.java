package com.alipay.zoloz.toyger.h5;

import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;

public class ToygerH5BlobConfig extends ToygerBlobConfig {
    public int desiredWidth;
    public float uploadRatio;

    public float getCompressRate() {
        return this.uploadRatio;
    }
}
