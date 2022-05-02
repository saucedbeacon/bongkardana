package com.alipay.iap.android.aplog.core.uploader;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.filter.ConfigChangeBroadCastReceiver;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import java.io.File;
import java.util.Comparator;

public class UploadManager {
    public static final Comparator<File> CLEAN_FILE_COMPARATOR = new Comparator<File>() {
        public final int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    private static UploadManager INSTANCE = null;
    public static final String LOG_FILE_PATH = "/mdap/";
    public static int MAX_UPLOAD_FILE_SIZE = 10485760;
    public static final int MIN_CLEAN_FILE_SCOPE = 4;
    public static final String STATISTICS_URL_PATH = "/loggw/logUpload.do";
    public static final String TAG = "UploadManager";
    public static final String UPLOAD_FILE_PATH = "/mdap/upload/";
    private Context context;
    private ConfigChangeBroadCastReceiver mConfigChangeBroadCastReceiver;
    private File uploadFileDir;

    private UploadManager(Context context2) {
        this.context = context2;
        StringBuilder sb = new StringBuilder();
        sb.append(context2.getFilesDir().getAbsolutePath());
        sb.append(UPLOAD_FILE_PATH);
        File file = new File(sb.toString());
        this.uploadFileDir = file;
        if (!file.exists()) {
            this.uploadFileDir.mkdirs();
        }
        registerConfigChangeBroadCastReceiver();
    }

    public static UploadManager createInstancecreateInstance(Context context2) {
        if (INSTANCE == null) {
            INSTANCE = new UploadManager(context2);
        }
        return INSTANCE;
    }

    public static UploadManager getIntance() {
        return INSTANCE;
    }

    public void setMaxUploadFileSize(int i) {
        MAX_UPLOAD_FILE_SIZE = i;
    }

    private void registerConfigChangeBroadCastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.mobile.client.multi.CONFIG_CHANGE");
        ConfigChangeBroadCastReceiver configChangeBroadCastReceiver = new ConfigChangeBroadCastReceiver();
        this.mConfigChangeBroadCastReceiver = configChangeBroadCastReceiver;
        Context context2 = this.context;
        if (context2 != null) {
            context2.registerReceiver(configChangeBroadCastReceiver, intentFilter);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084 A[SYNTHETIC, Splitter:B:23:0x0084] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void syncLog() {
        /*
            r10 = this;
            java.lang.String r0 = "mdap"
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r3 = r10.context
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r3 = r3.getAbsolutePath()
            r2.append(r3)
            java.lang.String r3 = "/mdap/"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            boolean r2 = com.alipay.iap.android.aplog.util.LoggingUtil.isDebuggable()
            java.lang.String r3 = "UploadManager"
            r4 = 0
            if (r2 == 0) goto L_0x0081
            android.content.Context r2 = r10.context     // Catch:{ all -> 0x0045 }
            java.io.File r4 = r2.getExternalFilesDir(r0)     // Catch:{ all -> 0x0045 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = "upload"
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0045 }
            boolean r4 = r2.exists()     // Catch:{ all -> 0x0043 }
            if (r4 != 0) goto L_0x005b
            r2.mkdirs()     // Catch:{ all -> 0x0043 }
            goto L_0x005b
        L_0x0043:
            r4 = move-exception
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
        L_0x0049:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r5 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "syncLog backupFileDir: "
            java.lang.String r4 = r6.concat(r4)
            r5.error((java.lang.String) r3, (java.lang.String) r4)
        L_0x005b:
            r4 = r2
            android.content.Context r2 = r10.context     // Catch:{ all -> 0x006e }
            java.io.File r1 = r2.getExternalFilesDir(r0)     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0081
            boolean r0 = r1.exists()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0081
            r1.mkdirs()     // Catch:{ all -> 0x006e }
            goto L_0x0081
        L_0x006e:
            r0 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r2 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "syncLog logFileDir: "
            java.lang.String r0 = r5.concat(r0)
            r2.error((java.lang.String) r3, (java.lang.String) r0)
        L_0x0081:
            if (r1 != 0) goto L_0x0084
            return
        L_0x0084:
            java.io.File[] r0 = r1.listFiles()     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x008b
            return
        L_0x008b:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            java.lang.String r5 = "syncLog: "
            r2.<init>(r5)     // Catch:{ all -> 0x00fd }
            int r5 = r0.length     // Catch:{ all -> 0x00fd }
            r2.append(r5)     // Catch:{ all -> 0x00fd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00fd }
            r1.info(r3, r2)     // Catch:{ all -> 0x00fd }
            int r1 = r0.length     // Catch:{ all -> 0x00fd }
            r2 = 0
        L_0x00a4:
            if (r2 >= r1) goto L_0x00fc
            r5 = r0[r2]     // Catch:{ all -> 0x00fd }
            if (r5 == 0) goto L_0x00f9
            boolean r6 = r5.exists()     // Catch:{ all -> 0x00fd }
            if (r6 == 0) goto L_0x00f9
            boolean r6 = r5.isFile()     // Catch:{ all -> 0x00fd }
            if (r6 == 0) goto L_0x00f9
            java.lang.String r6 = r5.getName()     // Catch:{ all -> 0x00d9 }
            java.lang.String r6 = com.alipay.iap.android.aplog.util.LoggingUtil.getMdapStyleName(r6)     // Catch:{ all -> 0x00d9 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00d9 }
            java.io.File r8 = r10.uploadFileDir     // Catch:{ all -> 0x00d9 }
            r7.<init>(r8, r6)     // Catch:{ all -> 0x00d9 }
            boolean r8 = com.alipay.iap.android.aplog.util.LoggingUtil.isDebuggable()     // Catch:{ all -> 0x00d9 }
            if (r8 == 0) goto L_0x00d5
            if (r4 == 0) goto L_0x00d5
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x00d9 }
            r8.<init>(r4, r6)     // Catch:{ all -> 0x00d9 }
            com.alipay.iap.android.aplog.util.FileUtil.copyFile(r5, r8)     // Catch:{ all -> 0x00d9 }
        L_0x00d5:
            com.alipay.iap.android.aplog.util.FileUtil.moveFile(r5, r7)     // Catch:{ all -> 0x00d9 }
            goto L_0x00f9
        L_0x00d9:
            r6 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r7 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r8.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x00fd }
            r8.append(r5)     // Catch:{ all -> 0x00fd }
            java.lang.String r5 = ", syncLog: "
            r8.append(r5)     // Catch:{ all -> 0x00fd }
            r8.append(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x00fd }
            r7.error((java.lang.String) r3, (java.lang.String) r5)     // Catch:{ all -> 0x00fd }
        L_0x00f9:
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x00fc:
            return
        L_0x00fd:
            r0 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "syncLog, move fail: "
            java.lang.String r0 = r2.concat(r0)
            r1.error((java.lang.String) r3, (java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.UploadManager.syncLog():void");
    }

    public synchronized void uploadLog(String str, String str2, Bundle bundle) {
        if (LoggerFactory.getLogContext().getUploader() != null) {
            LoggerFactory.getLogContext().getUploader().upload(str, str2, bundle);
            return;
        }
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        StringBuilder sb = new StringBuilder("http upload logCategory = ");
        sb.append(str);
        sb.append(" uploadFileDir: ");
        sb.append(this.uploadFileDir);
        traceLogger.debug(TAG, sb.toString());
        new HttpUploader(this.uploadFileDir, this.context).upload(str, str2, bundle);
    }
}
