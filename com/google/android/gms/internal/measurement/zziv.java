package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zziv extends zzix {
    final /* synthetic */ zzjd zza;
    private int zzb = 0;
    private final int zzc = this.zza.zzc();

    zziv(zzjd zzjd) {
        this.zza = zzjd;
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
