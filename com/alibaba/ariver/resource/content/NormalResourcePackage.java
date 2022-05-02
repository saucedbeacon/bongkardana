package com.alibaba.ariver.resource.content;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVResourcePresetProxy;
import com.alibaba.ariver.resource.content.BaseResourcePackage;
import com.alibaba.ariver.resource.parser.ParseContext;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class NormalResourcePackage extends BaseResourcePackage {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10185a = false;

    /* access modifiers changed from: protected */
    public boolean canHotUpdate(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean needWaitSetupWhenGet() {
        return false;
    }

    public NormalResourcePackage(String str, ResourceContext resourceContext) {
        super(str, resourceContext);
    }

    /* access modifiers changed from: package-private */
    public void onNotInstalled() {
        boolean z = false;
        this.f10185a = false;
        boolean z2 = getAppModel() != null && this.resourceManager.isDownloaded(getAppModel());
        String str = this.LOG_TAG;
        StringBuilder sb = new StringBuilder("onNotInstalled ");
        sb.append(this.appId);
        sb.append(" ");
        sb.append(this.appVersion);
        sb.append(" isDownloaded: ");
        sb.append(z2);
        RVLogger.d(str, sb.toString());
        if (z2) {
            ResourceUtils.prepare(this.appId, this.appVersion, new BaseResourcePackage.HotUpdatePackageInstallCallback(!"NO".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("nebulax_hotUpdateInDownload", "YES"))));
            return;
        }
        if (this.mResourceContext == null) {
            z = true;
        }
        final String str2 = this.appVersion;
        if (a(str2)) {
            this.f10185a = true;
        } else {
            getParseLock().countDown();
        }
        AnonymousClass1 r2 = new Runnable() {
            public void run() {
                ResourceUtils.prepare(NormalResourcePackage.this.appId, str2, new BaseResourcePackage.HotUpdatePackageInstallCallback());
            }
        };
        if (z || this.f10185a) {
            ExecutorUtils.getScheduledExecutor().schedule(r2, 5, TimeUnit.SECONDS);
        } else {
            ExecutorUtils.execute(ExecutorType.URGENT, r2);
        }
    }

    public Resource get(@NonNull ResourceQuery resourceQuery) {
        if (resourceQuery.isDisableResourcePackage()) {
            RVLogger.d(this.LOG_TAG, "disable resource package!");
            return null;
        } else if (!this.f10185a || !resourceQuery.isMainDoc()) {
            return super.get(resourceQuery);
        } else {
            RVLogger.d(this.LOG_TAG, "main url cannot degrade!");
            return null;
        }
    }

    public void beforeParsePackage(ParseContext parseContext) {
        super.beforeParsePackage(parseContext);
        parseContext.onlineHost = null;
    }

    @WorkerThread
    private boolean a(String str) {
        Map<String, RVResourcePresetProxy.PresetPackage> presetPackage;
        String installedAppVersion = this.resourceManager.getInstalledAppVersion(this.appId);
        boolean z = !TextUtils.isEmpty(installedAppVersion) && !TextUtils.equals(installedAppVersion, str);
        AppModel appModel = this.mAppInfoManager.getAppModel(AppInfoQuery.make(this.appId).version(installedAppVersion));
        String str2 = null;
        RVResourcePresetProxy rVResourcePresetProxy = (RVResourcePresetProxy) RVProxy.get(RVResourcePresetProxy.class);
        if (!(rVResourcePresetProxy == null || (presetPackage = rVResourcePresetProxy.getPresetPackage()) == null || !presetPackage.containsKey(this.appId))) {
            str2 = presetPackage.get(this.appId).getVersion();
            RVLogger.d(this.LOG_TAG, "[prepareForDegrade] found preset version: ".concat(String.valueOf(str2)));
        }
        if (appModel != null) {
            if (TextUtils.equals(str2, appModel.getAppVersion())) {
                RVLogger.d(this.LOG_TAG, "[prepareForDegrade] hitPresetResource - 1!");
                return hitPresetResource();
            } else if (!z) {
                return false;
            } else {
                RVLogger.d(this.LOG_TAG, "[prepareForDegrade] degrade for current installed version: ".concat(String.valueOf(installedAppVersion)));
                setAppModel(appModel);
                prepareContent(installedAppVersion);
                return true;
            }
        } else if (hitPresetResource()) {
            RVLogger.d(this.LOG_TAG, "[prepareForDegrade] hitPresetResource - 2!");
            return true;
        } else {
            RVLogger.d(this.LOG_TAG, "[prepareForDegrade] failed!");
            return false;
        }
    }
}
