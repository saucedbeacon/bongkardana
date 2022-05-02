package com.google.android.gms.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

final /* synthetic */ class zab implements SuccessContinuation {
    static final SuccessContinuation zaa = new zab();

    private zab() {
    }

    public final Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
