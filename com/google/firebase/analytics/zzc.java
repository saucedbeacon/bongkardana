package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzhx;
import java.util.List;
import java.util.Map;

final class zzc implements zzhx {
    final /* synthetic */ zzee zza;

    zzc(zzee zzee) {
        this.zza = zzee;
    }

    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.zzh(str, str2, bundle);
    }

    public final void zzb(String str, String str2, Bundle bundle, long j) {
        this.zza.zzi(str, str2, bundle, j);
    }

    public final Map<String, Object> zzc(@Nullable String str, @Nullable String str2, boolean z) {
        return this.zza.zzB(str, str2, z);
    }

    public final void zzd(zzgu zzgu) {
        this.zza.zzd(zzgu);
    }

    public final void zze(zzgv zzgv) {
        this.zza.zze(zzgv);
    }

    public final void zzf(zzgv zzgv) {
        this.zza.zzf(zzgv);
    }

    @Nullable
    public final String zzg() {
        return this.zza.zzz();
    }

    @Nullable
    public final String zzh() {
        return this.zza.zzA();
    }

    @Nullable
    public final String zzi() {
        return this.zza.zzx();
    }

    @Nullable
    public final String zzj() {
        return this.zza.zzw();
    }

    public final long zzk() {
        return this.zza.zzy();
    }

    public final void zzl(String str) {
        this.zza.zzu(str);
    }

    public final void zzm(String str) {
        this.zza.zzv(str);
    }

    public final void zzn(Bundle bundle) {
        this.zza.zzk(bundle);
    }

    public final void zzo(String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.zza.zzl(str, str2, bundle);
    }

    public final List<Bundle> zzp(@Nullable String str, @Nullable String str2) {
        return this.zza.zzm(str, str2);
    }

    public final int zzq(String str) {
        return this.zza.zzE(str);
    }

    @Nullable
    public final Object zzr(int i) {
        return this.zza.zzH(i);
    }
}
