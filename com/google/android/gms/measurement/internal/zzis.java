package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class zzis implements Runnable {
    final /* synthetic */ zzid zza;
    final /* synthetic */ zzjk zzb;

    zzis(zzjk zzjk, zzid zzid) {
        this.zzb = zzjk;
        this.zza = zzid;
    }

    public final void run() {
        zzed zzM = this.zzb.zzb;
        if (zzM == null) {
            this.zzb.zzs.zzau().zzb().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzid zzid = this.zza;
            if (zzid == null) {
                zzM.zzk(0, (String) null, (String) null, this.zzb.zzs.zzax().getPackageName());
            } else {
                zzM.zzk(zzid.zzc, zzid.zza, zzid.zzb, this.zzb.zzs.zzax().getPackageName());
            }
            this.zzb.zzP();
        } catch (RemoteException e) {
            this.zzb.zzs.zzau().zzb().zzb("Failed to send current screen to the service", e);
        }
    }
}
