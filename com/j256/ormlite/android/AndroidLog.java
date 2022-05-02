package com.j256.ormlite.android;

import com.j256.ormlite.logger.Log;
import com.j256.ormlite.logger.LoggerFactory;

public class AndroidLog implements Log {
    private static final String ALL_LOGS_NAME = "ORMLite";
    private static final int MAX_TAG_LENGTH = 23;
    private static final int REFRESH_LEVEL_CACHE_EVERY = 200;
    private String className;
    private final boolean[] levelCache;
    private volatile int levelCacheC = 0;

    public AndroidLog(String str) {
        String simpleClassName = LoggerFactory.getSimpleClassName(str);
        this.className = simpleClassName;
        int length = simpleClassName.length();
        if (length > 23) {
            this.className = this.className.substring(length - 23, length);
        }
        int i = 0;
        for (Log.Level levelToAndroidLevel : Log.Level.values()) {
            int levelToAndroidLevel2 = levelToAndroidLevel(levelToAndroidLevel);
            if (levelToAndroidLevel2 > i) {
                i = levelToAndroidLevel2;
            }
        }
        this.levelCache = new boolean[(i + 1)];
        refreshLevelCache();
    }

    public boolean isLevelEnabled(Log.Level level) {
        int i = this.levelCacheC + 1;
        this.levelCacheC = i;
        if (i >= 200) {
            refreshLevelCache();
            this.levelCacheC = 0;
        }
        int levelToAndroidLevel = levelToAndroidLevel(level);
        boolean[] zArr = this.levelCache;
        if (levelToAndroidLevel < zArr.length) {
            return zArr[levelToAndroidLevel];
        }
        return isLevelEnabledInternal(levelToAndroidLevel);
    }

    /* renamed from: com.j256.ormlite.android.AndroidLog$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidLog.AnonymousClass1.<clinit>():void");
        }
    }

    public void log(Log.Level level, String str) {
        int[] iArr = AnonymousClass1.$SwitchMap$com$j256$ormlite$logger$Log$Level;
    }

    public void log(Log.Level level, String str, Throwable th) {
        int[] iArr = AnonymousClass1.$SwitchMap$com$j256$ormlite$logger$Log$Level;
    }

    private void refreshLevelCache() {
        for (Log.Level levelToAndroidLevel : Log.Level.values()) {
            int levelToAndroidLevel2 = levelToAndroidLevel(levelToAndroidLevel);
            boolean[] zArr = this.levelCache;
            if (levelToAndroidLevel2 < zArr.length) {
                zArr[levelToAndroidLevel2] = isLevelEnabledInternal(levelToAndroidLevel2);
            }
        }
    }

    private boolean isLevelEnabledInternal(int i) {
        return android.util.Log.isLoggable(this.className, i) || android.util.Log.isLoggable(ALL_LOGS_NAME, i);
    }

    private int levelToAndroidLevel(Log.Level level) {
        int i = AnonymousClass1.$SwitchMap$com$j256$ormlite$logger$Log$Level[level.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 4) {
            return (i == 5 || i == 6) ? 6 : 4;
        }
        return 5;
    }
}
