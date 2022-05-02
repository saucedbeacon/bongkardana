package com.alipay.zoloz.toyger.convert;

import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.blob.model.Content;

public class JsonContentConverter implements IContentConvert {
    public byte[] convert(Content content) {
        return JSON.toJSONString(content).getBytes();
    }
}
