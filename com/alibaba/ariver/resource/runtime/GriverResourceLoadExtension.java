package com.alibaba.ariver.resource.runtime;

import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppLoadResult;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppLoadInterceptorPoint;
import com.alibaba.ariver.app.api.point.app.AppLoadPoint;
import com.alibaba.ariver.app.api.point.app.AppOnLoadResultPoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.app.api.point.engine.EngineInitSuccessPoint;
import com.alibaba.ariver.app.api.point.view.TabBarInfoQueryPoint;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.engine.api.resources.ResourceLoadPoint;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.content.ResourceProvider;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.extension.PackageQueryPoint;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.ariver.resource.api.models.TemplateExtModel;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.ariver.resource.api.proxy.RVResourceEnviromentProxy;
import com.alibaba.ariver.resource.api.storage.TabBarDataStorage;
import com.alibaba.ariver.resource.content.GlobalPackagePool;
import com.alibaba.ariver.resource.content.MainResourcePackage;
import com.alibaba.ariver.resource.content.ResourcePackagePool;
import com.alibaba.ariver.resource.template.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.api.GriverPerformanceStages;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.nebula.GriverWebViewFlag;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@Keep
public class GriverResourceLoadExtension implements AppDestroyPoint, AppLoadPoint, AppOnLoadResultPoint, AppStartPoint, EngineInitSuccessPoint, TabBarInfoQueryPoint, ResourceLoadPoint, NodeAware<App> {
    private static final String FILE_APP_CONFIG = "appConfig.json";
    private static final String FILE_TABBAR = "tabBar.json";
    private static final String TAG = "AriverRes:GriverResourceLoadExtension";
    private App mApp = null;
    private ConditionVariable mContentProviderSyncLock = new ConditionVariable();
    private List<ResourcePackage> mLockingPackages = new CopyOnWriteArrayList();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onAppStart(App app) {
        ResourceContext onAppLoad = ResourceContextManager.getInstance().onAppLoad(app.getAppId());
        StringBuilder sb = new StringBuilder("onAppStart: ");
        sb.append(app.getAppId());
        sb.append(" on resourceContext: ");
        sb.append(onAppLoad);
        RVLogger.d(TAG, sb.toString());
        onAppLoad.setApp(app);
        onAppLoad.setAppId(app.getAppId());
        onAppLoad.setStartParams(app.getStartParams());
        onAppLoad.setSceneParams(app.getSceneParams());
    }

    public void loadApp(String str, Bundle bundle, Bundle bundle2, AppLoadPoint.LoadResultCallback loadResultCallback) {
        ResourcePackage resourcePackage;
        AppConfigModel parseFromJSON;
        String combinePath;
        String str2 = str;
        Bundle bundle3 = bundle;
        Bundle bundle4 = bundle2;
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_ResourceLoadExtension_loadApp_.concat(String.valueOf(str)));
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_ResourceLoadExtension_resourcePrepare_.concat(String.valueOf(str)));
        ResourceContext resourceContext = ResourceContextManager.getInstance().get(str2);
        AppLoadResult appLoadResult = new AppLoadResult();
        AppModel appModel = (AppModel) BundleUtils.getParcelable(bundle4, "appInfo");
        String string = BundleUtils.getString(bundle3, "url");
        StringBuilder sb = new StringBuilder("loadApp: ");
        sb.append(str2);
        sb.append(" on resourceContext: ");
        sb.append(resourceContext);
        sb.append(", appModel: ");
        sb.append(appModel);
        RVLogger.d(TAG, sb.toString());
        if (appModel == null) {
            RVLogger.d(TAG, "loadApp but not put appModel! get from DB now.");
            appModel = ((RVAppInfoManager) RVProxy.get(RVAppInfoManager.class)).getAppModel(AppInfoQuery.make(str).scene(AppInfoScene.extractScene(bundle)));
            bundle4.putParcelable("appInfo", appModel);
        }
        if (appModel != null) {
            appLoadResult.appVersion = appModel.getAppInfoModel().getVersion();
            String string2 = BundleUtils.getString(bundle3, "page");
            if (!TextUtils.isEmpty(string2)) {
                combinePath = FileUtils.combinePath(appModel.getAppInfoModel().getVhost(), "index.html#".concat(String.valueOf(string2)));
            } else {
                if (string.startsWith("/")) {
                    combinePath = FileUtils.combinePath(appModel.getAppInfoModel().getVhost(), string);
                }
                appLoadResult.mainJsUrl = acquireMainJsUrl(bundle3);
                resourceContext.setMainPackageInfo(appModel);
                this.mApp.setData(AppModel.class, appModel);
                this.mApp.getStartParams().putString("appVersion", appModel.getAppVersion());
                this.mApp.getStartParams().putString("version", appModel.getAppVersion());
            }
            string = combinePath;
            appLoadResult.mainJsUrl = acquireMainJsUrl(bundle3);
            resourceContext.setMainPackageInfo(appModel);
            this.mApp.setData(AppModel.class, appModel);
            this.mApp.getStartParams().putString("appVersion", appModel.getAppVersion());
            this.mApp.getStartParams().putString("version", appModel.getAppVersion());
        }
        resourceContext.appType = this.mApp.getAppType();
        appLoadResult.appType = this.mApp.getAppType();
        AppLoadInterceptorPoint create = ExtensionPoint.as(AppLoadInterceptorPoint.class).node(this.mApp).create();
        if (create != null) {
            create.intercept(str2, bundle3, bundle4, appLoadResult);
        }
        appLoadResult.mainHtmlUrl = string;
        this.mApp.getStartParams().putString("url", appLoadResult.mainHtmlUrl);
        PackageQueryPoint create2 = ExtensionPoint.as(PackageQueryPoint.class).node(this.mApp).create();
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_ResourceLoadExtension_loadMainResource_.concat(String.valueOf(str)));
        TemplateExtModel templateExtModel = null;
        if (appModel != null) {
            resourcePackage = create2.getMainPackage(resourceContext);
            if (resourcePackage == null) {
                resourcePackage = new MainResourcePackage(resourceContext);
            }
            resourcePackage.setup(true);
            if (resourcePackage.needWaitForSetup()) {
                this.mLockingPackages.add(resourcePackage);
            }
            resourceContext.setMainPackage(resourcePackage);
        } else {
            resourcePackage = null;
        }
        RVTraceUtils.traceEndSection(RVTraceKey.RV_ResourceLoadExtension_loadMainResource_.concat(String.valueOf(str)));
        Set<ResourcePackage> resourcePackages = create2.getResourcePackages(resourceContext);
        if (resourcePackages != null) {
            for (ResourcePackage next : resourcePackages) {
                ResourcePackagePool.getInstance().attach(next);
                if (next.needWaitForSetup() && !ResourcePackagePool.getInstance().contains(next.appId())) {
                    this.mLockingPackages.add(next);
                }
                resourceContext.attachResourcePackage(next.appId());
            }
        }
        if (!(appModel == null || appModel.getAppInfoModel() == null || appModel.getAppInfoModel().getPlugins() == null)) {
            for (PluginModel next2 : appModel.getAppInfoModel().getPlugins()) {
                RVLogger.d(TAG, "attach plugin model package: ".concat(String.valueOf(next2)));
                ResourcePackagePool.getInstance().attach(create2.createPluginPackage(next2, resourceContext));
                resourceContext.attachResourcePackage(next2.getAppId());
            }
        }
        resourceContext.setContentProvider(new a(resourceContext));
        RVLogger.d(TAG, "ContentProvider is ready");
        this.mContentProviderSyncLock.open();
        if (this.mApp.isTinyApp() && resourcePackage != null) {
            String appLanguage = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getAppLanguage();
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_ResourceLoadExtension_getAppConfig_.concat(String.valueOf(str)));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(appLanguage);
            sb2.append("/appConfig.json");
            Resource resource = resourcePackage.get(ResourceQuery.asUrl(sb2.toString()).setNeedAutoCompleteHost());
            RVTraceUtils.traceEndSection(RVTraceKey.RV_ResourceLoadExtension_getAppConfig_.concat(String.valueOf(str)));
            if (resource == null) {
                resource = resourcePackage.get(ResourceQuery.asUrl("appConfig.json").setNeedAutoCompleteHost());
            }
            if (!(resource == null || (parseFromJSON = AppConfigModel.parseFromJSON(resource.getBytes())) == null)) {
                fillConfigWithIncludeFile(resourceContext, parseFromJSON);
                fillConfigWithTemplate(parseFromJSON);
                RVLogger.d(TAG, "put appConfig.json ".concat(String.valueOf(parseFromJSON)));
                this.mApp.setData(AppConfigModel.class, parseFromJSON);
                this.mApp.getStartParams().putAll(JSONUtils.toBundle(parseFromJSON.getAppLaunchParams()));
            }
        }
        if (!(appModel == null || appModel.getAppInfoModel() == null || appModel.getAppInfoModel().getTemplateConfig() == null)) {
            TemplateConfigModel templateConfig = appModel.getAppInfoModel().getTemplateConfig();
            if (templateConfig.isTemplateValid()) {
                try {
                    templateExtModel = new a(appModel).get();
                    templateConfig.setExtModel(templateExtModel);
                } catch (Throwable th) {
                    RVLogger.e(TAG, "prepare template Config error!", th);
                }
                if (!(templateExtModel == null || templateExtModel.getTabBarObject() == null)) {
                    this.mApp.getStartParams().putSerializable(RVStartParams.KEY_TEMPLATE_TABBAR, templateExtModel.getTabBarObject());
                }
                this.mApp.getStartParams().putBoolean(RVStartParams.KEY_TEMPLATE_FLAG, true);
                this.mApp.getStartParams().putString(RVStartParams.KEY_TEMPLATE_ID, templateConfig.getTemplateId());
            }
        }
        RVTraceUtils.traceEndSection(RVTraceKey.RV_ResourceLoadExtension_resourcePrepare_.concat(String.valueOf(str)));
        loadResultCallback.onResult(appLoadResult);
        addLauncherParamResourcePackage(resourceContext);
        RVTraceUtils.traceEndSection(RVTraceKey.RV_ResourceLoadExtension_loadApp_.concat(String.valueOf(str)));
    }

    private void addLauncherParamResourcePackage(final ResourceContext resourceContext) {
        StringBuilder sb = new StringBuilder("addLauncherParamResourcePackage for ");
        sb.append(resourceContext.getAppId());
        RVLogger.d(TAG, sb.toString());
        final HashSet hashSet = new HashSet();
        JSONArray parseArray = JSONUtils.parseArray(BundleUtils.getString(resourceContext.getStartParams(), RVStartParams.KEY_ACCPKG_RES));
        if (parseArray != null && parseArray.size() > 0) {
            int size = parseArray.size();
            for (int i = 0; i < size; i++) {
                String string = parseArray.getString(i);
                if (!string.equals(resourceContext.getAppId())) {
                    hashSet.add(string);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            ExecutorUtils.execute(ExecutorType.URGENT, new Runnable() {
                public void run() {
                    for (String attach : hashSet) {
                        ResourcePackagePool.getInstance().attach(attach, resourceContext);
                    }
                }
            });
        }
    }

    private String acquireMainJsUrl(@NonNull Bundle bundle) {
        return FileUtils.combinePath(BundleUtils.getString(bundle, "onlineHost"), BundleUtils.getString(bundle, RVStartParams.KEY_BUNDLE_PATH));
    }

    public void onInitSuccess() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (ResourcePackage waitForSetup : this.mLockingPackages) {
            waitForSetup.waitForSetup();
        }
        this.mLockingPackages.clear();
        ResourceContext resourceContext = ResourceContextManager.getInstance().get(this.mApp.getAppId());
        if (resourceContext.getMainPackage() != null) {
            String appLanguage = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getAppLanguage();
            ResourcePackage mainPackage = resourceContext.getMainPackage();
            StringBuilder sb = new StringBuilder();
            sb.append(appLanguage);
            sb.append("/tabBar.json");
            Resource resource = mainPackage.get(ResourceQuery.asUrl(sb.toString()).setNeedAutoCompleteHost());
            if (resource == null) {
                resource = resourceContext.getMainPackage().get(ResourceQuery.asUrl("tabBar.json").setNeedAutoCompleteHost());
            }
            if (resource != null) {
                StringBuilder sb2 = new StringBuilder("put tabBar.json for ");
                sb2.append(this.mApp.getAppId());
                RVLogger.d(TAG, sb2.toString());
                resourceContext.tabBarDataStorage.onGetData((TabBarModel) JSONUtils.parseObject(resource.getBytes(), TabBarModel.class));
            } else {
                StringBuilder sb3 = new StringBuilder("cannot find tabBar.json for ");
                sb3.append(this.mApp.getAppId());
                RVLogger.w(TAG, sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder("waitForSetup cost ");
        sb4.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        RVLogger.d(TAG, sb4.toString());
    }

    private void fillConfigWithIncludeFile(ResourceContext resourceContext, AppConfigModel appConfigModel) {
        Resource resource;
        ResourcePackage mainPackage = resourceContext.getMainPackage();
        if (mainPackage != null) {
            String configVariable = ((RVResourceEnviromentProxy) RVProxy.get(RVResourceEnviromentProxy.class)).getConfigVariable();
            StringBuilder sb = new StringBuilder("fillConfigWithIncludeFile, configVar: ");
            sb.append(configVariable);
            sb.append(" includeFiles: ");
            sb.append(appConfigModel.getIncludeFiles());
            RVLogger.d(TAG, sb.toString());
            if (appConfigModel.getIncludeFiles() != null && !TextUtils.isEmpty(configVariable)) {
                StringBuilder sb2 = new StringBuilder("config/");
                sb2.append(configVariable);
                sb2.append(".json");
                String obj = sb2.toString();
                RVLogger.d(TAG, "try fillConfigWithIncludeFile with resource: ".concat(String.valueOf(obj)));
                if (appConfigModel.getIncludeFiles().contains(obj) && (resource = mainPackage.get(ResourceQuery.asUrl(obj).setNeedAutoCompleteHost())) != null) {
                    RVLogger.d(TAG, "try fillConfigWithIncludeFile hit");
                    JSONObject parseObject = JSONUtils.parseObject(resource.getBytes());
                    JSONObject jSONObject = JSONUtils.getJSONObject(parseObject, "window", (JSONObject) null);
                    if (jSONObject != null) {
                        RVLogger.d(TAG, "try fillConfigWithIncludeFile hit window");
                        appConfigModel.setAppLaunchParams(jSONObject);
                    }
                    JSONArray jSONArray = JSONUtils.getJSONArray(parseObject, SecurityConstants.KEY_PAGES, (JSONArray) null);
                    if (jSONArray != null) {
                        RVLogger.d(TAG, "try fillConfigWithIncludeFile hit pages");
                        ArrayList arrayList = new ArrayList();
                        int size = jSONArray.size();
                        for (int i = 0; i < size; i++) {
                            arrayList.add(jSONArray.getString(i));
                        }
                        appConfigModel.setPages(arrayList);
                    }
                    JSONObject jSONObject2 = JSONUtils.getJSONObject(parseObject, "extPages", (JSONObject) null);
                    if (jSONObject2 != null) {
                        RVLogger.d(TAG, "try fillConfigWithIncludeFile hit launchParams");
                        if (appConfigModel.getPageLaunchParams() == null) {
                            appConfigModel.setPageLaunchParams(jSONObject2);
                        } else {
                            appConfigModel.getPageLaunchParams().putAll(jSONObject2);
                        }
                        appConfigModel.setPageLaunchParams(jSONObject2);
                    }
                    String string = JSONUtils.getString(parseObject, "tabBar", (String) null);
                    Resource resource2 = resourceContext.getMainPackage().get(ResourceQuery.asUrl("tabBar.json").setNeedAutoCompleteHost());
                    if (resource2 == null) {
                        return;
                    }
                    if (string != null) {
                        RVLogger.d(TAG, "try fillConfigWithIncludeFile hit tabBar");
                        resource2.setBytes(string.getBytes());
                        return;
                    }
                    resourceContext.getMainPackage().remove(resource2.getUrl());
                }
            }
        }
    }

    private void fillConfigWithTemplate(AppConfigModel appConfigModel) {
        AppModel appModel = (AppModel) this.mApp.getData(AppModel.class);
        if (appModel != null && appModel.getAppInfoModel() != null && appModel.getAppInfoModel().getTemplateConfig() != null) {
            TemplateConfigModel templateConfig = appModel.getAppInfoModel().getTemplateConfig();
            if (templateConfig.isTemplateValid() && templateConfig.getExtModel() != null) {
                TemplateExtModel extModel = templateConfig.getExtModel();
                if (extModel.getWindow() != null) {
                    if (appConfigModel.getAppLaunchParams() == null) {
                        appConfigModel.setAppLaunchParams(templateConfig.getExtModel().getWindow());
                    } else {
                        appConfigModel.getAppLaunchParams().putAll(templateConfig.getExtModel().getWindow());
                    }
                }
                if (extModel.getExtPages() == null) {
                    return;
                }
                if (appConfigModel.getPageLaunchParams() == null) {
                    appConfigModel.setPageLaunchParams(extModel.getExtPages());
                } else {
                    appConfigModel.getPageLaunchParams().putAll(extModel.getExtPages());
                }
            }
        }
    }

    public Resource load(ResourceLoadContext resourceLoadContext) {
        StringBuilder sb = new StringBuilder("load resource begin: ");
        sb.append(resourceLoadContext.originUrl);
        RVLogger.d(TAG, sb.toString());
        ResourceContext resourceContext = ResourceContextManager.getInstance().get(this.mApp.getAppId());
        ResourceQuery canUseFallback = ResourceQuery.asUrl(resourceLoadContext.originUrl).setCanUseFallback(resourceLoadContext.canUseFallback);
        if (resourceContext.getContentProvider() != null) {
            return resourceContext.getContentProvider().getContent(canUseFallback);
        }
        if (resourceLoadContext.canDegradeGlobalPackage || ExecutorUtils.isMainThread()) {
            RVLogger.w(TAG, "load resource error content provider null!!! Just find for global package! ");
            return GlobalPackagePool.getInstance().get(canUseFallback);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb2 = new StringBuilder("appx-ng load resource error content provider null,and cannot DegradeGlobalPackage ");
        sb2.append(resourceLoadContext.originUrl);
        RVLogger.d(TAG, sb2.toString());
        this.mContentProviderSyncLock.block((long) Integer.valueOf(Integer.parseInt(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("ta_appxroute_load_wait", Result.ERROR_CODE_UNKNOWN_ERROR))).intValue());
        ResourceProvider contentProvider = resourceContext.getContentProvider();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (contentProvider != null) {
            StringBuilder sb3 = new StringBuilder("wait for contentprovide ready ");
            sb3.append(resourceLoadContext.originUrl);
            sb3.append("\t cost\t");
            sb3.append(elapsedRealtime2);
            RVLogger.d(TAG, sb3.toString());
            return contentProvider.getContent(canUseFallback);
        }
        StringBuilder sb4 = new StringBuilder("wait for contentprovide ready failed\t");
        sb4.append(resourceLoadContext.originUrl);
        sb4.append("\t cost\t");
        sb4.append(elapsedRealtime2);
        RVLogger.w(TAG, sb4.toString());
        return null;
    }

    public Resource loadGlobalResource(String str) {
        return GlobalPackagePool.getInstance().get(ResourceQuery.asUrl(str));
    }

    public void onAppDestroy(App app) {
        for (String detach : ResourceContextManager.getInstance().get(app.getAppId()).getResourcePackages()) {
            ResourcePackagePool.getInstance().detach(detach);
        }
        ResourceContextManager.getInstance().onAppDestroy(app.getAppId());
        closeAppMonitor(app);
    }

    public void setNode(WeakReference<App> weakReference) {
        this.mApp = weakReference.get();
    }

    public Class<App> getNodeType() {
        return App.class;
    }

    public void queryTabBarInfo(final TabBarInfoQueryPoint.OnTabBarInfoQueryListener onTabBarInfoQueryListener) {
        ResourceContextManager.getInstance().get(this.mApp.getAppId()).tabBarDataStorage.retrieveData(new TabBarDataStorage.Listener() {
            public void onGetData(TabBarModel tabBarModel) {
                onTabBarInfoQueryListener.onTabInfoGot(tabBarModel);
            }
        });
    }

    public void onLoadResult(App app, AppLoadResult appLoadResult) {
        if ("YES".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_MP_USE_NATIVE_CANVAS_VIEW)) && GriverWebViewFlag.ucReady) {
            app.getStartParams().putBoolean("hasNativeCanvas", true);
            app.getStartParams().putString("nativeCanvasVersion", "1.6.0");
            app.getStartParams().putBoolean("nativeCanvasCompactProtocol", true);
        }
    }

    private void closeAppMonitor(App app) {
        if (app != null) {
            MonitorMap.Builder builder = new MonitorMap.Builder();
            builder.appId(app.getAppId()).url(app.getStartUrl()).version(app).env(GriverEnv.getEnvironment()).needAsynAppType(true);
            builder.append(GriverMonitorConstants.MINI_PROGRAM_APP_LIFE_DURATION, String.valueOf(SystemClock.elapsedRealtime() - GriverPerformanceStages.jumpAppStart));
            GriverMonitor.event(GriverMonitorConstants.EVENT_APP_EXIT, "GriverAppContainer", builder.build());
        }
    }
}
