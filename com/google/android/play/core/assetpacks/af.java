package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.internal.u;
import com.google.android.play.core.tasks.i;

final class af extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f10841a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ i e;
    final /* synthetic */ ar f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    af(ar arVar, i iVar, int i, String str, String str2, int i2, i iVar2) {
        super(iVar);
        this.f = arVar;
        this.f10841a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = iVar2;
    }

    public final void a() {
        try {
            ((s) this.f.e.b()).a(this.f.c, ar.c(this.f10841a, this.b, this.c, this.d), ar.e(), (u) new ak(this.f, this.e, (char[]) null));
        } catch (RemoteException e2) {
            ar.f10847a.a((Throwable) e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}
