package com.alipay.iap.android.aplog.core.logger;

import com.alipay.iap.android.aplog.log.crash.CrashLog;

public class CrashLogAbility {
    public static CrashLog makeCrashLog(String str, String str2) {
        CrashLog crashLog = new CrashLog();
        crashLog.setJavaCrash(false);
        crashLog.putExtParam("callStack", str);
        crashLog.putExtParam("crashInfo", str2);
        crashLog.putExtParam("thread", Thread.currentThread().getName());
        return crashLog;
    }
}
