package com.alipay.imobile.magenerator.a;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    private final int f10693a;
    private final z[] b;

    aa(int i, z... zVarArr) {
        this.f10693a = i;
        this.b = zVarArr;
    }

    public final int a() {
        return this.f10693a;
    }

    public final int b() {
        int i = 0;
        for (z a2 : this.b) {
            i += a2.a();
        }
        return i;
    }

    public final int c() {
        return this.f10693a * b();
    }

    public final z[] d() {
        return this.b;
    }
}
