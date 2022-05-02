package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.internal.u;
import com.google.android.play.core.tasks.i;

final class ag extends com.google.android.play.core.internal.ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f10842a;
    final /* synthetic */ String b;
    final /* synthetic */ i c;
    final /* synthetic */ int d;
    final /* synthetic */ ar e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ag(ar arVar, i iVar, int i, String str, i iVar2, int i2) {
        super(iVar);
        this.e = arVar;
        this.f10842a = i;
        this.b = str;
        this.c = iVar2;
        this.d = i2;
    }

    public final void a() {
        try {
            ((s) this.e.e.b()).b(this.e.c, ar.c(this.f10842a, this.b), ar.e(), (u) new ao(this.e, this.c, this.f10842a, this.b, this.d));
        } catch (RemoteException e2) {
            ar.f10847a.a((Throwable) e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}
