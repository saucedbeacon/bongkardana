package com.google.android.play.core.internal;

final class aj extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ap f9575a;

    aj(ap apVar) {
        this.f9575a = apVar;
    }

    public final void a() {
        if (this.f9575a.l != null) {
            this.f9575a.c.c("Unbind from service.", new Object[0]);
            this.f9575a.b.unbindService(this.f9575a.k);
            this.f9575a.f = false;
            this.f9575a.l = null;
            this.f9575a.k = null;
        }
    }
}
