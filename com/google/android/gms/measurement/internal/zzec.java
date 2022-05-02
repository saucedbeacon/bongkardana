package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.List;

public abstract class zzec extends zzbn implements zzed {
    public zzec() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzd((zzas) zzbo.zzc(parcel, zzas.CREATOR), (zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zze((zzkq) zzbo.zzc(parcel, zzkq.CREATOR), (zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                zzf((zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zzg((zzas) zzbo.zzc(parcel, zzas.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzh((zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<zzkq> zzi = zzi((zzp) zzbo.zzc(parcel, zzp.CREATOR), zzbo.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzi);
                return true;
            case 9:
                byte[] zzj = zzj((zzas) zzbo.zzc(parcel, zzas.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(zzj);
                return true;
            case 10:
                zzk(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String zzl = zzl((zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            case 12:
                zzm((zzaa) zzbo.zzc(parcel, zzaa.CREATOR), (zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzn((zzaa) zzbo.zzc(parcel, zzaa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<zzkq> zzo = zzo(parcel.readString(), parcel.readString(), zzbo.zza(parcel), (zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzo);
                return true;
            case 15:
                List<zzkq> zzp = zzp(parcel.readString(), parcel.readString(), parcel.readString(), zzbo.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzp);
                return true;
            case 16:
                List<zzaa> zzq = zzq(parcel.readString(), parcel.readString(), (zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzq);
                return true;
            case 17:
                List<zzaa> zzr = zzr(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(zzr);
                return true;
            case 18:
                zzs((zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                zzt((Bundle) zzbo.zzc(parcel, Bundle.CREATOR), (zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                zzu((zzp) zzbo.zzc(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
