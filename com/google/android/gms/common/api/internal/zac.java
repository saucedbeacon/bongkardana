package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zac<T> extends zad {
    protected final TaskCompletionSource<T> zab;

    public zac(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.zab = taskCompletionSource;
    }

    public void zaa(@NonNull zav zav, boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void zab(GoogleApiManager.zaa<?> zaa) throws RemoteException;

    public void zaa(@NonNull Status status) {
        this.zab.trySetException(new ApiException(status));
    }

    public void zaa(@NonNull Exception exc) {
        this.zab.trySetException(exc);
    }

    public final void zaa(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            zab(zaa);
        } catch (DeadObjectException e) {
            zaa(zab.zab(e));
            throw e;
        } catch (RemoteException e2) {
            zaa(zab.zab(e2));
        } catch (RuntimeException e3) {
            zaa((Exception) e3);
        }
    }
}
