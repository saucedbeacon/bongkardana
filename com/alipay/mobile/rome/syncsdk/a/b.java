package com.alipay.mobile.rome.syncsdk.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f9406a = 15;
    private static int b = 30;
    private static int c = 5;

    public static int a() {
        return f9406a;
    }

    public static void a(int i) {
        if (i > 0) {
            f9406a = i;
        }
    }

    public static int b() {
        return c;
    }

    public static void b(int i) {
        if (i > 0) {
            c = i;
        }
    }

    public static int c() {
        return b;
    }

    public static void c(int i) {
        if (i > 0) {
            b = i;
        }
    }
}
