package com.alipay.alipaysecuritysdk.apdid.f;

import android.content.Context;

public final class b {
    public static String a(Context context) {
        try {
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-apdid", "utdid error.", e);
            return "";
        }
    }
}
