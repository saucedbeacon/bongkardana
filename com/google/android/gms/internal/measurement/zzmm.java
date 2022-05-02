package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzmm extends AbstractList<String> implements RandomAccess, zzks {
    /* access modifiers changed from: private */
    public final zzks zza;

    public zzmm(zzks zzks) {
        this.zza = zzks;
    }

    public final /* synthetic */ Object get(int i) {
        return ((zzkr) this.zza).get(i);
    }

    public final Iterator<String> iterator() {
        return new zzml(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzmk(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final void zzf(zzjd zzjd) {
        throw new UnsupportedOperationException();
    }

    public final Object zzg(int i) {
        return this.zza.zzg(i);
    }

    public final List<?> zzh() {
        return this.zza.zzh();
    }

    public final zzks zzi() {
        return this;
    }
}
