package com.alibaba.ariver.resource.prepare.steps;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.log.AppLog;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTracePhase;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.resource.api.PackageDownloadCallback;
import com.alibaba.ariver.resource.api.PackageInstallCallback;
import com.alibaba.ariver.resource.api.PluginDownloadCallback;
import com.alibaba.ariver.resource.api.PluginInstallCallback;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.api.prepare.StepType;
import com.alibaba.ariver.resource.api.proxy.RVPluginResourceManager;
import com.alibaba.fastjson.JSONArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStep extends BasePrepareStep {

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f10199a = new AtomicInteger(1);

    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    public /* bridge */ /* synthetic */ boolean isFinished() {
        return super.isFinished();
    }

    public StepType getType() {
        return StepType.OFFLINE;
    }

    public void execute(PrepareController prepareController, PrepareContext prepareContext, PrepareCallback prepareCallback) {
        StringBuilder sb = new StringBuilder(RVTraceKey.RV_Prepare_Execute_);
        sb.append(getType());
        RVTraceUtils.traceBeginSection(sb.toString());
        super.execute(prepareController, prepareContext, prepareCallback);
        prepareContext.getPrepareData().setOfflineMode(prepareContext.offlineMode);
        if (prepareContext.offlineMode.isSync()) {
            prepareController.lock(this);
            a(prepareController, prepareContext, prepareCallback);
            return;
        }
        StringBuilder sb2 = new StringBuilder(RVTraceKey.RV_Prepare_Execute_);
        sb2.append(getType());
        RVTraceUtils.traceEndSection(sb2.toString());
        RVLogger.e(this.LOG_TAG, "offlineMode is not Sync!");
    }

    private void a(final PrepareController prepareController, final PrepareContext prepareContext, final PrepareCallback prepareCallback) {
        final AppModel appModel = prepareContext.getAppModel();
        if (appModel == null) {
            unlockAndMoveToNext(prepareController);
        } else if (appModel.getAppInfoModel() == null || appModel.getAppInfoModel().getPlugins() == null || appModel.getAppInfoModel().getPlugins().size() <= 0) {
            RVLogger.d(this.LOG_TAG, "doSyncOffline without plugins!");
            checkMainPackage(prepareController, prepareContext, prepareCallback);
        } else {
            this.f10199a.addAndGet(1);
            RVLogger.d(this.LOG_TAG, "doSyncOffline with plugins!");
            ExecutorUtils.execute(ExecutorType.URGENT, new Runnable() {
                public void run() {
                    DownloadStep.this.checkMainPackage(prepareController, prepareContext, prepareCallback);
                }
            });
            final PrepareController prepareController2 = prepareController;
            final PrepareContext prepareContext2 = prepareContext;
            final PrepareCallback prepareCallback2 = prepareCallback;
            ExecutorUtils.execute(ExecutorType.URGENT, new Runnable() {
                public void run() {
                    DownloadStep.this.a(appModel.getAppInfoModel().getPlugins(), prepareController2, prepareContext2, prepareCallback2);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void checkMainPackage(final PrepareController prepareController, final PrepareContext prepareContext, PrepareCallback prepareCallback) {
        if (this.resourceManager.isAvailable(prepareContext.getAppModel())) {
            unlockAndMoveToNext(prepareController);
            return;
        }
        boolean isDownloaded = this.resourceManager.isDownloaded(prepareContext.getAppModel());
        String str = this.LOG_TAG;
        StringBuilder sb = new StringBuilder("offlineMode ");
        sb.append(prepareContext.offlineMode);
        sb.append(" isDownloaded ");
        sb.append(isDownloaded);
        RVLogger.d(str, sb.toString());
        if (!isDownloaded) {
            AppModel appModel = prepareContext.getAppModel();
            if (a(prepareContext.getStartParams(), appModel)) {
                prepareContext.getSceneParams().putBoolean(RVConstants.EXTRA_USING_FALLBACK_START, true);
                Bundle bundle = new Bundle();
                bundle.putParcelable(IpcMessageConstants.EXTRA_FALLBACK_APP_MODEL, appModel);
                IpcServerUtils.sendMsgToClient(prepareContext.getAppId(), prepareContext.getStartToken(), 14, bundle);
                unlockAndMoveToNext(prepareController);
                return;
            }
            prepareController.postTimeOut(prepareContext.getTimeout());
            prepareCallback.showLoading(true, prepareContext.getEntryInfo());
            prepareContext.getPrepareData().setDownloadTime(System.currentTimeMillis());
            onDownloadStart(prepareContext);
            StringBuilder sb2 = new StringBuilder(RVTraceKey.RV_Download_App_);
            sb2.append(prepareContext.getAppModel().getAppId());
            String obj = sb2.toString();
            int i = RVTracePhase.cookieSeed;
            RVTracePhase.cookieSeed = i + 1;
            RVTraceUtils.asyncTraceBegin(obj, i);
            this.resourceManager.downloadApp(prepareContext.getAppModel(), true, new MyPackageDownloadCallback(prepareContext, prepareController, obj, i));
            return;
        }
        prepareContext.getPrepareData().setInstallTime(System.currentTimeMillis());
        onInstallStart(prepareContext);
        this.resourceManager.installApp(prepareContext.getAppModel(), new PackageInstallCallback() {
            public void onResult(boolean z, String str) {
                prepareContext.getPrepareData().setInstallEndTime(System.currentTimeMillis());
                RVLogger.d(DownloadStep.this.LOG_TAG, "install result:".concat(String.valueOf(z)));
                if (z) {
                    DownloadStep.this.onInstallFinish(prepareContext);
                    DownloadStep.this.unlockAndMoveToNext(prepareController);
                    return;
                }
                prepareController.moveToError(new PrepareException("5", "unzip exception"));
            }
        });
    }

    private boolean a(Bundle bundle, AppModel appModel) {
        if (appModel == null || appModel.getAppInfoModel() == null) {
            return false;
        }
        if ((appModel.getAppInfoModel().getTemplateConfig() != null && appModel.getAppInfoModel().getTemplateConfig().isTemplateValid()) || TextUtils.isEmpty(appModel.getAppInfoModel().getFallbackBaseUrl())) {
            return false;
        }
        if ("YES".equalsIgnoreCase(BundleUtils.getString(bundle, RVStartParams.KEY_CAN_FALLBACK))) {
            return true;
        }
        JSONArray configJSONArray = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("ariver_enableFallbackList");
        if (configJSONArray == null) {
            return false;
        }
        if (configJSONArray.contains("*") || configJSONArray.contains(appModel.getAppId())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void a(List<PluginModel> list, PrepareController prepareController, PrepareContext prepareContext, PrepareCallback prepareCallback) {
        RVPluginResourceManager rVPluginResourceManager = (RVPluginResourceManager) RVProxy.get(RVPluginResourceManager.class);
        if (rVPluginResourceManager.isAvailable(list)) {
            a(prepareContext);
            unlockAndMoveToNext(prepareController);
            return;
        }
        RVLogger.d(this.LOG_TAG, "checkPlugins plugin not all available!");
        prepareController.postTimeOut(prepareContext.getTimeout());
        prepareCallback.showLoading(true, prepareContext.getEntryInfo());
        prepareContext.getPrepareData().setDownloadTime(System.currentTimeMillis());
        rVPluginResourceManager.downloadPlugins(list, new MyPluginDownloadCallback(list, prepareContext, prepareController));
    }

    /* access modifiers changed from: protected */
    public void unlockAndMoveToNext(PrepareController prepareController) {
        String str = this.LOG_TAG;
        StringBuilder sb = new StringBuilder("unLockAndMoveToNext with countDownTime: ");
        sb.append(this.f10199a);
        RVLogger.d(str, sb.toString());
        if (this.f10199a.decrementAndGet() == 0) {
            prepareController.unlock(this);
            StringBuilder sb2 = new StringBuilder(RVTraceKey.RV_Prepare_Execute_);
            sb2.append(getType());
            RVTraceUtils.traceEndSection(sb2.toString());
            prepareController.moveToNext();
        }
    }

    class MyPluginDownloadCallback implements PluginDownloadCallback {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final PrepareContext f10201a;
        /* access modifiers changed from: private */
        public final PrepareController b;
        /* access modifiers changed from: private */
        public final List<PluginModel> c;

        public void onSingleFailed(PluginModel pluginModel, int i, String str) {
        }

        MyPluginDownloadCallback(List<PluginModel> list, PrepareContext prepareContext, PrepareController prepareController) {
            this.c = list;
            this.f10201a = prepareContext;
            this.b = prepareController;
        }

        public void onSuccess() {
            this.f10201a.getPrepareData().setDownloadEndTime(System.currentTimeMillis());
            this.f10201a.getPrepareData().setInstallTime(System.currentTimeMillis());
            ExecutorUtils.execute(ExecutorType.URGENT_DISPLAY, new Runnable() {
                public void run() {
                    ((RVPluginResourceManager) RVProxy.get(RVPluginResourceManager.class)).installPlugins(MyPluginDownloadCallback.this.c, new PluginInstallCallback() {
                        public void onSingleFailed(PluginModel pluginModel, int i, String str) {
                        }

                        public void onSuccess(List<Pair<PluginModel, String>> list) {
                            RVLogger.d(DownloadStep.this.LOG_TAG, "installPlugins onSuccess");
                            MyPluginDownloadCallback.this.f10201a.getPrepareData().setInstallEndTime(System.currentTimeMillis());
                            DownloadStep.this.unlockAndMoveToNext(MyPluginDownloadCallback.this.b);
                        }

                        public void onFailed(int i, String str) {
                            String str2 = DownloadStep.this.LOG_TAG;
                            StringBuilder sb = new StringBuilder("installPlugins onFailed ");
                            sb.append(i);
                            sb.append(", ");
                            sb.append(str);
                            RVLogger.w(str2, sb.toString());
                            MyPluginDownloadCallback.this.b.moveToError(new PrepareException("5", "unzip exception"));
                        }
                    });
                }
            });
        }

        public void onFailed(int i, String str) {
            this.f10201a.getPrepareData().setDownloadEndTime(System.currentTimeMillis());
            String str2 = DownloadStep.this.LOG_TAG;
            StringBuilder sb = new StringBuilder("onFailed ");
            sb.append(i);
            sb.append(" ");
            sb.append(str);
            RVLogger.w(str2, sb.toString());
            PrepareController prepareController = this.b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append("|");
            sb2.append(str);
            prepareController.moveToError(new PrepareException("4", sb2.toString()));
        }
    }

    class MyPackageDownloadCallback implements PackageDownloadCallback {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final PrepareContext f10200a;
        /* access modifiers changed from: private */
        public final PrepareController b;
        private final int c;
        private final String d;

        public void onCancel(String str) {
        }

        public void onPrepare(String str) {
        }

        public void onProgress(String str, int i) {
        }

        MyPackageDownloadCallback(PrepareContext prepareContext, PrepareController prepareController, String str, int i) {
            this.f10200a = prepareContext;
            this.b = prepareController;
            this.d = str;
            this.c = i;
        }

        public void onFinish(@Nullable String str) {
            RVLogger.d(DownloadStep.this.LOG_TAG, "downloadPackage onFinish");
            RVTraceUtils.asyncTraceEnd(this.d, this.c);
            DownloadStep.this.onDownloadFinish(this.f10200a);
            this.f10200a.getPrepareData().setDownloadEndTime(System.currentTimeMillis());
            this.f10200a.getPrepareData().setInstallTime(System.currentTimeMillis());
            ExecutorUtils.execute(ExecutorType.URGENT_DISPLAY, new Runnable() {
                public void run() {
                    DownloadStep.this.onInstallStart(MyPackageDownloadCallback.this.f10200a);
                    DownloadStep.this.resourceManager.installApp(MyPackageDownloadCallback.this.f10200a.getAppModel(), new PackageInstallCallback() {
                        public void onResult(boolean z, String str) {
                            MyPackageDownloadCallback.this.f10200a.getPrepareData().setInstallEndTime(System.currentTimeMillis());
                            RVLogger.d(DownloadStep.this.LOG_TAG, "downloadPackage installResult ".concat(String.valueOf(z)));
                            if (z) {
                                DownloadStep.this.onInstallFinish(MyPackageDownloadCallback.this.f10200a);
                                DownloadStep.this.unlockAndMoveToNext(MyPackageDownloadCallback.this.b);
                                return;
                            }
                            MyPackageDownloadCallback.this.b.moveToError(new PrepareException("5", "unzip exception"));
                        }
                    });
                }
            });
        }

        public void onFailed(String str, int i, String str2) {
            String str3 = DownloadStep.this.LOG_TAG;
            StringBuilder sb = new StringBuilder("downloadPackage ");
            sb.append(i);
            sb.append(" ");
            sb.append(str2);
            RVLogger.d(str3, sb.toString());
            this.f10200a.getPrepareData().setDownloadEndTime(System.currentTimeMillis());
            PrepareController prepareController = this.b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append("|");
            sb2.append(str2);
            prepareController.moveToError(new PrepareException("4", sb2.toString()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDownloadStart(PrepareContext prepareContext) {
        if (prepareContext != null) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState("prepare 4 ")).setAppId(prepareContext.getAppId()).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).build());
        }
    }

    /* access modifiers changed from: protected */
    public void onDownloadFinish(PrepareContext prepareContext) {
        if (prepareContext != null) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState("prepare 5 ")).setAppId(prepareContext.getAppId()).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).build());
        }
    }

    /* access modifiers changed from: protected */
    public void onInstallStart(PrepareContext prepareContext) {
        if (prepareContext != null) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState("prepare 6 ")).setAppId(prepareContext.getAppId()).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).build());
        }
    }

    /* access modifiers changed from: protected */
    public void onInstallFinish(PrepareContext prepareContext) {
        if (prepareContext != null) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState("prepare 7 ")).setAppId(prepareContext.getAppId()).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).build());
        }
    }

    private void a(PrepareContext prepareContext) {
        if (prepareContext != null) {
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState(AppLog.APP_LOG_DOWNGRADE)).setAppId(prepareContext.getAppId()).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).build());
        }
    }
}
