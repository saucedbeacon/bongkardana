package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

final /* synthetic */ class zzom implements Runnable {
    private final Callable zzaye;
    private final TaskCompletionSource zzayf;

    zzom(Callable callable, TaskCompletionSource taskCompletionSource) {
        this.zzaye = callable;
        this.zzayf = taskCompletionSource;
    }

    public final void run() {
        zzon.zza(this.zzaye, this.zzayf);
    }
}
