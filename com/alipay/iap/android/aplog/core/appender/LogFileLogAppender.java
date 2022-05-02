package com.alipay.iap.android.aplog.core.appender;

import android.os.SystemClock;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.util.FileUtil;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import kotlin.text.Typography;

@Deprecated
public class LogFileLogAppender extends AnalyticsLogAppender {
    protected static final Comparator<File> CLEAN_FILE_COMPARATOR = new Comparator<File>() {
        public final int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    protected static final int CLEAN_FILE_SCOPE = 4;
    protected static final String DEFAULT_CHARSET = "UTF-8";
    protected static final String SEPARATOR_DATA = "$$";
    protected static final int SEPARATOR_DATA_LEN = 2;
    public static final String TAG = "LogFileAppender";
    private static int getMax = 1;
    private static int getMin;
    private static int setMin;
    protected File currentLogFile;
    protected long currentLogRoll;
    protected int eventBufferLength;
    protected StringBuilder eventDataBuffer;
    protected long expiredSize;
    protected long expiredTime;
    protected long fileRollTime;
    protected boolean isAppendBytesError;
    protected boolean isBufferToBytesError;
    protected boolean isGzipBytesError;
    protected boolean isHybridEncryptError;
    String logCategory;
    protected File mCurrentLogsDir;

    static void setMin() {
        setMin = 84;
    }

    static {
        setMin();
        int i = getMin + 115;
        getMax = i % 128;
        int i2 = i % 2;
    }

    public LogFileLogAppender(LogContext logContext, String str, long j, long j2, long j3, int i) {
        super(logContext, str);
        this.fileRollTime = j;
        this.expiredTime = j2;
        this.expiredSize = j3;
        this.logCategory = str;
        int i2 = i / 2;
        this.eventBufferLength = i2;
        this.eventDataBuffer = new StringBuilder(i2);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.io.File] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        if (r8.currentLogFile.getName().equals(r0) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        if (r8.currentLogFile.getName().equals(r0) == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File getFile() {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.fileRollTime
            long r0 = r0 / r2
            long r0 = r0 * r2
            r8.currentLogRoll = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r8.currentLogRoll
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = r8.processTag
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = r8.currentLogFile
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x006b
            int r1 = getMin
            int r1 = r1 + 41
            int r4 = r1 % 128
            getMax = r4
            int r1 = r1 % 2
            java.io.File r1 = r8.currentLogFile
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x006b
            int r1 = getMax
            int r1 = r1 + 91
            int r4 = r1 % 128
            getMin = r4
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0049
            r1 = 0
            goto L_0x004a
        L_0x0049:
            r1 = 1
        L_0x004a:
            if (r1 == 0) goto L_0x0059
            java.io.File r1 = r8.currentLogFile
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00cd
            goto L_0x006b
        L_0x0059:
            java.io.File r1 = r8.currentLogFile
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r0)
            r4 = 32
            int r4 = r4 / r2
            if (r1 != 0) goto L_0x00cd
            goto L_0x006b
        L_0x0069:
            r0 = move-exception
            throw r0
        L_0x006b:
            java.io.File r7 = r8.getCurrentLogsDir()
            if (r7 != 0) goto L_0x0095
            int r0 = getMin
            int r0 = r0 + 73
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r2 = 1
        L_0x007f:
            r0 = 0
            if (r2 == r3) goto L_0x0086
            int r1 = r0.length     // Catch:{ all -> 0x0084 }
            goto L_0x0086
        L_0x0084:
            r0 = move-exception
            throw r0
        L_0x0086:
            int r1 = getMax     // Catch:{ Exception -> 0x0093 }
            int r1 = r1 + 45
            int r2 = r1 % 128
            getMin = r2     // Catch:{ Exception -> 0x0091 }
            int r1 = r1 % 2
            return r0
        L_0x0091:
            r0 = move-exception
            throw r0
        L_0x0093:
            r0 = move-exception
            throw r0
        L_0x0095:
            long r3 = r8.expiredTime     // Catch:{ all -> 0x009f }
            long r5 = r8.expiredSize     // Catch:{ all -> 0x009f }
            r1 = r8
            r2 = r7
            r1.cleanExpiresFile(r2, r3, r5)     // Catch:{ all -> 0x009f }
            goto L_0x00a0
        L_0x009f:
        L_0x00a0:
            java.io.File r1 = new java.io.File
            r1.<init>(r7, r0)
            r8.currentLogFile = r1
            boolean r0 = com.alipay.iap.android.aplog.util.LoggingUtil.isDebuggable()
            if (r0 != 0) goto L_0x00cd
            java.lang.Thread r0 = new java.lang.Thread
            com.alipay.iap.android.aplog.core.appender.LogFileLogAppender$2 r1 = new com.alipay.iap.android.aplog.core.appender.LogFileLogAppender$2
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r8.logCategory
            r2.append(r3)
            java.lang.String r3 = "Extras"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            r0.start()
        L_0x00cd:
            java.io.File r0 = r8.currentLogFile
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.LogFileLogAppender.getFile():java.io.File");
    }

    /* access modifiers changed from: protected */
    public void handleExtrasOnGetNewFile() {
        try {
            int i = getMin + 61;
            getMax = i % 128;
            int i2 = i % 2;
            Thread.currentThread().setPriority(5);
            SystemClock.sleep(TimeUnit.SECONDS.toMillis(20));
            int i3 = getMin + 125;
            getMax = i3 % 128;
            if ((i3 % 2 == 0 ? (char) 0 : 27) == 0) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[Catch:{ all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[Catch:{ all -> 0x0067 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File getCurrentLogsDir() {
        /*
            r2 = this;
            java.io.File r0 = r2.mCurrentLogsDir
            r1 = 25
            if (r0 != 0) goto L_0x0009
            r0 = 70
            goto L_0x000b
        L_0x0009:
            r0 = 25
        L_0x000b:
            if (r0 == r1) goto L_0x0043
            int r0 = getMax
            int r0 = r0 + 23
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 11
            if (r0 == 0) goto L_0x001e
            r0 = 94
            goto L_0x0020
        L_0x001e:
            r0 = 11
        L_0x0020:
            if (r0 == r1) goto L_0x002f
            android.content.Context r0 = r2.appContext     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = r2.logCategory     // Catch:{ all -> 0x0043 }
            java.io.File r0 = com.alipay.iap.android.aplog.util.LoggingUtil.getStorageFilesDir(r0, r1)     // Catch:{ all -> 0x0043 }
            r2.mCurrentLogsDir = r0     // Catch:{ all -> 0x0043 }
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0043 }
            goto L_0x0039
        L_0x002f:
            android.content.Context r0 = r2.appContext     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = r2.logCategory     // Catch:{ all -> 0x0043 }
            java.io.File r0 = com.alipay.iap.android.aplog.util.LoggingUtil.getStorageFilesDir(r0, r1)     // Catch:{ all -> 0x0043 }
            r2.mCurrentLogsDir = r0     // Catch:{ all -> 0x0043 }
        L_0x0039:
            int r0 = getMax
            int r0 = r0 + 51
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
        L_0x0043:
            java.io.File r0 = r2.mCurrentLogsDir     // Catch:{ all -> 0x0067 }
            r1 = 97
            if (r0 == 0) goto L_0x004c
            r0 = 38
            goto L_0x004e
        L_0x004c:
            r0 = 97
        L_0x004e:
            if (r0 == r1) goto L_0x0067
            java.io.File r0 = r2.mCurrentLogsDir     // Catch:{ all -> 0x0067 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0067
            int r0 = getMax
            int r0 = r0 + 57
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            java.io.File r0 = r2.mCurrentLogsDir     // Catch:{ all -> 0x0067 }
            r0.mkdirs()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            java.io.File r0 = r2.mCurrentLogsDir
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.LogFileLogAppender.getCurrentLogsDir():java.io.File");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r5.eventDataBuffer.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        appendDataToFile();
        r0 = getMin + 115;
        getMax = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if ((r0 % 2) != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        if (r1 == true) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void flush() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = getMin     // Catch:{ all -> 0x0048 }
            int r0 = r0 + 91
            int r1 = r0 % 128
            getMax = r1     // Catch:{ all -> 0x0048 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r3 = 0
            if (r0 == 0) goto L_0x0023
            java.lang.StringBuilder r0 = r5.eventDataBuffer     // Catch:{ all -> 0x0048 }
            int r0 = r0.length()     // Catch:{ all -> 0x0048 }
            super.hashCode()     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x002d
            goto L_0x002b
        L_0x0021:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0023:
            java.lang.StringBuilder r0 = r5.eventDataBuffer     // Catch:{ Exception -> 0x0046 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0046 }
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            monitor-exit(r5)
            return
        L_0x002d:
            r5.appendDataToFile()     // Catch:{ all -> 0x0048 }
            int r0 = getMin     // Catch:{ all -> 0x0048 }
            int r0 = r0 + 115
            int r4 = r0 % 128
            getMax = r4     // Catch:{ all -> 0x0048 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x003d
            r1 = 1
        L_0x003d:
            if (r1 == r2) goto L_0x0041
            monitor-exit(r5)
            return
        L_0x0041:
            int r0 = r3.length     // Catch:{ all -> 0x0044 }
            monitor-exit(r5)
            return
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.LogFileLogAppender.flush():void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (android.text.TextUtils.isEmpty(r13) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (((r12.eventDataBuffer.length() + r13.length()) + SEPARATOR_DATA_LEN) <= r12.eventBufferLength) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r0 = '=';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r0 == '=') goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        appendDataToBuffer(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        appendDataToFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (((r12.eventDataBuffer.length() + r13.length()) + SEPARATOR_DATA_LEN) <= r12.eventBufferLength) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(r13);
        r0.append("$$");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r13 = r0.toString().getBytes(setMin(!android.webkit.URLUtil.isValidUrl(r2), android.text.TextUtils.indexOf("", "") + 5, 151 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, new char[]{16, 17, 65524, 65513, 2}).intern());
        onAppend(r13, 0, r13.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00da, code lost:
        if (r12.isBufferToBytesError == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        r12.isBufferToBytesError = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        r13 = getMin + 87;
        getMax = r13 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        if ((r13 % 2) == 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00eb, code lost:
        r13 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ee, code lost:
        r13 = 'H';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f0, code lost:
        if (r13 != 12) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r13 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        appendDataToBuffer(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r0 != false) goto L_0x0046;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00d8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onAppend(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            int r0 = getMin     // Catch:{ all -> 0x00fe }
            int r0 = r0 + 11
            int r1 = r0 % 128
            getMax = r1     // Catch:{ all -> 0x00fe }
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            if (r0 != 0) goto L_0x002d
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x00fe }
            java.lang.String r3 = "LogFileAppender"
            java.lang.String r4 = "LogFileAppender write log: "
            java.lang.String r5 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x00fe }
            r0.debug(r3, r4)     // Catch:{ all -> 0x00fe }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x00fe }
            super.hashCode()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0048
            goto L_0x0046
        L_0x002b:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00fe }
        L_0x002d:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x00fe }
            java.lang.String r3 = "LogFileAppender"
            java.lang.String r4 = "LogFileAppender write log: "
            java.lang.String r5 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x00fe }
            r0.debug(r3, r4)     // Catch:{ all -> 0x00fe }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0048
        L_0x0046:
            monitor-exit(r12)
            return
        L_0x0048:
            java.lang.StringBuilder r0 = r12.eventDataBuffer     // Catch:{ all -> 0x00fe }
            int r0 = r0.length()     // Catch:{ all -> 0x00fe }
            int r3 = r13.length()     // Catch:{ all -> 0x00fe }
            int r0 = r0 + r3
            int r3 = SEPARATOR_DATA_LEN     // Catch:{ all -> 0x00fe }
            int r0 = r0 + r3
            int r3 = r12.eventBufferLength     // Catch:{ all -> 0x00fe }
            r4 = 61
            r5 = 1
            if (r0 <= r3) goto L_0x0060
            r0 = 61
            goto L_0x0061
        L_0x0060:
            r0 = 1
        L_0x0061:
            if (r0 == r4) goto L_0x0068
            r12.appendDataToBuffer(r13)     // Catch:{ all -> 0x00fe }
            monitor-exit(r12)
            return
        L_0x0068:
            r12.appendDataToFile()     // Catch:{ all -> 0x00fe }
            java.lang.StringBuilder r0 = r12.eventDataBuffer     // Catch:{ all -> 0x00fe }
            int r0 = r0.length()     // Catch:{ all -> 0x00fe }
            int r3 = r13.length()     // Catch:{ all -> 0x00fe }
            int r0 = r0 + r3
            int r3 = SEPARATOR_DATA_LEN     // Catch:{ all -> 0x00fe }
            int r0 = r0 + r3
            int r3 = r12.eventBufferLength     // Catch:{ all -> 0x00fe }
            if (r0 <= r3) goto L_0x00f9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            r0.<init>()     // Catch:{ all -> 0x00fe }
            r0.append(r13)     // Catch:{ all -> 0x00fe }
            java.lang.String r13 = "$$"
            r0.append(r13)     // Catch:{ all -> 0x00fe }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x00fe }
            boolean r0 = android.webkit.URLUtil.isValidUrl(r2)     // Catch:{ all -> 0x00d8 }
            r0 = r0 ^ r5
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            int r3 = android.text.TextUtils.indexOf(r3, r4)     // Catch:{ all -> 0x00d8 }
            r4 = 5
            int r3 = r3 + r4
            r6 = 0
            long r7 = android.widget.ExpandableListView.getPackedPositionForChild(r6, r6)     // Catch:{ all -> 0x00d8 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            int r7 = 151 - r11
            int r8 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch:{ all -> 0x00d8 }
            r9 = 16
            int r8 = r8 >> r9
            int r8 = r8 + r1
            char[] r4 = new char[r4]     // Catch:{ all -> 0x00d8 }
            r4[r6] = r9     // Catch:{ all -> 0x00d8 }
            r9 = 17
            r4[r5] = r9     // Catch:{ all -> 0x00d8 }
            r9 = 65524(0xfff4, float:9.1819E-41)
            r4[r1] = r9     // Catch:{ all -> 0x00d8 }
            r9 = 3
            r10 = 65513(0xffe9, float:9.1803E-41)
            r4[r9] = r10     // Catch:{ all -> 0x00d8 }
            r9 = 4
            r4[r9] = r1     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = setMin(r0, r3, r7, r8, r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = r0.intern()     // Catch:{ all -> 0x00d8 }
            byte[] r13 = r13.getBytes(r0)     // Catch:{ all -> 0x00d8 }
            int r0 = r13.length     // Catch:{ all -> 0x00d8 }
            r12.onAppend(r13, r6, r0)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r12)
            return
        L_0x00d8:
            boolean r13 = r12.isBufferToBytesError     // Catch:{ all -> 0x00fe }
            if (r13 != 0) goto L_0x00de
            r12.isBufferToBytesError = r5     // Catch:{ all -> 0x00fe }
        L_0x00de:
            int r13 = getMin     // Catch:{ all -> 0x00fe }
            int r13 = r13 + 87
            int r0 = r13 % 128
            getMax = r0     // Catch:{ all -> 0x00fe }
            int r13 = r13 % r1
            r0 = 12
            if (r13 != 0) goto L_0x00ee
            r13 = 12
            goto L_0x00f0
        L_0x00ee:
            r13 = 72
        L_0x00f0:
            if (r13 == r0) goto L_0x00f4
            monitor-exit(r12)
            return
        L_0x00f4:
            int r13 = r2.length     // Catch:{ all -> 0x00f7 }
            monitor-exit(r12)
            return
        L_0x00f7:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00fe }
        L_0x00f9:
            r12.appendDataToBuffer(r13)     // Catch:{ all -> 0x00fe }
            monitor-exit(r12)
            return
        L_0x00fe:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.LogFileLogAppender.onAppend(java.lang.String):void");
    }

    private void appendDataToBuffer(String str) {
        try {
            int i = getMin + 1;
            try {
                getMax = i % 128;
                int i2 = i % 2;
                StringBuilder sb = this.eventDataBuffer;
                sb.append(str);
                sb.append("$$");
                int i3 = getMax + 29;
                getMin = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 52 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|(1:8)|9|(1:11)|(1:13)(4:14|15|16|17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0073, code lost:
        if ((r0 % 2) == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0075, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0076, code lost:
        if (r1 != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r11.eventDataBuffer.setLength(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0061, code lost:
        if (r11.isBufferToBytesError == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0063, code lost:
        r11.isBufferToBytesError = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0065, code lost:
        r11.eventDataBuffer.setLength(0);
        r0 = getMin + 97;
        getMax = r0 % 128;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean appendDataToFile() {
        /*
            r11 = this;
            java.lang.String r0 = ""
            int r1 = getMax
            int r1 = r1 + 9
            int r2 = r1 % 128
            getMin = r2
            r2 = 2
            int r1 = r1 % r2
            r1 = 1
            r3 = 0
            java.lang.StringBuilder r4 = r11.eventDataBuffer     // Catch:{ all -> 0x005f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x005f }
            boolean r5 = android.text.TextUtils.equals(r0, r0)     // Catch:{ all -> 0x005f }
            r6 = 48
            int r0 = android.text.TextUtils.lastIndexOf(r0, r6, r3)     // Catch:{ all -> 0x005f }
            int r0 = r0 + 6
            int r6 = android.graphics.Color.green(r3)     // Catch:{ all -> 0x005f }
            int r6 = r6 + 152
            float r7 = android.view.ViewConfiguration.getScrollFriction()     // Catch:{ all -> 0x005f }
            r8 = 0
            r9 = 3
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            int r7 = 3 - r7
            r8 = 5
            char[] r8 = new char[r8]     // Catch:{ all -> 0x005f }
            r10 = 16
            r8[r3] = r10     // Catch:{ all -> 0x005f }
            r10 = 17
            r8[r1] = r10     // Catch:{ all -> 0x005f }
            r10 = 65524(0xfff4, float:9.1819E-41)
            r8[r2] = r10     // Catch:{ all -> 0x005f }
            r10 = 65513(0xffe9, float:9.1803E-41)
            r8[r9] = r10     // Catch:{ all -> 0x005f }
            r9 = 4
            r8[r9] = r2     // Catch:{ all -> 0x005f }
            java.lang.String r0 = setMin(r5, r0, r6, r7, r8)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r0.intern()     // Catch:{ all -> 0x005f }
            byte[] r0 = r4.getBytes(r0)     // Catch:{ all -> 0x005f }
            int r4 = r0.length     // Catch:{ all -> 0x005f }
            boolean r0 = r11.onAppend(r0, r3, r4)     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r1 = r11.eventDataBuffer
            r1.setLength(r3)
            return r0
        L_0x005f:
            boolean r0 = r11.isBufferToBytesError     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0065
            r11.isBufferToBytesError = r1     // Catch:{ all -> 0x0080 }
        L_0x0065:
            java.lang.StringBuilder r0 = r11.eventDataBuffer
            r0.setLength(r3)
            int r0 = getMin
            int r0 = r0 + 97
            int r4 = r0 % 128
            getMax = r4
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x0076
            r1 = 0
        L_0x0076:
            if (r1 == 0) goto L_0x0079
            return r3
        L_0x0079:
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x007e }
            return r3
        L_0x007e:
            r0 = move-exception
            throw r0
        L_0x0080:
            r0 = move-exception
            java.lang.StringBuilder r1 = r11.eventDataBuffer
            r1.setLength(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.LogFileLogAppender.appendDataToFile():boolean");
    }

    /* access modifiers changed from: protected */
    public void cleanExpiresFile(File file, long j, long j2) {
        File[] fileArr;
        File[] fileArr2;
        if (file != null) {
            try {
                int i = getMax + 11;
                getMin = i % 128;
                int i2 = i % 2;
                if (file.isDirectory()) {
                    File[] fileArr3 = null;
                    try {
                        fileArr = file.listFiles();
                    } catch (Throwable unused) {
                        fileArr = fileArr3;
                    }
                    if ((fileArr != null ? 5 : '4') != '4' && fileArr.length != 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j3 = currentTimeMillis - j;
                        long j4 = currentTimeMillis + j;
                        int length = fileArr.length;
                        int i3 = 0;
                        while (true) {
                            boolean z = true;
                            if ((i3 < length ? 'R' : 17) == 17) {
                                break;
                            }
                            File file2 = fileArr[i3];
                            if ((file2 != null ? '3' : 3) != 3) {
                                if ((file2.exists() ? 21 : 'R') != 'R' && file2.isFile()) {
                                    try {
                                        long parseLong = Long.parseLong(file2.getName().split("_")[0]);
                                        if (parseLong < j3) {
                                            z = false;
                                        }
                                        if (z) {
                                            try {
                                                int i4 = getMin + 61;
                                                getMax = i4 % 128;
                                                int i5 = i4 % 2;
                                                if ((parseLong > j4 ? '?' : Typography.amp) != '?') {
                                                }
                                            } catch (Exception e) {
                                                throw e;
                                            }
                                        }
                                        file2.delete();
                                        file2.getName();
                                    } catch (Throwable unused2) {
                                        file2.getName();
                                    }
                                }
                            }
                            i3++;
                        }
                        if (FileUtil.getFolderSize(file) >= j2) {
                            try {
                                fileArr2 = file.listFiles();
                            } catch (Throwable unused3) {
                                fileArr2 = fileArr3;
                            }
                            if (fileArr2 != null) {
                                int i6 = getMin + 85;
                                getMax = i6 % 128;
                                if (!(i6 % 2 == 0)) {
                                    if (fileArr2.length < 4) {
                                        return;
                                    }
                                } else if (fileArr2.length < 3) {
                                    return;
                                }
                                Arrays.sort(fileArr2, CLEAN_FILE_COMPARATOR);
                                int length2 = fileArr2.length / 4;
                                int i7 = 0;
                                while (i7 < length2) {
                                    File file3 = fileArr2[i7];
                                    if ((file3 != null ? '4' : '/') == '4' && file3.exists()) {
                                        int i8 = getMin + 29;
                                        getMax = i8 % 128;
                                        if (i8 % 2 == 0) {
                                            boolean isFile = file3.isFile();
                                            try {
                                                super.hashCode();
                                                if (!isFile) {
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        } else {
                                            if (!file3.isFile()) {
                                            }
                                        }
                                        try {
                                            file3.delete();
                                            file3.getName();
                                        } catch (Throwable unused4) {
                                            file3.getName();
                                        }
                                    }
                                    i7++;
                                    int i9 = getMax + 55;
                                    getMin = i9 % 128;
                                    int i10 = i9 % 2;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private static String setMin(boolean z, int i, int i2, int i3, char[] cArr) {
        char[] cArr2 = new char[i];
        int i4 = getMax + 7;
        getMin = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        int i7 = 0;
        while (i7 < i) {
            try {
                int i8 = getMax + 125;
                try {
                    getMin = i8 % 128;
                    if ((i8 % 2 != 0 ? 'b' : 'I') != 'I') {
                        cArr2[i7] = (char) (i2 / cArr[i7]);
                        cArr2[i7] = (char) (cArr2[i7] / setMin);
                        i7 += 101;
                    } else {
                        cArr2[i7] = (char) (cArr[i7] + i2);
                        cArr2[i7] = (char) (cArr2[i7] - setMin);
                        i7++;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (i3 > 0) {
            int i9 = getMin + 79;
            getMax = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            int i11 = i - i3;
            System.arraycopy(cArr3, 0, cArr2, i11, i3);
            System.arraycopy(cArr3, i3, cArr2, 0, i11);
        }
        if (!(!z)) {
            int i12 = getMax + 13;
            getMin = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i];
            while (true) {
                if ((i6 < i ? 14 : '=') == '=') {
                    break;
                }
                cArr4[i6] = cArr2[(i - i6) - 1];
                i6++;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i14 = getMax + 99;
        getMin = i14 % 128;
        int i15 = i14 % 2;
        return str;
    }
}
