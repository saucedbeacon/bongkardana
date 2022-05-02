package com.j256.ormlite.logger;

import com.j256.ormlite.logger.Log;
import java.lang.reflect.Array;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class Logger {
    private static final String ARG_STRING = "{}";
    private static final int DEFAULT_FULL_MESSAGE_LENGTH = 128;
    private static final Object UNKNOWN_ARG = new Object();
    private final Log log;

    public Logger(Log log2) {
        this.log = log2;
    }

    public boolean isLevelEnabled(Log.Level level) {
        return this.log.isLevelEnabled(level);
    }

    public void trace(String str) {
        Log.Level level = Log.Level.TRACE;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, (Object[]) null);
    }

    public void trace(String str, Object obj) {
        Log.Level level = Log.Level.TRACE;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void trace(String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.TRACE, (Throwable) null, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void trace(String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.TRACE, (Throwable) null, str, obj, obj2, obj3, (Object[]) null);
    }

    public void trace(String str, Object[] objArr) {
        Log.Level level = Log.Level.TRACE;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, objArr);
    }

    public void trace(Throwable th, String str) {
        Log.Level level = Log.Level.TRACE;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, (Object[]) null);
    }

    public void trace(Throwable th, String str, Object obj) {
        Log.Level level = Log.Level.TRACE;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj2, obj2, (Object[]) null);
    }

    public void trace(Throwable th, String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.TRACE, th, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void trace(Throwable th, String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.TRACE, th, str, obj, obj2, obj3, (Object[]) null);
    }

    public void trace(Throwable th, String str, Object[] objArr) {
        Log.Level level = Log.Level.TRACE;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, objArr);
    }

    public void debug(String str) {
        Log.Level level = Log.Level.DEBUG;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, (Object[]) null);
    }

    public void debug(String str, Object obj) {
        Log.Level level = Log.Level.DEBUG;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void debug(String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.DEBUG, (Throwable) null, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void debug(String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.DEBUG, (Throwable) null, str, obj, obj2, obj3, (Object[]) null);
    }

    public void debug(String str, Object[] objArr) {
        Log.Level level = Log.Level.DEBUG;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, objArr);
    }

    public void debug(Throwable th, String str) {
        Log.Level level = Log.Level.DEBUG;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, (Object[]) null);
    }

    public void debug(Throwable th, String str, Object obj) {
        Log.Level level = Log.Level.DEBUG;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj2, obj2, (Object[]) null);
    }

    public void debug(Throwable th, String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.DEBUG, th, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void debug(Throwable th, String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.DEBUG, th, str, obj, obj2, obj3, (Object[]) null);
    }

    public void debug(Throwable th, String str, Object[] objArr) {
        Log.Level level = Log.Level.DEBUG;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, objArr);
    }

    public void info(String str) {
        Log.Level level = Log.Level.INFO;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, (Object[]) null);
    }

    public void info(String str, Object obj) {
        Log.Level level = Log.Level.INFO;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void info(String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.INFO, (Throwable) null, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void info(String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.INFO, (Throwable) null, str, obj, obj2, obj3, (Object[]) null);
    }

    public void info(String str, Object[] objArr) {
        Log.Level level = Log.Level.INFO;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, objArr);
    }

    public void info(Throwable th, String str) {
        Log.Level level = Log.Level.INFO;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, (Object[]) null);
    }

    public void info(Throwable th, String str, Object obj) {
        Log.Level level = Log.Level.INFO;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj2, obj2, (Object[]) null);
    }

    public void info(Throwable th, String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.INFO, th, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void info(Throwable th, String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.INFO, th, str, obj, obj2, obj3, (Object[]) null);
    }

    public void info(Throwable th, String str, Object[] objArr) {
        Log.Level level = Log.Level.INFO;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, objArr);
    }

    public void warn(String str) {
        Log.Level level = Log.Level.WARNING;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, (Object[]) null);
    }

    public void warn(String str, Object obj) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1640213908, oncanceled);
            onCancelLoad.getMin(1640213908, oncanceled);
        }
        Log.Level level = Log.Level.WARNING;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void warn(String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.WARNING, (Throwable) null, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void warn(String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.WARNING, (Throwable) null, str, obj, obj2, obj3, (Object[]) null);
    }

    public void warn(String str, Object[] objArr) {
        Log.Level level = Log.Level.WARNING;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, objArr);
    }

    public void warn(Throwable th, String str) {
        Log.Level level = Log.Level.WARNING;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, (Object[]) null);
    }

    public void warn(Throwable th, String str, Object obj) {
        Log.Level level = Log.Level.WARNING;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj2, obj2, (Object[]) null);
    }

    public void warn(Throwable th, String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.WARNING, th, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void warn(Throwable th, String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.WARNING, th, str, obj, obj2, obj3, (Object[]) null);
    }

    public void warn(Throwable th, String str, Object[] objArr) {
        Log.Level level = Log.Level.WARNING;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, objArr);
    }

    public void error(String str) {
        Log.Level level = Log.Level.ERROR;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, (Object[]) null);
    }

    public void error(String str, Object obj) {
        Log.Level level = Log.Level.ERROR;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void error(String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.ERROR, (Throwable) null, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void error(String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.ERROR, (Throwable) null, str, obj, obj2, obj3, (Object[]) null);
    }

    public void error(String str, Object[] objArr) {
        Log.Level level = Log.Level.ERROR;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, objArr);
    }

    public void error(Throwable th, String str) {
        Log.Level level = Log.Level.ERROR;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, (Object[]) null);
    }

    public void error(Throwable th, String str, Object obj) {
        Log.Level level = Log.Level.ERROR;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj2, obj2, (Object[]) null);
    }

    public void error(Throwable th, String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.ERROR, th, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void error(Throwable th, String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.ERROR, th, str, obj, obj2, obj3, (Object[]) null);
    }

    public void error(Throwable th, String str, Object[] objArr) {
        Log.Level level = Log.Level.ERROR;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, objArr);
    }

    public void fatal(String str) {
        Log.Level level = Log.Level.FATAL;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, (Object[]) null);
    }

    public void fatal(String str, Object obj) {
        Log.Level level = Log.Level.FATAL;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void fatal(String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.FATAL, (Throwable) null, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void fatal(String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.FATAL, (Throwable) null, str, obj, obj2, obj3, (Object[]) null);
    }

    public void fatal(String str, Object[] objArr) {
        Log.Level level = Log.Level.FATAL;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, objArr);
    }

    public void fatal(Throwable th, String str) {
        Log.Level level = Log.Level.FATAL;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, (Object[]) null);
    }

    public void fatal(Throwable th, String str, Object obj) {
        Log.Level level = Log.Level.FATAL;
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj2, obj2, (Object[]) null);
    }

    public void fatal(Throwable th, String str, Object obj, Object obj2) {
        logIfEnabled(Log.Level.FATAL, th, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void fatal(Throwable th, String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(Log.Level.FATAL, th, str, obj, obj2, obj3, (Object[]) null);
    }

    public void fatal(Throwable th, String str, Object[] objArr) {
        Log.Level level = Log.Level.FATAL;
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, objArr);
    }

    public void log(Log.Level level, String str) {
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, (Object[]) null);
    }

    public void log(Log.Level level, String str, Object obj) {
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void log(Log.Level level, String str, Object obj, Object obj2) {
        logIfEnabled(level, (Throwable) null, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void log(Log.Level level, String str, Object obj, Object obj2, Object obj3) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-487533769, oncanceled);
            onCancelLoad.getMin(-487533769, oncanceled);
        }
        logIfEnabled(level, (Throwable) null, str, obj, obj2, obj3, (Object[]) null);
    }

    public void log(Log.Level level, String str, Object[] objArr) {
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, (Throwable) null, str, obj, obj, obj, objArr);
    }

    public void log(Log.Level level, Throwable th, String str) {
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, (Object[]) null);
    }

    public void log(Log.Level level, Throwable th, String str, Object obj) {
        Object obj2 = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj2, obj2, (Object[]) null);
    }

    public void log(Log.Level level, Throwable th, String str, Object obj, Object obj2) {
        logIfEnabled(level, th, str, obj, obj2, UNKNOWN_ARG, (Object[]) null);
    }

    public void log(Log.Level level, Throwable th, String str, Object obj, Object obj2, Object obj3) {
        logIfEnabled(level, th, str, obj, obj2, obj3, (Object[]) null);
    }

    public void log(Log.Level level, Throwable th, String str, Object[] objArr) {
        Object obj = UNKNOWN_ARG;
        logIfEnabled(level, th, str, obj, obj, obj, objArr);
    }

    private void logIfEnabled(Log.Level level, Throwable th, String str, Object obj, Object obj2, Object obj3, Object[] objArr) {
        if (this.log.isLevelEnabled(level)) {
            String buildFullMessage = buildFullMessage(str, obj, obj2, obj3, objArr);
            if (th == null) {
                this.log.log(level, buildFullMessage);
            } else {
                this.log.log(level, buildFullMessage, th);
            }
        }
    }

    private String buildFullMessage(String str, Object obj, Object obj2, Object obj3, Object[] objArr) {
        int i = 0;
        StringBuilder sb = null;
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(ARG_STRING, i);
            if (indexOf == -1) {
                break;
            }
            if (sb == null) {
                sb = new StringBuilder(128);
            }
            sb.append(str, i, indexOf);
            i = indexOf + 2;
            if (objArr == null) {
                if (i2 == 0) {
                    appendArg(sb, obj);
                } else if (i2 == 1) {
                    appendArg(sb, obj2);
                } else if (i2 == 2) {
                    appendArg(sb, obj3);
                }
            } else if (i2 < objArr.length) {
                appendArg(sb, objArr[i2]);
            }
            i2++;
        }
        if (sb == null) {
            return str;
        }
        sb.append(str, i, str.length());
        return sb.toString();
    }

    private void appendArg(StringBuilder sb, Object obj) {
        if (obj == UNKNOWN_ARG) {
            return;
        }
        if (obj == null) {
            sb.append("null");
        } else if (obj.getClass().isArray()) {
            sb.append('[');
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(Array.get(obj, i));
            }
            sb.append(']');
        } else {
            sb.append(obj.toString());
        }
    }
}
