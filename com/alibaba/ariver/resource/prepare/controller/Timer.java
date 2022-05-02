package com.alibaba.ariver.resource.prepare.controller;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

class Timer {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final TimeoutListener f10195a;
    private final TimerExecutor b;
    /* access modifiers changed from: private */
    public TimeoutRunnable c;

    public interface TimeoutListener {
        void onTimeout(long j);
    }

    Timer(TimeoutListener timeoutListener) {
        this(timeoutListener, new HandlerExecutor());
    }

    Timer(TimeoutListener timeoutListener, TimerExecutor timerExecutor) {
        this.c = null;
        this.f10195a = timeoutListener;
        this.b = timerExecutor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void postTimeout(long j) {
        long j2;
        if (this.c != null) {
            boolean unused = this.c.b = true;
            j2 = this.c.f10197a;
            this.b.removeCallbacks(this.c);
        } else {
            j2 = System.currentTimeMillis();
        }
        TimeoutRunnable timeoutRunnable = new TimeoutRunnable(j2);
        this.c = timeoutRunnable;
        this.b.postDelayed(timeoutRunnable, j);
    }

    /* access modifiers changed from: package-private */
    public synchronized void invalidTimeout() {
        if (this.c != null) {
            boolean unused = this.c.b = true;
            this.b.removeCallbacks(this.c);
        }
    }

    class TimeoutRunnable implements Runnable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f10197a;
        /* access modifiers changed from: private */
        public boolean b;

        private TimeoutRunnable(long j) {
            this.b = false;
            this.f10197a = j;
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis() - this.f10197a;
            RVLogger.d("AriverRes:Timer", "timer timeout on elapsed: ".concat(String.valueOf(currentTimeMillis)));
            if (!this.b) {
                if (Timer.this.f10195a != null) {
                    Timer.this.f10195a.onTimeout(currentTimeMillis);
                }
                TimeoutRunnable unused = Timer.this.c = null;
            }
        }
    }

    static class HandlerExecutor implements TimerExecutor {

        /* renamed from: a  reason: collision with root package name */
        private Handler f10196a = new Handler(Looper.getMainLooper());

        HandlerExecutor() {
        }

        public void postDelayed(Runnable runnable, long j) {
            this.f10196a.postDelayed(runnable, j);
        }

        public void removeCallbacks(Runnable runnable) {
            this.f10196a.removeCallbacks(runnable);
        }
    }
}
