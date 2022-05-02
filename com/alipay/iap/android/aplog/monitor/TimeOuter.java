package com.alipay.iap.android.aplog.monitor;

import com.alipay.iap.android.aplog.monitor.tools.HandlerThreadFactory;

public abstract class TimeOuter {

    /* renamed from: a  reason: collision with root package name */
    protected long f10653a;
    protected long b = 0;
    private Runnable c = new Runnable() {
        public void run() {
            TimeOuter.this.a();
        }
    };

    /* access modifiers changed from: package-private */
    public abstract void a();

    public TimeOuter(long j) {
        if (0 == j) {
            this.f10653a = 1000;
        }
        this.f10653a = j;
    }

    public void b() {
        HandlerThreadFactory.a().removeCallbacks(this.c);
        HandlerThreadFactory.a().postDelayed(this.c, this.f10653a);
    }

    public void c() {
        HandlerThreadFactory.a().removeCallbacks(this.c);
    }
}
