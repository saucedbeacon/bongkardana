package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.safetynet.zze;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzm extends zze {
    private final /* synthetic */ TaskCompletionSource zzv;

    zzm(zzl zzl, TaskCompletionSource taskCompletionSource) {
        this.zzv = taskCompletionSource;
    }

    public final void zza(Status status) {
        TaskUtil.setResultOrApiException(status, this.zzv);
    }
}
