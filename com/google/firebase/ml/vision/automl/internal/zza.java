package com.google.firebase.ml.vision.automl.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.ml.common.internal.modeldownload.zzx;

final /* synthetic */ class zza implements SuccessContinuation {
    private final zzx zzbcl;

    zza(zzx zzx) {
        this.zzbcl = zzx;
    }

    public final Task then(Object obj) {
        return this.zzbcl.zznx();
    }
}
