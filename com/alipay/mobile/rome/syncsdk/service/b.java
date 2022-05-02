package com.alipay.mobile.rome.syncsdk.service;

import java.util.concurrent.ThreadFactory;

final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f9426a;

    b(a aVar) {
        this.f9426a = aVar;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "Link_task_executor");
        thread.setDaemon(true);
        return thread;
    }
}
