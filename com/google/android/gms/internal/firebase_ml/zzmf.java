package com.google.android.gms.internal.firebase_ml;

final class zzmf<E> extends zzmb<E> {
    static final zzmb<Object> zzafy = new zzmf(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzafz;

    zzmf(Object[] objArr, int i) {
        this.zzafz = objArr;
        this.size = i;
    }

    /* access modifiers changed from: package-private */
    public final int zziu() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzix() {
        return false;
    }

    public final int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzit() {
        return this.zzafz;
    }

    /* access modifiers changed from: package-private */
    public final int zziv() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzafz, 0, objArr, 0, this.size);
        return this.size + 0;
    }

    public final E get(int i) {
        zzlp.zzb(i, this.size);
        return this.zzafz[i];
    }
}
