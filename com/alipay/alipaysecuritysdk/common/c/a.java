package com.alipay.alipaysecuritysdk.common.c;

import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static C0011a f9270a;

    /* renamed from: com.alipay.alipaysecuritysdk.common.c.a$a  reason: collision with other inner class name */
    public interface C0011a {
        void on(String str, String str2, String str3, Map<String, String> map);
    }

    public static void a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("event: ");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        b.a("SEC_SDK-event", sb.toString());
        C0011a aVar = f9270a;
        if (aVar != null) {
            aVar.on(str, str2, str3, (Map<String, String>) null);
        }
    }
}
