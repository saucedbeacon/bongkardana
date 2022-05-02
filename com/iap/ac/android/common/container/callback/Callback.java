package com.iap.ac.android.common.container.callback;

public interface Callback<T> {
    void onResultFailed(int i, String str);

    void onResultSuccess(T t);
}
