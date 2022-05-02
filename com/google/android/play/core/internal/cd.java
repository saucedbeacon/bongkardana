package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class cd extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f9586a;

    public cd(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f9586a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            cd cdVar = (cd) obj;
            return this.f9586a == cdVar.f9586a && get() == cdVar.get();
        }
    }

    public final int hashCode() {
        return this.f9586a;
    }
}
