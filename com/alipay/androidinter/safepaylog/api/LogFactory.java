package com.alipay.androidinter.safepaylog.api;

import android.content.Context;
import com.alipay.androidinter.safepaylog.api.LogItem;
import com.alipay.androidinter.safepaylog.utils.LogDebuger;
import com.alipay.androidinter.safepaylog.utils.LogMessage;
import com.alipay.androidinter.safepaylog.utils.LogPrinterProxy;
import com.alipay.androidinter.safepaylog.utils.LogUtils;
import java.util.HashMap;
import java.util.Map;

public class LogFactory {
    private static final Map<LogType, LogItem> mLogItems;
    private static LogPrinterProxy mPrinter;

    public interface ILogPrinter {
        void print(String str, String str2);

        void print(Throwable th);
    }

    public enum LogType {
        QUICKPAY,
        VERTIFY,
        DEFAULT
    }

    static {
        HashMap hashMap = new HashMap();
        mLogItems = hashMap;
        hashMap.put(LogType.QUICKPAY, new LogItem());
        mLogItems.put(LogType.VERTIFY, new LogItem());
        mLogItems.put(LogType.DEFAULT, new LogItem());
    }

    public static void initialize(Context context) {
        LogDebuger.initialize(context);
    }

    public static void setPrinter(ILogPrinter iLogPrinter) {
        mPrinter = new LogPrinterProxy(iLogPrinter);
    }

    public static LogItem getLogs(LogType logType) {
        return mLogItems.get(logType);
    }

    public static void clearLogs(LogType logType) {
        LogItem logItem = mLogItems.get(logType);
        if (logItem != null) {
            logItem.mTemplateInfos.clear();
            logItem.mTraceInfos.clear();
        }
    }

    public static void traceTemplate(LogItem.TemplateInfo templateInfo) {
        for (LogItem logItem : mLogItems.values()) {
            logItem.mTemplateInfos.add(templateInfo);
        }
    }

    public static void traceTemplate(String str, String str2, String str3, String str4, String str5) {
        for (LogItem logItem : mLogItems.values()) {
            logItem.mTemplateInfos.add(new LogItem.TemplateInfo(str, str2, str3, str4, str5));
        }
    }

    public static void traceException(String str, String str2, Throwable th) {
        traceException(str, str2, LogMessage.getStackTraceMessage(th));
    }

    public static void traceException(String str, String str2, String str3) {
        addTraceInfo(new LogItem.TracerInfo(LogItem.TracerType.EX, str, str2, str3));
    }

    public static void traceCount(String str, String str2, String str3) {
        addTraceInfo(new LogItem.TracerInfo(LogItem.TracerType.COUNT, str, str2, str3));
    }

    public static void tracePerf(String str, String str2, Long l) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(", timespan:");
        sb.append(l);
        traceInfo("LogFactory::tracePerf", sb.toString());
        addTraceInfo(new LogItem.TracerInfo(LogItem.TracerType.PERF, str, str2, Long.toString(l.longValue())));
    }

    public static void traceInfo(String str, String str2) {
        LogUtils.record(2, str, str2);
        LogPrinterProxy logPrinterProxy = mPrinter;
        if (logPrinterProxy != null) {
            logPrinterProxy.print(str, str2);
        }
    }

    public static void printException(Throwable th) {
        LogUtils.printExceptionStackTrace(th);
        LogPrinterProxy logPrinterProxy = mPrinter;
        if (logPrinterProxy != null) {
            logPrinterProxy.print(th);
        }
    }

    private static void addTraceInfo(LogItem.TracerInfo tracerInfo) {
        for (LogItem logItem : mLogItems.values()) {
            logItem.mTraceInfos.add(tracerInfo);
        }
    }
}
