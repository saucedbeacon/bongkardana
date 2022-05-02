package com.alipay.mobile.rome.syncsdk.transport.c;

import java.util.concurrent.ThreadFactory;

final class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f9438a;

    c(b bVar) {
        this.f9438a = bVar;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "longlink dispatcher");
    }
}
