package com.alipay.mobile.rome.syncservice.sync;

import com.alipay.mobile.rome.syncservice.c.a.a;
import com.alipay.mobile.rome.syncservice.c.a.e;
import com.alipay.mobile.rome.syncservice.c.a.g;
import com.alipay.mobile.rome.syncservice.c.a.h;

public final class b {
    private static volatile b b;

    /* renamed from: a  reason: collision with root package name */
    public g f9485a = h.f9470a;

    private b() {
    }

    public static b a() {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void b() {
        a a2 = this.f9485a.a(1001);
        if (a2 != null) {
            a2.a();
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        a(str, str2, str3, str4, -1);
    }

    public final void a(String str, String str2, String str3, String str4, long j) {
        if (this.f9485a.a(4001) instanceof e) {
            com.alipay.mobile.rome.syncservice.a.a.a().a(e.a(str, str2, str3, str4, j));
        }
    }
}
