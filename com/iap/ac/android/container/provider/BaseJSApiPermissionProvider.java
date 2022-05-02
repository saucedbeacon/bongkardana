package com.iap.ac.android.container.provider;

import android.text.TextUtils;
import com.iap.ac.android.common.container.provider.JsApiPermissionProvider;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.ACContainer;
import com.iap.ac.android.container.utils.UrlUtils;
import java.util.List;
import java.util.Map;

public abstract class BaseJSApiPermissionProvider implements JsApiPermissionProvider {
    private static final String PROTOCOL_HTTP = "http:";
    private static final String PROTOCOL_HTTPS = "https:";
    public static final String TAG = "BaseJsPermissionProvider";

    public abstract Map<String, List<String>> getJSApiPermissionConfig();

    public boolean hasDomainPermission(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            ACLog.d(TAG, "JSAPI call rejected. url is empty! action = ".concat(String.valueOf(str)));
            return false;
        } else if (!ACContainer.DEBUG && !str2.startsWith("http:") && !str2.startsWith("https:")) {
            StringBuilder sb = new StringBuilder("JSAPI call rejected by http check action = ");
            sb.append(str);
            sb.append(", url = ");
            sb.append(str2);
            ACLog.d(TAG, sb.toString());
            return false;
        } else if (!isBannedJSAPI(str, str2)) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder("JSAPI call rejected by isBannedJSAPI. action = ");
            sb2.append(str);
            sb2.append(", url = ");
            sb2.append(str2);
            ACLog.d(TAG, sb2.toString());
            return false;
        }
    }

    public final boolean isBannedJSAPI(String str, String str2) {
        if (!ACContainer.DEBUG && !str2.startsWith("http:") && !str2.startsWith("https:")) {
            return true;
        }
        String purifyUrl = UrlUtils.purifyUrl(str2);
        Map<String, List<String>> jSApiPermissionConfig = getJSApiPermissionConfig();
        if (!(jSApiPermissionConfig != null && jSApiPermissionConfig.containsKey(str)) || inWhitelist(purifyUrl, jSApiPermissionConfig.get(str))) {
            return false;
        }
        return true;
    }

    public boolean inWhitelist(String str, List<String> list) {
        if (list == null || list.isEmpty() || list.contains(str)) {
            return true;
        }
        boolean z = false;
        for (String next : list) {
            if (z || !UrlUtils.isDomainMatch(next, str)) {
                if (!UrlUtils.isDomainMatch(UrlUtils.getHost(next), str)) {
                    continue;
                } else if (!TextUtils.isEmpty(UrlUtils.getPath(next))) {
                    return false;
                }
            }
            z = true;
        }
        return z;
    }
}
