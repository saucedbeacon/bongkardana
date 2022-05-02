package com.alibaba.ariver.resource.prepare.steps;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.log.AppLog;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.appinfo.AppUpdaterFactory;
import com.alibaba.ariver.resource.api.appinfo.IAppUpdater;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppCallback;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppException;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppParam;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.api.prepare.StepType;
import com.alibaba.ariver.resource.api.prepare.UpdateMode;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.List;

public class UpdateStep extends BasePrepareStep {
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    public /* bridge */ /* synthetic */ boolean isFinished() {
        return super.isFinished();
    }

    public StepType getType() {
        return StepType.UPDATE;
    }

    public void execute(PrepareController prepareController, PrepareContext prepareContext, PrepareCallback prepareCallback) {
        String str;
        StringBuilder sb = new StringBuilder(RVTraceKey.RV_Prepare_Execute_);
        sb.append(getType());
        RVTraceUtils.traceBeginSection(sb.toString());
        super.execute(prepareController, prepareContext, prepareCallback);
        RVLogger.d(this.LOG_TAG, "update with ".concat(String.valueOf(prepareContext)));
        AppModel appModel = prepareContext.getAppModel();
        if (appModel == null) {
            str = null;
        } else {
            str = appModel.getAppInfoModel().getVersion();
        }
        String string = BundleUtils.getString(prepareContext.getStartParams(), RVStartParams.LONG_NB_VERSION);
        JSONObject configJSONObject = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONObject("h5_nbversionCfg");
        if (configJSONObject != null && configJSONObject.containsKey(prepareContext.getAppId())) {
            String string2 = configJSONObject.getString(prepareContext.getAppId());
            if (!TextUtils.isEmpty(string2) && RVResourceUtils.compareVersion(string2, string) > 0) {
                RVLogger.d(this.LOG_TAG, "wantNebulaVersion update from config: ".concat(String.valueOf(string2)));
                prepareContext.updateMode = UpdateMode.SYNC_TRY;
                prepareContext.getStartParams().putString(RVStartParams.LONG_NB_VERSION, string2);
                string = string2;
            }
        }
        boolean z = false;
        boolean z2 = TextUtils.isEmpty(string) || RVResourceUtils.compareVersion(str, string) < 0;
        if (appModel == null || (prepareContext.updateMode.isSync() && z2)) {
            z = true;
        }
        prepareContext.getPrepareData().setRequestMode(prepareContext.updateMode);
        if (z) {
            RVLogger.d(this.LOG_TAG, "enter force updateLoadingInfo step");
            prepareCallback.showLoading(true, prepareContext.getEntryInfo());
            prepareController.postTimeOut(prepareContext.getTimeout());
            prepareController.lock(this);
            a(prepareController, prepareContext, prepareCallback);
        }
        StringBuilder sb2 = new StringBuilder(RVTraceKey.RV_Prepare_Execute_);
        sb2.append(getType());
        RVTraceUtils.traceEndSection(sb2.toString());
    }

    private void a(PrepareController prepareController, PrepareContext prepareContext, PrepareCallback prepareCallback) {
        a(prepareContext);
        final boolean z = prepareContext.getAppModel() != null;
        prepareContext.getPrepareData().setRequestBeginTime(System.currentTimeMillis());
        final PrepareContext prepareContext2 = prepareContext;
        final PrepareController prepareController2 = prepareController;
        final PrepareCallback prepareCallback2 = prepareCallback;
        AnonymousClass1 r2 = new UpdateAppCallback() {
            private AppModel a(List<AppModel> list) {
                if (list == null) {
                    return null;
                }
                for (AppModel next : list) {
                    if (TextUtils.equals(next.getAppInfoModel().getAppId(), prepareContext2.getAppId())) {
                        return next;
                    }
                }
                return null;
            }

            public void onSuccess(List<AppModel> list) {
                RVLogger.d(UpdateStep.this.LOG_TAG, "updateAppInfo result: ".concat(String.valueOf(list)));
                AppModel a2 = a(list);
                boolean z = a2 != null;
                RVLogger.d(UpdateStep.this.LOG_TAG, "updateAppInfo onSuccess find target: ".concat(String.valueOf(z)));
                prepareContext2.getPrepareData().setRequestEndTime(System.currentTimeMillis());
                if (z) {
                    prepareContext2.setupAppInfo(a2);
                    prepareController2.onGetAppInfo(a2);
                    prepareCallback2.updateLoading(prepareContext2.getEntryInfo());
                    prepareController2.unlock(UpdateStep.this);
                    UpdateStep.this.b(prepareContext2);
                    prepareController2.moveToNext();
                    return;
                }
                UpdateAppException updateAppException = new UpdateAppException("1", "no app info");
                updateAppException.setNeedShowError(true);
                onError(updateAppException);
            }

            public void onError(UpdateAppException updateAppException) {
                PrepareException prepareException;
                RVLogger.w(UpdateStep.this.LOG_TAG, "updateApp onError!", updateAppException);
                if (!z || prepareContext2.updateMode == UpdateMode.SYNC_FORCE) {
                    if (updateAppException == null || TextUtils.isEmpty(updateAppException.getCode())) {
                        prepareException = new PrepareException("2", "", updateAppException);
                    } else {
                        prepareException = new PrepareException(updateAppException.getCode(), updateAppException.getMessage(), updateAppException);
                        prepareException.setNeedShowFail(updateAppException.isNeedShowError());
                    }
                    prepareController2.unlock(UpdateStep.this);
                    prepareController2.moveToError(prepareException);
                    return;
                }
                UpdateStep.this.b(prepareContext2);
                prepareController2.unlock(UpdateStep.this);
                prepareController2.moveToNext();
            }
        };
        UpdateAppParam updateAppParam = new UpdateAppParam(prepareContext.getAppId(), (String) null);
        updateAppParam.setForce(true);
        updateAppParam.setUpdateMode(prepareContext.updateMode);
        updateAppParam.setQueryScene(prepareContext.getAppInfoQuery().getScene());
        updateAppParam.setExtras(prepareContext.getStartParams());
        HashMap hashMap = new HashMap();
        if (!prepareContext.getAppInfoQuery().isOnlineScene()) {
            hashMap.put(prepareContext.getAppId(), prepareContext.getAppInfoQuery().getVersion());
        } else {
            hashMap.put(prepareContext.getAppId(), "*");
        }
        updateAppParam.setRequestApps(hashMap);
        IAppUpdater createUpdater = AppUpdaterFactory.createUpdater(prepareContext.getAppId(), prepareContext.getStartParams());
        if (createUpdater != null) {
            createUpdater.updateApp(updateAppParam, r2);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find IAppUpdater for ");
        sb.append(prepareContext.getAppId());
        sb.append(" and startParam: ");
        sb.append(prepareContext.getStartParams());
        throw new IllegalStateException(sb.toString());
    }

    private void a(PrepareContext prepareContext) {
        if (prepareContext != null) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState("prepare 2 ")).setAppId(prepareContext.getAppId()).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).build());
        }
    }

    /* access modifiers changed from: private */
    public void b(PrepareContext prepareContext) {
        if (prepareContext != null) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState("prepare 3 ")).setAppId(prepareContext.getAppId()).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).build());
        }
    }
}
