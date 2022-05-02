package com.alibaba.griver.core.jsapi.embedview;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;

@Keep
public class EmbedWebViewBridgeExtension implements BridgeExtension {
    private static final String TAG = "AriverAPI:EmbedWebViewBridgeExtension";
    private static final String TYPE_MESSAGE = "message";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse postWebViewMessage(@BindingNode(Page.class) Page page, @BindingRequest JSONObject jSONObject) {
        if (page == null || page.getPageContext() == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        String string = page.getSceneParams().getString(RVConstants.EXTRA_EMBED_VIEW_ID);
        if (TextUtils.isEmpty(string)) {
            RVLogger.e(TAG, "Can't find the viewId");
            return BridgeResponse.newError(10, "no viewId");
        }
        try {
            String string2 = JSONUtils.getString(jSONObject, "type");
            IEmbedView findViewById = page.getPageContext().getEmbedViewManager().findViewById(string);
            if ("message".equals(string2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("detail", (Object) JSONUtils.getJSONObject(jSONObject, "detail", (JSONObject) null));
                jSONObject2.put("type", (Object) "message");
                findViewById.sendEvent(RVEvents.WEBVIEW_ON_FROM_MESSAGE, jSONObject2, (IEmbedCallback) null);
            } else {
                JSONObject jSONObject3 = new JSONObject();
                int i = JSONUtils.getInt(jSONObject, "callback");
                JSONObject jSONObject4 = JSONUtils.getJSONObject(jSONObject, "param", (JSONObject) null);
                jSONObject3.put("viewId", (Object) BundleUtils.getString(page.getSceneParams(), "viewId"));
                jSONObject3.put("type", (Object) string2);
                jSONObject3.put("callback", (Object) Integer.valueOf(i));
                jSONObject3.put("param", (Object) jSONObject4);
                findViewById.sendEvent(RVEvents.WEBVIEW_ON_FROM_MESSAGE, jSONObject3, (IEmbedCallback) null);
            }
            return BridgeResponse.SUCCESS;
        } catch (Exception e) {
            RVLogger.e(TAG, "postWebViewMessage exception!", e);
            StringBuilder sb = new StringBuilder("java exception happen!");
            sb.append(e.getMessage());
            return BridgeResponse.newError(11, sb.toString());
        }
    }
}
