package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.tasks.i;

final class k extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f9552a;
    final /* synthetic */ i b;
    final /* synthetic */ p c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(p pVar, i iVar, String str, i iVar2) {
        super(iVar);
        this.c = pVar;
        this.f9552a = str;
        this.b = iVar2;
    }

    public final void a() {
        try {
            this.c.f9555a.b().a(this.c.d, p.a(this.c, this.f9552a), new o(this.c, this.b, this.f9552a));
        } catch (RemoteException e) {
            p.b.a((Throwable) e, "requestUpdateInfo(%s)", this.f9552a);
            this.b.b((Exception) new RuntimeException(e));
        }
    }
}
