package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.tasks.i;

final class n extends m<Void> {
    n(p pVar, i<Void> iVar) {
        super(pVar, new af("OnCompleteUpdateCallback"), iVar);
    }

    public final void b(Bundle bundle) throws RemoteException {
        super.b(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.b.b((Exception) new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.b.b(null);
        }
    }
}
