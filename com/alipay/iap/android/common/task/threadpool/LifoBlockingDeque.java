package com.alipay.iap.android.common.task.threadpool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class LifoBlockingDeque<E> extends LinkedBlockingDeque<E> {
    private static final long serialVersionUID = 7262784894221011657L;

    public boolean offer(E e) {
        return super.offerFirst(e);
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return super.offerFirst(e, j, timeUnit);
    }

    public boolean add(E e) {
        return super.offerFirst(e);
    }

    public void put(E e) throws InterruptedException {
        super.putFirst(e);
    }
}
