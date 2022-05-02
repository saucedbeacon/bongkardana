package com.alibaba.ariver.engine;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.alibaba.ariver.engine.api.EngineStack;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.model.EngineInitCallback;
import com.alibaba.ariver.engine.api.bridge.model.InitParams;
import com.alibaba.ariver.engine.common.bridge.DefaultNativeBridge;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;

public abstract class BaseEngineImpl implements RVEngine {

    /* renamed from: a  reason: collision with root package name */
    private Node f8964a;
    private String b;
    private NativeBridge c;
    private EngineRouter d;
    private Context e;
    private boolean f = false;
    protected InitParams initParams;

    public String getEngineType() {
        return "WEB";
    }

    public BaseEngineImpl(String str, Node node) {
        this.f8964a = node;
        this.b = str;
        this.e = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
        this.c = createNativeBridge();
        EngineRouter createEngineRouter = createEngineRouter();
        this.d = createEngineRouter;
        this.c.bindEngineRouter(createEngineRouter);
    }

    /* access modifiers changed from: protected */
    public NativeBridge createNativeBridge() {
        return new DefaultNativeBridge();
    }

    public void setNativeBridge(@NonNull NativeBridge nativeBridge) {
        this.c = nativeBridge;
    }

    /* access modifiers changed from: protected */
    public EngineRouter createEngineRouter() {
        return new DefaultEngineRouter();
    }

    @CallSuper
    public void init(InitParams initParams2, EngineInitCallback engineInitCallback) {
        this.initParams = initParams2;
        EngineStack.getInstance().pushEnginePorxy(this);
    }

    public Render getTopRender() {
        return this.d.getRenderById((String) null);
    }

    public String getAppId() {
        return this.b;
    }

    public Bundle getStartParams() {
        InitParams initParams2 = this.initParams;
        if (initParams2 == null) {
            return null;
        }
        return initParams2.startParams;
    }

    public EngineRouter getEngineRouter() {
        return this.d;
    }

    public NativeBridge getBridge() {
        return this.c;
    }

    public Node getNode() {
        return this.f8964a;
    }

    public Context getApplication() {
        return this.e;
    }

    public final synchronized void destroy() {
        if (!this.f) {
            this.f = true;
            onDestroy();
            this.c.release();
            EngineStack.getInstance().removeProxy(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        EngineRouter engineRouter = this.d;
        if (engineRouter != null) {
            engineRouter.destroy();
        }
    }

    public boolean isDestroyed() {
        return this.f;
    }
}
