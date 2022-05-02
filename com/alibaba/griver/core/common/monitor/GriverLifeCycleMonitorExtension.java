package com.alibaba.griver.core.common.monitor;

import android.net.Uri;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageDestroyPoint;
import com.alibaba.ariver.app.api.point.page.PageEnterPoint;
import com.alibaba.ariver.app.api.point.page.PageExitPoint;
import com.alibaba.ariver.app.api.point.page.PagePausePoint;
import com.alibaba.ariver.app.api.point.page.PageResumePoint;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import java.util.HashMap;

@Keep
public class GriverLifeCycleMonitorExtension implements PageDestroyPoint, PageEnterPoint, PageExitPoint, PagePausePoint, PageResumePoint {
    private static final String TAG = "GriverLifeCycleMonitorExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onPageResume(Page page) {
        pageStart(page);
    }

    public void onPageEnter(Page page) {
        pageStart(page);
    }

    public void onPagePause(Page page) {
        pageEnd(page);
    }

    public void onPageExit(Page page) {
        pageEnd(page);
    }

    public void onPageDestroy(Page page) {
        if (shouldLog(page)) {
            GriverMonitor.pageDestroy(page);
        }
    }

    private void pageStart(Page page) {
        if (shouldLog(page)) {
            GriverMonitor.pageStart(page, getSpmId(page.getApp().getAppId(), page.getPageURI()));
        }
    }

    private void pageEnd(Page page) {
        JSONObject extendInfos;
        if (shouldLog(page)) {
            HashMap hashMap = new HashMap();
            String appId = page.getApp().getAppId();
            hashMap.put("appId", appId);
            hashMap.put("version", page.getApp().getAppVersion());
            hashMap.put("url", page.getOriginalURI());
            AppModel queryAppInfo = GriverAppCenter.queryAppInfo(page.getApp().getAppId(), page.getApp().getAppVersion());
            if (!(queryAppInfo == null || (extendInfos = queryAppInfo.getExtendInfos()) == null || !extendInfos.containsKey(GriverBaseConstants.KEY_SOURCE_SITE))) {
                hashMap.put("sourceSite", extendInfos.getString(GriverBaseConstants.KEY_SOURCE_SITE));
            }
            GriverMonitor.pageExit(page, getSpmId(page.getApp().getAppId(), page.getPageURI()), GriverMonitorConstants.APPX_BEHAVIOR_BIZ_TYPE_PREFIX.concat(String.valueOf(appId)), hashMap);
        }
    }

    private String getSpmId(String str, String str2) {
        String concat = "MiniApp_".concat(String.valueOf(str));
        String pathFromUrl = getPathFromUrl(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(concat);
        sb.append(".");
        sb.append(pathFromUrl);
        return sb.toString();
    }

    private String getPathFromUrl(String str) {
        try {
            return Uri.parse(str).getFragment();
        } catch (Exception e) {
            GriverLogger.e(TAG, "parse url failed", e);
            return str;
        }
    }

    private boolean shouldLog(Page page) {
        return page != null && !BundleUtils.getBoolean(page.getStartParams(), RVParams.isH5App, false);
    }
}
