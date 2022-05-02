package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcg extends zzbm implements zzci {
    zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void zzd(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, bundle);
        zza.writeLong(j);
        zzc(1, zza);
    }

    public final int zze() throws RemoteException {
        Parcel zzC = zzC(2, zza());
        int readInt = zzC.readInt();
        zzC.recycle();
        return readInt;
    }
}
