package com.alibaba.griver.base.resource.appinfo;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.resource.appcenter.storage.AppInfoDao;
import com.alibaba.griver.api.resource.appinfo.AppInfoConstants;
import com.alibaba.griver.api.resource.appinfo.GriverAppUpdaterProxy;
import com.alibaba.griver.api.resource.appinfo.UpdateAppCallback;
import com.alibaba.griver.api.resource.appinfo.UpdateAppException;
import com.alibaba.griver.api.resource.appinfo.UpdateAppParam;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.base.resource.predownload.AppPreDownloadManager;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.fetcher.ConfigNotifyCallback;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class GriverAMCSLiteAppUpdater implements GriverAppUpdaterProxy {

    /* renamed from: a  reason: collision with root package name */
    private String f9171a;

    public GriverAMCSLiteAppUpdater(String str) {
        this.f9171a = str;
    }

    public GriverAMCSLiteAppUpdater() {
        this.f9171a = "GriverAppContainer";
    }

    public void updateApp(UpdateAppParam updateAppParam, UpdateAppCallback updateAppCallback) {
        JSONObject jSONObject;
        if (updateAppParam == null) {
            GriverLogger.e("GriverAMCSLiteAppUpdater", "param is null, callback fail");
            if (updateAppCallback != null) {
                updateAppCallback.onFailure(new UpdateAppException("0", "param is null"));
                return;
            }
            return;
        }
        final Map<String, String> requestApps = updateAppParam.getRequestApps();
        if (requestApps == null || requestApps.size() == 0) {
            GriverLogger.w("GriverAMCSLiteAppUpdater", "no update app ids");
            if (updateAppCallback != null) {
                updateAppCallback.onFailure(new UpdateAppException("0", "no update app id"));
                return;
            }
            return;
        }
        LinkedList linkedList = new LinkedList();
        Bundle extras = updateAppParam.getExtras();
        if (extras != null && AppInfoScene.isDevSource(extras)) {
            for (Map.Entry<String, String> key : requestApps.entrySet()) {
                linkedList.add(String.format("mini-%s-%s-%s.%s", new Object[]{BundleUtils.getString(extras, AppInfoScene.PARAM_SCENE), AppInfoScene.extractSceneVersion(extras), BundleUtils.getString(extras, AppInfoConstants.ARIVER_TOKEN), key.getKey()}));
            }
        } else if (TextUtils.isEmpty(GriverEnv.getEnvironment()) || "prod".equalsIgnoreCase(GriverEnv.getEnvironment().trim())) {
            for (Map.Entry<String, String> key2 : requestApps.entrySet()) {
                StringBuilder sb = new StringBuilder("mini.");
                sb.append((String) key2.getKey());
                linkedList.add(sb.toString());
            }
        } else {
            for (Map.Entry<String, String> key3 : requestApps.entrySet()) {
                StringBuilder sb2 = new StringBuilder("mini.");
                sb2.append((String) key3.getKey());
                sb2.append(".");
                sb2.append(GriverEnv.getEnvironment());
                linkedList.add(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder("refresh apps: ");
        sb3.append(JSON.toJSONString(linkedList));
        GriverLogger.d("GriverAMCSLiteAppUpdater", sb3.toString());
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("reference", GriverAccount.getUserId());
        } catch (Throwable unused) {
            hashMap.put("reference", "");
            GriverLogger.e("GriverAMCSLiteAppUpdater", "can not get the openId");
        }
        if (linkedList.size() == 1 && updateAppParam.getExtra("from") == null) {
            for (Map.Entry next : requestApps.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (TextUtils.isEmpty(str2) || str2.equals("*")) {
                    str2 = null;
                }
                AppModel availableAppForAppId = AppPreDownloadManager.getInstance().availableAppForAppId(str, str2);
                if (availableAppForAppId != null) {
                    if (updateAppCallback != null) {
                        if (updateAppParam.getExtra("from") == null) {
                            if (availableAppForAppId.getExtendInfos() != null) {
                                jSONObject = availableAppForAppId.getExtendInfos();
                            } else {
                                jSONObject = new JSONObject();
                            }
                            jSONObject.put(AppInfoDao.COLUMN_LAST_REFRESH_TIMESTAMP, (Object) Long.valueOf(GriverAppCenter.queryLastRefreshTimestamp(str)));
                            availableAppForAppId.setExtendInfos(jSONObject);
                        }
                        StringBuilder sb4 = new StringBuilder("amcs updateapp use pre appid = ");
                        sb4.append(availableAppForAppId.getAppId());
                        sb4.append(" appversion = ");
                        sb4.append(availableAppForAppId.getAppVersion());
                        GriverLogger.d("UsePackage", sb4.toString());
                        updateAppCallback.onSuccess(Arrays.asList(new AppModel[]{availableAppForAppId}));
                    }
                    GriverLogger.d("GriverAMCSLiteAppUpdater", "intercept when ids.size == 1, appId =  ".concat(String.valueOf(str)));
                    return;
                }
            }
        }
        StringBuilder sb5 = new StringBuilder("amcs updateapp use network appid ids = ");
        sb5.append(JSON.toJSONString(linkedList));
        GriverLogger.d("UsePackage", sb5.toString());
        final long currentTimeMillis = System.currentTimeMillis();
        final UpdateAppCallback updateAppCallback2 = updateAppCallback;
        ConfigCenter.getInstance(this.f9171a).refreshByKeys(linkedList, hashMap, new ConfigNotifyCallback() {
            public void onFetchSuccess(org.json.JSONObject jSONObject) {
                LinkedList linkedList = new LinkedList();
                if (jSONObject != null && jSONObject.length() > 0) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String jSONObject2 = jSONObject.getJSONObject(keys.next()).toString();
                            GriverLogger.d("GriverAMCSLiteAppUpdater", "app String from amcs: ".concat(String.valueOf(jSONObject2)));
                            linkedList.add(JSON.parseObject(jSONObject2, AppModel.class));
                        } catch (Exception e) {
                            GriverLogger.e("GriverAMCSLiteAppUpdater", "parse app info failed", e);
                        }
                    }
                }
                UpdateAppCallback updateAppCallback = updateAppCallback2;
                if (updateAppCallback != null) {
                    updateAppCallback.onSuccess(linkedList);
                }
            }

            public void onFetchFailed(String str, String str2) {
                StringBuilder sb = new StringBuilder("fetch config failed, ");
                sb.append(str);
                sb.append(" = ");
                sb.append(str2);
                GriverLogger.e("GriverAMCSLiteAppUpdater", sb.toString());
                UpdateAppCallback updateAppCallback = updateAppCallback2;
                if (updateAppCallback != null) {
                    updateAppCallback.onFailure(new UpdateAppException("2", "fetch failed"));
                }
                for (Map.Entry entry : requestApps.entrySet()) {
                    MonitorMap.Builder builder = new MonitorMap.Builder();
                    builder.appId((String) entry.getKey()).version((String) entry.getValue()).deployVersion((String) entry.getValue()).needAsynAppType(true);
                    builder.message(str2).code(str);
                    builder.cost(String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    GriverMonitor.error(GriverMonitorConstants.ERROR_FETCH_APP_EXCEPTION, "GriverAppContainer", builder.build());
                }
            }
        }, false);
    }
}
