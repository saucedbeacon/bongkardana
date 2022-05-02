package com.alipay.plus.android.config.sdk.listener.commonconfig;

import com.alibaba.fastjson.JSONObject;

public abstract class JSONObjectConfigListener extends AbstractTypedConfigListener<JSONObject> {
    public JSONObjectConfigListener() {
        super(JSONObject.class);
    }
}
