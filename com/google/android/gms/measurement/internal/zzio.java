package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzio implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzjk zzb;

    zzio(zzjk zzjk, zzp zzp) {
        this.zzb = zzjk;
        this.zza = zzp;
    }

    public final void run() {
        zzed zzM = this.zzb.zzb;
        if (zzM == null) {
            this.zzb.zzs.zzau().zzb().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzM.zzs(this.zza);
        } catch (RemoteException e) {
            this.zzb.zzs.zzau().zzb().zzb("Failed to reset data on the service: remote exception", e);
        }
        this.zzb.zzP();
    }
}
