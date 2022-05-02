package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.cn;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class p implements cn<Executor> {
    public static Executor b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(l.f10937a);
        bq.b(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    public final /* synthetic */ Object a() {
        return b();
    }
}
