package com.iap.ac.android.common.log.log;

public interface ILogPrinter {
    int doPrint(int i, String str, String str2);

    int doPrint(int i, String str, String str2, Throwable th);
}
