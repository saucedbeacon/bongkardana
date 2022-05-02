package com.alipay.mobile.rome.syncsdk.service;

import java.util.concurrent.ThreadFactory;

final class j implements ThreadFactory {
    j() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("longlink_timer");
        return thread;
    }
}
