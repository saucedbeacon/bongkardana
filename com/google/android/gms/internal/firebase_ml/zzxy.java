package com.google.android.gms.internal.firebase_ml;

import java.util.ListIterator;

final class zzxy implements ListIterator<String> {
    private final /* synthetic */ zzxv zzcek;
    private ListIterator<String> zzcel = this.zzcek.zzcei.listIterator(this.zzcem);
    private final /* synthetic */ int zzcem;

    zzxy(zzxv zzxv, int i) {
        this.zzcek = zzxv;
        this.zzcem = i;
    }

    public final boolean hasNext() {
        return this.zzcel.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzcel.hasPrevious();
    }

    public final int nextIndex() {
        return this.zzcel.nextIndex();
    }

    public final int previousIndex() {
        return this.zzcel.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return this.zzcel.previous();
    }

    public final /* synthetic */ Object next() {
        return this.zzcel.next();
    }
}
