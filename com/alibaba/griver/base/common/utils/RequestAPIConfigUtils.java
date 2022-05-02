package com.alibaba.griver.base.common.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class RequestAPIConfigUtils {
    public static boolean canSendRequest(Page page, String str, BridgeCallback bridgeCallback) {
        if (page != null) {
            return canSendRequest(page.getApp(), str, bridgeCallback);
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        GriverLogger.w("RequestAPIConfigUtils", "page is not exist, do not execute request");
        return false;
    }

    public static boolean canSendRequest(App app, String str, BridgeCallback bridgeCallback) {
        if (app == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            GriverLogger.w("RequestAPIConfigUtils", "app is not exist, do not execute request");
            return false;
        } else if (BundleUtils.getBoolean(app.getStartParams(), RVParams.isH5App, false) || AppTypeUtils.isEmbedPage(app.getActivePage())) {
            GriverLogger.d("RequestAPIConfigUtils", "request in H5 page, can send");
            return true;
        } else {
            try {
                Uri parse = Uri.parse(str);
                if (parse == null || TextUtils.isEmpty(str) || !str.startsWith("http")) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                    GriverLogger.w("RequestAPIConfigUtils", "invalid url, callback error, can not send");
                    return false;
                } else if (str.startsWith("https")) {
                    GriverLogger.d("RequestAPIConfigUtils", "request is https, can send");
                    return true;
                } else if (!a()) {
                    GriverLogger.d("RequestAPIConfigUtils", "http request control enable is false, do not send http request");
                    bridgeCallback.sendBridgeResponse(BridgeResponse.newError(2, "http scheme is not allowed"));
                    return false;
                } else {
                    JSONArray b = b();
                    if (b == null || b.size() == 0) {
                        GriverLogger.d("RequestAPIConfigUtils", "http request control whitelist is empty, can send http request");
                        return true;
                    } else if (b.contains(parse.getHost())) {
                        return true;
                    } else {
                        GriverLogger.w("RequestAPIConfigUtils", "whitelist is not empty, but url is not in whitelist, do not send, url: ".concat(String.valueOf(str)));
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newError(2, "http scheme is not allowed"));
                        return false;
                    }
                }
            } catch (Exception e) {
                GriverLogger.e("RequestAPIConfigUtils", "parse uri failed for ".concat(String.valueOf(str)), e);
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                return false;
            }
        }
    }

    private static boolean a() {
        return JSONUtils.getBoolean(c(), "enable", false);
    }

    private static JSONArray b() {
        return c().getJSONArray("whitelist");
    }

    private static JSONObject c() {
        return JSONUtils.parseObject(GriverConfig.getConfig(GriverConfigConstants.KEY_REQUEST_HTTP_CONTROL, "{\"enable\":false,\"whitelist\":[]}"));
    }
}
