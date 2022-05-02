package com.google.android.gms.cloudmessaging;

import android.os.Handler;
import android.os.Message;

final /* synthetic */ class zzi implements Handler.Callback {
    private final zzf zza;

    zzi(zzf zzf) {
        this.zza = zzf;
    }

    public final boolean handleMessage(Message message) {
        return this.zza.zza(message);
    }
}
