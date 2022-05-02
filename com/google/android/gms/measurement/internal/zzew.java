package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzew {
    final /* synthetic */ zzfb zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzew(zzfb zzfb, String str, boolean z) {
        this.zza = zzfb;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z;
    }

    @WorkerThread
    public final boolean zza() {
        if (!this.zzd) {
            this.zzd = true;
            this.zze = this.zza.zzd().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }

    @WorkerThread
    public final void zzb(boolean z) {
        SharedPreferences.Editor edit = this.zza.zzd().edit();
        edit.putBoolean(this.zzb, z);
        edit.apply();
        this.zze = z;
    }
}
