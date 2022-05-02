package com.alipay.mobile.security.bio.thread;

public abstract class WatchThread extends Thread {
    public static final ThreadGroup tg = new ThreadGroup("watch-thread");
    private boolean alive = true;
    private String status = null;

    /* access modifiers changed from: protected */
    public abstract void task();

    public WatchThread(String str) {
        super(tg, str);
        setDaemon(true);
    }

    public void kill() {
        this.alive = false;
    }

    public void run() {
        while (this.alive) {
            try {
                task();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setStatus(String str) {
        this.status = str;
    }

    public String getStatus() {
        return this.status;
    }
}
