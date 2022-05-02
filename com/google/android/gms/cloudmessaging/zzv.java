package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzv implements Continuation {
    private final Rpc zza;
    private final Bundle zzb;

    zzv(Rpc rpc, Bundle bundle) {
        this.zza = rpc;
        this.zzb = bundle;
    }

    public final Object then(Task task) {
        return this.zza.zza(this.zzb, task);
    }
}
