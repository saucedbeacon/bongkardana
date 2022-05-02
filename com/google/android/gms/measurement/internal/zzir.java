package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

final class zzir implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzjk zzb;

    zzir(zzjk zzjk, zzp zzp) {
        this.zzb = zzjk;
        this.zza = zzp;
    }

    public final void run() {
        zzed zzM = this.zzb.zzb;
        if (zzM == null) {
            this.zzb.zzs.zzau().zzb().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzM.zzf(this.zza);
            this.zzb.zzs.zzn().zzn();
            this.zzb.zzk(zzM, (AbstractSafeParcelable) null, this.zza);
            this.zzb.zzP();
        } catch (RemoteException e) {
            this.zzb.zzs.zzau().zzb().zzb("Failed to send app launch to the service", e);
        }
    }
}
