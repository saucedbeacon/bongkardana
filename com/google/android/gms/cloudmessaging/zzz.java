package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

final /* synthetic */ class zzz implements Executor {
    static final Executor zza = new zzz();

    private zzz() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
