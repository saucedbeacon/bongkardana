package com.alibaba.ariver.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.EmbedType;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.Visit;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.app.api.model.PluginParamModel;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.point.biz.VisitUrlPoint;
import com.alibaba.ariver.app.api.point.page.PageBackPoint;
import com.alibaba.ariver.app.api.point.page.PageDestroyPoint;
import com.alibaba.ariver.app.api.point.page.PageEnterPoint;
import com.alibaba.ariver.app.api.point.page.PageExitInterceptPoint;
import com.alibaba.ariver.app.api.point.page.PageExitPoint;
import com.alibaba.ariver.app.api.point.page.PageHidePoint;
import com.alibaba.ariver.app.api.point.page.PageInitPoint;
import com.alibaba.ariver.app.api.point.page.PagePausePoint;
import com.alibaba.ariver.app.api.point.page.PageResumePoint;
import com.alibaba.ariver.app.api.point.page.PageShowPoint;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.app.proxy.RVScreenOrientationProxy;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.ExitCallback;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.bridge.model.LoadParams;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.bridge.model.URLVisitListener;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.Action;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.snapshot.RVSnapshotUtils;
import com.alibaba.ariver.resource.runtime.ResourceContextManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PageNode extends NodeInstance implements Page {
    public static final Parcelable.Creator<PageNode> CREATOR = new Parcelable.Creator<PageNode>() {
        public final PageNode createFromParcel(Parcel parcel) {
            return new PageNode(parcel);
        }

        public final PageNode[] newArray(int i) {
            return new PageNode[i];
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static String f8947a = "AriverApp:Page";
    private static AtomicInteger b = new AtomicInteger(1);
    private String c;
    private Bundle d;
    private Bundle e;
    private Render f;
    private EmbedType g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    /* access modifiers changed from: private */
    public boolean l;
    private boolean m;
    protected PageContext mPageContext;
    private final List<Page.RenderReadyListener> n;

    /* renamed from: o  reason: collision with root package name */
    private int f8948o;
    /* access modifiers changed from: private */
    public Page.ExitListener p;
    private PageNode q;
    private App r;
    private boolean s;
    private String t;

    /* access modifiers changed from: protected */
    public void onHide() {
    }

    /* access modifiers changed from: protected */
    public void onShow() {
    }

    public PageNode(App app, String str, Bundle bundle, Bundle bundle2) {
        this(app, str, bundle, bundle2, EmbedType.NO);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public PageNode(App app, String str, Bundle bundle, Bundle bundle2, boolean z) {
        this(app, str, bundle, bundle2, z ? EmbedType.FULL : EmbedType.NO);
    }

    public PageNode(App app, String str, Bundle bundle, Bundle bundle2, EmbedType embedType) {
        super((Node) app);
        this.g = EmbedType.NO;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.n = new ArrayList();
        this.s = true;
        this.r = app;
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_PageNode_constructor);
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this, TrackId.Stub_PageCreate);
        this.g = embedType;
        this.s = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ariver_useParentAppWhenParentNull", true);
        init(str, bundle, bundle2);
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this, TrackId.Stub_PageCreated);
        RVTraceUtils.asyncTraceEnd(RVTraceKey.RV_pagePhase_createPage);
        RVTraceUtils.asyncTraceBegin(RVTraceKey.RV_pagePhase_waitEngineInit);
        RVTraceUtils.traceEndSection(RVTraceKey.RV_PageNode_constructor);
    }

    public void setRender(Render render) {
        this.f = render;
    }

    public App getApp() {
        return (App) getParentNode();
    }

    public Node getParentNode() {
        Node parentNode = super.getParentNode();
        if (parentNode != null) {
            return parentNode;
        }
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public Bundle getStartParams() {
        return this.d;
    }

    public Bundle getSceneParams() {
        return this.e;
    }

    public String getPageType() {
        App app = getApp();
        if (app != null) {
            return app.getAppType();
        }
        return null;
    }

    public Render getRender() {
        return this.f;
    }

    public String getPageURI() {
        Visit visit = (Visit) peekChild();
        if (visit != null) {
            return visit.getVisitUrl();
        }
        return this.c;
    }

    public String getOriginalURI() {
        return this.c;
    }

    public void init(String str, Bundle bundle, Bundle bundle2) {
        ResourceContext resourceContext;
        String str2 = f8947a;
        StringBuilder sb = new StringBuilder("init Page with url ");
        sb.append(str);
        sb.append(", startParams: ");
        sb.append(bundle);
        RVLogger.d(str2, sb.toString());
        this.c = str;
        this.d = bundle;
        this.e = bundle2;
        a(str);
        try {
            if (RVSnapshotUtils.isHomePage(this.r, str) && RVSnapshotUtils.isSnapshotEnabled(this.r) && (resourceContext = ResourceContextManager.getInstance().get(this.r.getAppId())) != null) {
                String snapshotTitleBarParams = resourceContext.getSnapshotTitleBarParams();
                if (!TextUtils.isEmpty(snapshotTitleBarParams)) {
                    JSONObject parseObject = JSONObject.parseObject(snapshotTitleBarParams);
                    for (String next : parseObject.keySet()) {
                        this.d.putString(next, parseObject.getString(next));
                    }
                    RVLogger.d(f8947a, "SnapshotProvider set snapshot titleBar success: ".concat(String.valueOf(snapshotTitleBarParams)));
                }
            }
        } catch (Throwable th) {
            RVLogger.e(f8947a, "SnapshotProvider set snapshot titleBar params error: ".concat(String.valueOf(th)));
        }
        this.d.putString("url", str);
        this.f8948o = generatePageId();
        ParamUtils.unifyAll(this.d, true);
        ExtensionPoint.as(PageInitPoint.class).node(this).create().onPageInit(this.c, this.d, this.e);
    }

    private void a(String str) {
        JSONObject jSONObject;
        String hash = UrlUtils.getHash(str);
        if (hash == null) {
            RVLogger.w(f8947a, "not fillParam with empty hash url!");
            return;
        }
        if (hash.startsWith(PluginParamModel.PLUGIN_PAGE_PREFIX)) {
            jSONObject = ((PluginParamModel) getApp().getData(PluginParamModel.class, true)).getStartupParams();
        } else {
            AppConfigModel appConfigModel = (AppConfigModel) getApp().getData(AppConfigModel.class);
            jSONObject = (appConfigModel == null || appConfigModel.getPageLaunchParams() == null) ? null : appConfigModel.getPageLaunchParams();
        }
        if (jSONObject == null) {
            RVLogger.w(f8947a, "not fillParam because empty paramSource!");
            return;
        }
        JSONObject jSONObject2 = JSONUtils.getJSONObject(jSONObject, hash, (JSONObject) null);
        if (jSONObject2 != null) {
            a(jSONObject2);
            String str2 = f8947a;
            StringBuilder sb = new StringBuilder("put page param for ");
            sb.append(hash);
            sb.append(" ");
            sb.append(jSONObject2);
            RVLogger.d(str2, sb.toString());
            this.d.putAll(JSONUtils.toBundle(jSONObject2));
        }
    }

    private void a(JSONObject jSONObject) {
        if (getApp() != null && getApp().isTinyApp() && jSONObject != null && jSONObject.containsKey("usePresetPopmenu")) {
            jSONObject.remove("usePresetPopmenu");
        }
    }

    public void bindContext(PageContext pageContext) {
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_PageNode_bindContext);
        this.mPageContext = pageContext;
        CreateParams createParams = new CreateParams();
        createParams.createUrl = this.c;
        createParams.startParams = getStartParams();
        createParams.useForEmbed = isUseForEmbed();
        createParams.urlVisitListener = new URLVisitListener() {
            public DataNode onVisitStart(String str) {
                RVLogger.d(PageNode.f8947a, "onVisitStart:".concat(String.valueOf(str)));
                VisitNode visitNode = new VisitNode((Page) PageNode.this);
                visitNode.setVisitUrl(str);
                PageNode.this.pushChild(visitNode);
                ((EventTracker) RVProxy.get(EventTracker.class)).stub(visitNode, TrackId.Stub_Visit);
                ExtensionPoint.as(VisitUrlPoint.class).node(PageNode.this).create().onVisit(visitNode);
                return visitNode;
            }
        };
        createParams.containerHeight = AppUtils.getContainerHeight(pageContext);
        createParams.containerWidth = AppUtils.getContainerWidth(pageContext);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        RVEngine engineProxy = getApp().getEngineProxy();
        if (this.f == null) {
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_PageNode_createRender);
            this.f = engineProxy.createRender(pageContext.getActivity(), this, createParams);
            RVTraceUtils.traceEndSection(RVTraceKey.RV_PageNode_createRender);
        }
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_PageNode_initRender);
        initRender(engineProxy);
        a();
        RVTraceUtils.traceEndSection(RVTraceKey.RV_PageNode_initRender);
        this.t = ((RVScreenOrientationProxy) RVProxy.get(RVScreenOrientationProxy.class)).getScreenOrientation(pageContext.getActivity());
        ((EventTracker) RVProxy.get(EventTracker.class)).cost(this, TrackId.Cost_NXView_Create, SystemClock.elapsedRealtime() - elapsedRealtime);
        RVTraceUtils.traceEndSection(RVTraceKey.RV_PageNode_bindContext);
    }

    /* access modifiers changed from: protected */
    public void initRender(RVEngine rVEngine) {
        if (!isUseForEmbed()) {
            this.f.getEngine().getEngineRouter().registerRender(this.f.getRenderId(), this.f);
        }
        this.f.init();
    }

    private void a() {
        synchronized (this.n) {
            this.m = true;
            for (Page.RenderReadyListener onRenderReady : this.n) {
                onRenderReady.onRenderReady();
            }
            this.n.clear();
        }
    }

    @Nullable
    public PageContext getPageContext() {
        return this.mPageContext;
    }

    public final void hide() {
        RVLogger.d(f8947a, "sendToView page event pagePause");
        EngineUtils.sendToRender(getRender(), RVEvents.PAGE_PAUSE, (JSONObject) null, (SendToRenderCallback) null);
        ExtensionPoint.as(PageHidePoint.class).node(this).create().onPageHide(this);
        onHide();
    }

    public final void resume() {
        JSONObject jSONObject;
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_PageNode_resume);
        App.PopParams popParams = (App.PopParams) getApp().getData(App.PopParams.class);
        if (popParams != null) {
            jSONObject = new JSONObject();
            jSONObject.put("data", (Object) popParams.data);
            getApp().setData(App.PopParams.class, null);
        } else {
            jSONObject = null;
        }
        ExtensionPoint.as(PageResumePoint.class).node(this).create().onPageResume(this);
        EngineUtils.sendToRender(getRender(), RVEvents.RESUME, jSONObject, (SendToRenderCallback) null);
        onResume();
        RVTraceUtils.traceEndSection(RVTraceKey.RV_PageNode_resume);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f.onResume();
    }

    public final void show(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
        } else {
            jSONObject2 = null;
        }
        if (!isUseForEmbed()) {
            RVLogger.d(f8947a, "sendToView page event pageResume");
            EngineUtils.sendToRender(getRender(), RVEvents.PAGE_RESUME, jSONObject2, (SendToRenderCallback) null);
        }
        ExtensionPoint.as(PageShowPoint.class).node(this).create().onPageShow(this, (JSONObject) null);
        onShow();
    }

    public final void enter() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this, TrackId.Stub_PageEnter);
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(getApp(), this.c, PerfId.pageStart);
        ExtensionPoint.as(PageEnterPoint.class).node(this).actionOn(ExecutorType.UI).when(new Action.Complete<Void>() {
            public void onComplete(Void voidR) {
                String access$000 = PageNode.f8947a;
                StringBuilder sb = new StringBuilder("page Enter schedule: ");
                sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                RVLogger.d(access$000, sb.toString());
                PageNode.this.onEnter();
            }
        }).create().onPageEnter(this);
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_PageNode_applyStartParam);
        b();
        RVTraceUtils.traceEndSection(RVTraceKey.RV_PageNode_applyStartParam);
    }

    private void b() {
        Bundle startParams = getStartParams();
        if (startParams != null) {
            if (!(getRender() == null || getRender().getView() == null || ParamUtils.isShowTransAnimate(startParams))) {
                getRender().getView().setBackgroundColor(BundleUtils.getInt(startParams, "backgroundColor"));
            }
            if (getRender() != null && getRender().getView() != null && ParamUtils.transparentBackground(startParams)) {
                getRender().getView().setBackgroundColor(BundleUtils.getInt(startParams, "backgroundColor"));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onEnter() {
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_PageNode_onEnter);
        String str = f8947a;
        StringBuilder sb = new StringBuilder("onEnter ");
        sb.append(this.c);
        RVLogger.d(str, sb.toString());
        LoadParams loadParams = new LoadParams();
        loadParams.url = this.c;
        loadParams.isFirstLoad = true;
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this, TrackId.Stub_LoadUrl);
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(getApp(), this.c, PerfId.loadUrl);
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this, TrackId.Stub_FirstRequest);
        if (!RVStartParams.START_SCENE_CREATE_PAGE.equals(BundleUtils.getString(getStartParams(), RVStartParams.KEY_START_SCENE)) || !this.f.hasTriggeredLoad()) {
            this.f.load(loadParams);
            RVTraceUtils.traceEndSection(RVTraceKey.RV_PageNode_onEnter);
            return;
        }
        RVTraceUtils.traceEndSection(RVTraceKey.RV_PageNode_onEnter);
    }

    public void setExitListener(Page.ExitListener exitListener) {
        this.p = exitListener;
    }

    public int getPageId() {
        return this.f8948o;
    }

    public void setPageId(int i2) {
        this.f8948o = i2;
    }

    public int generatePageId() {
        return b.addAndGet(1);
    }

    public boolean isExited() {
        return this.i;
    }

    public boolean isShadowNode() {
        return this.j;
    }

    public boolean isPageLoaded() {
        return this.k;
    }

    public void setPageLoaded() {
        this.k = true;
    }

    public final synchronized void exit(final boolean z) {
        if (this.i) {
            RVLogger.w(f8947a, "already exited!");
        } else if (this.j) {
            RVLogger.w(f8947a, "exit with shadowNode!");
            Bundle bundle = new Bundle();
            bundle.putLong(IpcMessageConstants.EXTRA_PAGE_NODE_ID, getNodeId());
            IpcServerUtils.sendMsgToClient(getApp().getAppId(), getApp().getStartToken(), 10, bundle);
        } else {
            ExtensionPoint.as(PageExitInterceptPoint.class).node(this).resolve(ResultResolver.POSITIVE_RESOLVER).when(new Action.Complete<Boolean>() {
                public void onComplete(Boolean bool) {
                    if (bool == null || !bool.booleanValue()) {
                        PageNode.this.a(z);
                    } else {
                        RVLogger.d(PageNode.f8947a, "PageExit intercept by extension point.");
                    }
                }
            }).create().interceptPageExit(this);
        }
    }

    /* access modifiers changed from: private */
    public void a(final boolean z) {
        String str = f8947a;
        StringBuilder sb = new StringBuilder("exit ");
        sb.append(toString());
        sb.append(" by stack ");
        sb.append(Log.getStackTraceString(new Throwable("Just Print")));
        RVLogger.d(str, sb.toString());
        this.i = true;
        if ("yes".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_appContextPerExitPage", "no"))) {
            RVLogger.d(f8947a, "run Exit per exit page.");
            AppContext appContext = getApp().getAppContext();
            if (appContext != null) {
                appContext.exitPage(this, z);
            }
        }
        Render render = this.f;
        if (render != null) {
            render.runExit(new ExitCallback() {
                public void afterProcess(boolean z) {
                    PageNode.this.b(z);
                }
            });
        } else {
            b(z);
        }
    }

    /* access modifiers changed from: private */
    public void b(final boolean z) {
        String str = f8947a;
        StringBuilder sb = new StringBuilder("PageNode ");
        sb.append(this);
        sb.append(" doExit!");
        RVLogger.d(str, sb.toString());
        PageContext pageContext = this.mPageContext;
        if (!(pageContext == null || pageContext.getActivity() == null)) {
            if (!TextUtils.equals(this.t, ((RVScreenOrientationProxy) RVProxy.get(RVScreenOrientationProxy.class)).getScreenOrientation(this.mPageContext.getActivity()))) {
                ((RVScreenOrientationProxy) RVProxy.get(RVScreenOrientationProxy.class)).setScreenOrientation(this.mPageContext.getActivity(), this.t, this);
            }
        }
        ExtensionPoint.as(PageExitPoint.class).node(this).actionOn(ExecutorType.UI).when(new Action.Complete<Void>() {
            public void onComplete(Void voidR) {
                String access$000 = PageNode.f8947a;
                StringBuilder sb = new StringBuilder("PageNode ");
                sb.append(PageNode.this);
                sb.append(" doExit onComplete");
                RVLogger.d(access$000, sb.toString());
                if (PageNode.this.isUseForEmbed()) {
                    PageNode.this.destroy();
                    PageNode.this.onFinalized();
                    return;
                }
                if (PageNode.this.getApp() != null) {
                    PageNode.this.getApp().removePage(PageNode.this, z);
                }
                if (PageNode.this.p != null) {
                    PageNode.this.p.onExit();
                }
            }
        }).create().onPageExit(this);
    }

    public boolean backPressed() {
        Render render;
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this, TrackId.Stub_BACK_PRESSED);
        PageContext pageContext = this.mPageContext;
        if ((pageContext == null || pageContext.getLoadingView() == null || !this.mPageContext.getLoadingView().backPressed()) && (render = this.f) != null) {
            render.goBack(new GoBackCallback() {
                public void afterProcess(final boolean z) {
                    ExecutorUtils.runOnMain(new Runnable() {
                        public void run() {
                            if (PageNode.this.getApp() == null) {
                                RVLogger.d(PageNode.f8947a, "goBack afterProcess but app is null!");
                                return;
                            }
                            boolean booleanValue = PageNode.this.getApp().getBooleanValue(RVConstants.EXTRA_RECEIVED_PREPARE_FINISH);
                            String access$000 = PageNode.f8947a;
                            StringBuilder sb = new StringBuilder("goBack afterProcess intercept: ");
                            sb.append(z);
                            sb.append(", receivedPrepareFinish: ");
                            sb.append(booleanValue);
                            RVLogger.d(access$000, sb.toString());
                            if (!z && booleanValue) {
                                AppContext appContext = PageNode.this.getApp().getAppContext();
                                if (PageNode.this.getApp().getChildCount() == 1 && appContext != null && appContext.getContext() != null && appContext.isTaskRoot() && appContext.moveToBackground()) {
                                    RVLogger.d(PageNode.f8947a, "goBack keep alive intercept");
                                    return;
                                }
                            }
                            if (!z && !PageNode.this.l) {
                                PageNode.this.performBack();
                            }
                        }
                    });
                }
            });
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public synchronized void performBack() {
        this.l = true;
        ExtensionPoint.as(PageBackPoint.class).node(this).create().onBackPerformed(this);
        getApp().performBack();
    }

    public Class<? extends Scope> getScopeType() {
        return Page.class;
    }

    public final void pause() {
        ExtensionPoint.as(PagePausePoint.class).node(this).create().onPagePause(this);
        EngineUtils.sendToRender(getRender(), RVEvents.PAUSE, (JSONObject) null, (SendToRenderCallback) null);
        onPause();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        RVLogger.d(f8947a, "onPause");
        this.f.onPause();
    }

    public boolean isDestroyed() {
        return this.h;
    }

    public final void destroy() {
        if (!this.h) {
            if (this.j) {
                RVLogger.w(f8947a, "destroy with shadowNode!");
                Bundle bundle = new Bundle();
                bundle.putLong(IpcMessageConstants.EXTRA_PAGE_NODE_ID, getNodeId());
                IpcServerUtils.sendMsgToClient(getApp().getAppId(), getApp().getStartToken(), 10, bundle);
                return;
            }
            this.h = true;
            if (!(this.f == null || getApp().getEngineProxy() == null)) {
                getApp().getEngineProxy().getEngineRouter().unRegisterRender(this.f.getRenderId());
            }
            ExtensionPoint.as(PageDestroyPoint.class).node(this).create().onPageDestroy(this);
            EngineUtils.sendToRender(getRender(), RVEvents.BEFORE_UNLOAD, (JSONObject) null, (SendToRenderCallback) null);
            EngineUtils.sendToRender(getRender(), RVEvents.BEFORE_DESTROY, (JSONObject) null, (SendToRenderCallback) null);
            Render render = this.f;
            if (render != null) {
                render.destroy();
            }
            PageContext pageContext = this.mPageContext;
            if (pageContext != null) {
                pageContext.destroy();
            }
            onDestroy();
            onFinalized();
        }
    }

    public boolean isRenderReady() {
        boolean z;
        synchronized (this.n) {
            z = this.m;
        }
        return z;
    }

    public void addRenderReadyListener(Page.RenderReadyListener renderReadyListener) {
        synchronized (this.n) {
            if (this.m) {
                renderReadyListener.onRenderReady();
            }
            this.n.add(renderReadyListener);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.mPageContext = null;
    }

    public EmbedType getEmbedType() {
        return this.g;
    }

    public boolean isUseForEmbed() {
        return this.g == EmbedType.FULL || this.g == EmbedType.MINI;
    }

    public ExtensionManager getExtensionManager() {
        return sExtensionManager;
    }

    public String toString() {
        int hashCode = hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AUScreenAdaptTool.PREFIX_ID);
        sb.append(hashCode);
        sb.append("@uri=");
        sb.append(getPageURI());
        String obj = sb.toString();
        if (!this.j) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("@Shadow");
        return sb2.toString();
    }

    public PageNode(Parcel parcel) {
        super(parcel);
        this.g = EmbedType.NO;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.n = new ArrayList();
        this.s = true;
        this.c = parcel.readString();
        this.d = parcel.readBundle(Page.class.getClassLoader());
        this.e = parcel.readBundle(Page.class.getClassLoader());
        this.g = EmbedType.parse(parcel.readInt());
        this.j = true;
    }

    public synchronized void onFinalized() {
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).onFinalized();
            }
        }
        super.onFinalized();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.c);
        parcel.writeBundle(this.d);
        parcel.writeBundle(this.e);
        parcel.writeInt(this.g.getTypeValue());
    }

    public PageNode getEmbedPage() {
        return this.q;
    }

    public void setEmbedPage(PageNode pageNode) {
        this.q = pageNode;
    }

    public void setPageURI(String str) {
        this.c = str;
    }
}
