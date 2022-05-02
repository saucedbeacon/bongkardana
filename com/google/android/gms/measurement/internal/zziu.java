package com.google.android.gms.measurement.internal;

final class zziu extends zzal {
    final /* synthetic */ zzjk zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zziu(zzjk zzjk, zzgp zzgp) {
        super(zzgp);
        this.zza = zzjk;
    }

    public final void zza() {
        zzjk zzjk = this.zza;
        zzjk.zzg();
        if (zzjk.zzh()) {
            zzjk.zzs.zzau().zzk().zza("Inactivity, disconnecting from the service");
            zzjk.zzF();
        }
    }
}
