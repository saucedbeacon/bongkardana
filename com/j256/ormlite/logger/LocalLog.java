package com.j256.ormlite.logger;

import com.j256.ormlite.logger.Log;
import com.j256.ormlite.misc.IOUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class LocalLog implements Log {
    private static final Log.Level DEFAULT_LEVEL = Log.Level.DEBUG;
    public static final String LOCAL_LOG_FILE_PROPERTY = "com.j256.ormlite.logger.file";
    public static final String LOCAL_LOG_LEVEL_PROPERTY = "com.j256.ormlite.logger.level";
    public static final String LOCAL_LOG_PROPERTIES_FILE = "/ormliteLocalLog.properties";
    private static final List<PatternLevel> classLevels = readLevelResourceFile(LocalLog.class.getResourceAsStream(LOCAL_LOG_PROPERTIES_FILE));
    private static final ThreadLocal<DateFormat> dateFormatThreadLocal = new ThreadLocal<DateFormat>() {
        /* access modifiers changed from: protected */
        public final DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        }
    };
    private static PrintStream printStream;
    private final String className;
    private final Log.Level level;

    static {
        openLogFile(System.getProperty(LOCAL_LOG_FILE_PROPERTY));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6 = com.j256.ormlite.logger.Log.Level.valueOf(r6.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        r2 = new java.lang.StringBuilder("Level '");
        r2.append(r6);
        r2.append("' was not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        throw new java.lang.IllegalArgumentException(r2.toString(), r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocalLog(java.lang.String r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = com.j256.ormlite.logger.LoggerFactory.getSimpleClassName(r6)
            r5.className = r0
            java.util.List<com.j256.ormlite.logger.LocalLog$PatternLevel> r0 = classLevels
            r1 = 0
            if (r0 == 0) goto L_0x003b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r0.next()
            com.j256.ormlite.logger.LocalLog$PatternLevel r2 = (com.j256.ormlite.logger.LocalLog.PatternLevel) r2
            java.util.regex.Pattern r3 = r2.pattern
            java.util.regex.Matcher r3 = r3.matcher(r6)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x0012
            if (r1 == 0) goto L_0x0038
            com.j256.ormlite.logger.Log$Level r3 = r2.level
            int r3 = r3.ordinal()
            int r4 = r1.ordinal()
            if (r3 >= r4) goto L_0x0012
        L_0x0038:
            com.j256.ormlite.logger.Log$Level r1 = r2.level
            goto L_0x0012
        L_0x003b:
            if (r1 != 0) goto L_0x0077
            java.lang.String r6 = "com.j256.ormlite.logger.level"
            java.lang.String r6 = java.lang.System.getProperty(r6)
            if (r6 != 0) goto L_0x0048
            com.j256.ormlite.logger.Log$Level r1 = DEFAULT_LEVEL
            goto L_0x0077
        L_0x0048:
            java.lang.String r0 = r6.toUpperCase()     // Catch:{ IllegalArgumentException -> 0x0052 }
            com.j256.ormlite.logger.Log$Level r6 = com.j256.ormlite.logger.Log.Level.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0052 }
        L_0x0050:
            r1 = r6
            goto L_0x0077
        L_0x0052:
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ IllegalArgumentException -> 0x005d }
            java.lang.String r0 = r6.toUpperCase(r0)     // Catch:{ IllegalArgumentException -> 0x005d }
            com.j256.ormlite.logger.Log$Level r6 = com.j256.ormlite.logger.Log.Level.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x005d }
            goto L_0x0050
        L_0x005d:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Level '"
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = "' was not found"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r0)
            throw r1
        L_0x0077:
            r5.level = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.logger.LocalLog.<init>(java.lang.String):void");
    }

    public static void openLogFile(String str) {
        if (str == null) {
            printStream = System.out;
            return;
        }
        try {
            printStream = new PrintStream(new File(str));
        } catch (FileNotFoundException e) {
            StringBuilder sb = new StringBuilder("Log file ");
            sb.append(str);
            sb.append(" was not found");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public boolean isLevelEnabled(Log.Level level2) {
        return this.level.isEnabled(level2);
    }

    public void log(Log.Level level2, String str) {
        printMessage(level2, str, (Throwable) null);
    }

    public void log(Log.Level level2, String str, Throwable th) {
        printMessage(level2, str, th);
    }

    /* access modifiers changed from: package-private */
    public void flush() {
        printStream.flush();
    }

    static List<PatternLevel> readLevelResourceFile(InputStream inputStream) {
        if (inputStream != null) {
            try {
                return configureClassLevels(inputStream);
            } catch (IOException e) {
                System.err.println("IO exception reading the log properties file '/ormliteLocalLog.properties': ".concat(String.valueOf(e)));
            } finally {
                IOUtils.closeQuietly(inputStream);
            }
        }
        return null;
    }

    private static List<PatternLevel> configureClassLevels(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            if (!(readLine.length() == 0 || readLine.charAt(0) == '#')) {
                String[] split = readLine.split(SimpleComparison.EQUAL_TO_OPERATION);
                if (split.length != 2) {
                    System.err.println("Line is not in the format of 'pattern = level': ".concat(String.valueOf(readLine)));
                } else {
                    try {
                        arrayList.add(new PatternLevel(Pattern.compile(split[0].trim()), Log.Level.valueOf(split[1].trim())));
                    } catch (IllegalArgumentException unused) {
                        PrintStream printStream2 = System.err;
                        StringBuilder sb = new StringBuilder("Level '");
                        sb.append(split[1]);
                        sb.append("' was not found");
                        printStream2.println(sb.toString());
                    }
                }
            }
        }
    }

    private void printMessage(Log.Level level2, String str, Throwable th) {
        if (isLevelEnabled(level2)) {
            StringBuilder sb = new StringBuilder(128);
            sb.append(dateFormatThreadLocal.get().format(new Date()));
            sb.append(" [");
            sb.append(level2.name());
            sb.append("] ");
            sb.append(this.className);
            sb.append(' ');
            sb.append(str);
            printStream.println(sb.toString());
            if (th != null) {
                th.printStackTrace(printStream);
            }
        }
    }

    static class PatternLevel {
        Log.Level level;
        Pattern pattern;

        public PatternLevel(Pattern pattern2, Log.Level level2) {
            this.pattern = pattern2;
            this.level = level2;
        }
    }
}
