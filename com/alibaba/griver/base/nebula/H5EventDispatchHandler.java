package com.alibaba.griver.base.nebula;

import android.os.Handler;
import android.os.HandlerThread;

public class H5EventDispatchHandler {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f10230a;

    public static synchronized Handler getAsyncHandler() {
        Handler handler;
        synchronized (H5EventDispatchHandler.class) {
            if (f10230a == null) {
                HandlerThread handlerThread = new HandlerThread("H5EvenDispatchHandler");
                handlerThread.start();
                f10230a = new Handler(handlerThread.getLooper());
            }
            handler = f10230a;
        }
        return handler;
    }
}
