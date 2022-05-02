package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.ac;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.tasks.i;

class f<T> extends ac {

    /* renamed from: a  reason: collision with root package name */
    final af f9602a;
    final i<T> b;
    final /* synthetic */ h c;

    f(h hVar, af afVar, i<T> iVar) {
        this.c = hVar;
        this.f9602a = afVar;
        this.b = iVar;
    }

    public void a(Bundle bundle) throws RemoteException {
        this.c.f9603a.a();
        this.f9602a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
