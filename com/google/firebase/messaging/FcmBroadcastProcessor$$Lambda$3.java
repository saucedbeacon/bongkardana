package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class FcmBroadcastProcessor$$Lambda$3 implements Executor {
    static final Executor $instance = new FcmBroadcastProcessor$$Lambda$3();

    private FcmBroadcastProcessor$$Lambda$3() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
