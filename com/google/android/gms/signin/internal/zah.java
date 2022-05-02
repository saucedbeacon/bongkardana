package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zad;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zah extends zab implements zae {
    zah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zaa(int i) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zab(7, zaa);
    }

    public final void zaa(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1993861389, oncanceled);
            onCancelLoad.getMin(1993861389, oncanceled);
        }
        Parcel zaa = zaa();
        zad.zaa(zaa, (IInterface) iAccountAccessor);
        zaa.writeInt(i);
        zad.zaa(zaa, z);
        zab(9, zaa);
    }

    public final void zaa(zak zak, zac zac) throws RemoteException {
        Parcel zaa = zaa();
        zad.zaa(zaa, (Parcelable) zak);
        zad.zaa(zaa, (IInterface) zac);
        zab(12, zaa);
    }
}
