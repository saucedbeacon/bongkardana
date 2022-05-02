package com.alibaba.griver.base.common.innerapp;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GriverInnerAppUtil {
    public static final String KEY_CLIENT_PARAM = "clientParams";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f10218a = new ConcurrentHashMap();

    public static boolean isInnerApp(App app) {
        JSONObject extendInfos;
        JSONObject jSONObject;
        boolean z = false;
        if (app == null) {
            GriverLogger.w("GriverInnerAppUtil", "check inner app, appId is null, return false");
            return false;
        }
        String appId = app.getAppId();
        if (TextUtils.isEmpty(appId)) {
            GriverLogger.w("GriverInnerAppUtil", "check inner app, appId is null, return false");
            return false;
        } else if (!f10218a.containsKey(appId)) {
            AppModel appModel = (AppModel) BundleUtils.getParcelable(app.getSceneParams(), "appInfo");
            if (appModel == null) {
                GriverLogger.d("GriverInnerAppUtil", "appInfo is not in sceneParams");
                GriverLogger.d("GriverInnerAppUtil", "check inner app from database, appId: ".concat(String.valueOf(appId)));
                appModel = GriverAppCenter.queryHighestAppInfo(appId);
            }
            if (appModel != null && (extendInfos = appModel.getExtendInfos()) != null && extendInfos.containsKey(KEY_CLIENT_PARAM) && (jSONObject = extendInfos.getJSONObject(KEY_CLIENT_PARAM)) != null && jSONObject.containsKey("appSourceTag") && jSONObject.getInteger("appSourceTag").intValue() == 1) {
                z = true;
            }
            StringBuilder sb = new StringBuilder("check inner app result: ");
            sb.append(z);
            sb.append(", appId: ");
            sb.append(appId);
            GriverLogger.d("GriverInnerAppUtil", sb.toString());
            f10218a.put(appId, Integer.valueOf(z ? 1 : 0));
            return z;
        } else if (f10218a.get(appId).intValue() == 1) {
            return true;
        } else {
            return false;
        }
    }
}
