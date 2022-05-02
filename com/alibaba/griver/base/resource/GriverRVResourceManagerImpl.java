package com.alibaba.griver.base.resource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.io.ProcessLock;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.resource.api.PackageDownloadCallback;
import com.alibaba.ariver.resource.api.PackageInstallCallback;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.common.network.DownloadCallback;
import com.alibaba.griver.api.common.network.DownloadRequest;
import com.alibaba.griver.api.resource.ResourceConstants;
import com.alibaba.griver.api.ui.GriverAppExtension;
import com.alibaba.griver.base.common.executor.AbstractPriorityRunnable;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.network.GriverTransport;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.GriverConfigUtils;
import com.alibaba.griver.base.common.utils.ZipUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.base.resource.predownload.AppPreDownloadManager;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitor;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager;
import com.alibaba.griver.base.stagemonitor.impl.GriverFullLinkStageMonitor;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GriverRVResourceManagerImpl implements RVResourceManager {
    public boolean isAvailable(AppModel appModel) {
        if (appModel == null || appModel.getAppInfoModel() == null) {
            GriverLogger.w("RVResourceManager", "query app install but app model is null, return false");
            return false;
        }
        boolean installPathValid = AppInfoUtils.installPathValid(getInstallPath(appModel));
        StringBuilder sb = new StringBuilder("isAvailable appid = ");
        sb.append(appModel.getAppId());
        sb.append(" appversion = ");
        sb.append(appModel.getAppVersion());
        sb.append(" installed = ");
        sb.append(installPathValid);
        GriverLogger.d("UsePackage", sb.toString());
        StringBuilder sb2 = new StringBuilder("isInstalled appId: ");
        sb2.append(appModel.getAppId());
        sb2.append(", version: ");
        sb2.append(appModel.getAppVersion());
        sb2.append(", installed: ");
        sb2.append(installPathValid);
        sb2.append(", path: ");
        sb2.append(getInstallPath(appModel));
        GriverLogger.d("RVResourceManager", sb2.toString());
        return installPathValid;
    }

    public boolean isDownloaded(AppModel appModel) {
        File file;
        if (appModel == null || appModel.getAppInfoModel() == null) {
            GriverLogger.w("RVResourceManager", "query app isDownload but app model is null, return false");
            return false;
        }
        if (!AppPreDownloadManager.getInstance().appConfigIsEnable() || !AppPreDownloadManager.getInstance().isAppIdInPreDownloadConfig(appModel.getAppId()) || !AppPreDownloadManager.getInstance().isPreDownloadFileAvailable(appModel)) {
            StringBuilder sb = new StringBuilder("isDownloaded use before appid = ");
            sb.append(appModel.getAppId());
            sb.append(" appversion = ");
            sb.append(appModel.getAppVersion());
            GriverLogger.d("UsePackage", sb.toString());
            file = AppInfoUtils.getDownloadFile(appModel);
        } else {
            file = AppInfoUtils.getPreDownloadFile(appModel);
            StringBuilder sb2 = new StringBuilder("isDownloaded use pre appid = ");
            sb2.append(appModel.getAppId());
            sb2.append(" appversion = ");
            sb2.append(appModel.getAppVersion());
            GriverLogger.d("UsePackage", sb2.toString());
        }
        boolean exists = FileUtils.exists(file);
        StringBuilder sb3 = new StringBuilder("isDownloaded appId: ");
        sb3.append(appModel.getAppId());
        sb3.append(", version: ");
        sb3.append(appModel.getAppVersion());
        sb3.append(", downloaded: ");
        sb3.append(exists);
        sb3.append(", path: ");
        sb3.append(file.getAbsolutePath());
        GriverLogger.d("RVResourceManager", sb3.toString());
        return exists;
    }

    public void downloadApp(AppModel appModel, boolean z, @Nullable PackageDownloadCallback packageDownloadCallback) {
        if (appModel == null || appModel.getAppInfoModel() == null) {
            GriverLogger.w("RVResourceManager", "download app but app model is null, callback fail");
            if (packageDownloadCallback != null) {
                packageDownloadCallback.onFailed((String) null, 0, "app model is null");
                return;
            }
            return;
        }
        final AppModel appModel2 = appModel;
        final PackageDownloadCallback packageDownloadCallback2 = packageDownloadCallback;
        final boolean z2 = z;
        GriverExecutors.getSingleOrderThreadExecutorByName(AppInfoUtils.getInstallThreadName(appModel.getAppId())).execute(new AbstractPriorityRunnable(5) {
            public void runTask() {
                if (GriverRVResourceManagerImpl.this.isAvailable(appModel2)) {
                    StringBuilder sb = new StringBuilder("already installed, callback finish, appId: ");
                    sb.append(appModel2.getAppId());
                    GriverLogger.d("RVResourceManager", sb.toString());
                    PackageDownloadCallback packageDownloadCallback = packageDownloadCallback2;
                    if (packageDownloadCallback != null) {
                        packageDownloadCallback.onFinish((String) null);
                    }
                } else if (GriverRVResourceManagerImpl.this.isDownloaded(appModel2)) {
                    StringBuilder sb2 = new StringBuilder("download app: ");
                    sb2.append(appModel2.getAppId());
                    sb2.append(", but is downloaded, just callback finish");
                    GriverLogger.d("RVResourceManager", sb2.toString());
                    if (packageDownloadCallback2 == null) {
                        return;
                    }
                    if (!AppPreDownloadManager.getInstance().isPreDownloadFileAvailable(appModel2) || !AppPreDownloadManager.getInstance().isAppIdInPreDownloadConfig(appModel2.getAppId())) {
                        StringBuilder sb3 = new StringBuilder("download app use before appid = ");
                        sb3.append(appModel2.getAppId());
                        sb3.append(" appversion = ");
                        sb3.append(appModel2.getAppVersion());
                        GriverLogger.d("UsePackage", sb3.toString());
                        StringBuilder sb4 = new StringBuilder("get download file from download dir file path is = ");
                        sb4.append(AppInfoUtils.getDownloadFile(appModel2).getAbsolutePath());
                        GriverLogger.d("RVResourceManager", sb4.toString());
                        packageDownloadCallback2.onFinish(AppInfoUtils.getDownloadFile(appModel2).getAbsolutePath());
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder("download app use pre appid = ");
                    sb5.append(appModel2.getAppId());
                    sb5.append(" appversion = ");
                    sb5.append(appModel2.getAppVersion());
                    GriverLogger.d("UsePackage", sb5.toString());
                    StringBuilder sb6 = new StringBuilder("get download file from pre!!! download dir file path is = ");
                    sb6.append(AppInfoUtils.getPreDownloadFile(appModel2).getAbsolutePath());
                    GriverLogger.d("RVResourceManager", sb6.toString());
                    packageDownloadCallback2.onFinish(AppInfoUtils.getPreDownloadFile(appModel2).getAbsolutePath());
                } else {
                    StringBuilder sb7 = new StringBuilder("start download app: ");
                    sb7.append(appModel2.getAppId());
                    GriverLogger.d("RVResourceManager", sb7.toString());
                    GriverRVResourceManagerImpl.this.a(appModel2, z2, packageDownloadCallback2);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(final AppModel appModel, boolean z, final PackageDownloadCallback packageDownloadCallback) {
        if (appModel != null && packageDownloadCallback != null) {
            int transferStringConfigToInt = GriverConfigUtils.transferStringConfigToInt(GriverConfigConstants.KEY_DOWNLOAD_APP_RETRY_TIME, 2);
            DownloadRequest downloadRequest = new DownloadRequest();
            downloadRequest.downloadUrl = appModel.getAppInfoModel().getPackageUrl();
            downloadRequest.downloadFilePath = AppInfoUtils.getDownloadFile(appModel).getAbsolutePath();
            downloadRequest.retryTime = transferStringConfigToInt;
            downloadRequest.appId = appModel.getAppId();
            downloadRequest.version = AppInfoUtils.getDeveloperVersion(appModel);
            downloadRequest.deployVersion = appModel.getAppVersion();
            downloadRequest.urgent = z;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            GriverTransport.download(downloadRequest, new DownloadCallback() {
                public void onPrepare(String str) {
                }

                public void onProgress(String str, int i) {
                }

                public void onCancel(String str) {
                    countDownLatch.countDown();
                }

                public void onFinish(@Nullable String str) {
                    GriverLogger.d("RVResourceManager", "download finished, release countdown, path: ".concat(String.valueOf(str)));
                    countDownLatch.countDown();
                    packageDownloadCallback.onFinish(str);
                    GriverRVResourceManagerImpl.resourceTypeMonitor(appModel.getAppId());
                }

                public void onFailed(String str, int i, String str2) {
                    countDownLatch.countDown();
                    packageDownloadCallback.onFailed(str, i, str2);
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                GriverLogger.e("RVResourceManager", "download countdown latch release");
            }
        }
    }

    public void deleteDownloadPackage(AppModel appModel) {
        if (appModel == null || appModel.getAppInfoModel() == null) {
            GriverLogger.w("RVResourceManager", "delete download file but app model is null, do nothing");
            return;
        }
        File downloadFile = AppInfoUtils.getDownloadFile(appModel);
        if (FileUtils.exists(downloadFile)) {
            StringBuilder sb = new StringBuilder("delete download file for appId: ");
            sb.append(appModel.getAppId());
            sb.append(", version: ");
            sb.append(appModel.getAppVersion());
            GriverLogger.d("RVResourceManager", sb.toString());
            FileUtils.delete(downloadFile);
        }
    }

    public void installApp(final AppModel appModel, @Nullable final PackageInstallCallback packageInstallCallback) {
        if (appModel == null || appModel.getAppInfoModel() == null) {
            if (packageInstallCallback != null) {
                packageInstallCallback.onResult(false, "app model is null");
            }
            GriverLogger.e("RVResourceManager", "app model is null, install app failed");
            return;
        }
        GriverExecutors.getSingleOrderThreadExecutorByName(AppInfoUtils.getInstallThreadName(appModel.getAppId())).execute(new AbstractPriorityRunnable(5) {
            public void runTask() {
                if (!GriverRVResourceManagerImpl.this.isAvailable(appModel)) {
                    boolean access$100 = GriverRVResourceManagerImpl.this.a(appModel);
                    if (packageInstallCallback != null) {
                        packageInstallCallback.onResult(access$100, AppInfoUtils.getInstallPath(appModel));
                    }
                } else if (packageInstallCallback != null) {
                    StringBuilder sb = new StringBuilder("app has been installed, do not install again, appId: ");
                    sb.append(appModel.getAppId());
                    sb.append(", version: ");
                    sb.append(appModel.getAppVersion());
                    GriverLogger.d("RVResourceManager", sb.toString());
                    packageInstallCallback.onResult(true, AppInfoUtils.getInstallPath(appModel));
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean a(AppModel appModel) {
        File file;
        AppModel appModel2 = appModel;
        if (appModel2 == null || appModel.getAppInfoModel() == null) {
            GriverLogger.w("RVResourceManager", "install app but app model is null");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (!AppPreDownloadManager.getInstance().appConfigIsEnable() || !AppPreDownloadManager.getInstance().isPreDownloadFileAvailable(appModel2) || !AppPreDownloadManager.getInstance().isAppIdInPreDownloadConfig(appModel.getAppId())) {
                file = AppInfoUtils.getDownloadFile(appModel);
                StringBuilder sb = new StringBuilder("griver use original download file to install ,file path is = ");
                sb.append(file.getAbsolutePath());
                GriverLogger.d("RVResourceManager", sb.toString());
            } else {
                file = AppInfoUtils.getPreDownloadFile(appModel);
                try {
                    StringBuilder sb2 = new StringBuilder("griver use pre download file to install ,file path is = ");
                    sb2.append(file.getAbsolutePath());
                    GriverLogger.d("RVResourceManager", sb2.toString());
                    HashMap hashMap = new HashMap();
                    hashMap.put("appId", appModel.getAppId());
                    GriverMonitor.event(GriverMonitorConstants.USE_PRE_DOWNLOAD_PACKAGE, "GriverAppContainer", hashMap);
                } catch (Exception e) {
                    e = e;
                }
            }
            String installPath = AppInfoUtils.getInstallPath(appModel);
            if (FileUtils.exists(file)) {
                ProcessLock processLock = AppInfoUtils.isCommonRes(appModel.getAppId()) ? new ProcessLock(file) : null;
                if (processLock != null) {
                    processLock.lock();
                    GriverLogger.d("RVResourceManager", "common resource locked!");
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                if (FileUtils.exists(installPath)) {
                    FileUtils.delete(installPath);
                }
                boolean unZip = ZipUtils.unZip(file.getAbsolutePath(), installPath);
                StringBuilder sb3 = new StringBuilder("installApp ");
                sb3.append(appModel.getAppId());
                sb3.append(" unzip (");
                sb3.append(unZip);
                sb3.append(") ");
                sb3.append(installPath);
                sb3.append(" spend ");
                sb3.append(System.currentTimeMillis() - currentTimeMillis2);
                GriverLogger.d("RVResourceManager", sb3.toString());
                if (unZip) {
                    if (AppInfoUtils.installPathExist(appModel)) {
                        FileUtils.delete(file);
                        for (String next : AppInfoUtils.getAllInstallFiles(appModel.getAppId())) {
                            if (!TextUtils.equals(next, installPath)) {
                                FileUtils.delete(next);
                            }
                        }
                        if (processLock != null) {
                            processLock.unlock();
                            GriverLogger.d("RVResourceManager", "common resource unlocked!");
                        }
                        GriverMonitor.event(GriverMonitorConstants.EVENT_UNZIP_SUCCESS, "GriverAppContainer", new MonitorMap.Builder().appId(appModel.getAppId()).version(appModel2).cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis)).needAsynAppType(true).build());
                        return true;
                    }
                }
                FileUtils.delete(installPath);
                FileUtils.delete(file);
                GriverMonitor.error(GriverMonitorConstants.ERROR_UNZIP_FAIL, "GriverAppContainer", new MonitorMap.Builder().appId(appModel.getAppId()).version(appModel2).cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis)).installPath(installPath).message(GriverMonitorConstants.MESSAGE_UNZIP_DOWNLOADED_RESULT_ERROR).needAsynAppType(true).build());
                return false;
            }
        } catch (Exception e2) {
            e = e2;
            file = null;
            StringBuilder sb4 = new StringBuilder("install app failed, appId: ");
            sb4.append(appModel.getAppId());
            sb4.append(", version: ");
            sb4.append(appModel.getAppVersion());
            GriverLogger.e("RVResourceManager", sb4.toString(), e);
            GriverMonitor.error(GriverMonitorConstants.ERROR_UNZIP_FAIL, "GriverAppContainer", new MonitorMap.Builder().appId(appModel.getAppId()).version(appModel2).cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis)).installPath(AppInfoUtils.getInstallPath(appModel)).exception(e).message(GriverMonitorConstants.MESSAGE_UNZIP_DOWNLOADED_ERROR).needAsynAppType(true).downloadPath(file != null ? file.getAbsolutePath() : null).build());
            FileUtils.delete(AppInfoUtils.getInstallPath(appModel));
            FileUtils.delete(AppInfoUtils.getDownloadFile(appModel));
            return false;
        }
        return false;
    }

    public String getInstallPath(AppModel appModel) {
        String str;
        if (appModel == null || appModel.getAppInfoModel() == null) {
            GriverLogger.w("RVResourceManager", "app model is null, return null install path");
            return null;
        }
        if (AppInfoUtils.isEmbeddedApp(appModel)) {
            AppModel appModel2 = ((RVAppInfoManager) RVProxy.get(RVAppInfoManager.class)).getAppModel(AppInfoQuery.make(ResourceConstants.TINY_WEB_EMBEDDED_APPID));
            str = appModel2 != null ? AppInfoUtils.getInstallPath(appModel2) : "";
        } else {
            str = AppInfoUtils.getInstallPath(appModel);
        }
        StringBuilder sb = new StringBuilder("get install path, appId: ");
        sb.append(appModel.getAppId());
        sb.append(", version: ");
        sb.append(appModel.getAppVersion());
        sb.append(", path: ");
        sb.append(str);
        GriverLogger.d("RVResourceManager", sb.toString());
        return str;
    }

    @Nullable
    public String getInstalledAppVersion(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1121292013, oncanceled);
            onCancelLoad.getMin(1121292013, oncanceled);
        }
        AppModel queryHighestAppInfo = GriverAppCenter.queryHighestAppInfo(str);
        if (queryHighestAppInfo != null) {
            return queryHighestAppInfo.getAppVersion();
        }
        return null;
    }

    public void deleteInstallStatus(String str) {
        List<AppModel> queryAppInfo = GriverAppCenter.queryAppInfo(str);
        if (queryAppInfo != null && queryAppInfo.size() > 0) {
            for (AppModel next : queryAppInfo) {
                StringBuilder sb = new StringBuilder("delete install files for appId: ");
                sb.append(next.getAppId());
                sb.append(", version: ");
                sb.append(next.getAppVersion());
                GriverLogger.d("RVResourceManager", sb.toString());
                FileUtils.delete(getInstallPath(next));
            }
        }
    }

    public static void resourceTypeMonitor(String str) {
        GriverStageMonitor stageMonitor;
        GriverLogger.d("RVResourceManager", "resourceTypeMonitor, appId: ".concat(String.valueOf(str)));
        App appByAppId = ((GriverAppExtension) RVProxy.get(GriverAppExtension.class)).getAppByAppId(str);
        if (appByAppId != null && (stageMonitor = GriverStageMonitorManager.getInstance().getStageMonitor(GriverFullLinkStageMonitor.getMonitorToken(appByAppId))) != null) {
            stageMonitor.addParam(GriverMonitorConstants.KEY_APP_SOURCE_TYPE, GriverMonitorConstants.MINI_PROGRAM_APP_SOURCE_TYPE_REMOTE);
        }
    }
}
