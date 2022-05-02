package com.alipay.alipaysecuritysdk.apdid.c;

import android.content.Context;
import com.alipay.alipaysecuritysdk.common.a.a;
import com.alipay.alipaysecuritysdk.common.e.e;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9256a = "EQopzyui)H)ipQW9";

    private static String a() {
        ByteBuffer allocate = ByteBuffer.allocate(48);
        allocate.putShort(3);
        allocate.put(UUID.randomUUID().toString().getBytes());
        allocate.putLong(System.currentTimeMillis());
        allocate.flip();
        allocate.array();
        try {
            return a.a(f9256a, allocate.toString());
        } catch (Exception e) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-apdid", (Throwable) e);
            return "";
        }
    }

    public static String a(Context context) {
        String a2 = com.alipay.alipaysecuritysdk.common.d.a.a(context, "alipay_login_clientkey_random", "login_clientkey_random");
        String str = "";
        if (e.c(a2)) {
            a2 = str;
        }
        if (!e.c(a2)) {
            return a2;
        }
        String a3 = a();
        if (!e.c(a3)) {
            com.alipay.alipaysecuritysdk.common.d.a.a(context, "alipay_login_clientkey_random", "login_clientkey_random", a3);
            str = a3;
        }
        return str;
    }
}
