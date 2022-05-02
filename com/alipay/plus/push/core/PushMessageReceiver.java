package com.alipay.plus.push.core;

public interface PushMessageReceiver<T> {
    void onMessageReceived(T t);
}
