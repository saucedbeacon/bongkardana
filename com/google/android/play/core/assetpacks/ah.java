package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.internal.u;
import com.google.android.play.core.tasks.i;

final class ah extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f10843a;
    final /* synthetic */ i b;
    final /* synthetic */ ar c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ah(ar arVar, i iVar, int i, i iVar2) {
        super(iVar);
        this.c = arVar;
        this.f10843a = i;
        this.b = iVar2;
    }

    public final void a() {
        try {
            ((s) this.c.e.b()).c(this.c.c, ar.c(this.f10843a), ar.e(), (u) new ak(this.c, this.b, (int[]) null));
        } catch (RemoteException e) {
            ar.f10847a.a((Throwable) e, "notifySessionFailed", new Object[0]);
        }
    }
}
