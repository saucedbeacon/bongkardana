package com.google.android.play.core.internal;

import androidx.annotation.Nullable;
import com.google.android.play.core.tasks.i;

public abstract class ag implements Runnable {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final i<?> f9572a;

    ag() {
        this.f9572a = null;
    }

    public ag(@Nullable i<?> iVar) {
        this.f9572a = iVar;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    @Nullable
    public final i<?> b() {
        return this.f9572a;
    }

    public final void run() {
        try {
            a();
        } catch (Exception e) {
            i<?> iVar = this.f9572a;
            if (iVar != null) {
                iVar.b(e);
            }
        }
    }
}
