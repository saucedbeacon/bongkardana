package com.alibaba.griver.base.resource.appinfo;

import android.os.Bundle;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.resource.appinfo.AppInfoConstants;
import com.alibaba.griver.api.resource.appinfo.GriverAppUpdaterProxy;
import com.alibaba.griver.api.resource.appinfo.UpdateAppCallback;
import com.alibaba.griver.api.resource.appinfo.UpdateAppException;
import com.alibaba.griver.api.resource.appinfo.UpdateAppParam;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alipay.plus.android.config.sdk.ConfigCenter;
import com.alipay.plus.android.config.sdk.fetcher.ConfigNotifyCallback;
import java.util.LinkedList;
import java.util.Map;

public class GriverAMCSAppUpdater implements GriverAppUpdaterProxy {
    public void updateApp(UpdateAppParam updateAppParam, UpdateAppCallback updateAppCallback) {
        if (updateAppParam == null) {
            GriverLogger.e("GriverAMCSAppUpdater", "param is null, callback fail");
            if (updateAppCallback != null) {
                updateAppCallback.onFailure(new UpdateAppException("0", "param is null"));
                return;
            }
            return;
        }
        final Map<String, String> requestApps = updateAppParam.getRequestApps();
        if (requestApps == null || requestApps.size() == 0) {
            GriverLogger.w("GriverAMCSAppUpdater", "no update app ids");
            if (updateAppCallback != null) {
                updateAppCallback.onFailure(new UpdateAppException("0", "no update app id"));
                return;
            }
            return;
        }
        LinkedList linkedList = new LinkedList();
        Bundle extras = updateAppParam.getExtras();
        if (extras == null || !AppInfoScene.isDevSource(extras)) {
            for (Map.Entry<String, String> key : requestApps.entrySet()) {
                StringBuilder sb = new StringBuilder("mini.");
                sb.append((String) key.getKey());
                linkedList.add(sb.toString());
            }
        } else {
            for (Map.Entry<String, String> key2 : requestApps.entrySet()) {
                linkedList.add(String.format("mini-%s-%s-%s.%s", new Object[]{BundleUtils.getString(extras, AppInfoScene.PARAM_SCENE), AppInfoScene.extractSceneVersion(extras), BundleUtils.getString(extras, AppInfoConstants.ARIVER_TOKEN), key2.getKey()}));
            }
        }
        StringBuilder sb2 = new StringBuilder("refresh apps: ");
        sb2.append(JSON.toJSONString(linkedList));
        GriverLogger.d("GriverAMCSAppUpdater", sb2.toString());
        final long currentTimeMillis = System.currentTimeMillis();
        final UpdateAppCallback updateAppCallback2 = updateAppCallback;
        ConfigCenter.getInstance().fetchAppsByIds(GriverEnv.getAppId(), "", GriverEnv.getWorkSpaceId(), linkedList, (Map<String, Object>) null, new ConfigNotifyCallback() {
            public void onFetchSuccess(Map<String, Object> map) {
                LinkedList linkedList = new LinkedList();
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, Object> value : map.entrySet()) {
                        try {
                            String jSONString = JSON.toJSONString(value.getValue());
                            GriverLogger.d("GriverAMCSAppUpdater", "app String from amcs: ".concat(String.valueOf(jSONString)));
                            linkedList.add(JSON.parseObject(jSONString, AppModel.class));
                        } catch (Exception e) {
                            GriverLogger.e("GriverAMCSAppUpdater", "parse app info failed", e);
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
                GriverLogger.e("GriverAMCSAppUpdater", sb.toString());
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
        });
    }
}
