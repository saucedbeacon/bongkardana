package com.alibaba.ariver.resource.prepare.steps;

import android.os.Bundle;
import android.os.SystemClock;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.log.AppLog;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.OfflineMode;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.StepType;
import com.alibaba.ariver.resource.api.prepare.UpdateMode;

public class SetupStep extends BasePrepareStep {
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    public /* bridge */ /* synthetic */ boolean isFinished() {
        return super.isFinished();
    }

    public StepType getType() {
        return StepType.SETUP;
    }

    public void execute(PrepareController prepareController, PrepareContext prepareContext, PrepareCallback prepareCallback) {
        StringBuilder sb = new StringBuilder(RVTraceKey.RV_Prepare_Execute_);
        sb.append(getType());
        RVTraceUtils.traceBeginSection(sb.toString());
        prepareContext.getPrepareData().setBeginTime(SystemClock.elapsedRealtime());
        super.execute(prepareController, prepareContext, prepareCallback);
        String appId = prepareContext.getAppId();
        AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState("prepare 1 ")).setAppId(appId).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).build());
        prepareContext.getStartParams().putString("appId", appId);
        AppInfoQuery appInfoQuery = new AppInfoQuery(appId);
        if (AppInfoScene.isDevSource(prepareContext.getStartParams())) {
            appInfoQuery.scene(AppInfoScene.extractScene(prepareContext.getStartParams()));
            appInfoQuery.version(AppInfoScene.extractSceneVersion(prepareContext.getStartParams()));
        }
        prepareContext.setAppInfoQuery(appInfoQuery);
        AppModel appModel = this.appInfoManager.getAppModel(appInfoQuery);
        boolean z = appModel != null;
        String str = this.LOG_TAG;
        StringBuilder sb2 = new StringBuilder("syncApp for ");
        sb2.append(appId);
        sb2.append(" ");
        sb2.append(prepareContext.getOriginStartParams());
        sb2.append(" ");
        sb2.append(z);
        RVLogger.d(str, sb2.toString());
        if (z) {
            prepareContext.setOriginHasAppInfo(true);
            prepareContext.setupAppInfo(appModel);
            prepareController.onGetAppInfo(appModel);
        }
        Bundle startParams = prepareContext.getStartParams();
        prepareContext.offlineMode = OfflineMode.fromString(BundleUtils.getString(startParams, RVStartParams.LONG_NB_OFFLINE), BundleUtils.getString(startParams, RVParams.LONG_NB_OFFMODE));
        prepareContext.updateMode = UpdateMode.fromString(BundleUtils.getString(startParams, RVStartParams.LONG_NB_UPDATE));
        prepareContext.degradeUrl = BundleUtils.getString(startParams, RVStartParams.LONG_NB_URL);
        prepareContext.getPrepareData().setNbUrl(prepareContext.degradeUrl);
        if (!z) {
            prepareContext.setOriginHasAppInfo(false);
            prepareContext.updateMode = UpdateMode.SYNC_FORCE;
        }
        prepareContext.getPrepareData().setAppId(appId);
        prepareContext.getPrepareData().setAppType(prepareContext.appType);
        StringBuilder sb3 = new StringBuilder(RVTraceKey.RV_Prepare_Execute_);
        sb3.append(getType());
        RVTraceUtils.traceEndSection(sb3.toString());
    }
}
