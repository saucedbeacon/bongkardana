package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

public class CancellationTokenSource {
    private final zza zza = new zza();

    @NonNull
    public CancellationToken getToken() {
        return this.zza;
    }

    public void cancel() {
        this.zza.zza();
    }
}
