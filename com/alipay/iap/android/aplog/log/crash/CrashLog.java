package com.alipay.iap.android.aplog.log.crash;

import android.text.TextUtils;
import android.util.Log;
import com.alipay.iap.android.aplog.log.BaseLogInfo;

public class CrashLog extends BaseLogInfo {
    private Throwable ex;
    private ExceptionID exceptionID = ExceptionID.MONITORPOINT_CRASH;
    private boolean isJavaCrash = true;
    private String logCategory = "crash";
    private String stackTrace;
    private String threadName;

    public CrashLog() {
        generateSequenceID();
    }

    public Throwable getEx() {
        return this.ex;
    }

    public CrashLog setEx(Throwable th) {
        this.ex = th;
        String stackTraceString = Log.getStackTraceString(th);
        this.stackTrace = stackTraceString;
        if (!TextUtils.isEmpty(stackTraceString)) {
            this.stackTrace = this.stackTrace.replaceAll("\n", "###");
        }
        return this;
    }

    public String getLogCategory() {
        return this.logCategory;
    }

    public CrashLog setLogCategory(String str) {
        this.logCategory = str;
        return this;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public CrashLog setThreadName(String str) {
        this.threadName = str;
        return this;
    }

    public boolean isJavaCrash() {
        return this.isJavaCrash;
    }

    public CrashLog setJavaCrash(boolean z) {
        this.isJavaCrash = z;
        return this;
    }

    public ExceptionID getExceptionID() {
        return this.exceptionID;
    }

    public CrashLog setExceptionID(ExceptionID exceptionID2) {
        this.exceptionID = exceptionID2;
        return this;
    }

    public String getStackTrace() {
        return this.stackTrace;
    }

    public CrashLog setStackTrace(String str) {
        this.stackTrace = str;
        return this;
    }
}
