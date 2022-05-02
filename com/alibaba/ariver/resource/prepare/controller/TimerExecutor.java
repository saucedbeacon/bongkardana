package com.alibaba.ariver.resource.prepare.controller;

public interface TimerExecutor {
    void postDelayed(Runnable runnable, long j);

    void removeCallbacks(Runnable runnable);
}
