package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzar implements Iterator<zzap> {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    zzar(zzat zzat) {
        this.zza = zzat;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza.zza.length();
    }

    public final /* synthetic */ Object next() {
        if (this.zzb < this.zza.zza.length()) {
            int i = this.zzb;
            this.zzb = i + 1;
            return new zzat(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
