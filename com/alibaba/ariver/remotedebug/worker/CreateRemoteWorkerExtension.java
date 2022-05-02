package com.alibaba.ariver.remotedebug.worker;

import android.content.Context;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.extensions.CreateWorkerPoint;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.utils.RemoteDebugUtils;

public class CreateRemoteWorkerExtension implements CreateWorkerPoint {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    @Nullable
    public Worker createWorker(Context context, Node node, String str, String str2) {
        App app = (App) node.bubbleFindNode(App.class);
        if (!RemoteDebugUtils.isRemoteDebugMode(app.getStartParams()) || !RemoteDebugUtils.supportRemoteDebugMode(app.getAppId())) {
            return null;
        }
        RVLogger.d("AriverRemoteDebug:CreateRemoteWorkerExtension", "CreateRemoteWorkerExtension create RemoteDebugWorker");
        return new b(context, node, str, str2);
    }
}
