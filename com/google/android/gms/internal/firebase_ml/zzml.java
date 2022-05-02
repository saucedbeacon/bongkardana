package com.google.android.gms.internal.firebase_ml;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class zzml {
    private final ConcurrentHashMap<zzmk, List<Throwable>> zzage = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzagf = new ReferenceQueue<>();

    zzml() {
    }

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.zzagf.poll();
        while (poll != null) {
            this.zzage.remove(poll);
            poll = this.zzagf.poll();
        }
        List<Throwable> list = this.zzage.get(new zzmk(th, (ReferenceQueue<Throwable>) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.zzage.putIfAbsent(new zzmk(th, this.zzagf), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
