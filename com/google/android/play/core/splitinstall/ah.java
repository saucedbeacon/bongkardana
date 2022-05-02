package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.tasks.i;
import java.util.Collection;
import java.util.List;

final class ah extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f10968a;
    final /* synthetic */ i b;
    final /* synthetic */ av c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ah(av avVar, i iVar, List list, i iVar2) {
        super(iVar);
        this.c = avVar;
        this.f10968a = list;
        this.b = iVar2;
    }

    public final void a() {
        try {
            this.c.f10974a.b().d(this.c.d, av.b((Collection) this.f10968a), av.b(), new ao(this.c, this.b));
        } catch (RemoteException e) {
            av.b.a((Throwable) e, "deferredLanguageInstall(%s)", this.f10968a);
            this.b.b((Exception) new RuntimeException(e));
        }
    }
}
