package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzwa<K, V> {
    private final V value;
    private final zzvz<K, V> zzcby;
    private final K zzcbz;

    private zzwa(zzyh zzyh, K k, zzyh zzyh2, V v) {
        this.zzcby = new zzvz<>(zzyh, k, zzyh2, v);
        this.zzcbz = k;
        this.value = v;
    }

    public static <K, V> zzwa<K, V> zza(zzyh zzyh, K k, zzyh zzyh2, V v) {
        return new zzwa<>(zzyh, k, zzyh2, v);
    }

    static <K, V> void zza(zzuh zzuh, zzvz<K, V> zzvz, K k, V v) throws IOException {
        zzuq.zza(zzuh, zzvz.zzcbu, 1, k);
        zzuq.zza(zzuh, zzvz.zzcbw, 2, v);
    }

    static <K, V> int zza(zzvz<K, V> zzvz, K k, V v) {
        return zzuq.zza(zzvz.zzcbu, 1, k) + zzuq.zza(zzvz.zzcbw, 2, v);
    }

    public final int zzc(int i, K k, V v) {
        return zzuh.zzcz(i) + zzuh.zzdg(zza(this.zzcby, k, v));
    }

    /* access modifiers changed from: package-private */
    public final zzvz<K, V> zzud() {
        return this.zzcby;
    }
}
