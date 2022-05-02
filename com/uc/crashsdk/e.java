package com.uc.crashsdk;

import android.content.Context;
import com.uc.crashsdk.a.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static String f9882a;
    private static Context b;

    public static void a(Context context) {
        if (b != null) {
            c.b("mContext is existed");
        }
        b = context;
        f9882a = context.getApplicationInfo().dataDir;
    }

    public static Context a() {
        return b;
    }

    public static Object a(String str) {
        return b.getSystemService(str);
    }
}
