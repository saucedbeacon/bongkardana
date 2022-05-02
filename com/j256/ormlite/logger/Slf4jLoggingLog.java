package com.j256.ormlite.logger;

import com.j256.ormlite.logger.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLoggingLog implements Log {
    private final Logger logger;

    public Slf4jLoggingLog(String str) {
        this.logger = LoggerFactory.getLogger(str);
    }

    /* renamed from: com.j256.ormlite.logger.Slf4jLoggingLog$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$j256$ormlite$logger$Log$Level;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.j256.ormlite.logger.Log$Level[] r0 = com.j256.ormlite.logger.Log.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$j256$ormlite$logger$Log$Level = r0
                com.j256.ormlite.logger.Log$Level r1 = com.j256.ormlite.logger.Log.Level.TRACE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$j256$ormlite$logger$Log$Level     // Catch:{ NoSuchFieldError -> 0x001d }
                com.j256.ormlite.logger.Log$Level r1 = com.j256.ormlite.logger.Log.Level.DEBUG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$j256$ormlite$logger$Log$Level     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.j256.ormlite.logger.Log$Level r1 = com.j256.ormlite.logger.Log.Level.INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$j256$ormlite$logger$Log$Level     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.j256.ormlite.logger.Log$Level r1 = com.j256.ormlite.logger.Log.Level.WARNING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$j256$ormlite$logger$Log$Level     // Catch:{ NoSuchFieldError -> 0x003e }
                com.j256.ormlite.logger.Log$Level r1 = com.j256.ormlite.logger.Log.Level.ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$j256$ormlite$logger$Log$Level     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.j256.ormlite.logger.Log$Level r1 = com.j256.ormlite.logger.Log.Level.FATAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.logger.Slf4jLoggingLog.AnonymousClass1.<clinit>():void");
        }
    }

    public boolean isLevelEnabled(Log.Level level) {
        switch (AnonymousClass1.$SwitchMap$com$j256$ormlite$logger$Log$Level[level.ordinal()]) {
            case 1:
                return this.logger.isTraceEnabled();
            case 2:
                return this.logger.isDebugEnabled();
            case 3:
                return this.logger.isInfoEnabled();
            case 4:
                return this.logger.isWarnEnabled();
            case 5:
                return this.logger.isErrorEnabled();
            case 6:
                return this.logger.isErrorEnabled();
            default:
                return this.logger.isInfoEnabled();
        }
    }

    public void log(Log.Level level, String str) {
        switch (AnonymousClass1.$SwitchMap$com$j256$ormlite$logger$Log$Level[level.ordinal()]) {
            case 1:
                this.logger.trace(str);
                return;
            case 2:
                this.logger.debug(str);
                return;
            case 3:
                this.logger.info(str);
                return;
            case 4:
                this.logger.warn(str);
                return;
            case 5:
                this.logger.error(str);
                return;
            case 6:
                this.logger.error(str);
                return;
            default:
                this.logger.info(str);
                return;
        }
    }

    public void log(Log.Level level, String str, Throwable th) {
        switch (AnonymousClass1.$SwitchMap$com$j256$ormlite$logger$Log$Level[level.ordinal()]) {
            case 1:
                this.logger.trace(str, th);
                return;
            case 2:
                this.logger.debug(str, th);
                return;
            case 3:
                this.logger.info(str, th);
                return;
            case 4:
                this.logger.warn(str, th);
                return;
            case 5:
                this.logger.error(str, th);
                return;
            case 6:
                this.logger.error(str, th);
                return;
            default:
                this.logger.info(str, th);
                return;
        }
    }
}
