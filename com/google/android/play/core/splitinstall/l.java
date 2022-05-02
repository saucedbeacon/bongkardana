package com.google.android.play.core.splitinstall;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

public enum l implements e {
    ;
    
    private static final AtomicReference<f> b = null;

    static {
        f9621a = new l();
        b = new AtomicReference<>((Object) null);
    }

    private l() {
    }

    @Nullable
    public final f a() {
        return b.get();
    }

    public final void a(f fVar) {
        b.set(fVar);
    }
}
