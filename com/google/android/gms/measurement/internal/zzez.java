package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzez {
    @VisibleForTesting
    final String zza;
    final /* synthetic */ zzfb zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    /* synthetic */ zzez(zzfb zzfb, String str, long j, zzev zzev) {
        this.zzb = zzfb;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j;
    }

    @WorkerThread
    private final void zzc() {
        this.zzb.zzg();
        long currentTimeMillis = this.zzb.zzs.zzay().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzb.zzd().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    @WorkerThread
    private final long zzd() {
        return this.zzb.zzd().getLong(this.zza, 0);
    }

    @WorkerThread
    public final void zza(String str, long j) {
        this.zzb.zzg();
        if (zzd() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.zzb.zzd().getLong(this.zzc, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.zzb.zzd().edit();
            edit.putString(this.zzd, str);
            edit.putLong(this.zzc, 1);
            edit.apply();
            return;
        }
        long nextLong = this.zzb.zzs.zzl().zzf().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.zzb.zzd().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(this.zzc, j3);
        edit2.apply();
    }

    @WorkerThread
    public final Pair<String, Long> zzb() {
        long j;
        this.zzb.zzg();
        this.zzb.zzg();
        long zzd2 = zzd();
        if (zzd2 == 0) {
            zzc();
            j = 0;
        } else {
            j = Math.abs(zzd2 - this.zzb.zzs.zzay().currentTimeMillis());
        }
        long j2 = this.zze;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            zzc();
            return null;
        }
        String string = this.zzb.zzd().getString(this.zzd, (String) null);
        long j3 = this.zzb.zzd().getLong(this.zzc, 0);
        zzc();
        if (string == null || j3 <= 0) {
            return zzfb.zza;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }
}
