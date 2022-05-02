package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import o.PlaybackStateCompat;

public final class zzd extends zze {
    private final Map<String, Long> zza = new PlaybackStateCompat();
    private final Map<String, Integer> zzb = new PlaybackStateCompat();
    private long zzc;

    public zzd(zzfu zzfu) {
        super(zzfu);
    }

    static /* synthetic */ void zzd(zzd zzd, String str, long j) {
        zzd.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzd.zzb.isEmpty()) {
            zzd.zzc = j;
        }
        Integer num = zzd.zzb.get(str);
        if (num != null) {
            zzd.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzd.zzb.size() >= 100) {
            zzd.zzs.zzau().zze().zza("Too many ads visible");
        } else {
            zzd.zzb.put(str, 1);
            zzd.zza.put(str, Long.valueOf(j));
        }
    }

    static /* synthetic */ void zze(zzd zzd, String str, long j) {
        zzd.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = zzd.zzb.get(str);
        if (num != null) {
            zzid zzh = zzd.zzs.zzx().zzh(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzd.zzb.remove(str);
                Long l = zzd.zza.get(str);
                if (l == null) {
                    zzd.zzs.zzau().zzb().zza("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    zzd.zza.remove(str);
                    zzd.zzi(str, j - longValue, zzh);
                }
                if (zzd.zzb.isEmpty()) {
                    long j2 = zzd.zzc;
                    if (j2 == 0) {
                        zzd.zzs.zzau().zzb().zza("First ad exposure time was never set");
                        return;
                    }
                    zzd.zzh(j - j2, zzh);
                    zzd.zzc = 0;
                    return;
                }
                return;
            }
            zzd.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzd.zzs.zzau().zzb().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    @WorkerThread
    private final void zzh(long j, zzid zzid) {
        if (zzid == null) {
            this.zzs.zzau().zzk().zza("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.zzs.zzau().zzk().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzik.zzm(zzid, bundle, true);
            this.zzs.zzk().zzs("am", "_xa", bundle);
        }
    }

    @WorkerThread
    private final void zzi(String str, long j, zzid zzid) {
        if (zzid == null) {
            this.zzs.zzau().zzk().zza("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.zzs.zzau().zzk().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzik.zzm(zzid, bundle, true);
            this.zzs.zzk().zzs("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzj(long j) {
        for (String put : this.zza.keySet()) {
            this.zza.put(put, Long.valueOf(j));
        }
        if (!this.zza.isEmpty()) {
            this.zzc = j;
        }
    }

    public final void zza(String str, long j) {
        if (str == null || str.length() == 0) {
            this.zzs.zzau().zzb().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzav().zzh(new zza(this, str, j));
        }
    }

    public final void zzb(String str, long j) {
        if (str == null || str.length() == 0) {
            this.zzs.zzau().zzb().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzav().zzh(new zzb(this, str, j));
        }
    }

    @WorkerThread
    public final void zzc(long j) {
        zzid zzh = this.zzs.zzx().zzh(false);
        for (String next : this.zza.keySet()) {
            zzi(next, j - this.zza.get(next).longValue(), zzh);
        }
        if (!this.zza.isEmpty()) {
            zzh(j - this.zzc, zzh);
        }
        zzj(j);
    }
}
