package com.alibaba.ariver.integration.ipc.server.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.BaseEngineImpl;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.EngineSetupCallback;
import com.alibaba.ariver.kernel.api.node.Node;

public class b extends BaseEngineImpl {
    public Render createRender(Activity activity, Node node, CreateParams createParams) {
        return null;
    }

    public Worker createWorker(Context context, Node node, String str, String str2) {
        return null;
    }

    public String getEngineType() {
        return "SERVER";
    }

    public String getInstanceId() {
        return "0";
    }

    public boolean isReady() {
        return true;
    }

    public void setup(Bundle bundle, Bundle bundle2, EngineSetupCallback engineSetupCallback) {
    }

    public b(App app) {
        super(app.getAppId(), app);
    }

    public NativeBridge createNativeBridge() {
        return new a((App) getNode());
    }
}
