package com.alibaba.griver.core;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.app.ipc.ServerMsgReceiver;
import com.alibaba.ariver.integration.RVInitializer;
import com.alibaba.ariver.integration.RVMain;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.DefaultExtensionManager;
import com.alibaba.ariver.kernel.api.extension.registry.BridgeDSLRegistry;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.internal.DefaultRemoteController;
import com.alibaba.ariver.kernel.api.security.internal.DefaultAccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.GriverExtensionManifest;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.config.GriverConfigProxy;
import com.alibaba.griver.api.common.env.GriverVerifyPublicKeyProxy;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.constants.GriverErrors;
import com.alibaba.griver.api.resource.appinfo.AppInfoConstants;
import com.alibaba.griver.api.resource.preset.GriverResourcePresetProxy;
import com.alibaba.griver.base.api.GriverPerformanceStages;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.AbstractPriorityRunnable;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.DebugMonitor;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.rpc.OnRpcResultListener;
import com.alibaba.griver.base.common.utils.StartupParamsUtils;
import com.alibaba.griver.base.common.utils.UCUtils;
import com.alibaba.griver.base.common.webview.GriverWebviewSetting;
import com.alibaba.griver.base.resource.GriverResourceManager;
import com.alibaba.griver.base.resource.predownload.AppPreDownloadManager;
import com.alibaba.griver.base.resource.preset.GriverResourcePreset;
import com.alibaba.griver.base.resource.utils.ErrorPageUtils;
import com.alibaba.griver.core.a.b;
import com.alibaba.griver.core.a.c;
import com.alibaba.griver.core.bridge.GriverExtensionRegistry;
import com.alibaba.griver.core.kernel.ipc.client.BizIpcMessageHandler;
import com.alibaba.griver.core.model.applist.AppInfosResult;
import com.alibaba.griver.core.model.applist.FetchAppsByIdsRequest;
import com.alibaba.griver.core.model.applist.FetchAppsRequest;
import com.alibaba.griver.core.point.GriverEventManifest;
import com.alibaba.griver.core.rpc.a;
import com.alibaba.griver.h5.GriverH5;
import com.alibaba.griver.uc.UCDownloadUtils;
import com.iap.ac.android.common.log.ACLog;
import id.dana.sendmoney.summary.SummaryActivity;

public class Griver {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9067a = false;
    private static boolean b = false;
    /* access modifiers changed from: private */
    public static boolean c = false;
    private static GriverInitializeCallback d;
    private static DefaultExtensionManager e;

    public static synchronized void initialize(@NonNull Application application, @NonNull final GriverConfiguration griverConfiguration, GriverInitializeCallback griverInitializeCallback) {
        synchronized (Griver.class) {
            if (f9067a) {
                a(GriverErrors.INITIALIZE_EXCEPTION, "Repeated initialization");
                return;
            }
            d = griverInitializeCallback;
            GriverEnv.setApplication(application);
            if (griverConfiguration == null) {
                a(GriverErrors.INITIALIZE_ERROR_PARAM, "GriverConfiguration is null");
                return;
            }
            if (!TextUtils.isEmpty(griverConfiguration.getAppId())) {
                if (!TextUtils.isEmpty(griverConfiguration.getWorkSpaceId())) {
                    if (!TextUtils.isEmpty(griverConfiguration.getWebSocketURLPrefixForDebug())) {
                        GriverConfigConstants.insideStringConfig.put(GriverConfigConstants.KEY_WEBSOCKET_HOST_URL, griverConfiguration.getWebSocketURLPrefixForDebug());
                    }
                    GriverEnv.setAppId(griverConfiguration.getAppId());
                    GriverEnv.setWorkSpaceId(griverConfiguration.getWorkSpaceId());
                    try {
                        DefaultExtensionManager defaultExtensionManager = new DefaultExtensionManager(new DefaultAccessController(), new DefaultRemoteController(), new GriverExtensionRegistry(), new BridgeDSLRegistry());
                        e = defaultExtensionManager;
                        RVInitializer.init(application, defaultExtensionManager);
                        ServerMsgReceiver.getInstance().registerBizHandler(IpcMessageConstants.BIZ_APP, new b());
                        if (ProcessUtils.isTinyProcess()) {
                            ClientMsgReceiver.getInstance().registerBizHandler("ipc_griver", new BizIpcMessageHandler());
                        }
                        if (!TextUtils.isEmpty(griverConfiguration.getAppendUserAgent())) {
                            GriverWebviewSetting.setUserAgent(griverConfiguration.getAppendUserAgent());
                        }
                        if (!TextUtils.isEmpty(griverConfiguration.getPresetPackagePath())) {
                            GriverResourcePreset.setGriverResourcePresetProxy(new GriverResourcePresetProxy() {
                                public final String getPresetResourcePath() {
                                    return griverConfiguration.getPresetPackagePath();
                                }
                            });
                        }
                        GriverResourcePreset.savePresetConfiguration();
                        d();
                        GriverH5.preInstallH5Auto();
                        if (!TextUtils.isEmpty(griverConfiguration.getVerifyPackagePublicKey())) {
                            GriverEnv.setVerifyPublicKeyProxy(new GriverVerifyPublicKeyProxy() {
                                public final String getPublicKey() {
                                    return griverConfiguration.getVerifyPackagePublicKey();
                                }
                            });
                        }
                        GriverPageConfiguration pageConfiguration = griverConfiguration.getPageConfiguration();
                        if (pageConfiguration != null) {
                            if (!TextUtils.isEmpty(pageConfiguration.statusPageURL)) {
                                ErrorPageUtils.setStatusErrorPage(pageConfiguration.statusPageURL);
                            }
                            if (!TextUtils.isEmpty(pageConfiguration.errorPageURL)) {
                                ErrorPageUtils.setH5ErrorPage(pageConfiguration.errorPageURL);
                            }
                        }
                        a();
                        c();
                        b();
                        AppPreDownloadManager.getInstance().start();
                        return;
                    } catch (Exception unused) {
                        a(GriverErrors.INITIALIZE_EXCEPTION, "Initialization exception");
                        return;
                    }
                }
            }
            a(GriverErrors.INITIALIZE_ERROR_PARAM, "Missing necessary param");
        }
    }

    private static void a() {
        if (!ProcessUtils.isMainProcess() && Build.VERSION.SDK_INT >= 28) {
            String processName = ProcessUtils.getProcessName();
            if (ProcessUtils.isTinyProcess()) {
                WebView.setDataDirectorySuffix(processName);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void b() {
        String config = GriverInnerConfig.getConfig(GriverConfigConstants.KEY_CONFIG_ARRIVAL_TEST);
        if (!TextUtils.isEmpty(config)) {
            GriverLogger.d("Griver", "dealArrivalConfig config == ".concat(String.valueOf(config)));
            JSONObject parseObject = JSONUtils.parseObject(config);
            if (parseObject != null && parseObject.getBoolean("enable").booleanValue()) {
                String string = parseObject.getString("value");
                if (!TextUtils.isEmpty(string)) {
                    MonitorMap.Builder builder = new MonitorMap.Builder();
                    builder.append("value", string).append(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, String.valueOf(System.currentTimeMillis()));
                    GriverMonitor.event(GriverMonitorConstants.EVENT_AMCS_CONFIG_ARRIVAL, "GriverAppContainer", builder.build());
                }
            }
        }
    }

    public static synchronized boolean alreadyInitialized() {
        boolean z;
        synchronized (Griver.class) {
            z = f9067a;
        }
        return z;
    }

    public static synchronized void openUrl(Context context, String str, Bundle bundle) {
        synchronized (Griver.class) {
            if (!f9067a) {
                ACLog.e("Griver", "Please initialize Griver first!");
                return;
            }
            GriverPerformanceStages.jumpAppStart = SystemClock.elapsedRealtime();
            try {
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("_ariver_appid")) {
                    String queryParameter = parse.getQueryParameter("_ariver_appid");
                    if (TextUtils.isEmpty(queryParameter)) {
                        RVLogger.e("Griver", "appId is empty");
                        return;
                    }
                    Bundle filterBundle = StartupParamsUtils.filterBundle(queryParameter, str, bundle);
                    String queryParameter2 = parse.getQueryParameter("_ariver_path");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        filterBundle.putString("page", Uri.decode(queryParameter2));
                        filterBundle.putString("url", "/index.html#");
                    }
                    filterBundle.putString(AppInfoConstants.ARIVER_TOKEN, parse.getQueryParameter("_ariver_token"));
                    String queryParameter3 = parse.getQueryParameter("_ariver_version");
                    String queryParameter4 = parse.getQueryParameter("_ariver_source");
                    if (!filterBundle.containsKey("query")) {
                        String queryParameter5 = parse.getQueryParameter("query");
                        if (!TextUtils.isEmpty(queryParameter5)) {
                            filterBundle.putString("query", Uri.decode(queryParameter5));
                        }
                    }
                    if (TextUtils.equals(queryParameter4, "debug")) {
                        filterBundle.putString(AppInfoScene.PARAM_SOURCE, queryParameter4);
                        String queryParameter6 = parse.getQueryParameter("_ariver_scene");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            filterBundle.putString(AppInfoScene.PARAM_SCENE_VERSION, queryParameter3);
                        }
                        filterBundle.putString(AppInfoScene.PARAM_SCENE, queryParameter6);
                        if (TextUtils.equals(queryParameter6, AppInfoScene.DEBUG.name())) {
                            String queryParameter7 = parse.getQueryParameter("_ariver_channelid");
                            if (TextUtils.isEmpty(queryParameter7)) {
                                RVLogger.e("Griver", "channel is empty");
                                return;
                            } else {
                                filterBundle.putString(RVStartParams.KEY_CHANNEL_ID, queryParameter7);
                                filterBundle.putString(RVStartParams.KEY_IS_REMOTE_DEBUG_MODE, SummaryActivity.CHECKED);
                            }
                        }
                    } else if (!TextUtils.isEmpty(queryParameter3)) {
                        filterBundle.putString(RVStartParams.LONG_NB_VERSION, queryParameter3);
                    }
                    String queryParameter8 = parse.getQueryParameter("channel");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        JSONObject jSONObject = (JSONObject) BundleUtils.getSerializable(filterBundle, "sourceInfo");
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        jSONObject.put("channel", (Object) queryParameter8);
                        filterBundle.putSerializable("sourceInfo", jSONObject);
                    }
                    String queryParameter9 = parse.getQueryParameter(GriverParam.SUB_CHANNEL);
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        JSONObject jSONObject2 = (JSONObject) BundleUtils.getSerializable(filterBundle, "sourceInfo");
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        jSONObject2.put(GriverParam.SUB_CHANNEL, (Object) queryParameter9);
                        filterBundle.putSerializable("sourceInfo", jSONObject2);
                    }
                    String queryParameter10 = parse.getQueryParameter("_ariver_event");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        filterBundle.putString("_ariver_event", queryParameter10);
                    }
                    a(context, queryParameter, filterBundle, false);
                } else if (TextUtils.isEmpty(parse.getScheme())) {
                    GriverLogger.w("Griver", "invalid url scheme");
                } else {
                    GriverH5.openUrl(context, parse.toString(), bundle);
                    b();
                }
            } catch (Exception e2) {
                RVLogger.e("Griver", "parse url failed", e2);
            }
        }
    }

    public static synchronized void openApp(Context context, String str, Bundle bundle) {
        synchronized (Griver.class) {
            a(context, str, bundle, true);
        }
    }

    private static synchronized void a(final Context context, final String str, Bundle bundle, boolean z) {
        final Bundle bundle2;
        synchronized (Griver.class) {
            if (!f9067a) {
                ACLog.e("Griver", "Please initialize Griver first!");
                return;
            }
            if (z) {
                bundle2 = StartupParamsUtils.filterBundle(str, "", bundle);
            } else {
                bundle2 = new Bundle(bundle);
            }
            bundle2.putString("adjustResize", "YES");
            GriverPerformanceStages.jumpAppStart = SystemClock.elapsedRealtime();
            if (!b || c) {
                DebugMonitor.reset();
                if (b || !UCUtils.UCExist() || !UCUtils.isDynamicDelivery()) {
                    RVMain.startApp(context, str, bundle2, (Bundle) null);
                    b();
                    return;
                }
                b = true;
                UCDownloadUtils.checkIfDownloadUCCore(context, new UCDownloadUtils.Callback() {
                    public final void setupResult(boolean z) {
                        RVLogger.d("down uc code result == ".concat(String.valueOf(z)));
                        boolean unused = Griver.c = true;
                        RVMain.startApp(context, str, bundle2, (Bundle) null);
                        Griver.b();
                    }
                });
            }
        }
    }

    public static synchronized void closeApp(String str) {
        synchronized (Griver.class) {
            if (!TextUtils.isEmpty(str)) {
                c.a().a(str);
            } else {
                c.a().d();
            }
        }
    }

    public static synchronized void fetchApps(FetchAppsRequest fetchAppsRequest, OnRpcResultListener onRpcResultListener) {
        synchronized (Griver.class) {
            new a().a(fetchAppsRequest, onRpcResultListener);
        }
    }

    public static synchronized void fetchAppInfoListByIds(FetchAppsByIdsRequest fetchAppsByIdsRequest, OnRpcResultListener<AppInfosResult> onRpcResultListener) {
        synchronized (Griver.class) {
            new a().a(fetchAppsByIdsRequest.getAppIdList(), onRpcResultListener);
        }
    }

    public static void registerEventHandler(GriverEventManifest griverEventManifest) {
        if (!f9067a) {
            ACLog.e("Griver", "please initialize Griver first");
            return;
        }
        ExtensionMetaInfo a2 = com.alibaba.griver.core.utils.c.a(griverEventManifest);
        if (a2 != null) {
            e.getExtensionRegistry().register(a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(JSON.toJSONString(griverEventManifest.getEventClassNames()));
        sb.append("===");
        sb.append(griverEventManifest.getHandlerClassName());
        sb.append("===");
        sb.append(griverEventManifest.getScope().getSimpleName());
        GriverLogger.d("Griver", sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void registerBridge(com.alibaba.griver.core.bridge.GriverBridgeManifest r9) {
        /*
            boolean r0 = f9067a
            java.lang.String r1 = "Griver"
            if (r0 != 0) goto L_0x000c
            java.lang.String r9 = "please initialize Griver first"
            com.iap.ac.android.common.log.ACLog.e(r1, r9)
            return
        L_0x000c:
            if (r9 != 0) goto L_0x0014
            java.lang.String r9 = "register jsapi failed because bridge manifest can not be null"
            com.alibaba.griver.base.common.logger.GriverLogger.w(r1, r9)
            return
        L_0x0014:
            java.lang.String r0 = r9.getClassName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f8
            java.util.List r0 = r9.getActionList()
            if (r0 == 0) goto L_0x00f8
            java.util.List r0 = r9.getActionList()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0030
            goto L_0x00f8
        L_0x0030:
            java.lang.String r0 = r9.getClassName()
            boolean r0 = com.alibaba.griver.base.common.utils.ReflectUtils.classExist(r0)
            if (r0 != 0) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "register jsapi failed because class: "
            r0.<init>(r2)
            java.lang.String r9 = r9.getClassName()
            r0.append(r9)
            java.lang.String r9 = " can not be loaded"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.alibaba.griver.base.common.logger.GriverLogger.w(r1, r9)
            return
        L_0x0055:
            java.lang.String r0 = "h5_system_jsapi_list"
            java.lang.String r2 = ""
            java.lang.String r0 = com.alibaba.griver.base.common.config.GriverInnerConfig.getConfig(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0077
            com.alibaba.griver.core.Griver$4 r2 = new com.alibaba.griver.core.Griver$4
            r2.<init>()
            r3 = 0
            com.alibaba.fastjson.parser.Feature[] r3 = new com.alibaba.fastjson.parser.Feature[r3]
            java.lang.Object r0 = com.alibaba.fastjson.JSONObject.parseObject((java.lang.String) r0, r2, (com.alibaba.fastjson.parser.Feature[]) r3)
            r2 = r0
            java.util.List r2 = (java.util.List) r2
        L_0x0077:
            if (r2 == 0) goto L_0x00c7
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00c7
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.List r3 = r9.getActionList()
            java.util.Iterator r3 = r3.iterator()
        L_0x008c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00c4
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r2.contains(r4)
            if (r5 != 0) goto L_0x00a2
            r0.add(r4)
            goto L_0x008c
        L_0x00a2:
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "Failed to register reserved JSAPI: "
            java.lang.String r5 = r6.concat(r5)
            com.alibaba.griver.base.common.logger.GriverLogger.w(r1, r5)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r5 = new com.alibaba.griver.base.common.monitor.MonitorMap$Builder
            r5.<init>()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r4 = r5.apiName(r4)
            java.util.Map r4 = r4.build()
            java.lang.String r5 = "mini_jsapi_existed_exception"
            java.lang.String r6 = "GriverAppContainer"
            com.alibaba.griver.base.common.monitor.GriverMonitor.error(r5, r6, r4)
            goto L_0x008c
        L_0x00c4:
            r9.setActionList(r0)
        L_0x00c7:
            java.util.List r0 = r9.getActionList()
            if (r0 == 0) goto L_0x00f7
            java.util.List r0 = r9.getActionList()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00d8
            goto L_0x00f7
        L_0x00d8:
            com.alibaba.ariver.kernel.api.extension.DefaultExtensionManager r0 = e
            com.alibaba.ariver.kernel.api.extension.registry.ExtensionRegistry r0 = r0.getExtensionRegistry()
            com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo r8 = new com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo
            java.lang.String r2 = r9.getPackageName()
            java.lang.String r3 = r9.getClassName()
            java.util.List r4 = r9.getActionList()
            r5 = 0
            com.alibaba.ariver.kernel.api.extension.ExtensionType r6 = com.alibaba.ariver.kernel.api.extension.ExtensionType.BRIDGE
            r7 = 1
            r1 = r8
            r1.<init>((java.lang.String) r2, (java.lang.String) r3, (java.util.List<java.lang.String>) r4, (java.lang.Class<? extends com.alibaba.ariver.kernel.api.node.Scope>) r5, (com.alibaba.ariver.kernel.api.extension.ExtensionType) r6, (boolean) r7)
            r0.register((com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo) r8)
        L_0x00f7:
            return
        L_0x00f8:
            java.lang.String r9 = "register jsapi failed because of illegal param of bridge manifest"
            com.alibaba.griver.base.common.logger.GriverLogger.w(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.Griver.registerBridge(com.alibaba.griver.core.bridge.GriverBridgeManifest):void");
    }

    public static void registerExtension(GriverExtensionManifest griverExtensionManifest) {
        if (!f9067a) {
            ACLog.e("Griver", "please initialize Griver first");
        } else if (griverExtensionManifest.getExtensionClass() == null || griverExtensionManifest.getExtensionImpl() == null) {
            GriverLogger.e("Griver", "registerExtension failed because of param is null");
        } else {
            RVProxy.set(griverExtensionManifest.getExtensionClass(), griverExtensionManifest.getExtensionImpl());
            StringBuilder sb = new StringBuilder();
            sb.append(griverExtensionManifest.getExtensionClass().getSimpleName());
            sb.append(">>>");
            sb.append(griverExtensionManifest.getExtensionImpl().getClass().getName());
            GriverLogger.d("Griver", sb.toString());
        }
    }

    private static void c() {
        f9067a = true;
        GriverInitializeCallback griverInitializeCallback = d;
        if (griverInitializeCallback != null) {
            griverInitializeCallback.onInitializedSuccess();
        }
    }

    private static void a(int i, String str) {
        GriverInitializeCallback griverInitializeCallback = d;
        if (griverInitializeCallback != null) {
            griverInitializeCallback.onInitializeFailed(i, str);
        }
        MonitorMap.Builder builder = new MonitorMap.Builder();
        builder.code(String.valueOf(i)).message(str);
        GriverMonitor.error(GriverMonitorConstants.ERROR_INIT_CONTAINER, "GriverAppContainer", builder.build());
    }

    private static void d() {
        if (!ProcessUtils.isMainProcess()) {
            GriverLogger.d("Griver", "do not pre install mini in non-main process");
        } else {
            a(GriverConfig.getSectionConfigWithListener("mini", new GriverConfigProxy.OnSectionConfigChangeListener() {
                public final void onChange(JSONObject jSONObject) {
                    Griver.a(jSONObject);
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    public static void a(final JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.isEmpty()) {
            GriverLogger.d("Griver", "config is null, return directly");
        } else {
            GriverExecutors.getSingleOrderThreadExecutorByName("saveConfiguration").execute(new AbstractPriorityRunnable(10) {
                public final void runTask() {
                    GriverLogger.d("Griver", "start to install configuration");
                    GriverResourceManager.saveConfiguration(GriverResourceManager.parseAppInfoFromJSONString(JSON.toJSONString(jSONObject)), false);
                }
            });
        }
    }
}
