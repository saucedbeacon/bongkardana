package com.iap.ac.android.diagnoselog.api;

import android.text.TextUtils;
import com.iap.ac.android.diagnoselog.core.DiagnoseLogContext;
import com.iap.ac.android.diagnoselog.core.TraceLog;
import com.iap.ac.android.diagnoselog.storage.DiagnoseFileStorage;
import com.iap.ac.android.loglite.utils.LoggerWrapper;

public class DiagnoseLogHelper {
    public static void d(String str, String str2) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LoggerWrapper.d(str, str2);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "D", str2, (Throwable) null));
        }
    }

    public static void e(String str, String str2) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LoggerWrapper.e(str, str2);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "E", str2, (Throwable) null));
        }
    }

    public static void i(String str, String str2) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LoggerWrapper.i(str, str2);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "I", str2, (Throwable) null));
        }
    }

    public static void v(String str, String str2) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LoggerWrapper.v(str, str2);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "V", str2, (Throwable) null));
        }
    }

    public static void w(String str, String str2) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LoggerWrapper.w(str, str2);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "W", str2, (Throwable) null));
        }
    }

    public static void v(String str, String str2, Throwable th) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LoggerWrapper.v(str, str2, th);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "V", str2, th));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LoggerWrapper.d(str, str2, th);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "D", str2, th));
        }
    }

    public static void i(String str, String str2, Throwable th) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LoggerWrapper.i(str, str2, th);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "I", str2, th));
        }
    }

    public static void w(String str, Throwable th) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str)) {
            LoggerWrapper.w(str, th);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "W", "", th));
        }
    }

    public static void e(String str, String str2, Throwable th) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str)) {
            LoggerWrapper.e(str, str2, th);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "E", str2, th));
        }
    }

    public static void w(String str, String str2, Throwable th) {
        DiagnoseLogContext.b();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LoggerWrapper.w(str, str2, th);
            ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a(new TraceLog(str, "W", str2, th));
        }
    }
}
