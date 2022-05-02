package com.google.android.play.core.splitinstall;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<n> f9622a = new AtomicReference<>((Object) null);

    @Nullable
    static n a() {
        return f9622a.get();
    }

    public static void a(n nVar) {
        f9622a.compareAndSet((Object) null, nVar);
    }
}
