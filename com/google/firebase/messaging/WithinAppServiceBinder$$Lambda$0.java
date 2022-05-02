package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class WithinAppServiceBinder$$Lambda$0 implements Executor {
    static final Executor $instance = new WithinAppServiceBinder$$Lambda$0();

    private WithinAppServiceBinder$$Lambda$0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
