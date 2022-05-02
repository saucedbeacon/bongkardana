package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

final class zzkj implements Callable<String> {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzkn zzb;

    zzkj(zzkn zzkn, zzp zzp) {
        this.zzb = zzkn;
        this.zza = zzp;
    }

    public final /* synthetic */ Object call() throws Exception {
        if (this.zzb.zzt((String) Preconditions.checkNotNull(this.zza.zza)).zzh() && zzaf.zzc(this.zza.zzv).zzh()) {
            return this.zzb.zzT(this.zza).zzd();
        }
        this.zzb.zzau().zzk().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
