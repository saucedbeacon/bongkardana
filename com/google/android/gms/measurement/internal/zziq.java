package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;

final class zziq implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzcf zzb;
    final /* synthetic */ zzjk zzc;

    zziq(zzjk zzjk, zzp zzp, zzcf zzcf) {
        this.zzc = zzjk;
        this.zza = zzp;
        this.zzb = zzcf;
    }

    public final void run() {
        zzfu zzfu;
        String str = null;
        try {
            if (!this.zzc.zzs.zzd().zzi().zzh()) {
                this.zzc.zzs.zzau().zzh().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzs.zzk().zzE((String) null);
                this.zzc.zzs.zzd().zze.zzb((String) null);
                zzfu = this.zzc.zzs;
            } else {
                zzed zzM = this.zzc.zzb;
                if (zzM == null) {
                    this.zzc.zzs.zzau().zzb().zza("Failed to get app instance id");
                    zzfu = this.zzc.zzs;
                } else {
                    Preconditions.checkNotNull(this.zza);
                    str = zzM.zzl(this.zza);
                    if (str != null) {
                        this.zzc.zzs.zzk().zzE(str);
                        this.zzc.zzs.zzd().zze.zzb(str);
                    }
                    this.zzc.zzP();
                    zzfu = this.zzc.zzs;
                }
            }
        } catch (RemoteException e) {
            this.zzc.zzs.zzau().zzb().zzb("Failed to get app instance id", e);
            zzfu = this.zzc.zzs;
        } catch (Throwable th) {
            this.zzc.zzs.zzl().zzad(this.zzb, (String) null);
            throw th;
        }
        zzfu.zzl().zzad(this.zzb, str);
    }
}
