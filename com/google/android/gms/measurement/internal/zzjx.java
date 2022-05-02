package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzom;
import o.onEmbedViewParamChanged;

final class zzjx {
    @VisibleForTesting
    protected long zza;
    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzjz zzc;
    private final zzal zzd = new zzjw(this, this.zzc.zzs);

    public zzjx(zzjz zzjz) {
        this.zzc = zzjz;
        long elapsedRealtime = zzjz.zzs.zzay().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zza(long j) {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = j;
        this.zzb = j;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzb(long j) {
        this.zzd.zzd();
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        this.zzd.zzd();
        this.zza = 0;
        this.zzb = 0;
    }

    @WorkerThread
    public final boolean zzd(boolean z, boolean z2, long j) {
        this.zzc.zzg();
        this.zzc.zzb();
        zzom.zzb();
        if (!this.zzc.zzs.zzc().zzn((String) null, zzea.zzan)) {
            this.zzc.zzs.zzd().zzj.zzb(this.zzc.zzs.zzay().currentTimeMillis());
        } else if (this.zzc.zzs.zzF()) {
            this.zzc.zzs.zzd().zzj.zzb(this.zzc.zzs.zzay().currentTimeMillis());
        }
        long j2 = j - this.zza;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.zzb;
                this.zzb = j;
            }
            this.zzc.zzs.zzau().zzk().zzb("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            zzik.zzm(this.zzc.zzs.zzx().zzh(!this.zzc.zzs.zzc().zzt()), bundle, true);
            if (!this.zzc.zzs.zzc().zzn((String) null, zzea.zzT) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.zzc.zzs.zzc().zzn((String) null, zzea.zzT) || !z2) {
                this.zzc.zzs.zzk().zzs("auto", "_e", bundle);
            }
            this.zza = j;
            this.zzd.zzd();
            this.zzd.zzb(onEmbedViewParamChanged.HOUR_IN_MILLIS);
            return true;
        }
        this.zzc.zzs.zzau().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
