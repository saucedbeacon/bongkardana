package com.alipay.iap.android.aplog.monitor.watchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.alipay.iap.android.aplog.api.LogHelper;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.monitor.util.ANRPerformanceLogHelper;
import com.alipay.iap.android.aplog.monitor.util.ANRUtil;
import com.alipay.iap.android.aplog.monitor.util.MonitorUtils;
import com.alipay.iap.android.aplog.util.APMTimerJob;
import com.alipay.iap.android.wallet.acl.base.Result;
import java.util.HashMap;

public class ANRWatchDog extends APMTimerJob {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10664a = ANRWatchDog.class.getSimpleName();
    private final Handler b = new Handler(Looper.getMainLooper());
    private volatile int c = 0;
    /* access modifiers changed from: private */
    public volatile int d = 0;
    private volatile int e = -1;
    private final Runnable f = new Runnable() {
        public void run() {
            ANRWatchDog aNRWatchDog = ANRWatchDog.this;
            int unused = aNRWatchDog.d = (aNRWatchDog.d + 1) % 10;
        }
    };
    private boolean g = false;

    public void doJob() {
        if (this.d != this.e || (MonitorUtils.a() && Debug.isDebuggerConnected())) {
            this.c = 0;
        } else {
            a();
        }
        this.e = this.d;
        this.b.post(this.f);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        LoggerFactory.getTraceLogger().warn(f10664a, "countCheck:1");
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        String str = f10664a;
        StringBuilder sb = new StringBuilder("waitCount:");
        sb.append(this.c);
        traceLogger.warn(str, sb.toString());
        ANRError NewMainOnly = ANRError.NewMainOnly();
        LoggerFactory.getTraceLogger().warn("automationanr", "Force Start parse for automation");
        LoggerFactory.getTraceLogger().warn(f10664a, "anr", NewMainOnly);
        LoggerFactory.getTraceLogger().warn("automationanr", "Force End parse for automation");
        String stackTraceString = Log.getStackTraceString(NewMainOnly);
        if (this.c == 0) {
            if (!ANRUtil.a(0, stackTraceString)) {
                LoggerFactory.getTraceLogger().warn(f10664a, "report nothing, invalidStack");
                ANRUtil.a();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                hashMap.put("stackFrame", stackTraceString);
                hashMap.put("anrTime", String.valueOf(currentTimeMillis));
                hashMap.put("errorCode", Result.ERROR_CODE_UNKNOWN_ERROR);
                hashMap.put("threadsTrace", ANRUtil.a());
                LogHelper.performance(ANRPerformanceLogHelper.a("APM_ANR", Result.ERROR_CODE_UNKNOWN_ERROR, hashMap));
                LoggerFactory.getTraceLogger().warn(f10664a, "report:1000");
            }
        } else if (this.c != 1) {
            ANRUtil.a();
        } else if (!ANRUtil.a(0, stackTraceString)) {
            LoggerFactory.getTraceLogger().warn(f10664a, "report nothing, invalidStack");
            ANRUtil.a();
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("stackFrame", stackTraceString);
            hashMap2.put("anrTime", String.valueOf(currentTimeMillis2));
            hashMap2.put("errorCode", "1114");
            hashMap2.put("threadsTrace", ANRUtil.a());
            LogHelper.performance(ANRPerformanceLogHelper.a("APM_ANR", "1114", hashMap2));
            LoggerFactory.getTraceLogger().warn(f10664a, "report:1114");
        }
        this.c++;
    }
}
