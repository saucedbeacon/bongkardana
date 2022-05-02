package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TaskCompletionSource<TResult> {
    /* access modifiers changed from: private */
    public final zzu<TResult> zza = new zzu<>();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }

    public void setResult(@Nullable TResult tresult) {
        this.zza.zza(tresult);
    }

    public boolean trySetResult(@Nullable TResult tresult) {
        return this.zza.zzb(tresult);
    }

    public void setException(@NonNull Exception exc) {
        this.zza.zza(exc);
    }

    public boolean trySetException(@NonNull Exception exc) {
        return this.zza.zzb(exc);
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.zza;
    }
}
