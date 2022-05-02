package com.alibaba.ariver.permission.api.proxy;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONObject;

public interface EmbedWebViewJsApiPermissionProxy extends Proxiable {
    boolean shouldInterceptJSApiCall(String str, Page page, String str2, String str3, JSONObject jSONObject);
}
