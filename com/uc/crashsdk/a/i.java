package com.uc.crashsdk.a;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static volatile HandlerThread f9872a;
    static volatile HandlerThread b;
    static Handler c;
    static Handler d;
    /* access modifiers changed from: private */
    public static HashMap<Object, a> e = new HashMap<>();

    public static boolean a(int i, Runnable runnable, long j) {
        Handler handler;
        StringBuilder sb = new StringBuilder("ThreadManager.post: ");
        sb.append(runnable);
        sb.append(", type: ");
        sb.append(i);
        sb.append(", delay: ");
        sb.append(j);
        sb.append("ms");
        c.a(sb.toString());
        if (runnable == null) {
            return false;
        }
        if (i == 0) {
            if (f9872a == null) {
                b();
            }
            handler = c;
        } else if (i == 1) {
            if (b == null) {
                c();
            }
            handler = d;
        } else {
            throw new RuntimeException("unknown thread type: ".concat(String.valueOf(i)));
        }
        if (handler == null) {
            return false;
        }
        j jVar = new j(runnable);
        synchronized (e) {
            e.put(runnable, new a(jVar, i));
        }
        return handler.postDelayed(jVar, j);
    }

    public static boolean a(int i, Runnable runnable) {
        return a(i, runnable, 0);
    }

    public static void a(Runnable runnable) {
        a aVar;
        c.a("ThreadManager.remove: ".concat(String.valueOf(runnable)));
        if (runnable != null) {
            synchronized (e) {
                aVar = e.get(runnable);
            }
            if (aVar != null) {
                StringBuilder sb = new StringBuilder("found task in cache, item: ");
                sb.append(aVar);
                sb.append(", type: ");
                sb.append(aVar.b);
                c.a(sb.toString());
                Handler handler = null;
                int i = aVar.b;
                if (i == 0) {
                    handler = c;
                } else if (i == 1) {
                    handler = d;
                }
                if (handler != null) {
                    handler.removeCallbacks(aVar.f9873a);
                }
                synchronized (e) {
                    if (e.get(runnable) != null) {
                        e.remove(runnable);
                    }
                }
            }
        }
    }

    public static boolean b(Runnable runnable) {
        a aVar;
        if (runnable == null) {
            return false;
        }
        synchronized (e) {
            aVar = e.get(runnable);
        }
        if (aVar != null) {
            return true;
        }
        return false;
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public Runnable f9873a;
        public int b;

        public a(Runnable runnable, int i) {
            this.f9873a = runnable;
            this.b = i;
        }
    }

    private static synchronized void b() {
        synchronized (i.class) {
            if (f9872a == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
                f9872a = handlerThread;
                handlerThread.start();
                c = new Handler(f9872a.getLooper());
            }
        }
    }

    private static synchronized void c() {
        synchronized (i.class) {
            if (b == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
                b = handlerThread;
                handlerThread.start();
                d = new Handler(b.getLooper());
            }
        }
    }
}
