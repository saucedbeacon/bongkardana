package com.google.android.gms.internal.firebase_ml;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzmk extends WeakReference<Throwable> {
    private final int zzagd;

    public zzmk(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.zzagd = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.zzagd;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzmk zzmk = (zzmk) obj;
            return this.zzagd == zzmk.zzagd && get() == zzmk.get();
        }
    }
}
