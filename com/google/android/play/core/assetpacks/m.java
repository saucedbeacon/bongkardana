package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class m implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadFactory f10938a = new m();

    private m() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
