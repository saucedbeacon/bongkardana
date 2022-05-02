package com.iap.ac.config.lite.dns.lookup;

import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private j f9807a;
    private Name b;
    private int c;
    private int d;

    public f(Name name, int i, int i2) {
        this.b = name;
        this.c = i;
        this.d = i2;
    }

    public final void a(j jVar) {
        this.f9807a = jVar;
    }

    public final List<i> a() throws Exception {
        g a2 = this.f9807a.a(g.a(i.a(this.b, this.c, this.d)));
        int c2 = a2.a().c();
        if (c2 == 0 || c2 == 3) {
            return a(a2);
        }
        return null;
    }

    public f(String str) throws Exception {
        this(Name.a(str), 16, 1);
    }

    private List<i> a(g gVar) {
        i b2 = gVar.b();
        int c2 = gVar.a().c();
        if ((c2 == 0 || c2 == 3) && b2 != null) {
            return gVar.a(1);
        }
        return null;
    }
}
