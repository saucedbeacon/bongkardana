package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.tasks.i;

final class ai extends ag {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f10844a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ i e;
    final /* synthetic */ ar f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ai(ar arVar, i iVar, int i, String str, String str2, int i2, i iVar2) {
        super(iVar);
        this.f = arVar;
        this.f10844a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = iVar2;
    }

    public final void a() {
        try {
            ((s) this.f.e.b()).d(this.f.c, ar.c(this.f10844a, this.b, this.c, this.d), ar.e(), new al(this.f, this.e));
        } catch (RemoteException e2) {
            ar.f10847a.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.f10844a));
            this.e.b((Exception) new RuntimeException(e2));
        }
    }
}
