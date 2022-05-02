package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.List;

final class zzil implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzp zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzcf zze;
    final /* synthetic */ zzjk zzf;

    zzil(zzjk zzjk, String str, String str2, zzp zzp, boolean z, zzcf zzcf) {
        this.zzf = zzjk;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzp;
        this.zzd = z;
        this.zze = zzcf;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            zzed zzM = this.zzf.zzb;
            if (zzM == null) {
                this.zzf.zzs.zzau().zzb().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzs.zzl().zzai(this.zze, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            List<zzkq> zzo = zzM.zzo(this.zza, this.zzb, this.zzd, this.zzc);
            bundle = new Bundle();
            if (zzo != null) {
                for (zzkq next : zzo) {
                    String str = next.zze;
                    if (str != null) {
                        bundle.putString(next.zzb, str);
                    } else {
                        Long l = next.zzd;
                        if (l != null) {
                            bundle.putLong(next.zzb, l.longValue());
                        } else {
                            Double d = next.zzg;
                            if (d != null) {
                                bundle.putDouble(next.zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.zzf.zzP();
                this.zzf.zzs.zzl().zzai(this.zze, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.zzf.zzs.zzau().zzb().zzc("Failed to get user properties; remote exception", this.zza, e);
                    this.zzf.zzs.zzl().zzai(this.zze, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.zzf.zzs.zzl().zzai(this.zze, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.zzf.zzs.zzau().zzb().zzc("Failed to get user properties; remote exception", this.zza, e);
            this.zzf.zzs.zzl().zzai(this.zze, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.zzf.zzs.zzl().zzai(this.zze, bundle2);
            throw th;
        }
    }
}
