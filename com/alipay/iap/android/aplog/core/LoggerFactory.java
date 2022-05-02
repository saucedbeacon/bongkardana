package com.alipay.iap.android.aplog.core;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.aplog.api.InitParams;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.api.ProcessInfo;
import com.alipay.iap.android.aplog.core.appender.AppenderManager;
import com.alipay.iap.android.aplog.core.layout.LogLayoutManager;
import com.alipay.iap.android.aplog.core.layout.mas.MasAliveReportLog;
import com.alipay.iap.android.aplog.core.layout.mas.MasApmLog;
import com.alipay.iap.android.aplog.core.layout.mas.MasAutoBehaviourLog;
import com.alipay.iap.android.aplog.core.layout.mas.MasExceptionLog;
import com.alipay.iap.android.aplog.core.layout.mas.MasManualBehaviourLog;
import com.alipay.iap.android.aplog.core.layout.mas.MasPerformanceLog;
import com.alipay.iap.android.aplog.core.layout.mas.MasSPMLog;
import com.alipay.iap.android.aplog.core.layout.mas.MasTraceLog;
import com.alipay.iap.android.aplog.core.logger.InnerTraceLoggerImpl;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.core.logger.TraceLoggerImpl;
import com.alipay.iap.android.aplog.core.os.LogLifecycleCallback;
import com.alipay.iap.android.aplog.core.uploader.UserDiagnostician;
import com.alipay.iap.android.aplog.misc.APLogConfigFacade;
import com.alipay.iap.android.aplog.util.HybridEncryption;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.aplog.util.ServiceUtil;
import java.lang.reflect.Method;

public class LoggerFactory {
    public static final String LOG_SPLITER = "\\$\\$";
    public static final String TAG = "LoggerFactory";
    private static AppenderManager appenderManager;
    private static TraceLogger innerTraceLogger;
    private static LogContext logContext;
    private static ProcessInfo processInfo;
    private static TraceLogger traceLogger;

    public static void init(Application application) {
        traceLogger = new TraceLoggerImpl();
        innerTraceLogger = new InnerTraceLoggerImpl();
        processInfo = new ProcessInfoImpl(application);
        logContext = new LogContextImpl(application);
        HybridEncryption.createInstance((Context) application);
        appenderManager = AppenderManager.getInstance();
        APLogConfigFacade.getInstance().init(application);
        LogLayoutManager.createInstance();
        registerMasLog();
        application.registerActivityLifecycleCallbacks(new LogLifecycleCallback(application));
        initCrashLog(application);
        UserDiagnostician.createInstance(application);
    }

    public static void init(Application application, String str, String str2) {
        traceLogger = new TraceLoggerImpl();
        innerTraceLogger = new InnerTraceLoggerImpl();
        processInfo = new ProcessInfoImpl(application);
        logContext = new LogContextImpl(application);
        HybridEncryption.createInstance(str2);
        appenderManager = AppenderManager.getInstance();
        APLogConfigFacade.getInstance().init(application);
        LogLayoutManager.createInstance();
        registerMasLog();
        application.registerActivityLifecycleCallbacks(new LogLifecycleCallback(application));
        initCrashLog(application);
        UserDiagnostician.createInstance(application, str);
    }

    private static void initToolsProcessIfNeeded(Application application, @NonNull InitParams initParams) {
        if (getProcessInfo().isMainProcess()) {
            StringBuilder sb = new StringBuilder();
            sb.append(application.getPackageName());
            sb.append(LogContext.ACTION_INIT_TOOLS_PROCESS);
            Intent intent = new Intent(sb.toString());
            Bundle bundle = new Bundle();
            bundle.putParcelable("initParams", initParams);
            intent.putExtras(bundle);
            ServiceUtil.startForegroundService(application, intent);
        }
    }

    public static void initLater(Application application, @NonNull InitParams initParams) {
        if (TextUtils.isEmpty(initParams.appId) || TextUtils.isEmpty(initParams.publicKey)) {
            init(application);
        } else {
            init(application, initParams.appId, initParams.publicKey);
        }
        LoggingUtil.setDebuggable(initParams.isDebugable);
        getLogContext().setLogHost(initParams.host);
        getLogContext().setLogConfigHost(initParams.configHost);
        getLogContext().setProductID(initParams.productId);
        initToolsProcessIfNeeded(application, initParams);
        getLogContext().setUserID(initParams.userId);
    }

    private static void registerMasLog() {
        LogLayoutManager.getInstance().registerMasLog(LogCategory.LOG_BEHAVIOUR_AUTO, new MasAutoBehaviourLog(logContext));
        LogLayoutManager.getInstance().registerMasLog(LogCategory.LOG_BEHAVIOUR_MANUAL, new MasManualBehaviourLog(logContext));
        LogLayoutManager.getInstance().registerMasLog(LogCategory.LOG_ALIVEREPORT, new MasAliveReportLog(logContext));
        LogLayoutManager.getInstance().registerMasLog(LogCategory.LOG_SPM, new MasSPMLog(logContext));
        MasPerformanceLog masPerformanceLog = new MasPerformanceLog(logContext);
        LogLayoutManager.getInstance().registerMasLog("performance", masPerformanceLog);
        LogLayoutManager.getInstance().registerMasLog(LogCategory.LOG_CATEGORY_HIGHAVAIL, masPerformanceLog);
        LogLayoutManager.getInstance().registerMasLog(LogCategory.LOG_CATEGORY_APM, new MasApmLog(logContext));
        LogLayoutManager.getInstance().registerMasLog("applog", new MasTraceLog());
        LogLayoutManager.getInstance().registerMasLog("exception", new MasExceptionLog(logContext));
    }

    private static void initCrashLog(Application application) {
        try {
            Method declaredMethod = Class.forName("com.alipay.iap.android.aplog.core.logger.CrashLogBinder").getDeclaredMethod("bind", new Class[]{Application.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke((Object) null, new Object[]{application});
        } catch (Exception e) {
            getTraceLogger().error(TAG, TextUtils.isEmpty(e.getMessage()) ? "init crashLog fail" : e.getMessage());
        }
    }

    public static LogContext getLogContext() {
        return logContext;
    }

    public static ProcessInfo getProcessInfo() {
        return processInfo;
    }

    public static synchronized TraceLogger getTraceLogger() {
        TraceLogger traceLogger2;
        synchronized (LoggerFactory.class) {
            traceLogger2 = traceLogger;
        }
        return traceLogger2;
    }

    public static synchronized TraceLogger getInnerTraceLogger() {
        TraceLogger traceLogger2;
        synchronized (LoggerFactory.class) {
            traceLogger2 = innerTraceLogger;
        }
        return traceLogger2;
    }

    public static AppenderManager getAppenderManager() {
        return appenderManager;
    }
}
