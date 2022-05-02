package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.cn;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class v implements cn<Executor> {
    public static Executor b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(m.f10938a);
        bq.b(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    public final /* synthetic */ Object a() {
        return b();
    }
}
