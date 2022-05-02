package com.alibaba.griver.base.resource.appcenter.storage;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.resource.appcenter.storage.AppInfoDao;
import com.alibaba.griver.api.resource.appcenter.storage.GriverAppStorageProxy;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GriverAppInfoStorage {

    /* renamed from: a  reason: collision with root package name */
    private static GriverAppStorageProxy f9169a = new GriverAppSQLiteStorage(new GriverAppInfoDBHelper(GriverEnv.getApplicationContext()));

    public static void saveAppInfo(AppModel appModel) {
        boolean z;
        if (appModel == null || TextUtils.isEmpty(appModel.getAppVersion()) || TextUtils.isEmpty(appModel.getAppId())) {
            GriverLogger.w("GriverAppInfoStorage", "app is not valid, return directly");
            return;
        }
        try {
            List<AppInfoDao> selectAllAppInfo = f9169a.selectAllAppInfo(appModel.getAppId());
            String config = GriverConfig.getConfig(GriverConfigConstants.KEY_APP_POOL_SIZE, "3");
            if (selectAllAppInfo != null && selectAllAppInfo.size() > 0) {
                int intValue = Integer.valueOf("3").intValue();
                try {
                    if (Integer.valueOf(config).intValue() > 0) {
                        intValue = Integer.valueOf(config).intValue();
                    }
                } catch (Exception e) {
                    GriverLogger.e("GriverAppInfoStorage", "parse pool size failed", e);
                }
                Iterator<AppInfoDao> it = selectAllAppInfo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    AppInfoDao next = it.next();
                    if (RVResourceUtils.compareVersion(next.getVersion(), appModel.getAppVersion()) <= 0) {
                        if (TextUtils.equals(next.getVersion(), appModel.getAppVersion())) {
                            z = false;
                            break;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("app is lower than local, do not save, appId: ");
                        sb.append(appModel.getAppId());
                        sb.append(", version: ");
                        sb.append(appModel.getAppVersion());
                        GriverLogger.w("GriverAppInfoStorage", sb.toString());
                        return;
                    }
                }
                if (z && selectAllAppInfo.size() >= intValue) {
                    GriverLogger.d("GriverAppInfoStorage", "app in pool exceeds limit size: ".concat(String.valueOf(intValue)));
                    Collections.sort(selectAllAppInfo, AppInfoUtils.getAppInfoDaoDescComparator());
                    for (AppInfoDao next2 : selectAllAppInfo.subList(intValue - 1, selectAllAppInfo.size())) {
                        StringBuilder sb2 = new StringBuilder("delete app info that exceeds pool limit, appId: ");
                        sb2.append(next2.getAppId());
                        sb2.append(", version: ");
                        sb2.append(next2.getVersion());
                        GriverLogger.d("GriverAppInfoStorage", sb2.toString());
                        f9169a.deleteAppInfo(next2);
                        String installPath = AppInfoUtils.getInstallPath(next2.getAppId(), next2.getVersion(), next2.getAppInfo().getAppInfoModel().getPackageUrl());
                        if (FileUtils.exists(installPath)) {
                            FileUtils.delete(installPath);
                        }
                    }
                }
            }
            AppInfoDao appInfoDao = new AppInfoDao();
            appInfoDao.setAppId(appModel.getAppId());
            appInfoDao.setVersion(appModel.getAppVersion());
            appInfoDao.setAppInfo(appModel);
            if (appModel.getExtendInfos().getLong(AppInfoDao.COLUMN_LAST_REFRESH_TIMESTAMP) != null) {
                long longValue = appModel.getExtendInfos().getLong(AppInfoDao.COLUMN_LAST_REFRESH_TIMESTAMP).longValue();
                appInfoDao.setLastRefreshTimestamp(longValue);
                StringBuilder sb3 = new StringBuilder("use pre download timestamp app id is = ");
                sb3.append(appModel.getAppId());
                sb3.append(" time is = ");
                sb3.append(longValue);
                GriverLogger.d("GriverAppInfoStorage", sb3.toString());
            } else {
                appInfoDao.setLastRefreshTimestamp(System.currentTimeMillis());
                StringBuilder sb4 = new StringBuilder("not use pre download timestamp app id is = ");
                sb4.append(appModel.getAppId());
                sb4.append(" time is = ");
                sb4.append(appInfoDao.getLastRefreshTimestamp());
                GriverLogger.d("GriverAppInfoStorage", sb4.toString());
            }
            f9169a.insertOrUpdateInfo(appInfoDao);
        } catch (Exception e2) {
            GriverLogger.e("GriverAppInfoStorage", "insert error", e2);
        }
    }

    public static void saveAppInfos(List<AppModel> list) {
        if (list == null || list.size() == 0) {
            GriverLogger.w("GriverAppInfoStorage", "save app infos is empty, return directly");
            return;
        }
        for (AppModel saveAppInfo : list) {
            saveAppInfo(saveAppInfo);
        }
    }

    public static List<AppModel> queryAppInfo(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            List<AppInfoDao> selectAllAppInfo = f9169a.selectAllAppInfo(str);
            if (selectAllAppInfo != null && selectAllAppInfo.size() > 0) {
                for (AppInfoDao appInfo : selectAllAppInfo) {
                    arrayList.add(appInfo.getAppInfo());
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("query app for ");
            sb.append(str);
            sb.append(" failed");
            GriverLogger.e("GriverAppInfoStorage", sb.toString(), e);
        }
        return arrayList;
    }

    public static AppModel queryHighestAppInfo(String str) {
        try {
            AppInfoDao selectAppInfoWithHighestVersion = f9169a.selectAppInfoWithHighestVersion(str);
            if (selectAppInfoWithHighestVersion != null) {
                return selectAppInfoWithHighestVersion.getAppInfo();
            }
            return null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("query highest app for ");
            sb.append(str);
            sb.append(" failed");
            GriverLogger.e("GriverAppInfoStorage", sb.toString(), e);
            return null;
        }
    }

    public static AppModel queryAppInfo(String str, String str2) {
        try {
            AppInfoDao selectAppInfo = f9169a.selectAppInfo(str, str2);
            if (selectAppInfo != null) {
                return selectAppInfo.getAppInfo();
            }
            return null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("query app for ");
            sb.append(str);
            sb.append(" with version: ");
            sb.append(str2);
            sb.append(" failed");
            GriverLogger.e("GriverAppInfoStorage", sb.toString(), e);
            return null;
        }
    }

    public static long queryLastRefreshTimestamp(String str) {
        AppInfoDao appInfoDao;
        try {
            appInfoDao = f9169a.selectAppInfoWithHighestVersion(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("query last refresh timestamp for ");
            sb.append(str);
            sb.append(" failed");
            GriverLogger.e("GriverAppInfoStorage", sb.toString());
            appInfoDao = null;
        }
        if (appInfoDao != null) {
            return appInfoDao.getLastRefreshTimestamp();
        }
        return 0;
    }

    public static void refreshUpdateTime(String str, long j) {
        GriverLogger.w("GriverAppInfoStorage", "refresh update time, do nothing temporarily");
    }

    public static void setGriverAppStorageProxy(GriverAppStorageProxy griverAppStorageProxy) {
        if (griverAppStorageProxy != null) {
            f9169a = griverAppStorageProxy;
        } else {
            GriverLogger.e("GriverAppInfoStorage", "should not set null GriverAppStorageProxy");
        }
    }

    public static List<AppModel> queryAppAppInfos() {
        List<AppInfoDao> list;
        ArrayList arrayList = null;
        try {
            list = f9169a.selectAllAppInfos();
        } catch (Exception e) {
            GriverLogger.e("GriverAppInfoStorage", "query all app info failed", e);
            list = null;
        }
        if (!(list == null || list.size() == 0)) {
            arrayList = new ArrayList();
            for (AppInfoDao appInfo : list) {
                arrayList.add(appInfo.getAppInfo());
            }
        }
        return arrayList;
    }

    public static AppModel queryLastInstall(String str) {
        List<AppModel> queryAppInfo = queryAppInfo(str);
        if (!(queryAppInfo == null || queryAppInfo.size() == 0)) {
            for (AppModel next : queryAppInfo) {
                if (AppInfoUtils.isInstalled(next)) {
                    return next;
                }
            }
        }
        return null;
    }
}
