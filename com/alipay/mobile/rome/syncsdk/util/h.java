package com.alipay.mobile.rome.syncsdk.util;

import java.util.concurrent.ThreadFactory;

final class h implements ThreadFactory {
    private h() {
    }

    /* synthetic */ h(byte b) {
        this();
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("sync_dispatch:");
        sb.append(thread.getId());
        thread.setName(sb.toString());
        thread.setPriority(5);
        return thread;
    }
}
