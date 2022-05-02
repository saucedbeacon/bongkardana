package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

final /* synthetic */ class zzx implements OnCompleteListener {
    private final Rpc zza;
    private final String zzb;
    private final ScheduledFuture zzc;

    zzx(Rpc rpc, String str, ScheduledFuture scheduledFuture) {
        this.zza = rpc;
        this.zzb = str;
        this.zzc = scheduledFuture;
    }

    public final void onComplete(Task task) {
        this.zza.zza(this.zzb, this.zzc, task);
    }
}
