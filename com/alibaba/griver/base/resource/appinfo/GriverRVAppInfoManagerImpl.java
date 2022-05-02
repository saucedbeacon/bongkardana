package com.alibaba.griver.base.resource.appinfo;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;

public class GriverRVAppInfoManagerImpl implements RVAppInfoManager {
    @Nullable
    public String findUrlMappedAppId(String str) {
        return null;
    }

    public AppModel getAppModel(@NonNull AppInfoQuery appInfoQuery) {
        String appId = appInfoQuery.getAppId();
        String version = appInfoQuery.getVersion();
        if (TextUtils.isEmpty(version) || TextUtils.equals(version, "*")) {
            AppModel queryHighestAppInfo = GriverAppCenter.queryHighestAppInfo(appId);
            if (queryHighestAppInfo != null) {
                StringBuilder sb = new StringBuilder("getAppModel appid = ");
                sb.append(queryHighestAppInfo.getAppId());
                sb.append(" appversion = ");
                sb.append(queryHighestAppInfo.getAppVersion());
                GriverLogger.d("UsePackage", sb.toString());
            } else {
                GriverLogger.d("UsePackage", "getAppModel appinfo is null");
            }
            return queryHighestAppInfo;
        }
        AppModel queryAppInfo = GriverAppCenter.queryAppInfo(appId, version);
        if (queryAppInfo != null) {
            StringBuilder sb2 = new StringBuilder("getAppModel has version appid = ");
            sb2.append(queryAppInfo.getAppId());
            sb2.append(" appversion = ");
            sb2.append(queryAppInfo.getAppVersion());
            GriverLogger.d("UsePackage", sb2.toString());
        } else {
            GriverLogger.d("UsePackage", "getAppModel has version appinfo is null");
        }
        return queryAppInfo;
    }

    public AppInfoModel getAppInfoModel(@NonNull AppInfoQuery appInfoQuery) {
        AppModel appModel = getAppModel(appInfoQuery);
        if (appModel != null) {
            return appModel.getAppInfoModel();
        }
        return null;
    }

    public long getLastUpdateTime(String str) {
        return GriverAppCenter.queryLastRefreshTimestamp(str);
    }

    public void refreshUpdateTime(String str, long j) {
        GriverAppCenter.refreshUpdateTime(str, j);
    }
}
