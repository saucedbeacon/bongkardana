package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zad;

public final class zam extends zab implements zak {
    zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zaa(zai zai) throws RemoteException {
        Parcel zaa = zaa();
        zad.zaa(zaa, (IInterface) zai);
        zac(1, zaa);
    }
}
