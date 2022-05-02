package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.tasks.i;

final class o extends m<AppUpdateInfo> {
    final /* synthetic */ p d;
    private final String e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o(p pVar, i<AppUpdateInfo> iVar, String str) {
        super(pVar, new af("OnRequestInstallCallback"), iVar);
        this.d = pVar;
        this.e = str;
    }

    public final void a(Bundle bundle) throws RemoteException {
        super.a(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.b.b((Exception) new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.b.b(p.a(this.d, bundle, this.e));
        }
    }
}
