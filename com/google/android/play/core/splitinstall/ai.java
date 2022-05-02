package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.tasks.i;
import java.util.Collection;
import java.util.List;

final class ai extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f10969a;
    final /* synthetic */ i b;
    final /* synthetic */ av c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ai(av avVar, i iVar, List list, i iVar2) {
        super(iVar);
        this.c = avVar;
        this.f10969a = list;
        this.b = iVar2;
    }

    public final void a() {
        try {
            this.c.f10974a.b().e(this.c.d, av.b((Collection) this.f10969a), av.b(), new ap(this.c, this.b));
        } catch (RemoteException e) {
            av.b.a((Throwable) e, "deferredLanguageUninstall(%s)", this.f10969a);
            this.b.b((Exception) new RuntimeException(e));
        }
    }
}
