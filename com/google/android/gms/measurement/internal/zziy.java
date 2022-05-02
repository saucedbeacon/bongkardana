package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zziy implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzjk zzb;

    zziy(zzjk zzjk, zzp zzp) {
        this.zzb = zzjk;
        this.zza = zzp;
    }

    public final void run() {
        zzed zzM = this.zzb.zzb;
        if (zzM == null) {
            this.zzb.zzs.zzau().zzb().zza("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzM.zzu(this.zza);
            this.zzb.zzP();
        } catch (RemoteException e) {
            this.zzb.zzs.zzau().zzb().zzb("Failed to send consent settings to the service", e);
        }
    }
}
