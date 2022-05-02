package com.alibaba.griver.base.resource.interceptor;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.network.NetworkUtil;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.PackageDownloadCallback;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.api.prepare.PrepareStep;
import com.alibaba.ariver.resource.api.prepare.StepInterceptor;
import com.alibaba.ariver.resource.api.prepare.StepType;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.resource.appinfo.UpdateAppCallback;
import com.alibaba.griver.api.resource.appinfo.UpdateAppException;
import com.alibaba.griver.api.resource.appinfo.UpdateAppParam;
import com.alibaba.griver.base.api.GriverAsyncUpdateManager;
import com.alibaba.griver.base.api.GriverPerformanceStages;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.base.resource.appinfo.GriverAppUpdater;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GriverPrepareInterceptor implements StepInterceptor {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public PrepareContext f10240a;
    private PrepareCallback b;

    public boolean onError(PrepareException prepareException, PrepareController prepareController) {
        return false;
    }

    public void init(PrepareContext prepareContext, PrepareCallback prepareCallback) {
        this.f10240a = prepareContext;
        this.b = prepareCallback;
    }

    public void onGetAppInfo(AppModel appModel) {
        Bundle startParams;
        if (appModel != null && (startParams = this.f10240a.getStartParams()) != null) {
            startParams.putString("appVersion", appModel.getAppVersion());
        }
    }

    public boolean before(PrepareStep prepareStep, PrepareController prepareController) {
        PrepareContext prepareContext;
        if (prepareStep.getType() == StepType.SETUP) {
            StringBuilder sb = new StringBuilder("before setup appid = ");
            sb.append(this.f10240a.getAppId());
            sb.append(" appversion = ");
            sb.append(this.f10240a.getAppVersion());
            sb.append(" updatemode = ");
            sb.append(this.f10240a.updateMode.name());
            GriverLogger.d("UsePackage", sb.toString());
            GriverPerformanceStages.setupStart = SystemClock.elapsedRealtime();
            this.f10240a.getSceneParams().putLong(RVConstants.EXTRA_SETUP_TIMESTAMP, GriverPerformanceStages.setupStart);
            return false;
        } else if (prepareStep.getType() == StepType.UPDATE) {
            StringBuilder sb2 = new StringBuilder("before update appid = ");
            sb2.append(this.f10240a.getAppId());
            sb2.append(" appversion = ");
            sb2.append(this.f10240a.getAppVersion());
            sb2.append(" updatemode = ");
            sb2.append(this.f10240a.updateMode.name());
            GriverLogger.d("UsePackage", sb2.toString());
            GriverPerformanceStages.appInfoStart = SystemClock.elapsedRealtime();
            return false;
        } else if (prepareStep.getType() != StepType.OFFLINE) {
            return false;
        } else {
            StringBuilder sb3 = new StringBuilder("before offline appid = ");
            sb3.append(this.f10240a.getAppId());
            sb3.append(" appversion = ");
            sb3.append(this.f10240a.getAppVersion());
            sb3.append(" updatemode = ");
            sb3.append(this.f10240a.updateMode.name());
            GriverLogger.d("UsePackage", sb3.toString());
            if (this.b == null || (prepareContext = this.f10240a) == null || prepareContext.getEntryInfo() == null) {
                return false;
            }
            this.b.showLoading(true, this.f10240a.getEntryInfo());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x011f, code lost:
        if (com.alibaba.griver.base.resource.predownload.AppPreDownloadManager.getInstance().availableAppForAppId(r11, r10.f10240a.getAppVersion()) == null) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean after(com.alibaba.ariver.resource.api.prepare.PrepareStep r11, com.alibaba.ariver.resource.api.prepare.PrepareController r12) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "full_link"
            r0.<init>(r1)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r1 = r10.f10240a
            java.lang.String r1 = r1.getAppId()
            r0.append(r1)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r1 = r10.f10240a
            long r1 = r1.getStartToken()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager r1 = com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager.getInstance()
            com.alibaba.griver.base.stagemonitor.GriverStageMonitor r1 = r1.getStageMonitor(r0)
            if (r1 != 0) goto L_0x0033
            com.alibaba.griver.base.stagemonitor.impl.GriverFullLinkStageMonitor r1 = new com.alibaba.griver.base.stagemonitor.impl.GriverFullLinkStageMonitor
            r1.<init>()
            com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager r2 = com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager.getInstance()
            r2.registerStageMonitor(r0, r1)
        L_0x0033:
            com.alibaba.ariver.resource.api.prepare.StepType r0 = r11.getType()
            com.alibaba.ariver.resource.api.prepare.StepType r2 = com.alibaba.ariver.resource.api.prepare.StepType.SETUP
            java.lang.String r3 = " appversion = "
            java.lang.String r4 = "UsePackage"
            r5 = 1
            r6 = 0
            java.lang.String r7 = "GriverPrepareInterceptor"
            if (r0 != r2) goto L_0x017b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "after setup appid = "
            r11.<init>(r12)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            java.lang.String r12 = r12.getAppId()
            r11.append(r12)
            r11.append(r3)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            java.lang.String r12 = r12.getAppVersion()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.alibaba.griver.base.common.logger.GriverLogger.d(r4, r11)
            java.lang.String r11 = "intercept setup step after"
            com.alibaba.griver.base.common.logger.GriverLogger.d(r7, r11)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r11 = r10.f10240a
            java.lang.String r11 = r11.getAppId()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            com.alibaba.ariver.resource.api.prepare.UpdateMode r12 = r12.updateMode
            com.alibaba.ariver.resource.api.prepare.UpdateMode r0 = com.alibaba.ariver.resource.api.prepare.UpdateMode.SYNC_FORCE
            if (r12 == r0) goto L_0x0122
            r8 = 604800(0x93a80, double:2.98811E-318)
            java.lang.String r12 = "preReqRate"
            long r8 = r10.a(r12, r8)
            boolean r12 = r10.a(r11)
            if (r12 != 0) goto L_0x00c7
            boolean r12 = com.alibaba.griver.base.common.utils.AppInfoUtils.isOutOfTime(r11, r8)
            if (r12 != 0) goto L_0x00c7
            java.lang.String r12 = com.alibaba.griver.base.common.env.GriverEnv.getEnvironment()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0099
            goto L_0x00c7
        L_0x0099:
            com.alibaba.griver.base.resource.predownload.AppPreDownloadManager r12 = com.alibaba.griver.base.resource.predownload.AppPreDownloadManager.getInstance()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppVersion()
            com.alibaba.ariver.resource.api.models.AppModel r12 = r12.availableAppForAppId(r11, r0)
            if (r12 != 0) goto L_0x00b8
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "app config is out of date and pre download is not available, sync update for app: "
            java.lang.String r12 = r0.concat(r12)
            com.alibaba.griver.base.common.logger.GriverLogger.d(r7, r12)
            goto L_0x014e
        L_0x00b8:
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "app config is out of date but pre download available, use pre download app info for app: "
            java.lang.String r12 = r0.concat(r12)
            com.alibaba.griver.base.common.logger.GriverLogger.d(r7, r12)
            goto L_0x013f
        L_0x00c7:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "after setup 强制更新 appid = "
            r12.<init>(r0)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppId()
            r12.append(r0)
            r12.append(r3)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppVersion()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.alibaba.griver.base.common.logger.GriverLogger.d(r4, r12)
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "amcs config force update, sync update for app: "
            java.lang.String r12 = r0.concat(r12)
            com.alibaba.griver.base.common.logger.GriverLogger.d(r7, r12)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            com.alibaba.ariver.resource.api.prepare.UpdateMode r0 = com.alibaba.ariver.resource.api.prepare.UpdateMode.SYNC_FORCE
            r12.updateMode = r0
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            com.alibaba.ariver.resource.api.prepare.PrepareData r12 = r12.getPrepareData()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            com.alibaba.ariver.resource.api.prepare.UpdateMode r0 = r0.updateMode
            r12.setRequestMode(r0)
            boolean r12 = r10.a(r11)
            if (r12 == 0) goto L_0x0111
        L_0x0110:
            goto L_0x014e
        L_0x0111:
            com.alibaba.griver.base.resource.predownload.AppPreDownloadManager r12 = com.alibaba.griver.base.resource.predownload.AppPreDownloadManager.getInstance()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppVersion()
            com.alibaba.ariver.resource.api.models.AppModel r12 = r12.availableAppForAppId(r11, r0)
            if (r12 != 0) goto L_0x013f
            goto L_0x0110
        L_0x0122:
            com.alibaba.griver.base.resource.predownload.AppPreDownloadManager r12 = com.alibaba.griver.base.resource.predownload.AppPreDownloadManager.getInstance()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppVersion()
            com.alibaba.ariver.resource.api.models.AppModel r12 = r12.availableAppForAppId(r11, r0)
            if (r12 == 0) goto L_0x0141
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "app config is in date and pre download is not available, don't update for app: "
            java.lang.String r12 = r0.concat(r12)
            com.alibaba.griver.base.common.logger.GriverLogger.d(r7, r12)
        L_0x013f:
            r12 = 1
            goto L_0x014f
        L_0x0141:
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "app config is int date but pre download newer available, use pre download app info for app: "
            java.lang.String r12 = r0.concat(r12)
            com.alibaba.griver.base.common.logger.GriverLogger.d(r7, r12)
        L_0x014e:
            r12 = 0
        L_0x014f:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "fetchedSceneType"
            r1.addParam(r0, r12)
            com.alibaba.griver.base.resource.predownload.AppPreDownloadManager r12 = com.alibaba.griver.base.resource.predownload.AppPreDownloadManager.getInstance()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppVersion()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r2 = r10.f10240a
            com.alibaba.ariver.resource.api.prepare.UpdateMode r2 = r2.updateMode
            com.alibaba.ariver.resource.api.prepare.UpdateMode r3 = com.alibaba.ariver.resource.api.prepare.UpdateMode.SYNC_FORCE
            if (r2 != r3) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r5 = 0
        L_0x016c:
            int r11 = r12.getAppInfoAvailableReason(r11, r0, r5)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "noUsePreDownloadAppReason"
            r1.addParam(r12, r11)
            goto L_0x0361
        L_0x017b:
            com.alibaba.ariver.resource.api.prepare.StepType r0 = r11.getType()
            com.alibaba.ariver.resource.api.prepare.StepType r2 = com.alibaba.ariver.resource.api.prepare.StepType.START
            if (r0 != r2) goto L_0x0279
            java.lang.String r11 = "intercept start step after"
            com.alibaba.griver.base.common.logger.GriverLogger.d(r7, r11)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r11 = r10.f10240a
            java.lang.String r11 = r11.getAppId()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "after start appid = "
            r12.<init>(r0)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppId()
            r12.append(r0)
            r12.append(r3)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppVersion()
            r12.append(r0)
            java.lang.String r0 = " updatemode = "
            r12.append(r0)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            com.alibaba.ariver.resource.api.prepare.UpdateMode r0 = r0.updateMode
            java.lang.String r0 = r0.name()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.alibaba.griver.base.common.logger.GriverLogger.d(r4, r12)
            r2 = 1800(0x708, double:8.893E-321)
            java.lang.String r12 = "updateReqRate"
            long r2 = r10.a(r12, r2)
            boolean r12 = com.alibaba.griver.base.common.utils.AppInfoUtils.isOutOfTime(r11, r2)
            java.lang.String r0 = "grv_appType"
            if (r12 == 0) goto L_0x01e7
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = "app config need async update, appId: "
            java.lang.String r11 = r12.concat(r11)
            com.alibaba.griver.base.common.logger.GriverLogger.d(r7, r11)
            r10.a()
            java.lang.String r11 = "asyncUpdate"
            r1.addParam(r0, r11)
            goto L_0x01ec
        L_0x01e7:
            java.lang.String r11 = "noUpdate"
            r1.addParam(r0, r11)
        L_0x01ec:
            long r11 = java.lang.System.currentTimeMillis()
            com.alibaba.griver.base.api.GriverPerformanceStages.setupEnd = r11
            com.alibaba.ariver.resource.api.prepare.PrepareContext r11 = r10.f10240a
            android.os.Bundle r11 = r11.getSceneParams()
            long r2 = com.alibaba.griver.base.api.GriverPerformanceStages.setupEnd
            java.lang.String r12 = "setupEndTimeStamp"
            r11.putLong(r12, r2)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r11 = r10.f10240a
            com.alibaba.ariver.resource.api.models.AppModel r11 = r11.getAppModel()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r12 = new com.alibaba.griver.base.common.monitor.MonitorMap$Builder
            r12.<init>()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r2 = r10.f10240a
            java.lang.String r2 = r2.getAppId()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r12 = r12.appId(r2)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r11 = r12.version((com.alibaba.ariver.resource.api.models.AppModel) r11)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            android.os.Bundle r12 = r12.getStartParams()
            java.lang.String r2 = "url"
            java.lang.String r12 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r12, r2)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r11 = r11.url(r12)
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r11 = r11.needAsynAppType(r5)
            java.lang.String r12 = com.alibaba.griver.base.common.env.GriverEnv.getEnvironment()
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r11 = r11.env(r12)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            android.os.Bundle r12 = r12.getStartParams()
            java.lang.String r12 = com.alibaba.griver.base.common.utils.MonitorUtils.getSourceInfoFromStartupParams(r12)
            java.lang.String r2 = "sourceInfo"
            com.alibaba.griver.base.common.monitor.MonitorMap$Builder r11 = r11.append(r2, r12)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            com.alibaba.ariver.resource.api.prepare.UpdateMode r12 = r12.updateMode
            com.alibaba.ariver.resource.api.prepare.UpdateMode r3 = com.alibaba.ariver.resource.api.prepare.UpdateMode.SYNC_FORCE
            if (r12 != r3) goto L_0x025f
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            boolean r12 = r12.isOriginHasAppInfo()
            if (r12 == 0) goto L_0x025a
            java.lang.String r12 = "syncUpdate"
            r1.addParam(r0, r12)
            goto L_0x025f
        L_0x025a:
            java.lang.String r12 = "notExist"
            r1.addParam(r0, r12)
        L_0x025f:
            java.util.Map r11 = r11.build()
            com.alibaba.ariver.resource.api.prepare.PrepareContext r12 = r10.f10240a
            android.os.Bundle r12 = r12.getStartParams()
            java.lang.String r12 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r12, r2)
            r1.addParam(r2, r12)
            java.lang.String r12 = "mini_start_app"
            java.lang.String r0 = "GriverAppContainer"
            com.alibaba.griver.base.common.monitor.GriverMonitor.event(r12, r0, r11)
            goto L_0x0361
        L_0x0279:
            com.alibaba.ariver.resource.api.prepare.StepType r0 = r11.getType()
            com.alibaba.ariver.resource.api.prepare.StepType r1 = com.alibaba.ariver.resource.api.prepare.StepType.UPDATE
            if (r0 != r1) goto L_0x0353
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "after update appid = "
            r11.<init>(r0)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppId()
            r11.append(r0)
            r11.append(r3)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            java.lang.String r0 = r0.getAppVersion()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.alibaba.griver.base.common.logger.GriverLogger.d(r4, r11)
            com.alibaba.ariver.resource.api.prepare.PrepareContext r11 = r10.f10240a
            com.alibaba.ariver.resource.api.models.AppModel r0 = r11.getAppModel()
            com.alibaba.ariver.app.api.EntryInfo r0 = r10.getEntryInfo(r0)
            r11.setEntryInfo(r0)
            com.alibaba.ariver.resource.api.prepare.PrepareCallback r11 = r10.b
            if (r11 == 0) goto L_0x02be
            com.alibaba.ariver.resource.api.prepare.PrepareContext r0 = r10.f10240a
            com.alibaba.ariver.app.api.EntryInfo r0 = r0.getEntryInfo()
            r11.updateLoading(r0)
        L_0x02be:
            com.alibaba.ariver.resource.api.prepare.PrepareContext r11 = r10.f10240a
            com.alibaba.ariver.resource.api.models.AppModel r11 = r11.getAppModel()
            if (r11 == 0) goto L_0x034c
            java.lang.String r0 = r11.getAppId()
            java.lang.String r11 = r11.getAppVersion()
            com.alibaba.ariver.resource.api.models.AppModel r11 = com.alibaba.griver.base.resource.appcenter.GriverAppCenter.queryAppInfo(r0, r11)
            if (r11 == 0) goto L_0x034c
            java.lang.String r0 = com.alibaba.griver.base.common.utils.AppInfoUtils.getPublishingStatus(r11)
            java.lang.String r1 = "SUSPENDED"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            java.lang.String r2 = "REMOVED"
            r3 = 2
            if (r0 != 0) goto L_0x02f3
            java.lang.String r0 = com.alibaba.griver.base.common.utils.AppInfoUtils.getPublishingStatus(r11)
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x02f3
            int r0 = com.alibaba.griver.base.common.utils.AppInfoUtils.getAppType(r11)
            if (r3 == r0) goto L_0x034c
        L_0x02f3:
            int r0 = com.alibaba.griver.base.common.utils.AppInfoUtils.getAppType(r11)
            if (r3 == r0) goto L_0x030e
            com.alibaba.ariver.resource.api.prepare.PrepareException r11 = new com.alibaba.ariver.resource.api.prepare.PrepareException
            android.content.res.Resources r0 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r1 = com.alibaba.griver.base.R.string.griver_app_not_exist
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "10003"
            r11.<init>(r1, r0)
            r12.moveToError(r11)
            goto L_0x034b
        L_0x030e:
            java.lang.String r0 = com.alibaba.griver.base.common.utils.AppInfoUtils.getPublishingStatus(r11)
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x032d
            com.alibaba.ariver.resource.api.prepare.PrepareException r11 = new com.alibaba.ariver.resource.api.prepare.PrepareException
            android.content.res.Resources r0 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r1 = com.alibaba.griver.base.R.string.griver_app_suspended
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "1002"
            r11.<init>(r1, r0)
            r12.moveToError(r11)
            goto L_0x034b
        L_0x032d:
            java.lang.String r11 = com.alibaba.griver.base.common.utils.AppInfoUtils.getPublishingStatus(r11)
            boolean r11 = android.text.TextUtils.equals(r11, r2)
            if (r11 == 0) goto L_0x034b
            com.alibaba.ariver.resource.api.prepare.PrepareException r11 = new com.alibaba.ariver.resource.api.prepare.PrepareException
            android.content.res.Resources r0 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            int r1 = com.alibaba.griver.base.R.string.griver_app_removed
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "1001"
            r11.<init>(r1, r0)
            r12.moveToError(r11)
        L_0x034b:
            return r5
        L_0x034c:
            long r11 = android.os.SystemClock.elapsedRealtime()
            com.alibaba.griver.base.api.GriverPerformanceStages.appInfoEnd = r11
            goto L_0x0361
        L_0x0353:
            com.alibaba.ariver.resource.api.prepare.StepType r11 = r11.getType()
            com.alibaba.ariver.resource.api.prepare.StepType r12 = com.alibaba.ariver.resource.api.prepare.StepType.OFFLINE
            if (r11 != r12) goto L_0x0361
            long r11 = android.os.SystemClock.elapsedRealtime()
            com.alibaba.griver.base.api.GriverPerformanceStages.resourceReady = r11
        L_0x0361:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.resource.interceptor.GriverPrepareInterceptor.after(com.alibaba.ariver.resource.api.prepare.PrepareStep, com.alibaba.ariver.resource.api.prepare.PrepareController):boolean");
    }

    private void a() {
        if (AppInfoScene.isDevSource(this.f10240a.getStartParams())) {
            RVLogger.d("GriverPrepareInterceptor", "not updateAppAsync by debug scene!");
            return;
        }
        int b2 = b();
        ScheduledThreadPoolExecutor scheduledExecutor = GriverExecutors.getScheduledExecutor();
        if (scheduledExecutor != null) {
            scheduledExecutor.schedule(new Runnable() {
                public void run() {
                    String appId = GriverPrepareInterceptor.this.f10240a.getAppId();
                    String appVersion = GriverPrepareInterceptor.this.f10240a.getAppVersion();
                    GriverLogger.d("GriverPrepareInterceptor", "updateAppAsync appId:".concat(String.valueOf(appId)));
                    UpdateAppParam updateAppParam = new UpdateAppParam();
                    HashMap hashMap = new HashMap();
                    hashMap.put(appId, appVersion);
                    updateAppParam.setRequestApps(hashMap);
                    final GriverAsyncUpdateManager griverAsyncUpdateManager = (GriverAsyncUpdateManager) RVProxy.get(GriverAsyncUpdateManager.class);
                    griverAsyncUpdateManager.setAppId(appId);
                    GriverAppUpdater.updateApp(updateAppParam, new UpdateAppCallback() {
                        public void onSuccess(List<AppModel> list) {
                            if (list == null || list.size() <= 0) {
                                GriverLogger.w("GriverPrepareInterceptor", "async update success but result is null");
                                return;
                            }
                            GriverLogger.d("GriverPrepareInterceptor", "async update success");
                            for (AppModel next : list) {
                                if (!AppInfoUtils.shouldInstall(next)) {
                                    GriverLogger.d("GriverPrepareInterceptor", "should not install");
                                    griverAsyncUpdateManager.onUpdateResult(false);
                                } else {
                                    RVResourceManager rVResourceManager = (RVResourceManager) RVProxy.get(RVResourceManager.class);
                                    if (rVResourceManager != null) {
                                        if (rVResourceManager.isAvailable(next) || rVResourceManager.isDownloaded(next)) {
                                            griverAsyncUpdateManager.onUpdateResult(false);
                                        } else {
                                            int downloadType = AppInfoUtils.getDownloadType(next);
                                            if (downloadType == 2) {
                                                griverAsyncUpdateManager.onUpdateResult(false);
                                            } else if (downloadType != 0 || "wifi".equalsIgnoreCase(NetworkUtil.getSimpleNetworkType(GriverEnv.getApplicationContext()))) {
                                                griverAsyncUpdateManager.onUpdateResult(true);
                                                rVResourceManager.downloadApp(next, true, new PackageDownloadCallback() {
                                                    public void onCancel(String str) {
                                                    }

                                                    public void onPrepare(String str) {
                                                    }

                                                    public void onProgress(String str, int i) {
                                                    }

                                                    public void onFinish(@Nullable String str) {
                                                        GriverLogger.d("GriverPrepareInterceptor", "download success: ".concat(String.valueOf(str)));
                                                        griverAsyncUpdateManager.onDownloadResult(true);
                                                    }

                                                    public void onFailed(String str, int i, String str2) {
                                                        StringBuilder sb = new StringBuilder("download failed: ");
                                                        sb.append(str);
                                                        sb.append(", ");
                                                        sb.append(i);
                                                        sb.append(", ");
                                                        sb.append(str2);
                                                        GriverLogger.e("GriverPrepareInterceptor", sb.toString());
                                                        griverAsyncUpdateManager.onDownloadResult(false);
                                                    }
                                                });
                                            } else {
                                                griverAsyncUpdateManager.onUpdateResult(false);
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        public void onFailure(UpdateAppException updateAppException) {
                            GriverLogger.w("GriverPrepareInterceptor", "async update failed with exception", updateAppException);
                        }
                    });
                }
            }, (long) b2, TimeUnit.SECONDS);
        }
    }

    private int b() {
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_APP_INFO_UPDATE_CONFIG, GriverConfigConstants.DEFAULT_APP_INFO_UPDATE);
        try {
            JSONObject parseObject = JSON.parseObject(config);
            if (parseObject.containsKey(GriverConfigConstants.PARAM_APP_INFO_ASYNC_UPDATE_DELAY)) {
                return parseObject.getInteger(GriverConfigConstants.PARAM_APP_INFO_ASYNC_UPDATE_DELAY).intValue();
            }
            return 5;
        } catch (Exception unused) {
            GriverLogger.e("GriverPrepareInterceptor", "parse app info update config failed, config: ".concat(String.valueOf(config)));
            return 5;
        }
    }

    private long a(String str, long j) {
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_APP_INFO_UPDATE_CONFIG, GriverConfigConstants.DEFAULT_APP_INFO_UPDATE);
        try {
            JSONObject parseObject = JSON.parseObject(config);
            return parseObject.containsKey(str) ? parseObject.getLong(str).longValue() : j;
        } catch (Exception unused) {
            GriverLogger.e("GriverPrepareInterceptor", "parse app info update config failed, config: ".concat(String.valueOf(config)));
            return j;
        }
    }

    private boolean a(String str) {
        Map map;
        PrepareContext prepareContext = this.f10240a;
        if (prepareContext != null && !TextUtils.isEmpty(prepareContext.getAppVersion())) {
            String config = GriverInnerConfig.getConfig(GriverConfigConstants.KEY_APP_INFO_UPDATE_CONFIG_OVERRIDING, "");
            try {
                if (!TextUtils.isEmpty(config) && (map = (Map) JSONObject.parseObject(config, new TypeReference<Map<String, String>>() {
                }, new Feature[0])) != null) {
                    if (map.size() != 0) {
                        if (!map.containsKey(str)) {
                            return false;
                        }
                        String str2 = (String) map.get(str);
                        if (!TextUtils.isEmpty(str2) && RVResourceUtils.compareVersion(this.f10240a.getAppVersion(), str2) < 0) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Exception unused) {
                GriverLogger.e("GriverPrepareInterceptor", "parse app info update config failed, config: ".concat(String.valueOf(config)));
            }
        }
        return false;
    }

    @Nullable
    public EntryInfo getEntryInfo(AppModel appModel) {
        AppInfoModel appInfoModel;
        AppModel queryAppInfo;
        String str;
        String str2;
        EntryInfo entryInfo = new EntryInfo();
        if (appModel == null || (appInfoModel = appModel.getAppInfoModel()) == null || (queryAppInfo = GriverAppCenter.queryAppInfo(appModel.getAppId(), appModel.getAppVersion())) == null) {
            return entryInfo;
        }
        entryInfo.iconUrl = appInfoModel.getLogo();
        entryInfo.title = appInfoModel.getName();
        entryInfo.desc = appInfoModel.getDesc();
        entryInfo.slogan = appInfoModel.getSlogan();
        JSONObject languages = AppInfoUtils.getLanguages(queryAppInfo);
        if (languages == null) {
            return entryInfo;
        }
        String appLanguage = GriverEnv.getAppLanguage();
        if (TextUtils.isEmpty(appLanguage) || appLanguage.split("-").length != 2) {
            str = Locale.getDefault().getLanguage();
            str2 = Locale.getDefault().getCountry();
        } else {
            String str3 = appLanguage.split("-")[0];
            str2 = appLanguage.split("-")[1];
            str = str3;
        }
        if (TextUtils.isEmpty(str)) {
            return entryInfo;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        String obj2 = sb2.toString();
        String str4 = obj;
        String str5 = obj2;
        String str6 = str;
        JSONObject jSONObject = languages;
        String a2 = a(str4, str5, str6, jSONObject, "name");
        String a3 = a(str4, str5, str6, jSONObject, "iconUrl");
        String a4 = a(str4, str5, str6, jSONObject, "description");
        if (!TextUtils.isEmpty(a2)) {
            entryInfo.title = a2;
        }
        if (!TextUtils.isEmpty(a3)) {
            entryInfo.iconUrl = a3;
        }
        if (!TextUtils.isEmpty(a4)) {
            entryInfo.desc = a4;
        }
        return entryInfo;
    }

    private String a(String str, String str2, String str3, JSONObject jSONObject, String str4) {
        if (jSONObject.containsKey(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2.containsKey(str4)) {
                return jSONObject2.getString(str4);
            }
        }
        if (jSONObject.containsKey(str2)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(str2);
            if (jSONObject3.containsKey(str4)) {
                return jSONObject3.getString(str4);
            }
        }
        if (!jSONObject.containsKey(str3)) {
            return null;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject(str3);
        if (jSONObject4.containsKey(str4)) {
            return jSONObject4.getString(str4);
        }
        return null;
    }
}
