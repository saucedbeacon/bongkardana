package com.iap.ac.android.loglite.interceptor;

import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.storage.AnalyticsStorageManager;

public class InterceptorManager {
    public static void registerLoggerInterceptor(LoggerInterceptor loggerInterceptor) {
        AnalyticsStorageManager storageManager = AnalyticsContext.getInstance().getStorageManager();
        if (loggerInterceptor != null) {
            storageManager.b.add(loggerInterceptor);
        }
    }

    public static void removeLoggerInterceptor(LoggerInterceptor loggerInterceptor) {
        AnalyticsStorageManager storageManager = AnalyticsContext.getInstance().getStorageManager();
        if (loggerInterceptor != null) {
            storageManager.b.remove(loggerInterceptor);
        }
    }
}
