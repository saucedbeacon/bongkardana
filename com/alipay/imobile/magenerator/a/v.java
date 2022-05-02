package com.alipay.imobile.magenerator.a;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private r f10712a;
    private m b;
    private y c;
    private int d = -1;
    private e e;

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public final y a() {
        return this.c;
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(e eVar) {
        this.e = eVar;
    }

    public final void a(m mVar) {
        this.b = mVar;
    }

    public final void a(r rVar) {
        this.f10712a = rVar;
    }

    public final void a(y yVar) {
        this.c = yVar;
    }

    public final e b() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f10712a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
