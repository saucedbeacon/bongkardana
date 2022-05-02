package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.internal.u;
import com.google.android.play.core.tasks.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

final class ab extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f10837a;
    final /* synthetic */ Map b;
    final /* synthetic */ i c;
    final /* synthetic */ List d;
    final /* synthetic */ ar e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ab(ar arVar, i iVar, List list, Map map, i iVar2, List list2) {
        super(iVar);
        this.e = arVar;
        this.f10837a = list;
        this.b = map;
        this.c = iVar2;
        this.d = list2;
    }

    public final void a() {
        ArrayList a2 = ar.a((Collection) this.f10837a);
        try {
            String a3 = this.e.c;
            Bundle b2 = ar.b(this.b);
            ar arVar = this.e;
            ((s) this.e.e.b()).a(a3, (List<Bundle>) a2, b2, (u) new aq(arVar, this.c, arVar.d, this.d));
        } catch (RemoteException e2) {
            ar.f10847a.a((Throwable) e2, "startDownload(%s)", this.f10837a);
            this.c.b((Exception) new RuntimeException(e2));
        }
    }
}
