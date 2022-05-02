package com.alibaba.griver.core.jsapi.device.clipboard;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;

@Keep
public class ClipboardBridgeExtension implements BridgeExtension {
    private static final String TAG = "ClipboardBridgeExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse getClipboard(@BindingNode(App.class) App app, @BindingNode(Page.class) Page page) {
        Object obj;
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            GriverLogger.e(TAG, "Context is null, return system error");
            return BridgeResponse.newError(5, "system error");
        }
        ClipboardManager clipboardManager = (ClipboardManager) applicationContext.getSystemService("clipboard");
        if (clipboardManager == null) {
            GriverLogger.e(TAG, "Clipboard is null, return system error");
            return BridgeResponse.newError(5, "system error");
        }
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return BridgeResponse.newError(5, "no clipboard data");
        }
        JSONObject jSONObject = new JSONObject();
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt == null) {
            obj = "";
        } else {
            obj = itemAt.getText();
        }
        jSONObject.put("text", obj);
        return new BridgeResponse(jSONObject);
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse setClipboard(@BindingNode(App.class) App app, @BindingNode(Page.class) Page page, @BindingParam({"text"}) String str) {
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            GriverLogger.e(TAG, "Context is null, return system error");
            return BridgeResponse.newError(5, "system error");
        }
        ClipboardManager clipboardManager = (ClipboardManager) applicationContext.getSystemService("clipboard");
        if (clipboardManager == null) {
            GriverLogger.e(TAG, "Clipboard is null, return system error");
            return BridgeResponse.newError(5, "system error");
        } else if (str == null) {
            GriverLogger.e(TAG, "text is null, return invalid param");
            return BridgeResponse.INVALID_PARAM;
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", str));
            return BridgeResponse.SUCCESS;
        }
    }
}
