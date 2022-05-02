package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import o.onEmbedViewParamChanged;

final class zzka {
    private final Clock zza;
    private long zzb;

    public zzka(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }

    public final void zza() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final void zzb() {
        this.zzb = 0;
    }

    public final boolean zzc(long j) {
        return this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb >= onEmbedViewParamChanged.HOUR_IN_MILLIS;
    }
}
