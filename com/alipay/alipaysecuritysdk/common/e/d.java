package com.alipay.alipaysecuritysdk.common.e;

import android.content.Context;

public final class d {
    public static boolean a(Context context, String str) {
        return !b(context, str);
    }

    public static boolean b(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
