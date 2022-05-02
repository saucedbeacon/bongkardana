package com.alipay.zoloz.toyger.convert;

import com.alipay.zoloz.toyger.blob.model.Content;
import com.zoloz.wire.Message;

public class PBContentConvert implements IContentConvert {
    public byte[] convert(Content content) {
        return ((Message) ObjectConvertTools.convert(content)).toByteArray();
    }
}
