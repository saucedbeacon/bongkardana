package com.google.android.gms.measurement.internal;

final class zzgz implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzhw zzb;

    zzgz(zzhw zzhw, boolean z) {
        this.zzb = zzhw;
        this.zza = z;
    }

    public final void run() {
        boolean zzF = this.zzb.zzs.zzF();
        boolean zzE = this.zzb.zzs.zzE();
        this.zzb.zzs.zzD(this.zza);
        if (zzE == this.zza) {
            this.zzb.zzs.zzau().zzk().zzb("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if (this.zzb.zzs.zzF() == zzF || this.zzb.zzs.zzF() != this.zzb.zzs.zzE()) {
            this.zzb.zzs.zzau().zzh().zzc("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(zzF));
        }
        this.zzb.zzZ();
    }
}
