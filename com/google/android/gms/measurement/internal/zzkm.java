package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfw;
import java.util.ArrayList;
import java.util.List;

final class zzkm {
    zzfw zza;
    List<Long> zzb;
    List<zzfo> zzc;
    long zzd;
    final /* synthetic */ zzkn zze;

    /* synthetic */ zzkm(zzkn zzkn, zzkg zzkg) {
        this.zze = zzkn;
    }

    private static final long zzb(zzfo zzfo) {
        return ((zzfo.zzf() / 1000) / 60) / 60;
    }

    public final boolean zza(long j, zzfo zzfo) {
        Preconditions.checkNotNull(zzfo);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (this.zzc.size() > 0 && zzb(this.zzc.get(0)) != zzb(zzfo)) {
            return false;
        }
        long zzbw = this.zzd + ((long) zzfo.zzbw());
        this.zze.zzd();
        if (zzbw >= ((long) Math.max(0, zzea.zzh.zzb(null).intValue()))) {
            return false;
        }
        this.zzd = zzbw;
        this.zzc.add(zzfo);
        this.zzb.add(Long.valueOf(j));
        int size = this.zzc.size();
        this.zze.zzd();
        if (size >= Math.max(1, zzea.zzi.zzb(null).intValue())) {
            return false;
        }
        return true;
    }
}
