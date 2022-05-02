package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzit implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjk zzc;

    zzit(zzjk zzjk, zzp zzp, Bundle bundle) {
        this.zzc = zzjk;
        this.zza = zzp;
        this.zzb = bundle;
    }

    public final void run() {
        zzed zzM = this.zzc.zzb;
        if (zzM == null) {
            this.zzc.zzs.zzau().zzb().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzM.zzt(this.zzb, this.zza);
        } catch (RemoteException e) {
            this.zzc.zzs.zzau().zzb().zzb("Failed to send default event parameters to service", e);
        }
    }
}
