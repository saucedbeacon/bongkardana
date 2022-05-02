package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.zzby;

public final class zzjz extends zzf {
    protected final zzjy zza = new zzjy(this);
    protected final zzjx zzb = new zzjx(this);
    protected final zzjv zzc = new zzjv(this);
    /* access modifiers changed from: private */
    public Handler zzd;

    zzjz(zzfu zzfu) {
        super(zzfu);
    }

    static /* synthetic */ void zzh(zzjz zzjz, long j) {
        zzjz.zzg();
        zzjz.zzl();
        zzjz.zzs.zzau().zzk().zzb("Activity resumed, time", Long.valueOf(j));
        if (zzjz.zzs.zzc().zzn((String) null, zzea.zzar)) {
            if (zzjz.zzs.zzc().zzt() || zzjz.zzs.zzd().zzl.zza()) {
                zzjz.zzb.zza(j);
            }
            zzjz.zzc.zza();
        } else {
            zzjz.zzc.zza();
            if (zzjz.zzs.zzc().zzt()) {
                zzjz.zzb.zza(j);
            }
        }
        zzjy zzjy = zzjz.zza;
        zzjy.zza.zzg();
        if (zzjy.zza.zzs.zzF()) {
            if (!zzjy.zza.zzs.zzc().zzn((String) null, zzea.zzar)) {
                zzjy.zza.zzs.zzd().zzl.zzb(false);
            }
            zzjy.zzb(zzjy.zza.zzs.zzay().currentTimeMillis(), false);
        }
    }

    static /* synthetic */ void zzi(zzjz zzjz, long j) {
        zzjz.zzg();
        zzjz.zzl();
        zzjz.zzs.zzau().zzk().zzb("Activity paused, time", Long.valueOf(j));
        zzjz.zzc.zzb(j);
        if (zzjz.zzs.zzc().zzt()) {
            zzjz.zzb.zzb(j);
        }
        zzjy zzjy = zzjz.zza;
        if (!zzjy.zza.zzs.zzc().zzn((String) null, zzea.zzar)) {
            zzjy.zza.zzs.zzd().zzl.zzb(true);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzl() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new zzby(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zze() {
        return false;
    }
}
