package com.iap.ac.android.common.log.log;

import android.util.Log;

public class LogPrinter implements ILogPrinter {
    public int doPrint(int i, String str, String str2) {
        if (i == 2) {
            return Log.v(str, str2);
        }
        if (i == 3) {
            return Log.d(str, str2);
        }
        if (i == 4) {
            return Log.i(str, str2);
        }
        if (i == 5) {
            return Log.w(str, str2);
        }
        if (i != 6) {
            return Log.i(str, str2);
        }
        return Log.e(str, str2);
    }

    public int doPrint(int i, String str, String str2, Throwable th) {
        if (i == 2) {
            return Log.v(str, str2, th);
        }
        if (i == 3) {
            return Log.d(str, str2, th);
        }
        if (i == 4) {
            return Log.i(str, str2, th);
        }
        if (i != 5) {
            if (i != 6) {
                return Log.i(str, str2, th);
            }
            return Log.e(str, str2, th);
        } else if (str2 == null) {
            return Log.w(str, th);
        } else {
            return Log.w(str, str2, th);
        }
    }
}
