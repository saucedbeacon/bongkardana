package com.alipay.a.a.a.a;

public final class s extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    String f9245a;
    private int b;
    private String c;

    public s(Integer num, String str) {
        super(a(num, str));
        this.b = num.intValue();
        this.c = str;
    }

    public s(Integer num, String str, Throwable th) {
        super(a(num, str), th);
        this.b = num.intValue();
        this.c = str;
    }

    private static String a(Integer num, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("RPCException: ");
        if (num != null) {
            sb.append("[");
            sb.append(num);
            sb.append("]");
        }
        sb.append(" : ");
        if (str != null) {
            sb.append(str);
        }
        return sb.toString();
    }
}
