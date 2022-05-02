package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzd;

public final class zzr extends zzb implements zzq {
    zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean zza(zzj zzj, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a_ = a_();
        zzd.zza(a_, (Parcelable) zzj);
        zzd.zza(a_, (IInterface) iObjectWrapper);
        Parcel zza = zza(5, a_);
        boolean zza2 = zzd.zza(zza);
        zza.recycle();
        return zza2;
    }
}
