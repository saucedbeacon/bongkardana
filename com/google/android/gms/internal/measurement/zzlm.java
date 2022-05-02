package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class zzlm<T> implements zzlt<T> {
    private final zzli zza;
    private final zzmh<?, ?> zzb;
    private final boolean zzc;
    private final zzjq<?> zzd;

    private zzlm(zzmh<?, ?> zzmh, zzjq<?> zzjq, zzli zzli) {
        this.zzb = zzmh;
        this.zzc = zzjq.zza(zzli);
        this.zzd = zzjq;
        this.zza = zzli;
    }

    static <T> zzlm<T> zzf(zzmh<?, ?> zzmh, zzjq<?> zzjq, zzli zzli) {
        return new zzlm<>(zzmh, zzjq, zzli);
    }

    public final T zza() {
        return this.zza.zzbH().zzaD();
    }

    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zzb(t);
        this.zzd.zzb(t2);
        throw null;
    }

    public final int zzc(T t) {
        int hashCode = this.zzb.zzd(t).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zzb(t);
        throw null;
    }

    public final void zzd(T t, T t2) {
        zzlv.zzF(this.zzb, t, t2);
        if (this.zzc) {
            zzlv.zzE(this.zzd, t, t2);
        }
    }

    public final int zze(T t) {
        zzmh<?, ?> zzmh = this.zzb;
        int zzg = zzmh.zzg(zzmh.zzd(t));
        if (!this.zzc) {
            return zzg;
        }
        this.zzd.zzb(t);
        throw null;
    }

    public final void zzh(T t, byte[] bArr, int i, int i2, zzir zzir) throws IOException {
        zzkd zzkd = (zzkd) t;
        if (zzkd.zzc == zzmi.zza()) {
            zzkd.zzc = zzmi.zzb();
        }
        zzka zzka = (zzka) t;
        throw null;
    }

    public final void zzi(T t) {
        this.zzb.zze(t);
        this.zzd.zzc(t);
    }

    public final boolean zzj(T t) {
        this.zzd.zzb(t);
        throw null;
    }

    public final void zzm(T t, zzjl zzjl) throws IOException {
        this.zzd.zzb(t);
        throw null;
    }
}
