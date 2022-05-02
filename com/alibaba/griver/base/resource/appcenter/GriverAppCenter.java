package com.alibaba.griver.base.resource.appcenter;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.base.resource.appcenter.storage.GriverAppInfoStorage;
import java.util.List;

public class GriverAppCenter {
    public static void saveAppInfo(AppModel appModel) {
        GriverAppInfoStorage.saveAppInfo(appModel);
    }

    public static void saveAppInfos(List<AppModel> list) {
        GriverAppInfoStorage.saveAppInfos(list);
    }

    public static List<AppModel> queryAppInfo(String str) {
        return GriverAppInfoStorage.queryAppInfo(str);
    }

    public static AppModel queryHighestAppInfo(String str) {
        return GriverAppInfoStorage.queryHighestAppInfo(str);
    }

    public static AppModel queryAppInfo(String str, String str2) {
        return GriverAppInfoStorage.queryAppInfo(str, str2);
    }

    public static long queryLastRefreshTimestamp(String str) {
        return GriverAppInfoStorage.queryLastRefreshTimestamp(str);
    }

    public static void refreshUpdateTime(String str, long j) {
        GriverAppInfoStorage.refreshUpdateTime(str, j);
    }

    public static List<AppModel> queryAppInfos() {
        return GriverAppInfoStorage.queryAppAppInfos();
    }

    public static AppModel queryLastInstall(String str) {
        return GriverAppInfoStorage.queryLastInstall(str);
    }
}
