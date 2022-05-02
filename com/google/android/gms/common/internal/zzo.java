package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzd;

public final class zzo extends zzb implements IGmsCallbacks {
    zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i);
        a_.writeStrongBinder(iBinder);
        zzd.zza(a_, (Parcelable) bundle);
        zzb(1, a_);
    }

    public final void zza(int i, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i);
        zzd.zza(a_, (Parcelable) bundle);
        zzb(2, a_);
    }

    public final void zza(int i, IBinder iBinder, zzc zzc) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i);
        a_.writeStrongBinder(iBinder);
        zzd.zza(a_, (Parcelable) zzc);
        zzb(3, a_);
    }
}
