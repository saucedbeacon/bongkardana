package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzix implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzjk zzb;

    zzix(zzjk zzjk, zzp zzp) {
        this.zzb = zzjk;
        this.zza = zzp;
    }

    public final void run() {
        zzed zzM = this.zzb.zzb;
        if (zzM == null) {
            this.zzb.zzs.zzau().zzb().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzM.zzh(this.zza);
            this.zzb.zzP();
        } catch (RemoteException e) {
            this.zzb.zzs.zzau().zzb().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
