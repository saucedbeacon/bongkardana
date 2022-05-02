package com.alipay.plus.push.core;

public interface ICallback<T> {
    void onFailed(String str, String str2);

    void onSuccess(T t);
}
