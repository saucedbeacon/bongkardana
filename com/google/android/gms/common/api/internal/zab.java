package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;

public abstract class zab {
    public final int zaa;

    public zab(int i) {
        this.zaa = i;
    }

    public abstract void zaa(@NonNull Status status);

    public abstract void zaa(GoogleApiManager.zaa<?> zaa2) throws DeadObjectException;

    public abstract void zaa(@NonNull zav zav, boolean z);

    public abstract void zaa(@NonNull Exception exc);

    /* access modifiers changed from: private */
    public static Status zab(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }
}
