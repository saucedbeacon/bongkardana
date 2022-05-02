package com.alibaba.ariver.kernel.common;

import java.util.concurrent.atomic.AtomicInteger;

public class RefAware<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f10089a = new AtomicInteger(0);
    private final T b;

    public RefAware(T t) {
        this.b = t;
    }

    public T get() {
        return this.b;
    }

    public void incrementRef() {
        this.f10089a.incrementAndGet();
    }

    public boolean decrementRef() {
        if (this.f10089a.get() == 0 || this.f10089a.decrementAndGet() == 0) {
            return true;
        }
        return false;
    }
}
