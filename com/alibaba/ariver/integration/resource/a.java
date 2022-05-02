package com.alibaba.ariver.integration.resource;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.activity.StartAction;
import com.alibaba.ariver.app.api.activity.StartClientBundle;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.integration.proxy.RVClientStarter;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.log.AppLog;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppException;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareCallbackParam;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareData;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.content.ResourceUtils;

public class a implements PrepareCallback {

    /* renamed from: a  reason: collision with root package name */
    protected final RVAppRecord f8997a;
    protected boolean b;
    protected PrepareContext c;

    public a(RVAppRecord rVAppRecord, PrepareContext prepareContext) {
        this(rVAppRecord, prepareContext, false);
    }

    public a(RVAppRecord rVAppRecord, PrepareContext prepareContext, boolean z) {
        this.c = prepareContext;
        this.f8997a = rVAppRecord;
        this.b = z;
    }

    public void showLoading(final boolean z, final EntryInfo entryInfo) {
        RVLogger.d("AriverInt:PrepareCallback", "updateLoading: ".concat(String.valueOf(entryInfo)));
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                a.this.a(z, entryInfo);
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(boolean z, EntryInfo entryInfo) {
        if (!this.b) {
            PrepareCallbackParam prepareCallbackParam = new PrepareCallbackParam(this.c);
            prepareCallbackParam.action = StartAction.SHOW_LOADING;
            prepareCallbackParam.needWaitIpc = true;
            startApp(prepareCallbackParam);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(RVConstants.EXTRA_ENTRY_INFO, entryInfo);
        bundle.putBoolean(RVConstants.EXTRA_NEED_WAIT_LOADING_ANIM, z);
        IpcServerUtils.sendMsgToClient(this.f8997a.getAppId(), this.f8997a.getStartToken(), 0, bundle);
    }

    public void updateLoading(EntryInfo entryInfo) {
        RVLogger.d("AriverInt:PrepareCallback", "updateLoading: ".concat(String.valueOf(entryInfo)));
        Bundle bundle = new Bundle();
        bundle.putParcelable(RVConstants.EXTRA_ENTRY_INFO, entryInfo);
        IpcServerUtils.sendMsgToClient(this.f8997a.getAppId(), this.f8997a.getStartToken(), 1, bundle);
    }

    public void prepareFail(final PrepareData prepareData, final PrepareException prepareException) {
        RVLogger.e("AriverInt:PrepareCallback", "prepareFail!", prepareException);
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                a.this.b(prepareData, prepareException);
            }
        });
    }

    /* access modifiers changed from: private */
    public void b(PrepareData prepareData, PrepareException prepareException) {
        if (!this.b) {
            PrepareCallbackParam prepareCallbackParam = new PrepareCallbackParam(this.c);
            prepareCallbackParam.action = StartAction.SHOW_ERROR;
            prepareCallbackParam.needWaitIpc = false;
            if (prepareCallbackParam.sceneParams == null) {
                prepareCallbackParam.sceneParams = new Bundle();
            }
            prepareCallbackParam.sceneParams.putString(RVConstants.EXTRA_PREPARE_EXCEPTION_CODE, prepareException.getCode());
            prepareCallbackParam.sceneParams.putString(RVConstants.EXTRA_PREPARE_EXCEPTION_MESSAGE, prepareException.getMessage());
            startApp(prepareCallbackParam);
        }
        a(prepareData, prepareException);
    }

    /* access modifiers changed from: protected */
    public void a(PrepareData prepareData, PrepareException prepareException) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(a.class.getClassLoader());
        if (prepareException != null) {
            bundle.putString(RVConstants.EXTRA_PREPARE_EXCEPTION_CODE, prepareException.getCode());
            bundle.putString(RVConstants.EXTRA_PREPARE_EXCEPTION_MESSAGE, prepareException.getMessage());
            if (prepareException.getCause() instanceof UpdateAppException) {
                UpdateAppException updateAppException = (UpdateAppException) prepareException.getCause();
                if (updateAppException.getExtras() != null) {
                    Bundle bundle2 = new Bundle();
                    for (String next : updateAppException.getExtras().keySet()) {
                        if (next != null) {
                            bundle2.putString(next, updateAppException.getExtras().get(next));
                        }
                    }
                    bundle.putBundle(RVConstants.EXTRA_PREPARE_EXCEPTION_EXTRAS, bundle2);
                }
            }
        }
        bundle.putParcelable(RVConstants.EXTRA_PREPARE_DATA, prepareData);
        if (this.c.getAppModel() != null) {
            bundle.putParcelable("appInfo", this.c.getAppModel());
        }
        IpcServerUtils.sendMsgToClient(this.f8997a.getAppId(), this.f8997a.getStartToken(), 3, bundle);
    }

    public synchronized void prepareFinish(PrepareData prepareData, @Nullable AppModel appModel, @Nullable Bundle bundle, @Nullable Bundle bundle2) {
        RVLogger.d("AriverInt:PrepareCallback", "prepareFinish");
        IpcServerUtils.addStubToClient(this.c.getAppId(), this.c.getStartToken(), "PrepareStep_Finish", SystemClock.elapsedRealtime());
        a(bundle);
        if (!this.b) {
            PrepareCallbackParam prepareCallbackParam = new PrepareCallbackParam(this.c);
            prepareCallbackParam.needWaitIpc = false;
            prepareCallbackParam.action = StartAction.DIRECT_START;
            prepareCallbackParam.startParams = bundle;
            prepareCallbackParam.sceneParams = bundle2;
            startApp(prepareCallbackParam);
        }
        Bundle bundle3 = new Bundle();
        if (bundle != null) {
            bundle3.putParcelable("startParams", bundle);
        }
        if (bundle2 != null) {
            bundle2.putString("appType", this.c.appType);
            bundle3.putParcelable(RVConstants.EXTRA_SCENE_PARAMS, bundle2);
        }
        if (appModel != null) {
            bundle3.putParcelable("appInfo", appModel);
        }
        bundle3.putParcelable(RVConstants.EXTRA_PREPARE_DATA, prepareData);
        IpcServerUtils.sendMsgToClient(this.f8997a.getAppId(), this.f8997a.getStartToken(), 2, bundle3);
    }

    public void prepareAbort() {
        StringBuilder sb = new StringBuilder("forceFinish from stack: ");
        sb.append(Log.getStackTraceString(new Throwable("Just Print")));
        RVLogger.d("AriverInt:PrepareCallback", sb.toString());
        Bundle bundle = new Bundle();
        bundle.putString(RVConstants.EXTRA_PREPARE_ABORT_REASON, "Finish from mStartToken!");
        IpcServerUtils.sendMsgToClient(this.f8997a.getAppId(), this.f8997a.getStartToken(), 4, bundle);
    }

    /* access modifiers changed from: protected */
    public StartClientBundle a(PrepareCallbackParam prepareCallbackParam) {
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
        sceneParams.putBoolean(RVConstants.EXTRA_PREPARE_NEED_WAIT_IPC, prepareCallbackParam.needWaitIpc);
        Bundle startParams = this.c.getStartParams();
        ParamUtils.unify(startParams, "url", false);
        ParamUtils.parseMagicOptions(startParams, BundleUtils.getString(startParams, "url"));
        ParamUtils.unifyAll(this.f8997a.getStartParams(), false);
        ParamUtils.unifyAll(startParams, false);
        StartClientBundle startClientBundle = new StartClientBundle();
        startClientBundle.appId = this.f8997a.getAppId();
        startClientBundle.appType = this.c.appType;
        startClientBundle.startToken = this.f8997a.getStartToken();
        startClientBundle.startParams = startParams;
        startClientBundle.sceneParams = sceneParams;
        startClientBundle.needWaitIpc = prepareCallbackParam.needWaitIpc;
        if (prepareCallbackParam.action != null) {
            startClientBundle.startAction = prepareCallbackParam.action;
        } else {
            startClientBundle.startAction = StartAction.DIRECT_START;
        }
        sceneParams.putLong(RVConstants.EXTRA_SETUP_END_TIMESTAMP, SystemClock.elapsedRealtime());
        return startClientBundle;
    }

    public synchronized void startApp(PrepareCallbackParam prepareCallbackParam) {
        if (!this.b) {
            this.b = true;
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_Prepare_StartClient);
            Intent intent = new Intent();
            intent.putExtra(RVConstants.EXTRA_ARIVER_START_BUNDLE, a(prepareCallbackParam));
            this.f8997a.setLastStartClientTimeStamp(SystemClock.elapsedRealtime());
            Class<? extends Activity> startClient = ((RVClientStarter) RVProxy.get(RVClientStarter.class)).startClient(this.c.getStartContext(), this.f8997a, intent);
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Prepare_StartClient);
            this.f8997a.setActivityClz(startClient);
        }
    }

    private void a(Bundle bundle) {
        if (bundle != null) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState(AppLog.APP_LOG_PREPARE_FINISH)).setAppId(BundleUtils.getString(bundle, "appId")).setParentId(BundleUtils.getString(bundle, RVParams.START_APP_SESSION_ID))).build());
        }
    }
}
