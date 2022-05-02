package com.alibaba.griver.h5.app;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.integration.RVMain;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.appinfo.AppType;
import com.alibaba.griver.api.h5.appinfo.GriverH5AppInfo;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.StartupParamsUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.base.resource.utils.ErrorPageUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, GriverH5AppInfo> f9201a = new HashMap();
    private static final Map<String, AppModel> b = new HashMap();

    public static void a(Context context, String str, Bundle bundle) {
        AppModel queryLastInstall;
        if (context == null) {
            GriverLogger.w("GriverH5AppOpenManager", "Context is null, can not open url");
        } else if (TextUtils.isEmpty(str)) {
            GriverLogger.w("GriverH5AppOpenManager", "url is empty, can not open url");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle filterBundle = StartupParamsUtils.filterBundle("", str, bundle);
            Bundle a2 = a(str);
            a2.putAll(filterBundle);
            String b2 = b(str);
            if (TextUtils.equals(GriverBaseConstants.H5_PURE_ONLINE_ID, b2)) {
                a2.putString("appId", b2);
                GriverLogger.d("GriverH5AppOpenManager", "open pure online url: ".concat(String.valueOf(str)));
                b(context, GriverBaseConstants.H5_PURE_ONLINE_ID, a2);
                return;
            }
            a2.putString("appId", b2);
            GriverH5AppInfo griverH5AppInfo = f9201a.get(b2);
            AppModel appModel = b.get(b2);
            if (!TextUtils.isEmpty(AppInfoUtils.getPublishingStatus(appModel)) && !"PUBLISHED".equals(AppInfoUtils.getPublishingStatus(appModel))) {
                String errorUrl = ErrorPageUtils.getErrorUrl(griverH5AppInfo.appId, griverH5AppInfo.publishingStatus, "H5");
                a2.putString("url", errorUrl);
                a2.putString("u", errorUrl);
                a2.putString("appId", "");
                b(context, "", a2);
                GriverLogger.d("GriverH5AppOpenManager", "app is not published: ".concat(String.valueOf(b2)));
            } else if (griverH5AppInfo == null) {
                a2.putString("appVersion", appModel.getAppVersion());
                GriverLogger.d("GriverH5AppOpenManager", "open h5 page with new configuration: ".concat(String.valueOf(b2)));
                b(context, b2, a2);
            } else {
                GriverLogger.d("GriverH5AppOpenManager", "open h5 page with old configuration: ".concat(String.valueOf(b2)));
                if (griverH5AppInfo.shouldLoadRemote) {
                    String a3 = c.a(b2);
                    a2.putString("appId", a3);
                    a2.putString("appVersion", griverH5AppInfo.version);
                    b(context, a3, a2);
                    return;
                }
                boolean isInstalled = AppInfoUtils.isInstalled(b.get(b2));
                a2.putString("appVersion", b.get(b2).getAppVersion());
                if (isInstalled || !TextUtils.equals(griverH5AppInfo.updatePolicy, GriverH5AppInfo.UpdatePolicy.LOAD_PREVIOUS) || (queryLastInstall = GriverAppCenter.queryLastInstall(b2)) == null) {
                    b(context, b2, a2);
                    return;
                }
                a2.putString("appVersion", queryLastInstall.getAppVersion());
                b(context, b2, a2);
            }
        }
    }

    private static Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("u", str);
        bundle.putString("url", str);
        bundle.putBoolean(RVParams.isH5App, true);
        bundle.putString("backBehavior", "back");
        bundle.putBoolean("pullRefresh", false);
        bundle.putBoolean("showProgress", true);
        bundle.putString("adjustResize", "yes");
        return bundle;
    }

    private static void b(Context context, String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("appType", AppType.WEB_H5.name());
        RVMain.startPage(context, RVAppRecord.generate(str, bundle, bundle2), false);
    }

    private static String b(String str) {
        List<AppModel> queryAppInfos = GriverAppCenter.queryAppInfos();
        if (!(queryAppInfos == null || queryAppInfos.size() == 0)) {
            ArrayList arrayList = new ArrayList();
            for (AppModel next : queryAppInfos) {
                if (next != null && AppInfoUtils.getAppType(next) == 1 && !TextUtils.isEmpty(next.getAppInfoModel().getVhost()) && str.startsWith(next.getAppInfoModel().getVhost())) {
                    GriverH5AppInfo h5AppFromAppInfo = AppInfoUtils.getH5AppFromAppInfo(next);
                    if (h5AppFromAppInfo == null || TextUtils.equals("resource", h5AppFromAppInfo.type)) {
                        arrayList.add(next);
                    } else if (str.startsWith(h5AppFromAppInfo.remoteURLPrefix)) {
                        arrayList.add(next);
                    }
                }
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, new Comparator<AppModel>() {
                    /* renamed from: a */
                    public final int compare(AppModel appModel, AppModel appModel2) {
                        return RVResourceUtils.compareVersion(appModel2.getAppVersion(), appModel.getAppVersion());
                    }
                });
                AppModel appModel = (AppModel) arrayList.get(0);
                f9201a.put(appModel.getAppId(), AppInfoUtils.getH5AppFromAppInfo(appModel));
                b.put(appModel.getAppId(), appModel);
                return appModel.getAppId();
            }
        }
        return GriverBaseConstants.H5_PURE_ONLINE_ID;
    }
}
