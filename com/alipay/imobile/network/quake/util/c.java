package com.alipay.imobile.network.quake.util;

import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static long f9394a = -1;

    private c() {
    }

    public static long a() {
        long currentTimeMillis;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (currentTimeMillis2 != f9394a) {
            f9394a = currentTimeMillis2;
            return currentTimeMillis2;
        }
        synchronized (c.class) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                LoggerWrapper.e(Quake.TAG, "", e);
            }
            currentTimeMillis = System.currentTimeMillis();
            f9394a = currentTimeMillis;
        }
        return currentTimeMillis;
    }

    public static String b() {
        return d.a(a());
    }
}
