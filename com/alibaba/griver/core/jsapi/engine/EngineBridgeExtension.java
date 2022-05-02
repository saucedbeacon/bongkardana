package com.alibaba.griver.core.jsapi.engine;

import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;

@Keep
public class EngineBridgeExtension implements BridgeExtension {
    private static final String TAG = "EngineBridgeExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse measureText(@BindingParam(floatDefault = 10.0f, name = {"fontSize"}) float f, @BindingParam({"fontWeight"}) String str, @BindingParam(name = {"text"}, required = true) String str2) {
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(f);
            textPaint.setFakeBoldText(!TextUtils.isEmpty(str) && TtmlNode.BOLD.equals(str));
            return BridgeResponse.newValue("width", Float.valueOf(textPaint.measureText(str2, 0, str2.length())));
        } catch (Throwable th) {
            RVLogger.e(TAG, "measureText exception!", th);
            return BridgeResponse.UNKNOWN_ERROR;
        }
    }

    @AutoCallback
    @ActionFilter
    public JSONObject checkJSAPI(@BindingNode(Page.class) Page page, @BindingParam({"api"}) String str) {
        boolean isJsApiAvailable = isJsApiAvailable(page, str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("available", (Object) Boolean.valueOf(isJsApiAvailable));
        return jSONObject;
    }

    public boolean isJsApiAvailable(Page page, String str) {
        ExtensionManager extensionManager = page.getExtensionManager();
        if (extensionManager == null || extensionManager.findActionMeta(str) == null) {
            return false;
        }
        return true;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse h5PageReload(@BindingApiContext ApiContext apiContext) {
        apiContext.getRender().reload();
        return BridgeResponse.SUCCESS;
    }
}
