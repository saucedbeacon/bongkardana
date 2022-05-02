package com.alibaba.griver.core.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5UrlHelper;

public class f {
    public static String a(String str) {
        try {
            CookieManager instance = CookieManager.getInstance();
            String cookie = instance.getCookie(str);
            if (!TextUtils.isEmpty(cookie)) {
                return cookie;
            }
            Uri parseUrl = H5UrlHelper.parseUrl(str);
            String host = parseUrl != null ? parseUrl.getHost() : null;
            return (parseUrl == null || TextUtils.isEmpty(host)) ? cookie : instance.getCookie(host);
        } catch (Throwable th) {
            GriverLogger.e("H5CookieUtil", "get cookie failed", th);
            return null;
        }
    }

    public static void a(String str, String str2) {
        try {
            CookieManager instance = CookieManager.getInstance();
            instance.setAcceptCookie(true);
            instance.setCookie(str, str2);
            CookieSyncManager.createInstance(GriverEnv.getApplicationContext()).sync();
        } catch (Throwable th) {
            GriverLogger.e("H5CookieUtil", "set cookie failed", th);
        }
    }
}
