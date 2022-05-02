package com.alibaba.ariver.integration.proxy.impl;

import android.os.Bundle;
import com.alibaba.ariver.engine.api.proxy.RVJSApiHandlerProxy;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.core.RVRemoteDebugProxy;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.fastjson.JSONObject;

public class DefaultJsApiHandlerProxyImpl implements RVJSApiHandlerProxy {
    public int getSyncTimeout(String str, Bundle bundle, JSONObject jSONObject) {
        return a(str, bundle, jSONObject);
    }

    private int a(String str, Bundle bundle, JSONObject jSONObject) {
        try {
            if (!a(BundleUtils.getString(bundle, "appId"))) {
                RVLogger.d("AriverInt:DefaultJsApiHandlerProxyImpl", "getTyroBlockTime disable!");
                return -1;
            }
        } catch (Throwable th) {
            RVLogger.d("AriverInt:DefaultJsApiHandlerProxyImpl", th.getMessage());
        }
        if (jSONObject == null) {
            RVLogger.d("AriverInt:DefaultJsApiHandlerProxyImpl", "getTyroBlockTime data is null");
            return -1;
        } else if (!"tyroRequest".equals(str)) {
            StringBuilder sb = new StringBuilder("getTyroBlockTime ");
            sb.append(str);
            sb.append(" not tyroRequest");
            RVLogger.d("AriverInt:DefaultJsApiHandlerProxyImpl", sb.toString());
            return -1;
        } else if (bundle == null) {
            RVLogger.d("AriverInt:DefaultJsApiHandlerProxyImpl", "getTyroBlockTime params or realJson is null");
            return -1;
        } else {
            JSONObject jSONObject2 = JSONUtils.getJSONObject(jSONObject, "data", (JSONObject) null);
            if (jSONObject2 == null) {
                return -1;
            }
            AppInfoScene extractScene = AppInfoScene.extractScene(bundle);
            boolean z = extractScene == AppInfoScene.DEBUG || extractScene == AppInfoScene.INSPECT;
            RVLogger.d("AriverInt:DefaultJsApiHandlerProxyImpl", "getTyroBlockTime isDebugOrInspect ".concat(String.valueOf(z)));
            if (!z) {
                return -1;
            }
            int i = JSONUtils.getInt(jSONObject2, "blockTimeout", -1);
            RVLogger.d("AriverInt:DefaultJsApiHandlerProxyImpl", "getTyroBlockTime result: ".concat(String.valueOf(i)));
            return i;
        }
    }

    private static boolean a(String str) {
        return ((RVRemoteDebugProxy) RVProxy.get(RVRemoteDebugProxy.class)).enableTyroBlock(str);
    }
}
