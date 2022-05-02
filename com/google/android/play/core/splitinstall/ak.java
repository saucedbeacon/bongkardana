package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.tasks.i;

final class ak extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f10971a;
    final /* synthetic */ av b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ak(av avVar, i iVar, i iVar2) {
        super(iVar);
        this.b = avVar;
        this.f10971a = iVar2;
    }

    public final void a() {
        try {
            this.b.f10974a.b().a(this.b.d, new as(this.b, this.f10971a));
        } catch (RemoteException e) {
            av.b.a((Throwable) e, "getSessionStates", new Object[0]);
            this.f10971a.b((Exception) new RuntimeException(e));
        }
    }
}
