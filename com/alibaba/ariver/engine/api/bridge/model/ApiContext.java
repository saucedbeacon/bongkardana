package com.alibaba.ariver.engine.api.bridge.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.fastjson.JSONObject;

public interface ApiContext {
    void callBridgeApi(NativeCallContext nativeCallContext, SendToNativeCallback sendToNativeCallback, boolean z);

    @Nullable
    Activity getActivity();

    Context getAppContext();

    String getAppId();

    Resource getContent(String str);

    @Nullable
    View getInternalView();

    int getPageId();

    @Nullable
    String getPluginId();

    @Nullable
    Render getRender();

    int getRenderId();

    String getSourceProcess();

    Bundle getStartParams();

    boolean isFromRemote();

    void sendEvent(String str, @Nullable JSONObject jSONObject, @Nullable SendToRenderCallback sendToRenderCallback);

    void startActivity(Intent intent);
}
