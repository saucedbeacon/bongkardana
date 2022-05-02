package com.alibaba.ariver.app.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.AppNode;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.activity.StartAction;
import com.alibaba.ariver.app.api.activity.StartClientBundle;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.app.api.point.activity.ActivityHelperOnCreateFinishedPoint;
import com.alibaba.ariver.app.api.point.activity.ActivityResultPoint;
import com.alibaba.ariver.app.api.point.app.BackKeyDownPoint;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareCallbackParam;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.PrepareData;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import java.util.Map;

public abstract class EmbedViewHelper implements PrepareCallback {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public FragmentActivity f9966a;
    private AppNode b;
    private AppContext c;
    private boolean d;
    private PrepareContext e;
    private StartClientBundle f;
    private boolean g = false;

    /* access modifiers changed from: protected */
    public abstract AppContext createAppContext(App app, FragmentActivity fragmentActivity);

    /* access modifiers changed from: protected */
    public abstract PrepareController createPrepareController(PrepareContext prepareContext, PrepareCallback prepareCallback);

    public EmbedViewHelper(FragmentActivity fragmentActivity) {
        this.f9966a = fragmentActivity;
    }

    public void renderView(String str, Bundle bundle, @Nullable Bundle bundle2) {
        Bundle clone = BundleUtils.clone(bundle);
        Bundle clone2 = BundleUtils.clone(bundle2);
        clone.putString(RVConstants.EXTRA_LAUNCH_URL, BundleUtils.getString(clone, "url"));
        clone.putString("appId", str);
        clone2.putLong(RVConstants.EXTRA_SETUP_TIMESTAMP, SystemClock.elapsedRealtime());
        clone2.putLong(RVConstants.EXTRA_START_TOKEN, System.currentTimeMillis());
        PrepareContext prepareContext = new PrepareContext(this.f9966a, str, clone, clone2);
        this.e = prepareContext;
        createPrepareController(prepareContext, this).moveToNext();
    }

    public StartClientBundle getStartClientBundle() {
        return this.f;
    }

    public void onResume() {
        RVLogger.d("AriverApp:ActivityHelper", "onResume");
        AppNode appNode = this.b;
        if (appNode != null) {
            appNode.resume();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.b != null) {
            ExtensionPoint.as(ActivityResultPoint.class).node(this.b).create().onActivityResult(i, i2, intent);
        }
    }

    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        AppNode appNode = this.b;
        if (appNode != null && !appNode.isDestroyed()) {
            int childCount = this.b.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Page pageByIndex = this.b.getPageByIndex(i2);
                if (pageByIndex.getPageContext() != null) {
                    pageByIndex.getPageContext().getEmbedViewManager().onRequestPermissionResult(i, strArr, iArr);
                }
            }
        }
        ((RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class)).onRequestPermissionResult(i, strArr, iArr);
    }

    public void finishAndRemoveTask() {
        doCommonDestroy();
    }

    public void finish() {
        doCommonDestroy();
    }

    public void onDestroy() {
        doCommonDestroy();
    }

    public void onStop() {
        RVLogger.d("AriverApp:ActivityHelper", "onStop");
    }

    public void onPause() {
        RVLogger.d("AriverApp:ActivityHelper", "onResume");
        AppNode appNode = this.b;
        if (appNode != null) {
            appNode.pause();
        }
    }

    public void onUserInteraction() {
        AppNode appNode = this.b;
        if (appNode != null) {
            appNode.onUserInteraction();
        }
    }

    public void onUserLeaveHint() {
        AppNode appNode = this.b;
        if (appNode != null) {
            appNode.onUserLeaveHint();
        }
    }

    public boolean onBackPressed() {
        AppNode appNode = this.b;
        if (appNode == null) {
            return false;
        }
        if (appNode.isFirstPage()) {
            RVLogger.d("AriverApp:ActivityHelper", "first page onBackPressed");
            return false;
        }
        Boolean intercept = ExtensionPoint.as(BackKeyDownPoint.class).node(this.b).defaultValue(Boolean.FALSE).create().intercept(this.b);
        if (intercept == null || !intercept.booleanValue()) {
            return this.b.backPressed();
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        RVLogger.d("AriverApp:ActivityHelper", "onKeyDown ".concat(String.valueOf(i)));
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.b.isFirstPage()) {
                RVLogger.d("AriverApp:ActivityHelper", "first page onBackPressed");
                return false;
            } else if (this.b != null) {
                Boolean intercept = ExtensionPoint.as(BackKeyDownPoint.class).node(this.b).defaultValue(Boolean.FALSE).create().intercept(this.b);
                if (intercept == null || !intercept.booleanValue()) {
                    return this.b.backPressed();
                }
                return true;
            } else {
                FragmentActivity fragmentActivity = this.f9966a;
                if (fragmentActivity != null) {
                    fragmentActivity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized void doCommonDestroy() {
        if (!this.g) {
            this.g = true;
            IpcChannelManager.getInstance().unRegisterClientChannel(this.e.getSceneParams().getLong(RVConstants.EXTRA_START_TOKEN));
            if (this.b == null || this.b.isDestroyed()) {
                this.c.destroy();
                return;
            }
            RVLogger.w("AriverApp:ActivityHelper", "doCommonDestroy force mApp.destroy with count: ".concat(String.valueOf(this.b.getChildCount())));
            this.b.exit();
        }
    }

    public void showLoading(boolean z, EntryInfo entryInfo) {
        RVLogger.d("AriverApp:ActivityHelper", "updateLoading: ".concat(String.valueOf(entryInfo)));
        if (!this.d) {
            PrepareCallbackParam prepareCallbackParam = new PrepareCallbackParam(this.e);
            prepareCallbackParam.action = StartAction.SHOW_LOADING;
            prepareCallbackParam.needWaitIpc = true;
            startApp(prepareCallbackParam);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(RVConstants.EXTRA_ENTRY_INFO, entryInfo);
        bundle.putBoolean(RVConstants.EXTRA_NEED_WAIT_LOADING_ANIM, z);
        IpcServerUtils.sendMsgToClient(this.e.getAppId(), this.e.getSceneParams().getLong(RVConstants.EXTRA_START_TOKEN), 0, bundle);
    }

    public void updateLoading(EntryInfo entryInfo) {
        RVLogger.d("AriverApp:ActivityHelper", "updateLoading: ".concat(String.valueOf(entryInfo)));
        Bundle bundle = new Bundle();
        bundle.putParcelable(RVConstants.EXTRA_ENTRY_INFO, entryInfo);
        IpcServerUtils.sendMsgToClient(this.e.getAppId(), this.e.getSceneParams().getLong(RVConstants.EXTRA_START_TOKEN), 1, bundle);
    }

    public void prepareFail(PrepareData prepareData, PrepareException prepareException) {
        RVLogger.e("AriverApp:ActivityHelper", "prepareFail!", prepareException);
        if (!this.d) {
            PrepareCallbackParam prepareCallbackParam = new PrepareCallbackParam(this.e);
            prepareCallbackParam.action = StartAction.SHOW_ERROR;
            prepareCallbackParam.needWaitIpc = false;
            if (prepareCallbackParam.sceneParams == null) {
                prepareCallbackParam.sceneParams = new Bundle();
            }
            prepareCallbackParam.sceneParams.putString(RVConstants.EXTRA_PREPARE_EXCEPTION_CODE, prepareException.getCode());
            prepareCallbackParam.sceneParams.putString(RVConstants.EXTRA_PREPARE_EXCEPTION_MESSAGE, prepareException.getMessage());
            startApp(prepareCallbackParam);
        }
        Bundle bundle = new Bundle();
        bundle.setClassLoader(EmbedViewHelper.class.getClassLoader());
        if (prepareException != null) {
            bundle.putString(RVConstants.EXTRA_PREPARE_EXCEPTION_CODE, prepareException.getCode());
            bundle.putString(RVConstants.EXTRA_PREPARE_EXCEPTION_MESSAGE, prepareException.getMessage());
        }
        bundle.putParcelable(RVConstants.EXTRA_PREPARE_DATA, prepareData);
        IpcServerUtils.sendMsgToClient(this.e.getAppId(), this.e.getSceneParams().getLong(RVConstants.EXTRA_START_TOKEN), 3, bundle);
    }

    public void prepareFinish(PrepareData prepareData, @Nullable AppModel appModel, @Nullable Bundle bundle, @Nullable Bundle bundle2) {
        RVLogger.d("AriverApp:ActivityHelper", "prepareFinish");
        if (!this.d) {
            PrepareCallbackParam prepareCallbackParam = new PrepareCallbackParam(this.e);
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
            bundle3.putParcelable(RVConstants.EXTRA_SCENE_PARAMS, bundle2);
        }
        if (appModel != null) {
            bundle3.putParcelable("appInfo", appModel);
        }
        bundle3.putParcelable(RVConstants.EXTRA_PREPARE_DATA, prepareData);
        IpcServerUtils.sendMsgToClient(this.e.getAppId(), this.e.getSceneParams().getLong(RVConstants.EXTRA_START_TOKEN), 2, bundle3);
    }

    public void prepareAbort() {
        StringBuilder sb = new StringBuilder("forceFinish from stack: ");
        sb.append(Log.getStackTraceString(new Throwable("Just Print")));
        RVLogger.d("AriverApp:ActivityHelper", sb.toString());
        Bundle bundle = new Bundle();
        bundle.putString(RVConstants.EXTRA_PREPARE_ABORT_REASON, "Finish from mStartToken!");
        IpcServerUtils.sendMsgToClient(this.e.getAppId(), this.e.getSceneParams().getLong(RVConstants.EXTRA_START_TOKEN), 4, bundle);
    }

    /* access modifiers changed from: protected */
    public StartClientBundle createStartClient(PrepareCallbackParam prepareCallbackParam) {
        Bundle sceneParams = this.e.getSceneParams();
        if (prepareCallbackParam.appInfo != null) {
            sceneParams.putParcelable("appInfo", prepareCallbackParam.appInfo);
        }
        if (!TextUtils.isEmpty(this.e.appType)) {
            sceneParams.putString("appType", this.e.appType);
        }
        EntryInfo entryInfo = this.e.getEntryInfo();
        if (entryInfo != null) {
            sceneParams.putParcelable(RVConstants.EXTRA_ENTRY_INFO, entryInfo);
        }
        sceneParams.putLong(RVConstants.EXTRA_PREPARE_START_CLIENT_TIME, SystemClock.elapsedRealtime());
        sceneParams.putBoolean(RVConstants.EXTRA_PREPARE_NEED_WAIT_IPC, prepareCallbackParam.needWaitIpc);
        Bundle startParams = this.e.getStartParams();
        ParamUtils.unify(startParams, "url", false);
        ParamUtils.parseMagicOptions(startParams, BundleUtils.getString(startParams, "url"));
        ParamUtils.unifyAll(this.e.getStartParams(), false);
        StartClientBundle startClientBundle = new StartClientBundle();
        startClientBundle.appId = this.e.getAppId();
        startClientBundle.appType = this.e.appType;
        startClientBundle.startToken = this.e.getSceneParams().getLong(RVConstants.EXTRA_START_TOKEN);
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

    public void startApp(PrepareCallbackParam prepareCallbackParam) {
        if (!this.d) {
            this.d = true;
            this.f = createStartClient(prepareCallbackParam);
            AppNode appNode = (AppNode) ((AppManager) RVProxy.get(AppManager.class)).findAppByToken(this.f.startToken);
            this.b = appNode;
            if (appNode != null) {
                StringBuilder sb = new StringBuilder("onCreate find quickStarted app! ");
                sb.append(this.b);
                RVLogger.d("AriverApp:ActivityHelper", sb.toString());
                this.b.getStartParams().putAll(this.f.startParams);
                this.b.getSceneParams().putAll(this.f.sceneParams);
            } else {
                this.b = (AppNode) ((AppManager) RVProxy.get(AppManager.class)).startApp(this.f.appId, this.f.startParams, this.f.sceneParams);
            }
            this.c = createAppContext(this.b, this.f9966a);
            ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).init("RV_APP_STARTUP", this.b.getAppId(), Long.valueOf(this.f.startToken), this.b.getStartUrl());
            this.b.bindContext(this.c);
            int i = AnonymousClass2.$SwitchMap$com$alibaba$ariver$app$api$activity$StartAction[this.f.startAction.ordinal()];
            if (i == 1) {
                EntryInfo entryInfo = (EntryInfo) BundleUtils.getParcelable(this.b.getSceneParams(), RVConstants.EXTRA_ENTRY_INFO);
                if (this.c.getSplashView() != null) {
                    this.c.getSplashView().showLoading(entryInfo);
                }
            } else if (i == 2) {
                String string = BundleUtils.getString(this.b.getSceneParams(), RVConstants.EXTRA_PREPARE_EXCEPTION_CODE);
                String string2 = BundleUtils.getString(this.b.getSceneParams(), RVConstants.EXTRA_PREPARE_EXCEPTION_MESSAGE);
                if (this.c.getSplashView() != null) {
                    this.c.getSplashView().showError(string, string2, (Map<String, String>) null);
                }
            } else if (i == 3) {
                this.b.start();
            }
            if (ProcessUtils.isMainProcess()) {
                IpcChannelManager.getInstance().registerClientChannel(this.b.getStartToken(), new IIpcChannel.Stub() {
                    public void sendMessage(IpcMessage ipcMessage) {
                        ClientMsgReceiver.getInstance().handleMessage(ipcMessage);
                    }

                    public boolean isFinishing() {
                        return EmbedViewHelper.this.f9966a.isFinishing();
                    }
                });
            }
            ExtensionPoint.as(ActivityHelperOnCreateFinishedPoint.class).node(this.b).create().onActivityHelperOnCreateFinished(this.b, this.f9966a, this.f);
        }
    }

    /* renamed from: com.alibaba.ariver.app.view.EmbedViewHelper$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$app$api$activity$StartAction;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.alibaba.ariver.app.api.activity.StartAction[] r0 = com.alibaba.ariver.app.api.activity.StartAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$ariver$app$api$activity$StartAction = r0
                com.alibaba.ariver.app.api.activity.StartAction r1 = com.alibaba.ariver.app.api.activity.StartAction.SHOW_LOADING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$activity$StartAction     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.app.api.activity.StartAction r1 = com.alibaba.ariver.app.api.activity.StartAction.SHOW_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$activity$StartAction     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.ariver.app.api.activity.StartAction r1 = com.alibaba.ariver.app.api.activity.StartAction.DIRECT_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.view.EmbedViewHelper.AnonymousClass2.<clinit>():void");
        }
    }
}
