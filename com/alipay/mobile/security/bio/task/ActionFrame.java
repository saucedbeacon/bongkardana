package com.alipay.mobile.security.bio.task;

public class ActionFrame<T> {
    private T object;

    public ActionFrame(T t) {
        this.object = t;
    }

    public T getObject() {
        return this.object;
    }
}
