package com.alibaba.ariver.engine.api.bridge;

import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.R;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.LangResourceUtil;
import com.alibaba.fastjson.JSONObject;
import id.dana.data.constant.BranchLinkConstant;

public class BridgeResponseHelper {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private SendToNativeCallback f8969a;
    private Extension b;

    public BridgeResponseHelper(@Nullable SendToNativeCallback sendToNativeCallback) {
        this.f8969a = sendToNativeCallback;
    }

    public void setTargetExtension(Extension extension) {
        this.b = extension;
    }

    public SendToNativeCallback getInnerBridgeResponse() {
        return this.f8969a;
    }

    /* access modifiers changed from: protected */
    public void executeSendBack(JSONObject jSONObject, boolean z) {
        SendToNativeCallback sendToNativeCallback = this.f8969a;
        if (sendToNativeCallback != null) {
            sendToNativeCallback.onCallback(jSONObject, z);
        }
    }

    public void sendBridgeResult(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        executeSendBack(jSONObject, false);
    }

    public void sendBridgeResult(JSONObject jSONObject) {
        executeSendBack(jSONObject, false);
    }

    public void sendBridgeResultWithCallbackKept(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        executeSendBack(jSONObject, true);
    }

    public void sendBridgeResultWithCallbackKept(JSONObject jSONObject) {
        executeSendBack(jSONObject, true);
    }

    public void sendSuccess() {
        sendBridgeResult(new JSONObject());
    }

    public void sendError(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", (Object) str);
        jSONObject.put("errorMessage", (Object) str);
        jSONObject.put("error", (Object) Integer.valueOf(i));
        executeSendBack(jSONObject, false);
    }

    public void sendError(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", (Object) str);
        jSONObject.put("errorMessage", (Object) str);
        jSONObject.put("error", (Object) Integer.valueOf(i));
        jSONObject.put(BranchLinkConstant.OauthParams.SIGNATURE, (Object) str2);
        executeSendBack(jSONObject, false);
    }

    public void sendNoRigHtToInvoke() {
        sendError(4, LangResourceUtil.getString(R.string.ariver_engine_api_forbidden_error));
    }

    public void sendNoRigHtToInvoke(String str) {
        sendError(4, LangResourceUtil.getString(R.string.ariver_engine_api_forbidden_error), str);
    }

    public void sendNotFound() {
        sendError(1, "JSAPI not existed");
    }

    public void sendNoRigHtToInvoke4NewJSAPIPermission() {
        sendError(4, "new jsapi permission deny");
    }

    public void sendNotGrantPermission() {
        sendError(5, LangResourceUtil.getString(R.string.ariver_engine_api_authorization_error));
    }

    public void sendUserNotGrantPermission() {
        sendError(2001, LangResourceUtil.getString(R.string.ariver_engine_api_user_not_grant));
    }

    public void sendSilentDenyPermission() {
        sendError(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ta_send_slientdeny_permission", true) ? 2002 : 2001, "user does not allow authorization\n");
    }
}
