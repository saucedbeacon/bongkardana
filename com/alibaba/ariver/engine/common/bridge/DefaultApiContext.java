package com.alibaba.ariver.engine.common.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.engine.api.resources.ResourceLoadPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.TypeUtils;
import com.alibaba.fastjson.JSONObject;

public class DefaultApiContext implements ApiContext {

    /* renamed from: a  reason: collision with root package name */
    private Node f8977a;
    private String b;

    public boolean isFromRemote() {
        return false;
    }

    public DefaultApiContext(Node node, String str) {
        this.f8977a = node;
        this.b = str;
    }

    public String getPluginId() {
        return this.b;
    }

    public String getSourceProcess() {
        return ProcessUtils.getProcessName();
    }

    private App a() {
        Node node = this.f8977a;
        if (node instanceof Page) {
            return (App) node.bubbleFindNode(App.class);
        }
        if (node instanceof App) {
            return (App) node;
        }
        return null;
    }

    @Nullable
    public Render getRender() {
        Page page;
        Node node = this.f8977a;
        if (node instanceof Page) {
            page = (Page) node;
        } else {
            page = node instanceof App ? ((App) node).getActivePage() : null;
        }
        if (page == null) {
            return null;
        }
        return page.getRender();
    }

    public String getAppId() {
        App a2 = a();
        if (a2 == null) {
            return "";
        }
        return a2.getAppId();
    }

    public Context getAppContext() {
        return ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
    }

    public Resource getContent(String str) {
        ResourceLoadContext resourceLoadContext = new ResourceLoadContext();
        resourceLoadContext.uri = Uri.parse(str);
        resourceLoadContext.originUrl = str;
        resourceLoadContext.canUseFallback = true;
        resourceLoadContext.canAsyncFallback = false;
        resourceLoadContext.isMainDoc = false;
        Resource load = ExtensionPoint.as(ResourceLoadPoint.class).node(a()).create().load(resourceLoadContext);
        if (load != null) {
            return load;
        }
        return null;
    }

    public Activity getActivity() {
        AppContext appContext;
        PageContext pageContext;
        Page page = (Page) this.f8977a.bubbleFindNode(Page.class);
        if (page != null && (pageContext = page.getPageContext()) != null && pageContext.getActivity() != null) {
            return pageContext.getActivity();
        }
        App app = (App) this.f8977a.bubbleFindNode(App.class);
        if (app != null && (appContext = app.getAppContext()) != null && (appContext.getContext() instanceof Activity)) {
            return (Activity) appContext.getContext();
        }
        Render render = getRender();
        if (render == null) {
            return null;
        }
        return render.getActivity();
    }

    public void startActivity(Intent intent) {
        getActivity().startActivity(intent);
    }

    public View getInternalView() {
        Render render = getRender();
        if (render == null) {
            return null;
        }
        return render.getView();
    }

    public Bundle getStartParams() {
        Render render = getRender();
        if (render == null) {
            return a().getStartParams();
        }
        return render.getStartParams();
    }

    public int getPageId() {
        if (getRender() != null) {
            return getRender().getPageId();
        }
        return 0;
    }

    public int getRenderId() {
        if (getRender() != null) {
            return TypeUtils.parseInt(getRender().getRenderId());
        }
        return 0;
    }

    public void sendEvent(String str, @Nullable JSONObject jSONObject, @Nullable SendToRenderCallback sendToRenderCallback) {
        if (getRender() != null) {
            EngineUtils.sendToRender(getRender(), str, jSONObject, sendToRenderCallback);
            return;
        }
        StringBuilder sb = new StringBuilder("sendEvent but render not ready!!! stack: ");
        sb.append(Log.getStackTraceString(new Throwable("Just Print!!!")));
        RVLogger.e(sb.toString());
    }

    public void callBridgeApi(NativeCallContext nativeCallContext, SendToNativeCallback sendToNativeCallback, boolean z) {
        if (a() != null) {
            nativeCallContext.setPluginId(this.b);
            a().getEngineProxy().getBridge().sendToNative(nativeCallContext, sendToNativeCallback, z);
        }
    }
}
