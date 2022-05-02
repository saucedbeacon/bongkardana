package com.iap.ac.android.loglite.config;

import androidx.annotation.VisibleForTesting;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.iap.ac.android.loglite.core.CrashReporter;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigurationManager {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, LogStrategyInfo> f9729a = new ConcurrentHashMap();
    public String b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public boolean g = true;

    public final void a() {
        CrashReporter crashReporter;
        LogStrategyInfo logStrategyInfo = this.f9729a.get("crash");
        if (logStrategyInfo == null || !logStrategyInfo.isWrite) {
            crashReporter = CrashReporter.c;
            if (crashReporter != null) {
                synchronized (crashReporter) {
                    if (crashReporter.b) {
                        Thread.setDefaultUncaughtExceptionHandler(crashReporter.f9735a);
                        crashReporter.b = false;
                    }
                }
            } else {
                throw new IllegalStateException("need init befor use");
            }
        } else {
            crashReporter = CrashReporter.c;
            if (crashReporter != null) {
                synchronized (crashReporter) {
                    if (!crashReporter.b) {
                        crashReporter.f9735a = Thread.getDefaultUncaughtExceptionHandler();
                        Thread.setDefaultUncaughtExceptionHandler(crashReporter);
                        crashReporter.b = true;
                    }
                }
            } else {
                throw new IllegalStateException("need init befor use");
            }
        }
    }

    public boolean b(String str, String str2) {
        LogStrategyInfo a2 = a(str, str2);
        if (a2 != null) {
            return a2.isWrite;
        }
        return true;
    }

    public boolean a(String str, int i, String str2) {
        int i2;
        int i3 = ("crash".equals(str) || LogCategory.LOG_CATEGORY_HIGHAVAIL.equals(str)) ? 1 : "performance".equals(str) ? 10 : 20;
        LogStrategyInfo a2 = a(str, str2);
        if (a2 != null && (i2 = a2.maxLogCount) > 0) {
            i3 = i2;
        }
        if (i >= i3) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public LogStrategyInfo a(String str, String str2) {
        LogStrategyInfo logStrategyInfo = this.f9729a.get(str2);
        if (logStrategyInfo != null) {
            return logStrategyInfo;
        }
        Iterator<String> it = this.f9729a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (BizCodeMatchUtils.a(next, str2)) {
                logStrategyInfo = this.f9729a.get(next);
                break;
            }
        }
        if (logStrategyInfo != null) {
            return logStrategyInfo;
        }
        return this.f9729a.get(str);
    }
}
