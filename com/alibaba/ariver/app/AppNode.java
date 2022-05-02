package com.alibaba.ariver.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.AppLoadResult;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.AppRestartResult;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.monitor.RVMonitor;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppExitPoint;
import com.alibaba.ariver.app.api.point.app.AppInteractionPoint;
import com.alibaba.ariver.app.api.point.app.AppLeaveHintPoint;
import com.alibaba.ariver.app.api.point.app.AppLoadPoint;
import com.alibaba.ariver.app.api.point.app.AppOnConfigurationChangedPoint;
import com.alibaba.ariver.app.api.point.app.AppOnLoadResultPoint;
import com.alibaba.ariver.app.api.point.app.AppPausePoint;
import com.alibaba.ariver.app.api.point.app.AppRestartPoint;
import com.alibaba.ariver.app.api.point.app.AppResumePoint;
import com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint;
import com.alibaba.ariver.app.api.point.page.PagePushInterceptPoint;
import com.alibaba.ariver.app.api.ui.DialogService;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.app.ipc.IpcClientUtils;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.app.proxy.RVPageFactory;
import com.alibaba.ariver.engine.api.EngineFactory;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.bridge.model.EngineInitCallback;
import com.alibaba.ariver.engine.api.bridge.model.EngineSetupCallback;
import com.alibaba.ariver.engine.api.bridge.model.InitParams;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.Action;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.monitor.ErrId;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.immutable.ImmutableBundle;
import com.alibaba.ariver.kernel.common.log.AppLog;
import com.alibaba.ariver.kernel.common.log.AppLogContext;
import com.alibaba.ariver.kernel.common.log.AppLogUtils;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.log.PageSource;
import com.alibaba.ariver.kernel.common.network.NetworkUtil;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.PatternUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.kernel.ipc.IpcMessageHandler;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AppNode extends NodeInstance implements App {
    public static final Parcelable.Creator<AppNode> CREATOR = new Parcelable.Creator<AppNode>() {
        public final AppNode createFromParcel(Parcel parcel) {
            return new AppNode(parcel);
        }

        public final AppNode[] newArray(int i) {
            return new AppNode[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f8943a;
    protected String appId;
    private Callable<Boolean> b = null;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private Object f = new Object();
    private boolean g = false;
    private boolean h = false;
    private boolean i = true;
    /* access modifiers changed from: private */
    public String j;
    private PageNode k;
    private boolean l = false;
    private AtomicInteger m = new AtomicInteger(2);
    protected AppContext mAppContext;
    protected AppManager mAppManager;
    protected String mAppType;
    protected String mAppVersion;
    protected ImmutableBundle mImmutableStartParams;
    protected Bundle mSceneParams;
    protected Bundle mStartParams;
    protected long mStartToken;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private RVEngine f8944o;
    /* access modifiers changed from: private */
    public AtomicBoolean p = new AtomicBoolean(false);
    private IpcMessageHandler q;
    private Object r = new Object();
    /* access modifiers changed from: private */
    public boolean s = false;
    private final List<App.PageReadyListener> t = new ArrayList();
    private NetworkUtil.NetworkListener u;

    public AppNode(AppManager appManager) {
        super((Node) appManager);
        this.mAppManager = appManager;
        this.q = createAppMsgReceiver();
    }

    /* access modifiers changed from: protected */
    public AppMsgReceiver createAppMsgReceiver() {
        return new AppMsgReceiver(this);
    }

    public IpcMessageHandler getMsgHandler() {
        return this.q;
    }

    public SplashView getSplashView() {
        AppContext appContext = this.mAppContext;
        if (appContext != null) {
            return appContext.getSplashView();
        }
        return null;
    }

    public RVEngine getEngineProxy() {
        return this.f8944o;
    }

    public long getStartToken() {
        return this.mStartToken;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(com.alibaba.ariver.kernel.common.utils.RVTraceKey.RV_AppNode_bindContext);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        throw r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bindContext(com.alibaba.ariver.app.api.AppContext r3) {
        /*
            r2 = this;
            java.lang.String r0 = "RV_AppNode_bindContext"
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r0)
            java.lang.String r0 = "AriverApp:App"
            java.lang.String r1 = "bindContext....."
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)     // Catch:{ all -> 0x004c }
            r2.mAppContext = r3     // Catch:{ all -> 0x004c }
            com.alibaba.ariver.app.ipc.ClientMsgReceiver r3 = com.alibaba.ariver.app.ipc.ClientMsgReceiver.getInstance()     // Catch:{ all -> 0x004c }
            r3.registerAppHandler(r2)     // Catch:{ all -> 0x004c }
            boolean r3 = r2.isExited()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0028
            java.lang.String r3 = "AriverApp:App"
            java.lang.String r0 = "bindContext but already exit in AppMsgReceiver!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r3, r0)     // Catch:{ all -> 0x004c }
        L_0x0022:
            java.lang.String r3 = "RV_AppNode_bindContext"
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r3)
            return
        L_0x0028:
            r2.a()     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "RV_AppNode_bindContext_trySetProxyAndStart"
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r3)     // Catch:{ all -> 0x004c }
            java.lang.Object r3 = r2.r     // Catch:{ all -> 0x004c }
            monitor-enter(r3)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r2.mAppType     // Catch:{ all -> 0x0049 }
            r2.a((java.lang.String) r0)     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "AriverApp:App"
            java.lang.String r0 = "bindContext ready, try trigger onStart!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r0)     // Catch:{ all -> 0x004c }
            r2.c()     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "RV_AppNode_bindContext_trySetProxyAndStart"
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r3)     // Catch:{ all -> 0x004c }
            goto L_0x0022
        L_0x0049:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r3 = move-exception
            java.lang.String r0 = "RV_AppNode_bindContext"
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r0)
            goto L_0x0054
        L_0x0053:
            throw r3
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.AppNode.bindContext(com.alibaba.ariver.app.api.AppContext):void");
    }

    private void a() {
        JSONArray jSONArray;
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        if (rVConfigService != null && (jSONArray = JSONUtils.getJSONArray(rVConfigService.getConfigJSONObject("h5_jsapiandPluginsConfig"), "extensions", (JSONArray) null)) != null) {
            getExtensionManager().getExtensionRegistry().unRegister(Arrays.asList(jSONArray.toArray(new String[0])));
        }
    }

    public void preCreateInit(String str, Bundle bundle, Bundle bundle2) {
        this.appId = str;
        this.mStartParams = bundle;
        this.mSceneParams = bundle2;
        this.mStartToken = BundleUtils.getLong(bundle2, RVConstants.EXTRA_START_TOKEN, 0);
        this.mImmutableStartParams = new ImmutableBundle(this.mStartParams);
        this.mAppType = bundle2.getString("appType", "WEB_TINY");
        ParamUtils.unifyAll(this.mStartParams, false);
        EntryInfo entryInfo = (EntryInfo) BundleUtils.getParcelable(this.mSceneParams, RVConstants.EXTRA_ENTRY_INFO);
        if (entryInfo != null) {
            setData(EntryInfo.class, entryInfo);
        }
    }

    public void init(String str, Bundle bundle, Bundle bundle2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-2035102244, oncanceled);
            onCancelLoad.getMin(-2035102244, oncanceled);
        }
        this.appId = str;
        this.mStartParams = bundle;
        this.mSceneParams = bundle2;
        this.mStartToken = BundleUtils.getLong(bundle2, RVConstants.EXTRA_START_TOKEN, 0);
        this.mImmutableStartParams = new ImmutableBundle(this.mStartParams);
        this.mAppType = bundle2.getString("appType", "WEB_TINY");
        ParamUtils.unifyAll(this.mStartParams, false);
        EntryInfo entryInfo = (EntryInfo) BundleUtils.getParcelable(this.mSceneParams, RVConstants.EXTRA_ENTRY_INFO);
        if (entryInfo != null) {
            setData(EntryInfo.class, entryInfo);
        }
        StringBuilder sb = new StringBuilder("init with appType: ");
        sb.append(this.mAppType);
        RVLogger.d("AriverApp:App", sb.toString());
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this, TrackId.Stub_AppInit);
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).init("RV_APP_STARTUP", str, Long.valueOf(this.mStartToken), getStartUrl());
        this.l = true;
    }

    public final void restartFromServer(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("startParams", bundle);
        IpcClientUtils.sendMsgToServerByApp(this, 8, bundle2);
    }

    public final void restart(final Bundle bundle, final Bundle bundle2) {
        String str;
        if (this.h) {
            RVLogger.w("AriverApp:App", "restart with shadowNode not work!");
        } else if (this.s) {
            RVLogger.w("AriverApp:App", "cannot restart during restarting");
        } else {
            ParamUtils.unify(bundle, "url", false);
            String string = BundleUtils.getString(bundle, "url");
            if (!isTinyApp()) {
                if (TextUtils.isEmpty(string)) {
                    RVLogger.d("AriverApp:App", "not restart because of url == null in h5");
                    return;
                }
                ParamUtils.unify(bundle, RVParams.LONG_CAN_DESTROY, false);
                if (!BundleUtils.getBoolean(bundle, RVParams.LONG_CAN_DESTROY, true)) {
                    RVLogger.d("AriverApp:App", "not restart because of canDestroy == false in h5");
                    return;
                }
            }
            this.s = true;
            this.i = true;
            this.f8943a = BundleUtils.getString(bundle, RVParams.START_APP_SESSION_ID);
            AppLog.Builder appId2 = ((AppLog.Builder) new AppLog.Builder().setState(AppLog.APP_LOG_CONTAINER_AWAKE)).setAppId(this.appId);
            if (bundle == null) {
                str = "";
            } else {
                str = bundle.toString();
            }
            AppLogger.log(((AppLog.Builder) appId2.setDesc(str).setParentId(this.f8943a)).build());
            AppRestartResult appRestartResult = new AppRestartResult();
            appRestartResult.startUrl = string;
            appRestartResult.closeAllWindow = false;
            appRestartResult.canRestart = true;
            appRestartResult.startParam = bundle;
            try {
                this.mStartParams.putBundle(RVStartParams.KEY_RESTART_START_PARAMS, bundle);
            } catch (Exception e2) {
                RVLogger.w("AriverApp:App", "putParams restart start params error!", e2);
            }
            ExtensionPoint.as(AppRestartPoint.class).node(this).defaultValue(appRestartResult).when(new Action.Complete<AppRestartResult>() {
                public void onComplete(AppRestartResult appRestartResult) {
                    RVLogger.d("AriverApp:App", "restart with ".concat(String.valueOf(appRestartResult)));
                    if (appRestartResult == null || !appRestartResult.canRestart) {
                        AppNode.this.onRestart(appRestartResult, bundle, bundle2);
                        boolean unused = AppNode.this.s = false;
                        return;
                    }
                    AppNode.this.onRestart(appRestartResult, appRestartResult.startParam, bundle2);
                }
            }).create().onAppRestart(this, bundle, bundle2);
        }
    }

    public boolean isTinyApp() {
        return "WEB_TINY".equalsIgnoreCase(getAppType());
    }

    /* access modifiers changed from: protected */
    public void onRestart(final AppRestartResult appRestartResult, Bundle bundle, Bundle bundle2) {
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppNode_onRestart);
        RVLogger.d("AriverApp:App", "onRestart with ".concat(String.valueOf(appRestartResult)));
        if (getAppContext() != null) {
            try {
                this.mStartParams.putString("url", appRestartResult.startUrl);
                if (bundle != null) {
                    this.mStartParams.putAll(bundle);
                }
                this.mStartParams.putString("enablePolyfillWorker", SummaryActivity.CHECKED);
                if (bundle2 != null) {
                    this.mSceneParams.putAll(bundle2);
                }
                this.mImmutableStartParams = new ImmutableBundle(appRestartResult.startParam);
                this.d = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.putAll(BundleUtils.toJSONObject(bundle));
                if (appRestartResult.canRestart) {
                    jSONObject.put("shouldNotReLaunch", (Object) Boolean.TRUE);
                }
                jSONObject.put("isAliveStartup", (Object) Boolean.TRUE);
                RVLogger.d("AriverApp:App", "send appResume with data: ".concat(String.valueOf(jSONObject)));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", (Object) jSONObject);
                jSONObject2.put("isAliveStartup", (Object) Boolean.TRUE);
                AppUtils.sendToApp(this, RVEvents.APP_RESUME, jSONObject2, new SendToRenderCallback() {
                    public void onCallBack(JSONObject jSONObject) {
                        if (!appRestartResult.canRestart || !AppNode.this.isTinyApp()) {
                            boolean unused = AppNode.this.s = false;
                            return;
                        }
                        if (jSONObject != null) {
                            RVLogger.d("AriverApp:App", "resume onCallback: ".concat(String.valueOf(jSONObject)));
                        }
                        ExecutorUtils.runOnMain(new Runnable() {
                            public void run() {
                                String str = appRestartResult.startUrl;
                                Bundle clone = BundleUtils.clone(AppNode.this.getStartParams());
                                clone.putString(RVStartParams.KEY_FROM_TYPE, RVStartParams.FROM_TYPE_PUSH_RELAUNCH);
                                Bundle clone2 = BundleUtils.clone(AppNode.this.getSceneParams());
                                if (appRestartResult.closeAllWindow) {
                                    AppNode.this.relaunchToUrl(str, clone, clone2);
                                } else {
                                    AppNode.this.pushPage(str, clone, clone2);
                                }
                                boolean unused = AppNode.this.s = false;
                            }
                        });
                    }
                });
                if (!isTinyApp()) {
                    relaunchToUrl(appRestartResult.startUrl, bundle, bundle2);
                } else {
                    RVTraceUtils.traceEndSection(RVTraceKey.RV_AppNode_onRestart);
                }
            } catch (Throwable th) {
                RVLogger.w("AriverApp:App", "putParams error! not restart", th);
            }
        }
    }

    public void relaunchToUrl(String str, Bundle bundle, Bundle bundle2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-86028440, oncanceled);
            onCancelLoad.getMin(-86028440, oncanceled);
        }
        if (this.h) {
            RVLogger.w("AriverApp:App", "relaunchToUrl with shadowNode not work!");
        } else if (isExited()) {
            RVLogger.w("AriverApp:App", "relaunchToUrl failed because already exited!");
        } else {
            StringBuilder sb = new StringBuilder("relaunchToUrl ");
            sb.append(str);
            sb.append(" with stack: ");
            sb.append(Log.getStackTraceString(new Throwable("Just Print")));
            RVLogger.d("AriverApp:App", sb.toString());
            if (getActivePage() != null) {
                String pageURI = getActivePage().getPageURI();
                if (str.startsWith("#")) {
                    int indexOf = pageURI.indexOf(35);
                    if (indexOf != -1) {
                        String substring = pageURI.substring(0, indexOf);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(substring);
                        sb2.append(str);
                        str = sb2.toString();
                    }
                } else if (isTinyApp() || TextUtils.isEmpty(str) || !str.startsWith("/")) {
                    str = UrlUtils.mergeUrl(pageURI, str);
                } else {
                    AppModel appModel = (AppModel) getData(AppModel.class);
                    if (appModel != null) {
                        str = FileUtils.combinePath(appModel.getAppInfoModel().getVhost(), str);
                    }
                }
            }
            a(false);
            pushPage(str, bundle, bundle2);
            this.s = false;
        }
    }

    private void a(boolean z) {
        RVLogger.w("AriverApp:App", "exitAllPages: ".concat(String.valueOf(z)));
        int i2 = 0;
        if (getAppContext() == null || getAppContext().getTabBar() == null) {
            int childCount = getChildCount();
            ArrayList<Page> arrayList = new ArrayList<>();
            while (i2 < childCount) {
                Page pageByIndex = getPageByIndex(i2);
                ((Page.AnimStore) pageByIndex.getData(Page.AnimStore.class, true)).disableExit = true;
                arrayList.add(pageByIndex);
                i2++;
            }
            for (Page exit : arrayList) {
                exit.exit(z);
            }
            return;
        }
        TabBar tabBar = getAppContext().getTabBar();
        int childCount2 = getChildCount();
        ArrayList<Page> arrayList2 = new ArrayList<>();
        while (i2 < childCount2) {
            Page pageByIndex2 = getPageByIndex(i2);
            ((Page.AnimStore) pageByIndex2.getData(Page.AnimStore.class, true)).disableExit = true;
            if (!tabBar.isTabPage(pageByIndex2)) {
                arrayList2.add(pageByIndex2);
            }
            i2++;
        }
        for (Page exit2 : arrayList2) {
            exit2.exit(z);
        }
        getAppContext().getTabBar().reset();
    }

    public String getAppType() {
        return this.mAppType;
    }

    public void setAppType(String str) {
        this.mAppType = str;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getAppId() {
        return this.appId;
    }

    public ImmutableBundle getOriginalStartParams() {
        return this.mImmutableStartParams;
    }

    public AppManager getAppManager() {
        return this.mAppManager;
    }

    public Bundle getStartParams() {
        return this.mStartParams;
    }

    public Bundle getSceneParams() {
        return this.mSceneParams;
    }

    public Page getPageByNodeId(long j2) {
        return (Page) getChild(j2);
    }

    public void addPageReadyListener(App.PageReadyListener pageReadyListener) {
        synchronized (this.t) {
            RVLogger.d("AriverApp:App", "addPageReadyListener");
            Page activePage = getActivePage();
            if (activePage != null) {
                pageReadyListener.onPageReady(activePage);
            } else {
                this.t.add(pageReadyListener);
            }
        }
    }

    public Page getPageByIndex(int i2) {
        return (Page) getChildAt(i2);
    }

    public Page preCreatePage() {
        PageNode createPage = ((RVPageFactory) RVProxy.get(RVPageFactory.class)).createPage(this, this.j, BundleUtils.clone(this.mStartParams), BundleUtils.clone(this.mSceneParams));
        this.k = createPage;
        return createPage;
    }

    public Page getActivePage() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            Page pageByIndex = getPageByIndex(childCount);
            if (!pageByIndex.isUseForEmbed() && !pageByIndex.isExited()) {
                return pageByIndex;
            }
        }
        return null;
    }

    public int getAlivePageCount() {
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            if (getPageByIndex(i2).isExited()) {
                childCount--;
            }
        }
        return childCount;
    }

    public AppContext getAppContext() {
        return this.mAppContext;
    }

    public void setEngineProxy(RVEngine rVEngine) {
        this.f8944o = rVEngine;
    }

    private void a(String str) {
        if (this.f8944o == null || !TextUtils.equals(str, this.mAppType)) {
            RVLogger.d("AriverApp:App", "trySetupEngineProxy with appType: ".concat(String.valueOf(str)));
            String engineType = ((EngineFactory) RVProxy.get(EngineFactory.class)).getEngineType(str);
            putStringValue(RVParams.APP_ENGINE_TYPE, engineType);
            if (this.mAppContext == null) {
                RVLogger.d("AriverApp:App", "trySetupEngineProxy cannot init without appContext!");
                return;
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            RVEngine createEngine = ((EngineFactory) RVProxy.get(EngineFactory.class)).createEngine(engineType, this, this.appId);
            this.f8944o = createEngine;
            if (!createEngine.isReady() && getSplashView() != null) {
                RVLogger.d("AriverApp:App", "showLoading because engine not ready");
                getSplashView().showLoading((EntryInfo) getData(EntryInfo.class, false));
            }
            this.f8944o.setup(this.mStartParams, this.mSceneParams, new EngineSetupCallback() {
                public void setupResult(boolean z, String str) {
                    if (z) {
                        StringBuilder sb = new StringBuilder("onSetupFinish, cost=");
                        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        RVLogger.d("AriverApp:App", sb.toString());
                        ((EventTracker) RVProxy.get(EventTracker.class)).stub(AppNode.this, TrackId.Stub_EngineSetup);
                        return;
                    }
                    RVLogger.d("AriverApp:App", "onSetupFail, msg=".concat(String.valueOf(str)));
                }
            });
            return;
        }
        RVLogger.d("AriverApp:App", "trySetupEngineProxy already setup with ".concat(String.valueOf(str)));
    }

    public final void start() {
        synchronized (this.f) {
            if (this.e) {
                RVLogger.d("AriverApp:App", "try start but mAlreadyStarted true!");
                return;
            }
            this.e = true;
            b();
        }
    }

    private synchronized void b() {
        String str;
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppNode_start);
        AppLog.Builder appId2 = new AppLog.Builder().setAppId(this.appId);
        if (this.mStartParams == null) {
            str = "";
        } else {
            str = this.mStartParams.toString();
        }
        AppLogger.log(((AppLog.Builder) ((AppLog.Builder) appId2.setDesc(str).setParentId(BundleUtils.getString(this.mStartParams, RVParams.START_APP_SESSION_ID))).setState(AppLog.APP_LOG_CONTAINER_START)).build());
        StringBuilder sb = new StringBuilder("start ");
        sb.append(this.appId);
        RVLogger.d("AriverApp:App", sb.toString());
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        ExtensionPoint.as(AppLoadPoint.class).node(this).create().loadApp(this.appId, getStartParams(), getSceneParams(), new AppLoadPoint.LoadResultCallback() {
            public void onResult(AppLoadResult appLoadResult) {
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppNode_AppLoadPointOnResult);
                StringBuilder sb = new StringBuilder("loadApp onResult ");
                sb.append(AppNode.this.appId);
                sb.append(" result ");
                sb.append(appLoadResult);
                sb.append(" cost ");
                sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                RVLogger.d("AriverApp:App", sb.toString());
                ExtensionPoint.as(AppOnLoadResultPoint.class).node(AppNode.this).create().onLoadResult(AppNode.this, appLoadResult);
                AppNode.this.a(appLoadResult, elapsedRealtime);
                RVTraceUtils.traceEndSection(RVTraceKey.RV_AppNode_AppLoadPointOnResult);
            }
        });
        AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setAppId(this.appId).setParentId(BundleUtils.getString(this.mStartParams, RVParams.START_APP_SESSION_ID))).setState(AppLog.APP_LOG_CONTAINER_FINISH)).build());
        RVTraceUtils.traceEndSection(RVTraceKey.RV_AppNode_start);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(com.alibaba.ariver.kernel.common.utils.RVTraceKey.RV_AppNode_onLoadResult);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.alibaba.ariver.app.api.AppLoadResult r5, long r6) {
        /*
            r4 = this;
            java.lang.String r0 = "RV_AppNode_onLoadResult"
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r0)     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r4.r     // Catch:{ all -> 0x0071 }
            monitor-enter(r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r5.appType     // Catch:{ all -> 0x006e }
            java.lang.String r2 = r4.mAppType     // Catch:{ all -> 0x006e }
            boolean r1 = android.text.TextUtils.equals(r1, r2)     // Catch:{ all -> 0x006e }
            if (r1 != 0) goto L_0x0019
            r1 = 0
            r4.f8944o = r1     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r5.appType     // Catch:{ all -> 0x006e }
            r4.mAppType = r1     // Catch:{ all -> 0x006e }
        L_0x0019:
            java.lang.String r1 = r5.appType     // Catch:{ all -> 0x006e }
            r4.a((java.lang.String) r1)     // Catch:{ all -> 0x006e }
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r5.mainJsUrl     // Catch:{ all -> 0x0071 }
            r4.n = r0     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r5.mainHtmlUrl     // Catch:{ all -> 0x0071 }
            r4.j = r0     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r5.appVersion     // Catch:{ all -> 0x0071 }
            r4.mAppVersion = r0     // Catch:{ all -> 0x0071 }
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r0 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ all -> 0x0071 }
            com.alibaba.ariver.kernel.api.track.EventTracker r0 = (com.alibaba.ariver.kernel.api.track.EventTracker) r0     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "PkgLoad"
            r0.stub(r4, r1)     // Catch:{ all -> 0x0071 }
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r0 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ all -> 0x0071 }
            com.alibaba.ariver.kernel.api.track.EventTracker r0 = (com.alibaba.ariver.kernel.api.track.EventTracker) r0     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "PkgLoad"
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0071 }
            long r2 = r2 - r6
            r0.cost(r4, r1, r2)     // Catch:{ all -> 0x0071 }
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.p     // Catch:{ all -> 0x0071 }
            boolean r6 = r6.get()     // Catch:{ all -> 0x0071 }
            if (r6 == 0) goto L_0x005f
            java.lang.String r5 = "AriverApp:App"
            java.lang.String r6 = "app has been destroyed!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r5, r6)     // Catch:{ all -> 0x0071 }
        L_0x0059:
            java.lang.String r5 = "RV_AppNode_onLoadResult"
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r5)
            return
        L_0x005f:
            java.util.concurrent.Callable<java.lang.Boolean> r5 = r5.waitLoadFuture     // Catch:{ all -> 0x0071 }
            r4.b = r5     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = "AriverApp:App"
            java.lang.String r6 = "onLoadResult ready, try trigger onStart!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r5, r6)     // Catch:{ all -> 0x0071 }
            r4.c()     // Catch:{ all -> 0x0071 }
            goto L_0x0059
        L_0x006e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            java.lang.String r6 = "RV_AppNode_onLoadResult"
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r6)
            goto L_0x0079
        L_0x0078:
            throw r5
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.AppNode.a(com.alibaba.ariver.app.api.AppLoadResult, long):void");
    }

    /* access modifiers changed from: protected */
    public void preProcessStartParams() {
        AppModel appModel = (AppModel) BundleUtils.getParcelable(getSceneParams(), "appInfo");
        if (getStartParams().containsKey("backBehavior")) {
            return;
        }
        if (appModel != null) {
            getStartParams().putString("backBehavior", RVStartParams.BACK_BEHAVIOR_POP);
        } else {
            getStartParams().putString("backBehavior", "back");
        }
    }

    private void c() {
        if (this.m.decrementAndGet() <= 0) {
            onStart();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        RVEngine rVEngine = this.f8944o;
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppNode_onStart);
        StringBuilder sb = new StringBuilder("onStart:");
        sb.append(this.j);
        RVLogger.d("AriverApp:App", sb.toString());
        preProcessStartParams();
        InitParams initParams = new InitParams();
        initParams.mainResourceUrl = this.n;
        initParams.startParams = this.mStartParams;
        ((EventTracker) RVProxy.get(EventTracker.class)).stub(this, TrackId.Stub_AppStart);
        RVTraceUtils.asyncTraceEnd(RVTraceKey.RV_appPhase_waitLoadApp);
        RVTraceUtils.asyncTraceBegin(RVTraceKey.RV_pagePhase_createPage);
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(this, getStartUrl(), PerfId.appStart);
        this.mStartParams.putString("enablePolyfillWorker", SummaryActivity.CHECKED);
        this.mStartParams.putBoolean(RVStartParams.KEY_DISCARD_CAN_RENDER, true);
        RVLogger.printPerformanceLog("App", "End create app");
        if (rVEngine == null || rVEngine.isDestroyed()) {
            RVLogger.e("AriverApp:App", "engine is null or isDestroyed!");
            return;
        }
        final PageNode pageNode = null;
        boolean equals = TextUtils.equals(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("ta_disable_pre_create_page", (String) null), "yes");
        PageNode pageNode2 = this.k;
        if (pageNode2 != null) {
            pageNode2.setPageURI(this.j);
            Bundle startParams = this.k.getStartParams();
            if (startParams != null) {
                startParams.putString("url", this.j);
            }
            pageNode = this.k;
        } else if (!equals) {
            StringBuilder sb2 = new StringBuilder("ahead createPage ");
            sb2.append(this.j);
            RVLogger.d("AriverApp:App", sb2.toString());
            Bundle clone = BundleUtils.clone(this.mStartParams);
            Bundle clone2 = BundleUtils.clone(this.mSceneParams);
            PagePushInterceptPoint create = ExtensionPoint.as(PagePushInterceptPoint.class).node(this).nullable().create();
            if (create != null) {
                String interceptPushPage = create.interceptPushPage(this, this.j, clone);
                if (!TextUtils.isEmpty(interceptPushPage)) {
                    this.j = interceptPushPage;
                }
            }
            pageNode = ((RVPageFactory) RVProxy.get(RVPageFactory.class)).createPage(this, this.j, clone, clone2);
        }
        this.f8944o.init(initParams, new EngineInitCallback() {
            public void initResult(boolean z, String str) {
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppNode_EngineInitResult);
                RVLogger.d("AriverApp:App", "EngineInitCallback initResult success: ".concat(String.valueOf(z)));
                if (z) {
                    RVTraceUtils.asyncTraceEnd(RVTraceKey.RV_pagePhase_waitEngineInit);
                    RVTraceUtils.asyncTraceBegin(RVTraceKey.RV_pagePhase_postToMain);
                    ((EventTracker) RVProxy.get(EventTracker.class)).stub(AppNode.this, TrackId.Stub_EngineInit);
                    AppNode appNode = AppNode.this;
                    ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(appNode, appNode.getStartUrl(), PerfId.engineInit);
                    AppNode.this.a(pageNode);
                } else {
                    AppNode.this.b(pageNode);
                }
                RVTraceUtils.traceEndSection(RVTraceKey.RV_AppNode_EngineInitResult);
            }
        });
        RVTraceUtils.traceEndSection(RVTraceKey.RV_AppNode_onStart);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(final com.alibaba.ariver.app.PageNode r5) {
        /*
            r4 = this;
            com.alibaba.ariver.app.AppNode$6 r0 = new com.alibaba.ariver.app.AppNode$6
            r0.<init>(r5)
            java.util.concurrent.Callable<java.lang.Boolean> r5 = r4.b
            java.lang.String r1 = "AriverApp:App"
            if (r5 == 0) goto L_0x001e
            java.lang.Object r5 = r5.call()     // Catch:{ Exception -> 0x0018 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Exception -> 0x0018 }
            boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x0018 }
            r5 = r5 ^ 1
            goto L_0x001f
        L_0x0018:
            r5 = move-exception
            java.lang.String r2 = "onEngineInitSuccess get waitLoadFuture exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r2, r5)
        L_0x001e:
            r5 = 0
        L_0x001f:
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "onEngineInitSuccess startPageAsync: "
            java.lang.String r2 = r3.concat(r2)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r2)
            if (r5 == 0) goto L_0x0034
            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r5 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.URGENT_DISPLAY
            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.execute(r5, r0)
            return
        L_0x0034:
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.AppNode.a(com.alibaba.ariver.app.PageNode):void");
    }

    /* access modifiers changed from: protected */
    public void onPageStarted(Page page) {
        if (this.mAppContext != null) {
            RVLogger.d("AriverApp:App", "onPageStarted");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (this.t) {
                for (App.PageReadyListener onPageReady : this.t) {
                    onPageReady.onPageReady(page);
                }
                StringBuilder sb = new StringBuilder("onPageStarted flush pageReadyListener size: ");
                sb.append(this.t.size());
                sb.append(" cost: ");
                sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                RVLogger.d("AriverApp:App", sb.toString());
                this.t.clear();
            }
            this.u = new NetworkUtil.NetworkListener() {
                public void onNetworkChanged(NetworkUtil.Network network, NetworkUtil.Network network2) {
                    AppNode.this.a(network2);
                }
            };
            NetworkUtil.addListener(this.mAppContext.getContext(), this.u);
        }
    }

    /* access modifiers changed from: private */
    public void a(NetworkUtil.Network network) {
        Page activePage = getActivePage();
        if (activePage != null && activePage.getRender() != null) {
            String transferNetworkType = NetworkUtil.transferNetworkType(network);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isConnected", (Object) Boolean.valueOf(!"none".equals(transferNetworkType)));
            jSONObject.put("networkType", (Object) transferNetworkType);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            EngineUtils.sendToRender(activePage.getRender(), RVEvents.NETWORK_CHANGE, jSONObject2, (SendToRenderCallback) null);
        }
    }

    /* access modifiers changed from: private */
    public void b(final PageNode pageNode) {
        StringBuilder sb = new StringBuilder("onEngineInitFailed! type: ");
        sb.append(getAppType());
        RVLogger.d("AriverApp:App", sb.toString());
        this.e = false;
        ((EventTracker) RVProxy.get(EventTracker.class)).error(this, "EngineInitFail", (String) null);
        ((RVMonitor) RVProxy.get(RVMonitor.class)).error(getActivePage(), ErrId.RV_TYPE_APP_PREPARE_ERROR, "EngineInitFail", "", (Map<String, Object>) null, (Map<String, Object>) null);
        if (this.p.get()) {
            RVLogger.d("AriverApp:App", "app has been destroyed!");
            return;
        }
        ExtensionPoint.as(EngineInitFailedPoint.class).node(this).defaultValue(EngineInitFailedPoint.Action.IGNORE).resolve(EngineInitFailedPoint.RESULT_RESOLVER).when(new Action.Complete<EngineInitFailedPoint.Action>() {
            public void onComplete(EngineInitFailedPoint.Action action) {
                RVLogger.d("AriverApp:App", "EngineInitFailedPoint got result: ".concat(String.valueOf(action)));
                int i = AnonymousClass13.$SwitchMap$com$alibaba$ariver$app$api$point$engine$EngineInitFailedPoint$Action[action.ordinal()];
                if (i == 1) {
                    AppNode.this.a(pageNode);
                } else if (i == 2) {
                    AppNode.this.start();
                } else if (i == 3) {
                    RVLogger.d("AriverApp:App", "EngineInitCallback initResult faile and splashView is null ");
                    AppNode.this.exit();
                } else if (i == 4) {
                    ExecutorUtils.runOnMain(new Runnable() {
                        public void run() {
                            ((DialogService) RVProxy.get(DialogService.class)).showErrorDialog(AppNode.this, false);
                        }
                    });
                } else if (AppNode.this.getSplashView() != null) {
                    AppNode.this.getSplashView().showError("0", "engine init failed!", (Map<String, String>) null);
                }
            }
        }).create().onEngineInitFailed();
    }

    /* renamed from: com.alibaba.ariver.app.AppNode$13  reason: invalid class name */
    static /* synthetic */ class AnonymousClass13 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$app$api$point$engine$EngineInitFailedPoint$Action;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint$Action[] r0 = com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$ariver$app$api$point$engine$EngineInitFailedPoint$Action = r0
                com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint$Action r1 = com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint.Action.IGNORE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$point$engine$EngineInitFailedPoint$Action     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint$Action r1 = com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint.Action.REENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$point$engine$EngineInitFailedPoint$Action     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint$Action r1 = com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint.Action.EXIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$point$engine$EngineInitFailedPoint$Action     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint$Action r1 = com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint.Action.SHOW_ALERT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$point$engine$EngineInitFailedPoint$Action     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint$Action r1 = com.alibaba.ariver.app.api.point.engine.EngineInitFailedPoint.Action.SHOW_ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.AppNode.AnonymousClass13.<clinit>():void");
        }
    }

    public synchronized boolean pushPage(String str, Bundle bundle, Bundle bundle2) {
        if (this.h) {
            RVLogger.w("AriverApp:App", "pushPage with shadowNode not work!");
            return false;
        }
        StringBuilder sb = new StringBuilder("pushPage ");
        sb.append(str);
        sb.append(" with stack: ");
        sb.append(Log.getStackTraceString(new Throwable("Just Print")));
        RVLogger.d("AriverApp:App", sb.toString());
        Page activePage = getActivePage();
        if (activePage != null) {
            activePage.hide();
        }
        PageNode createPage = ((RVPageFactory) RVProxy.get(RVPageFactory.class)).createPage(this, str, bundle, bundle2);
        pushChild(createPage);
        PageSource pageSource = ((AppLogContext) createPage.getData(AppLogContext.class, true)).getPageSource();
        pageSource.sourceType = PageSource.SourceType.PUSH_WINDOW;
        if (activePage != null) {
            pageSource.sourcePageAppLogToken = AppLogUtils.getParentId(activePage);
            pageSource.sourceDesc = activePage.getPageURI();
        }
        if (this.mAppContext == null) {
            return false;
        }
        if (this.mAppContext.getTabBar() == null || !this.mAppContext.getTabBar().isTabPage(createPage)) {
            return this.mAppContext.pushPage(createPage);
        }
        return this.mAppContext.getTabBar().switchTab(this.mAppContext.getTabBar().getIndexByPage((Page) createPage), 3);
    }

    public void removePage(Page page, boolean z) {
        if (this.h) {
            RVLogger.w("AriverApp:App", "removePage with shadowNode not work!");
            return;
        }
        RVLogger.d("AriverApp:App", "exitPage: ".concat(String.valueOf(page)));
        if (page.isDestroyed()) {
            RVLogger.w("AriverApp:App", "exitPage but already destroyed! ".concat(String.valueOf(page)));
            return;
        }
        App.PopParams popParams = (App.PopParams) getData(App.PopParams.class);
        JSONObject jSONObject = null;
        if (popParams != null) {
            jSONObject = popParams.data;
        }
        if (getChild(page.getNodeId()) != null) {
            RVLogger.w("AriverApp:App", "exitPage but not a child! ".concat(String.valueOf(page)));
            removeChild(page);
        }
        AppContext appContext = this.mAppContext;
        if (appContext != null) {
            appContext.exitPage(page, z);
        }
        page.destroy();
        Page activePage = getActivePage();
        if (activePage != null && !activePage.getBooleanValue("isWaitExit")) {
            activePage.show(jSONObject);
        }
        if (activePage == null && z) {
            this.mAppManager.exitApp(getNodeId());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void popPage(@androidx.annotation.Nullable com.alibaba.fastjson.JSONObject r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.h     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "AriverApp:App"
            java.lang.String r0 = "popPage with shadowNode not work!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r4, r0)     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)
            return
        L_0x000e:
            if (r4 == 0) goto L_0x0029
            java.lang.String r0 = "AriverApp:App"
            java.lang.String r1 = "popPage with param "
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x0035 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)     // Catch:{ all -> 0x0035 }
            java.lang.Class<com.alibaba.ariver.app.api.App$PopParams> r0 = com.alibaba.ariver.app.api.App.PopParams.class
            com.alibaba.ariver.app.api.App$PopParams r1 = new com.alibaba.ariver.app.api.App$PopParams     // Catch:{ all -> 0x0035 }
            r1.<init>(r4)     // Catch:{ all -> 0x0035 }
            r3.setData(r0, r1)     // Catch:{ all -> 0x0035 }
        L_0x0029:
            com.alibaba.ariver.app.api.Page r4 = r3.getActivePage()     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0033
            r0 = 1
            r4.exit(r0)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r3)
            return
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.AppNode.popPage(com.alibaba.fastjson.JSONObject):void");
    }

    public void popTo(final int i2, final boolean z, final JSONObject jSONObject) {
        if (this.h) {
            RVLogger.w("AriverApp:App", "popTo with shadowNode not work!");
        } else {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (jSONObject != null) {
                        AppNode.this.setData(App.PopParams.class, new App.PopParams(jSONObject));
                    }
                    int childCount = AppNode.this.getChildCount();
                    ArrayList<Page> arrayList = new ArrayList<>();
                    int i = i2;
                    if (i < 0) {
                        int i2 = i + childCount;
                        StringBuilder sb = new StringBuilder("popTo ");
                        sb.append(i2);
                        sb.append(" to minIndex ");
                        sb.append(i2);
                        RVLogger.d("AriverApp:App", sb.toString());
                        for (int i3 = childCount - 1; i3 >= i2; i3--) {
                            Page pageByIndex = AppNode.this.getPageByIndex(i3);
                            if (pageByIndex.isUseForEmbed() && i2 > 0) {
                                i2--;
                            }
                            pageByIndex.putBooleanValue("isWaitExit", true);
                            arrayList.add(pageByIndex);
                        }
                    } else {
                        int i4 = childCount - 1;
                        StringBuilder sb2 = new StringBuilder("popTo ");
                        sb2.append(i2);
                        sb2.append(" to maxIndex ");
                        sb2.append(i4);
                        RVLogger.d("AriverApp:App", sb2.toString());
                        for (int i5 = i2 + 1; i5 <= i4; i5++) {
                            Page pageByIndex2 = AppNode.this.getPageByIndex(i5);
                            if (pageByIndex2 != null) {
                                pageByIndex2.putBooleanValue("isWaitExit", true);
                                arrayList.add(pageByIndex2);
                            }
                        }
                    }
                    for (Page exit : arrayList) {
                        exit.exit(z);
                    }
                }
            });
        }
    }

    public boolean isExited() {
        return this.g;
    }

    public boolean isInited() {
        return this.l;
    }

    public boolean isShadowNode() {
        return this.h;
    }

    public final synchronized void exit() {
        if (!this.g) {
            StringBuilder sb = new StringBuilder("exitApp with stack ");
            sb.append(Log.getStackTraceString(new Throwable("Just Print")));
            RVLogger.d("AriverApp:App", sb.toString());
            this.g = true;
            if (this.h) {
                RVLogger.d("AriverApp:App", "exit with shadowNode!");
                IpcServerUtils.sendMsgToClient(getAppId(), getStartToken(), 4, (Bundle) null);
                return;
            }
            ExtensionPoint.as(AppExitPoint.class).node(this).actionOn(ExecutorType.UI).when(new Action.Complete<Void>() {
                public void onComplete(Void voidR) {
                    AppNode.this.onExit();
                }
            }).create().onAppExit(this);
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void onExit() {
        a(true);
        destroy();
    }

    public final boolean isDestroyed() {
        return this.p.get();
    }

    public final synchronized void destroy() {
        if (!this.p.get()) {
            if (this.h) {
                RVLogger.d("AriverApp:App", "destroy with shadowNode!");
                IpcServerUtils.sendMsgToClient(getAppId(), getStartToken(), 4, (Bundle) null);
                return;
            }
            StringBuilder sb = new StringBuilder("destroy ");
            sb.append(this);
            sb.append(" with stack ");
            sb.append(Log.getStackTraceString(new Throwable("Just Print")));
            RVLogger.d("AriverApp:App", sb.toString());
            this.p.set(true);
            ExtensionPoint.as(AppDestroyPoint.class).node(this).actionOn(ExecutorType.UI).when(new Action.Complete<Void>() {
                public void onComplete(Void voidR) {
                    AppNode.this.onDestroy();
                }
            }).create().onAppDestroy(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        AppContext appContext;
        RVLogger.d("AriverApp:App", "onDestroy ".concat(String.valueOf(this)));
        if (!(this.u == null || (appContext = this.mAppContext) == null)) {
            NetworkUtil.removeListener(appContext.getContext(), this.u);
        }
        RVEngine rVEngine = this.f8944o;
        if (rVEngine != null) {
            rVEngine.destroy();
            this.f8944o = null;
        }
        AppContext appContext2 = this.mAppContext;
        if (appContext2 != null) {
            appContext2.destroy();
            this.mAppContext = null;
        }
        onFinalized();
    }

    public boolean isFirstPage() {
        Page activePage;
        if (getAlivePageCount() == 1) {
            return true;
        }
        AppContext appContext = this.mAppContext;
        if (appContext == null || appContext.getTabBar() == null || (activePage = getActivePage()) == null || !this.mAppContext.getTabBar().isTabPage(activePage)) {
            return false;
        }
        return true;
    }

    public final boolean backPressed() {
        AppContext appContext = this.mAppContext;
        if (appContext != null && appContext.getFontBar() != null && this.mAppContext.getFontBar().onBackPressed()) {
            RVLogger.d("AriverApp:App", "backPressed: intercept by font bar");
            return true;
        } else if (getSplashView() == null || !getSplashView().backPressed()) {
            Page activePage = getActivePage();
            if (activePage != null) {
                return activePage.backPressed();
            }
            destroy();
            return true;
        } else {
            RVLogger.d("AriverApp:App", "backPressed: just exit on splash loading");
            return true;
        }
    }

    public void performBack() {
        if (isFirstPage()) {
            RVLogger.d("AriverApp:App", "performBack with firstPage, direct exit!");
            exit();
            return;
        }
        RVLogger.d("AriverApp:App", "performBack just exit active page");
        Page activePage = getActivePage();
        if (activePage != null) {
            activePage.exit(true);
        }
    }

    public void resume() {
        boolean z;
        StringBuilder sb = new StringBuilder("resume with mSendResumeInRestart: ");
        sb.append(this.d);
        RVLogger.d("AriverApp:App", sb.toString());
        String str = this.f8943a;
        if (str == null) {
            str = BundleUtils.getString(this.mStartParams, RVParams.START_APP_SESSION_ID);
        }
        if (this.i) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState(AppLog.APP_LOG_APPEARANCE_START)).setAppId(this.appId).setParentId(str)).build());
        }
        String stringValue = getStringValue("lastCalledJsApi");
        putStringValue("lastCalledJsApi", (String) null);
        if (TextUtils.isEmpty(stringValue)) {
            RVLogger.w("AriverApp:App", "lastCalledJsApi is null");
        } else {
            JSONArray jSONArray = JSONUtils.getJSONArray(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONObject("h5_callResumeAfterAuthConfig"), stringValue, (JSONArray) null);
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= jSONArray.size()) {
                        break;
                    } else if (PatternUtils.matchRegex(jSONArray.getString(i2), this.appId)) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        z = true;
        if (z && this.c && !this.d) {
            AppUtils.sendToApp(this, RVEvents.APP_RESUME, (JSONObject) null, (SendToRenderCallback) null);
        }
        this.d = false;
        ExtensionPoint.as(AppResumePoint.class).node(this).create().onAppResume(this);
        if (this.i) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState(AppLog.APP_LOG_APPEARANCE_FINISH)).setAppId(this.appId).setParentId(str)).build());
        }
        this.i = false;
    }

    public void pause() {
        AppUtils.sendToApp(this, RVEvents.APP_PAUSE, (JSONObject) null, (SendToRenderCallback) null);
        this.c = true;
        ExtensionPoint.as(AppPausePoint.class).node(this).create().onAppPause(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        ExtensionPoint.as(AppOnConfigurationChangedPoint.class).node(this).create().onConfigurationChanged(this, configuration, ThemeUtils.getColorScheme(configuration));
    }

    public void onUserLeaveHint() {
        ExtensionPoint.as(AppLeaveHintPoint.class).node(this).create().onAppLeaveHint(this);
    }

    public void onUserInteraction() {
        ExtensionPoint.as(AppInteractionPoint.class).node(this).create().onAppInteraction(this);
    }

    public String getStartUrl() {
        return this.j;
    }

    public Class<? extends Scope> getScopeType() {
        return App.class;
    }

    public String toString() {
        String appId2 = getAppId();
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AUScreenAdaptTool.PREFIX_ID);
        sb.append(this.mStartToken);
        sb.append("@appid=");
        sb.append(appId2);
        String obj = sb.toString();
        if (!this.h) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("@Shadow");
        return sb2.toString();
    }

    public ExtensionManager getExtensionManager() {
        return sExtensionManager;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppNode(Parcel parcel) {
        super(parcel);
        Class<AppNode> cls = AppNode.class;
        this.appId = parcel.readString();
        this.mStartToken = parcel.readLong();
        this.mAppType = parcel.readString();
        this.mAppVersion = parcel.readString();
        this.mStartParams = parcel.readBundle(cls.getClassLoader());
        this.mSceneParams = parcel.readBundle(cls.getClassLoader());
        this.j = parcel.readString();
        this.h = true;
        a(parcel, EntryInfo.class);
        a(parcel, AppModel.class);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.appId);
        parcel.writeLong(this.mStartToken);
        parcel.writeString(this.mAppType);
        String str = this.mAppVersion;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        parcel.writeString(str);
        parcel.writeBundle(this.mStartParams);
        parcel.writeBundle(this.mSceneParams);
        String str3 = this.j;
        if (str3 != null) {
            str2 = str3;
        }
        parcel.writeString(str2);
        b(parcel, EntryInfo.class);
        b(parcel, AppModel.class);
    }

    private <T extends Parcelable> void a(Parcel parcel, Class<T> cls) {
        Parcelable readParcelable;
        if (parcel.readInt() == 1 && (readParcelable = parcel.readParcelable(AppNode.class.getClassLoader())) != null) {
            setData(cls, readParcelable);
        }
    }

    private void b(Parcel parcel, Class<? extends Parcelable> cls) {
        Parcelable parcelable = (Parcelable) getData(cls);
        if (parcelable != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(parcelable, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
