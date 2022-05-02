package com.facebook.litho;

import android.os.Looper;
import android.os.Process;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ThreadUtils {
    private static int length;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MainThreadOverride {
    }

    public static void getMax() {
    }

    public static void length() {
    }

    public static boolean setMax() {
        int i = length;
        if (i != 1) {
            return i != 2 && Looper.getMainLooper().getThread() == Thread.currentThread();
        }
        return true;
    }

    public static int length(int i) {
        return getMax(i, Process.getThreadPriority(Process.myTid()));
    }

    public static int getMax(int i, int i2) {
        int threadPriority = Process.getThreadPriority(i);
        boolean z = false;
        while (!z && i2 < threadPriority) {
            try {
                Process.setThreadPriority(i, i2);
                z = true;
            } catch (SecurityException unused) {
                i2++;
            }
        }
        return threadPriority;
    }
}
