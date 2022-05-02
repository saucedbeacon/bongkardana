package com.alibaba.griver.base.resource.predownload;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.network.DownloadCallback;
import com.alibaba.griver.api.common.network.DownloadRequest;
import com.alibaba.griver.base.common.executor.AbstractPriorityRunnable;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.network.GriverTransport;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.GriverConfigUtils;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public class AppPreDownloadPackageManager {
    public static final String TAG = "AppPreDownloadPackageManager";

    private Executor a() {
        return GriverExecutors.getSingleOrderThreadExecutorByName(TAG);
    }

    public void downloadPackageWithURLString(final AppModel appModel) {
        if (appModel != null) {
            a().execute(new AbstractPriorityRunnable(1) {
                public void runTask() {
                    if (AppPreDownloadManager.getInstance().isPreDownloadFileAvailable(appModel)) {
                        StringBuilder sb = new StringBuilder("file is not expired file name is ");
                        sb.append(AppInfoUtils.getPreDownloadFile(appModel).getName());
                        GriverLogger.d(AppPreDownloadPackageManager.TAG, sb.toString());
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("file is expired!!! file will be delete,new file name is ");
                    sb2.append(AppInfoUtils.getPreDownloadFile(appModel).getName());
                    GriverLogger.d(AppPreDownloadPackageManager.TAG, sb2.toString());
                    AppInfoUtils.deletePreDownloadFileByAppId(appModel.getAppId());
                    int transferStringConfigToInt = GriverConfigUtils.transferStringConfigToInt(GriverConfigConstants.KEY_DOWNLOAD_APP_RETRY_TIME, 2);
                    DownloadRequest downloadRequest = new DownloadRequest();
                    downloadRequest.downloadUrl = appModel.getAppInfoModel().getPackageUrl();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(AppInfoUtils.getPreDownloadFile(appModel).getAbsolutePath());
                    sb3.append("_temp");
                    final File file = new File(sb3.toString());
                    StringBuilder sb4 = new StringBuilder("temp download file is : ");
                    sb4.append(file.getAbsolutePath());
                    GriverLogger.d(AppPreDownloadPackageManager.TAG, sb4.toString());
                    downloadRequest.downloadFilePath = file.getAbsolutePath();
                    downloadRequest.retryTime = transferStringConfigToInt;
                    downloadRequest.appId = appModel.getAppId();
                    downloadRequest.version = AppInfoUtils.getDeveloperVersion(appModel);
                    downloadRequest.deployVersion = appModel.getAppVersion();
                    downloadRequest.urgent = false;
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    GriverTransport.download(downloadRequest, new DownloadCallback() {
                        public void onPrepare(String str) {
                        }

                        public void onProgress(String str, int i) {
                        }

                        public void onCancel(String str) {
                            File file = file;
                            if (file != null && file.exists()) {
                                file.delete();
                            }
                            countDownLatch.countDown();
                            GriverLogger.d(AppPreDownloadPackageManager.TAG, "download onCancel, release countdown, path: ".concat(String.valueOf(str)));
                        }

                        public void onFinish(@Nullable String str) {
                            File file = file;
                            if (file != null && file.exists()) {
                                file.renameTo(new File(AppInfoUtils.getPreDownloadFile(appModel).getAbsolutePath()));
                            }
                            AppPreDownloadManager.getInstance().uploadMonitorEvent(appModel.getAppId(), appModel.getAppVersion(), 1, 1);
                            countDownLatch.countDown();
                            GriverLogger.d(AppPreDownloadPackageManager.TAG, "download onFinish, release countdown, path: ".concat(String.valueOf(str)));
                        }

                        public void onFailed(String str, int i, String str2) {
                            File file = file;
                            if (file != null && file.exists()) {
                                file.delete();
                            }
                            AppPreDownloadManager.getInstance().uploadMonitorEvent(appModel.getAppId(), appModel.getAppVersion(), 1, -2);
                            countDownLatch.countDown();
                            GriverLogger.d(AppPreDownloadPackageManager.TAG, "download onFailed , release countdown, path: ".concat(String.valueOf(str)));
                        }
                    });
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException unused) {
                        GriverLogger.e(AppPreDownloadPackageManager.TAG, "download countdown latch release");
                    }
                }
            });
        }
    }

    public String packagePathForURLString(AppModel appModel) {
        if (appModel == null || appModel.getAppInfoModel() == null) {
            GriverLogger.w(TAG, "packagePathForURLString query app isPreDownload but app model is null, return false");
            return null;
        }
        File preDownloadFile = AppInfoUtils.getPreDownloadFile(appModel);
        if (FileUtils.exists(preDownloadFile)) {
            return preDownloadFile.getAbsolutePath();
        }
        return null;
    }

    public void removePackageForURLString(AppModel appModel) {
        if (appModel == null || appModel.getAppInfoModel() == null) {
            GriverLogger.w(TAG, "removePackageForURLString delete pre download file but app model is null, do nothing");
            return;
        }
        File preDownloadFile = AppInfoUtils.getPreDownloadFile(appModel);
        if (FileUtils.exists(preDownloadFile)) {
            StringBuilder sb = new StringBuilder("delete pre download file for appId: ");
            sb.append(appModel.getAppId());
            sb.append(", version: ");
            sb.append(appModel.getAppVersion());
            GriverLogger.d(TAG, sb.toString());
            FileUtils.delete(preDownloadFile);
        }
    }

    public boolean packageExistsForForURLString(AppModel appModel) {
        if (appModel == null || appModel.getAppInfoModel() == null) {
            GriverLogger.w(TAG, "packageExistsForForURLString query app isPreDownload but app model is null, return false");
            return false;
        }
        File preDownloadFile = AppInfoUtils.getPreDownloadFile(appModel);
        boolean exists = FileUtils.exists(preDownloadFile);
        StringBuilder sb = new StringBuilder("isPreDownloaded appId: ");
        sb.append(appModel.getAppId());
        sb.append(", version: ");
        sb.append(appModel.getAppVersion());
        sb.append(", downloaded: ");
        sb.append(exists);
        sb.append(", path: ");
        sb.append(preDownloadFile.getAbsolutePath());
        GriverLogger.d(TAG, sb.toString());
        return exists;
    }
}
