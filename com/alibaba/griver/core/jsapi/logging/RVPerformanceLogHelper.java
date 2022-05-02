package com.alibaba.griver.core.jsapi.logging;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import java.util.Map;

public class RVPerformanceLogHelper {
    public static final String DEFAULT_URL = "default_url";

    public static void fillAppCommonInfo(App app, Map<String, Object> map) {
        if (app != null) {
            safelyFillForConcurrentMap("appType", app.getAppType(), map);
            safelyFillForConcurrentMap("appId", app.getAppId(), map);
            safelyFillForConcurrentMap("version", app.getAppVersion(), map);
            AppModel appModel = (AppModel) app.getData(AppModel.class);
            if (appModel != null) {
                safelyFillForConcurrentMap("version", appModel.getAppVersion(), map);
                AppInfoModel appInfoModel = appModel.getAppInfoModel();
                if (appInfoModel != null) {
                    safelyFillForConcurrentMap("status", appInfoModel.getStatus(), map);
                }
                safelyFillForConcurrentMap("appModel", JSON.toJSONString(appModel), map);
            }
        }
    }

    public static void safelyFillForConcurrentMap(String str, Object obj, Map map) {
        if (map != null && str != null && obj != null) {
            map.put(str, obj);
        }
    }

    public static void fillPageCommonInfo(Page page, Map<String, Object> map) {
        if (page != null) {
            safelyFillForConcurrentMap(GriverMonitorConstants.KEY_PAGE_URL, page.getOriginalURI(), map);
            safelyFillForConcurrentMap("url", page.getOriginalURI(), map);
        }
    }

    public static String getAppPerfKey(App app) {
        if (app == null) {
            return "";
        }
        long startToken = app.getStartToken();
        String appId = app.getAppId();
        if (TextUtils.isEmpty(appId)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(appId);
        sb.append(startToken);
        return sb.toString();
    }

    public static String getPagePerfKey(App app, String str) {
        if (app == null) {
            return "";
        }
        long startToken = app.getStartToken();
        String appId = app.getAppId();
        if (TextUtils.isEmpty(appId)) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            str = "default_url";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(appId);
        sb.append(startToken);
        sb.append(UrlUtils.getPathAndHash(str));
        return sb.toString();
    }
}
