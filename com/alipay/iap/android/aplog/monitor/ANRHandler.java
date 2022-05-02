package com.alipay.iap.android.aplog.monitor;

import android.content.Context;
import android.os.Build;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.monitor.watchdog.ANRWatchDog;
import com.alipay.iap.android.aplog.util.APMTimer;
import com.alipay.iap.android.wallet.acl.base.Result;
import java.util.concurrent.TimeUnit;

public class ANRHandler {

    /* renamed from: a  reason: collision with root package name */
    private static ANRWatchDog f10650a = null;
    private static ANRMonitor b = null;
    private static ANRMonitor c = null;
    private static boolean d = false;
    private static int e = -1;

    static {
        try {
            if ("MI MAX 2".equalsIgnoreCase(Build.MODEL)) {
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ANRHandler", th);
        }
    }

    public static void a(Context context) {
        try {
            if (d) {
                if (b == null) {
                    b = new ANRMonitorImpl(5000, Result.ERROR_CODE_UNKNOWN_ERROR);
                }
                if (c == null) {
                    c = new LagMonitorImpl(1000, "1100");
                }
                b.e();
                c.e();
                e = 1;
            } else {
                if (f10650a == null) {
                    f10650a = new ANRWatchDog();
                    APMTimer.getInstance().register(f10650a, 0, TimeUnit.SECONDS.toMillis(5));
                }
                e = 0;
            }
            LoggerFactory.getTraceLogger().info("ANRHandler", "startAnrWatch");
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("ANRHandler", th);
        }
    }

    public static void a() {
        try {
            if (e == 1) {
                if (b != null) {
                    b.g();
                }
                if (c != null) {
                    c.g();
                }
            } else if (e == 0 && f10650a != null) {
                APMTimer.getInstance().unregister(f10650a);
                f10650a = null;
            }
            LoggerFactory.getTraceLogger().info("ANRHandler", "stopAnrWatch");
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("ANRHandler", th);
        }
    }
}
