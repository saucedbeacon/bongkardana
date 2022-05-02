package com.alibaba.griver.base.resource.predownload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.base.resource.appcenter.predownloadstorage.GriverAppInfoPreDownloadStorage;
import com.alibaba.griver.base.resource.predownload.AppPreDownloadConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppPreDownloadManager {
    public static final String PRE_DOWNLOAD_FIRE_MOMENT_INIT = "griverInit";
    public static final String PRE_DOWNLOAD_TYPE_SPECIFIC_APPIDS = "specificAppIds";
    public static final String TAG = "AppPreDownloadManager";
    private static volatile AppPreDownloadManager d;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public AppPreDownloadConfig f9175a;
    private AppPreDownloadPackageManager b;
    private AppPreDownloadCacheManager c;
    /* access modifiers changed from: private */
    public CountDownLatch e;

    public CountDownLatch getCountDownLatch() {
        return this.e;
    }

    public static AppPreDownloadManager getInstance() {
        if (d == null) {
            synchronized (AppPreDownloadManager.class) {
                if (d == null) {
                    d = new AppPreDownloadManager();
                }
            }
        }
        return d;
    }

    public AppPreDownloadCacheManager getAppPreDownloadCacheManager() {
        if (this.c == null) {
            this.c = new AppPreDownloadCacheManager();
        }
        return this.c;
    }

    public AppPreDownloadPackageManager getAppPreDownloadPackageManager() {
        if (this.b == null) {
            this.b = new AppPreDownloadPackageManager();
        }
        return this.b;
    }

    public boolean appConfigIsEnable() {
        AppPreDownloadConfig appPreDownloadConfig = this.f9175a;
        if (appPreDownloadConfig == null) {
            return false;
        }
        return appPreDownloadConfig.isEnabled();
    }

    public synchronized void start() {
        refreshAppPreDownloadConfig();
        GriverLogger.d(TAG, "pre download is start method invoke ,but not real do");
        if (this.f9175a != null && this.f9175a.isEnabled()) {
            GriverLogger.d(TAG, "pre download is start method invoke and try to pre download");
            if (this.f9175a.getConfigUnits() != null) {
                ArrayList arrayList = new ArrayList();
                for (AppPreDownloadConfig.ConfigUnitsBean next : this.f9175a.getConfigUnits()) {
                    if (next != null && next.getFireMoment().equals(PRE_DOWNLOAD_FIRE_MOMENT_INIT)) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() > 0) {
                    downloadGriverInitApp(arrayList);
                }
            }
        }
    }

    public void downloadGriverInitApp(final List<AppPreDownloadConfig.ConfigUnitsBean> list) {
        GriverLogger.d(TAG, "pre download try to download app info and package");
        GriverExecutors.getSingleMonitorThreadExecutor().execute(new Runnable() {
            public void run() {
                try {
                    int maxConcurrentCount = AppPreDownloadManager.this.f9175a.getMaxConcurrentCount();
                    int i = 0;
                    for (AppPreDownloadConfig.ConfigUnitsBean configUnitsBean : list) {
                        if (configUnitsBean.getAppIds() != null && configUnitsBean.getType().equals(AppPreDownloadManager.PRE_DOWNLOAD_TYPE_SPECIFIC_APPIDS)) {
                            i += configUnitsBean.getAppIds().size();
                        }
                    }
                    if (AppPreDownloadManager.this.e == null) {
                        GriverLogger.d(AppPreDownloadManager.TAG, "countDownLatch has init count is = ".concat(String.valueOf(i)));
                        CountDownLatch unused = AppPreDownloadManager.this.e = new CountDownLatch(i);
                    }
                    Executor access$200 = AppPreDownloadManager.this.a(ExecutorType.NETWORK, maxConcurrentCount, list.size());
                    for (AppPreDownloadConfig.ConfigUnitsBean configUnitsBean2 : list) {
                        if (AppPreDownloadManager.PRE_DOWNLOAD_TYPE_SPECIFIC_APPIDS.equals(configUnitsBean2.getType())) {
                            access$200.execute(AppPreDownloadManager.this.getAppPreDownloadCacheManager().requestAppWithAppId(configUnitsBean2));
                        }
                    }
                    try {
                        StringBuilder sb = new StringBuilder("countDownLatch wait current count is = ");
                        sb.append(AppPreDownloadManager.this.e.getCount());
                        GriverLogger.d(AppPreDownloadManager.TAG, sb.toString());
                        AppPreDownloadManager.this.e.await();
                    } catch (Exception e) {
                        GriverLogger.e(AppPreDownloadManager.TAG, e.getMessage());
                    }
                    StringBuilder sb2 = new StringBuilder("countDownLatch wait over count is = ");
                    sb2.append(AppPreDownloadManager.this.e.getCount());
                    GriverLogger.d(AppPreDownloadManager.TAG, sb2.toString());
                    for (AppPreDownloadConfig.ConfigUnitsBean configUnitsBean3 : list) {
                        if (AppPreDownloadManager.PRE_DOWNLOAD_TYPE_SPECIFIC_APPIDS.equals(configUnitsBean3.getType())) {
                            for (String queryHighestAppInfo : configUnitsBean3.getAppIds()) {
                                AppPreDownloadManager.this.getAppPreDownloadPackageManager().downloadPackageWithURLString(GriverAppInfoPreDownloadStorage.queryHighestAppInfo(queryHighestAppInfo));
                            }
                        }
                    }
                } catch (Exception e2) {
                    GriverLogger.e(AppPreDownloadManager.TAG, e2.getMessage());
                    GriverMonitor.event(GriverMonitorConstants.APP_PRE_DOWNLOAD_EVENT_START_ERROR, "GriverAppContainer", (Map<String, String>) null);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public Executor a(final ExecutorType executorType, int i, int i2) {
        return new ThreadPoolExecutor(1, i, 600, TimeUnit.SECONDS, new ArrayBlockingQueue(i2), new ThreadFactory() {
            public Thread newThread(@NonNull Runnable runnable) {
                return new Thread(runnable, executorType.name());
            }
        });
    }

    public AppPreDownloadConfig refreshAppPreDownloadConfig() {
        try {
            String config = GriverInnerConfig.getConfig(GriverConfigConstants.APP_PREDOWNLOAD_CONFIG);
            GriverLogger.d(TAG, "appPreDownloadConfig is ".concat(String.valueOf(config)));
            AppPreDownloadConfig appPreDownloadConfig = (AppPreDownloadConfig) JSON.parseObject(config, AppPreDownloadConfig.class);
            this.f9175a = appPreDownloadConfig;
            return appPreDownloadConfig;
        } catch (Exception e2) {
            GriverLogger.d(TAG, e2.getMessage());
            return null;
        }
    }

    public AppModel availableAppForAppId(String str, String str2) {
        AppModel queryHighestAppInfo;
        refreshAppPreDownloadConfig();
        AppPreDownloadConfig appPreDownloadConfig = this.f9175a;
        if (appPreDownloadConfig == null || !appPreDownloadConfig.isEnabled()) {
            return null;
        }
        GriverLogger.d(TAG, "availableAppForAppId two param is execute,  pre download is enable true");
        if (ifSyncUpdate(str, str2) || TextUtils.isEmpty(str) || !isAppIdInPreDownloadConfig(str) || (queryHighestAppInfo = GriverAppInfoPreDownloadStorage.queryHighestAppInfo(str)) == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str2) && GriverAppInfoPreDownloadStorage.queryAppInfo(str, str2) == null) {
            return null;
        }
        if (((System.currentTimeMillis() - GriverAppInfoPreDownloadStorage.queryLastRefreshTimestamp(queryHighestAppInfo.getAppId())) / 1000) - ((long) this.f9175a.getAvailableExpiredTime()) > 0) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            return queryHighestAppInfo;
        }
        int compareVersion = RVResourceUtils.compareVersion(queryHighestAppInfo.getAppVersion(), str2);
        if (compareVersion == -1) {
            return null;
        }
        if (compareVersion != 0) {
            if (compareVersion == 1) {
            }
            return queryHighestAppInfo;
        } else if (GriverAppCenter.queryLastRefreshTimestamp(str) > GriverAppInfoPreDownloadStorage.queryLastRefreshTimestamp(queryHighestAppInfo.getAppId())) {
            return null;
        } else {
            return queryHighestAppInfo;
        }
    }

    public int getAppInfoAvailableReason(String str, String str2, boolean z) {
        AppPreDownloadConfig appPreDownloadConfig = this.f9175a;
        if (appPreDownloadConfig == null) {
            return 0;
        }
        if (!appPreDownloadConfig.isEnabled()) {
            return -1;
        }
        GriverLogger.d(TAG, "getAppInfoAvailableReason is execute, pre download is enable true");
        if (TextUtils.isEmpty(str)) {
            return -7;
        }
        if (!isAppIdInPreDownloadConfig(str)) {
            return -1;
        }
        if (z) {
            return -6;
        }
        if (GriverAppInfoPreDownloadStorage.queryAppInfo(str).size() == 0) {
            return -2;
        }
        if (((System.currentTimeMillis() - GriverAppInfoPreDownloadStorage.queryLastRefreshTimestamp(str)) / 1000) - ((long) this.f9175a.getAvailableExpiredTime()) > 0) {
            return -3;
        }
        AppModel queryHighestAppInfo = GriverAppInfoPreDownloadStorage.queryHighestAppInfo(str);
        if (queryHighestAppInfo == null) {
            return -8;
        }
        int compareVersion = RVResourceUtils.compareVersion(queryHighestAppInfo.getAppVersion(), str2);
        if (compareVersion == -1) {
            return -5;
        }
        return (compareVersion != 0 || GriverAppCenter.queryLastRefreshTimestamp(str) <= GriverAppInfoPreDownloadStorage.queryLastRefreshTimestamp(queryHighestAppInfo.getAppId())) ? -8 : -4;
    }

    public String zipFilePathForAppPackageURLString(AppModel appModel) {
        File preDownloadFile = AppInfoUtils.getPreDownloadFile(appModel);
        if (preDownloadFile.exists()) {
            return null;
        }
        return preDownloadFile.getAbsolutePath();
    }

    public boolean isPreDownloadFileAvailable(AppModel appModel) {
        refreshAppPreDownloadConfig();
        AppPreDownloadConfig appPreDownloadConfig = this.f9175a;
        if (appPreDownloadConfig != null && appPreDownloadConfig.isEnabled()) {
            GriverLogger.d(TAG, "isPreDownloadFileAvailable is execute, pre download is enable true");
            if (AppInfoUtils.getPreDownloadFile(appModel) != null && AppInfoUtils.getPreDownloadFile(appModel).exists()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAppIdInPreDownloadConfig(String str) {
        if (!TextUtils.isEmpty(str)) {
            refreshAppPreDownloadConfig();
            AppPreDownloadConfig appPreDownloadConfig = this.f9175a;
            if (appPreDownloadConfig != null && appPreDownloadConfig.isEnabled()) {
                GriverLogger.d(TAG, "isAppIdInPreDownloadConfig is execute, pre download is enable true");
                AppPreDownloadConfig appPreDownloadConfig2 = this.f9175a;
                if (!(appPreDownloadConfig2 == null || appPreDownloadConfig2.getConfigUnits() == null)) {
                    for (AppPreDownloadConfig.ConfigUnitsBean next : this.f9175a.getConfigUnits()) {
                        if (next.getAppIds() != null) {
                            for (String equals : next.getAppIds()) {
                                if (equals.equals(str)) {
                                    return true;
                                }
                            }
                            continue;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void uploadMonitorEvent(String str, String str2, int i, int i2) {
        GriverLogger.d(TAG, "uploadMonitorEvent is execute, pre download is enable true");
        HashMap hashMap = new HashMap();
        hashMap.put("appId", str);
        String str3 = "0";
        hashMap.put("oldPreMetaDataExisted", GriverAppCenter.queryAppInfo(str).size() == 0 ? str3 : "1");
        if (getInstance().availableAppForAppId(str, str2) == null) {
            str3 = "1";
        }
        hashMap.put("hasMetaDataNewVersion", str3);
        hashMap.put("executedDownloadPackage", String.valueOf(i));
        hashMap.put("resultCode", String.valueOf(i2));
        GriverMonitor.event(GriverMonitorConstants.APP_PRE_DOWNLOAD_TRIGGER_APP_BY_ID, "GriverAppContainer", hashMap);
    }

    public boolean ifSyncUpdate(String str, String str2) {
        Map map;
        String config = GriverInnerConfig.getConfig(GriverConfigConstants.KEY_APP_INFO_UPDATE_CONFIG_OVERRIDING, "");
        try {
            if (!TextUtils.isEmpty(config) && (map = (Map) JSONObject.parseObject(config, new TypeReference<Map<String, String>>() {
            }, new Feature[0])) != null) {
                if (map.size() != 0) {
                    if (!map.containsKey(str)) {
                        return false;
                    }
                    String str3 = (String) map.get(str);
                    if (TextUtils.isEmpty(str3)) {
                        return false;
                    }
                    if (!TextUtils.isEmpty(str2) && RVResourceUtils.compareVersion(str2, str3) >= 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            GriverLogger.e(TAG, "parse app info update config failed, config: ".concat(String.valueOf(config)));
            return false;
        }
    }
}
