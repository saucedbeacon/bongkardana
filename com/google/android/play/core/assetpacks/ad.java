package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.tasks.i;
import java.util.Map;

final class ad extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map f10839a;
    final /* synthetic */ i b;
    final /* synthetic */ ar c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ad(ar arVar, i iVar, Map map, i iVar2) {
        super(iVar);
        this.c = arVar;
        this.f10839a = map;
        this.b = iVar2;
    }

    public final void a() {
        try {
            ((s) this.c.e.b()).a(this.c.c, ar.b(this.f10839a), new am(this.c, this.b));
        } catch (RemoteException e) {
            ar.f10847a.a((Throwable) e, "syncPacks", new Object[0]);
            this.b.b((Exception) new RuntimeException(e));
        }
    }
}
