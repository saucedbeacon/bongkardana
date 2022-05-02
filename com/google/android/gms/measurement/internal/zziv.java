package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;

final class zziv implements Runnable {
    final /* synthetic */ zzas zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcf zzc;
    final /* synthetic */ zzjk zzd;

    zziv(zzjk zzjk, zzas zzas, String str, zzcf zzcf) {
        this.zzd = zzjk;
        this.zza = zzas;
        this.zzb = str;
        this.zzc = zzcf;
    }

    public final void run() {
        zzfu zzfu;
        byte[] bArr = null;
        try {
            zzed zzM = this.zzd.zzb;
            if (zzM == null) {
                this.zzd.zzs.zzau().zzb().zza("Discarding data. Failed to send event to service to bundle");
                zzfu = this.zzd.zzs;
            } else {
                bArr = zzM.zzj(this.zza, this.zzb);
                this.zzd.zzP();
                zzfu = this.zzd.zzs;
            }
        } catch (RemoteException e) {
            this.zzd.zzs.zzau().zzb().zzb("Failed to send event to the service to bundle", e);
            zzfu = this.zzd.zzs;
        } catch (Throwable th) {
            this.zzd.zzs.zzl().zzag(this.zzc, bArr);
            throw th;
        }
        zzfu.zzl().zzag(this.zzc, bArr);
    }
}
