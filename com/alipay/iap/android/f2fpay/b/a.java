package com.alipay.iap.android.f2fpay.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f9304a;
    private Handler b = new Handler(Looper.getMainLooper());
    private b c;

    /* renamed from: com.alipay.iap.android.f2fpay.b.a$a  reason: collision with other inner class name */
    public static abstract class C0012a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private a f9305a;

        private void a() {
            a aVar = this.f9305a;
            if (aVar != null) {
                aVar.b(this);
                onScheduleFinish();
            }
        }

        public void bindTimer(a aVar) {
            this.f9305a = aVar;
        }

        public abstract void call();

        public abstract int nextDelayMillSeconds();

        public void onScheduleFinish() {
        }

        public void reset() {
        }

        public void run() {
            a();
            call();
        }
    }

    static class b extends HandlerThread {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Handler f9306a;

        private b() {
            super("TaskHandlerThread");
        }

        /* access modifiers changed from: private */
        public synchronized void a() {
            if (this.f9306a == null) {
                this.f9306a = new Handler(getLooper());
            }
        }
    }

    private a() {
    }

    public static a a() {
        if (f9304a == null) {
            synchronized (a.class) {
                if (f9304a == null) {
                    f9304a = new a();
                }
            }
        }
        return f9304a;
    }

    public void a(C0012a aVar) {
        a(aVar, 0);
    }

    public void a(C0012a aVar, long j) {
        if (this.c == null) {
            b();
        }
        this.c.a();
        LoggerWrapper.i(F2FPayConstants.TAG, "schedule task:".concat(String.valueOf(aVar)));
        aVar.bindTimer(this);
        if (j > 0) {
            this.c.f9306a.postDelayed(aVar, j);
        } else {
            this.c.f9306a.post(aVar);
        }
    }

    public void a(Runnable runnable) {
        this.b.post(runnable);
    }

    public void b() {
        if (this.c == null) {
            b bVar = new b();
            this.c = bVar;
            bVar.start();
        }
    }

    public void b(C0012a aVar) {
        a(aVar, (long) aVar.nextDelayMillSeconds());
        aVar.onScheduleFinish();
    }

    public void c(C0012a aVar) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a();
            this.c.f9306a.removeCallbacks(aVar);
            aVar.reset();
            LoggerWrapper.i(F2FPayConstants.TAG, "cancel task:".concat(String.valueOf(aVar)));
        }
    }
}
