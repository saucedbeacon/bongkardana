package com.google.firebase.iid;

import java.util.concurrent.Executor;

final /* synthetic */ class FirebaseInstanceId$$Lambda$5 implements Executor {
    static final Executor $instance = new FirebaseInstanceId$$Lambda$5();

    private FirebaseInstanceId$$Lambda$5() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
