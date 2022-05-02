package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.internal.u;
import com.google.android.play.core.tasks.i;
import java.util.Collection;
import java.util.List;

final class ac extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f10838a;
    final /* synthetic */ i b;
    final /* synthetic */ ar c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ac(ar arVar, i iVar, List list, i iVar2) {
        super(iVar);
        this.c = arVar;
        this.f10838a = list;
        this.b = iVar2;
    }

    public final void a() {
        try {
            ((s) this.c.e.b()).b(this.c.c, (List<Bundle>) ar.a((Collection) this.f10838a), ar.e(), (u) new ak(this.c, this.b, (byte[]) null));
        } catch (RemoteException e) {
            ar.f10847a.a((Throwable) e, "cancelDownloads(%s)", this.f10838a);
        }
    }
}
