package com.alibaba.ariver.integration.ipc.server;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.fastjson.JSONObject;
import java.lang.ref.WeakReference;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class d implements ApiContext {

    /* renamed from: a  reason: collision with root package name */
    private long f8994a;
    private String b;
    private Bundle c;
    private Render d;
    private String e;
    private String f;

    public Resource getContent(String str) {
        return null;
    }

    public View getInternalView() {
        return null;
    }

    public int getPageId() {
        return -1;
    }

    public int getRenderId() {
        return -1;
    }

    public boolean isFromRemote() {
        return true;
    }

    public d(Render render, long j, String str, Bundle bundle, String str2, String str3) {
        this.d = render;
        this.f8994a = j;
        this.b = str;
        this.c = bundle;
        this.e = str2;
        this.f = str3;
    }

    @Nullable
    public String getPluginId() {
        return this.f;
    }

    public String getSourceProcess() {
        return this.e;
    }

    public Render getRender() {
        return this.d;
    }

    public String getAppId() {
        return this.b;
    }

    public Context getAppContext() {
        return ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
    }

    public Activity getActivity() {
        WeakReference<Activity> topActivity = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getTopActivity();
        if (topActivity != null) {
            return topActivity.get();
        }
        return null;
    }

    public void startActivity(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(IpcMessageConstants.EXTRA_INTENT, intent);
        RVLogger.d("AriverInt:ServerSideApiContext", "startActivity by serverSide: ".concat(String.valueOf(intent)));
        IpcServerUtils.sendMsgToClient(this.b, this.f8994a, 11, bundle);
    }

    public Bundle getStartParams() {
        return this.c;
    }

    public void sendEvent(String str, @Nullable JSONObject jSONObject, @Nullable final SendToRenderCallback sendToRenderCallback) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-685196609, oncanceled);
            onCancelLoad.getMin(-685196609, oncanceled);
        }
        StringBuilder sb = new StringBuilder("serverEvent_");
        sb.append(System.currentTimeMillis());
        String obj = sb.toString();
        if (sendToRenderCallback != null) {
            e.a().a(this.f8994a, obj, (SendToNativeCallback) new SendToNativeCallback() {
                public void onCallback(JSONObject jSONObject, boolean z) {
                    sendToRenderCallback.onCallBack(jSONObject);
                }
            });
        }
        Bundle bundle = new Bundle();
        bundle.putString(IpcMessageConstants.EXTRA_EVENT, str);
        bundle.putString("clientId", obj);
        bundle.putByteArray("data", JSONUtils.marshallJSONObject(jSONObject));
        StringBuilder sb2 = new StringBuilder("sendEvent by serverSide: ");
        sb2.append(str);
        sb2.append(", data: ");
        sb2.append(jSONObject);
        sb2.append(", eventCallId: ");
        sb2.append(obj);
        RVLogger.d("AriverInt:ServerSideApiContext", sb2.toString());
        IpcServerUtils.sendMsgToClient(this.b, this.f8994a, 9, bundle);
    }

    public void callBridgeApi(NativeCallContext nativeCallContext, SendToNativeCallback sendToNativeCallback, boolean z) {
        if (nativeCallContext == null) {
            RVLogger.e("AriverInt:ServerSideApiContext", "callApi with nativeCallContext == null!!");
            return;
        }
        nativeCallContext.setPluginId(this.f);
        e.a().a(this.f8994a, nativeCallContext.getId(), sendToNativeCallback);
        Bundle bundle = new Bundle();
        bundle.putParcelable(IpcMessageConstants.EXTRA_REMOTE_CALL_CONTEXT, nativeCallContext);
        bundle.putBoolean(IpcMessageConstants.EXTRA_REMOTE_CALL_NEED_PERMISSION, z);
        RVLogger.d("AriverInt:ServerSideApiContext", "sendToNative with context: ".concat(String.valueOf(nativeCallContext)));
        IpcServerUtils.sendMsgToClient(this.b, this.f8994a, 8, bundle);
    }
}
