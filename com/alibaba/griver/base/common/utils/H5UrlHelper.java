package com.alibaba.griver.base.common.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import o.PlaybackStateCompat;
import o.getTabbarModel;

public class H5UrlHelper {
    public static final String TAG = "H5UrlHelper";

    /* renamed from: a  reason: collision with root package name */
    private static PlaybackStateCompat.ErrorCode<String, Uri> f10225a = new PlaybackStateCompat.ErrorCode<>(20);
    private static PlaybackStateCompat.ErrorCode<String, String> b = new PlaybackStateCompat.ErrorCode<>(20);

    public static String purifyUrl(String str) {
        String str2;
        String str3 = b.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            int indexOf = str.indexOf("#");
            str2 = indexOf != -1 ? str.substring(0, indexOf) : str;
            try {
                if (str2.contains("??")) {
                    b.put(str, str2);
                    return str2;
                }
                int indexOf2 = str2.indexOf("?");
                if (indexOf2 != -1) {
                    str2 = str2.substring(0, indexOf2);
                }
                b.put(str, str2);
                return str2;
            } catch (Throwable unused) {
                b.put(str, str2);
                return str2;
            }
        } catch (Throwable unused2) {
            str2 = str;
            b.put(str, str2);
            return str2;
        }
    }

    public static Uri parseUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = f10225a.get(str);
        if (uri != null) {
            return uri;
        }
        try {
            uri = Uri.parse(str);
            f10225a.put(str, uri);
            return uri;
        } catch (Exception e) {
            RVLogger.e(TAG, "parse url exception.", e);
            return uri;
        }
    }

    public static String getHost(String str) {
        Uri parseUrl = parseUrl(str);
        if (parseUrl != null) {
            return parseUrl.getHost();
        }
        return null;
    }

    public static String getScheme(String str) {
        Uri parseUrl = parseUrl(str);
        if (parseUrl != null) {
            return parseUrl.getScheme();
        }
        return null;
    }

    public static String getPath(String str) {
        Uri parseUrl = parseUrl(str);
        if (parseUrl != null) {
            return parseUrl.getPath();
        }
        return null;
    }

    public static String getParam(Uri uri, String str, String str2) {
        if (uri == null) {
            return str2;
        }
        String str3 = null;
        try {
            str3 = uri.getQueryParameter(str);
        } catch (Exception e) {
            RVLogger.e(TAG, "Exception", e);
        }
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public static final String encode(String str) {
        try {
            return URLEncoder.encode(str, getTabbarModel.ENC);
        } catch (Exception e) {
            RVLogger.e(TAG, "Exception", e);
            return null;
        }
    }

    public static final String decode(String str) {
        try {
            return URLDecoder.decode(str, getTabbarModel.ENC);
        } catch (Exception e) {
            RVLogger.e(TAG, "Exception", e);
            return null;
        }
    }

    public static String getOnlineHost(String str) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("file:///") && !str.startsWith("data:")) {
            return getHost(str);
        }
        return null;
    }

    public static boolean isUrlInDomainArray(String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            return false;
        }
        Uri parseUrl = parseUrl(str);
        if (parseUrl == null) {
            RVLogger.d(TAG, "parse auto url failed!");
            return false;
        }
        String host = parseUrl.getHost();
        if (TextUtils.isEmpty(host)) {
            RVLogger.d(TAG, "can't get url host");
            return false;
        }
        String lowerCase = host.toLowerCase();
        try {
            for (String str2 : strArr) {
                if (str2.equalsIgnoreCase(lowerCase) || lowerCase.endsWith(".".concat(String.valueOf(str2)))) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            RVLogger.e(TAG, "match auto login exception.", e);
            return false;
        }
    }

    public static String stripAnchor(String str) {
        int indexOf = str.indexOf(35);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(0, indexOf);
        StringBuilder sb = new StringBuilder("stripAnchor url:");
        sb.append(str);
        sb.append(" afterUrl:");
        sb.append(substring);
        RVLogger.d(TAG, sb.toString());
        return substring;
    }
}
