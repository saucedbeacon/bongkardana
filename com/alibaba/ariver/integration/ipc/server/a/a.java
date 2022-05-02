package com.alibaba.ariver.integration.ipc.server.a;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.integration.ipc.server.e;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;

public class a implements NativeBridge {

    /* renamed from: a  reason: collision with root package name */
    private App f8991a;

    public void bindEngineRouter(EngineRouter engineRouter) {
    }

    public void release() {
    }

    a(App app) {
        this.f8991a = app;
    }

    public boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback) {
        return sendToNative(nativeCallContext, sendToNativeCallback, true);
    }

    public boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback, boolean z) {
        e.a().a(this.f8991a.getStartToken(), nativeCallContext.getId(), sendToNativeCallback);
        Bundle bundle = new Bundle();
        bundle.putParcelable(IpcMessageConstants.EXTRA_REMOTE_CALL_CONTEXT, nativeCallContext);
        bundle.putBoolean(IpcMessageConstants.EXTRA_REMOTE_CALL_NEED_PERMISSION, z);
        RVLogger.d("AriverInt:ServerSideBridge", "sendToNative with context: ".concat(String.valueOf(nativeCallContext)));
        IpcServerUtils.sendMsgToClient(this.f8991a.getAppId(), this.f8991a.getStartToken(), 8, bundle);
        return true;
    }
}
