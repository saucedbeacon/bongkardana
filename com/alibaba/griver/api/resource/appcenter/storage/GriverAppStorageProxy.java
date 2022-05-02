package com.alibaba.griver.api.resource.appcenter.storage;

import java.util.List;

public interface GriverAppStorageProxy {
    boolean deleteAppInfo(AppInfoDao appInfoDao);

    boolean deleteAppInfoById(String str);

    boolean insertOrUpdateInfo(AppInfoDao appInfoDao);

    boolean insertOrUpdateInfo(List<AppInfoDao> list);

    List<AppInfoDao> selectAllAppInfo(String str);

    List<AppInfoDao> selectAllAppInfos();

    AppInfoDao selectAppInfo(String str, String str2);

    AppInfoDao selectAppInfoWithHighestVersion(String str);
}
