package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zze;

final class zzy extends zze {
    private final /* synthetic */ Rpc zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzy(Rpc rpc, Looper looper) {
        super(looper);
        this.zza = rpc;
    }

    public final void handleMessage(Message message) {
        this.zza.zza(message);
    }
}
