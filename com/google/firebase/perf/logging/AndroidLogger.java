package com.google.firebase.perf.logging;

import androidx.annotation.VisibleForTesting;
import java.util.Locale;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AndroidLogger {
    private static volatile AndroidLogger instance;
    private boolean isLogcatEnabled;
    private final LogWrapper logWrapper;

    public static AndroidLogger getInstance() {
        if (instance == null) {
            synchronized (AndroidLogger.class) {
                if (instance == null) {
                    instance = new AndroidLogger();
                }
            }
        }
        return instance;
    }

    @VisibleForTesting
    public AndroidLogger(LogWrapper logWrapper2) {
        this.isLogcatEnabled = false;
        this.logWrapper = logWrapper2 == null ? LogWrapper.getInstance() : logWrapper2;
    }

    private AndroidLogger() {
        this((LogWrapper) null);
    }

    public void setLogcatEnabled(boolean z) {
        this.isLogcatEnabled = z;
    }

    public boolean isLogcatEnabled() {
        return this.isLogcatEnabled;
    }

    public void debug(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.d(str);
        }
    }

    public void debug(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void verbose(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.v(str);
        }
    }

    public void verbose(String str, Object... objArr) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(319643348, oncanceled);
            onCancelLoad.getMin(319643348, oncanceled);
        }
        if (this.isLogcatEnabled) {
            this.logWrapper.v(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void info(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(696217053, oncanceled);
            onCancelLoad.getMin(696217053, oncanceled);
        }
        if (this.isLogcatEnabled) {
            this.logWrapper.i(str);
        }
    }

    public void info(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.i(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void warn(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.w(str);
        }
    }

    public void warn(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.w(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void error(String str) {
        if (this.isLogcatEnabled) {
            this.logWrapper.e(str);
        }
    }

    public void error(String str, Object... objArr) {
        if (this.isLogcatEnabled) {
            this.logWrapper.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
