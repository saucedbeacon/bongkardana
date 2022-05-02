package com.alibaba.griver.h5.permission;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.h5.permission.GriverH5JSAPIPermissionExtension;
import com.alibaba.griver.api.h5.permission.GriverJSAPIPermissionProxy;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5UrlHelper;
import com.alibaba.griver.base.common.utils.KitUtils;
import com.alibaba.griver.base.resource.utils.ErrorPageUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GriverJSAPIPermission implements NodeAware<App>, GriverJSAPIPermissionProxy {
    public static final String PROTOCOL_HTTP = "http:";
    public static final String PROTOCOL_HTTPS = "https:";
    App app;

    public final boolean hasDomainPermission(String str, String str2) {
        return a(str, str2) && ((GriverH5JSAPIPermissionExtension) RVProxy.get(GriverH5JSAPIPermissionExtension.class)).hasPermission(str, str2);
    }

    private boolean a(String str, String str2) {
        StringBuilder sb = new StringBuilder("check jsapi: ");
        sb.append(str);
        sb.append(" for url: ");
        sb.append(str2);
        GriverLogger.d("GriverJSAPIPermission", sb.toString());
        if (TextUtils.isEmpty(str2)) {
            GriverLogger.d("GriverJSAPIPermission", "JSAPI call rejected");
            return false;
        }
        if (str2.startsWith(KitUtils.getAssetUrl(""))) {
            String errorStatusPageUrl = ErrorPageUtils.getErrorStatusPageUrl();
            if (errorStatusPageUrl.indexOf("?") > 0) {
                errorStatusPageUrl = errorStatusPageUrl.substring(0, errorStatusPageUrl.indexOf("?"));
            }
            if (str2.startsWith(errorStatusPageUrl)) {
                return true;
            }
        }
        if (!GriverEnv.isDebuggable() && !str2.startsWith(PROTOCOL_HTTP) && !str2.startsWith(PROTOCOL_HTTPS)) {
            GriverLogger.d("GriverJSAPIPermission", "JSAPI call rejected");
            return false;
        } else if (!isBannedJSAPI(str, str2)) {
            return true;
        } else {
            GriverLogger.d("GriverJSAPIPermission", "JSAPI call rejected");
            return false;
        }
    }

    public final boolean isBannedJSAPI(String str, String str2) {
        String purifyUrl = H5UrlHelper.purifyUrl(str2);
        Map<String, List<String>> jSApiPermissionConfig = getJSApiPermissionConfig();
        boolean z = jSApiPermissionConfig != null && jSApiPermissionConfig.containsKey(str);
        JSONObject configJSONObject = GriverConfig.getConfigJSONObject(GriverConfigConstants.KEY_JSAPI_BAN_CONFIG);
        if (configJSONObject == null || !configJSONObject.containsKey(str)) {
            return z && !inWhitelist(purifyUrl, jSApiPermissionConfig.get(str));
        }
        return a(configJSONObject.getJSONObject(str), purifyUrl, z ? jSApiPermissionConfig.get(str) : Collections.EMPTY_LIST);
    }

    public Map<String, List<String>> getJSApiPermissionConfig() {
        String config = GriverConfig.getConfig(GriverConfigConstants.KEY_JSAPI_PERMISSION, "");
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        try {
            return (Map) JSON.parseObject(config, new TypeReference<Map<String, List<String>>>() {
            }, new Feature[0]);
        } catch (Exception e) {
            GriverLogger.e("GriverJSAPIPermission", "parse jsapi permission config exception", e);
            return null;
        }
    }

    public final boolean inWhitelist(String str, List<String> list) {
        if (list == null || list.isEmpty() || list.contains(str)) {
            return true;
        }
        boolean z = false;
        for (String next : list) {
            if (z || !KitUtils.isDomainMatch(next, str)) {
                if (!KitUtils.isDomainMatch(H5UrlHelper.getHost(next), str)) {
                    continue;
                } else if (!TextUtils.isEmpty(H5UrlHelper.getPath(next))) {
                    return false;
                }
            }
            z = true;
        }
        return z;
    }

    private boolean a(JSONObject jSONObject, String str, List<String> list) {
        if ("yes".equalsIgnoreCase(jSONObject.getString("isBanned"))) {
            return true;
        }
        return (list == null || list.isEmpty()) ? "yes".equalsIgnoreCase(jSONObject.getString("disableHttp")) && !str.startsWith(PROTOCOL_HTTPS) : !inWhitelist(str, list);
    }

    public void setNode(WeakReference<App> weakReference) {
        if (weakReference != null) {
            this.app = weakReference.get();
        }
    }

    public Class<App> getNodeType() {
        return App.class;
    }
}
