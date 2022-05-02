package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class GmsRpc$$Lambda$0 implements Executor {
    static final Executor $instance = new GmsRpc$$Lambda$0();

    private GmsRpc$$Lambda$0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
