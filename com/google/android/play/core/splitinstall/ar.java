package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.tasks.i;

final class ar extends au<SplitInstallSessionState> {
    ar(av avVar, i<SplitInstallSessionState> iVar) {
        super(avVar, iVar);
    }

    public final void b(int i, Bundle bundle) throws RemoteException {
        super.b(i, bundle);
        this.f10973a.b(SplitInstallSessionState.a(bundle));
    }
}
