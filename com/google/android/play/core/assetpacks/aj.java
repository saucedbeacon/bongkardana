package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.tasks.i;

final class aj extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f10845a;
    final /* synthetic */ ar b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aj(ar arVar, i iVar, i iVar2) {
        super(iVar);
        this.b = arVar;
        this.f10845a = iVar2;
    }

    public final void a() {
        try {
            ((s) this.b.f.b()).b(this.b.c, ar.e(), new an(this.b, this.f10845a));
        } catch (RemoteException e) {
            ar.f10847a.a((Throwable) e, "keepAlive", new Object[0]);
        }
    }
}
