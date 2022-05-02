package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzw implements SuccessContinuation {
    static final SuccessContinuation zza = new zzw();

    private zzw() {
    }

    public final Task then(Object obj) {
        return Rpc.zza((Bundle) obj);
    }
}
