package com.alibaba.griver.core.jsapi.embedview;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.toyger.blob.BlobStatic;

public class EmbedViewBridgeExtension implements BridgeExtension {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter("NBComponent.sendMessage")
    public void sendMessage(@BindingParam({"element"}) String str, @BindingParam({"actionType"}) String str2, @BindingParam({"data"}) JSONObject jSONObject, @BindingParam({"version"}) String str3, @BindingCallback BridgeCallback bridgeCallback, @BindingNode(Page.class) Page page) {
        if (BlobStatic.BLOB_VERSION.equalsIgnoreCase(str3)) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "cover-view is not supported!"));
            return;
        }
        PageContext pageContext = page.getPageContext();
        if (pageContext == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        IEmbedView findViewById = pageContext.getEmbedViewManager().findViewById(str);
        if (findViewById == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "cannot find embedview for id: ".concat(String.valueOf(str))));
            return;
        }
        try {
            findViewById.onReceivedMessage(str2, jSONObject, bridgeCallback);
        } catch (Throwable th) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(5, "EmbedView onReceivedMessage exception: ".concat(String.valueOf(th))));
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter("NBComponent.render")
    public void render(@BindingParam({"element"}) String str, @BindingParam({"props"}) JSONObject jSONObject, @BindingParam({"data"}) JSONObject jSONObject2, @BindingParam({"version"}) String str2, @BindingCallback BridgeCallback bridgeCallback, @BindingNode(Page.class) Page page) {
        if (BlobStatic.BLOB_VERSION.equalsIgnoreCase(str2)) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "cover-view is not supported!"));
            return;
        }
        PageContext pageContext = page.getPageContext();
        if (pageContext == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        IEmbedView findViewById = pageContext.getEmbedViewManager().findViewById(str);
        if (findViewById == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "Cannot find embedview for id: ".concat(String.valueOf(str))));
            return;
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.putAll(jSONObject);
        }
        jSONObject2.put("element", (Object) str);
        try {
            findViewById.onReceivedRender(jSONObject2, bridgeCallback);
        } catch (Throwable th) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(5, "EmbedView onReceivedRender exception: ".concat(String.valueOf(th))));
        }
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter("NBComponent.remove")
    public BridgeResponse remove(@BindingParam({"element"}) String str, @BindingParam({"version"}) String str2, @BindingCallback BridgeCallback bridgeCallback, @BindingNode(Page.class) Page page) {
        if (BlobStatic.BLOB_VERSION.equalsIgnoreCase(str2)) {
            return new BridgeResponse.Error(2, "cover-view is not supported!");
        }
        PageContext pageContext = page.getPageContext();
        if (pageContext == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        pageContext.getEmbedViewManager().destroyView(str);
        return BridgeResponse.SUCCESS;
    }
}
