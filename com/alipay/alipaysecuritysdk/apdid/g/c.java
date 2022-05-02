package com.alipay.alipaysecuritysdk.apdid.g;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.alipaysecuritysdk.common.d.a;
import java.util.Map;

public final class c {
    public static synchronized void a(Context context, String str, String str2) {
        synchronized (c.class) {
            a.a(context, "openapi_file_pri", "openApi".concat(String.valueOf(str)), str2);
        }
    }

    public static synchronized String a(Context context, String str) {
        String a2;
        synchronized (c.class) {
            a2 = a.a(context, "openapi_file_pri", "openApi".concat(String.valueOf(str)));
        }
        return a2;
    }

    public static synchronized void a(Context context) {
        synchronized (c.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                try {
                    edit.apply();
                } catch (Throwable th) {
                    b.a("SEC_SDK-apdid", th);
                }
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (c.class) {
            Map<String, ?> all = context.getSharedPreferences("openapi_file_pri", 0).getAll();
            for (String str : all.keySet()) {
                com.alipay.alipaysecuritysdk.common.a.a.b(com.alipay.alipaysecuritysdk.common.a.a.a(), (String) all.get(str));
            }
        }
    }
}
