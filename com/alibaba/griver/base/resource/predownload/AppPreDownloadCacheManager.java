package com.alibaba.griver.base.resource.predownload;

import android.os.Bundle;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.resource.appinfo.UpdateAppCallback;
import com.alibaba.griver.api.resource.appinfo.UpdateAppException;
import com.alibaba.griver.api.resource.appinfo.UpdateAppParam;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.resource.appcenter.predownloadstorage.GriverAppInfoPreDownloadStorage;
import com.alibaba.griver.base.resource.appinfo.GriverAppUpdater;
import com.alibaba.griver.base.resource.predownload.AppPreDownloadConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AppPreDownloadCacheManager {
    public static final String TAG = "AppPreDownloadCacheManager";

    public Runnable requestAppWithAppId(final AppPreDownloadConfig.ConfigUnitsBean configUnitsBean) {
        return new Runnable() {
            public void run() {
                AppPreDownloadConfig.ConfigUnitsBean configUnitsBean = configUnitsBean;
                if (configUnitsBean != null && configUnitsBean.getAppIds() != null && configUnitsBean.getAppIds().size() != 0) {
                    if (configUnitsBean.getDelay() > 0) {
                        try {
                            StringBuilder sb = new StringBuilder("requestAppWithAppInfo delay ");
                            sb.append(configUnitsBean.getDelay());
                            sb.append(" s");
                            GriverLogger.d(AppPreDownloadCacheManager.TAG, sb.toString());
                            Thread.sleep(((long) configUnitsBean.getDelay()) * 1000);
                        } catch (InterruptedException unused) {
                        }
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (String next : configUnitsBean.getAppIds()) {
                        long queryLastRefreshTimestamp = GriverAppInfoPreDownloadStorage.queryLastRefreshTimestamp(next);
                        if ((System.currentTimeMillis() - queryLastRefreshTimestamp) / 1000 > AppPreDownloadCacheManager.this.a(GriverConfigConstants.PARAM_APP_INFO_ASYNC_UPDATE, GriverConfigConstants.DEFAULT_ASYNC_UPDATE_PERIOD)) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.size() == 0) {
                        GriverLogger.d(AppPreDownloadCacheManager.TAG, "no need update app info");
                        for (String valueOf : configUnitsBean.getAppIds()) {
                            GriverLogger.d(AppPreDownloadCacheManager.TAG, "countDown app id is ".concat(String.valueOf(valueOf)));
                            AppPreDownloadManager.getInstance().getCountDownLatch().countDown();
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("requestAppWithAppId appIds:");
                    sb2.append(JSON.toJSONString(arrayList));
                    GriverLogger.d(AppPreDownloadCacheManager.TAG, sb2.toString());
                    UpdateAppParam updateAppParam = new UpdateAppParam();
                    HashMap hashMap = new HashMap();
                    for (String put : arrayList) {
                        hashMap.put(put, "");
                    }
                    updateAppParam.setRequestApps(hashMap);
                    Bundle bundle = new Bundle();
                    bundle.putString("from", AppPreDownloadCacheManager.TAG);
                    updateAppParam.setExtras(bundle);
                    GriverAppUpdater.getDefaultProxy().updateApp(updateAppParam, new UpdateAppCallback() {
                        public void onSuccess(List<AppModel> list) {
                            if (list == null || list.size() <= 0) {
                                GriverLogger.w(AppPreDownloadCacheManager.TAG, "async update success but result is null");
                            } else {
                                StringBuilder sb = new StringBuilder("async update success appInfos = ");
                                sb.append(JSON.toJSONString(list));
                                GriverLogger.w(AppPreDownloadCacheManager.TAG, sb.toString());
                                GriverAppInfoPreDownloadStorage.saveAppInfos(list);
                            }
                            if (AppPreDownloadManager.getInstance().getCountDownLatch() != null) {
                                Iterator<String> it = configUnitsBean.getAppIds().iterator();
                                while (it.hasNext()) {
                                    it.next();
                                    AppPreDownloadManager.getInstance().getCountDownLatch().countDown();
                                }
                            }
                        }

                        public void onFailure(UpdateAppException updateAppException) {
                            if (AppPreDownloadManager.getInstance().getCountDownLatch() != null) {
                                Iterator<String> it = configUnitsBean.getAppIds().iterator();
                                while (it.hasNext()) {
                                    it.next();
                                    AppPreDownloadManager.getInstance().getCountDownLatch().countDown();
                                }
                            }
                            GriverLogger.w(AppPreDownloadCacheManager.TAG, "async update failed with exception", updateAppException);
                        }
                    });
                }
            }
        };
    }

    public AppModel appForAppId(String str) {
        return GriverAppInfoPreDownloadStorage.queryHighestAppInfo(str);
    }

    public void addApp(AppModel appModel) {
        GriverAppInfoPreDownloadStorage.saveAppInfo(appModel);
    }

    public void removeApp(AppModel appModel) {
        GriverAppInfoPreDownloadStorage.deleteAppInfo(appModel);
    }

    /* access modifiers changed from: private */
    public long a(String str, long j) {
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_APP_INFO_UPDATE_CONFIG, GriverConfigConstants.DEFAULT_APP_INFO_UPDATE);
        try {
            JSONObject parseObject = JSON.parseObject(config);
            return parseObject.containsKey(str) ? parseObject.getLong(str).longValue() : j;
        } catch (Exception unused) {
            GriverLogger.e(TAG, "parse app info update config failed, config: ".concat(String.valueOf(config)));
            return j;
        }
    }
}
