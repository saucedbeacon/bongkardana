package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

public final class zzhr {
    final String zza = null;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    @Nullable
    final zzhy<Context, Boolean> zzi;

    public zzhr(Uri uri) {
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = false;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzht<Long> zza(String str, long j) {
        return new zzhn(this, str, Long.valueOf(j), true);
    }

    public final zzht<Boolean> zzb(String str, boolean z) {
        return new zzho(this, str, Boolean.valueOf(z), true);
    }

    public final zzht<Double> zzc(String str, double d) {
        return new zzhp(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzht<String> zzd(String str, String str2) {
        return new zzhq(this, str, str2, true);
    }
}
