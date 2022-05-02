package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.bv;
import com.google.android.play.core.tasks.i;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

class au<T> extends bv {

    /* renamed from: a  reason: collision with root package name */
    final i<T> f10973a;
    final /* synthetic */ av b;

    au(av avVar, i<T> iVar) {
        this.b = avVar;
        this.f10973a = iVar;
    }

    public final void a() throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onCompleteInstallForAppUpdate", new Object[0]);
    }

    public final void a(int i) throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    public void a(int i, Bundle bundle) throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onCancelInstall(%d)", Integer.valueOf(i));
    }

    public void a(Bundle bundle) throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onDeferredInstall", new Object[0]);
    }

    public void a(List<Bundle> list) throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onGetSessionStates", new Object[0]);
    }

    public final void b() throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onGetSplitsForAppUpdate", new Object[0]);
    }

    public void b(int i, Bundle bundle) throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onGetSession(%d)", Integer.valueOf(i));
    }

    public void b(Bundle bundle) throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onDeferredLanguageInstall", new Object[0]);
    }

    public void c(int i, Bundle bundle) throws RemoteException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-667510739, oncanceled);
            onCancelLoad.getMin(-667510739, oncanceled);
        }
        this.b.f10974a.a();
        av.b.c("onStartInstall(%d)", Integer.valueOf(i));
    }

    public void c(Bundle bundle) throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onDeferredLanguageUninstall", new Object[0]);
    }

    public void d(Bundle bundle) throws RemoteException {
        this.b.f10974a.a();
        av.b.c("onDeferredUninstall", new Object[0]);
    }

    public final void e(Bundle bundle) throws RemoteException {
        this.b.f10974a.a();
        int i = bundle.getInt("error_code");
        av.b.b("onError(%d)", Integer.valueOf(i));
        this.f10973a.b((Exception) new SplitInstallException(i));
    }
}
