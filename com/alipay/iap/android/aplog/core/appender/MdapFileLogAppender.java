package com.alipay.iap.android.aplog.core.appender;

import android.os.Bundle;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.filter.StrategyManager;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.util.FileUtil;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import java.io.File;

public class MdapFileLogAppender extends AnalyticsLogAppender {
    public static final String ENCRYPT_SIGN = "1_";
    protected static final int MAX_APPEND_BUFFER_COUNT = 3;
    protected static final String MDAP_FILE_DIR = "mdap";
    public static final String TAG = "MdapFileAppender";
    protected static final String UPLOAD_FILE_DIR = "upload";
    protected static final String UPLOAD_FILE_PATH;
    protected StringBuffer appendBuffer = new StringBuffer();
    protected int appendCount;
    protected int bufferCount;
    protected File currentMdapFile;
    protected boolean isFirstAppend = true;

    static {
        StringBuilder sb = new StringBuilder(MDAP_FILE_DIR);
        sb.append(File.separatorChar);
        sb.append(UPLOAD_FILE_DIR);
        UPLOAD_FILE_PATH = sb.toString();
    }

    public MdapFileLogAppender(LogContext logContext, String str) {
        super(logContext, str);
    }

    /* access modifiers changed from: protected */
    public File getFile() {
        if (this.currentMdapFile == null && LoggingUtil.isDebuggable()) {
            File file = null;
            try {
                file = this.appContext.getExternalFilesDir(MDAP_FILE_DIR);
            } catch (Throwable unused) {
            }
            if (file != null) {
                try {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.processTag);
                    sb.append("_");
                    sb.append(this.logCategory);
                    this.currentMdapFile = new File(file, sb.toString());
                } catch (Throwable unused2) {
                }
            }
        }
        TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
        StringBuilder sb2 = new StringBuilder("currentMdapFile debug: ");
        sb2.append(this.currentMdapFile);
        innerTraceLogger.debug(TAG, sb2.toString());
        if (this.currentMdapFile == null) {
            File file2 = new File(this.appContext.getFilesDir(), MDAP_FILE_DIR);
            try {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            } catch (Throwable unused3) {
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.processTag);
            sb3.append("_");
            sb3.append(this.logCategory);
            this.currentMdapFile = new File(file2, sb3.toString());
        }
        TraceLogger innerTraceLogger2 = LoggerFactory.getInnerTraceLogger();
        StringBuilder sb4 = new StringBuilder("currentMdapFile ");
        sb4.append(this.currentMdapFile);
        innerTraceLogger2.debug(TAG, sb4.toString());
        return this.currentMdapFile;
    }

    /* access modifiers changed from: protected */
    public synchronized void flush() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(LogContext.NEED_MOVE, true);
        flush(bundle);
    }

    /* access modifiers changed from: protected */
    public synchronized void flush(Bundle bundle) {
        if (this.bufferCount > 0) {
            TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
            StringBuilder sb = new StringBuilder();
            sb.append(this.logCategory);
            sb.append(" appender flush: ");
            sb.append(this.bufferCount);
            innerTraceLogger.info(TAG, sb.toString());
        }
        if (this.appendBuffer.length() == 0) {
            moveFileByBundle(bundle);
            return;
        }
        onAppend(this.appendBuffer.toString(), StrategyManager.getInstance().needEncrypt(this.logCategory));
        this.appendBuffer.setLength(0);
        this.appendCount += this.bufferCount;
        this.bufferCount = 0;
        moveFileByBundle(bundle);
    }

    private void moveFileByBundle(Bundle bundle) {
        if (bundle != null && bundle.getBoolean(LogContext.NEED_MOVE, false)) {
            try {
                File file = getFile();
                if (file.exists()) {
                    FileUtil.moveFile(file, getUploadFile());
                    TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.logCategory);
                    sb.append(" appender flush move ");
                    sb.append(this.appendCount);
                    innerTraceLogger.info(TAG, sb.toString());
                    this.appendCount = 0;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|(4:4|5|6|(1:8))|9|10|(1:20)|21|(1:23)|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onAppend(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "MdapFileAppender"
            java.lang.String r2 = "write log: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00ce }
            r0.debug(r1, r2)     // Catch:{ all -> 0x00ce }
            boolean r0 = r5.isFirstAppend     // Catch:{ all -> 0x00ce }
            r1 = 0
            if (r0 == 0) goto L_0x003e
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "MdapFileAppender"
            java.lang.String r3 = " isFirstAppend "
            r0.debug(r2, r3)     // Catch:{ all -> 0x00ce }
            r5.isFirstAppend = r1     // Catch:{ all -> 0x00ce }
            java.io.File r0 = r5.getFile()     // Catch:{ all -> 0x003e }
            java.lang.String r0 = com.alipay.iap.android.aplog.util.FileUtil.readFile(r0)     // Catch:{ all -> 0x003e }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = "\\$\\$"
            java.lang.String[] r0 = r0.split(r2)     // Catch:{ all -> 0x003e }
            int r0 = r0.length     // Catch:{ all -> 0x003e }
            r5.appendCount = r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            java.lang.StringBuffer r0 = r5.appendBuffer     // Catch:{ all -> 0x00ce }
            r0.append(r6)     // Catch:{ all -> 0x00ce }
            int r6 = r5.bufferCount     // Catch:{ all -> 0x00ce }
            int r6 = r6 + 1
            r5.bufferCount = r6     // Catch:{ all -> 0x00ce }
            com.alipay.iap.android.aplog.api.ProcessInfo r6 = com.alipay.iap.android.aplog.core.LoggerFactory.getProcessInfo()     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.isMainProcess()     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x0074
            boolean r6 = com.alipay.iap.android.aplog.core.os.LogLifecycleCallback.isBackground     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x0074
            int r6 = r5.bufferCount     // Catch:{ all -> 0x00ce }
            r0 = 3
            if (r6 >= r0) goto L_0x0074
            boolean r6 = com.alipay.iap.android.aplog.util.LoggingUtil.isDebuggable()     // Catch:{ all -> 0x00ce }
            if (r6 != 0) goto L_0x0074
            com.alipay.iap.android.aplog.api.LogContext r6 = com.alipay.iap.android.aplog.core.LoggerFactory.getLogContext()     // Catch:{ all -> 0x00ce }
            com.alipay.iap.android.aplog.core.filter.Filter r6 = r6.getFilter()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r5.logCategory     // Catch:{ all -> 0x00ce }
            int r2 = r5.bufferCount     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.shouldUpload(r0, r2)     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x00a8
        L_0x0074:
            com.alipay.iap.android.aplog.core.filter.StrategyManager r6 = com.alipay.iap.android.aplog.core.filter.StrategyManager.getInstance()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r5.logCategory     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.needEncrypt(r0)     // Catch:{ all -> 0x00ce }
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getInnerTraceLogger()     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "MdapFileAppender"
            java.lang.String r3 = "isEncrypt "
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x00ce }
            r0.debug(r2, r3)     // Catch:{ all -> 0x00ce }
            java.lang.StringBuffer r0 = r5.appendBuffer     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ce }
            r5.onAppend(r0, r6)     // Catch:{ all -> 0x00ce }
            int r6 = r5.appendCount     // Catch:{ all -> 0x00ce }
            int r0 = r5.bufferCount     // Catch:{ all -> 0x00ce }
            int r6 = r6 + r0
            r5.appendCount = r6     // Catch:{ all -> 0x00ce }
            java.lang.StringBuffer r6 = r5.appendBuffer     // Catch:{ all -> 0x00ce }
            r6.setLength(r1)     // Catch:{ all -> 0x00ce }
            r5.bufferCount = r1     // Catch:{ all -> 0x00ce }
        L_0x00a8:
            com.alipay.iap.android.aplog.api.LogContext r6 = com.alipay.iap.android.aplog.core.LoggerFactory.getLogContext()     // Catch:{ all -> 0x00ce }
            com.alipay.iap.android.aplog.core.filter.Filter r6 = r6.getFilter()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r5.logCategory     // Catch:{ all -> 0x00ce }
            int r2 = r5.appendCount     // Catch:{ all -> 0x00ce }
            boolean r6 = r6.shouldUpload(r0, r2)     // Catch:{ all -> 0x00ce }
            if (r6 == 0) goto L_0x00cc
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x00ce }
            r6.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "event"
            java.lang.String r2 = "maxLogCount"
            r6.putString(r0, r2)     // Catch:{ all -> 0x00ce }
            r0 = 0
            r5.upload(r0, r6)     // Catch:{ all -> 0x00ce }
            r5.appendCount = r1     // Catch:{ all -> 0x00ce }
        L_0x00cc:
            monitor-exit(r5)
            return
        L_0x00ce:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.MdapFileLogAppender.onAppend(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void upload() {
        upload((String) null);
    }

    /* access modifiers changed from: protected */
    public void upload(String str) {
        upload(str, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    public void upload(String str, Bundle bundle) {
        if (this.appendCount != 0) {
            try {
                TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
                StringBuilder sb = new StringBuilder("move file form: ");
                sb.append(getFile());
                sb.append(" to: ");
                sb.append(getUploadFile());
                innerTraceLogger.debug(TAG, sb.toString());
                FileUtil.moveFile(getFile(), getUploadFile());
            } catch (Throwable th) {
                LoggerFactory.getInnerTraceLogger().error(TAG, this.logCategory, th);
                return;
            }
            this.appendCount = 0;
            this.logContext.upload(this.logCategory, str, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public File getUploadFile() {
        File file = new File(this.appContext.getFilesDir(), UPLOAD_FILE_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, LoggingUtil.getMdapStyleName(getFile().getName()));
        TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
        StringBuilder sb = new StringBuilder("file to upload: ");
        sb.append(file2.getAbsolutePath());
        innerTraceLogger.debug(TAG, sb.toString());
        return file2;
    }
}
