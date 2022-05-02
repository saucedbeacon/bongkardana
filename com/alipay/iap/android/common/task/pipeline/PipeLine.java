package com.alipay.iap.android.common.task.pipeline;

import java.util.concurrent.Executor;

public interface PipeLine {
    void addTask(Runnable runnable, String str);

    void addTask(Runnable runnable, String str, int i);

    void setExecutor(Executor executor);

    void start();

    void stop();
}
