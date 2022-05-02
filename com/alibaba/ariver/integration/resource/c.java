package com.alibaba.ariver.integration.resource;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.proxy.RVSinglePageAppProxy;
import com.alibaba.ariver.integration.CreatePageCallback;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.prepare.PrepareCallbackParam;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareData;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.content.ResourceUtils;

public class c extends a {
    /* access modifiers changed from: private */
    public CreatePageCallback d;
    private Activity e;

    public void showLoading(boolean z, EntryInfo entryInfo) {
    }

    public c(Activity activity, RVAppRecord rVAppRecord, PrepareContext prepareContext, CreatePageCallback createPageCallback) {
        super(rVAppRecord, prepareContext);
        this.d = createPageCallback;
        this.e = activity;
    }

    public void prepareFail(PrepareData prepareData, PrepareException prepareException) {
        if (this.d != null) {
            RVLogger.e("AriverInt:PrepareSPACallbackImpl", "PrepareSPACallbackImpl prepareFail: ", prepareException);
            if ("yes".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_createPageCallbackNull", "yes"))) {
                this.d.onPageCreate((Page) null);
            }
        }
    }

    public void startApp(PrepareCallbackParam prepareCallbackParam) {
        if (!this.b) {
            this.b = true;
            Bundle sceneParams = this.f8997a.getSceneParams();
            if (prepareCallbackParam.appInfo != null) {
                sceneParams.putParcelable("appInfo", prepareCallbackParam.appInfo);
                this.f8997a.setAppModel(prepareCallbackParam.appInfo);
            }
            if (!TextUtils.isEmpty(this.c.appType)) {
                sceneParams.putString("appType", this.c.appType);
            }
            EntryInfo entryInfo = this.c.getEntryInfo();
            if (entryInfo == null) {
                entryInfo = ResourceUtils.getEntryInfo(prepareCallbackParam.appInfo);
            }
            if (entryInfo != null) {
                sceneParams.putParcelable(RVConstants.EXTRA_ENTRY_INFO, entryInfo);
            }
            sceneParams.putLong(RVConstants.EXTRA_PREPARE_START_CLIENT_TIME, SystemClock.elapsedRealtime());
            Bundle bundle = prepareCallbackParam.startParams;
            Bundle sceneParams2 = this.f8997a.getSceneParams();
            App startApp = ((AppManager) RVProxy.get(AppManager.class)).startApp(BundleUtils.getString(bundle, "appId"), bundle, sceneParams2);
            startApp.addPageReadyListener(new App.PageReadyListener() {
                public void onPageReady(Page page) {
                    RVLogger.d("AriverInt:PrepareSPACallbackImpl", "startApp PageReadyListener onPageReady ".concat(String.valueOf(page)));
                    if (c.this.d != null) {
                        c.this.d.onPageCreate(page);
                    }
                }
            });
            startApp.bindContext(((RVSinglePageAppProxy) RVProxy.get(RVSinglePageAppProxy.class)).createAppContext(startApp, this.e));
            startApp.start();
        }
    }
}
