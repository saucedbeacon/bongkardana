package com.alibaba.ariver.integration;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestManager;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.engine.api.proxy.RVJsStatTrackService;
import com.alibaba.ariver.engine.common.track.JsApiStatTrackServiceImpl;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.integration.ipc.server.ServerSideRemoteExtensionCaller;
import com.alibaba.ariver.jsapi.logging.RVPerformanceTrackerImpl;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.api.remote.IRemoteCaller;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.remote.internal.DefaultRemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.api.security.internal.DefaultAccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.ariver.websocket.core.DefaultWebSocketProxyImpl;
import com.alibaba.ariver.websocket.proxy.RVWebSocketProxy;
import com.alibaba.griver.api.constants.GriverEvents;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Keep
public abstract class BaseManifest implements RVManifest {
    private AccessController mAccessController = null;
    private RemoteController mRemoteController = null;

    public Map<String, EmbedViewMetaInfo> getEmbedViews() {
        return null;
    }

    @Nullable
    public synchronized AccessController getAccessController() {
        if (this.mAccessController == null) {
            this.mAccessController = new DefaultAccessController();
        }
        return this.mAccessController;
    }

    @Nullable
    public synchronized RemoteController getRemoteController() {
        if (this.mRemoteController == null) {
            this.mRemoteController = new DefaultRemoteController();
        }
        return this.mRemoteController;
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.toast.ToastBridgeExtension", Arrays.asList(new String[]{ApiDowngradeConstant.ActionType.TOAST, "hideToast"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.DatePickerBridgeExtension", Arrays.asList(new String[]{"datePicker"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.dialog.DialogBridgeExtension", Arrays.asList(new String[]{ApiDowngradeConstant.ActionType.ALERT, "confirm", "prompt", "agreementConfirm"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.LoadingBridgeExtension", Arrays.asList(new String[]{"showLoading", "hideLoading"}), Page.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.network.NetworkBridgeExtension", Arrays.asList(new String[]{"getNetworkType"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.android.playground.extensions.SystemInfoBridgeExtension", Arrays.asList(new String[]{"getSystemInfo"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.AppRunTimeInfoBridgeExtension", Arrays.asList(new String[]{"getLocaleInfo", "getLayoutDirection"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.worker.WorkerBridgeExtension", Arrays.asList(new String[]{"registerWorker", "postMessage", "loadPlugin"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.EmbedViewBridgeExtension", Arrays.asList(new String[]{"NBComponent.render", "NBComponent.sendMessage", "NBComponent.remove"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.EmbedWebViewBridgeExtension", Arrays.asList(new String[]{"postWebViewMessage", "getEmbedWebViewEnv"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.security.OpenAuthExtension", Arrays.asList(new String[]{"getAuthorize", Constants.JS_API_GET_AUTH_CODE, "getAuthUserInfo", "getBusinessAuth", Constants.JS_API_GET_COMPONENT_AUTH, "showAuthGuide"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.security.ProgramSettingExtension", Arrays.asList(new String[]{Constants.JS_API_GET_SETTING})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.security.TBAuthorizeBridge", Arrays.asList(new String[]{"getTBCode", "openSetting", "authorize", "setTBSessionInfo", "getTBSessionInfo"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.resource.template.TemplateBridgeExtension", Arrays.asList(new String[]{"getExtConfig"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.resource.ResourceJsApiBridgeExtension", Arrays.asList(new String[]{"addPkgRes", "checkApp", "installApp"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.resource.SnapshotBridgeExtension", Arrays.asList(new String[]{"saveSnapshot", "getSnapshotConfig", "deleteSnapshot"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.mtop.MtopBridgeExtention", Arrays.asList(new String[]{"sendMtop"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.GetClientInfoBridgeExtension", Arrays.asList(new String[]{"getClientInfo"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.engine.InputBridgeExtension", Arrays.asList(new String[]{"toggleSoftInput", "showSoftInput", "inputFocus4Android"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.engine.OrientationBridgeExtension", Arrays.asList(new String[]{"getScreenOrientation", "setScreenOrientation"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.engine.EngineBridgeExtension", Arrays.asList(new String[]{"checkJSAPI", "h5PageReload", "measureText"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.logging.AppPerformanceBridgeExtension", Arrays.asList(new String[]{"onAppPerfEvent", "onCubeAppPerfEvent", "monitorH5Performance"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.app.AppBridgeExtension", Arrays.asList(new String[]{"getSceneStackInfo"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.app.TitleBarBridgeExtension", Arrays.asList(new String[]{GriverEvents.EVENT_SET_TITLE, "getTitleAndStatusbarHeight", "setTitleColor", "setBarBottomLineColor", "setTransparentTitle", "getTitleColor", "showTitleLoading", "hideTitleLoading", "showOptionMenu", "hideOptionMenu", GriverEvents.EVENT_SHOW_BACK_BUTTON, "hideBackButton"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.app.TabBarBridgeExtension", Arrays.asList(new String[]{"setTabBar", "switchTab", "removeTabBarItem", "addTabBarItem"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.internalapi.InternalApiBridgeExtension", Arrays.asList(new String[]{"internalAPI"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.resource.subpackage.SubPackageBridgeExtension", Arrays.asList(new String[]{"loadSubPackage"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.StartParamsBridgeExtension", Arrays.asList(new String[]{"getStartupParams", "setStartParam"}), Page.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.actionsheet.ActionSheetBridgeExtension", Arrays.asList(new String[]{"actionSheet"}), Page.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.NotificationBridgeExtension", Arrays.asList(new String[]{"addNotifyListener", "removeNotifyListener", "postNotification"}), Page.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.rpc.RpcBridgeExtension", Arrays.asList(new String[]{"rpc"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.rpc.TinyAppxRpcBridgeExtension", Arrays.asList(new String[]{Constants.JS_API_APPX_RPC}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.rpc.TinyRpcBridgeExtension", Arrays.asList(new String[]{"tinyRpc"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.logging.HandleLoggingActionBridgeExtension", Arrays.asList(new String[]{"handleLoggingAction"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.app.WindowBridgeExtension", Arrays.asList(new String[]{RVStartParams.FROM_TYPE_PUSH_WINDOW, "popWindow", "popTo", "getRunScene"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.websocket.WebSocketBridgeExtension", Arrays.asList(new String[]{"connectSocket", "sendSocketMessage", "closeSocket"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.remotedebug.RemoteDebugBridgeExtension", Arrays.asList(new String[]{TinyAppLogUtil.TINY_APP_STANDARD_LOG, "tyroRequest"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.remotedebug.RemoteDebugViewBridgeExtension", Arrays.asList(new String[]{"showRemoteDebugMask", "showRemoteDebugPanel"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.security.PermissionConfigExtension", Arrays.asList(new String[]{"getPermissionConfig"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.tracedebug.jsapi.TraceDebugBridgeExtension", Arrays.asList(new String[]{"initialTraceDebug", "postMethodTrace"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.tools.extension.RVToolsResourceExtension", Arrays.asList(new String[]{"rvToolsFetchResource"}), App.class));
        if (isInStandardCashierSDK()) {
            arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.pay.StdTradePayBridgeExtension", Arrays.asList(new String[]{"tradePay"}), App.class));
        } else {
            arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.pay.ProTradePayBridgeExtension", Arrays.asList(new String[]{"tradePay"}), App.class));
        }
        return arrayList;
    }

    private static boolean isInStandardCashierSDK() {
        try {
            Class.forName("com.alipay.sdk.app.PayTask");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public List<ExtensionMetaInfo> getExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.resource.runtime.ResourceLoadExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.app.AppStartPoint", "com.alibaba.ariver.app.api.point.app.AppCreatePoint", "com.alibaba.ariver.app.api.point.app.AppLoadPoint", "com.alibaba.ariver.app.api.point.app.AppDestroyPoint", "com.alibaba.ariver.app.api.point.engine.EngineInitSuccessPoint", "com.alibaba.ariver.engine.api.resources.ResourceLoadPoint", "com.alibaba.ariver.app.api.point.view.TabBarInfoQueryPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.resource.api.snapshot.SnapshotSaveExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.page.PagePausePoint", "com.alibaba.ariver.app.api.point.app.PushWindowPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.app.extensions.AppRestartExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.app.AppRestartPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.logging.PerformancePubExtension", Arrays.asList(new String[]{"com.alibaba.ariver.app.api.monitor.RVPub"})));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.permission.extension.AppPermissionInitExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.resource.api.extension.PackageParsedPoint", "com.alibaba.ariver.app.api.point.app.AppDestroyPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.permission.extension.EventSendInterceptorExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.engine.api.security.EventSendInterceptorPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.integration.proxy.impl.CommonAppExitExtension", Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.app.AppExitPoint"})));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.tools.extension.RVToolsActivityHelperOnCreateFinishedExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.activity.ActivityHelperOnCreateFinishedPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.tools.extension.RVToolsEngineInitSuccessExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.engine.EngineInitSuccessPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.remotedebug.worker.CreateRemoteWorkerExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.engine.api.extensions.CreateWorkerPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.tracedebug.extension.TraceDebugEngineExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.app.AppLoadPoint", "com.alibaba.ariver.app.api.point.page.PageExitPoint", "com.alibaba.ariver.app.api.point.page.PageEnterPoint", "com.alibaba.ariver.app.api.point.app.AppExitPoint", "com.alibaba.ariver.engine.api.point.NativeCallResultPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.tools.extension.RVToolsResourceInterceptExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.resource.api.extension.ResourceInterceptPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.font.FontSizeSettingExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.app.AppStartPoint", "com.alibaba.ariver.app.api.point.app.AppDestroyPoint"}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.console.DebugConsoleExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.console.DebugConsolePoint"}), (Class<? extends Scope>) App.class));
        return arrayList;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RVManifest.LazyProxyManifest(RVPerformanceTracker.class, new RVProxy.LazyGetter<RVPerformanceTracker>() {
            /* renamed from: a */
            public RVPerformanceTracker get() {
                return new RVPerformanceTrackerImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVNativePermissionRequestProxy.class, new RVProxy.LazyGetter<RVNativePermissionRequestProxy>() {
            /* renamed from: a */
            public RVNativePermissionRequestProxy get() {
                return new RVNativePermissionRequestManager();
            }
        }));
        try {
            arrayList.add(new RVManifest.LazyProxyManifest(RVWebSocketProxy.class, new RVProxy.LazyGetter<RVWebSocketProxy>() {
                /* renamed from: a */
                public RVWebSocketProxy get() {
                    return new DefaultWebSocketProxyImpl();
                }
            }));
        } catch (Throwable th) {
            RVLogger.e(Log.getStackTraceString(th));
        }
        arrayList.add(new RVManifest.LazyProxyManifest(RVJsStatTrackService.class, new RVProxy.LazyGetter<RVJsStatTrackService>() {
            /* renamed from: a */
            public RVJsStatTrackService get() {
                return new JsApiStatTrackServiceImpl();
            }
        }));
        arrayList.add(new RVManifest.ProxyManifest(RVNativePermissionRequestProxy.class, new RVNativePermissionRequestManager()));
        return arrayList;
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(final ExtensionManager extensionManager) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RVManifest.ServiceBeanManifest(IRemoteCaller.class, new RVProxy.LazyGetter<IRemoteCaller>() {
            /* renamed from: a */
            public IRemoteCaller get() {
                return new ServerSideRemoteExtensionCaller(extensionManager);
            }
        }));
        return arrayList;
    }

    public List<BridgeDSL> getBridgeDSLs() {
        return new ArrayList();
    }
}
