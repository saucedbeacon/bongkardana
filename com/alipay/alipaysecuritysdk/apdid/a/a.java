package com.alipay.alipaysecuritysdk.apdid.a;

import com.alipay.alipaysecuritysdk.apdid.face.Configuration;
import com.alipay.alipaysecuritysdk.common.c.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Configuration f9251a;

    public static void a(Configuration configuration) {
        f9251a = configuration;
    }

    public static Configuration a() {
        Configuration configuration = f9251a;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalArgumentException("please invoke GlobalConfig.setConfiguration() method first");
    }

    public static void b() {
        if (f9251a == null) {
            b.b("SEC_SDK-apdid", "configuration is null");
        }
    }
}
