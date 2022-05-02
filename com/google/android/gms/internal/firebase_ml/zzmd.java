package com.google.android.gms.internal.firebase_ml;

import java.util.List;

final class zzmd extends zzmb<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzmb zzafx;

    zzmd(zzmb zzmb, int i, int i2) {
        this.zzafx = zzmb;
        this.offset = i;
        this.length = i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzix() {
        return true;
    }

    public final int size() {
        return this.length;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzit() {
        return this.zzafx.zzit();
    }

    /* access modifiers changed from: package-private */
    public final int zziu() {
        return this.zzafx.zziu() + this.offset;
    }

    /* access modifiers changed from: package-private */
    public final int zziv() {
        return this.zzafx.zziu() + this.offset + this.length;
    }

    public final E get(int i) {
        zzlp.zzb(i, this.length);
        return this.zzafx.get(i + this.offset);
    }

    public final zzmb<E> zzd(int i, int i2) {
        zzlp.zza(i, i2, this.length);
        zzmb zzmb = this.zzafx;
        int i3 = this.offset;
        return (zzmb) zzmb.subList(i + i3, i2 + i3);
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
