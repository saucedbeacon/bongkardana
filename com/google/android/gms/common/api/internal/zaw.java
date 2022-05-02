package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zaw implements OnCompleteListener<TResult> {
    private final /* synthetic */ TaskCompletionSource zaa;
    private final /* synthetic */ zav zab;

    zaw(zav zav, TaskCompletionSource taskCompletionSource) {
        this.zab = zav;
        this.zaa = taskCompletionSource;
    }

    public final void onComplete(@NonNull Task<TResult> task) {
        this.zab.zab.remove(this.zaa);
    }
}
