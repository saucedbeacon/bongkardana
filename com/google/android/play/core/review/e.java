package com.google.android.play.core.review;

import android.os.RemoteException;
import com.google.android.play.core.common.PlayCoreVersion;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.tasks.i;

final class e extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f9601a;
    final /* synthetic */ h b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e(h hVar, i iVar, i iVar2) {
        super(iVar);
        this.b = hVar;
        this.f9601a = iVar2;
    }

    public final void a() {
        try {
            this.b.f9603a.b().a(this.b.c, PlayCoreVersion.a(), new g(this.b, this.f9601a));
        } catch (RemoteException e) {
            h.b.a((Throwable) e, "error requesting in-app review for %s", this.b.c);
            this.f9601a.b((Exception) new RuntimeException(e));
        }
    }
}
