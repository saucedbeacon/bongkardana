package com.alipay.iap.android.aplog.core.logger;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.uc.crashsdk.export.ICrashClient;
import com.uc.crashsdk.export.LogType;
import java.io.File;

public class CrashClientImpl implements ICrashClient {
    public boolean onAddCrashStats(String str, int i, int i2) {
        return false;
    }

    public File onBeforeUploadLog(File file) {
        return null;
    }

    public void onCrashRestarting(boolean z) {
    }

    public String onGetCallbackInfo(String str) {
        try {
            if (!NativeCrashHandlerApi.CAT_LAST_PRODUCT_INFO.equalsIgnoreCase(str)) {
                return null;
            }
            String productVersion = LoggerFactory.getLogContext().getProductVersion();
            if (!TextUtils.isEmpty(NativeCrashHandlerApi.sLastRunningProductVersion)) {
                productVersion = NativeCrashHandlerApi.sLastRunningProductVersion;
            }
            String packageCodePath = LoggerFactory.getLogContext().getApplicationContext().getPackageCodePath();
            if (!TextUtils.isEmpty(NativeCrashHandlerApi.sLastCodePath)) {
                packageCodePath = NativeCrashHandlerApi.sLastCodePath;
            }
            String concat = "LastRuntimeVersion: ".concat(String.valueOf(productVersion));
            StringBuilder sb = new StringBuilder();
            sb.append(concat);
            sb.append("\n");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("LastRuntimeCodePath: ");
            sb2.append(packageCodePath);
            return sb2.toString();
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("CrashClientImpl", th);
            return null;
        }
    }

    public void onLogGenerated(File file, String str) {
        if (file != null) {
            file.getAbsolutePath();
            if (LogType.NATIVE_TYPE.equalsIgnoreCase(str)) {
                ExceptionHandler.getInstance().handleNativeException(file.getAbsolutePath(), str);
            } else if (LogType.UNEXP_TYPE.equalsIgnoreCase(str)) {
                try {
                    if (file.exists()) {
                        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                        StringBuilder sb = new StringBuilder("delete on file:");
                        sb.append(file.getAbsolutePath());
                        sb.append(" result: ");
                        sb.append(file.delete());
                        traceLogger.warn("CrashClientImpl", sb.toString());
                    }
                } catch (Throwable th) {
                    LoggerFactory.getTraceLogger().warn("CrashClientImpl", th);
                }
            } else if (LogType.JAVA_TYPE.equalsIgnoreCase(str)) {
                try {
                    if (file.exists()) {
                        TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                        StringBuilder sb2 = new StringBuilder("delete on file:");
                        sb2.append(file.getAbsolutePath());
                        sb2.append(" result: ");
                        sb2.append(file.delete());
                        traceLogger2.warn("CrashClientImpl", sb2.toString());
                    }
                } catch (Throwable th2) {
                    LoggerFactory.getTraceLogger().warn("CrashClientImpl", th2);
                }
            } else {
                try {
                    if (file.exists()) {
                        TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                        StringBuilder sb3 = new StringBuilder("delete on file:");
                        sb3.append(file.getAbsolutePath());
                        sb3.append(" result: ");
                        sb3.append(file.delete());
                        traceLogger3.warn("CrashClientImpl", sb3.toString());
                    }
                } catch (Throwable th3) {
                    LoggerFactory.getTraceLogger().warn("CrashClientImpl", th3);
                }
            }
        }
    }
}
