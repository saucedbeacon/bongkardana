package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzih extends WeakReference<Throwable> {
    private final int zza;

    public zzih(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.zza = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzih zzih = (zzih) obj;
            return this.zza == zzih.zza && get() == zzih.get();
        }
    }

    public final int hashCode() {
        return this.zza;
    }
}
