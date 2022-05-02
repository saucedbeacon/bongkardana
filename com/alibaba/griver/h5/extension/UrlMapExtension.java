package com.alibaba.griver.h5.extension;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.h5.appinfo.GriverH5AppInfo;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.H5FileUtil;
import com.alibaba.griver.base.common.utils.KitUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.base.resource.point.BeforeGetMainPackageResourcePoint;
import java.io.File;
import java.lang.ref.WeakReference;

public class UrlMapExtension implements NodeAware<App>, BeforeGetMainPackageResourcePoint {
    WeakReference<App> appWeakReference;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void setNode(WeakReference<App> weakReference) {
        this.appWeakReference = weakReference;
    }

    public Class<App> getNodeType() {
        return App.class;
    }

    public ResourceQuery beforeQuery(ResourceQuery resourceQuery) {
        WeakReference<App> weakReference = this.appWeakReference;
        if (!(weakReference == null || weakReference.get() == null)) {
            App app = this.appWeakReference.get();
            resourceQuery.pureUrl = mapUrl(resourceQuery.pureUrl, app.getAppId(), app.getAppVersion());
        }
        return resourceQuery;
    }

    public String mapUrl(String str, String str2, String str3) {
        AppModel appModel;
        GriverH5AppInfo h5AppFromAppInfo;
        GriverLogger.d("UrlMapExtension", "load response mapUrl url = ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String extension = H5FileUtil.getExtension(KitUtils.getFileName(str));
        if (!TextUtils.isEmpty(extension) && !"html".equalsIgnoreCase(extension)) {
            return str;
        }
        if (TextUtils.isEmpty(str3)) {
            appModel = GriverAppCenter.queryHighestAppInfo(str2);
        } else {
            appModel = GriverAppCenter.queryAppInfo(str2, str3);
        }
        if (appModel == null || (h5AppFromAppInfo = AppInfoUtils.getH5AppFromAppInfo(appModel)) == null) {
            return str;
        }
        String str4 = h5AppFromAppInfo.remoteURLPrefix;
        GriverLogger.d("UrlMapExtension", "load response remoteURLPrefix = ".concat(String.valueOf(str4)));
        if (TextUtils.isEmpty(str4) || !str.startsWith(str4)) {
            return str;
        }
        String str5 = h5AppFromAppInfo.type;
        GriverLogger.d("UrlMapExtension", "load response type = ".concat(String.valueOf(str5)));
        if (!GriverH5AppInfo.AppType.SPA.equalsIgnoreCase(str5)) {
            return str;
        }
        String str6 = h5AppFromAppInfo.index;
        GriverLogger.d("UrlMapExtension", "load response index = ".concat(String.valueOf(str6)));
        if (TextUtils.isEmpty(str6)) {
            return str;
        }
        if (str6.startsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(appModel.getAppInfoModel().getVhost());
            sb.append(str6);
            return sb.toString();
        } else if (str6.startsWith("http")) {
            return str6;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(appModel.getAppInfoModel().getVhost());
            sb2.append(File.separator);
            sb2.append(str6);
            return sb2.toString();
        }
    }
}
