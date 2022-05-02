package com.alibaba.griver.base.api;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.fastjson.JSONObject;

public interface H5BridgeContext extends SendToNativeCallback {
    public static final String INVALID_ID = "-1";

    @Nullable
    Activity getActivity();

    String getId();

    String getInvokeType();

    boolean sendBack(JSONObject jSONObject, boolean z);

    boolean sendBridgeResult(JSONObject jSONObject);

    boolean sendBridgeResult(String str, Object obj);

    boolean sendBridgeResultWithCallbackKept(JSONObject jSONObject);

    boolean sendBridgeResultWithCallbackKept(String str, Object obj);

    void sendError(int i, String str);

    boolean sendError(H5Event h5Event, Error error);

    void sendNoRigHtToInvoke();

    void sendNoRigHtToInvoke4NewJSAPIPermission();

    void sendNotGrantPermission();

    void sendSuccess();

    void sendToWeb(String str, JSONObject jSONObject, H5CallBack h5CallBack);

    void useCancel();
}
