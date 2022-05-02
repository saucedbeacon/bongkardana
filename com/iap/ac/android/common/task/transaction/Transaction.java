package com.iap.ac.android.common.task.transaction;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Transaction implements Runnable {
    private static final AtomicInteger sCount = new AtomicInteger(0);

    /* renamed from: id  reason: collision with root package name */
    final String f11037id;

    public Transaction() {
        StringBuilder sb = new StringBuilder("Transaction_");
        sb.append(sCount.getAndIncrement());
        this.f11037id = sb.toString();
    }

    public final String getId() {
        return this.f11037id;
    }
}
