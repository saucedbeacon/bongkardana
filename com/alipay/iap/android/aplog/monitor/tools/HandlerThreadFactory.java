package com.alipay.iap.android.aplog.monitor.tools;

import android.os.Handler;
import android.os.HandlerThread;

public class HandlerThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private static a f10659a = new a("loop");

    public static Handler a() {
        return f10659a.a();
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private Handler f10660a;

        public a(String str) {
            HandlerThread handlerThread = new HandlerThread("Monitor-".concat(String.valueOf(str)));
            handlerThread.start();
            this.f10660a = new Handler(handlerThread.getLooper());
        }

        public Handler a() {
            return this.f10660a;
        }
    }
}
