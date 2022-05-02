package com.alibaba.griver.core;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.monitor.RVMonitor;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestManager;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppOnLoadResultPoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.app.api.point.app.BackKeyDownPoint;
import com.alibaba.ariver.app.api.point.dialog.DialogPoint;
import com.alibaba.ariver.app.api.point.page.BackPressedPoint;
import com.alibaba.ariver.app.api.point.page.PageBackPoint;
import com.alibaba.ariver.app.api.point.page.PageDestroyPoint;
import com.alibaba.ariver.app.api.point.page.PageEnterPoint;
import com.alibaba.ariver.app.api.point.page.PageExitPoint;
import com.alibaba.ariver.app.api.point.page.PagePausePoint;
import com.alibaba.ariver.app.api.point.page.PageResumePoint;
import com.alibaba.ariver.app.api.point.page.PageStartedPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarCloseClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarOptionClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarShowClosePoint;
import com.alibaba.ariver.app.api.point.view.TitleBarTitleClickPoint;
import com.alibaba.ariver.app.api.point.view.ToastPoint;
import com.alibaba.ariver.app.api.service.TinyAppInnerProxy;
import com.alibaba.ariver.app.api.ui.RVViewFactory;
import com.alibaba.ariver.app.proxy.RVPageFactory;
import com.alibaba.ariver.app.proxy.RVScreenOrientationProxy;
import com.alibaba.ariver.engine.api.EngineFactory;
import com.alibaba.ariver.engine.api.bridge.NativeCallNotFoundPoint;
import com.alibaba.ariver.engine.api.embedview.EmbedViewProvider;
import com.alibaba.ariver.engine.api.extensions.CreateWorkerPoint;
import com.alibaba.ariver.engine.api.point.NativeCallResultPoint;
import com.alibaba.ariver.engine.api.security.BridgeAccessPoint;
import com.alibaba.ariver.engine.api.security.EventSendInterceptorPoint;
import com.alibaba.ariver.integration.BaseManifest;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.integration.proxy.RVClientStarter;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.network.RVTransportService;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.RVExecutorService;
import com.alibaba.ariver.kernel.common.storage.KVStorageProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.api.proxy.AuthDialogProxy;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.permission.api.proxy.EmbedWebViewJsApiPermissionProxy;
import com.alibaba.ariver.permission.extension.AppPermissionInitExtension;
import com.alibaba.ariver.permission.extension.EventSendInterceptorExtension;
import com.alibaba.ariver.remotedebug.core.RVRemoteDebugProxy;
import com.alibaba.ariver.resource.api.appinfo.AppUpdaterFactory;
import com.alibaba.ariver.resource.api.appinfo.IAppUpdater;
import com.alibaba.ariver.resource.api.extension.PackageParsedPoint;
import com.alibaba.ariver.resource.api.extension.PackageQueryPoint;
import com.alibaba.ariver.resource.api.extension.ResourceProviderPoint;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.ariver.resource.api.proxy.RVPluginResourceManager;
import com.alibaba.ariver.resource.api.proxy.RVResourceEnviromentProxy;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;
import com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy;
import com.alibaba.ariver.websocket.core.DefaultWebSocketProxyImpl;
import com.alibaba.ariver.websocket.proxy.RVWebSocketProxy;
import com.alibaba.griver.api.activity.GriverActivityRestoreExtension;
import com.alibaba.griver.api.common.GriverExtension;
import com.alibaba.griver.api.common.menu.GriverMenuExtension;
import com.alibaba.griver.api.common.monitor.GriverMonitorAnalyticsConfigExtension;
import com.alibaba.griver.api.common.monitor.GriverMonitorProxy;
import com.alibaba.griver.api.common.page.GriverStartPageFailedExtension;
import com.alibaba.griver.api.constants.GriverEvents;
import com.alibaba.griver.api.open.GriverAboutUrlExtension;
import com.alibaba.griver.api.resource.extensions.GriverParseFailedPoint;
import com.alibaba.griver.api.ui.GVViewFactory;
import com.alibaba.griver.api.ui.GriverAppExtension;
import com.alibaba.griver.api.ui.auth.GriverLocalAuthDialogExtension;
import com.alibaba.griver.api.ui.dialog.GriverDialogExtension;
import com.alibaba.griver.api.ui.dialog.GriverPromptExtension;
import com.alibaba.griver.api.ui.loadingview.GriverLoadingViewExtension;
import com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuPanelExtension;
import com.alibaba.griver.api.ui.share.GriverShareExtension;
import com.alibaba.griver.api.ui.share.GriverShareMenuExtension;
import com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension;
import com.alibaba.griver.api.webview.GriverGeoLocationExtension;
import com.alibaba.griver.api.webview.GriverWebViewReceivedErrorExtension;
import com.alibaba.griver.api.webview.PageAbnormalPoint;
import com.alibaba.griver.api.webview.PageErrorPoint;
import com.alibaba.griver.api.webview.PageFinishedPoint;
import com.alibaba.griver.base.GriverBaseManifest;
import com.alibaba.griver.base.api.GriverAsyncUpdateManager;
import com.alibaba.griver.base.api.NXUcService;
import com.alibaba.griver.base.api.PageProcessPoint;
import com.alibaba.griver.base.api.ReceivedTitlePoint;
import com.alibaba.griver.base.api.ShouldLoadUrlPoint;
import com.alibaba.griver.base.common.CommonAbilityManifest;
import com.alibaba.griver.base.common.account.GriverRVAccountServiceImpl;
import com.alibaba.griver.base.common.bridge.GriverAppLanguageExtension;
import com.alibaba.griver.base.common.bridge.GriverHttpRequestAPIExtension;
import com.alibaba.griver.base.common.bridge.GriverNetworkPermissionExtension;
import com.alibaba.griver.base.common.config.GriverRVConfigServiceImpl;
import com.alibaba.griver.base.common.env.GriverRVEnvironmentServiceImpl;
import com.alibaba.griver.base.common.env.GriverRVResourceEnvProxyImpl;
import com.alibaba.griver.base.common.executor.GriverRVExecutorServiceImpl;
import com.alibaba.griver.base.common.innerapp.GriverRVInnerAppProxyImpl;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.logger.GriverRVLoggerProxyImpl;
import com.alibaba.griver.base.common.monitor.GriverRVMonitorImpl;
import com.alibaba.griver.base.common.network.GriverRVTransortServiceImpl;
import com.alibaba.griver.base.common.permission.GriverAuthentication;
import com.alibaba.griver.base.common.storage.GriverRVKVStorageProxyImpl;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.base.common.webview.WebViewSettingExtension;
import com.alibaba.griver.base.resource.GriverRVPluginResourceManagerImpl;
import com.alibaba.griver.base.resource.GriverRVResourceManagerImpl;
import com.alibaba.griver.base.resource.appinfo.GriverRVAppInfoManagerImpl;
import com.alibaba.griver.base.resource.appinfo.GriverRVAppUpdaterImpl;
import com.alibaba.griver.base.resource.extensions.GriverPackageQueryExtension;
import com.alibaba.griver.base.resource.point.ResourceProviderExtension;
import com.alibaba.griver.base.resource.preset.GriverRVResourcePresetImpl;
import com.alibaba.griver.biz.GriverBizManifest;
import com.alibaba.griver.bluetooth.BluetoothManifest;
import com.alibaba.griver.core.common.monitor.GriverLifeCycleMonitorExtension;
import com.alibaba.griver.core.common.monitor.GriverMonitorAnalyticsConfigExtensionImpl;
import com.alibaba.griver.core.common.monitor.GriverMonitorAnalyticsTriggerExtension;
import com.alibaba.griver.core.common.monitor.a;
import com.alibaba.griver.core.embedview.NXEmbedAppExtension;
import com.alibaba.griver.core.embedview.NXEmbedPageExtension;
import com.alibaba.griver.core.embedview.NXEmbedViewFactory;
import com.alibaba.griver.core.extensions.BridgeAccessExtension;
import com.alibaba.griver.core.extensions.DefaultAppExtension;
import com.alibaba.griver.core.extensions.DefaultHttpRequestAPIExtension;
import com.alibaba.griver.core.extensions.DefaultWebViewSettingExtensionImpl;
import com.alibaba.griver.core.extensions.GriverActivityRestoreExtensionImpl;
import com.alibaba.griver.core.extensions.GriverAppExtensionImpl;
import com.alibaba.griver.core.extensions.GriverAppLanguageExtensionImpl;
import com.alibaba.griver.core.extensions.GriverBridgeNotFoundExtension;
import com.alibaba.griver.core.extensions.GriverGeoLocationExtensionImpl;
import com.alibaba.griver.core.extensions.GriverNetworkPermissionExtensionImpl;
import com.alibaba.griver.core.extensions.GriverShouldLoadUrlExtension;
import com.alibaba.griver.core.extensions.JSAPIMonitorExtension;
import com.alibaba.griver.core.extensions.NebulaAuthDialogProxy;
import com.alibaba.griver.core.extensions.TrackerExtension;
import com.alibaba.griver.core.extensions.WorkerManagerExtension;
import com.alibaba.griver.core.h5.GriverSessionDataExtension;
import com.alibaba.griver.core.jsapi.app.ClientAppBridgeExtension;
import com.alibaba.griver.core.jsapi.app.GetAppInfoBridgeExtension;
import com.alibaba.griver.core.jsapi.dialog.DefaultDialogImplExtension;
import com.alibaba.griver.core.jsapi.dialog.GriverUniformDialogExtension;
import com.alibaba.griver.core.jsapi.dialog.GriverUniformPromptExtension;
import com.alibaba.griver.core.jsapi.logging.HandleLoggingActionBridgeExtension;
import com.alibaba.griver.core.jsapi.logging.RVPerformanceTrackerImpl;
import com.alibaba.griver.core.jsapi.logging.TrackerConfigBridgeExtension;
import com.alibaba.griver.core.jsapi.share.GriverDefaultShareMenuExtensionImpl;
import com.alibaba.griver.core.jsapi.share.GriverShareExtensionImpl;
import com.alibaba.griver.core.jsapi.share.ShareBridgeExtension;
import com.alibaba.griver.core.jsapi.toast.DefaultToastImplExtension;
import com.alibaba.griver.core.point.GriverEventManifest;
import com.alibaba.griver.core.point.PageHelperPoint;
import com.alibaba.griver.core.proxy.GriverEmbedWebViewJsApiPermissionProxyImpl;
import com.alibaba.griver.core.proxy.GriverEngineFactoryImpl;
import com.alibaba.griver.core.proxy.GriverPageFactory;
import com.alibaba.griver.core.proxy.GriverRemoteDebugProxy;
import com.alibaba.griver.core.proxy.GriverScreenOrientationProxyImpl;
import com.alibaba.griver.core.proxy.GriverStartClientProxy;
import com.alibaba.griver.core.proxy.GriverStartPageFailedExtensionImpl;
import com.alibaba.griver.core.proxy.GriverUcServiceProxy;
import com.alibaba.griver.core.proxy.GriverViewFactoryImpl;
import com.alibaba.griver.core.render.extensions.GriverBridgeInjectExtension;
import com.alibaba.griver.core.render.extensions.GriverDefaultWebViewReceivedErrorExtension;
import com.alibaba.griver.core.render.extensions.GriverPageAbnormalExtension;
import com.alibaba.griver.core.resource.GriverParseFailedExtension;
import com.alibaba.griver.core.ui.auth.UniformLocalAuthDialogExtensionImpl;
import com.alibaba.griver.core.ui.loading.GriverPageLoadingExtension;
import com.alibaba.griver.core.ui.menu.GriverAboutUrlExtensionImpl;
import com.alibaba.griver.core.ui.menu.GriverMenuExtensionImpl;
import com.alibaba.griver.core.ui.menu.UniformOptionMenuPanelExtensionImpl;
import com.alibaba.griver.core.update.GriverAsyncUpdateManagerImpl;
import com.alibaba.griver.core.utils.c;
import com.alibaba.griver.device.DeviceManifest;
import com.alibaba.griver.file.FileManifest;
import com.alibaba.griver.h5.GriverH5Manifest;
import com.alibaba.griver.h5.api.GriverSessionDataPoint;
import com.alibaba.griver.image.GriverImageService;
import com.alibaba.griver.image.ImageManifest;
import com.alibaba.griver.image.ImageServiceImpl;
import com.alibaba.griver.map.MapManifest;
import com.alibaba.griver.socket.SocketManifest;
import com.alibaba.griver.ui.extension.TitleBarExtension;
import com.alibaba.griver.ui.extension.WebContentExtension;
import com.alibaba.griver.ui.loading.GriverDefaultLoadingView;
import com.alibaba.griver.ui.popmenu.H5TinyPopMenu;
import com.alibaba.griver.ui.splash.SplashFragment;
import com.alibaba.griver.v8.V8Manifest;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Keep
public class GriverManifest extends BaseManifest {
    private static final String BUNDLE_NAME = "com-alibaba-griver";
    private static final String TAG = "GriverManifest";

    public List<RVManifest.IProxyManifest> getProxies() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(GriverBaseManifest.getInstance().getProxies());
        arrayList.add(new RVManifest.LazyProxyManifest(RVPerformanceTracker.class, new RVProxy.LazyGetter<RVPerformanceTracker>() {
            public RVPerformanceTracker get() {
                return new RVPerformanceTrackerImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVNativePermissionRequestProxy.class, new RVProxy.LazyGetter<RVNativePermissionRequestProxy>() {
            public RVNativePermissionRequestProxy get() {
                return new RVNativePermissionRequestManager();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVWebSocketProxy.class, new RVProxy.LazyGetter<RVWebSocketProxy>() {
            public RVWebSocketProxy get() {
                return new DefaultWebSocketProxyImpl();
            }
        }));
        arrayList.add(new RVManifest.ProxyManifest(RVNativePermissionRequestProxy.class, new RVNativePermissionRequestManager()));
        arrayList.add(new RVManifest.LazyProxyManifest(RVLogger.Proxy.class, new RVProxy.LazyGetter<RVLogger.Proxy>() {
            public RVLogger.Proxy get() {
                return new GriverRVLoggerProxyImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVMonitor.class, new RVProxy.LazyGetter<RVMonitor>() {
            public RVMonitor get() {
                return new GriverRVMonitorImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVEnvironmentService.class, new RVProxy.LazyGetter<RVEnvironmentService>() {
            public RVEnvironmentService get() {
                return new GriverRVEnvironmentServiceImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVAccountService.class, new RVProxy.LazyGetter<RVAccountService>() {
            public RVAccountService get() {
                return new GriverRVAccountServiceImpl();
            }
        }));
        AppUpdaterFactory.registerRule(new AppUpdaterFactory.Rule() {
            public IAppUpdater findUpdater(String str, @Nullable Bundle bundle) {
                return new GriverRVAppUpdaterImpl();
            }
        });
        arrayList.add(new RVManifest.LazyProxyManifest(RVResourcePresetProxy.class, new RVProxy.LazyGetter<RVResourcePresetProxy>() {
            public RVResourcePresetProxy get() {
                return new GriverRVResourcePresetImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVExecutorService.class, new RVProxy.LazyGetter<RVExecutorService>() {
            public RVExecutorService get() {
                return new GriverRVExecutorServiceImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(EngineFactory.class, new RVProxy.LazyGetter<EngineFactory>() {
            public EngineFactory get() {
                return new GriverEngineFactoryImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(EmbedWebViewJsApiPermissionProxy.class, new RVProxy.LazyGetter<EmbedWebViewJsApiPermissionProxy>() {
            public EmbedWebViewJsApiPermissionProxy get() {
                return new GriverEmbedWebViewJsApiPermissionProxyImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVClientStarter.class, new RVProxy.LazyGetter<RVClientStarter>() {
            public RVClientStarter get() {
                return new GriverStartClientProxy();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVViewFactory.class, new RVProxy.LazyGetter<RVViewFactory>() {
            public RVViewFactory get() {
                return new GriverViewFactoryImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVConfigService.class, new RVProxy.LazyGetter<RVConfigService>() {
            public RVConfigService get() {
                return new GriverRVConfigServiceImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(AuthenticationProxy.class, new RVProxy.LazyGetter<AuthenticationProxy>() {
            public AuthenticationProxy get() {
                return new GriverAuthentication();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVAppInfoManager.class, new RVProxy.LazyGetter<RVAppInfoManager>() {
            public RVAppInfoManager get() {
                return new GriverRVAppInfoManagerImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVResourceManager.class, new RVProxy.LazyGetter<RVResourceManager>() {
            public RVResourceManager get() {
                return new GriverRVResourceManagerImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVPluginResourceManager.class, new RVProxy.LazyGetter<RVPluginResourceManager>() {
            public RVPluginResourceManager get() {
                return new GriverRVPluginResourceManagerImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVTransportService.class, new RVProxy.LazyGetter<RVTransportService>() {
            public RVTransportService get() {
                return new GriverRVTransortServiceImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverLoadingViewExtension.class, new RVProxy.LazyGetter<GriverLoadingViewExtension>() {
            public GriverLoadingViewExtension get() {
                return new GriverDefaultLoadingView();
            }
        }));
        if (ReflectUtils.classExist("com.alibaba.griver.v8.V8Manifest")) {
            try {
                arrayList.addAll(V8Manifest.getInstance().getProxies());
            } catch (Exception e) {
                GriverLogger.e(TAG, "Load socket manifest failed", e);
            }
        }
        arrayList.add(new RVManifest.LazyProxyManifest(RVPageFactory.class, new RVProxy.LazyGetter<RVPageFactory>() {
            public RVPageFactory get() {
                return new GriverPageFactory();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(EmbedViewProvider.class, new RVProxy.LazyGetter<EmbedViewProvider>() {
            public EmbedViewProvider get() {
                return new NXEmbedViewFactory();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(NXUcService.class, new RVProxy.LazyGetter<NXUcService>() {
            public NXUcService get() {
                return new GriverUcServiceProxy();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVRemoteDebugProxy.class, new RVProxy.LazyGetter<RVRemoteDebugProxy>() {
            public RVRemoteDebugProxy get() {
                return new GriverRemoteDebugProxy();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(TinyAppInnerProxy.class, new RVProxy.LazyGetter<TinyAppInnerProxy>() {
            public TinyAppInnerProxy get() {
                return new GriverRVInnerAppProxyImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(AuthDialogProxy.class, new RVProxy.LazyGetter<AuthDialogProxy>() {
            public AuthDialogProxy get() {
                return new NebulaAuthDialogProxy();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(KVStorageProxy.class, new RVProxy.LazyGetter<KVStorageProxy>() {
            public KVStorageProxy get() {
                return new GriverRVKVStorageProxyImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVPerformanceTracker.class, new RVProxy.LazyGetter<RVPerformanceTracker>() {
            public RVPerformanceTracker get() {
                return new RVPerformanceTrackerImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVResourceEnviromentProxy.class, new RVProxy.LazyGetter<RVResourceEnviromentProxy>() {
            public RVResourceEnviromentProxy get() {
                return new GriverRVResourceEnvProxyImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVNativePermissionRequestProxy.class, new RVProxy.LazyGetter<RVNativePermissionRequestProxy>() {
            public RVNativePermissionRequestProxy get() {
                return new RVNativePermissionRequestManager();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverDialogExtension.class, new RVProxy.LazyGetter<GriverDialogExtension>() {
            public GriverDialogExtension get() {
                return new GriverUniformDialogExtension();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverPromptExtension.class, new RVProxy.LazyGetter<GriverPromptExtension>() {
            public GriverPromptExtension get() {
                return new GriverUniformPromptExtension();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverWebViewReceivedErrorExtension.class, new RVProxy.LazyGetter<GriverWebViewReceivedErrorExtension>() {
            public GriverWebViewReceivedErrorExtension get() {
                return new GriverDefaultWebViewReceivedErrorExtension();
            }
        }));
        if (ReflectUtils.classExist("com.alibaba.griver.ui.GriverViewFactoryImpl")) {
            arrayList.add(new RVManifest.LazyProxyManifest(GVViewFactory.class, new RVProxy.LazyGetter<GVViewFactory>() {
                public GVViewFactory get() {
                    return new com.alibaba.griver.ui.GriverViewFactoryImpl();
                }
            }));
        }
        if (ReflectUtils.classExist("com.alibaba.griver.image.ImageServiceImpl")) {
            arrayList.add(new RVManifest.LazyProxyManifest(GriverImageService.class, new RVProxy.LazyGetter<GriverImageService>() {
                public GriverImageService get() {
                    return new ImageServiceImpl();
                }
            }));
        }
        arrayList.add(new RVManifest.LazyProxyManifest(GriverMonitorProxy.class, new RVProxy.LazyGetter<GriverMonitorProxy>() {
            public GriverMonitorProxy get() {
                return a.a();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverAppExtension.class, new RVProxy.LazyGetter<GriverAppExtension>() {
            public GriverAppExtension get() {
                return new GriverAppExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverSplashFragmentExtension.class, new RVProxy.LazyGetter<GriverSplashFragmentExtension>() {
            public GriverSplashFragmentExtension get() {
                return new GriverSplashFragmentExtension() {
                    public GriverSplashFragmentExtension.AbstractSplashFragment createSplashFragment() {
                        return new SplashFragment();
                    }
                };
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverHttpRequestAPIExtension.class, new RVProxy.LazyGetter<GriverHttpRequestAPIExtension>() {
            public GriverHttpRequestAPIExtension get() {
                return new DefaultHttpRequestAPIExtension();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverAppLanguageExtension.class, new RVProxy.LazyGetter<GriverAppLanguageExtension>() {
            public GriverAppLanguageExtension get() {
                return new GriverAppLanguageExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(WebViewSettingExtension.class, new RVProxy.LazyGetter<WebViewSettingExtension>() {
            public WebViewSettingExtension get() {
                return new DefaultWebViewSettingExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverGeoLocationExtension.class, new RVProxy.LazyGetter<GriverGeoLocationExtension>() {
            public GriverGeoLocationExtension get() {
                return new GriverGeoLocationExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(RVScreenOrientationProxy.class, new RVProxy.LazyGetter<RVScreenOrientationProxy>() {
            @Nullable
            public RVScreenOrientationProxy get() {
                return new GriverScreenOrientationProxyImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverStartPageFailedExtension.class, new RVProxy.LazyGetter<GriverStartPageFailedExtension>() {
            @Nullable
            public GriverStartPageFailedExtension get() {
                return new GriverStartPageFailedExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverActivityRestoreExtension.class, new RVProxy.LazyGetter<GriverActivityRestoreExtension>() {
            @Nullable
            public GriverActivityRestoreExtension get() {
                return new GriverActivityRestoreExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverMenuExtension.class, new RVProxy.LazyGetter<GriverMenuExtension>() {
            @Nullable
            public GriverMenuExtension get() {
                return new GriverMenuExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverAboutUrlExtension.class, new RVProxy.LazyGetter<GriverAboutUrlExtension>() {
            @Nullable
            public GriverAboutUrlExtension get() {
                return new GriverAboutUrlExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverShareExtension.class, new RVProxy.LazyGetter<GriverShareExtension>() {
            @Nullable
            public GriverShareExtension get() {
                return new GriverShareExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverShareMenuExtension.class, new RVProxy.LazyGetter<GriverShareMenuExtension>() {
            @Nullable
            public GriverShareMenuExtension get() {
                return new GriverDefaultShareMenuExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverAsyncUpdateManager.class, new RVProxy.LazyGetter<GriverAsyncUpdateManager>() {
            @Nullable
            public GriverAsyncUpdateManager get() {
                return new GriverAsyncUpdateManagerImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverNetworkPermissionExtension.class, new RVProxy.LazyGetter<GriverNetworkPermissionExtension>() {
            @Nullable
            public GriverNetworkPermissionExtension get() {
                return new GriverNetworkPermissionExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverLocalAuthDialogExtension.class, new RVProxy.LazyGetter<GriverLocalAuthDialogExtension>() {
            @Nullable
            public GriverLocalAuthDialogExtension get() {
                return new UniformLocalAuthDialogExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverOptionMenuPanelExtension.class, new RVProxy.LazyGetter<GriverOptionMenuPanelExtension>() {
            @Nullable
            public GriverOptionMenuPanelExtension get() {
                return new UniformOptionMenuPanelExtensionImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverMonitorAnalyticsConfigExtension.class, new RVProxy.LazyGetter<GriverMonitorAnalyticsConfigExtension>() {
            public GriverMonitorAnalyticsConfigExtension get() {
                return new GriverMonitorAnalyticsConfigExtensionImpl();
            }
        }));
        Map<Class<? extends GriverExtension>, GriverExtension> extensionMap = GriverExtensionDelegate.getInstance().getExtensionMap();
        if (extensionMap != null && extensionMap.size() > 0) {
            for (Map.Entry next : extensionMap.entrySet()) {
                arrayList.add(new RVManifest.ProxyManifest((Class) next.getKey(), (Proxiable) next.getValue()));
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.device.DeviceManifest")) {
            try {
                arrayList.addAll(DeviceManifest.getInstance().getProxies());
            } catch (Exception e2) {
                GriverLogger.e(TAG, "Load device manifest failed", e2);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.bluetooth.BluetoothManifest")) {
            try {
                arrayList.addAll(BluetoothManifest.getInstance().getProxies());
            } catch (Exception e3) {
                GriverLogger.e(TAG, "Load bluetooth manifest failed", e3);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.file.FileManifest")) {
            try {
                arrayList.addAll(FileManifest.getInstance().getProxies());
            } catch (Exception e4) {
                GriverLogger.e(TAG, "Load file manifest failed", e4);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.socket.SocketManifest")) {
            try {
                arrayList.addAll(SocketManifest.getInstance().getProxies());
            } catch (Exception e5) {
                GriverLogger.e(TAG, "Load socket manifest failed", e5);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.base.common.CommonAbilityManifest")) {
            try {
                arrayList.addAll(CommonAbilityManifest.getInstance().getProxies());
            } catch (Exception e6) {
                GriverLogger.e(TAG, "Load common ability manifest failed", e6);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.h5.GriverH5Manifest")) {
            try {
                arrayList.addAll(GriverH5Manifest.getInstance().getProxies());
            } catch (Exception e7) {
                GriverLogger.e(TAG, "Load h5 manifest failed", e7);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.map.MapManifest")) {
            try {
                arrayList.addAll(MapManifest.getInstance().getProxies());
            } catch (Exception e8) {
                GriverLogger.e(TAG, "Load map manifest failed", e8);
            }
        }
        return arrayList;
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.ui.popmenu.CustomPopMenuExtension", Arrays.asList(new String[]{H5TinyPopMenu.DEVELOPER_CUSTOM_MENU})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.toast.ToastBridgeExtension", Arrays.asList(new String[]{ApiDowngradeConstant.ActionType.TOAST, "hideToast"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.datepicker.DatePickerBridgeExtension", Arrays.asList(new String[]{"datePicker"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.dialog.DialogBridgeExtension", Arrays.asList(new String[]{ApiDowngradeConstant.ActionType.ALERT, "confirm", "prompt"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.loading.LoadingBridgeExtension", Arrays.asList(new String[]{"showLoading", "hideLoading"}), Page.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.app.WindowBridgeExtension", Arrays.asList(new String[]{"popTo", RVStartParams.FROM_TYPE_PUSH_WINDOW, "popWindow"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.app.TitleBarBridgeExtension", Arrays.asList(new String[]{GriverEvents.EVENT_SET_TITLE, "getTitleAndStatusbarHeight", "getTitleAndStatusBarHeight", "setTitleColor", "setBarBottomLineColor", "setTransparentTitle", "getTitleColor", "showTitleLoading", "hideTitleLoading", "showOptionMenu", "hideOptionMenu", "setOptionMenu", GriverEvents.EVENT_SHOW_BACK_BUTTON, "hideBackButton"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.app.TabBarBridgeExtension", Arrays.asList(new String[]{"setTabBar", "switchTab"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.actionsheet.ActionSheetBridgeExtension", Arrays.asList(new String[]{"actionSheet"}), Page.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.app.MiniProgramBridgeExtension", Arrays.asList(new String[]{"navigateToMiniProgram", "navigateBackMiniProgram", "getRunScene", "getExtConfig", "registerUpdateManager", "applyUpdate"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.ui.jsapi.picker.PickerBridgeExtension", Arrays.asList(new String[]{"beehiveOptionsPicker", "beehiveMultilevelSelect"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.ui.extension.TinyAppBackHomeExtension", Arrays.asList(new String[]{"showBackHome"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.pullrefresh.PullRefreshBridgeExtension", Arrays.asList(new String[]{"startPullDownRefresh", "restorePullToRefresh", "setCanPullDown"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.ui.AppearanceBridgeExtension", Arrays.asList(new String[]{"setBackgroundColor", "setBackgroundTextStyle", "hideShareMenu", "hideOptionMenuItem"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.aboutinfo.AboutInfoBridgeExtension", Arrays.asList(new String[]{"getAboutInfo"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.device.network.NetworkBridgeExtension", Arrays.asList(new String[]{"getNetworkType"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.device.system.SystemInfoBridgeExtension", Arrays.asList(new String[]{"getSystemInfo"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.engine.InputBridgeExtension", Arrays.asList(new String[]{"toggleSoftInput", "showSoftInput", "inputFocus4Android"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.device.keyboard.KeyboardBridgeExtension", Arrays.asList(new String[]{"hideKeyboard"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.device.clipboard.ClipboardBridgeExtension", Arrays.asList(new String[]{"getClipboard", "setClipboard"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.device.storage.StorageBridgeExtension", Arrays.asList(new String[]{"setTinyLocalStorage", "getTinyLocalStorage", "removeTinyLocalStorage", "clearTinyLocalStorage", "getTinyLocalStorageInfo"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.device.location.LocationBridgeExtension", Arrays.asList(new String[]{"getCurrentLocation"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.device.network.RequestBridgeExtension", Arrays.asList(new String[]{RequestPermissionsEvent.REQUEST, "httpRequest"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.diagnostic.DiagnosticBridgeExtension", Arrays.asList(new String[]{"griverInternalDiagnoticTool"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.engine.OrientationBridgeExtension", Arrays.asList(new String[]{"getScreenOrientation", "setScreenOrientation"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.worker.WorkerBridgeExtension", Arrays.asList(new String[]{"registerWorker", "postMessage"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.extensions.GriverEmbedViewBridgeExtension", Arrays.asList(new String[]{"NBComponent.render", "NBComponent.sendMessage"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.embedview.EmbedWebViewBridgeExtension", Arrays.asList(new String[]{"postWebViewMessage"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.engine.EngineBridgeExtension", Arrays.asList(new String[]{"measureText", "checkJSAPI", "h5PageReload"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.internalapi.InternalApiBridgeExtension", Arrays.asList(new String[]{"internalAPI"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, HandleLoggingActionBridgeExtension.class.getName(), Arrays.asList(new String[]{"handleLoggingAction"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, TrackerConfigBridgeExtension.class.getName(), Arrays.asList(new String[]{"trackerConfig"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.core.jsapi.subpackage.SubPackageBridgeExtension", Arrays.asList(new String[]{"loadSubPackage"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, ClientAppBridgeExtension.class.getName(), Arrays.asList(new String[]{"updateClientApp"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, GetAppInfoBridgeExtension.class.getName(), Arrays.asList(new String[]{"fetchAppInfoListByIds", "fetchAppInfoListByKeyword"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, ShareBridgeExtension.class.getName(), Arrays.asList(new String[]{"shareTinyAppMsg"})));
        if (ReflectUtils.classExist("com.alibaba.griver.device.DeviceManifest")) {
            try {
                arrayList.addAll(DeviceManifest.getInstance().getBridgeExtensions());
            } catch (Exception e) {
                GriverLogger.e(TAG, "Load device extension failed", e);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.bluetooth.BluetoothManifest")) {
            try {
                arrayList.addAll(BluetoothManifest.getInstance().getBridgeExtensions());
            } catch (Exception e2) {
                GriverLogger.e(TAG, "Load bluetooth extension failed", e2);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.image.ImageManifest")) {
            try {
                arrayList.addAll(ImageManifest.getInstance().getBridgeExtensions());
            } catch (Exception e3) {
                GriverLogger.e(TAG, "Load bluetooth extension failed", e3);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.file.FileManifest")) {
            try {
                arrayList.addAll(FileManifest.getInstance().getBridgeExtensions());
            } catch (Exception e4) {
                GriverLogger.e(TAG, "Load file extension failed", e4);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.map.MapManifest")) {
            try {
                arrayList.addAll(MapManifest.getInstance().getBridgeExtensions());
            } catch (Exception e5) {
                GriverLogger.e(TAG, "Load file extension failed", e5);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.socket.SocketManifest")) {
            try {
                arrayList.addAll(SocketManifest.getInstance().getBridgeExtensions());
            } catch (Exception e6) {
                GriverLogger.e(TAG, "Load socket extension failed", e6);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.base.common.CommonAbilityManifest")) {
            try {
                arrayList.addAll(CommonAbilityManifest.getInstance().getBridgeExtensions());
            } catch (Exception e7) {
                GriverLogger.e(TAG, "Load common ability bridge extension failed", e7);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.h5.GriverH5Manifest")) {
            try {
                arrayList.addAll(GriverH5Manifest.getInstance().getBridgeExtensions());
            } catch (Exception e8) {
                GriverLogger.e(TAG, "Load h5 bridge extension failed", e8);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.biz.GriverBizManifest")) {
            try {
                arrayList.addAll(GriverBizManifest.getInstance().getBridgeExtensions());
            } catch (Exception e9) {
                GriverLogger.e(TAG, "Load biz bridge extension failed", e9);
            }
        }
        registerBridge(arrayList);
        return arrayList;
    }

    public List<ExtensionMetaInfo> getExtensions() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.resource.runtime.GriverResourceLoadExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.app.AppStartPoint", "com.alibaba.ariver.app.api.point.app.AppLoadPoint", "com.alibaba.ariver.app.api.point.app.AppDestroyPoint", "com.alibaba.ariver.app.api.point.engine.EngineInitSuccessPoint", "com.alibaba.ariver.engine.api.resources.ResourceLoadPoint", "com.alibaba.ariver.app.api.point.view.TabBarInfoQueryPoint"}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.resource.api.snapshot.SnapshotSaveExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.page.PagePausePoint", "com.alibaba.ariver.app.api.point.app.PushWindowPoint"}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.app.extensions.AppRestartExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.app.AppRestartPoint"}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.jsapi.logging.PerformancePubExtension", Arrays.asList(new String[]{"com.alibaba.ariver.app.api.monitor.RVPub"})));
        linkedList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.permission.extension.AppPermissionInitExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.resource.api.extension.PackageParsedPoint", "com.alibaba.ariver.app.api.point.app.AppDestroyPoint"}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.permission.extension.EventSendInterceptorExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.engine.api.security.EventSendInterceptorPoint"}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.integration.proxy.impl.CommonAppExitExtension", Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.app.AppExitPoint"})));
        linkedList.add(new ExtensionMetaInfo(RVConstants.ARIVER_BUNDLE_NAME, "com.alibaba.ariver.tools.extension.RVToolsActivityHelperOnCreateFinishedExtension", (List<String>) Arrays.asList(new String[]{"com.alibaba.ariver.app.api.point.activity.ActivityHelperOnCreateFinishedPoint"}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo("ariver", ResourceProviderExtension.class.getName(), (List<String>) Collections.singletonList(ResourceProviderPoint.class.getName()), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo("ariver", BridgeAccessExtension.class.getName(), (List<String>) Collections.singletonList(BridgeAccessPoint.class.getName()), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo("ariver", GriverPackageQueryExtension.class.getName(), Collections.singletonList(PackageQueryPoint.class.getName())));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, DefaultAppExtension.class.getName(), (List<String>) Arrays.asList(new String[]{AppStartPoint.class.getName(), AppDestroyPoint.class.getName()}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo("ariver", AppPermissionInitExtension.class.getName(), (List<String>) Arrays.asList(new String[]{PackageParsedPoint.class.getName(), AppDestroyPoint.class.getName()}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo("ariver", WorkerManagerExtension.class.getName(), (List<String>) Arrays.asList(new String[]{CreateWorkerPoint.class.getName()}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverPageAbnormalExtension.class.getName(), (List<String>) Collections.singletonList(PageAbnormalPoint.class.getName()), (Class<? extends Scope>) Page.class));
        linkedList.add(new ExtensionMetaInfo("permission", EventSendInterceptorExtension.class.getName(), (List<String>) Collections.singletonList(EventSendInterceptorPoint.class.getName()), (Class<? extends Scope>) App.class));
        if (ReflectUtils.classExist("com.alibaba.griver.ui.extension.TitleBarExtension")) {
            linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, TitleBarExtension.class.getName(), (List<String>) Arrays.asList(new String[]{TitleBarOptionClickPoint.class.getName(), TitleBarShowClosePoint.class.getName(), ReceivedTitlePoint.class.getName()}), (Class<? extends Scope>) App.class));
        }
        if (ReflectUtils.classExist("com.alibaba.griver.ui.extension.WebContentExtension")) {
            linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, WebContentExtension.class.getName(), (List<String>) Arrays.asList(new String[]{TitleBarCloseClickPoint.class.getName(), BackPressedPoint.class.getName(), TitleBarTitleClickPoint.class.getName()}), (Class<? extends Scope>) Page.class));
        }
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, JSAPIMonitorExtension.class.getName(), Collections.singletonList(NativeCallResultPoint.class.getName())));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, DefaultDialogImplExtension.class.getName(), Arrays.asList(new String[]{DialogPoint.class.getName()})));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, DefaultToastImplExtension.class.getName(), Arrays.asList(new String[]{ToastPoint.class.getName()})));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverParseFailedExtension.class.getName(), (List<String>) Arrays.asList(new String[]{GriverParseFailedPoint.class.getName()}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverSessionDataExtension.class.getName(), (List<String>) Arrays.asList(new String[]{GriverSessionDataPoint.class.getName()}), (Class<? extends Scope>) Page.class));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverPageLoadingExtension.class.getName(), (List<String>) Arrays.asList(new String[]{PageEnterPoint.class.getName(), PageFinishedPoint.class.getName(), PageErrorPoint.class.getName()}), (Class<? extends Scope>) Page.class));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverBridgeInjectExtension.class.getName(), (List<String>) Arrays.asList(new String[]{PageStartedPoint.class.getName(), PageFinishedPoint.class.getName(), ReceivedTitlePoint.class.getName()}), (Class<? extends Scope>) Page.class));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverLifeCycleMonitorExtension.class.getName(), Arrays.asList(new String[]{PagePausePoint.class.getName(), PageEnterPoint.class.getName(), PageResumePoint.class.getName(), PageExitPoint.class.getName(), PageDestroyPoint.class.getName()})));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, PageHelperPoint.class.getName(), Arrays.asList(new String[]{PageStartedPoint.class.getName(), PageResumePoint.class.getName(), PageFinishedPoint.class.getName(), PageExitPoint.class.getName(), PageProcessPoint.class.getName(), PageBackPoint.class.getName(), PagePausePoint.class.getName(), PageDestroyPoint.class.getName()})));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, TrackerExtension.class.getName(), (List<String>) Arrays.asList(new String[]{AppStartPoint.class.getName(), PageFinishedPoint.class.getName()}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverShouldLoadUrlExtension.class.getName(), (List<String>) Arrays.asList(new String[]{ShouldLoadUrlPoint.class.getName()}), (Class<? extends Scope>) Page.class));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, NXEmbedAppExtension.class.getName(), (List<String>) Arrays.asList(new String[]{BackKeyDownPoint.class.getName()}), (Class<? extends Scope>) App.class));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, NXEmbedPageExtension.class.getName(), (List<String>) Arrays.asList(new String[]{BackPressedPoint.class.getName()}), (Class<? extends Scope>) Page.class));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverBridgeNotFoundExtension.class.getName(), Arrays.asList(new String[]{NativeCallNotFoundPoint.class.getName()})));
        linkedList.add(new ExtensionMetaInfo(BUNDLE_NAME, GriverMonitorAnalyticsTriggerExtension.class.getName(), Arrays.asList(new String[]{AppOnLoadResultPoint.class.getName()})));
        registerPoint(linkedList);
        if (ReflectUtils.classExist("com.alibaba.griver.v8.V8Manifest")) {
            try {
                linkedList.addAll(V8Manifest.getInstance().getExtensions());
            } catch (Exception e) {
                GriverLogger.e(TAG, "Load V8 extension failed", e);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.device.DeviceManifest")) {
            try {
                linkedList.addAll(DeviceManifest.getInstance().getExtensions());
            } catch (Exception e2) {
                GriverLogger.e(TAG, "Load device extension failed", e2);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.bluetooth.BluetoothManifest")) {
            try {
                linkedList.addAll(BluetoothManifest.getInstance().getExtensions());
            } catch (Exception e3) {
                GriverLogger.e(TAG, "Load bluetooth extension failed", e3);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.file.FileManifest")) {
            try {
                linkedList.addAll(FileManifest.getInstance().getExtensions());
            } catch (Exception e4) {
                GriverLogger.e(TAG, "Load file extension failed", e4);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.socket.SocketManifest")) {
            try {
                linkedList.addAll(SocketManifest.getInstance().getExtensions());
            } catch (Exception e5) {
                GriverLogger.e(TAG, "Load socket extension failed", e5);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.base.common.CommonAbilityManifest")) {
            try {
                linkedList.addAll(CommonAbilityManifest.getInstance().getExtensions());
            } catch (Exception e6) {
                GriverLogger.e(TAG, "Load common ability extension failed", e6);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.h5.GriverH5Manifest")) {
            try {
                linkedList.addAll(GriverH5Manifest.getInstance().getExtensions());
            } catch (Exception e7) {
                GriverLogger.e(TAG, "Load h5 extension failed", e7);
            }
        }
        return linkedList;
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        List<RVManifest.ServiceBeanManifest> serviceBeans = super.getServiceBeans(extensionManager);
        if (serviceBeans == null) {
            serviceBeans = new ArrayList<>();
        }
        if (ReflectUtils.classExist("com.alibaba.griver.device.DeviceManifest")) {
            try {
                serviceBeans.addAll(DeviceManifest.getInstance().getServiceBeans(extensionManager));
            } catch (Exception e) {
                GriverLogger.e(TAG, "Load device service bean failed", e);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.bluetooth.BluetoothManifest")) {
            try {
                serviceBeans.addAll(BluetoothManifest.getInstance().getServiceBeans(extensionManager));
            } catch (Exception e2) {
                GriverLogger.e(TAG, "Load bluetooth service bean failed", e2);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.file.FileManifest")) {
            try {
                serviceBeans.addAll(FileManifest.getInstance().getServiceBeans(extensionManager));
            } catch (Exception e3) {
                GriverLogger.e(TAG, "Load file service bean failed", e3);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.socket.SocketManifest")) {
            try {
                serviceBeans.addAll(SocketManifest.getInstance().getServiceBeans(extensionManager));
            } catch (Exception e4) {
                GriverLogger.e(TAG, "Load socket service bean failed", e4);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.base.common.CommonAbilityManifest")) {
            try {
                serviceBeans.addAll(CommonAbilityManifest.getInstance().getServiceBeans(extensionManager));
            } catch (Exception e5) {
                GriverLogger.e(TAG, "Load common ability service bean failed", e5);
            }
        }
        if (ReflectUtils.classExist("com.alibaba.griver.h5.GriverH5Manifest")) {
            try {
                serviceBeans.addAll(GriverH5Manifest.getInstance().getServiceBeans(extensionManager));
            } catch (Exception e6) {
                GriverLogger.e(TAG, "Load h5 service bean failed", e6);
            }
        }
        return serviceBeans;
    }

    private void registerPoint(List<ExtensionMetaInfo> list) {
        List<GriverEventManifest> eventManifests = GriverExtensionDelegate.getInstance().getEventManifests();
        if (eventManifests != null && eventManifests.size() > 0) {
            for (GriverEventManifest a2 : eventManifests) {
                ExtensionMetaInfo a3 = c.a(a2);
                if (a3 != null) {
                    list.add(a3);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void registerBridge(java.util.List<com.alibaba.ariver.integration.RVManifest.BridgeExtensionManifest> r8) {
        /*
            r7 = this;
            com.alibaba.griver.core.GriverExtensionDelegate r0 = com.alibaba.griver.core.GriverExtensionDelegate.getInstance()
            java.util.List r0 = r0.getBridgeManifests()
            if (r0 == 0) goto L_0x00cc
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x00cc
            java.lang.String r1 = "h5_system_jsapi_list"
            java.lang.String r2 = ""
            java.lang.String r1 = com.alibaba.griver.base.common.config.GriverInnerConfig.getConfig(r1, r2)
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x002e
            com.alibaba.griver.core.GriverManifest$56 r2 = new com.alibaba.griver.core.GriverManifest$56
            r2.<init>()
            r3 = 0
            com.alibaba.fastjson.parser.Feature[] r3 = new com.alibaba.fastjson.parser.Feature[r3]
            java.lang.Object r1 = com.alibaba.fastjson.JSONObject.parseObject((java.lang.String) r1, r2, (com.alibaba.fastjson.parser.Feature[]) r3)
            r2 = r1
            java.util.List r2 = (java.util.List) r2
        L_0x002e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0032:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r0.next()
            com.alibaba.griver.core.bridge.GriverBridgeManifest r1 = (com.alibaba.griver.core.bridge.GriverBridgeManifest) r1
            java.lang.String r3 = r1.getClassName()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0032
            java.util.List r3 = r1.getActionList()
            if (r3 == 0) goto L_0x0032
            java.util.List r3 = r1.getActionList()
            int r3 = r3.size()
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r1.getClassName()
            boolean r3 = com.alibaba.griver.base.common.utils.ReflectUtils.classExist(r3)
            if (r3 == 0) goto L_0x0032
            if (r2 == 0) goto L_0x00a7
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x00a7
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.List r4 = r1.getActionList()
            java.util.Iterator r4 = r4.iterator()
        L_0x0077:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a4
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r2.contains(r5)
            if (r6 != 0) goto L_0x008d
            r3.add(r5)
            goto L_0x0077
        L_0x008d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " is not register"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "GriverManifest"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r6, r5)
            goto L_0x0077
        L_0x00a4:
            r1.setActionList(r3)
        L_0x00a7:
            java.util.List r3 = r1.getActionList()
            if (r3 == 0) goto L_0x0032
            java.util.List r3 = r1.getActionList()
            int r3 = r3.size()
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r1.getClassName()
            java.lang.String r4 = r1.getClassName()
            java.util.List r1 = r1.getActionList()
            com.alibaba.ariver.integration.RVManifest$BridgeExtensionManifest r1 = com.alibaba.ariver.integration.RVManifest.BridgeExtensionManifest.makeRaw(r3, r4, r1)
            r8.add(r1)
            goto L_0x0032
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.GriverManifest.registerBridge(java.util.List):void");
    }
}
