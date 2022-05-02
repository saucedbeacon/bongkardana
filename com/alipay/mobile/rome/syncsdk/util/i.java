package com.alipay.mobile.rome.syncsdk.util;

import java.util.concurrent.ThreadFactory;

final class i implements ThreadFactory {
    private i() {
    }

    /* synthetic */ i(byte b) {
        this();
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("sync_receive:");
        sb.append(thread.getId());
        thread.setName(sb.toString());
        thread.setPriority(5);
        return thread;
    }
}
