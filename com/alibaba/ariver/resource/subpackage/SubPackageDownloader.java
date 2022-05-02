package com.alibaba.ariver.resource.subpackage;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.io.ZipUtils;
import com.alibaba.ariver.kernel.common.network.RVTransportService;
import com.alibaba.ariver.kernel.common.network.download.RVDownloadCallback;
import com.alibaba.ariver.kernel.common.network.download.RVDownloadRequest;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import java.io.File;

public class SubPackageDownloader {

    /* renamed from: a  reason: collision with root package name */
    private RVTransportService f9043a = ((RVTransportService) RVProxy.get(RVTransportService.class));
    private AppModel b;
    private String c;
    /* access modifiers changed from: private */
    public App d;
    /* access modifiers changed from: private */
    public Callback e;

    public interface Callback {
        void onFail(String str);

        void onSuccess(String str);
    }

    public SubPackageDownloader(App app, AppModel appModel, String str, Callback callback) {
        this.d = app;
        this.b = appModel;
        this.e = callback;
        this.c = str;
    }

    public void a() {
        String string = JSONUtils.getString(this.b.getAppInfoModel().getSubPackages(), this.c);
        if (!TextUtils.isEmpty(string)) {
            if (f()) {
                StringBuilder sb = new StringBuilder("prepareSubpackage Package has been downloaded and installed, mAppModel: ");
                sb.append(this.b);
                sb.append(" url:");
                sb.append(string);
                RVLogger.d("AriverRes:SubPackageDownloader", sb.toString());
                this.e.onSuccess(d());
            } else if (f(string)) {
                StringBuilder sb2 = new StringBuilder("prepareSubpackage Package downloaded not installed, to install, mAppModel: ");
                sb2.append(this.b);
                sb2.append(" url:");
                sb2.append(string);
                RVLogger.d("AriverRes:SubPackageDownloader", sb2.toString());
                if (b()) {
                    this.e.onSuccess(d());
                    return;
                }
                this.e.onFail("install failed!");
                RVLogger.e("AriverRes:SubPackageDownloader", "prepareSubpackage install failed");
            } else {
                StringBuilder sb3 = new StringBuilder("prepareSubpackage Package not downloaded not installed, to download and install, mAppModel: ");
                sb3.append(this.b);
                sb3.append(" url:");
                sb3.append(string);
                RVLogger.d("AriverRes:SubPackageDownloader", sb3.toString());
                a(string);
            }
        }
    }

    private void a(String str) {
        RVLogger.d("AriverRes:SubPackageDownloader", "addDownload subpackage url:".concat(String.valueOf(str)));
        if (str.startsWith("http") && this.f9043a != null) {
            RVDownloadRequest rVDownloadRequest = new RVDownloadRequest();
            rVDownloadRequest.setDownloadUrl(str);
            rVDownloadRequest.setDownloadDir(c());
            rVDownloadRequest.setDownloadFileName(d(str));
            rVDownloadRequest.setIsUrgentResource(true);
            this.f9043a.addDownload(rVDownloadRequest, new RVDownloadCallback() {
                public void onPrepare(String str) {
                }

                public void onProgress(String str, int i) {
                }

                public void onCancel(String str) {
                    ((EventTracker) RVProxy.get(EventTracker.class)).error(SubPackageDownloader.this.d, TrackId.Error_Resource_SubPackageFail, "download canceled!");
                    SubPackageDownloader.this.e.onFail("download canceled!");
                }

                public void onFinish(@Nullable String str) {
                    if (SubPackageDownloader.this.b()) {
                        SubPackageDownloader.this.e.onSuccess(SubPackageDownloader.this.d());
                    } else {
                        SubPackageDownloader.this.e.onFail("install failed!");
                    }
                }

                public void onFailed(String str, int i, String str2) {
                    ((EventTracker) RVProxy.get(EventTracker.class)).error(SubPackageDownloader.this.d, TrackId.Error_Resource_SubPackageFail, "download failed!".concat(String.valueOf(str2)));
                    SubPackageDownloader.this.e.onFail("download failed!".concat(String.valueOf(str2)));
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public boolean b() {
        String string = JSONUtils.getString(this.b.getAppInfoModel().getSubPackages(), this.c);
        if (!f(string)) {
            return f();
        }
        boolean b2 = b(e(string));
        if (b2) {
            return b2;
        }
        ((EventTracker) RVProxy.get(EventTracker.class)).error(this.d, TrackId.Error_Resource_SubPackageFail, "install failed!");
        return b2;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            RVLogger.e("AriverRes:SubPackageDownloader", "installSubPackage failed, download file path is null");
            return false;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return false;
            }
            if (f()) {
                return true;
            }
            c(d());
            if (ZipUtils.unZip(str, d())) {
                if (f()) {
                    RVLogger.d("AriverRes:SubPackageDownloader", "installSubPackage success!");
                    FileUtils.delete(file);
                    return true;
                }
            }
            RVLogger.e("AriverRes:SubPackageDownloader", "subpackage unzip fail");
            FileUtils.delete(file);
            RVLogger.e("AriverRes:SubPackageDownloader", "installSubPackage unZipResult || isInstalled() return false");
            return false;
        } catch (Exception e2) {
            RVLogger.e("AriverRes:SubPackageDownloader", "subpackage parse error: ", e2);
            return false;
        }
    }

    private void c(String str) {
        if (FileUtils.exists(str)) {
            RVLogger.d("AriverRes:SubPackageDownloader", "deleteOldPkgByFullInstall ".concat(String.valueOf(str)));
            FileUtils.delete(str);
        }
    }

    private String c() {
        String path = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext().getCacheDir().getPath();
        return !TextUtils.isEmpty(path) ? path : "";
    }

    private String d(String str) {
        StringBuilder sb = new StringBuilder(RVConstants.SUB_PACKAGE_DIR_PREFIX);
        sb.append(this.b.getAppId());
        sb.append("-");
        sb.append(FileUtils.getMD5(str));
        return sb.toString();
    }

    private String e(String str) {
        String c2 = c();
        if (TextUtils.isEmpty(c2) || TextUtils.isEmpty(str)) {
            return "";
        }
        String combinePath = FileUtils.combinePath(c2, d(str));
        RVLogger.d("AriverRes:SubPackageDownloader", "downloadedFilePath:".concat(String.valueOf(combinePath)));
        return combinePath;
    }

    /* access modifiers changed from: private */
    public String d() {
        File extDirectory = RVResourceUtils.getExtDirectory(this.b, true);
        if (extDirectory == null) {
            return "";
        }
        return FileUtils.combinePath(extDirectory.getAbsolutePath(), e());
    }

    private String e() {
        return !TextUtils.isEmpty(this.c) ? RVConstants.SUB_PACKAGE_DIR_PREFIX.concat(String.valueOf(this.c.replace('/', '_'))) : "";
    }

    private boolean f(String str) {
        String e2 = e(str);
        boolean exists = FileUtils.exists(e2);
        StringBuilder sb = new StringBuilder("isPkgAvailable: path:");
        sb.append(e2);
        sb.append(" isExist:");
        sb.append(exists);
        RVLogger.d("AriverRes:SubPackageDownloader", sb.toString());
        return exists;
    }

    private boolean f() {
        String d2 = d();
        if (TextUtils.isEmpty(d2)) {
            RVLogger.e("AriverRes:SubPackageDownloader", "getInstalledPath() is empty");
            return false;
        }
        try {
            File file = new File(d2);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                int length = listFiles.length;
                RVLogger.d("AriverRes:SubPackageDownloader", "isInstalled length:".concat(String.valueOf(length)));
                if (length > 0) {
                    boolean z = false;
                    for (File name : listFiles) {
                        String name2 = name.getName();
                        RVLogger.d("AriverRes:SubPackageDownloader", "installed dir file ".concat(String.valueOf(name2)));
                        if (name2.contains("tar")) {
                            z = true;
                        }
                    }
                    if (length < 4 && !z) {
                        RVLogger.e("AriverRes:SubPackageDownloader", "installSubPackage files broken, delete broken files");
                        c(d2);
                        return false;
                    } else if (z) {
                        return true;
                    } else {
                        RVLogger.e("AriverRes:SubPackageDownloader", "installSubPackage files broken, delete broken files");
                        c(d2);
                        return false;
                    }
                }
            }
        } catch (Exception e2) {
            RVLogger.e("AriverRes:SubPackageDownloader", (Throwable) e2);
        }
        return false;
    }
}
