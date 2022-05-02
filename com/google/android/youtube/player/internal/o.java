package com.google.android.youtube.player.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.youtube.player.internal.l;
import com.google.android.youtube.player.internal.r;
import com.google.android.youtube.player.internal.t;

public final class o extends r<l> implements b {
    private final String b;
    private final String c;
    private final String d;
    private boolean e;

    public o(Context context, String str, String str2, String str3, t.a aVar, t.b bVar) {
        super(context, aVar, bVar);
        this.b = (String) ab.a(str);
        this.c = ab.a(str2, (Object) "callingPackage cannot be null or empty");
        this.d = ab.a(str3, (Object) "callingAppVersion cannot be null or empty");
    }

    private final void k() {
        i();
        if (this.e) {
            throw new IllegalStateException("Connection client has been released");
        }
    }

    public final IBinder a() {
        k();
        try {
            return ((l) j()).a();
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        return l.a.a(iBinder);
    }

    public final k a(j jVar) {
        k();
        try {
            return ((l) j()).a(jVar);
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(i iVar, r.d dVar) throws RemoteException {
        iVar.a(dVar, 1202, this.c, this.d, this.b, (Bundle) null);
    }

    public final void a(boolean z) {
        if (f()) {
            try {
                ((l) j()).a(z);
            } catch (RemoteException unused) {
            }
            this.e = true;
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.youtube.api.service.START";
    }

    public final void d() {
        if (!this.e) {
            a(true);
        }
        super.d();
    }
}
