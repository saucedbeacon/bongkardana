package com.alibaba.ariver.engine.api.embedview;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

public interface IEmbedView {
    Bitmap getSnapshot();

    String getType();

    View getView(int i, int i2, String str, String str2, Map<String, String> map);

    void onAttachedToWebView();

    void onCreate(Map<String, String> map);

    void onDestroy();

    void onDetachedToWebView();

    void onEmbedViewVisibilityChanged(int i);

    void onParamChanged(String[] strArr, String[] strArr2);

    void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback);

    void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback);

    void onRequestPermissionResult(int i, String[] strArr, int[] iArr);

    void onSurfaceAvailable(Surface surface, int i, int i2, ValueCallback<Integer> valueCallback);

    boolean onSurfaceDestroyed(Surface surface);

    void onSurfaceSizeChanged(Surface surface, int i, int i2);

    void onWebViewPause();

    void onWebViewResume();

    void sendEvent(String str, JSONObject jSONObject, @Nullable IEmbedCallback iEmbedCallback);

    void triggerPreSnapshot();
}
