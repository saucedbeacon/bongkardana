package com.iap.ac.config.lite.common;

public interface ICancelableTask {
    void cancel();

    boolean isCanceled();
}
