package com.alibaba.griver.base.resource.interceptor;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.appinfo.AppUpdaterFactory;
import com.alibaba.ariver.resource.api.appinfo.IAppUpdater;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppCallback;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppException;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppParam;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.ContainerModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.api.prepare.PrepareStep;
import com.alibaba.ariver.resource.api.prepare.StepInterceptor;
import com.alibaba.ariver.resource.api.prepare.StepType;
import com.alibaba.ariver.resource.api.prepare.UpdateMode;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.griver.api.constants.GriverErrors;
import com.alibaba.griver.api.resource.extensions.GriverAppxLoadFailedPoint;
import com.alibaba.griver.base.R;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import java.util.List;

public class GriverAppXInterceptor implements StepInterceptor {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public PrepareContext f10239a;
    private PrepareCallback b;
    /* access modifiers changed from: private */
    public PrepareController c;
    private RVAppInfoManager d;
    /* access modifiers changed from: private */
    public boolean e = false;

    public boolean after(PrepareStep prepareStep, PrepareController prepareController) {
        return false;
    }

    public boolean onError(PrepareException prepareException, PrepareController prepareController) {
        return false;
    }

    public void onGetAppInfo(AppModel appModel) {
    }

    public void init(PrepareContext prepareContext, PrepareCallback prepareCallback) {
        this.f10239a = prepareContext;
        this.b = prepareCallback;
        this.d = (RVAppInfoManager) RVProxy.get(RVAppInfoManager.class);
    }

    public boolean before(PrepareStep prepareStep, PrepareController prepareController) {
        if (prepareStep.getType() == StepType.START && this.f10239a.getAppModel() != null && AppInfoUtils.isTinyApp(this.f10239a.getAppModel())) {
            this.c = prepareController;
            if (!a(this.f10239a)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean a(PrepareContext prepareContext) {
        String a2 = a(prepareContext.getAppModel());
        if (TextUtils.isEmpty(a2)) {
            return true;
        }
        AppModel appModel = this.d.getAppModel(AppInfoQuery.make("66666692"));
        String str = null;
        if (appModel != null) {
            str = appModel.getAppVersion();
        }
        StringBuilder sb = new StringBuilder("checkAppxMinVersion...min: ");
        sb.append(a2);
        sb.append(",current: ");
        sb.append(str);
        RVLogger.d("GriverAppXInterceptor", sb.toString());
        if (!TextUtils.isEmpty(str) || this.d == null) {
            int compareVersion = RVResourceUtils.compareVersion(str, a2);
            if (compareVersion == 1 || compareVersion == 0) {
                return true;
            }
            a();
            return false;
        }
        a();
        return false;
    }

    private String a(AppModel appModel) {
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

    private void a() {
        if (AppInfoScene.isDevSource(this.f10239a.getStartParams()) || this.e) {
            b();
        } else {
            c();
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        RVLogger.d("GriverAppXInterceptor", "openUpdateAppClient");
        this.c.moveToError(new PrepareException(GriverErrors.ERROR_APPX_VERSION_TOO_LOW, GriverEnv.getResources().getString(R.string.griver_appx_version_too_low)));
        ExtensionPoint.as(GriverAppxLoadFailedPoint.class).create().appxLoadFailed();
    }

    private void c() {
        StringBuilder sb = new StringBuilder("forceUpdateAppInfo...");
        sb.append(this.f10239a);
        RVLogger.d("GriverAppXInterceptor", sb.toString());
        this.c.postTimeOut(this.f10239a.getTimeout());
        this.b.showLoading(true, this.f10239a.getEntryInfo());
        UpdateAppParam updateAppParam = new UpdateAppParam("66666692", (String) null);
        updateAppParam.setForce(true);
        updateAppParam.setUpdateMode(UpdateMode.SYNC_FORCE);
        AnonymousClass1 r2 = new UpdateAppCallback() {
            public void onSuccess(List<AppModel> list) {
                RVLogger.d("GriverAppXInterceptor", "prepareUpdate...onSuccess");
                boolean unused = GriverAppXInterceptor.this.e = true;
                GriverAppXInterceptor griverAppXInterceptor = GriverAppXInterceptor.this;
                if (griverAppXInterceptor.a(griverAppXInterceptor.f10239a)) {
                    GriverAppXInterceptor.this.c.moveToNext();
                }
            }

            public void onError(UpdateAppException updateAppException) {
                RVLogger.d("GriverAppXInterceptor", "prepareUpdate...onError");
                boolean unused = GriverAppXInterceptor.this.e = true;
                GriverAppXInterceptor.this.b();
            }
        };
        IAppUpdater createUpdater = AppUpdaterFactory.createUpdater("66666692", (Bundle) null);
        if (createUpdater != null) {
            createUpdater.updateApp(updateAppParam, r2);
            return;
        }
        throw new IllegalStateException("Cannot find IAppUpdater");
    }
}
