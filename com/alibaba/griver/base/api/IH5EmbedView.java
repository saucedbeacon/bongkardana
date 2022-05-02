package com.alibaba.griver.base.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

public interface IH5EmbedView {
    void execJavaScript(String str, IH5EmbedViewJSCallback iH5EmbedViewJSCallback);

    Bitmap getSnapshot(int i, int i2, String str, String str2, Map<String, String> map);

    View getSpecialRestoreView(int i, int i2, String str, String str2, Map<String, String> map);

    View getView(int i, int i2, String str, String str2, Map<String, String> map);

    void onCreate(Context context, Page page);

    void onEmbedViewAttachedToWebView(int i, int i2, String str, String str2, Map<String, String> map);

    void onEmbedViewDestory(int i, int i2, String str, String str2, Map<String, String> map);

    void onEmbedViewDetachedFromWebView(int i, int i2, String str, String str2, Map<String, String> map);

    void onEmbedViewParamChanged(int i, int i2, String str, String str2, Map<String, String> map, String[] strArr, String[] strArr2);

    void onEmbedViewVisibilityChanged(int i, int i2, String str, String str2, Map<String, String> map, int i3);

    void onReceivedMessage(String str, JSONObject jSONObject, H5BridgeContext h5BridgeContext);

    void onReceivedRender(JSONObject jSONObject, H5BridgeContext h5BridgeContext);

    void onRequestPermissionResult(int i, String[] strArr, int[] iArr);

    void onWebViewDestory();

    void onWebViewPause();

    void onWebViewResume();

    void triggerPreSnapshot();
}
