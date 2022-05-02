package com.alipay.imobile.network.quake.transport.strategy;

import android.os.Build;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f9391a = b();

    public static String a() {
        return f9391a;
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f9391a = str;
        }
    }

    private static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(Build.MODEL);
        return sb.toString();
    }

    public static boolean b(String str) throws MalformedURLException {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return c(new URL(str).getHost());
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.contains("mobilegw") && str.contains("alipay");
    }
}
