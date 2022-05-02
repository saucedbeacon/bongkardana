package com.iap.ac.android.x;

import android.os.SystemClock;
import android.text.TextUtils;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.common.account.OAuthObserver;
import com.iap.ac.android.common.account.OAuthService;
import com.iap.ac.android.common.log.ACLog;
import java.util.concurrent.ConcurrentLinkedQueue;

public class b implements OAuthObserver {
    public static volatile b d;
    public static long e;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentLinkedQueue<c> f9777a = new ConcurrentLinkedQueue<>();
    public a b;
    public String c;

    public b() {
        a aVar = new a();
        this.b = aVar;
        aVar.f9776a = -30000;
        aVar.b = 30000;
        a(System.currentTimeMillis());
        OAuthService.INSTANCE.registerOAuthEventObserver(this);
    }

    public static b b() {
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b();
                }
            }
        }
        return d;
    }

    public void a(a aVar) {
        synchronized (this) {
            this.b = aVar;
        }
    }

    public void onOAuthLogin() {
    }

    public void onOAuthLogout() {
        ACLog.i(Constants.TAG, "PaymentCodeCache, onAuthLogout");
        a();
    }

    public synchronized String a(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ACLog.i(Constants.TAG, "getValidPaymentCodeFromCache, The CodeCache code type is: ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(this.c) || !this.c.equals(str)) {
            a();
            return null;
        }
        while (!this.f9777a.isEmpty()) {
            c poll = this.f9777a.poll();
            long j = poll.b;
            a aVar = this.b;
            int i = aVar.b;
            int i2 = aVar.f9776a;
            long elapsedRealtime = SystemClock.elapsedRealtime() + e + 0 + ((long) i);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() + e + 0 + ((long) i2);
            StringBuilder sb = new StringBuilder("checkCodeValid, serverStartTime: ");
            sb.append(j);
            sb.append(",");
            sb.append(elapsedRealtime2);
            sb.append(", ");
            sb.append(elapsedRealtime);
            ACLog.i(Constants.TAG, sb.toString());
            if (j <= elapsedRealtime2 || j >= elapsedRealtime) {
                ACLog.i(Constants.TAG, "checkCodeValid, The payment code is not valid");
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return poll.f9778a;
            }
        }
        a();
        return null;
    }

    public synchronized void a(String str, ConcurrentLinkedQueue<c> concurrentLinkedQueue) {
        if (concurrentLinkedQueue != null) {
            if (concurrentLinkedQueue.size() > 0) {
                this.c = str;
                this.f9777a.addAll(concurrentLinkedQueue);
                return;
            }
        }
        ACLog.e(Constants.TAG, "addPaymentCodeToCache error, paymentCodeEntityList is null");
    }

    public synchronized void a() {
        this.f9777a.clear();
    }

    public void a(long j) {
        e = j - SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder("setServerTime, serverTime: ");
        sb.append(j);
        sb.append(", clientTime: ");
        sb.append(System.currentTimeMillis());
        ACLog.i(Constants.TAG, sb.toString());
    }
}
