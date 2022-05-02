package com.alipay.mobile.rome.syncsdk.transport.b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9436a = c.class.getSimpleName();

    public static a a(int i) {
        if (b.b == i) {
            return new d();
        }
        String str = f9436a;
        StringBuilder sb = new StringBuilder("getPacket: protoVersion not supported [ protoVersion=");
        sb.append(i);
        sb.append(" ]");
        com.alipay.mobile.rome.syncsdk.util.c.d(str, sb.toString());
        return null;
    }
}
