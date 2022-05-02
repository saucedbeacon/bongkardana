package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzey {
    final /* synthetic */ zzfb zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzey(zzfb zzfb, String str, long j) {
        this.zza = zzfb;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j;
    }

    @WorkerThread
    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zzd().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    @WorkerThread
    public final void zzb(long j) {
        SharedPreferences.Editor edit = this.zza.zzd().edit();
        edit.putLong(this.zzb, j);
        edit.apply();
        this.zze = j;
    }
}
