package com.alipay.plus.android.config.sdk.listener.commonconfig;

import com.alibaba.fastjson.JSONArray;

public abstract class JSONArrayConfigListener extends AbstractTypedConfigListener<JSONArray> {
    public JSONArrayConfigListener() {
        super(JSONArray.class);
    }
}
