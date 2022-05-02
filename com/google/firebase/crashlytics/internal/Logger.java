package com.google.firebase.crashlytics.internal;

import android.util.Log;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class Logger {
    static final Logger DEFAULT_LOGGER = new Logger(TAG);
    public static final String TAG = "FirebaseCrashlytics";
    private int logLevel = 4;
    private final String tag;

    public Logger(String str) {
        this.tag = str;
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public void d(String str, Throwable th) {
        canLog(3);
    }

    public void v(String str, Throwable th) {
        canLog(2);
    }

    public void i(String str, Throwable th) {
        canLog(4);
    }

    public void w(String str, Throwable th) {
        canLog(5);
    }

    public void e(String str, Throwable th) {
        canLog(6);
    }

    public void d(String str) {
        d(str, (Throwable) null);
    }

    public void v(String str) {
        v(str, (Throwable) null);
    }

    public void i(String str) {
        i(str, (Throwable) null);
    }

    public void w(String str) {
        w(str, (Throwable) null);
    }

    public void e(String str) {
        e(str, (Throwable) null);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    public void log(int i, String str, boolean z) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1438978489, oncanceled);
            onCancelLoad.getMin(-1438978489, oncanceled);
        }
        if (!z) {
            canLog(i);
        }
    }
}
