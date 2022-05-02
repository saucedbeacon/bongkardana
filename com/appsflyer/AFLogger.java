package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.am;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {

    /* renamed from: ˋ  reason: contains not printable characters */
    private static long f8570 = System.currentTimeMillis();

    public static void afInfoLog(String str, boolean z) {
        if (LogLevel.INFO.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            m1131(str, false);
        }
        if (z) {
            if (am.f8691 == null) {
                am.f8691 = new am();
            }
            am.f8691.m1247((String) null, "I", m1131(str, true));
        }
    }

    public static void resetDeltaTime() {
        f8570 = System.currentTimeMillis();
    }

    @NonNull
    /* renamed from: ˋ  reason: contains not printable characters */
    private static String m1131(String str, boolean z) {
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(m1130(System.currentTimeMillis() - f8570));
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private static void m1132(String str, Throwable th, boolean z) {
        String[] strArr;
        if ((LogLevel.ERROR.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) && z) {
            m1131(str, false);
        }
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am amVar = am.f8691;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        StackTraceElement[] stackTrace = cause == null ? th.getStackTrace() : cause.getStackTrace();
        if (stackTrace == null) {
            strArr = new String[]{message};
        } else {
            String[] strArr2 = new String[(stackTrace.length + 1)];
            strArr2[0] = message;
            for (int i = 1; i < stackTrace.length; i++) {
                strArr2[i] = stackTrace[i].toString();
            }
            strArr = strArr2;
        }
        amVar.m1247("exception", simpleName, strArr);
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    static void m1133(String str) {
        if (LogLevel.WARNING.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            m1131(str, false);
        }
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247((String) null, "W", m1131(str, true));
    }

    public static void afRDLog(String str) {
        if (LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            m1131(str, false);
        }
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247((String) null, "V", m1131(str, true));
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    public static void afErrorLog(String str, Throwable th) {
        m1132(str, th, false);
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        m1132(str, th, z);
    }

    public static void afWarnLog(String str) {
        m1133(str);
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    private static String m1130(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long millis = j - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2);
        long millis3 = TimeUnit.MILLISECONDS.toMillis(millis2 - TimeUnit.SECONDS.toMillis(seconds));
        return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis3)});
    }

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: ॱ  reason: contains not printable characters */
        private int f8572;

        private LogLevel(int i) {
            this.f8572 = i;
        }

        public final int getLevel() {
            return this.f8572;
        }
    }

    /* renamed from: ˊ  reason: contains not printable characters */
    static void m1129(String str) {
        if (!AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            m1131(str, false);
        }
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247((String) null, "F", str);
    }

    public static void afDebugLog(String str) {
        if (LogLevel.DEBUG.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            m1131(str, false);
        }
        if (am.f8691 == null) {
            am.f8691 = new am();
        }
        am.f8691.m1247((String) null, "D", m1131(str, true));
    }
}
