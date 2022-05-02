package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.tasks.i;
import java.util.Collection;
import java.util.List;

final class ag extends com.google.android.play.core.internal.ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f10967a;
    final /* synthetic */ i b;
    final /* synthetic */ av c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ag(av avVar, i iVar, List list, i iVar2) {
        super(iVar);
        this.c = avVar;
        this.f10967a = list;
        this.b = iVar2;
    }

    public final void a() {
        try {
            this.c.f10974a.b().c(this.c.d, av.a((Collection) this.f10967a), av.b(), new an(this.c, this.b));
        } catch (RemoteException e) {
            av.b.a((Throwable) e, "deferredInstall(%s)", this.f10967a);
            this.b.b((Exception) new RuntimeException(e));
        }
    }
}
