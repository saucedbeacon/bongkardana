package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.zxing.client.android.Intents;
import java.io.IOException;

final /* synthetic */ class zzu implements Runnable {
    private final TaskCompletionSource zza;

    zzu(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        this.zza.trySetException(new IOException(Intents.Scan.TIMEOUT));
    }
}
