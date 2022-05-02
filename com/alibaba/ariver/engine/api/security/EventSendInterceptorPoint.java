package com.alibaba.ariver.engine.api.security;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.fastjson.JSONObject;

@AutoExtension
public interface EventSendInterceptorPoint extends Extension {
    boolean needIntercept(String str, JSONObject jSONObject);
}
