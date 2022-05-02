package com.alipay.iap.android.aplog.core.logger;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.crash.CrashLog;
import com.alipay.iap.android.aplog.util.CrashCombineUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.lang.Thread;
import java.util.HashMap;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static ExceptionHandler f9299a;
    /* access modifiers changed from: private */
    public Thread.UncaughtExceptionHandler b;
    private Application c;
    private Runnable d;
    private boolean e;
    private boolean f = false;

    private ExceptionHandler(final Application application) {
        this.c = application;
        this.d = new Runnable() {
            public void run() {
                NativeCrashHandler.initialize(application);
                Thread.UncaughtExceptionHandler unused = ExceptionHandler.this.b = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(ExceptionHandler.this);
            }
        };
    }

    public static synchronized ExceptionHandler createInstance(Application application) {
        ExceptionHandler exceptionHandler;
        synchronized (ExceptionHandler.class) {
            if (f9299a == null) {
                f9299a = new ExceptionHandler(application);
            }
            exceptionHandler = f9299a;
        }
        return exceptionHandler;
    }

    public static ExceptionHandler getInstance() {
        ExceptionHandler exceptionHandler = f9299a;
        if (exceptionHandler != null) {
            return exceptionHandler;
        }
        throw new IllegalStateException("need createInstance befor use");
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.e) {
            this.e = true;
            this.f = true;
            if (LoggerFactory.getProcessInfo().isMainProcess()) {
                NativeCrashHandler.ENANBLE_JAVA_LOG = true;
                NativeCrashHandler.ENABLE_UNEXP_LOG = true;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                NativeCrashHandler.initialize(this.c);
                this.b = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(this);
            } else if (this.d != null) {
                new Handler(Looper.getMainLooper()).post(this.d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f = false;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        Throwable th2;
        if (this.f) {
            CrashLog crashLog = new CrashLog();
            if ("NegligibleThrowable".equals(th.getMessage())) {
                th2 = th.getCause();
                z = true;
            } else {
                th2 = th;
                z = false;
            }
            if (LoggerFactory.getProcessInfo().isMainProcess()) {
                LoggerFactory.getTraceLogger().debug("ExceptionHandler", "enter uncaughtException.");
                if (th2 != null && !z) {
                    crashLog.setEx(th);
                    crashLog.setThreadName(thread.getName());
                    crashLog.putExtParam(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, this.c.getPackageName());
                }
                try {
                    if (a(th)) {
                        Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) this.c.getSystemService(AkuEventParamsKey.KEY_ACTIVITY)).getProcessMemoryInfo(new int[]{Process.myPid()});
                        if (processMemoryInfo.length > 0) {
                            Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
                            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                            StringBuilder sb = new StringBuilder("totalProportional: ");
                            sb.append(Debug.getPss());
                            traceLogger.info("OOMException", sb.toString());
                            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                            StringBuilder sb2 = new StringBuilder("dalvikHeapAlloc: ");
                            sb2.append(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
                            traceLogger2.info("OOMException", sb2.toString());
                            TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                            StringBuilder sb3 = new StringBuilder("totalPss: ");
                            sb3.append(memoryInfo.getTotalPss());
                            traceLogger3.info("OOMException", sb3.toString());
                            TraceLogger traceLogger4 = LoggerFactory.getTraceLogger();
                            StringBuilder sb4 = new StringBuilder("dalvikPss: ");
                            sb4.append(memoryInfo.dalvikPss);
                            traceLogger4.info("OOMException", sb4.toString());
                            TraceLogger traceLogger5 = LoggerFactory.getTraceLogger();
                            StringBuilder sb5 = new StringBuilder("nativePss: ");
                            sb5.append(memoryInfo.nativePss);
                            traceLogger5.info("OOMException", sb5.toString());
                            TraceLogger traceLogger6 = LoggerFactory.getTraceLogger();
                            StringBuilder sb6 = new StringBuilder("otherPss: ");
                            sb6.append(memoryInfo.otherPss);
                            traceLogger6.info("OOMException", sb6.toString());
                            new HashMap();
                            StringBuilder sb7 = new StringBuilder("");
                            sb7.append(Debug.getPss());
                            crashLog.putExtParam("totalProportional", sb7.toString());
                            StringBuilder sb8 = new StringBuilder("");
                            sb8.append(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
                            crashLog.putExtParam("dalvikHeapAlloc", sb8.toString());
                            StringBuilder sb9 = new StringBuilder("");
                            sb9.append(memoryInfo.getTotalPss());
                            crashLog.putExtParam("totalPss", sb9.toString());
                            StringBuilder sb10 = new StringBuilder("");
                            sb10.append(memoryInfo.dalvikPss);
                            crashLog.putExtParam("dalvikPss", sb10.toString());
                            StringBuilder sb11 = new StringBuilder("");
                            sb11.append(memoryInfo.nativePss);
                            crashLog.putExtParam("nativePss", sb11.toString());
                            StringBuilder sb12 = new StringBuilder("");
                            sb12.append(memoryInfo.otherPss);
                            crashLog.putExtParam("otherPss", sb12.toString());
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (!TextUtils.isEmpty(crashLog.getStackTrace())) {
                LoggerFactory.getLogContext().syncAppendLog(crashLog);
            }
            LoggerFactory.getLogContext().flush(true);
            th = th2;
        }
        try {
            this.b.uncaughtException(thread, th);
        } catch (Throwable unused2) {
        }
    }

    private boolean a(Throwable th) {
        if (th == null) {
            return false;
        }
        while (th != null) {
            if (th instanceof RuntimeException) {
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message) && message.contains("InputChannel is not initialized.")) {
                    return true;
                }
            }
            if (th instanceof OutOfMemoryError) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public void handleNativeException(String str, String str2) {
        if (!a(str, str2)) {
            b(str, str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "ExceptionHandler"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.app.Application r2 = r8.c
            java.lang.String r3 = "com.alipay.iap.android.aplog.service.LogServiceInToolsProcess"
            r1.setClassName(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.app.Application r3 = r8.c
            java.lang.String r3 = r3.getPackageName()
            r2.append(r3)
            java.lang.String r3 = ".NATIVE_CRASH"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setAction(r2)
            com.alipay.iap.android.aplog.api.ProcessInfo r2 = com.alipay.iap.android.aplog.core.LoggerFactory.getProcessInfo()
            java.lang.String r2 = r2.getProcessAlias()
            java.lang.String r4 = "invokerProcessAlias"
            r1.putExtra(r4, r2)
            java.lang.String r2 = "filePath"
            r1.putExtra(r2, r9)
            java.lang.String r2 = "callStack"
            r1.putExtra(r2, r10)
            r2 = 1
            r4 = 0
            com.alipay.iap.android.aplog.core.logger.TraceLogger r5 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            java.lang.String r7 = "uploadCoreByStartService start, action: "
            r6.<init>(r7)     // Catch:{ all -> 0x0074 }
            android.app.Application r7 = r8.c     // Catch:{ all -> 0x0074 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ all -> 0x0074 }
            r6.append(r7)     // Catch:{ all -> 0x0074 }
            r6.append(r3)     // Catch:{ all -> 0x0074 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0074 }
            r5.debug(r0, r3)     // Catch:{ all -> 0x0074 }
            android.app.Application r3 = r8.c     // Catch:{ all -> 0x0074 }
            com.alipay.iap.android.aplog.util.ServiceUtil.startForegroundService(r3, r1)     // Catch:{ all -> 0x0074 }
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "uploadCoreByStartService: true"
            r1.debug(r0, r3)     // Catch:{ all -> 0x0071 }
            r3 = 1
            goto L_0x0080
        L_0x0071:
            r1 = move-exception
            r3 = 1
            goto L_0x0076
        L_0x0074:
            r1 = move-exception
            r3 = 0
        L_0x0076:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r5 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r6 = "uploadCoreByStartService"
            r5.error(r0, r6, r1)
        L_0x0080:
            if (r3 == 0) goto L_0x0083
            return r2
        L_0x0083:
            r8.b(r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.logger.ExceptionHandler.a(java.lang.String, java.lang.String):boolean");
    }

    private void b(String str, String str2) {
        String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
        LoggerFactory.getTraceLogger().error("ExceptionHandler", String.format("a native crash occured in [%s] process [%s] thread. callStack: %s, filePath: %s", new Object[]{processAlias, Thread.currentThread().getName(), str2, str}));
        String replaceAll = CrashCombineUtils.UserTrackReport(str, str2).replaceAll("\n", "###");
        CrashLog crashLog = new CrashLog();
        crashLog.setJavaCrash(false);
        crashLog.putExtParam("callStack", str2);
        crashLog.putExtParam("process", processAlias);
        crashLog.putExtParam("crashInfo", replaceAll);
        crashLog.putExtParam("thread", Thread.currentThread().getName());
        LoggerFactory.getLogContext().syncAppendLog(crashLog);
        CrashCombineUtils.deleteFileByPath(str);
    }
}
