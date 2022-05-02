package com.alipay.iap.android.aplog.monitor.watchdog;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

public class ANRError extends Error {
    private static final long serialVersionUID = 1;
    private final Map<Thread, StackTraceElement[]> _stackTraces;

    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f10663a;
        /* access modifiers changed from: private */
        public final StackTraceElement[] b;

        /* renamed from: com.alipay.iap.android.aplog.monitor.watchdog.ANRError$a$a  reason: collision with other inner class name */
        class C0072a extends Throwable {
            private C0072a(C0072a aVar) {
                super(a.this.f10663a, aVar);
            }

            public Throwable fillInStackTrace() {
                setStackTrace(a.this.b);
                return this;
            }
        }

        private a(String str, StackTraceElement[] stackTraceElementArr) {
            this.f10663a = str;
            this.b = stackTraceElementArr;
        }
    }

    private ANRError(a.C0072a aVar, Map<Thread, StackTraceElement[]> map) {
        super("Application Not Responding", aVar);
        this._stackTraces = map;
    }

    public Map<Thread, StackTraceElement[]> getStackTraces() {
        return this._stackTraces;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public static ANRError NewMainOnly() {
        Thread thread = Looper.getMainLooper().getThread();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        HashMap hashMap = new HashMap(1);
        hashMap.put(thread, stackTrace);
        return new ANRError(new a.C0072a((a.C0072a) null), hashMap);
    }
}
