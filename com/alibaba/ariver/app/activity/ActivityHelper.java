package com.alibaba.ariver.app.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.AppNode;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.activity.ActivityAnimBean;
import com.alibaba.ariver.app.api.activity.StartClientBundle;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.app.api.point.activity.ActivityHelperOnCreateFinishedPoint;
import com.alibaba.ariver.app.api.point.activity.ActivityResultPoint;
import com.alibaba.ariver.app.api.point.app.BackKeyDownPoint;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.app.api.ui.loading.SplashUtils;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import java.util.Map;

@Keep
public abstract class ActivityHelper {
    private static final String LOG_TAG = "AriverApp:ActivityHelper";
    /* access modifiers changed from: private */
    public FragmentActivity mActivity;
    private ActivityAnimBean mActivityAnimBean;
    /* access modifiers changed from: private */
    public boolean mAlreadyDoDestroyed = false;
    protected AppNode mApp;
    protected AppContext mAppContext;
    private boolean mCloseAllAnim;
    private boolean mOnCreateWithIllegalState;
    private StartClientBundle mStartClientBundle;
    private long mStartToken;

    /* access modifiers changed from: protected */
    public abstract AppContext createAppContext(App app, FragmentActivity fragmentActivity);

    public boolean handleStartClientBundleNull() {
        return false;
    }

    public ActivityHelper(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    public void onCreate() {
        if (this.mStartClientBundle == null) {
            RVLogger.w(LOG_TAG, "onCreate but mStartClientBundle == null! do nothing!");
            return;
        }
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_ActivityHelper_onCreate);
        AppNode appNode = (AppNode) ((AppManager) RVProxy.get(AppManager.class)).findAppByToken(this.mStartToken);
        this.mApp = appNode;
        if (appNode == null || !appNode.isInited()) {
            this.mApp = (AppNode) ((AppManager) RVProxy.get(AppManager.class)).startApp(this.mStartClientBundle.appId, this.mStartClientBundle.startParams, this.mStartClientBundle.sceneParams);
        } else {
            StringBuilder sb = new StringBuilder("onCreate find quickStarted app! ");
            sb.append(this.mApp);
            sb.append(" appId from Param: ");
            sb.append(BundleUtils.getString(this.mApp.getStartParams(), "appId"));
            RVLogger.d(LOG_TAG, sb.toString());
        }
        this.mAppContext = createAppContext(this.mApp, this.mActivity);
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).init("RV_APP_STARTUP", this.mApp.getAppId(), Long.valueOf(this.mStartToken), this.mApp.getStartUrl());
        this.mApp.bindContext(this.mAppContext);
        EntryInfo entryInfo = (EntryInfo) BundleUtils.getParcelable(this.mApp.getSceneParams(), RVConstants.EXTRA_ENTRY_INFO);
        int i = AnonymousClass2.$SwitchMap$com$alibaba$ariver$app$api$activity$StartAction[this.mStartClientBundle.startAction.ordinal()];
        if (i != 1) {
            if (i == 2) {
                String string = BundleUtils.getString(this.mApp.getSceneParams(), RVConstants.EXTRA_PREPARE_EXCEPTION_CODE);
                String string2 = BundleUtils.getString(this.mApp.getSceneParams(), RVConstants.EXTRA_PREPARE_EXCEPTION_MESSAGE);
                if (this.mAppContext.getSplashView() != null) {
                    this.mAppContext.getSplashView().showError(string, string2, (Map<String, String>) null);
                }
            } else if (i == 3) {
                if (SplashUtils.useSuperSplash(this.mStartClientBundle.startParams)) {
                    RVLogger.d(LOG_TAG, " showLoading by superSplash!");
                    this.mAppContext.getSplashView().showLoading(entryInfo);
                }
                this.mApp.start();
            }
        } else if (this.mAppContext.getSplashView() != null) {
            this.mAppContext.getSplashView().showLoading(entryInfo);
        }
        if (ProcessUtils.isMainProcess()) {
            IpcChannelManager.getInstance().registerClientChannel(getApp().getStartToken(), new IIpcChannel.Stub() {
                public void sendMessage(final IpcMessage ipcMessage) {
                    ExecutorUtils.runOnMain(new Runnable() {
                        public void run() {
                            ClientMsgReceiver.getInstance().handleMessage(ipcMessage);
                        }
                    });
                }

                public boolean isFinishing() {
                    return ActivityHelper.this.mAlreadyDoDestroyed || ActivityHelper.this.mApp == null || ActivityHelper.this.mApp.isExited() || ActivityHelper.this.mActivity.isFinishing();
                }
            });
        }
        ExtensionPoint.as(ActivityHelperOnCreateFinishedPoint.class).node(this.mApp).create().onActivityHelperOnCreateFinished(this.mApp, this.mActivity, this.mStartClientBundle);
        RVTraceUtils.traceEndSection(RVTraceKey.RV_ActivityHelper_onCreate);
    }

    /* renamed from: com.alibaba.ariver.app.activity.ActivityHelper$2  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.activity.ActivityHelper.AnonymousClass2.<clinit>():void");
        }
    }

    public void setupParams(Intent intent) {
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_ActivityHelper_setupParams);
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    intent.getExtras().setClassLoader(ActivityHelper.class.getClassLoader());
                    this.mStartClientBundle = (StartClientBundle) BundleUtils.getParcelable(intent.getExtras(), RVConstants.EXTRA_ARIVER_START_BUNDLE);
                    this.mOnCreateWithIllegalState = (intent.getFlags() & 1048576) != 0;
                    StringBuilder sb = new StringBuilder("onCreate ");
                    sb.append(this.mActivity.getClass().getName());
                    sb.append(" with ");
                    sb.append(this.mStartClientBundle);
                    RVLogger.d(LOG_TAG, sb.toString());
                    if (this.mStartClientBundle != null) {
                        if (StatusBarUtils.isSupport() && StatusBarUtils.isConfigSupport()) {
                            StatusBarUtils.setTransparentColor(this.mActivity, 855638016);
                        }
                        handleStartParams();
                        this.mStartToken = this.mStartClientBundle.startToken;
                        RVTraceUtils.traceEndSection(RVTraceKey.RV_ActivityHelper_setupParams);
                        return;
                    } else if (handleStartClientBundleNull()) {
                        RVLogger.d(LOG_TAG, "onCreate mStartClientBundle == null, handle by handleStartClientBundleNull!");
                        return;
                    } else {
                        throw new IllegalStateException("onCreate start bundle null!!");
                    }
                }
            } finally {
                RVTraceUtils.traceEndSection(RVTraceKey.RV_ActivityHelper_setupParams);
            }
        }
        throw new IllegalStateException("onCreate intent null!!");
    }

    public StartClientBundle getStartClientBundle() {
        return this.mStartClientBundle;
    }

    private void handleStartParams() {
        RVLogger.d(LOG_TAG, "NebulaActivity.onCreate handleStartParams start");
        try {
            this.mActivity.requestWindowFeature(1);
        } catch (Throwable th) {
            RVLogger.w(LOG_TAG, "requestWindowFeature error: ", th);
        }
        String string = BundleUtils.getString(this.mStartClientBundle.startParams, RVStartParams.KEY_ENABLE_SNAPSHOT);
        if ("NO".equalsIgnoreCase(string)) {
            RVLogger.d(LOG_TAG, "not allowed to task snapshot ".concat(String.valueOf(string)));
            this.mActivity.getWindow().addFlags(8192);
        }
        if (BundleUtils.getBoolean(this.mStartClientBundle.startParams, "fullscreen", false)) {
            this.mActivity.getWindow().setFlags(1024, 1024);
        }
        String string2 = BundleUtils.getString(this.mStartClientBundle.startParams, "landscape");
        if (string2.equals("landscape")) {
            if (this.mActivity.getRequestedOrientation() != 0) {
                this.mActivity.setRequestedOrientation(0);
            }
        } else if (string2.equals("auto") && this.mActivity.getRequestedOrientation() != -1) {
            this.mActivity.setRequestedOrientation(-1);
        }
        boolean z = BundleUtils.getBoolean(this.mStartClientBundle.startParams, RVStartParams.KEY_RESTART, false);
        this.mCloseAllAnim = BundleUtils.getBoolean(this.mStartClientBundle.startParams, RVStartParams.KEY_CLOSE_ALL_ACTIVITY_ANIMATION, false);
        this.mActivityAnimBean = (ActivityAnimBean) BundleUtils.getParcelable(this.mStartClientBundle.sceneParams, RVConstants.EXTRA_ACTIVITY_ANIM_BEAN);
        StringBuilder sb = new StringBuilder("onCreate with animBean: ");
        sb.append(this.mActivityAnimBean);
        RVLogger.d(LOG_TAG, sb.toString());
        if (z) {
            RVLogger.d(LOG_TAG, "onCreate disable animBean fromRestart.");
            ActivityAnimBean activityAnimBean = this.mActivityAnimBean;
            if (activityAnimBean != null) {
                activityAnimBean.enter = 0;
            } else {
                this.mActivity.overridePendingTransition(0, 0);
            }
        }
        if (this.mCloseAllAnim || this.mOnCreateWithIllegalState) {
            this.mActivity.overridePendingTransition(0, 0);
        } else {
            ActivityAnimBean activityAnimBean2 = this.mActivityAnimBean;
            if (activityAnimBean2 != null) {
                this.mActivity.overridePendingTransition(activityAnimBean2.enter, this.mActivityAnimBean.exit);
            }
        }
        RVLogger.d(LOG_TAG, "onCreate handleStartParams done.");
    }

    public void onNewIntent(Intent intent) {
        ActivityAnimBean activityAnimBean;
        RVLogger.d(LOG_TAG, "onNewIntent with intent: ".concat(String.valueOf(intent)));
        if (this.mApp != null) {
            if (intent.getBooleanExtra(RVConstants.EXTRA_NEED_START_ANIM, true) && (activityAnimBean = this.mActivityAnimBean) != null && activityAnimBean.needRestartAnim) {
                this.mActivity.overridePendingTransition(this.mActivityAnimBean.enterFast, this.mActivityAnimBean.exitFast);
            }
            Bundle extras = intent.getExtras();
            if (extras != null && !intent.getBooleanExtra("IS_LITE_MOVE_TASK", false)) {
                Bundle bundle = (Bundle) BundleUtils.getParcelable(extras, "startParams");
                Bundle bundle2 = (Bundle) BundleUtils.getParcelable(extras, RVConstants.EXTRA_SCENE_PARAMS);
                if (bundle != null) {
                    this.mApp.restart(bundle, bundle2);
                }
            }
        }
    }

    public void onResume() {
        RVLogger.d(LOG_TAG, "onResume");
        AppNode appNode = this.mApp;
        if (appNode != null) {
            appNode.resume();
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.mApp, TrackId.Stub_Activity_OnResume);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ExtensionPoint.as(ActivityResultPoint.class).node(this.mApp).create().onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        AppNode appNode = this.mApp;
        if (appNode != null && !appNode.isDestroyed()) {
            int childCount = this.mApp.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Page pageByIndex = this.mApp.getPageByIndex(i2);
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
        RVLogger.d(LOG_TAG, "onStop");
        AppNode appNode = this.mApp;
        if (appNode != null) {
            appNode.pause();
        }
    }

    public void onPause() {
        RVLogger.d(LOG_TAG, "onPause");
    }

    public void onConfigurationChanged(Configuration configuration) {
        RVLogger.d(LOG_TAG, "onConfigurationChanged: ".concat(String.valueOf(configuration)));
        AppNode appNode = this.mApp;
        if (appNode != null) {
            appNode.onConfigurationChanged(configuration);
        }
    }

    public void onUserInteraction() {
        AppNode appNode = this.mApp;
        if (appNode != null) {
            appNode.onUserInteraction();
        }
    }

    public void onUserLeaveHint() {
        AppNode appNode = this.mApp;
        if (appNode != null) {
            appNode.onUserLeaveHint();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        RVLogger.d(LOG_TAG, "onKeyDown ".concat(String.valueOf(i)));
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.mApp != null) {
                Boolean intercept = ExtensionPoint.as(BackKeyDownPoint.class).node(this.mApp).defaultValue(Boolean.FALSE).create().intercept(this.mApp);
                if (intercept == null || !intercept.booleanValue()) {
                    return this.mApp.backPressed();
                }
                return true;
            }
            FragmentActivity fragmentActivity = this.mActivity;
            if (fragmentActivity != null) {
                fragmentActivity.finish();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void doCommonDestroy() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mAlreadyDoDestroyed     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 1
            r4.mAlreadyDoDestroyed = r0     // Catch:{ all -> 0x0073 }
            com.alibaba.ariver.app.AppNode r0 = r4.mApp     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "AriverApp:ActivityHelper"
            java.lang.String r1 = "doCommonDestroy but mApp == null!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r0, r1)     // Catch:{ all -> 0x0073 }
            monitor-exit(r4)
            return
        L_0x0017:
            boolean r0 = r4.mCloseAllAnim     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0022
            androidx.fragment.app.FragmentActivity r0 = r4.mActivity     // Catch:{ all -> 0x0073 }
            r1 = 0
            r0.overridePendingTransition(r1, r1)     // Catch:{ all -> 0x0073 }
            goto L_0x0039
        L_0x0022:
            com.alibaba.ariver.app.api.activity.ActivityAnimBean r0 = r4.mActivityAnimBean     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0039
            com.alibaba.ariver.app.api.activity.ActivityAnimBean r0 = r4.mActivityAnimBean     // Catch:{ all -> 0x0073 }
            boolean r0 = r0.needPopAnim     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0039
            androidx.fragment.app.FragmentActivity r0 = r4.mActivity     // Catch:{ all -> 0x0073 }
            com.alibaba.ariver.app.api.activity.ActivityAnimBean r1 = r4.mActivityAnimBean     // Catch:{ all -> 0x0073 }
            int r1 = r1.popEnter     // Catch:{ all -> 0x0073 }
            com.alibaba.ariver.app.api.activity.ActivityAnimBean r2 = r4.mActivityAnimBean     // Catch:{ all -> 0x0073 }
            int r2 = r2.popExit     // Catch:{ all -> 0x0073 }
            r0.overridePendingTransition(r1, r2)     // Catch:{ all -> 0x0073 }
        L_0x0039:
            com.alibaba.ariver.kernel.ipc.IpcChannelManager r0 = com.alibaba.ariver.kernel.ipc.IpcChannelManager.getInstance()     // Catch:{ all -> 0x0073 }
            long r1 = r4.mStartToken     // Catch:{ all -> 0x0073 }
            r0.unRegisterClientChannel(r1)     // Catch:{ all -> 0x0073 }
            com.alibaba.ariver.app.AppNode r0 = r4.mApp     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x006c
            com.alibaba.ariver.app.AppNode r0 = r4.mApp     // Catch:{ all -> 0x0073 }
            boolean r0 = r0.isDestroyed()     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006c
            com.alibaba.ariver.app.AppNode r0 = r4.mApp     // Catch:{ all -> 0x0073 }
            int r0 = r0.getChildCount()     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = "AriverApp:ActivityHelper"
            java.lang.String r2 = "doCommonDestroy force mApp.destroy with count: "
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x0073 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r1, r2)     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006a
            com.alibaba.ariver.app.AppNode r0 = r4.mApp     // Catch:{ all -> 0x0073 }
            r0.exit()     // Catch:{ all -> 0x0073 }
        L_0x006a:
            monitor-exit(r4)
            return
        L_0x006c:
            com.alibaba.ariver.app.api.AppContext r0 = r4.mAppContext     // Catch:{ all -> 0x0073 }
            r0.destroy()     // Catch:{ all -> 0x0073 }
            monitor-exit(r4)
            return
        L_0x0073:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.app.activity.ActivityHelper.doCommonDestroy():void");
    }

    public App getApp() {
        return this.mApp;
    }
}
