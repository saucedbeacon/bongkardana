package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class zzen {
    @NonNull
    public final String zza;
    @NonNull
    public final String zzb;
    public final long zzc;
    @NonNull
    public final Bundle zzd;

    public zzen(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static zzen zza(zzas zzas) {
        return new zzen(zzas.zza, zzas.zzc, zzas.zzb.zzf(), zzas.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzd);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final zzas zzb() {
        return new zzas(this.zza, new zzaq(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
