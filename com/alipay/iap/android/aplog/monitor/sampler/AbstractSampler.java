package com.alipay.iap.android.aplog.monitor.sampler;

import com.alipay.iap.android.aplog.monitor.tools.HandlerThreadFactory;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AbstractSampler {

    /* renamed from: a  reason: collision with root package name */
    SimpleDateFormat f10657a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.getDefault());
    long b;
    /* access modifiers changed from: private */
    public AtomicBoolean c = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public Runnable d = new Runnable() {
        public void run() {
            AbstractSampler.this.c();
            if (AbstractSampler.this.c.get()) {
                HandlerThreadFactory.a().postDelayed(AbstractSampler.this.d, AbstractSampler.this.b);
            }
        }
    };

    /* access modifiers changed from: package-private */
    public abstract void c();

    public AbstractSampler(long j) {
        this.b = 0 == j ? 1000 : j;
    }

    public void a() {
        if (!this.c.get()) {
            this.c.set(true);
            HandlerThreadFactory.a().removeCallbacks(this.d);
            HandlerThreadFactory.a().postDelayed(this.d, this.b);
        }
    }

    public void b() {
        if (this.c.get()) {
            this.c.set(false);
            HandlerThreadFactory.a().removeCallbacks(this.d);
        }
    }
}
