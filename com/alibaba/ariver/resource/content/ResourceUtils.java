package com.alibaba.ariver.resource.content;

import android.os.Bundle;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.DownloadInstallCallback;
import com.alibaba.ariver.resource.api.PackageInstallCallback;
import com.alibaba.ariver.resource.api.appinfo.AppUpdaterFactory;
import com.alibaba.ariver.resource.api.appinfo.IAppUpdater;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppCallback;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppException;
import com.alibaba.ariver.resource.api.appinfo.UpdateAppParam;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.UpdateMode;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;

public class ResourceUtils {
    public static final String TAG = "AriverRes:ResourceUtils";

    public static EntryInfo getEntryInfo(AppModel appModel) {
        if (appModel == null || appModel.getAppInfoModel() == null) {
            return null;
        }
        EntryInfo entryInfo = new EntryInfo();
        entryInfo.title = appModel.getAppInfoModel().getName();
        entryInfo.iconUrl = appModel.getAppInfoModel().getLogo();
        entryInfo.slogan = appModel.getAppInfoModel().getDesc();
        entryInfo.isOffline = false;
        return entryInfo;
    }

    public static String getPkgStatus(ResourcePackage resourcePackage) {
        if (resourcePackage == null) {
            return "";
        }
        String appId = resourcePackage.appId();
        String str = resourcePackage.count() > 0 ? "Y" : "N";
        StringBuilder sb = new StringBuilder();
        sb.append(appId);
        sb.append("_");
        sb.append(str);
        sb.append("_");
        sb.append(resourcePackage.version());
        return sb.toString();
    }

    public static void prepare(final String str, String str2, final PackageInstallCallback packageInstallCallback) {
        AppModel appModel = ((RVAppInfoManager) RVProxy.get(RVAppInfoManager.class)).getAppModel(AppInfoQuery.make(str).version(str2));
        if (appModel == null || "*".equals(str2)) {
            UpdateAppParam updateAppParam = new UpdateAppParam(str, "*");
            updateAppParam.setForce(true);
            updateAppParam.setUpdateMode(UpdateMode.SYNC_FORCE);
            IAppUpdater createUpdater = AppUpdaterFactory.createUpdater(str, (Bundle) null);
            if (createUpdater == null) {
                StringBuilder sb = new StringBuilder("cannot find app updater for ");
                sb.append(str);
                sb.append("!!!");
                RVLogger.e(TAG, sb.toString());
                if (packageInstallCallback != null) {
                    packageInstallCallback.onResult(false, (String) null);
                    return;
                }
                return;
            }
            createUpdater.updateApp(updateAppParam, new UpdateAppCallback() {
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onSuccess(java.util.List<com.alibaba.ariver.resource.api.models.AppModel> r4) {
                    /*
                        r3 = this;
                        if (r4 == 0) goto L_0x001f
                        java.util.Iterator r4 = r4.iterator()
                    L_0x0006:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L_0x001f
                        java.lang.Object r0 = r4.next()
                        com.alibaba.ariver.resource.api.models.AppModel r0 = (com.alibaba.ariver.resource.api.models.AppModel) r0
                        java.lang.String r1 = r2
                        java.lang.String r2 = r0.getAppId()
                        boolean r1 = android.text.TextUtils.equals(r1, r2)
                        if (r1 == 0) goto L_0x0006
                        goto L_0x0020
                    L_0x001f:
                        r0 = 0
                    L_0x0020:
                        if (r0 != 0) goto L_0x002a
                        com.alibaba.ariver.resource.api.PackageInstallCallback r4 = r4
                        r1 = 0
                        java.lang.String r2 = "update no appInfo!"
                        r4.onResult(r1, r2)
                    L_0x002a:
                        com.alibaba.ariver.resource.api.PackageInstallCallback r4 = r4
                        com.alibaba.ariver.resource.content.ResourceUtils.downloadAndInstallApp(r4, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.content.ResourceUtils.AnonymousClass1.onSuccess(java.util.List):void");
                }

                public final void onError(UpdateAppException updateAppException) {
                    packageInstallCallback.onResult(false, updateAppException.getMessage());
                }
            });
            return;
        }
        downloadAndInstallApp(packageInstallCallback, appModel);
    }

    static void downloadAndInstallApp(final PackageInstallCallback packageInstallCallback, final AppModel appModel) {
        final RVResourceManager rVResourceManager = (RVResourceManager) RVProxy.get(RVResourceManager.class);
        if (!rVResourceManager.isDownloaded(appModel)) {
            rVResourceManager.downloadApp(appModel, true, new DownloadInstallCallback(appModel, true, true, packageInstallCallback));
        } else {
            ExecutorUtils.execute(ExecutorType.NORMAL, new Runnable() {
                public final void run() {
                    rVResourceManager.installApp(appModel, packageInstallCallback);
                }
            });
        }
    }
}
