package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import o.PlaybackStateCompat;

final class zzfi extends PlaybackStateCompat.ErrorCode<String, zzc> {
    final /* synthetic */ zzfl zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfi(zzfl zzfl, int i) {
        super(20);
        this.zza = zzfl;
    }

    public final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfl.zzo(this.zza, str);
    }
}
