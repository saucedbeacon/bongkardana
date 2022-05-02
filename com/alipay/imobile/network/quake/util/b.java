package com.alipay.imobile.network.quake.util;

import java.util.regex.Pattern;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f9393a = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static boolean a(String str) {
        return f9393a.matcher(str).matches();
    }
}
