package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class GmsRpc$$Lambda$1 implements Continuation {
    private final GmsRpc arg$1;

    GmsRpc$$Lambda$1(GmsRpc gmsRpc) {
        this.arg$1 = gmsRpc;
    }

    public final Object then(Task task) {
        return this.arg$1.lambda$extractResponseWhenComplete$0$GmsRpc(task);
    }
}
