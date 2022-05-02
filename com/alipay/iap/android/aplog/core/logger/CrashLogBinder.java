package com.alipay.iap.android.aplog.core.logger;

import android.app.Application;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.LogLayoutManager;
import com.alipay.iap.android.aplog.core.layout.mas.MasCrashLog;

public class CrashLogBinder {
    public static void bind(Application application) {
        ExceptionHandler.createInstance(application);
        ExceptionHandler.getInstance().a();
        LogLayoutManager.getInstance().registerMasLog("crash", new MasCrashLog(LoggerFactory.getLogContext()));
    }

    public static void takeDown() {
        ExceptionHandler.getInstance().b();
    }
}
