package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzal extends zza implements zzaj {
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final void zza(zzad zzad) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, (Parcelable) zzad);
        transactOneway(1, obtainAndWriteInterfaceToken);
    }
}
