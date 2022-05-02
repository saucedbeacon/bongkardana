package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.tasks.i;

final class aa extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f10836a;
    final /* synthetic */ i b;
    final /* synthetic */ ar c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aa(ar arVar, i iVar, String str, i iVar2) {
        super(iVar);
        this.c = arVar;
        this.f10836a = str;
        this.b = iVar2;
    }

    public final void a() {
        try {
            ((s) this.c.e.b()).e(this.c.c, ar.c(0, this.f10836a), ar.e(), new ak(this.c, this.b, (short[]) null));
        } catch (RemoteException e) {
            ar.f10847a.a((Throwable) e, "removePack(%s)", this.f10836a);
        }
    }
}
