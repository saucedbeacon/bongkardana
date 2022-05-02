package com.alipay.a.a.a.a;

import android.content.Context;
import java.lang.reflect.Proxy;

public final class d extends r {

    /* renamed from: a  reason: collision with root package name */
    Context f9231a;

    public d(Context context) {
        this.f9231a = context;
    }

    public final <T> T a(Class<T> cls, final w wVar) {
        t tVar = new t(new c() {
            public final String a() {
                return wVar.f9249a;
            }

            public final w c() {
                return wVar;
            }

            public final boolean d() {
                return wVar.c;
            }

            public final x b() {
                return h.a(d.this.f9231a.getApplicationContext());
            }
        });
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new u(tVar.f9246a, cls, tVar.b));
    }
}
