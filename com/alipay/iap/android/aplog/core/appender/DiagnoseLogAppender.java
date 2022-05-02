package com.alipay.iap.android.aplog.core.appender;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.util.FileUtil;
import com.alipay.iap.android.aplog.util.HybridEncryption;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import java.io.File;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import kotlin.text.Typography;

public class DiagnoseLogAppender extends EncryptAppender {
    private static final Comparator<File> CLEAN_FILE_COMPARATOR = new Comparator<File>() {
        public final int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    private static final int CLEAN_FILE_SCOPE = 4;
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final String SEPARATOR_DATA = "$$";
    private static final int SEPARATOR_DATA_LEN = 2;
    private static int getMax = 0;
    private static int getMin = 0;
    private static int setMax = 1;
    private volatile double cleaningRate = 0.25d;
    private File currentLogFile;
    private long currentLogRoll;
    private int eventBufferLength;
    private StringBuilder eventDataBuffer;
    private volatile long expiredSize;
    private volatile long expiredTime;
    private long fileRollTime;
    private boolean isBufferToBytesError;
    private boolean isHybridEncryptError;
    private File mCurrentLogsDir;

    static void getMin() {
        getMax = 75;
    }

    static {
        getMin();
        int i = getMin + 27;
        setMax = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public DiagnoseLogAppender(LogContext logContext, String str, long j, long j2, long j3, int i) {
        super(logContext, str);
        this.fileRollTime = j;
        this.expiredTime = j2;
        this.expiredSize = j3;
        int i2 = i / 2;
        this.eventBufferLength = i2;
        this.eventDataBuffer = new StringBuilder(i2);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.File] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r12.currentLogFile.getName().equals(r0) == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File getFile() {
        /*
            r12 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r12.fileRollTime
            long r0 = r0 / r2
            long r0 = r0 * r2
            r12.currentLogRoll = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r12.currentLogRoll
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = r12.processTag
            r0.append(r1)
            boolean r1 = com.alipay.iap.android.aplog.util.LoggingUtil.isDebuggable()
            if (r1 == 0) goto L_0x003b
            java.lang.String r1 = "_dev"
            r0.append(r1)
            int r1 = getMin     // Catch:{ Exception -> 0x0035 }
            int r1 = r1 + 25
            int r2 = r1 % 128
            setMax = r2     // Catch:{ Exception -> 0x0035 }
            int r1 = r1 % 2
            goto L_0x003b
        L_0x0035:
            r0 = move-exception
            goto L_0x00f4
        L_0x0038:
            r0 = move-exception
            goto L_0x00b7
        L_0x003b:
            java.lang.String r1 = "_applog"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = r12.currentLogFile
            r2 = 78
            if (r1 == 0) goto L_0x004d
            r1 = 22
            goto L_0x004f
        L_0x004d:
            r1 = 78
        L_0x004f:
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x006d
            java.io.File r1 = r12.currentLogFile
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x005d
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == r4) goto L_0x0061
            goto L_0x006d
        L_0x0061:
            java.io.File r1 = r12.currentLogFile
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00f1
        L_0x006d:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "checkAndRollFile: "
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "Appender"
            r1.info(r5, r2)
            java.io.File r1 = r12.currentLogFile
            if (r1 == 0) goto L_0x0086
            r1 = 0
            goto L_0x0087
        L_0x0086:
            r1 = 1
        L_0x0087:
            r2 = 0
            if (r1 == r4) goto L_0x00b8
            int r1 = setMax
            int r1 = r1 + 9
            int r6 = r1 % 128
            getMin = r6
            int r1 = r1 % 2
            java.io.File r1 = r12.currentLogFile
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r3 = 1
        L_0x009e:
            if (r3 == r4) goto L_0x00b8
            int r1 = setMax
            int r1 = r1 + 21
            int r3 = r1 % 128
            getMin = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x00b3
            r12.flush()
            int r1 = r2.length     // Catch:{ all -> 0x00b1 }
            goto L_0x00b8
        L_0x00b1:
            r0 = move-exception
            throw r0
        L_0x00b3:
            r12.flush()     // Catch:{ Exception -> 0x0038 }
            goto L_0x00b8
        L_0x00b7:
            throw r0
        L_0x00b8:
            java.io.File r1 = r12.getCurrentLogsDir()
            if (r1 != 0) goto L_0x00d6
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "currentLogDir is NULl with "
            r1.<init>(r3)
            java.lang.String r3 = r12.logCategory
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.error((java.lang.String) r5, (java.lang.String) r1)
            return r2
        L_0x00d6:
            long r8 = r12.expiredTime     // Catch:{ all -> 0x00e0 }
            long r10 = r12.expiredSize     // Catch:{ all -> 0x00e0 }
            r6 = r12
            r7 = r1
            r6.cleanExpiresFile(r7, r8, r10)     // Catch:{ all -> 0x00e0 }
            goto L_0x00ea
        L_0x00e0:
            r2 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r3 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()
            java.lang.String r4 = "clean currentLogDir"
            r3.warn(r5, r4, r2)
        L_0x00ea:
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
            r12.currentLogFile = r2     // Catch:{ Exception -> 0x0035 }
        L_0x00f1:
            java.io.File r0 = r12.currentLogFile
            return r0
        L_0x00f4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.DiagnoseLogAppender.getFile():java.io.File");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0024, code lost:
        if (r0 == 0) goto L_0x0026;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0032=Splitter:B:26:0x0032, B:22:0x0026=Splitter:B:22:0x0026} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void flush() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = setMax     // Catch:{ Exception -> 0x0060 }
            int r0 = r0 + 15
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x0060 }
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r1) goto L_0x001c
            java.lang.StringBuilder r0 = r4.eventDataBuffer     // Catch:{ all -> 0x005e }
            int r0 = r0.length()     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0032
            goto L_0x0026
        L_0x001c:
            java.lang.StringBuilder r0 = r4.eventDataBuffer     // Catch:{ all -> 0x005e }
            int r0 = r0.length()     // Catch:{ all -> 0x005e }
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0032
        L_0x0026:
            int r0 = setMax     // Catch:{ all -> 0x005e }
            int r0 = r0 + 9
            int r1 = r0 % 128
            getMin = r1     // Catch:{ all -> 0x005e }
            int r0 = r0 % 2
            monitor-exit(r4)
            return
        L_0x0032:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "Appender"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r2.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r3 = r4.logCategory     // Catch:{ all -> 0x005e }
            r2.append(r3)     // Catch:{ all -> 0x005e }
            java.lang.String r3 = " appender flush: "
            r2.append(r3)     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r3 = r4.eventDataBuffer     // Catch:{ all -> 0x005e }
            int r3 = r3.length()     // Catch:{ all -> 0x005e }
            r2.append(r3)     // Catch:{ all -> 0x005e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005e }
            r0.verbose(r1, r2)     // Catch:{ all -> 0x005e }
            r4.appendBufferToFile()     // Catch:{ all -> 0x005e }
            monitor-exit(r4)
            return
        L_0x005c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            goto L_0x0062
        L_0x0060:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0062:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.DiagnoseLogAppender.flush():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (((r11.eventDataBuffer.length() / r12.length()) % SEPARATOR_DATA_LEN) > r11.eventBufferLength) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onAppend(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = getMin     // Catch:{ all -> 0x00e0 }
            int r0 = r0 + 29
            int r1 = r0 % 128
            setMax = r1     // Catch:{ all -> 0x00e0 }
            r1 = 2
            int r0 = r0 % r1
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r11)
            return
        L_0x0013:
            java.lang.StringBuilder r0 = r11.eventDataBuffer     // Catch:{ all -> 0x00e0 }
            int r0 = r0.length()     // Catch:{ all -> 0x00e0 }
            int r2 = r12.length()     // Catch:{ all -> 0x00e0 }
            int r0 = r0 + r2
            int r2 = SEPARATOR_DATA_LEN     // Catch:{ all -> 0x00e0 }
            int r0 = r0 + r2
            int r2 = r11.eventBufferLength     // Catch:{ all -> 0x00e0 }
            r3 = 1
            r4 = 0
            if (r0 <= r2) goto L_0x0029
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r0 == r3) goto L_0x00db
            int r0 = setMax     // Catch:{ all -> 0x00e0 }
            int r0 = r0 + 87
            int r2 = r0 % 128
            getMin = r2     // Catch:{ all -> 0x00e0 }
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            if (r0 == 0) goto L_0x0052
            r11.appendBufferToFile()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r0 = r11.eventDataBuffer     // Catch:{ all -> 0x00e0 }
            int r0 = r0.length()     // Catch:{ all -> 0x00e0 }
            int r2 = r12.length()     // Catch:{ all -> 0x00e0 }
            int r0 = r0 + r2
            int r2 = SEPARATOR_DATA_LEN     // Catch:{ all -> 0x00e0 }
            int r0 = r0 + r2
            int r2 = r11.eventBufferLength     // Catch:{ all -> 0x00e0 }
            if (r0 <= r2) goto L_0x00d6
            goto L_0x0067
        L_0x0052:
            r11.appendBufferToFile()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r0 = r11.eventDataBuffer     // Catch:{ all -> 0x00e0 }
            int r0 = r0.length()     // Catch:{ all -> 0x00e0 }
            int r2 = r12.length()     // Catch:{ all -> 0x00e0 }
            int r0 = r0 / r2
            int r2 = SEPARATOR_DATA_LEN     // Catch:{ all -> 0x00e0 }
            int r0 = r0 % r2
            int r2 = r11.eventBufferLength     // Catch:{ all -> 0x00e0 }
            if (r0 <= r2) goto L_0x00d6
        L_0x0067:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r0.<init>()     // Catch:{ all -> 0x00e0 }
            r0.append(r12)     // Catch:{ all -> 0x00e0 }
            java.lang.String r12 = "$$"
            r0.append(r12)     // Catch:{ all -> 0x00e0 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x00e0 }
            boolean r0 = android.view.KeyEvent.metaStateHasModifiers(r4, r4)     // Catch:{ all -> 0x00c2 }
            int r2 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ all -> 0x00c2 }
            r5 = 16
            int r2 = r2 >> r5
            r6 = 5
            int r2 = 5 - r2
            int r7 = android.graphics.Color.green(r4)     // Catch:{ all -> 0x00c2 }
            int r7 = 143 - r7
            int r8 = android.graphics.drawable.Drawable.resolveOpacity(r4, r4)     // Catch:{ all -> 0x00c2 }
            r9 = 4
            int r8 = r8 + r9
            char[] r6 = new char[r6]     // Catch:{ all -> 0x00c2 }
            r10 = 65513(0xffe9, float:9.1803E-41)
            r6[r4] = r10     // Catch:{ all -> 0x00c2 }
            r6[r3] = r1     // Catch:{ all -> 0x00c2 }
            r6[r1] = r5     // Catch:{ all -> 0x00c2 }
            r5 = 3
            r10 = 17
            r6[r5] = r10     // Catch:{ all -> 0x00c2 }
            r5 = 65524(0xfff4, float:9.1819E-41)
            r6[r9] = r5     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = length(r0, r2, r7, r8, r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r0.intern()     // Catch:{ all -> 0x00c2 }
            byte[] r12 = r12.getBytes(r0)     // Catch:{ all -> 0x00c2 }
            int r0 = r12.length     // Catch:{ all -> 0x00c2 }
            r11.onAppend(r12, r4, r0)     // Catch:{ all -> 0x00c2 }
            int r12 = setMax     // Catch:{ all -> 0x00e0 }
            int r12 = r12 + 105
            int r0 = r12 % 128
            getMin = r0     // Catch:{ all -> 0x00e0 }
            int r12 = r12 % r1
            monitor-exit(r11)
            return
        L_0x00c2:
            r12 = move-exception
            boolean r0 = r11.isBufferToBytesError     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x00d4
            r11.isBufferToBytesError = r3     // Catch:{ all -> 0x00e0 }
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "Appender"
            java.lang.String r2 = "appendLogEvent"
            r0.error(r1, r2, r12)     // Catch:{ all -> 0x00e0 }
        L_0x00d4:
            monitor-exit(r11)
            return
        L_0x00d6:
            r11.appendDataToBuffer(r12)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r11)
            return
        L_0x00db:
            r11.appendDataToBuffer(r12)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r11)
            return
        L_0x00e0:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.DiagnoseLogAppender.onAppend(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public boolean writeFile(String str) {
        File file;
        int i = getMin + 35;
        setMax = i % 128;
        if (i % 2 == 0) {
            try {
                file = getFile();
                Object obj = null;
                super.hashCode();
                if ((file != null ? 13 : 'b') != 13) {
                    return true;
                }
            } catch (Throwable th) {
                if (this.isAppendStringError) {
                    return false;
                }
                this.isAppendStringError = true;
                LoggerFactory.getInnerTraceLogger().error("Appender", this.logCategory, th);
                return false;
            }
        } else {
            file = getFile();
            if ((file != null ? '(' : 16) != '(') {
                return true;
            }
        }
        FileUtil.writeFile(file, str, true);
        int i2 = setMax + 17;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onAppend(byte[] bArr, int i, int i2) {
        byte[] bArr2 = null;
        try {
            bArr2 = LoggingUtil.gzipDataByBytes(bArr, i, i2);
        } catch (Throwable th) {
            if (!this.isGzipBytesError) {
                this.isGzipBytesError = true;
                LoggerFactory.getInnerTraceLogger().error("Appender", this.logCategory, th);
            }
        }
        if (bArr2 == null) {
            return false;
        }
        byte[] encrypt = HybridEncryption.getInstance().encrypt(bArr2, 0, bArr2.length);
        byte[] secureSeed = HybridEncryption.getInstance().getSecureSeed();
        if ((encrypt != null ? '/' : 'N') == '/') {
            int i3 = getMin + 61;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            if ((secureSeed == null ? 'A' : 'R') != 'A') {
                if (secureSeed.length <= 32767) {
                    return FileUtil.writeEncryptedContent(encrypt, secureSeed, getFile());
                }
                TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
                StringBuilder sb = new StringBuilder("the length of secure seed is too long: ");
                sb.append(secureSeed.length);
                innerTraceLogger.error("Appender", sb.toString());
                return false;
            }
        }
        if (!this.isHybridEncryptError) {
            int i5 = getMin + 99;
            setMax = i5 % 128;
            int i6 = i5 % 2;
            try {
                this.isHybridEncryptError = true;
                LoggerFactory.getInnerTraceLogger().error("Appender", "HybridEncryption.encrypt occured error");
            } catch (Exception e) {
                throw e;
            }
        }
        return false;
    }

    private File getCurrentLogsDir() {
        try {
            Object[] objArr = null;
            if (this.mCurrentLogsDir == null) {
                int i = getMin + 81;
                setMax = i % 128;
                if (i % 2 == 0) {
                    try {
                        this.mCurrentLogsDir = LoggingUtil.getStorageFilesDir(this.appContext, this.logCategory);
                        int length = objArr.length;
                    } catch (Throwable th) {
                        LoggerFactory.getInnerTraceLogger().error("Appender", "getCurrentLogsDir", th);
                    }
                } else {
                    this.mCurrentLogsDir = LoggingUtil.getStorageFilesDir(this.appContext, this.logCategory);
                }
            }
            try {
                if ((this.mCurrentLogsDir != null) && !this.mCurrentLogsDir.exists()) {
                    int i2 = setMax + 103;
                    getMin = i2 % 128;
                    if ((i2 % 2 != 0 ? '!' : '5') != '5') {
                        this.mCurrentLogsDir.mkdirs();
                        super.hashCode();
                    } else {
                        this.mCurrentLogsDir.mkdirs();
                    }
                    try {
                        int i3 = getMin + 99;
                        setMax = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Throwable th2) {
                LoggerFactory.getInnerTraceLogger().error("Appender", "getCurrentLogsDir", th2);
            }
            return this.mCurrentLogsDir;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void cleanExpiresFile(File file, long j, long j2) {
        if (file == null || !file.isDirectory()) {
            return;
        }
        File[] fileArr = null;
        try {
            fileArr = file.listFiles();
        } catch (Throwable th) {
            LoggerFactory.getInnerTraceLogger().error("Appender", "cleanExpiresFile", th);
        }
        if ((fileArr != null ? 'Q' : 'W') == 'W' || fileArr.length == 0) {
            int i = setMax + 77;
            getMin = i % 128;
            int i2 = i % 2;
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - j;
            long j4 = currentTimeMillis + j;
            int length = fileArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                File file2 = fileArr[i3];
                if (!(file2 == null)) {
                    try {
                        if (file2.exists()) {
                            if (file2.isFile()) {
                                try {
                                    String str = file2.getName().split("_")[0];
                                    if (TextUtils.isDigitsOnly(str)) {
                                        int i4 = setMax + 125;
                                        getMin = i4 % 128;
                                        int i5 = i4 % 2;
                                        long parseLong = Long.parseLong(str);
                                        if (parseLong >= j3) {
                                            int i6 = getMin + 51;
                                            setMax = i6 % 128;
                                            int i7 = i6 % 2;
                                            if (parseLong <= j4) {
                                            }
                                        }
                                        file2.delete();
                                        file2.getName();
                                    }
                                } catch (Throwable th2) {
                                    LoggerFactory.getInnerTraceLogger().error("Appender", file2.getName(), th2);
                                }
                            }
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            if (FileUtil.getFolderSize(file) >= j2) {
                try {
                    try {
                        cleanExcessFiles(file.listFiles());
                    } catch (Throwable th3) {
                        th = th3;
                        LoggerFactory.getInnerTraceLogger().warn("Appender", "cleanExpiresFile", th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    LoggerFactory.getInnerTraceLogger().warn("Appender", "cleanExpiresFile", th);
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if ((r10 == null) != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r10 != null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cleanExcessFiles(java.io.File[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Appender"
            int r1 = getMin
            int r1 = r1 + 95
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == r3) goto L_0x001d
            r1 = 58
            int r1 = r1 / r2
            if (r10 == 0) goto L_0x0032
            goto L_0x0025
        L_0x001b:
            r10 = move-exception
            throw r10
        L_0x001d:
            if (r10 == 0) goto L_0x0021
            r1 = 0
            goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            goto L_0x0032
        L_0x0025:
            int r1 = setMax
            int r1 = r1 + 99
            int r4 = r1 % 128
            getMin = r4
            int r1 = r1 % 2
            int r1 = r10.length
            if (r1 > 0) goto L_0x003f
        L_0x0032:
            int r10 = setMax     // Catch:{ Exception -> 0x003d }
            int r10 = r10 + 5
            int r0 = r10 % 128
            getMin = r0     // Catch:{ Exception -> 0x003d }
            int r10 = r10 % 2
            return
        L_0x003d:
            r10 = move-exception
            throw r10
        L_0x003f:
            java.util.Comparator<java.io.File> r1 = CLEAN_FILE_COMPARATOR
            java.util.Arrays.sort(r10, r1)
            int r1 = r10.length
            double r4 = (double) r1
            double r6 = r9.cleaningRate
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r6
            double r4 = java.lang.Math.floor(r4)
            int r1 = (int) r4
            r4 = 0
        L_0x0053:
            if (r4 >= r1) goto L_0x00ac
            r5 = r10[r4]
            if (r5 == 0) goto L_0x00a9
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x0061
            r6 = 0
            goto L_0x0062
        L_0x0061:
            r6 = 1
        L_0x0062:
            if (r6 == r3) goto L_0x00a9
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L_0x00a9
            r5.delete()     // Catch:{ all -> 0x008c }
            com.alipay.iap.android.aplog.core.logger.TraceLogger r6 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            java.lang.String r8 = "cleanExpiresFile: "
            r7.<init>(r8)     // Catch:{ all -> 0x008c }
            java.lang.String r8 = r5.getName()     // Catch:{ all -> 0x008c }
            r7.append(r8)     // Catch:{ all -> 0x008c }
            java.lang.String r8 = " is too large !"
            r7.append(r8)     // Catch:{ all -> 0x008c }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x008c }
            r6.error((java.lang.String) r0, (java.lang.String) r7)     // Catch:{ all -> 0x008c }
            goto L_0x00a9
        L_0x008c:
            r6 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r7 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r5 = r5.getName()
            r8.append(r5)
            java.lang.String r5 = " cleanExpiresFile"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.warn(r0, r5, r6)
        L_0x00a9:
            int r4 = r4 + 1
            goto L_0x0053
        L_0x00ac:
            int r10 = getMin
            int r10 = r10 + 99
            int r0 = r10 % 128
            setMax = r0
            int r10 = r10 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.DiagnoseLogAppender.cleanExcessFiles(java.io.File[]):void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean appendBufferToFile() {
        int i = setMax + 117;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            byte[] bytes = this.eventDataBuffer.toString().getBytes(length(URLUtil.isNetworkUrl("http://"), View.getDefaultSize(0, 0) + 5, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 143, 5 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), new char[]{65513, 2, 16, 17, 65524}).intern());
            boolean onAppend = onAppend(bytes, 0, bytes.length);
            this.eventDataBuffer.setLength(0);
            return onAppend;
        } catch (Throwable th) {
            this.eventDataBuffer.setLength(0);
            throw th;
        }
    }

    private void appendDataToBuffer(String str) {
        int i = getMin + 97;
        setMax = i % 128;
        if ((i % 2 == 0 ? 'I' : 'U') != 'I') {
            try {
                StringBuilder sb = this.eventDataBuffer;
                sb.append(str);
                sb.append("$$");
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                StringBuilder sb2 = this.eventDataBuffer;
                sb2.append(str);
                sb2.append("$$");
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i2 = getMin + 89;
        setMax = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
    }

    public void setExpiredTime(int i) {
        if (i > 0) {
            int i2 = setMax + 77;
            getMin = i2 % 128;
            int i3 = i2 % 2;
            try {
                try {
                    this.expiredTime = TimeUnit.DAYS.toMillis((long) i);
                    int i4 = setMax + 71;
                    getMin = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i6 = getMin + 13;
        setMax = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setExpiredSize(int i) {
        int i2 = getMin + 21;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        if ((i > 0 ? Typography.quote : 0) != 0) {
            int i4 = getMin + 21;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            this.expiredSize = (long) (i * 1024 * 1024);
            int i6 = setMax + 105;
            getMin = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public void setCleaningRate(double d) {
        int i = getMin + 99;
        setMax = i % 128;
        if ((i % 2 == 0 ? '9' : 'I') != 'I') {
            if ((d > 0.0d ? 21 : '7') != 21) {
                return;
            }
        } else {
            if ((d > 0.0d ? 'L' : 16) != 'L') {
                return;
            }
        }
        int i2 = getMin + 73;
        setMax = i2 % 128;
        if (i2 % 2 == 0) {
            this.cleaningRate = d;
            int i3 = 99 / 0;
            return;
        }
        this.cleaningRate = d;
    }

    private static String length(boolean z, int i, int i2, int i3, char[] cArr) {
        char[] cArr2 = new char[i];
        int i4 = setMax + 105;
        getMin = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if (!(i6 < i)) {
                break;
            }
            cArr2[i6] = (char) (cArr[i6] + i2);
            cArr2[i6] = (char) (cArr2[i6] - getMax);
            i6++;
        }
        if (i3 > 0) {
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            int i7 = i - i3;
            System.arraycopy(cArr3, 0, cArr2, i7, i3);
            System.arraycopy(cArr3, i3, cArr2, 0, i7);
        }
        if (z) {
            char[] cArr4 = new char[i];
            int i8 = 0;
            while (true) {
                if ((i8 < i ? '%' : '+') != '%') {
                    break;
                }
                try {
                    int i9 = getMin + 43;
                    setMax = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[i8] = cArr2[(i / i8) << 0];
                        i8 += 61;
                    } else {
                        cArr4[i8] = cArr2[(i - i8) - 1];
                        i8++;
                    }
                    int i10 = setMax + 111;
                    getMin = i10 % 128;
                    int i11 = i10 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
            cArr2 = cArr4;
        }
        return new String(cArr2);
    }
}
