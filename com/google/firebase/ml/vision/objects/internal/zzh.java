package com.google.firebase.ml.vision.objects.internal;

import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.android.gms.internal.firebase_ml.zzpb;
import com.google.android.gms.internal.firebase_ml.zzqn;
import java.util.List;

final /* synthetic */ class zzh implements zzpb {
    private final long zzbdz;
    private final zze zzbka;
    private final List zzbkb;
    private final zzmy zzbkc;
    private final zzqn zzbkd;

    zzh(zze zze, List list, long j, zzmy zzmy, zzqn zzqn) {
        this.zzbka = zze;
        this.zzbkb = list;
        this.zzbdz = j;
        this.zzbkc = zzmy;
        this.zzbkd = zzqn;
    }

    public final zzmn.zzaa.zza zznb() {
        return this.zzbka.zza(this.zzbkb, this.zzbdz, this.zzbkc, this.zzbkd);
    }
}
