package com.alipay.a.a.a.a;

import android.content.Context;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9244a;

    public static final boolean a(Context context) {
        Boolean bool = f9244a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
            f9244a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
