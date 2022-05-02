package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class EnhancedIntentService$$Lambda$1 implements Executor {
    static final Executor $instance = new EnhancedIntentService$$Lambda$1();

    private EnhancedIntentService$$Lambda$1() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
