package com.alipay.multimedia.adjuster.utils;

import android.text.TextUtils;

public class Log {
    public static final String COST_TIME_TAG = "CostTime";
    private static Logger sLogger;
    private String mModuleName;
    private String mTag;
    private boolean openModuleTag = false;

    public static void setLogger(Logger logger) {
        sLogger = logger;
    }

    public static final Log getLogger(Class cls) {
        return getLogger(cls.getSimpleName());
    }

    public Log setModuleName(String str) {
        this.mModuleName = str;
        return this;
    }

    public Log openModuleTag(boolean z) {
        this.openModuleTag = z;
        return this;
    }

    public static final Log getLogger(String str) {
        Log log = new Log();
        log.mTag = str;
        return log;
    }

    private static String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            try {
                str = String.format(str, objArr);
            } catch (Exception unused) {
            }
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(Thread.currentThread().getName());
        sb.append("(");
        sb.append(Thread.currentThread().getId());
        sb.append(")] ");
        sb.append(str);
        return sb.toString();
    }

    public static void V(String str, String str2, Object... objArr) {
        String format = format(str2, objArr);
        Logger logger = sLogger;
        if (logger != null) {
            logger.v(str, format);
        }
    }

    public static void D(String str, String str2, Object... objArr) {
        String format = format(str2, objArr);
        Logger logger = sLogger;
        if (logger != null) {
            logger.d(str, format);
        }
    }

    public static void I(String str, String str2, Object... objArr) {
        String format = format(str2, objArr);
        Logger logger = sLogger;
        if (logger != null) {
            logger.i(str, format);
        }
    }

    public static void W(String str, String str2, Object... objArr) {
        String format = format(str2, objArr);
        Logger logger = sLogger;
        if (logger != null) {
            logger.w(str, format);
        }
    }

    public static void P(String str, String str2, Object... objArr) {
        String format = format(str2, objArr);
        Logger logger = sLogger;
        if (logger != null) {
            logger.d(str, format);
        }
    }

    public static void E(String str, Throwable th, String str2, Object... objArr) {
        String format = format(str2, objArr);
        Logger logger = sLogger;
        if (logger != null) {
            logger.e(str, format, th);
        }
    }

    public static void E(String str, String str2, Throwable th, Object... objArr) {
        E(str, th, str2, objArr);
    }

    public static void E(String str, String str2, Object... objArr) {
        E(str, (Throwable) null, str2, objArr);
    }

    public void v(String str, Object... objArr) {
        V(getTag(), getLogMsg(str), objArr);
    }

    public void d(String str, Object... objArr) {
        D(getTag(), getLogMsg(str), objArr);
    }

    public void i(String str, Object... objArr) {
        I(getTag(), getLogMsg(str), objArr);
    }

    public void w(String str, Object... objArr) {
        W(getTag(), getLogMsg(str), objArr);
    }

    public void p(String str, Object... objArr) {
        P(getTag(), getLogMsg(str), objArr);
    }

    public void e(Throwable th, String str, Object... objArr) {
        E(getTag(), th, getLogMsg(str), objArr);
    }

    public void e(String str, Object... objArr) {
        E(getTag(), (Throwable) null, getLogMsg(str), objArr);
    }

    private String getTag() {
        return (!this.openModuleTag || TextUtils.isEmpty(this.mModuleName)) ? this.mTag : this.mModuleName;
    }

    private String getLogMsg(String str) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.mModuleName)) {
            sb.append("[");
            sb.append(this.mModuleName);
            sb.append("]");
        }
        if (!TextUtils.isEmpty(this.mTag)) {
            sb.append("[");
            sb.append(this.mTag);
            sb.append("]");
        }
        sb.append(str);
        return sb.toString();
    }

    public static void TIME(String str, long j, Object... objArr) {
        if (j > 100) {
            D(COST_TIME_TAG, str, objArr);
        } else {
            P(COST_TIME_TAG, str, objArr);
        }
    }
}
