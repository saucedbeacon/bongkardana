package com.alipay.androidinter.safepaylog.utils;

public class LogMessage {
    public static final String ERROR_LINE_SEPARATOR = " 》 ";

    public static String getStackTraceMessage(Throwable th) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(getExceptionMessage(th));
            String obj = sb.toString();
            if (th == th.getCause()) {
                return obj;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(ERROR_LINE_SEPARATOR);
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(getExceptionMessage(th.getCause()));
            return sb3.toString();
        } catch (Throwable th2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("");
            sb4.append(" ex:");
            sb4.append(th2.getMessage());
            return sb4.toString();
        }
    }

    private static String getExceptionMessage(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(th.getClass().getName());
        stringBuffer.append(":");
        stringBuffer.append(th.getMessage());
        stringBuffer.append(ERROR_LINE_SEPARATOR);
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement obj : stackTrace) {
                StringBuilder sb = new StringBuilder();
                sb.append(obj.toString());
                sb.append(ERROR_LINE_SEPARATOR);
                stringBuffer.append(sb.toString());
            }
        }
        return stringBuffer.toString();
    }
}
