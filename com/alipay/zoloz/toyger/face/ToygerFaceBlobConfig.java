package com.alipay.zoloz.toyger.face;

import com.alibaba.fastjson.JSON;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import java.util.ArrayList;
import java.util.List;

public class ToygerFaceBlobConfig extends ToygerBlobConfig {
    public List<String> collection;
    public int desiredWidth;
    public float upload_compress_rate;

    public ToygerFaceBlobConfig() {
        this.upload_compress_rate = 0.8f;
        this.desiredWidth = 480;
        ArrayList arrayList = new ArrayList();
        this.collection = arrayList;
        arrayList.add(BlobStatic.SUB_TYPE_PANO);
    }

    public ToygerFaceBlobConfig(float f, int i, String str) {
        this.upload_compress_rate = f;
        this.desiredWidth = i;
        this.pubkey = str;
    }

    public float getCompressRate() {
        return this.upload_compress_rate;
    }

    public Integer getDesiredWidth() {
        return Integer.valueOf(this.desiredWidth);
    }

    public static ToygerFaceBlobConfig from(String str, String str2) {
        ToygerFaceBlobConfig toygerFaceBlobConfig = (ToygerFaceBlobConfig) JSON.parseObject(str, ToygerFaceBlobConfig.class);
        if (toygerFaceBlobConfig == null) {
            toygerFaceBlobConfig = new ToygerFaceBlobConfig();
        }
        if (toygerFaceBlobConfig.desiredWidth <= 0) {
            toygerFaceBlobConfig.desiredWidth = APEncodeOptions.DEFAULT_MAX_LEN;
        }
        if (toygerFaceBlobConfig.collection == null) {
            toygerFaceBlobConfig.collection = new ArrayList();
        }
        toygerFaceBlobConfig.pubkey = str2;
        return toygerFaceBlobConfig;
    }

    public int getMinWidth(int i) {
        int i2 = this.desiredWidth;
        return i2 > i ? i : i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ToygerFaceBlobConfig{upload_compress_rate=");
        sb.append(this.upload_compress_rate);
        sb.append(", desiredWidth=");
        sb.append(this.desiredWidth);
        sb.append(", collection=");
        sb.append(this.collection);
        sb.append('}');
        return sb.toString();
    }
}
