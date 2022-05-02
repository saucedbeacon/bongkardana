package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class Registrar$FIIDInternalAdapter$$Lambda$0 implements Continuation {
    static final Continuation $instance = new Registrar$FIIDInternalAdapter$$Lambda$0();

    private Registrar$FIIDInternalAdapter$$Lambda$0() {
    }

    public final Object then(Task task) {
        return ((InstanceIdResult) task.getResult()).getToken();
    }
}
