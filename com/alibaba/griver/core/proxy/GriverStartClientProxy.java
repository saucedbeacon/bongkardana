package com.alibaba.griver.core.proxy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.integration.proxy.RVClientStarter;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.griver.base.api.GriverPerformanceStages;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.resource.GriverPrepareController;
import com.alibaba.griver.core.a.c;
import com.alibaba.griver.core.ui.activity.GriverBaseActivity;
import com.alibaba.griver.core.ui.activity.GriverTransActivity;
import com.alibaba.griver.core.ui.fragment.GriverBaseFragment;

public class GriverStartClientProxy implements RVClientStarter {
    public Class<? extends Activity> startClient(Context context, RVAppRecord rVAppRecord, Intent intent) {
        boolean z;
        if (ProcessUtils.isMainProcess()) {
            AppModel appModel = (AppModel) BundleUtils.getParcelable(rVAppRecord.getSceneParams(), "appInfo");
            z = (appModel == null || appModel.getContainerInfo() == null || appModel.getContainerInfo().getLaunchParams() == null || !appModel.getContainerInfo().getLaunchParams().containsKey("enableMultiProcess")) ? "YES".equalsIgnoreCase(BundleUtils.getString(rVAppRecord.getStartParams(), "enableMultiProcess")) : "YES".equalsIgnoreCase(JSONUtils.getString(appModel.getContainerInfo().getLaunchParams(), "enableMultiProcess"));
        } else {
            z = false;
        }
        boolean z2 = BundleUtils.getBoolean(rVAppRecord.getStartParams(), RVParams.isH5App, false);
        boolean z3 = BundleUtils.getBoolean(rVAppRecord.getStartParams(), RVStartParams.KEY_TRANSPARENT, false);
        GriverPerformanceStages.startActivity = SystemClock.elapsedRealtime();
        rVAppRecord.getSceneParams().putLong(RVConstants.EXTRA_START_ACTIVITY_TIMESTAMP, GriverPerformanceStages.startActivity);
        Class a2 = (z2 || !z || !c.b()) ? null : c.a().a(rVAppRecord, intent);
        if (a2 == null) {
            a2 = z3 ? GriverTransActivity.Main.class : GriverBaseActivity.Main.class;
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("isTransparent", z3);
            intent.putExtras(rVAppRecord.getStartParams());
            intent.setClass(context, a2);
            context.startActivity(intent);
            c.a().c().a(rVAppRecord.getAppId());
            c.a().c().c(1);
        }
        return a2;
    }

    public Fragment createFragment(Context context, RVAppRecord rVAppRecord, Bundle bundle) {
        return Fragment.instantiate(context, GriverBaseFragment.Main.class.getName(), bundle);
    }

    public PrepareController createPrepareController(PrepareContext prepareContext, PrepareCallback prepareCallback) {
        GriverLogger.d("AriverInt:StartClientProxy", "create prepare controller");
        Bundle startParams = prepareContext.getStartParams();
        if (startParams == null || !BundleUtils.getBoolean(startParams, RVParams.isH5App, false)) {
            return new GriverPrepareController(prepareContext, prepareCallback);
        }
        return null;
    }
}
