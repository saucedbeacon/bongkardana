package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;

@VisibleForTesting
public final class zzgw {
    final Context zza;
    @Nullable
    String zzb;
    @Nullable
    String zzc;
    @Nullable
    String zzd;
    @Nullable
    Boolean zze;
    long zzf;
    @Nullable
    zzcl zzg;
    boolean zzh = true;
    @Nullable
    final Long zzi;
    @Nullable
    String zzj;

    @VisibleForTesting
    public zzgw(Context context, @Nullable zzcl zzcl, @Nullable Long l) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzcl != null) {
            this.zzg = zzcl;
            this.zzb = zzcl.zzf;
            this.zzc = zzcl.zze;
            this.zzd = zzcl.zzd;
            this.zzh = zzcl.zzc;
            this.zzf = zzcl.zzb;
            this.zzj = zzcl.zzh;
            Bundle bundle = zzcl.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
