package com.alibaba.ariver.resource.prepare.steps;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.log.AppLog;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.api.prepare.StepType;

public class StartStep extends BasePrepareStep {
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    public /* bridge */ /* synthetic */ boolean isFinished() {
        return super.isFinished();
    }

    public StepType getType() {
        return StepType.START;
    }

    public void execute(PrepareController prepareController, PrepareContext prepareContext, PrepareCallback prepareCallback) {
        AppModel appModel;
        StringBuilder sb = new StringBuilder(RVTraceKey.RV_Prepare_Execute_);
        sb.append(getType());
        RVTraceUtils.traceBeginSection(sb.toString());
        super.execute(prepareController, prepareContext, prepareCallback);
        String str = this.LOG_TAG;
        StringBuilder sb2 = new StringBuilder("prepareFinish ");
        sb2.append(prepareContext.getAppId());
        sb2.append(" with appModel:");
        sb2.append(prepareContext.getAppModel());
        RVLogger.d(str, sb2.toString());
        String string = BundleUtils.getString(prepareContext.getStartParams(), "url");
        String string2 = BundleUtils.getString(prepareContext.getStartParams(), "page");
        if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || (appModel = prepareContext.getAppModel()) == null || appModel.getContainerInfo() == null || !TextUtils.isEmpty(JSONUtils.getString(appModel.getContainerInfo().getLaunchParams(), "page"))) {
            prepareContext.getPrepareData().setEndTime(SystemClock.elapsedRealtime());
            a(prepareContext);
            prepareCallback.prepareFinish(prepareContext.getPrepareData(), prepareContext.getAppModel(), prepareContext.getStartParams(), prepareContext.getSceneParams());
            StringBuilder sb3 = new StringBuilder(RVTraceKey.RV_Prepare_Execute_);
            sb3.append(getType());
            RVTraceUtils.traceEndSection(sb3.toString());
            return;
        }
        RVLogger.d(this.LOG_TAG, "url and page both null! prepare fail!");
        prepareCallback.prepareFail(prepareContext.getPrepareData(), new PrepareException("6", "url and page both null!"));
    }

    private void a(PrepareContext prepareContext) {
        if (prepareContext != null) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState("prepare 8 ")).setAppId(prepareContext.getAppId()).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).build());
        }
    }
}
