package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.tasks.i;

final class l extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f9553a;
    final /* synthetic */ String b;
    final /* synthetic */ p c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(p pVar, i iVar, i iVar2, String str) {
        super(iVar);
        this.c = pVar;
        this.f9553a = iVar2;
        this.b = str;
    }

    public final void a() {
        try {
            this.c.f9555a.b().b(this.c.d, p.d(), new n(this.c, this.f9553a));
        } catch (RemoteException e) {
            p.b.a((Throwable) e, "completeUpdate(%s)", this.b);
            this.f9553a.b((Exception) new RuntimeException(e));
        }
    }
}
