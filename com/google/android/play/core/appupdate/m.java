package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.o;
import com.google.android.play.core.tasks.i;

class m<T> extends o {

    /* renamed from: a  reason: collision with root package name */
    final af f9554a;
    final i<T> b;
    final /* synthetic */ p c;

    m(p pVar, af afVar, i<T> iVar) {
        this.c = pVar;
        this.f9554a = afVar;
        this.b = iVar;
    }

    public void a(Bundle bundle) throws RemoteException {
        this.c.f9555a.a();
        this.f9554a.c("onRequestInfo", new Object[0]);
    }

    public void b(Bundle bundle) throws RemoteException {
        this.c.f9555a.a();
        this.f9554a.c("onCompleteUpdate", new Object[0]);
    }
}
