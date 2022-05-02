package com.alibaba.ariver.integration.resource.interceptor;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.PackageInstallCallback;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.ContainerModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.PrepareData;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.api.prepare.PrepareStep;
import com.alibaba.ariver.resource.api.prepare.StepInterceptor;
import com.alibaba.ariver.resource.api.prepare.StepType;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.ariver.resource.content.ResourceUtils;
import com.alibaba.fastjson.JSONArray;

@Keep
public class TinyCheckAppXInterceptor implements StepInterceptor {
    private static final String TAG = "Ariver:TinyCheckAppXInterceptor";
    /* access modifiers changed from: private */
    public boolean mAlreadyChecked = false;
    private String mCheckingVersion;
    private PrepareCallback mPrepareCallback;
    /* access modifiers changed from: private */
    public PrepareContext mPrepareContext;
    /* access modifiers changed from: private */
    public PrepareController mPrepareController;
    private RVAppInfoManager mResourceAppManager;
    private boolean mUsingAppxNg = false;

    public boolean after(PrepareStep prepareStep, PrepareController prepareController) {
        return false;
    }

    public boolean onError(PrepareException prepareException, PrepareController prepareController) {
        return false;
    }

    public void onGetAppInfo(AppModel appModel) {
    }

    public void init(PrepareContext prepareContext, PrepareCallback prepareCallback) {
        this.mPrepareContext = prepareContext;
        this.mPrepareCallback = prepareCallback;
        this.mResourceAppManager = (RVAppInfoManager) RVProxy.get(RVAppInfoManager.class);
    }

    public boolean before(PrepareStep prepareStep, PrepareController prepareController) {
        if (prepareStep.getType() == StepType.START && this.mPrepareContext.getAppModel() != null) {
            this.mPrepareController = prepareController;
            if (notNeedCheckSdkVersion(this.mPrepareContext)) {
                return false;
            }
            String declaredMinAppxVersion = getDeclaredMinAppxVersion();
            if (!TextUtils.isEmpty(declaredMinAppxVersion)) {
                this.mCheckingVersion = declaredMinAppxVersion;
                if (!checkAppxMinFrameworkVersion(this.mPrepareContext)) {
                    RVLogger.d(TAG, "framework version not compatible!!!");
                    return true;
                }
            } else if (!checkAppxMinVersion(this.mPrepareContext)) {
                RVLogger.d(TAG, "deploy version not compatible!!!");
                return true;
            }
        }
        return false;
    }

    private String getDeclaredMinAppxVersion() {
        String appxMinFrameworkVersionFromPackage = getAppxMinFrameworkVersionFromPackage(this.mPrepareContext.getAppModel());
        String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("ta_minFrameworkVersion", "");
        if (RVResourceUtils.compareVersion(config, appxMinFrameworkVersionFromPackage) <= 0) {
            return appxMinFrameworkVersionFromPackage;
        }
        RVLogger.d(TAG, "checkAppxMinFrameworkVersion...get minVersion from config: ".concat(String.valueOf(config)));
        return config;
    }

    public boolean checkAppxMinVersion(PrepareContext prepareContext) {
        String appxMinVersionFromPackage = getAppxMinVersionFromPackage(prepareContext.getAppModel());
        String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("ta_minSdkVersion", "");
        if (RVResourceUtils.compareVersion(config, appxMinVersionFromPackage) > 0) {
            RVLogger.d(TAG, "checkAppxMinVersion...get minVersion from config: ".concat(String.valueOf(config)));
            appxMinVersionFromPackage = config;
        }
        if (TextUtils.isEmpty(appxMinVersionFromPackage)) {
            return true;
        }
        AppModel appModel = this.mResourceAppManager.getAppModel(AppInfoQuery.make("66666692"));
        String str = null;
        if (appModel != null) {
            str = appModel.getAppVersion();
        }
        StringBuilder sb = new StringBuilder("checkAppxMinVersion...min: ");
        sb.append(appxMinVersionFromPackage);
        sb.append(",current: ");
        sb.append(str);
        RVLogger.d(TAG, sb.toString());
        if (TextUtils.isEmpty(str)) {
            handleForceUpdateAppInfo(false);
            return false;
        }
        this.mCheckingVersion = appxMinVersionFromPackage;
        int compareVersion = RVResourceUtils.compareVersion(str, appxMinVersionFromPackage);
        if (compareVersion == 1 || compareVersion == 0) {
            return true;
        }
        handleForceUpdateAppInfo(false);
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean notNeedCheckSdkVersion(PrepareContext prepareContext) {
        JSONArray parseArray;
        String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("ta_setMinAppxBlacklist", (String) null);
        if (TextUtils.isEmpty(config) || (parseArray = JSONUtils.parseArray(config)) == null) {
            return false;
        }
        if (!parseArray.contains("all") && !parseArray.contains(prepareContext.getAppId())) {
            return false;
        }
        RVLogger.d(TAG, "isNeedCheck hit blacklist ta_setMinAppxBlacklist: ".concat(String.valueOf(config)));
        return true;
    }

    public boolean checkAppxMinFrameworkVersion(PrepareContext prepareContext) {
        AppModel appModel;
        if ("YES".equalsIgnoreCase(BundleUtils.getString(prepareContext.getStartParams(), RVParams.APPX_ROUTE_FRAMEWORK))) {
            RVLogger.d(TAG, "checkAppxMinFrameworkVersion check appx-ng version");
            appModel = this.mResourceAppManager.getAppModel(AppInfoQuery.make(RVConstants.TINY_APPX_NG_APPID));
            this.mUsingAppxNg = true;
        } else {
            RVLogger.d(TAG, "checkAppxMinFrameworkVersion check appx version");
            appModel = this.mResourceAppManager.getAppModel(AppInfoQuery.make("66666692"));
        }
        String str = null;
        if (appModel != null) {
            str = JSONUtils.getString(appModel.getExtendInfos(), "appxVersion");
        }
        StringBuilder sb = new StringBuilder("checkAppxMinFrameworkVersion...min: ");
        sb.append(this.mCheckingVersion);
        sb.append(",current: ");
        sb.append(str);
        RVLogger.d(TAG, sb.toString());
        if (TextUtils.isEmpty(str)) {
            RVLogger.d(TAG, "checkAppxMinFrameworkVersion...get sdk version null, just ignore this check!");
            return true;
        }
        int compareVersion = RVResourceUtils.compareVersion(str, this.mCheckingVersion);
        if (compareVersion == 1 || compareVersion == 0) {
            return true;
        }
        handleForceUpdateAppInfo(true);
        return false;
    }

    public String getAppxMinVersionFromPackage(AppModel appModel) {
        ContainerModel containerInfo;
        if (appModel == null || (containerInfo = appModel.getContainerInfo()) == null) {
            return null;
        }
        String string = JSONUtils.getString(containerInfo.getLaunchParams(), "minSDKVersion");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return JSONUtils.getString(containerInfo.getLaunchParams(), "minSdkVersion");
    }

    public String getAppxMinFrameworkVersionFromPackage(AppModel appModel) {
        ContainerModel containerInfo;
        if (appModel == null || (containerInfo = appModel.getContainerInfo()) == null) {
            return null;
        }
        return JSONUtils.getString(containerInfo.getLaunchParams(), "minAppxVersion");
    }

    private void handleForceUpdateAppInfo(boolean z) {
        if (!this.mAlreadyChecked) {
            forceUpdateAppInfo(z);
        } else {
            onUpdateFail(z);
        }
    }

    public void onUpdateSuccess(boolean z) {
        RVLogger.d(TAG, "onUpdateSuccess checkRealSdkVersion: ".concat(String.valueOf(z)));
    }

    public void onUpdateFail(boolean z) {
        RVLogger.d(TAG, "onUpdateFail checkRealSdkVersion: ".concat(String.valueOf(z)));
        PrepareCallback prepareCallback = this.mPrepareCallback;
        PrepareData prepareData = this.mPrepareContext.getPrepareData();
        StringBuilder sb = new StringBuilder("Appx check failed: ");
        sb.append(this.mCheckingVersion);
        prepareCallback.prepareFail(prepareData, new PrepareException("7", sb.toString()));
    }

    /* access modifiers changed from: protected */
    public void forceUpdateAppInfo(final boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("forceUpdateAppInfo...");
        sb.append(this.mPrepareContext);
        RVLogger.d(TAG, sb.toString());
        this.mPrepareController.postTimeOut(this.mPrepareContext.getTimeout());
        this.mPrepareCallback.showLoading(true, this.mPrepareContext.getEntryInfo());
        String str2 = this.mUsingAppxNg ? RVConstants.TINY_APPX_NG_APPID : "66666692";
        if (z) {
            str = "*";
        } else {
            str = this.mCheckingVersion;
        }
        ResourceUtils.prepare(str2, str, new PackageInstallCallback() {
            public void onResult(boolean z, String str) {
                boolean z2;
                boolean unused = TinyCheckAppXInterceptor.this.mAlreadyChecked = true;
                if (z) {
                    StringBuilder sb = new StringBuilder("prepareUpdate...onSuccess, checkRealSdkVersion: ");
                    sb.append(z);
                    RVLogger.d(TinyCheckAppXInterceptor.TAG, sb.toString());
                    if (z) {
                        TinyCheckAppXInterceptor tinyCheckAppXInterceptor = TinyCheckAppXInterceptor.this;
                        z2 = tinyCheckAppXInterceptor.checkAppxMinFrameworkVersion(tinyCheckAppXInterceptor.mPrepareContext);
                    } else {
                        TinyCheckAppXInterceptor tinyCheckAppXInterceptor2 = TinyCheckAppXInterceptor.this;
                        z2 = tinyCheckAppXInterceptor2.checkAppxMinVersion(tinyCheckAppXInterceptor2.mPrepareContext);
                    }
                    if (z2) {
                        IpcServerUtils.sendMsgToClient(TinyCheckAppXInterceptor.this.mPrepareContext.getAppId(), TinyCheckAppXInterceptor.this.mPrepareContext.getStartToken(), 13, (Bundle) null);
                        TinyCheckAppXInterceptor.this.onUpdateSuccess(z);
                        TinyCheckAppXInterceptor.this.mPrepareController.moveToNext();
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("prepareUpdate...onError, checkRealSdkVersion: ");
                sb2.append(z);
                RVLogger.d(TinyCheckAppXInterceptor.TAG, sb2.toString());
                TinyCheckAppXInterceptor.this.onUpdateFail(z);
            }
        });
    }
}
