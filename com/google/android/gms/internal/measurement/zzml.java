package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzml implements Iterator<String> {
    final Iterator<String> zza = this.zzb.zza.iterator();
    final /* synthetic */ zzmm zzb;

    zzml(zzmm zzmm) {
        this.zzb = zzmm;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
