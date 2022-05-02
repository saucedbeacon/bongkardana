package com.alipay.imobile.network.quake.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f9396a = TimeZone.getTimeZone("GMT");
    private static final char[] b = "0123456789ABCDEF".toCharArray();

    public static int a(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String a(Context context) {
        Locale locale;
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception e) {
            LoggerWrapper.e(Quake.TAG, "", e);
            locale = null;
        }
        if (locale == null) {
            return "";
        }
        if (Locale.CHINA.equals(locale)) {
            return "zh-Hans";
        }
        if (Locale.TAIWAN.equals(locale)) {
            return "zh-Hant";
        }
        if (locale.equals(new Locale("zh", "HK"))) {
            return "zh-HK";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("-");
        sb.append(locale.getCountry());
        return sb.toString();
    }

    public static String a(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !d(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException e) {
            LoggerWrapper.e(Quake.TAG, "", e);
            return null;
        }
    }

    public static boolean a() {
        return Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
    }

    public static int b(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static boolean b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384);
            return (applicationInfo == null || (applicationInfo.flags & 2) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException e) {
            LoggerWrapper.e(Quake.TAG, "", e);
            return false;
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LoggerWrapper.w(Quake.TAG, "handler.getConfig().getUrl() is null");
            return false;
        }
        try {
            URL url = new URL(str);
            return url.getHost().contains("mobilegw") && url.getHost().contains("alipay") && url.getHost().lastIndexOf("alipay.com") != -1;
        } catch (MalformedURLException e) {
            LoggerWrapper.e(Quake.TAG, "", e);
        }
        return false;
    }

    public static String c(String str, int i, int i2) {
        int a2 = a(str, i, i2);
        return str.substring(a2, b(str, a2, i2));
    }

    public static ThreadFactory c(final String str) {
        return new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(true);
                return thread;
            }
        };
    }

    private static boolean d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }
}
