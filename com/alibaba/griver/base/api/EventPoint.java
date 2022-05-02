package com.alibaba.griver.base.api;

import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.fastjson.JSONObject;

public interface EventPoint extends Extension {
    boolean sendEvent(String str, JSONObject jSONObject);
}
