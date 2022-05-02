package com.alipay.mobile.rome.syncsdk.transport;

import com.alipay.mobile.rome.syncsdk.util.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9433a = a.class.getSimpleName();
    private static volatile String b = "https";

    public static String a() {
        b = "https";
        String str = f9433a;
        StringBuilder sb = new StringBuilder("getSelectedChannel: [ mCurrChannel=");
        sb.append(b);
        sb.append(" ]");
        c.a(str, sb.toString());
        return b;
    }
}
