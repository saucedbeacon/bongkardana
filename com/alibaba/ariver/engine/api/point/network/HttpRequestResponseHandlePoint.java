package com.alibaba.ariver.engine.api.point.network;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.fastjson.JSONObject;

@AutoExtension
public interface HttpRequestResponseHandlePoint extends Extension {
    void onHandleResponse(String str, String str2, JSONObject jSONObject);
}
