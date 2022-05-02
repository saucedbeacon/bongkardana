package com.alibaba.griver.base.common.utils;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import o.PlaybackStateCompat;

public class TinyUtils {

    /* renamed from: a  reason: collision with root package name */
    private static PlaybackStateCompat.ErrorCode<String, Uri> f10227a = new PlaybackStateCompat.ErrorCode<>(20);

    public static boolean exists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return exists(new File(str));
    }

    public static boolean exists(File file) {
        return file != null && file.exists();
    }

    public static Uri parseUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = f10227a.get(str);
        if (uri != null) {
            return uri;
        }
        try {
            uri = Uri.parse(str);
            f10227a.put(str, uri);
            return uri;
        } catch (Exception e) {
            RVLogger.e("TinyUtils", "parse url exception.", e);
            return uri;
        }
    }

    public static String getAbsoluteUrlWithURLLib(String str, String str2) {
        Uri parseUrl = parseUrl(str2);
        if (parseUrl == null || !TextUtils.isEmpty(parseUrl.getScheme())) {
            return str2;
        }
        try {
            return new URL(new URL(str), str2).toString();
        } catch (MalformedURLException e) {
            RVLogger.e("TinyUtils", "getAbsoluteUrlWithURLLib fatal error ", e);
            return null;
        }
    }

    public static String getAbsoluteUrlV2(String str, String str2, Bundle bundle) {
        String str3;
        Uri parseUrl = parseUrl(str2);
        if (parseUrl == null || !TextUtils.isEmpty(parseUrl.getScheme())) {
            return str2;
        }
        String str4 = null;
        if (str2.startsWith("./")) {
            Uri parseUrl2 = parseUrl(str);
            if (parseUrl2 == null) {
                return null;
            }
            String scheme = parseUrl2.getScheme();
            String authority = parseUrl2.getAuthority();
            String encodedPath = parseUrl2.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                int lastIndexOf = encodedPath.lastIndexOf("/");
                StringBuilder sb = new StringBuilder();
                sb.append(scheme);
                sb.append("://");
                sb.append(authority);
                sb.append(encodedPath.substring(0, lastIndexOf));
                sb.append(str2.substring(1));
                str3 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(scheme);
                sb2.append("://");
                sb2.append(authority);
                sb2.append(str2.substring(1));
                str3 = sb2.toString();
            }
            RVLogger.d("TinyUtils", "getAbsoluteUrlV2 ./ ".concat(String.valueOf(str3)));
            return str3;
        }
        Uri parseUrl3 = parseUrl(str);
        if (parseUrl3 == null) {
            return null;
        }
        String scheme2 = parseUrl3.getScheme();
        String authority2 = parseUrl3.getAuthority();
        if (!TextUtils.isEmpty(scheme2) && !TextUtils.isEmpty(authority2)) {
            if (str2.startsWith("/")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(scheme2);
                sb3.append("://");
                sb3.append(authority2);
                sb3.append(str2);
                str4 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(scheme2);
                sb4.append("://");
                sb4.append(authority2);
                sb4.append("/");
                sb4.append(str2);
                str4 = sb4.toString();
            }
        }
        RVLogger.d("TinyUtils", "getAbsoluteUrlV2 / or else ".concat(String.valueOf(str4)));
        return str4;
    }

    public static boolean isMain() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
