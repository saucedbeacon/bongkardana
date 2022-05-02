package com.alibaba.ariver.resource.api.proxy;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.resource.api.PackageDownloadCallback;
import com.alibaba.ariver.resource.api.PackageInstallCallback;
import com.alibaba.ariver.resource.api.models.AppModel;

public interface RVResourceManager extends Proxiable {
    void deleteDownloadPackage(AppModel appModel);

    void deleteInstallStatus(String str);

    void downloadApp(AppModel appModel, boolean z, @Nullable PackageDownloadCallback packageDownloadCallback);

    String getInstallPath(AppModel appModel);

    @Nullable
    String getInstalledAppVersion(String str);

    void installApp(AppModel appModel, @Nullable PackageInstallCallback packageInstallCallback);

    boolean isAvailable(AppModel appModel);

    boolean isDownloaded(AppModel appModel);
}
