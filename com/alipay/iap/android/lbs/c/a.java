package com.alipay.iap.android.lbs.c;

import android.os.Handler;
import android.os.Looper;
import com.alipay.iap.android.lbs.LBSLocationErrorCode;
import com.alipay.iap.android.lbs.b.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Handler f9336a = new Handler(Looper.getMainLooper());
    private long b;
    private C0014a c;

    /* renamed from: com.alipay.iap.android.lbs.c.a$a  reason: collision with other inner class name */
    static class C0014a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private b f9337a;
        private boolean b = false;

        public C0014a(b bVar) {
            this.f9337a = bVar;
        }

        public void a() {
            this.b = true;
        }

        public boolean b() {
            return this.b;
        }

        public void run() {
            b bVar;
            if (!b() && (bVar = this.f9337a) != null) {
                bVar.a(LBSLocationErrorCode.LocationErrorTimeout);
                this.b = true;
            }
        }
    }

    public a(long j, b bVar) {
        this.b = j;
        this.c = new C0014a(bVar);
    }

    public void a() {
        long j = this.b;
        if (j > 0) {
            this.f9336a.postDelayed(this.c, j);
        }
    }

    public void b() {
        this.c.a();
    }
}
