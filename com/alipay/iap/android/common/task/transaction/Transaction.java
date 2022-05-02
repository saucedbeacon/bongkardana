package com.alipay.iap.android.common.task.transaction;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Transaction implements Runnable {
    private static final AtomicInteger sCount = new AtomicInteger(0);

    /* renamed from: id  reason: collision with root package name */
    final String f10667id;

    public Transaction() {
        StringBuilder sb = new StringBuilder("Transaction_");
        sb.append(sCount.getAndIncrement());
        this.f10667id = sb.toString();
    }

    public final String getId() {
        return this.f10667id;
    }
}
