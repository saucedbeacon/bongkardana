package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;

final class zzjv {
    final /* synthetic */ zzjz zza;
    private zzju zzb;

    zzjv(zzjz zzjz) {
        this.zza = zzjz;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zza() {
        this.zza.zzg();
        if (this.zzb != null) {
            this.zza.zzd.removeCallbacks(this.zzb);
        }
        if (this.zza.zzs.zzc().zzn((String) null, zzea.zzar)) {
            this.zza.zzs.zzd().zzl.zzb(false);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzb(long j) {
        this.zzb = new zzju(this, this.zza.zzs.zzay().currentTimeMillis(), j);
        this.zza.zzd.postDelayed(this.zzb, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
