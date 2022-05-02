package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzt implements Continuation {
    static final Continuation zza = new zzt();

    private zzt() {
    }

    public final Object then(Task task) {
        return Rpc.zza(task);
    }
}
