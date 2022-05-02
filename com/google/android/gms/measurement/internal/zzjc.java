package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;

final class zzjc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzp zzc;
    final /* synthetic */ zzcf zzd;
    final /* synthetic */ zzjk zze;

    zzjc(zzjk zzjk, String str, String str2, zzp zzp, zzcf zzcf) {
        this.zze = zzjk;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzp;
        this.zzd = zzcf;
    }

    public final void run() {
        zzfu zzfu;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzed zzM = this.zze.zzb;
            if (zzM == null) {
                this.zze.zzs.zzau().zzb().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                zzfu = this.zze.zzs;
            } else {
                Preconditions.checkNotNull(this.zzc);
                arrayList = zzku.zzak(zzM.zzq(this.zza, this.zzb, this.zzc));
                this.zze.zzP();
                zzfu = this.zze.zzs;
            }
        } catch (RemoteException e) {
            this.zze.zzs.zzau().zzb().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
            zzfu = this.zze.zzs;
        } catch (Throwable th) {
            this.zze.zzs.zzl().zzaj(this.zzd, arrayList);
            throw th;
        }
        zzfu.zzl().zzaj(this.zzd, arrayList);
    }
}
