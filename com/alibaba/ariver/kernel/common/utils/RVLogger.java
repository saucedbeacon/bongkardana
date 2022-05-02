package com.alibaba.ariver.kernel.common.utils;

import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.kernel.common.RVProxy;

public class RVLogger {

    /* renamed from: a  reason: collision with root package name */
    private static final int f9028a = 7;
    private static Proxy b = new Proxy() {
        public final void d(String str, String str2) {
        }

        public final void debug(String str, String str2) {
        }

        public final void e(String str, String str2, Throwable th) {
        }

        public final void w(String str, String str2, Throwable th) {
        }
    };

    public interface Proxy extends Proxiable {
        void d(String str, String str2);

        void debug(String str, String str2);

        void e(String str, String str2, Throwable th);

        void w(String str, String str2, Throwable th);
    }

    public static String makeLogTag(String str) {
        if (str.length() <= 23 - f9028a) {
            return "Ariver_".concat(String.valueOf(str));
        }
        StringBuilder sb = new StringBuilder("Ariver_");
        sb.append(str.substring(0, (23 - f9028a) - 1));
        return sb.toString();
    }

    public static void printPerformanceLog(String str, String str2) {
        Proxy proxy = (Proxy) RVProxy.get(Proxy.class, true);
        if (proxy != null) {
            StringBuilder sb = new StringBuilder("[Thread:");
            sb.append(Thread.currentThread().getName());
            sb.append("] [Stage:");
            sb.append(str);
            sb.append("] [Info:");
            sb.append(str2);
            sb.append("] [TimeStamp:");
            sb.append(System.currentTimeMillis());
            sb.append("]");
            proxy.e("AriverPerformance", sb.toString(), (Throwable) null);
        }
    }

    public static String makeLogTag(Class cls) {
        return makeLogTag(cls.getSimpleName());
    }

    private static Proxy a() {
        Proxy proxy = (Proxy) RVProxy.get(Proxy.class, true);
        if (proxy != null) {
            return proxy;
        }
        return b;
    }

    public static void d(String str) {
        try {
            d("RVLogger", str);
        } catch (Throwable th) {
            e("RVLogger exception: ".concat(String.valueOf(th)));
        }
    }

    public static void d(String str, String str2) {
        if (!isEmpty(str2)) {
            try {
                a().d(str, str2);
            } catch (Throwable th) {
                e("RVLogger exception: ".concat(String.valueOf(th)));
            }
        }
    }

    public static void w(String str) {
        try {
            w("RVLogger", str);
        } catch (Throwable th) {
            e("RVLogger exception: ".concat(String.valueOf(th)));
        }
    }

    public static void w(String str, String str2) {
        if (!isEmpty(str2)) {
            try {
                a().w(str, str2, (Throwable) null);
            } catch (Throwable th) {
                e("RVLogger exception: ".concat(String.valueOf(th)));
            }
        }
    }

    public static void w(String str, String str2, Throwable th) {
        try {
            a().w(str, str2, th);
        } catch (Throwable th2) {
            e("RVLogger exception: ".concat(String.valueOf(th2)));
        }
    }

    public static void e(String str) {
        while (true) {
            try {
                e("RVLogger", str, (Throwable) null);
                break;
            } catch (Throwable th) {
                str = "RVLogger exception: ".concat(String.valueOf(th));
            }
        }
    }

    public static void e(String str, String str2) {
        try {
            e(str, str2, (Throwable) null);
        } catch (Throwable th) {
            e("RVLogger exception: ".concat(String.valueOf(th)));
        }
    }

    public static void e(String str, Throwable th) {
        try {
            e("RVLogger", str, th);
        } catch (Throwable th2) {
            e("RVLogger exception: ".concat(String.valueOf(th2)));
        }
    }

    public static void e(String str, String str2, Throwable th) {
        try {
            a().e(str, str2, th);
        } catch (Throwable th2) {
            e("RVLogger exception: ".concat(String.valueOf(th2)));
        }
    }

    public static void debug(String str, String str2) {
        if (!isEmpty(str2)) {
            try {
                a().debug(str, str2);
            } catch (Throwable th) {
                e("RVLogger exception: ".concat(String.valueOf(th)));
            }
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }
}
