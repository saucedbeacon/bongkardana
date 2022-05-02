package com.alibaba.ariver.resource.runtime;

import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.app.api.point.app.AppCreatePoint;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppLoadPoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.app.api.point.engine.EngineInitSuccessPoint;
import com.alibaba.ariver.app.api.point.view.TabBarInfoQueryPoint;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.engine.api.resources.ResourceLoadPoint;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.extension.ResourceInterceptPoint;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.ariver.resource.api.models.TemplateExtModel;
import com.alibaba.ariver.resource.api.proxy.RVResourceEnviromentProxy;
import com.alibaba.ariver.resource.api.snapshot.ISnapshotProxy;
import com.alibaba.ariver.resource.api.snapshot.RVSnapshotUtils;
import com.alibaba.ariver.resource.api.storage.TabBarDataStorage;
import com.alibaba.ariver.resource.content.GlobalPackagePool;
import com.alibaba.ariver.resource.content.ResourcePackagePool;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Keep
public class ResourceLoadExtension implements AppCreatePoint, AppDestroyPoint, AppLoadPoint, AppStartPoint, EngineInitSuccessPoint, TabBarInfoQueryPoint, ResourceLoadPoint, NodeAware<App> {
    public static final String APPX_WORKER_JS_URL = "https://appx/af-appx.worker.min.js";
    private static final String TAG = "AriverRes:ResourceLoadExtension";
    private App mApp = null;
    private ConditionVariable mContentProviderSyncLock = new ConditionVariable();
    private ResourceInterceptPoint mInterceptPoint;
    /* access modifiers changed from: private */
    public List<ResourcePackage> mLockingPackages = new CopyOnWriteArrayList();

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
        if (this.mInterceptPoint == null) {
            this.mInterceptPoint = ExtensionPoint.as(ResourceInterceptPoint.class).node(onAppLoad.getApp()).create();
        }
    }

    public void onAppCreate(App app) {
        if (this.mInterceptPoint == null) {
            this.mInterceptPoint = ExtensionPoint.as(ResourceInterceptPoint.class).node(app).create();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x040f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadApp(java.lang.String r18, android.os.Bundle r19, android.os.Bundle r20, com.alibaba.ariver.app.api.point.app.AppLoadPoint.LoadResultCallback r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r3 = r20
            java.lang.String r4 = java.lang.String.valueOf(r18)
            java.lang.String r5 = "RV_ResourceLoadExtension_loadApp_"
            java.lang.String r4 = r5.concat(r4)
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r4)
            java.lang.String r4 = java.lang.String.valueOf(r18)
            java.lang.String r6 = "RV_ResourceLoadExtension_resourcePrepare_"
            java.lang.String r4 = r6.concat(r4)
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r4)
            com.alibaba.ariver.resource.runtime.ResourceContextManager r4 = com.alibaba.ariver.resource.runtime.ResourceContextManager.getInstance()
            com.alibaba.ariver.resource.api.ResourceContext r4 = r4.get(r2)
            com.alibaba.ariver.app.api.AppLoadResult r7 = new com.alibaba.ariver.app.api.AppLoadResult
            r7.<init>()
            java.lang.String r8 = "appInfo"
            android.os.Parcelable r9 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getParcelable(r3, r8)
            com.alibaba.ariver.resource.api.models.AppModel r9 = (com.alibaba.ariver.resource.api.models.AppModel) r9
            java.lang.String r10 = "url"
            java.lang.String r11 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r0, r10)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x0053
            if (r9 == 0) goto L_0x0053
            com.alibaba.ariver.resource.api.models.AppInfoModel r12 = r9.getAppInfoModel()
            if (r12 == 0) goto L_0x0053
            com.alibaba.ariver.resource.api.models.AppInfoModel r11 = r9.getAppInfoModel()
            java.lang.String r11 = r11.getMainUrl()
        L_0x0053:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "loadApp: "
            r12.<init>(r13)
            r12.append(r2)
            java.lang.String r13 = " on resourceContext: "
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = ", appModel: "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "AriverRes:ResourceLoadExtension"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r12)
            if (r9 != 0) goto L_0x0098
            java.lang.String r9 = "loadApp but not put appModel! get from DB now."
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r9)
            com.alibaba.ariver.resource.api.models.AppInfoScene r9 = com.alibaba.ariver.resource.api.models.AppInfoScene.extractScene(r19)
            java.lang.Class<com.alibaba.ariver.resource.api.proxy.RVAppInfoManager> r12 = com.alibaba.ariver.resource.api.proxy.RVAppInfoManager.class
            java.lang.Object r12 = com.alibaba.ariver.kernel.common.RVProxy.get(r12)
            com.alibaba.ariver.resource.api.proxy.RVAppInfoManager r12 = (com.alibaba.ariver.resource.api.proxy.RVAppInfoManager) r12
            com.alibaba.ariver.resource.api.models.AppInfoQuery r14 = com.alibaba.ariver.resource.api.models.AppInfoQuery.make(r18)
            com.alibaba.ariver.resource.api.models.AppInfoQuery r9 = r14.scene(r9)
            com.alibaba.ariver.resource.api.models.AppModel r9 = r12.getAppModel(r9)
            r3.putParcelable(r8, r9)
        L_0x0098:
            if (r9 == 0) goto L_0x012c
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            android.os.Bundle r8 = r8.getStartParams()
            com.alibaba.ariver.resource.api.models.AppInfoModel r12 = r9.getAppInfoModel()
            java.lang.String r12 = r12.getVhost()
            java.lang.String r14 = "onlineHost"
            r8.putString(r14, r12)
            com.alibaba.ariver.resource.api.models.AppInfoModel r8 = r9.getAppInfoModel()
            java.lang.String r8 = r8.getVersion()
            r7.appVersion = r8
            java.lang.String r8 = "page"
            java.lang.String r8 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r0, r8)
            com.alibaba.ariver.app.api.App r12 = r1.mApp
            boolean r12 = r12.isTinyApp()
            if (r12 == 0) goto L_0x00e2
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x00e2
            com.alibaba.ariver.resource.api.models.AppInfoModel r11 = r9.getAppInfoModel()
            java.lang.String r11 = r11.getVhost()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r12 = "index.html#"
            java.lang.String r8 = r12.concat(r8)
            java.lang.String r8 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r11, r8)
            goto L_0x00f6
        L_0x00e2:
            java.lang.String r8 = "/"
            boolean r8 = r11.startsWith(r8)
            if (r8 == 0) goto L_0x00f7
            com.alibaba.ariver.resource.api.models.AppInfoModel r8 = r9.getAppInfoModel()
            java.lang.String r8 = r8.getVhost()
            java.lang.String r8 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r8, r11)
        L_0x00f6:
            r11 = r8
        L_0x00f7:
            java.lang.String r8 = r1.acquireMainJsUrl(r0)
            r7.mainJsUrl = r8
            r4.setMainPackageInfo(r9)
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r12 = com.alibaba.ariver.resource.api.models.AppModel.class
            r8.setData(r12, r9)
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            java.lang.Class<com.alibaba.ariver.resource.api.ResourceContext> r12 = com.alibaba.ariver.resource.api.ResourceContext.class
            r8.setData(r12, r4)
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            android.os.Bundle r8 = r8.getStartParams()
            java.lang.String r12 = r9.getAppVersion()
            java.lang.String r14 = "appVersion"
            r8.putString(r14, r12)
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            android.os.Bundle r8 = r8.getStartParams()
            java.lang.String r12 = r9.getAppVersion()
            java.lang.String r14 = "version"
            r8.putString(r14, r12)
        L_0x012c:
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            java.lang.String r8 = r8.getAppType()
            r4.appType = r8
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            java.lang.String r8 = r8.getAppType()
            r7.appType = r8
            java.lang.Class<com.alibaba.ariver.app.api.point.app.AppLoadInterceptorPoint> r8 = com.alibaba.ariver.app.api.point.app.AppLoadInterceptorPoint.class
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r8 = com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(r8)
            com.alibaba.ariver.app.api.App r12 = r1.mApp
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r8 = r8.node(r12)
            com.alibaba.ariver.kernel.api.extension.Extension r8 = r8.create()
            com.alibaba.ariver.app.api.point.app.AppLoadInterceptorPoint r8 = (com.alibaba.ariver.app.api.point.app.AppLoadInterceptorPoint) r8
            if (r8 == 0) goto L_0x0153
            r8.intercept(r2, r0, r3, r7)
        L_0x0153:
            r7.mainHtmlUrl = r11
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            android.os.Bundle r0 = r0.getStartParams()
            java.lang.String r3 = r7.mainHtmlUrl
            r0.putString(r10, r3)
            java.lang.Class<com.alibaba.ariver.resource.api.extension.PackageQueryPoint> r0 = com.alibaba.ariver.resource.api.extension.PackageQueryPoint.class
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r0 = com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(r0)
            com.alibaba.ariver.app.api.App r3 = r1.mApp
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r0 = r0.node(r3)
            com.alibaba.ariver.kernel.api.extension.Extension r0 = r0.create()
            com.alibaba.ariver.resource.api.extension.PackageQueryPoint r0 = (com.alibaba.ariver.resource.api.extension.PackageQueryPoint) r0
            java.lang.String r3 = java.lang.String.valueOf(r18)
            java.lang.String r8 = "RV_ResourceLoadExtension_loadMainResource_"
            java.lang.String r3 = r8.concat(r3)
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r3)
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r3 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r3 = com.alibaba.ariver.kernel.common.RVProxy.get(r3)
            com.alibaba.ariver.kernel.api.track.EventTracker r3 = (com.alibaba.ariver.kernel.api.track.EventTracker) r3
            com.alibaba.ariver.app.api.App r10 = r1.mApp
            java.lang.String r12 = "LoadMainResourceBegin"
            r3.stub(r10, r12)
            r10 = 1
            if (r9 == 0) goto L_0x01ae
            com.alibaba.ariver.resource.api.content.ResourcePackage r12 = r0.getMainPackage(r4)
            if (r12 != 0) goto L_0x019c
            com.alibaba.ariver.resource.content.MainResourcePackage r12 = new com.alibaba.ariver.resource.content.MainResourcePackage
            r12.<init>(r4)
        L_0x019c:
            r12.setup(r10)
            boolean r14 = r12.needWaitForSetup()
            if (r14 == 0) goto L_0x01aa
            java.util.List<com.alibaba.ariver.resource.api.content.ResourcePackage> r14 = r1.mLockingPackages
            r14.add(r12)
        L_0x01aa:
            r4.setMainPackage(r12)
            goto L_0x01af
        L_0x01ae:
            r12 = 0
        L_0x01af:
            java.lang.String r14 = java.lang.String.valueOf(r18)
            java.lang.String r8 = r8.concat(r14)
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r8)
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTracker> r8 = com.alibaba.ariver.kernel.api.track.EventTracker.class
            java.lang.Object r8 = com.alibaba.ariver.kernel.common.RVProxy.get(r8)
            com.alibaba.ariver.kernel.api.track.EventTracker r8 = (com.alibaba.ariver.kernel.api.track.EventTracker) r8
            com.alibaba.ariver.app.api.App r14 = r1.mApp
            java.lang.String r15 = "LoadMainResourceEnd"
            r8.stub(r14, r15)
            java.util.Set r8 = r0.getResourcePackages(r4)
            if (r8 == 0) goto L_0x01f9
            java.util.Iterator r8 = r8.iterator()
        L_0x01d3:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x01f9
            java.lang.Object r14 = r8.next()
            com.alibaba.ariver.resource.api.content.ResourcePackage r14 = (com.alibaba.ariver.resource.api.content.ResourcePackage) r14
            com.alibaba.ariver.resource.content.ResourcePackagePool r15 = com.alibaba.ariver.resource.content.ResourcePackagePool.getInstance()
            r15.attach(r14)
            boolean r15 = r14.needWaitForSetup()
            if (r15 == 0) goto L_0x01f1
            java.util.List<com.alibaba.ariver.resource.api.content.ResourcePackage> r15 = r1.mLockingPackages
            r15.add(r14)
        L_0x01f1:
            java.lang.String r14 = r14.appId()
            r4.attachResourcePackage(r14)
            goto L_0x01d3
        L_0x01f9:
            if (r9 == 0) goto L_0x0266
            com.alibaba.ariver.resource.api.models.AppInfoModel r14 = r9.getAppInfoModel()
            if (r14 == 0) goto L_0x0266
            com.alibaba.ariver.resource.api.models.AppInfoModel r14 = r9.getAppInfoModel()
            java.util.List r14 = r14.getPlugins()
            if (r14 == 0) goto L_0x0266
            com.alibaba.ariver.resource.api.models.AppInfoModel r14 = r9.getAppInfoModel()
            java.util.List r14 = r14.getPlugins()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x021c:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x024b
            java.lang.Object r16 = r14.next()
            r3 = r16
            com.alibaba.ariver.resource.api.models.PluginModel r3 = (com.alibaba.ariver.resource.api.models.PluginModel) r3
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r8 = "attach plugin model package: "
            java.lang.String r8 = r8.concat(r10)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r8)
            com.alibaba.ariver.resource.api.content.ResourcePackage r8 = r0.createPluginPackage(r3, r4)
            r10 = 0
            r8.setup(r10)
            r4.addPackage(r8)
            java.lang.String r3 = r3.getAppId()
            r15.add(r3)
            r10 = 1
            goto L_0x021c
        L_0x024b:
            r10 = 0
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            android.os.Bundle r0 = r0.getStartParams()
            java.lang.String r3 = "__appxPlugins"
            r0.putStringArrayList(r3, r15)
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            java.lang.Class<com.alibaba.ariver.resource.api.storage.PluginStore> r3 = com.alibaba.ariver.resource.api.storage.PluginStore.class
            r8 = 1
            java.lang.Object r0 = r0.getData(r3, r8)
            com.alibaba.ariver.resource.api.storage.PluginStore r0 = (com.alibaba.ariver.resource.api.storage.PluginStore) r0
            r0.batchPutStaticPluginModel(r9)
            goto L_0x0267
        L_0x0266:
            r10 = 0
        L_0x0267:
            com.alibaba.ariver.resource.runtime.a r0 = new com.alibaba.ariver.resource.runtime.a
            r0.<init>(r4)
            r4.setContentProvider(r0)
            java.lang.String r0 = "ContentProvider is ready"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r0)
            android.os.ConditionVariable r0 = r1.mContentProviderSyncLock
            r0.open()
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            boolean r0 = r0.isTinyApp()
            if (r0 == 0) goto L_0x0407
            if (r12 == 0) goto L_0x0407
            boolean r0 = r12.needWaitForSetup()
            if (r0 == 0) goto L_0x028c
            r12.waitForSetup()
        L_0x028c:
            java.lang.String r0 = java.lang.String.valueOf(r18)
            java.lang.String r3 = "RV_ResourceLoadExtension_getAppConfig_"
            java.lang.String r0 = r3.concat(r0)
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r0)
            java.lang.String r0 = "appConfig.json"
            com.alibaba.ariver.resource.api.content.ResourceQuery r0 = com.alibaba.ariver.resource.api.content.ResourceQuery.asUrl(r0)
            r8 = 1
            com.alibaba.ariver.resource.api.content.ResourceQuery r0 = r0.setLanguageAware(r8)
            com.alibaba.ariver.resource.api.content.ResourceQuery r0 = r0.setNeedAutoCompleteHost()
            com.alibaba.ariver.engine.api.resources.Resource r0 = r12.get(r0)
            java.lang.String r8 = java.lang.String.valueOf(r18)
            java.lang.String r3 = r3.concat(r8)
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r3)
            if (r0 == 0) goto L_0x031f
            byte[] r0 = r0.getBytes()
            com.alibaba.ariver.app.api.model.AppConfigModel r0 = com.alibaba.ariver.app.api.model.AppConfigModel.parseFromJSON(r0)
            java.lang.Class<com.alibaba.ariver.resource.api.extension.AppConfigModelInitPoint> r3 = com.alibaba.ariver.resource.api.extension.AppConfigModelInitPoint.class
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r3 = com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(r3)
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r3 = r3.node(r8)
            com.alibaba.ariver.kernel.api.extension.Extension r3 = r3.create()
            com.alibaba.ariver.resource.api.extension.AppConfigModelInitPoint r3 = (com.alibaba.ariver.resource.api.extension.AppConfigModelInitPoint) r3
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            r3.onAppConfigModelInit(r8, r0)
            if (r0 == 0) goto L_0x031f
            r1.fillConfigWithIncludeFile(r4, r0)
            r1.fillConfigWithTemplate(r0)
            r1.removeInvalidParams(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r8 = "put appConfig.json "
            java.lang.String r3 = r8.concat(r3)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r3)
            com.alibaba.ariver.app.api.App r3 = r1.mApp
            java.lang.Class<com.alibaba.ariver.app.api.model.AppConfigModel> r8 = com.alibaba.ariver.app.api.model.AppConfigModel.class
            r3.setData(r8, r0)
            com.alibaba.ariver.app.api.App r3 = r1.mApp
            android.os.Bundle r3 = r3.getStartParams()
            com.alibaba.fastjson.JSONObject r8 = r0.getAppLaunchParams()
            android.os.Bundle r8 = com.alibaba.ariver.kernel.common.utils.JSONUtils.toBundle(r8)
            r3.putAll(r8)
            com.alibaba.fastjson.JSONObject r0 = r0.getAppLaunchParams()
            java.lang.String r3 = "supportColorScheme"
            r8 = 0
            com.alibaba.fastjson.JSONArray r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONArray(r0, r3, r8)
            com.alibaba.ariver.app.api.App r3 = r1.mApp
            java.lang.Class<com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider> r8 = com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider.class
            com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider$DefaultDecider r14 = new com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider$DefaultDecider
            r14.<init>(r0)
            r3.setData(r8, r14)
        L_0x031f:
            com.alibaba.ariver.resource.api.models.AppInfoModel r0 = r9.getAppInfoModel()
            if (r0 == 0) goto L_0x03ad
            com.alibaba.ariver.resource.api.models.AppInfoModel r0 = r9.getAppInfoModel()
            com.alibaba.ariver.resource.api.models.TemplateConfigModel r0 = r0.getTemplateConfig()
            if (r0 == 0) goto L_0x03ad
            com.alibaba.ariver.resource.api.models.AppInfoModel r0 = r9.getAppInfoModel()
            com.alibaba.ariver.resource.api.models.TemplateConfigModel r3 = r0.getTemplateConfig()
            boolean r0 = r3.isTemplateValid()
            if (r0 == 0) goto L_0x03ad
            com.alibaba.ariver.resource.template.a r0 = new com.alibaba.ariver.resource.template.a
            r0.<init>(r9)
            com.alibaba.ariver.resource.api.models.TemplateExtModel r8 = r0.get()     // Catch:{ all -> 0x034c }
            r3.setExtModel(r8)     // Catch:{ all -> 0x034a }
            goto L_0x0353
        L_0x034a:
            r0 = move-exception
            goto L_0x034e
        L_0x034c:
            r0 = move-exception
            r8 = 0
        L_0x034e:
            java.lang.String r9 = "prepare template Config error!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r13, r9, r0)
        L_0x0353:
            if (r8 == 0) goto L_0x0390
            com.alibaba.fastjson.JSONObject r0 = r8.getTabBarObject()
            if (r0 == 0) goto L_0x0390
            com.alibaba.fastjson.JSONObject r0 = r8.getTabBarObject()
            java.lang.String r9 = "items"
            r14 = 0
            com.alibaba.fastjson.JSONArray r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONArray(r0, r9, r14)
            if (r0 == 0) goto L_0x0390
            com.alibaba.ariver.app.api.App r9 = r1.mApp
            android.os.Bundle r9 = r9.getStartParams()
            java.lang.String r0 = r0.toJSONString()
            java.lang.String r10 = "tabBarItems"
            r9.putString(r10, r0)
            com.alibaba.ariver.resource.api.storage.TabBarDataStorage r0 = r4.tabBarDataStorage
            com.alibaba.fastjson.JSONObject r8 = r8.getTabBarObject()
            com.alibaba.ariver.app.api.App r9 = r1.mApp
            java.lang.Class<com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider> r10 = com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider.class
            java.lang.Object r9 = r9.getData(r10)
            com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider r9 = (com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider) r9
            com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel r8 = com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel.inflateFromTemplate(r8, r9)
            r0.onGetData(r8)
            r8 = 1
            goto L_0x0391
        L_0x0390:
            r8 = 0
        L_0x0391:
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            android.os.Bundle r0 = r0.getStartParams()
            java.lang.String r9 = "templateApp"
            r10 = 1
            r0.putBoolean(r9, r10)
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            android.os.Bundle r0 = r0.getStartParams()
            java.lang.String r3 = r3.getTemplateId()
            java.lang.String r9 = "templateAppId"
            r0.putString(r9, r3)
            goto L_0x03ae
        L_0x03ad:
            r8 = 0
        L_0x03ae:
            if (r8 != 0) goto L_0x0407
            java.lang.String r0 = "tabBar.json"
            com.alibaba.ariver.resource.api.content.ResourceQuery r0 = com.alibaba.ariver.resource.api.content.ResourceQuery.asUrl(r0)
            com.alibaba.ariver.resource.api.content.ResourceQuery r0 = r0.setNeedAutoCompleteHost()
            r3 = 1
            com.alibaba.ariver.resource.api.content.ResourceQuery r0 = r0.setLanguageAware(r3)
            com.alibaba.ariver.engine.api.resources.Resource r0 = r12.get(r0)
            if (r0 == 0) goto L_0x03f0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "put tabBar.json for "
            r3.<init>(r8)
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            java.lang.String r8 = r8.getAppId()
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r3)
            com.alibaba.ariver.resource.api.storage.TabBarDataStorage r3 = r4.tabBarDataStorage
            com.alibaba.ariver.app.api.App r8 = r1.mApp
            java.lang.Class<com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider> r9 = com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider.class
            java.lang.Object r8 = r8.getData(r9)
            com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider r8 = (com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider) r8
            com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel r0 = com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel.inflateFromResource(r0, r8)
            r3.onGetData(r0)
            goto L_0x0407
        L_0x03f0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "cannot find tabBar.json for "
            r0.<init>(r3)
            com.alibaba.ariver.app.api.App r3 = r1.mApp
            java.lang.String r3 = r3.getAppId()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r13, r0)
        L_0x0407:
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            boolean r0 = com.alibaba.ariver.resource.api.snapshot.RVSnapshotUtils.isSnapshotEnabled(r0)
            if (r0 == 0) goto L_0x0470
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            android.os.Bundle r0 = r0.getStartParams()
            java.lang.String r3 = "isSnapshotEnabled"
            r8 = 1
            r0.putBoolean(r3, r8)
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            boolean r0 = r0.isTinyApp()
            if (r0 == 0) goto L_0x0470
            com.alibaba.ariver.app.api.App r0 = r1.mApp
            java.lang.Class<com.alibaba.ariver.app.api.model.AppConfigModel> r3 = com.alibaba.ariver.app.api.model.AppConfigModel.class
            java.lang.Object r0 = r0.getData(r3)
            if (r0 == 0) goto L_0x0470
            com.alibaba.ariver.app.api.App r0 = r1.mApp     // Catch:{ all -> 0x046a }
            java.lang.String r3 = com.alibaba.ariver.kernel.common.utils.UrlUtils.purifyUrl(r11)     // Catch:{ all -> 0x046a }
            byte[] r0 = r1.getSnapshotIndex(r0, r3, r11)     // Catch:{ all -> 0x046a }
            if (r0 == 0) goto L_0x0470
            java.lang.String r3 = "SnapshotProvider read snapshot.html success! "
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x046a }
            java.lang.String r3 = r3.concat(r8)     // Catch:{ all -> 0x046a }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r3)     // Catch:{ all -> 0x046a }
            r4.setSnapshotIndex(r11, r0)     // Catch:{ all -> 0x046a }
            com.alibaba.ariver.app.api.App r0 = r1.mApp     // Catch:{ all -> 0x046a }
            java.lang.String r3 = com.alibaba.ariver.kernel.common.utils.UrlUtils.purifyUrl(r11)     // Catch:{ all -> 0x046a }
            java.lang.String r0 = r1.getSnapshotTitleBar(r0, r3, r11)     // Catch:{ all -> 0x046a }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x046a }
            if (r3 != 0) goto L_0x0470
            r4.setSnapshotTitleBarParams(r0)     // Catch:{ all -> 0x046a }
            java.lang.String r3 = "SnapshotProvider getSnapshotTitleBar param: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x046a }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x046a }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r0)     // Catch:{ all -> 0x046a }
            goto L_0x0470
        L_0x046a:
            r0 = move-exception
            java.lang.String r3 = "prepare snapshot data error!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r13, r3, r0)
        L_0x0470:
            java.lang.String r0 = java.lang.String.valueOf(r18)
            java.lang.String r0 = r6.concat(r0)
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r0)
            com.alibaba.ariver.resource.runtime.ResourceLoadExtension$1 r0 = new com.alibaba.ariver.resource.runtime.ResourceLoadExtension$1
            r0.<init>()
            r7.waitLoadFuture = r0
            r3 = r21
            r3.onResult(r7)
            r1.addLauncherParamResourcePackage(r4)
            java.lang.String r0 = java.lang.String.valueOf(r18)
            java.lang.String r0 = r5.concat(r0)
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.runtime.ResourceLoadExtension.loadApp(java.lang.String, android.os.Bundle, android.os.Bundle, com.alibaba.ariver.app.api.point.app.AppLoadPoint$LoadResultCallback):void");
    }

    private void removeInvalidParams(AppConfigModel appConfigModel) {
        if (appConfigModel != null) {
            if (appConfigModel.getAppLaunchParams() != null && appConfigModel.getAppLaunchParams().containsKey("usePresetPopmenu")) {
                appConfigModel.getAppLaunchParams().remove("usePresetPopmenu");
            }
            if (appConfigModel.getPageLaunchParams() != null && appConfigModel.getPageLaunchParams().containsKey("usePresetPopmenu")) {
                appConfigModel.getPageLaunchParams().remove("usePresetPopmenu");
            }
        }
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
                    for (String str : hashSet) {
                        if (!"66666692".equalsIgnoreCase(str) && !RVConstants.TINY_APPX_NG_APPID.equalsIgnoreCase(str)) {
                            ResourcePackagePool.getInstance().attach(str, resourceContext);
                        }
                    }
                }
            });
        }
    }

    private byte[] getSnapshotIndex(App app, String str, String str2) {
        byte[] loadSnapshotFile;
        if (!str.endsWith("index.html")) {
            return null;
        }
        try {
            if (RVSnapshotUtils.isSnapshotEnabled(this.mApp) && (loadSnapshotFile = RVSnapshotUtils.loadSnapshotFile(this.mApp, str2)) != null) {
                ISnapshotProxy iSnapshotProxy = (ISnapshotProxy) RVProxy.get(ISnapshotProxy.class, true);
                if (iSnapshotProxy != null) {
                    iSnapshotProxy.snapshotHit(this.mApp);
                }
                RVLogger.d(TAG, "snapshot first page using local snapshotFile success! ".concat(String.valueOf(app)));
                return loadSnapshotFile;
            }
        } catch (Throwable th) {
            RVLogger.e(TAG, "getSnapshotIndex error!", th);
        }
        return null;
    }

    private String getSnapshotTitleBar(App app, String str, String str2) {
        if (!str.endsWith("index.html")) {
            return null;
        }
        try {
            String loadTitleBarSnapshot = RVSnapshotUtils.loadTitleBarSnapshot(app, str2);
            if (!TextUtils.isEmpty(loadTitleBarSnapshot)) {
                RVLogger.d(TAG, "SnapshotProvider read titleBar snapshotFile success! ".concat(String.valueOf(app)));
                return loadTitleBarSnapshot;
            }
        } catch (Throwable th) {
            RVLogger.e(TAG, "getSnapshotTitle error!", th);
        }
        return null;
    }

    private String acquireMainJsUrl(@NonNull Bundle bundle) {
        return FileUtils.combinePath(BundleUtils.getString(bundle, "onlineHost"), BundleUtils.contains(bundle, RVStartParams.KEY_BUNDLE_PATH) ? BundleUtils.getString(bundle, RVStartParams.KEY_BUNDLE_PATH) : "index.bundle.js");
    }

    public void onInitSuccess() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (ResourcePackage waitForSetup : this.mLockingPackages) {
            waitForSetup.waitForSetup();
        }
        this.mLockingPackages.clear();
        StringBuilder sb = new StringBuilder("waitForSetup cost ");
        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        RVLogger.d(TAG, sb.toString());
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
                    Resource resource2 = resourceContext.getMainPackage().get(ResourceQuery.asUrl(RVConstants.FILE_TABBAR).setNeedAutoCompleteHost());
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
                        appConfigModel.setAppLaunchParams(extModel.getWindow());
                    } else {
                        appConfigModel.getAppLaunchParams().putAll(extModel.getWindow());
                    }
                    if (appConfigModel.getPageLaunchParams() != null) {
                        for (String next : appConfigModel.getPageLaunchParams().keySet()) {
                            JSONObject jSONObject = appConfigModel.getPageLaunchParams().getJSONObject(next);
                            if (jSONObject != null) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("window");
                                StringBuilder sb = new StringBuilder("fillConfigWithTemplate page ");
                                sb.append(next);
                                sb.append(" put ext.window ");
                                sb.append(extModel.getWindow());
                                RVLogger.d(TAG, sb.toString());
                                jSONObject.putAll(extModel.getWindow());
                                if (jSONObject2 != null) {
                                    StringBuilder sb2 = new StringBuilder("fillConfigWithTemplate page ");
                                    sb2.append(next);
                                    sb2.append(" put page.window ");
                                    sb2.append(jSONObject2);
                                    RVLogger.d(TAG, sb2.toString());
                                    jSONObject.putAll(jSONObject2);
                                }
                            }
                        }
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
        Resource resource;
        Resource intercept;
        ResourceContext resourceContext = ResourceContextManager.getInstance().get(this.mApp.getAppId());
        ResourceQuery canUseFallback = ResourceQuery.asUrl(resourceLoadContext.originUrl).setCanUseFallback(resourceLoadContext.canUseFallback);
        boolean equalsIgnoreCase = "YES".equalsIgnoreCase(BundleUtils.getString(this.mApp.getStartParams(), RVParams.APPX_ROUTE_FRAMEWORK));
        canUseFallback.setAppxNgRoute(equalsIgnoreCase);
        canUseFallback.setMainDoc(resourceLoadContext.isMainDoc);
        StringBuilder sb = new StringBuilder("load resource begin: ");
        sb.append(resourceLoadContext.originUrl);
        sb.append(" appx-ng: ");
        sb.append(equalsIgnoreCase);
        RVLogger.d(TAG, sb.toString());
        boolean z = equalsIgnoreCase && resourceLoadContext.originUrl.startsWith("https://appx");
        if (resourceContext.getContentProvider() != null) {
            resource = resourceContext.getContentProvider().getContent(canUseFallback);
        } else {
            if (z) {
                RVLogger.w(TAG, "appx-ng load resource error content provider null!!! Just find for global package! ");
                if (resourceLoadContext.originUrl.startsWith("https://appx/af-appx.worker.min.js")) {
                    this.mApp.putBooleanValue("appxRouteWorker", canUseFallback.isAppxNgRoute());
                    ((EventTracker) RVProxy.get(EventTracker.class)).addAttr(this.mApp, "appxRoute", "yes");
                    ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.mApp, TrackId.Stub_JS_WorkerFrameworkStart);
                }
                canUseFallback.pureUrl = canUseFallback.pureUrl.replace("https://appx", "https://appx-ng");
            } else {
                RVLogger.w(TAG, "load resource error content provider null!!! Just find for global package! ");
                if (resourceLoadContext.originUrl.startsWith("https://appx/af-appx.worker.min.js")) {
                    ((EventTracker) RVProxy.get(EventTracker.class)).addAttr(this.mApp, "appxRoute", "no");
                    ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.mApp, TrackId.Stub_JS_WorkerFrameworkStart);
                }
            }
            resource = GlobalPackagePool.getInstance().get(canUseFallback);
        }
        if (resource == null || (intercept = this.mInterceptPoint.intercept(resource)) == null) {
            return resource;
        }
        StringBuilder sb2 = new StringBuilder("load response ");
        sb2.append(canUseFallback.pureUrl);
        sb2.append(" intercepted to ");
        sb2.append(intercept);
        RVLogger.w(TAG, sb2.toString());
        return intercept;
    }

    public Resource loadGlobalResource(String str) {
        return GlobalPackagePool.getInstance().get(ResourceQuery.asUrl(str));
    }

    public void onAppDestroy(App app) {
        for (String next : ResourceContextManager.getInstance().get(app.getAppId()).getResourcePackages()) {
            if (!TextUtils.equals("66666692", next)) {
                ResourcePackagePool.getInstance().detach(next);
            }
        }
        ResourceContextManager.getInstance().onAppDestroy(app.getAppId());
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
}
