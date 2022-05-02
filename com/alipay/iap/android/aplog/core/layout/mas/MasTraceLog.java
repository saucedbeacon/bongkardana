package com.alipay.iap.android.aplog.core.layout.mas;

import android.os.Process;
import com.alipay.iap.android.aplog.log.TraceLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MasTraceLog implements MasLog<TraceLog> {
    private static ThreadLocal<StringBuilder> threadBuilder = new ThreadLocal<>();
    private SimpleDateFormat TRACE_LOG_DATA_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.getDefault());

    public String getLayout(TraceLog traceLog) {
        StringBuilder sb = threadBuilder.get();
        if (sb == null) {
            sb = new StringBuilder();
            threadBuilder.set(sb);
        }
        String format = this.TRACE_LOG_DATA_FORMAT.format(new Date(System.currentTimeMillis()));
        int myTid = Process.myTid();
        String name = Thread.currentThread().getName();
        sb.append(format);
        sb.append(' ');
        sb.append(traceLog.getLevel());
        sb.append('/');
        sb.append(traceLog.getTag());
        sb.append(':');
        sb.append('[');
        sb.append(myTid);
        sb.append(':');
        sb.append(name);
        sb.append("] ");
        sb.append(traceLog.getMsg());
        if (traceLog.getTr() != null) {
            sb.append(" ");
            sb.append(traceLog.getTr());
        }
        String obj = sb.toString();
        sb.setLength(0);
        return obj;
    }
}
