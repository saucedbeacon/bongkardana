package com.google.firebase.perf.logging;

class LogWrapper {
    private static final String LOG_TAG = "FirebasePerformance";
    private static LogWrapper instance;

    /* access modifiers changed from: package-private */
    public void d(String str) {
    }

    /* access modifiers changed from: package-private */
    public void e(String str) {
    }

    /* access modifiers changed from: package-private */
    public void i(String str) {
    }

    /* access modifiers changed from: package-private */
    public void v(String str) {
    }

    /* access modifiers changed from: package-private */
    public void w(String str) {
    }

    public static synchronized LogWrapper getInstance() {
        LogWrapper logWrapper;
        synchronized (LogWrapper.class) {
            if (instance == null) {
                instance = new LogWrapper();
            }
            logWrapper = instance;
        }
        return logWrapper;
    }

    private LogWrapper() {
    }
}
