package com.alibaba.ariver.engine.api.proxy;

import android.os.Bundle;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONObject;

@DefaultImpl("com.alibaba.ariver.integration.proxy.impl.DefaultJsApiHandlerProxyImpl")
public interface RVJSApiHandlerProxy extends Proxiable {
    int getSyncTimeout(String str, Bundle bundle, JSONObject jSONObject);
}
