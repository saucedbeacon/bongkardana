package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzad implements Iterator<zzap> {
    final /* synthetic */ zzae zza;
    private int zzb = 0;

    zzad(zzae zzae) {
        this.zza = zzae;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    public final /* synthetic */ Object next() {
        if (this.zzb < this.zza.zzh()) {
            zzae zzae = this.zza;
            int i = this.zzb;
            this.zzb = i + 1;
            return zzae.zzl(i);
        }
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }
}
