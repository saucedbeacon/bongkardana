package com.alibaba.ariver.remotedebug.utils;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.remotedebug.core.a;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iap.ac.android.common.log.ACMonitor;
import java.util.Map;

public class RemoteDebugMessageUtils {
    public static void sendNetworkRequest(Page page, Map<String, String> map, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("headers", (Object) map);
        jSONObject.put(FirebaseAnalytics.Param.METHOD, (Object) str);
        jSONObject.put("url", (Object) str2);
        jSONObject.put("requestId", (Object) str3);
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        jSONObject.put("postBody", (Object) str4);
        RemoteDebugUtils.sendMessageToRemoteDebugOrVConsole(page, a.REMOTE_DEBUG_NETWORK_REQUEST, jSONObject.toString());
    }

    public static void sendNetworkResponse(Page page, Map<String, String> map, String str, int i, String str2, String str3, byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("headers", (Object) map);
        jSONObject.put("url", (Object) str);
        jSONObject.put("status", (Object) Integer.valueOf(i));
        jSONObject.put("statusText", (Object) str2);
        jSONObject.put("requestId", (Object) str3);
        int i2 = 1048576;
        if (bArr.length <= 1048576) {
            i2 = bArr.length;
        }
        jSONObject.put(TtmlNode.TAG_BODY, (Object) new String(bArr, 0, i2));
        RemoteDebugUtils.sendMessageToRemoteDebugOrVConsole(page, a.REMOTE_DEBUG_NETWORK_RESPONSE, jSONObject.toString());
    }

    public static void sendNetworkError(Page page, String str, int i, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONObject.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject.put(ACMonitor.EVENT_PARAM_KEY_ERROR_MSG, (Object) str2);
        jSONObject.put("requestId", (Object) str3);
        RemoteDebugUtils.sendMessageToRemoteDebugOrVConsole(page, a.REMOTE_DEBUG_NETWORK_ERROR, jSONObject.toString());
    }

    public static void sendStorage(Page page, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            if (next != null) {
                jSONObject2.put((String) next.getKey(), next.getValue());
            }
        }
        jSONObject.put("data", (Object) jSONObject2);
        RemoteDebugUtils.sendMessageToRemoteDebugOrVConsole(page, a.REMOTE_DEBUG_STORAGE, jSONObject.toString());
    }
}
