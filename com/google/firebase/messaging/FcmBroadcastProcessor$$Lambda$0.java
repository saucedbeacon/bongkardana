package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class FcmBroadcastProcessor$$Lambda$0 implements Executor {
    static final Executor $instance = new FcmBroadcastProcessor$$Lambda$0();

    private FcmBroadcastProcessor$$Lambda$0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
