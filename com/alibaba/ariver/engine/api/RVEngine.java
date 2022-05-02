package com.alibaba.ariver.engine.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.EngineInitCallback;
import com.alibaba.ariver.engine.api.bridge.model.EngineSetupCallback;
import com.alibaba.ariver.engine.api.bridge.model.InitParams;
import com.alibaba.ariver.kernel.api.node.Node;

public interface RVEngine {
    Render createRender(Activity activity, Node node, CreateParams createParams);

    Worker createWorker(Context context, Node node, String str, String str2);

    void destroy();

    String getAppId();

    Context getApplication();

    NativeBridge getBridge();

    EngineRouter getEngineRouter();

    String getEngineType();

    String getInstanceId();

    Node getNode();

    Bundle getStartParams();

    Render getTopRender();

    void init(InitParams initParams, EngineInitCallback engineInitCallback);

    boolean isDestroyed();

    boolean isReady();

    void setup(Bundle bundle, Bundle bundle2, EngineSetupCallback engineSetupCallback);
}
