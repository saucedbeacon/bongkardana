package com.alipay.zoloz.toyger.doc;

import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;

public class ToygerDocBlobConfig extends ToygerBlobConfig {
    public String docType;
    public int pageNo;
    public float ratio;
    public String subType;

    public ToygerDocBlobConfig() {
    }

    public ToygerDocBlobConfig(float f, String str) {
        this.ratio = f;
        this.pubkey = str;
    }

    public float getCompressRate() {
        return this.ratio;
    }

    public Integer getDesiredWidth() {
        return 1080;
    }

    public static ToygerDocBlobConfig from(String str, String str2) {
        ToygerDocBlobConfig toygerDocBlobConfig = (ToygerDocBlobConfig) JSON.parseObject(str, ToygerDocBlobConfig.class);
        toygerDocBlobConfig.pubkey = str2;
        return toygerDocBlobConfig;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ToygerDocBlobConfig{ratio=");
        sb.append(this.ratio);
        sb.append('}');
        return sb.toString();
    }
}
