package com.alibaba.ariver.engine;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.annotation.CallSuper;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.ExitCallback;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.bridge.model.LoadParams;
import com.alibaba.ariver.engine.api.common.CommonBackPerform;
import com.alibaba.ariver.engine.api.common.CommonExitPerform;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseRenderImpl implements Render {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f8965a = new AtomicInteger(1);
    private boolean b;
    private CommonBackPerform c;
    protected LoadParams currentLoadParam;
    private CommonExitPerform d;
    private String e;
    private String f;
    private String g = null;
    protected Activity mActivity;
    protected CreateParams mCreateParams;
    protected RVEngine mEngineProxy;
    protected DataNode mNode;

    /* access modifiers changed from: protected */
    public abstract void onDestroy();

    public void setTextSize(int i) {
    }

    public void triggerSaveSnapshot() {
    }

    public BaseRenderImpl(RVEngine rVEngine, Activity activity, DataNode dataNode, CreateParams createParams) {
        this.mEngineProxy = rVEngine;
        this.f = rVEngine.getAppId();
        this.mActivity = activity;
        this.mNode = dataNode;
        this.mCreateParams = createParams;
        StringBuilder sb = new StringBuilder();
        sb.append(f8965a.addAndGet(1));
        this.e = sb.toString();
    }

    public synchronized String getUserAgent() {
        if (this.g == null) {
            WebView webView = new WebView(this.mActivity);
            this.g = webView.getSettings().getUserAgentString();
            StringBuilder sb = new StringBuilder();
            sb.append(this.g);
            sb.append(" ");
            sb.append(EngineUtils.getUserAgentSuffix());
            this.g = sb.toString();
            webView.destroy();
        }
        return this.g;
    }

    /* access modifiers changed from: protected */
    public void setBackPerform(CommonBackPerform commonBackPerform) {
        this.c = commonBackPerform;
    }

    public CommonBackPerform getBackPerform() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public void setExitPerform(CommonExitPerform commonExitPerform) {
        this.d = commonExitPerform;
    }

    public CommonExitPerform getExitPerform() {
        return this.d;
    }

    @CallSuper
    public void load(LoadParams loadParams) {
        RVLogger.d("AriverEngine:BaseRenderImpl", "load ".concat(String.valueOf(loadParams)));
        this.currentLoadParam = loadParams;
    }

    public void reload() {
        load(new LoadParams(this.currentLoadParam));
    }

    public void goBack(GoBackCallback goBackCallback) {
        CommonBackPerform commonBackPerform = this.c;
        if (commonBackPerform != null) {
            commonBackPerform.goBack(goBackCallback);
        } else {
            goBackCallback.afterProcess(false);
        }
    }

    public void runExit(ExitCallback exitCallback) {
        CommonExitPerform commonExitPerform = this.d;
        if (commonExitPerform != null) {
            commonExitPerform.runExit(exitCallback);
        } else {
            exitCallback.afterProcess(false);
        }
    }

    public void onResume() {
        PageContext pageContext;
        List<IEmbedView> findAllEmbedView;
        Page page = (Page) getPage();
        if (page != null && page.getPageContext() != null && (pageContext = page.getPageContext()) != null && pageContext.getEmbedViewManager() != null && (findAllEmbedView = pageContext.getEmbedViewManager().findAllEmbedView()) != null) {
            for (IEmbedView onWebViewResume : findAllEmbedView) {
                onWebViewResume.onWebViewResume();
            }
        }
    }

    public void onPause() {
        PageContext pageContext;
        List<IEmbedView> findAllEmbedView;
        Page page = (Page) getPage();
        if (page != null && page.getPageContext() != null && (pageContext = page.getPageContext()) != null && pageContext.getEmbedViewManager() != null && (findAllEmbedView = pageContext.getEmbedViewManager().findAllEmbedView()) != null) {
            for (IEmbedView onWebViewPause : findAllEmbedView) {
                onWebViewPause.onWebViewPause();
            }
        }
    }

    public Bundle getStartParams() {
        return this.mCreateParams.startParams;
    }

    public String getCurrentUri() {
        LoadParams loadParams = this.currentLoadParam;
        if (loadParams != null) {
            return loadParams.url;
        }
        DataNode page = getPage();
        if (page instanceof Page) {
            return ((Page) page).getOriginalURI();
        }
        return null;
    }

    public final synchronized void destroy() {
        if (!this.b) {
            this.b = true;
            onDestroy();
        }
    }

    public boolean isDestroyed() {
        return this.b;
    }

    public String getAppId() {
        return this.f;
    }

    public RVEngine getEngine() {
        return this.mEngineProxy;
    }

    public DataNode getPage() {
        return this.mNode;
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public String getRenderId() {
        return this.e;
    }

    public boolean hasTriggeredLoad() {
        return this.currentLoadParam != null;
    }
}
