package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzac implements Iterator<zzap> {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ Iterator zzb;

    zzac(zzae zzae, Iterator it, Iterator it2) {
        this.zza = it;
        this.zzb = it2;
    }

    public final boolean hasNext() {
        if (this.zza.hasNext()) {
            return true;
        }
        return this.zzb.hasNext();
    }

    public final /* synthetic */ Object next() {
        if (this.zza.hasNext()) {
            return new zzat(((Integer) this.zza.next()).toString());
        }
        if (this.zzb.hasNext()) {
            return new zzat((String) this.zzb.next());
        }
        throw new NoSuchElementException();
    }
}
