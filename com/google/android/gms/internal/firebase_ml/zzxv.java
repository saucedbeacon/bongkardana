package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzxv extends AbstractList<String> implements zzvp, RandomAccess {
    /* access modifiers changed from: private */
    public final zzvp zzcei;

    public zzxv(zzvp zzvp) {
        this.zzcei = zzvp;
    }

    public final zzvp zztz() {
        return this;
    }

    public final Object getRaw(int i) {
        return this.zzcei.getRaw(i);
    }

    public final int size() {
        return this.zzcei.size();
    }

    public final void zze(zztq zztq) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzxy(this, i);
    }

    public final Iterator<String> iterator() {
        return new zzxx(this);
    }

    public final List<?> zzty() {
        return this.zzcei.zzty();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.zzcei.get(i);
    }
}
