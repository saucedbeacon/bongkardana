package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.ArrayList;
import java.util.List;

public final class zzeb extends zzbm implements zzed {
    zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void zzd(zzas zzas, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzas);
        zzbo.zzd(zza, zzp);
        zzc(1, zza);
    }

    public final void zze(zzkq zzkq, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzkq);
        zzbo.zzd(zza, zzp);
        zzc(2, zza);
    }

    public final void zzf(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzp);
        zzc(4, zza);
    }

    public final void zzg(zzas zzas, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzh(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzp);
        zzc(6, zza);
    }

    public final List<zzkq> zzi(zzp zzp, boolean z) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzp);
        zzbo.zzb(zza, z);
        Parcel zzC = zzC(7, zza);
        ArrayList<zzkq> createTypedArrayList = zzC.createTypedArrayList(zzkq.CREATOR);
        zzC.recycle();
        return createTypedArrayList;
    }

    public final byte[] zzj(zzas zzas, String str) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzas);
        zza.writeString(str);
        Parcel zzC = zzC(9, zza);
        byte[] createByteArray = zzC.createByteArray();
        zzC.recycle();
        return createByteArray;
    }

    public final void zzk(long j, String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    public final String zzl(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzp);
        Parcel zzC = zzC(11, zza);
        String readString = zzC.readString();
        zzC.recycle();
        return readString;
    }

    public final void zzm(zzaa zzaa, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzaa);
        zzbo.zzd(zza, zzp);
        zzc(12, zza);
    }

    public final void zzn(zzaa zzaa) throws RemoteException {
        throw null;
    }

    public final List<zzkq> zzo(String str, String str2, boolean z, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzb(zza, z);
        zzbo.zzd(zza, zzp);
        Parcel zzC = zzC(14, zza);
        ArrayList<zzkq> createTypedArrayList = zzC.createTypedArrayList(zzkq.CREATOR);
        zzC.recycle();
        return createTypedArrayList;
    }

    public final List<zzkq> zzp(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        zzbo.zzb(zza, z);
        Parcel zzC = zzC(15, zza);
        ArrayList<zzkq> createTypedArrayList = zzC.createTypedArrayList(zzkq.CREATOR);
        zzC.recycle();
        return createTypedArrayList;
    }

    public final List<zzaa> zzq(String str, String str2, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, zzp);
        Parcel zzC = zzC(16, zza);
        ArrayList<zzaa> createTypedArrayList = zzC.createTypedArrayList(zzaa.CREATOR);
        zzC.recycle();
        return createTypedArrayList;
    }

    public final List<zzaa> zzr(String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzC = zzC(17, zza);
        ArrayList<zzaa> createTypedArrayList = zzC.createTypedArrayList(zzaa.CREATOR);
        zzC.recycle();
        return createTypedArrayList;
    }

    public final void zzs(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzp);
        zzc(18, zza);
    }

    public final void zzt(Bundle bundle, zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzbo.zzd(zza, zzp);
        zzc(19, zza);
    }

    public final void zzu(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        zzbo.zzd(zza, zzp);
        zzc(20, zza);
    }
}
