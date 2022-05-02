package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.bw;
import com.google.android.play.core.tasks.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class ae extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Collection f10965a;
    final /* synthetic */ Collection b;
    final /* synthetic */ i c;
    final /* synthetic */ av d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ae(av avVar, i iVar, Collection collection, Collection collection2, i iVar2) {
        super(iVar);
        this.d = avVar;
        this.f10965a = collection;
        this.b = collection2;
        this.c = iVar2;
    }

    public final void a() {
        ArrayList a2 = av.a(this.f10965a);
        a2.addAll(av.b(this.b));
        try {
            this.d.f10974a.b().a(this.d.d, (List<Bundle>) a2, av.b(), (bw) new at(this.d, this.c));
        } catch (RemoteException e) {
            av.b.a((Throwable) e, "startInstall(%s,%s)", this.f10965a, this.b);
            this.c.b((Exception) new RuntimeException(e));
        }
    }
}
