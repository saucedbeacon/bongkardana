package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.tasks.i;

final class aj extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f10970a;
    final /* synthetic */ i b;
    final /* synthetic */ av c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aj(av avVar, i iVar, int i, i iVar2) {
        super(iVar);
        this.c = avVar;
        this.f10970a = i;
        this.b = iVar2;
    }

    public final void a() {
        try {
            this.c.f10974a.b().a(this.c.d, this.f10970a, new ar(this.c, this.b));
        } catch (RemoteException e) {
            av.b.a((Throwable) e, "getSessionState(%d)", Integer.valueOf(this.f10970a));
            this.b.b((Exception) new RuntimeException(e));
        }
    }
}
