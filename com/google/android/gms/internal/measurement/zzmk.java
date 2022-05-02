package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

final class zzmk implements ListIterator<String> {
    final ListIterator<String> zza = this.zzc.zza.listIterator(this.zzb);
    final /* synthetic */ int zzb;
    final /* synthetic */ zzmm zzc;

    zzmk(zzmm zzmm, int i) {
        this.zzc = zzmm;
        this.zzb = i;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.zza.previous();
    }

    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
