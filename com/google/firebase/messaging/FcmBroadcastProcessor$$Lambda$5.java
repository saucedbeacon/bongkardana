package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class FcmBroadcastProcessor$$Lambda$5 implements Executor {
    static final Executor $instance = new FcmBroadcastProcessor$$Lambda$5();

    private FcmBroadcastProcessor$$Lambda$5() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
