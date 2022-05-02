package com.alibaba.griver.core.update;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.ui.GriverAppExtension;
import com.alibaba.griver.base.api.GriverAsyncUpdateManager;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.a.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Keep
public class GriverAsyncUpdateManagerImpl implements GriverAsyncUpdateManager {
    private static final String ON_CHECK_FOR_UPDATE = "checkForUpdate";
    private static final String ON_UPDATE_FAILED = "updateFailed";
    private static final String ON_UPDATE_READY = "updateReady";
    private static final String TAG = "GriverAsyncUpdateManagerImpl";
    public static volatile Map<String, JSONObject> sMessageCacheManager = new ConcurrentHashMap();
    public static volatile Map<String, Boolean> sRegisteredUpdateManager = new ConcurrentHashMap();
    private String appId;

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    private boolean hasRegisterUpdateManager() {
        Boolean bool = sRegisteredUpdateManager.get(this.appId);
        return bool != null && bool.booleanValue();
    }

    public void onUpdateResult(boolean z) {
        GriverLogger.d(TAG, "onUpdateResult...result: ".concat(String.valueOf(z)));
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("data", (Object) jSONObject2);
        if (z) {
            jSONObject2.put("hasUpdate", (Object) Boolean.TRUE);
        } else {
            jSONObject2.put("hasUpdate", (Object) Boolean.FALSE);
        }
        sendToRender(ON_CHECK_FOR_UPDATE, jSONObject);
    }

    public void onDownloadResult(boolean z) {
        GriverLogger.d(TAG, "onDownloadResult...result: ".concat(String.valueOf(z)));
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("data", (Object) jSONObject2);
        if (z) {
            jSONObject2.put("success", (Object) Boolean.TRUE);
            sendToRender(ON_UPDATE_READY, jSONObject);
            return;
        }
        jSONObject2.put("success", (Object) Boolean.FALSE);
        sendToRender(ON_UPDATE_FAILED, jSONObject);
    }

    public void sendToRender(String str, JSONObject jSONObject) {
        if (hasRegisterUpdateManager()) {
            App appByAppId = ((GriverAppExtension) RVProxy.get(GriverAppExtension.class)).getAppByAppId(this.appId);
            if (appByAppId != null && appByAppId.getActivePage() != null) {
                GriverLogger.d(TAG, "sendToRender action == ".concat(String.valueOf(str)));
                EngineUtils.sendToRender(appByAppId.getActivePage().getRender(), str, jSONObject, (SendToRenderCallback) null);
                return;
            }
            return;
        }
        if (TextUtils.equals(str, ON_CHECK_FOR_UPDATE) && sMessageCacheManager.size() > 0) {
            sMessageCacheManager.clear();
        }
        GriverLogger.d(TAG, "sendToRender cache action == ".concat(String.valueOf(str)));
        sMessageCacheManager.put(str, jSONObject);
        if (ProcessUtils.isMainProcess()) {
            Bundle bundle = new Bundle();
            bundle.putString("appId", this.appId);
            bundle.putString("updateAction", str);
            bundle.putSerializable("updateParam", JSON.toJSONString(jSONObject));
            c.a().a(this.appId, 9002, bundle);
        }
    }

    public static void sendCacheMessageToRender(App app) {
        if (sMessageCacheManager.size() != 0) {
            for (String next : sMessageCacheManager.keySet()) {
                if (!(app == null || app.getActivePage() == null)) {
                    EngineUtils.sendToRender(app.getActivePage().getRender(), next, sMessageCacheManager.get(next), (SendToRenderCallback) null);
                }
            }
            sMessageCacheManager.clear();
        }
    }

    public static void register(String str) {
        sRegisteredUpdateManager.put(str, Boolean.TRUE);
    }

    public static void unRegister(String str) {
        sRegisteredUpdateManager.clear();
    }
}
