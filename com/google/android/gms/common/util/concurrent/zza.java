package com.google.android.gms.common.util.concurrent;

import android.os.Process;

final class zza implements Runnable {
    private final Runnable zza;
    private final int zzb;

    public zza(Runnable runnable, int i) {
        this.zza = runnable;
        this.zzb = i;
    }

    public final void run() {
        Process.setThreadPriority(this.zzb);
        this.zza.run();
    }
}
