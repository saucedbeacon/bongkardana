package com.alipay.iap.android.aplog.core.uploader;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.core.uploader.UserDiagnostician;
import com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback;
import com.alipay.iap.android.aplog.util.DeviceUtil;
import com.alipay.iap.android.aplog.util.FileUtil;
import com.alipay.iap.android.aplog.util.HybridEncryption;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.aplog.util.ZipUtil;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import kotlin.text.Typography;

class IAPLogUploader {
    private static final String COMPRESS_TYPE_7Z = "7z";
    private static final String COMPRESS_TYPE_KEY = "CompressType";
    private static final String COMPRESS_TYPE_ZIP = "zip";
    private static final long SEVEN_ZIP_LENGTH = 3145728;
    private static final String SUFFIX_NORMAL_ZIP = ".zip";
    private static final String SUFFIX_SEVEN_ZIP = ".7z";
    private static final String TAG = IAPLogUploader.class.getSimpleName();
    private static char[] getMax = null;
    private static int length = 1;
    private static int setMax;
    private Context mContext;
    private SimpleDateFormat mDateHourFormat = new SimpleDateFormat("yyyyMMddHH", Locale.getDefault());
    private UserDiagnostician.DiagnoseTask mDiagnoseTask;
    private long mFileMaxTime;
    private long mFileMinTime;
    private long mFileTotalLength;
    private UploadTaskStatusCallback mTaskCallBack;
    private Set<String> mUploadFileNames;
    private ArrayList<File> mUploadFiles;

    static void setMin() {
        getMax = new char[]{'F', 139, 132, 'p', 'i'};
    }

    static /* synthetic */ SimpleDateFormat access$000(IAPLogUploader iAPLogUploader) {
        int i = length + 29;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            SimpleDateFormat simpleDateFormat = iAPLogUploader.mDateHourFormat;
            int i3 = length + 1;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return simpleDateFormat;
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ String access$100() {
        int i = length + 71;
        setMax = i % 128;
        int i2 = i % 2;
        String str = TAG;
        int i3 = length + 61;
        setMax = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        int i4 = 75 / 0;
        return str;
    }

    static {
        setMin();
        int i = setMax + 97;
        length = i % 128;
        int i2 = i % 2;
    }

    IAPLogUploader(Context context, UserDiagnostician.DiagnoseTask diagnoseTask) {
        this.mContext = context;
        this.mDiagnoseTask = diagnoseTask;
    }

    /* access modifiers changed from: package-private */
    public void setUploadTaskStatus(UploadTaskStatusCallback uploadTaskStatusCallback) {
        int i = length + 95;
        setMax = i % 128;
        int i2 = i % 2;
        this.mTaskCallBack = uploadTaskStatusCallback;
        int i3 = length + 3;
        setMax = i3 % 128;
        if ((i3 % 2 != 0 ? '0' : '9') == '0') {
            int i4 = 98 / 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f6, code lost:
        if (r1.length() > SEVEN_ZIP_LENGTH) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        if ((r1.length() > SEVEN_ZIP_LENGTH) != false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void uploadLog() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0169 }
            r0.<init>()     // Catch:{ all -> 0x0169 }
            r10.mUploadFiles = r0     // Catch:{ all -> 0x0169 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0169 }
            r0.<init>()     // Catch:{ all -> 0x0169 }
            r10.mUploadFileNames = r0     // Catch:{ all -> 0x0169 }
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.mFileMinTime = r0     // Catch:{ all -> 0x0169 }
            r0 = -9223372036854775808
            r10.mFileMaxTime = r0     // Catch:{ all -> 0x0169 }
            r0 = 0
            r10.mFileTotalLength = r0     // Catch:{ all -> 0x0169 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = "[AlipayLogUpload.uploadLog] "
            r0.<init>(r1)     // Catch:{ all -> 0x0169 }
            r10.fillUploadFileListByReleaseType()     // Catch:{ all -> 0x0169 }
            java.util.ArrayList<java.io.File> r1 = r10.mUploadFiles     // Catch:{ all -> 0x0169 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0169 }
            if (r1 == 0) goto L_0x00a5
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x0169 }
            java.lang.String r2 = TAG     // Catch:{ all -> 0x0169 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r3.<init>()     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r4 = r10.mDiagnoseTask     // Catch:{ all -> 0x0169 }
            java.lang.String r4 = r4.taskType     // Catch:{ all -> 0x0169 }
            r3.append(r4)     // Catch:{ all -> 0x0169 }
            java.lang.String r4 = " [no files to upload] "
            r3.append(r4)     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r4 = r10.mDiagnoseTask     // Catch:{ all -> 0x0169 }
            boolean r4 = r4.isPositive     // Catch:{ all -> 0x0169 }
            r3.append(r4)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0169 }
            r1.warn((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r1 = r10.mTaskCallBack     // Catch:{ all -> 0x0169 }
            if (r1 == 0) goto L_0x00a3
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r1 = r10.mDiagnoseTask     // Catch:{ all -> 0x0169 }
            boolean r1 = r1.isPositive     // Catch:{ all -> 0x0169 }
            if (r1 != 0) goto L_0x00a3
            java.text.SimpleDateFormat r1 = r10.mDateHourFormat     // Catch:{ all -> 0x0169 }
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r3 = r10.mDiagnoseTask     // Catch:{ all -> 0x0169 }
            long r3 = r3.fromTime     // Catch:{ all -> 0x0169 }
            r2.<init>(r3)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ all -> 0x0169 }
            java.text.SimpleDateFormat r2 = r10.mDateHourFormat     // Catch:{ all -> 0x0169 }
            java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r4 = r10.mDiagnoseTask     // Catch:{ all -> 0x0169 }
            long r4 = r4.toTime     // Catch:{ all -> 0x0169 }
            r3.<init>(r4)     // Catch:{ all -> 0x0169 }
            java.lang.String r2 = r2.format(r3)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = "( "
            r0.append(r3)     // Catch:{ all -> 0x0169 }
            r0.append(r1)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = " ~ "
            r0.append(r1)     // Catch:{ all -> 0x0169 }
            r0.append(r2)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = " ) "
            r0.append(r1)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = "this period contains none file !"
            r0.append(r1)     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r1 = r10.mTaskCallBack     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback$Code r2 = com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback.Code.NO_TARGET_FILE     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0169 }
            r1.onFail(r2, r0)     // Catch:{ all -> 0x0169 }
        L_0x00a3:
            monitor-exit(r10)
            return
        L_0x00a5:
            java.lang.String r1 = " files count:"
            r0.append(r1)     // Catch:{ all -> 0x0169 }
            java.util.ArrayList<java.io.File> r1 = r10.mUploadFiles     // Catch:{ all -> 0x0169 }
            int r1 = r1.size()     // Catch:{ all -> 0x0169 }
            r0.append(r1)     // Catch:{ all -> 0x0169 }
            java.lang.String r1 = ", files length: "
            r0.append(r1)     // Catch:{ all -> 0x0169 }
            long r1 = r10.mFileTotalLength     // Catch:{ all -> 0x0169 }
            r0.append(r1)     // Catch:{ all -> 0x0169 }
            java.io.File r1 = r10.zipLogFiles(r0)     // Catch:{ all -> 0x0169 }
            if (r1 != 0) goto L_0x00c5
            monitor-exit(r10)
            return
        L_0x00c5:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0169 }
            r2.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = "CompressType"
            java.lang.String r4 = "zip"
            r2.put(r3, r4)     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.api.LogContext r3 = com.alipay.iap.android.aplog.core.LoggerFactory.getLogContext()     // Catch:{ all -> 0x0169 }
            boolean r3 = r3.isZipAndSevenZip()     // Catch:{ all -> 0x0169 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0115
            int r3 = setMax     // Catch:{ all -> 0x0169 }
            int r3 = r3 + 35
            int r6 = r3 % 128
            length = r6     // Catch:{ all -> 0x0169 }
            int r3 = r3 % 2
            r6 = 3145728(0x300000, double:1.554196E-317)
            if (r3 != 0) goto L_0x00fb
            long r8 = r1.length()     // Catch:{ all -> 0x0169 }
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r6 = 85
            int r6 = r6 / r5
            if (r3 <= 0) goto L_0x0115
            goto L_0x0108
        L_0x00f9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x00fb:
            long r8 = r1.length()     // Catch:{ Exception -> 0x0113 }
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0105
            r3 = 1
            goto L_0x0106
        L_0x0105:
            r3 = 0
        L_0x0106:
            if (r3 == 0) goto L_0x0115
        L_0x0108:
            boolean r3 = com.alipay.iap.android.aplog.util.NetUtil.isNetworkUseWifi()     // Catch:{ all -> 0x0169 }
            if (r3 != 0) goto L_0x0115
            java.io.File r1 = r10.zipTo7z(r1, r0, r2)     // Catch:{ all -> 0x0169 }
            goto L_0x0115
        L_0x0113:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x0115:
            long r6 = r1.length()     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r3 = r10.mDiagnoseTask     // Catch:{ all -> 0x0169 }
            long r8 = r3.maxFileSize     // Catch:{ all -> 0x0169 }
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x015b
            int r2 = length     // Catch:{ all -> 0x0169 }
            int r2 = r2 + 3
            int r3 = r2 % 128
            setMax = r3     // Catch:{ all -> 0x0169 }
            int r2 = r2 % 2
            java.lang.String r2 = ",zip file is larger than 10M: "
            r0.append(r2)     // Catch:{ Exception -> 0x0159 }
            long r2 = r1.length()     // Catch:{ Exception -> 0x0159 }
            r0.append(r2)     // Catch:{ Exception -> 0x0159 }
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r2 = r10.mTaskCallBack     // Catch:{ Exception -> 0x0159 }
            if (r2 == 0) goto L_0x013c
            r5 = 1
        L_0x013c:
            if (r5 == r4) goto L_0x013f
            goto L_0x0154
        L_0x013f:
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r2 = r10.mTaskCallBack     // Catch:{ all -> 0x0169 }
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback$Code r3 = com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback.Code.FILE_ZIPPING     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0169 }
            r2.onFail(r3, r0)     // Catch:{ all -> 0x0169 }
            int r0 = setMax     // Catch:{ all -> 0x0169 }
            int r0 = r0 + 43
            int r2 = r0 % 128
            length = r2     // Catch:{ all -> 0x0169 }
            int r0 = r0 % 2
        L_0x0154:
            com.alipay.iap.android.aplog.util.FileUtil.deleteFileNotDir(r1)     // Catch:{ all -> 0x0169 }
            monitor-exit(r10)
            return
        L_0x0159:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x015b:
            com.alipay.iap.android.aplog.core.uploader.IAPLogUploader$1 r3 = new com.alipay.iap.android.aplog.core.uploader.IAPLogUploader$1     // Catch:{ all -> 0x0169 }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0169 }
            r10.uploadCoreForRetry(r1, r3, r2, r0)     // Catch:{ all -> 0x0169 }
            monitor-exit(r10)
            return
        L_0x0169:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.IAPLogUploader.uploadLog():void");
    }

    /* access modifiers changed from: package-private */
    public void handUploadFail(UploadTaskStatusCallback.Code code, String str, StringBuilder sb, File file) {
        if ((this.mTaskCallBack != null ? '*' : Typography.greater) != '>') {
            int i = setMax + 47;
            length = i % 128;
            int i2 = i % 2;
            sb.append(", upload message: ");
            sb.append(str);
            this.mTaskCallBack.onFail(code, sb.toString());
        }
        FileUtil.deleteFileNotDir(file);
        int i3 = length + 57;
        setMax = i3 % 128;
        int i4 = i3 % 2;
    }

    /* access modifiers changed from: package-private */
    public void handUploadSuccess(StringBuilder sb, String str, File file) {
        try {
            boolean z = false;
            if (this.mTaskCallBack != null) {
                int i = setMax + 23;
                length = i % 128;
                if (i % 2 != 0) {
                    z = true;
                }
                if (!z) {
                    sb.append(", ");
                    sb.append(str);
                    this.mTaskCallBack.onSuccess(sb.toString());
                    Object[] objArr = null;
                    int length2 = objArr.length;
                } else {
                    sb.append(", ");
                    sb.append(str);
                    this.mTaskCallBack.onSuccess(sb.toString());
                }
                int i2 = length + 11;
                setMax = i2 % 128;
                int i3 = i2 % 2;
            }
            FileUtil.deleteFileNotDir(file);
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File zipTo7z(java.io.File r12, java.lang.StringBuilder r13, java.util.HashMap<java.lang.String, java.lang.String> r14) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x00c9 }
            r0.append(r1)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = ".7z"
            r0.append(r1)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c7 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x00c7 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x00c7 }
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x00c7 }
            r3 = 1
            r4 = 0
            java.lang.String r5 = r12.getAbsolutePath()     // Catch:{ all -> 0x0059 }
            boolean r4 = com.alipay.iap.android.aplog.util.zip.LzmaAlone.sevenZipFile(r3, r4, r5, r0)     // Catch:{ all -> 0x0059 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0055 }
            long r1 = r9 - r1
            java.lang.String r0 = ", 7Zing spend: "
            r13.append(r0)     // Catch:{ all -> 0x0055 }
            r13.append(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = ", 7Zed length: "
            r13.append(r0)     // Catch:{ all -> 0x0055 }
            long r9 = r8.length()     // Catch:{ all -> 0x0055 }
            r13.append(r9)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = ", 7Z success: "
            r13.append(r0)     // Catch:{ all -> 0x0055 }
            r13.append(r4)     // Catch:{ all -> 0x0055 }
            int r0 = length
            int r0 = r0 + 37
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            goto L_0x006d
        L_0x0055:
            r0 = move-exception
            r7 = r0
            r0 = r4
            goto L_0x005c
        L_0x0059:
            r0 = move-exception
            r7 = r0
            r0 = 0
        L_0x005c:
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r1
            long r9 = r8.length()
            r1 = r11
            r2 = r3
            r4 = r9
            r6 = r13
            r1.handleZipTo7zFail(r2, r4, r6, r7)
            r4 = r0
        L_0x006d:
            r0 = 38
            if (r4 == 0) goto L_0x0074
            r1 = 38
            goto L_0x0076
        L_0x0074:
            r1 = 96
        L_0x0076:
            if (r1 == r0) goto L_0x0079
            goto L_0x00c2
        L_0x0079:
            int r0 = setMax
            int r0 = r0 + 63
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            long r0 = r8.length()
            r2 = 0
            r4 = 60
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0092
            r0 = 55
            goto L_0x0094
        L_0x0092:
            r0 = 60
        L_0x0094:
            if (r0 == r4) goto L_0x00c2
            int r0 = length
            int r0 = r0 + 23
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 62
            if (r0 == 0) goto L_0x00a7
            r0 = 78
            goto L_0x00a9
        L_0x00a7:
            r0 = 62
        L_0x00a9:
            java.lang.String r2 = "7z"
            java.lang.String r3 = "CompressType"
            if (r0 == r1) goto L_0x00bb
            com.alipay.iap.android.aplog.util.FileUtil.deleteFileNotDir(r12)
            r14.put(r3, r2)
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x00b8 }
            goto L_0x00c6
        L_0x00b8:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00bb:
            com.alipay.iap.android.aplog.util.FileUtil.deleteFileNotDir(r12)
            r14.put(r3, r2)
            goto L_0x00c6
        L_0x00c2:
            com.alipay.iap.android.aplog.util.FileUtil.deleteFileNotDir(r8)     // Catch:{ Exception -> 0x00c7 }
            r8 = r12
        L_0x00c6:
            return r8
        L_0x00c7:
            r0 = move-exception
            throw r0
        L_0x00c9:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.IAPLogUploader.zipTo7z(java.io.File, java.lang.StringBuilder, java.util.HashMap):java.io.File");
    }

    /* access modifiers changed from: package-private */
    public void handleZipTo7zFail(long j, long j2, StringBuilder sb, Throwable th) {
        int i = setMax + 31;
        length = i % 128;
        int i2 = i % 2;
        sb.append(", 7Zing spend: ");
        sb.append(j);
        sb.append(", 7Zed length: ");
        sb.append(j2);
        sb.append(", catch throwable: ");
        sb.append(Log.getStackTraceString(th));
        LoggerFactory.getTraceLogger().error(TAG, sb.toString());
        try {
            int i3 = setMax + 9;
            length = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r10 = new com.alipay.iap.android.aplog.core.uploader.HttpUploadRunnable(r7.getAbsolutePath(), r0, r6.mDiagnoseTask, r8);
        r10.setHeaderParameters(r9);
        com.alipay.iap.android.aplog.util.APMTimer.getInstance().post(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void uploadCoreForRetry(java.io.File r7, com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10) {
        /*
            r6 = this;
            int r0 = length
            int r0 = r0 + 71
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            java.lang.String r3 = "uploadCoreForRetry: "
            if (r0 == r2) goto L_0x0039
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r4 = TAG
            java.lang.String r5 = java.lang.String.valueOf(r7)
            java.lang.String r3 = r3.concat(r5)
            r0.info(r4, r3)
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r0 = r6.mDiagnoseTask     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = com.alipay.iap.android.aplog.core.uploader.UploadConstants.requestUploadFileUrl(r0)     // Catch:{ all -> 0x0037 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0037 }
            r4 = 75
            int r4 = r4 / r1
            if (r3 == 0) goto L_0x008a
            goto L_0x0056
        L_0x0037:
            r7 = move-exception
            goto L_0x00a0
        L_0x0039:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r4 = TAG
            java.lang.String r5 = java.lang.String.valueOf(r7)
            java.lang.String r3 = r3.concat(r5)
            r0.info(r4, r3)
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r0 = r6.mDiagnoseTask     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = com.alipay.iap.android.aplog.core.uploader.UploadConstants.requestUploadFileUrl(r0)     // Catch:{ all -> 0x0037 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x008a
        L_0x0056:
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r7 = r6.mTaskCallBack     // Catch:{ all -> 0x0037 }
            if (r7 == 0) goto L_0x0072
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r7 = r6.mTaskCallBack     // Catch:{ all -> 0x0037 }
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback$Code r8 = com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback.Code.NETWORK_ERROR     // Catch:{ all -> 0x0037 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r9.<init>()     // Catch:{ all -> 0x0037 }
            r9.append(r10)     // Catch:{ all -> 0x0037 }
            java.lang.String r10 = ",request upload url fail"
            r9.append(r10)     // Catch:{ all -> 0x0037 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0037 }
            r7.onFail(r8, r9)     // Catch:{ all -> 0x0037 }
        L_0x0072:
            int r7 = setMax
            int r7 = r7 + 121
            int r8 = r7 % 128
            length = r8
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r1 = 1
        L_0x0080:
            if (r1 == r2) goto L_0x0089
            r7 = 0
            super.hashCode()     // Catch:{ all -> 0x0087 }
            return
        L_0x0087:
            r7 = move-exception
            throw r7
        L_0x0089:
            return
        L_0x008a:
            com.alipay.iap.android.aplog.core.uploader.HttpUploadRunnable r10 = new com.alipay.iap.android.aplog.core.uploader.HttpUploadRunnable     // Catch:{ all -> 0x0037 }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x0037 }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r1 = r6.mDiagnoseTask     // Catch:{ all -> 0x0037 }
            r10.<init>(r7, r0, r1, r8)     // Catch:{ all -> 0x0037 }
            r10.setHeaderParameters(r9)     // Catch:{ all -> 0x0037 }
            com.alipay.iap.android.aplog.util.APMTimer r7 = com.alipay.iap.android.aplog.util.APMTimer.getInstance()     // Catch:{ all -> 0x0037 }
            r7.post(r10)     // Catch:{ all -> 0x0037 }
            return
        L_0x00a0:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r8 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r9 = TAG
            java.lang.String r10 = "uploadCoreForRetry"
            r8.error(r9, r10, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.IAPLogUploader.uploadCoreForRetry(java.io.File, com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback, java.util.Map, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r0 == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        fillUploadFileList(new java.io.File(new java.io.File(com.alipay.iap.android.aplog.util.LoggingUtil.getCommonExternalStorageDir(), r5.mContext.getPackageName()), r5.mDiagnoseTask.taskType));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r0 = length + 47;
        setMax = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if ((r0 % 2) == 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r0 = '#';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        r0 = '6';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r0 == '6') goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger().warn(TAG, "uploadLog", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (com.alipay.iap.android.aplog.util.LoggingUtil.isDebuggable() == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void fillUploadFileListByReleaseType() {
        /*
            r5 = this;
            int r0 = setMax     // Catch:{ Exception -> 0x0087 }
            int r0 = r0 + 31
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x0087 }
            int r0 = r0 % 2
            r1 = 29
            if (r0 != 0) goto L_0x0011
            r0 = 29
            goto L_0x0013
        L_0x0011:
            r0 = 23
        L_0x0013:
            java.lang.String r2 = "uploadLog"
            r3 = 0
            if (r0 == r1) goto L_0x0020
            boolean r0 = com.alipay.iap.android.aplog.util.LoggingUtil.isDebuggable()
            if (r0 != 0) goto L_0x0045
            goto L_0x0027
        L_0x0020:
            boolean r0 = com.alipay.iap.android.aplog.util.LoggingUtil.isDebuggable()
            int r1 = r3.length     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0045
        L_0x0027:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x003a }
            android.content.Context r1 = r5.mContext     // Catch:{ all -> 0x003a }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ all -> 0x003a }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r3 = r5.mDiagnoseTask     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r3.taskType     // Catch:{ all -> 0x003a }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x003a }
            r5.fillUploadFileList(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r0 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r3 = TAG
            r1.warn(r3, r2, r0)
            return
        L_0x0045:
            java.io.File r0 = com.alipay.iap.android.aplog.util.LoggingUtil.getCommonExternalStorageDir()     // Catch:{ all -> 0x007a }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x007a }
            android.content.Context r4 = r5.mContext     // Catch:{ all -> 0x007a }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x007a }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x007a }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x007a }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r4 = r5.mDiagnoseTask     // Catch:{ all -> 0x007a }
            java.lang.String r4 = r4.taskType     // Catch:{ all -> 0x007a }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x007a }
            r5.fillUploadFileList(r0)     // Catch:{ all -> 0x007a }
            int r0 = length
            int r0 = r0 + 47
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 54
            if (r0 == 0) goto L_0x0071
            r0 = 35
            goto L_0x0073
        L_0x0071:
            r0 = 54
        L_0x0073:
            if (r0 == r1) goto L_0x0079
            int r0 = r3.length     // Catch:{ all -> 0x0077 }
            return
        L_0x0077:
            r0 = move-exception
            throw r0
        L_0x0079:
            return
        L_0x007a:
            r0 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r3 = TAG
            r1.warn(r3, r2, r0)
            return
        L_0x0085:
            r0 = move-exception
            throw r0
        L_0x0087:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.IAPLogUploader.fillUploadFileListByReleaseType():void");
    }

    private File zipLogFiles(StringBuilder sb) {
        AnonymousClass2 r0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mDiagnoseTask.fileName);
        sb2.append('_');
        sb2.append(System.currentTimeMillis());
        sb2.append(SUFFIX_NORMAL_ZIP);
        File file = new File(this.mContext.getCacheDir(), sb2.toString());
        if ("applog".equalsIgnoreCase(this.mDiagnoseTask.taskType)) {
            r0 = new ZipUtil.ZipFileHandler() {
                public String handleFileNameInZip(File file) {
                    if (file == null) {
                        return null;
                    }
                    String name = file.getName();
                    try {
                        String str = name.split("_")[0];
                        return name.replace(str, IAPLogUploader.access$000(IAPLogUploader.this).format(new Date(Long.parseLong(str))));
                    } catch (Throwable th) {
                        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                        String access$100 = IAPLogUploader.access$100();
                        StringBuilder sb = new StringBuilder();
                        sb.append(name);
                        sb.append(" handleFileNameInZip");
                        traceLogger.warn(access$100, sb.toString(), th);
                        return name;
                    }
                }
            };
            int i = length + 73;
            setMax = i % 128;
            int i2 = i % 2;
        } else {
            r0 = null;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                ZipUtil.zipFile(this.mUploadFiles, file.getAbsolutePath(), (File) null, r0);
                try {
                    sb.append(", zipping spend: ");
                    sb.append(SystemClock.uptimeMillis() - uptimeMillis);
                    sb.append(", zipped length: ");
                    sb.append(file.length());
                    boolean z = false;
                    if (file.exists()) {
                        int i3 = length + 63;
                        setMax = i3 % 128;
                        int i4 = i3 % 2;
                        if (file.isFile()) {
                            char c = '!';
                            int i5 = length + 33;
                            setMax = i5 % 128;
                            int i6 = i5 % 2;
                            if (file.length() != 0) {
                                z = true;
                            }
                            if (z) {
                                if (this.mDiagnoseTask.isForceUpload && this.mDiagnoseTask.zippedLenLimit > 0) {
                                    if (file.length() <= this.mDiagnoseTask.zippedLenLimit) {
                                        c = 8;
                                    }
                                    if (c != 8) {
                                        int i7 = length + 37;
                                        setMax = i7 % 128;
                                        int i8 = i7 % 2;
                                        if (this.mTaskCallBack != null) {
                                            sb.append(", zipped limit: ");
                                            sb.append(this.mDiagnoseTask.zippedLenLimit);
                                            this.mTaskCallBack.onFail(UploadTaskStatusCallback.Code.TRAFIC_LIMIT, sb.toString());
                                            int i9 = length + 89;
                                            setMax = i9 % 128;
                                            int i10 = i9 % 2;
                                        }
                                        return null;
                                    }
                                }
                                return file;
                            }
                        }
                    }
                    if (this.mTaskCallBack != null) {
                        sb.append(", not exist: ");
                        sb.append(file.getAbsolutePath());
                        this.mTaskCallBack.onFail(UploadTaskStatusCallback.Code.ZIPPING_ERROR, sb.toString());
                    }
                    return null;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                handException(uptimeMillis, sb, file, th);
                return null;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public void handException(long j, StringBuilder sb, File file, Throwable th) {
        int i = setMax + 63;
        length = i % 128;
        int i2 = i % 2;
        sb.append(", zipping spend: ");
        sb.append(SystemClock.uptimeMillis() - j);
        sb.append(", zipped length: ");
        sb.append(file.length());
        sb.append(", catch throwable: ");
        sb.append(Log.getStackTraceString(th));
        String obj = sb.toString();
        if (this.mTaskCallBack != null) {
            this.mTaskCallBack.onFail(UploadTaskStatusCallback.Code.ZIPPING_ERROR, obj);
        }
        int i3 = setMax + 17;
        length = i3 % 128;
        int i4 = i3 % 2;
    }

    private void fillUploadFileList(File file) {
        if (!(file == null)) {
            if (file.exists()) {
                try {
                    if (file.isDirectory()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles == null || listFiles.length == 0) {
                            int i = length + 99;
                            setMax = i % 128;
                            int i2 = i % 2;
                            return;
                        }
                        for (File file2 : listFiles) {
                            if (file2 != null) {
                                try {
                                    if (file2.exists()) {
                                        if ((file2.isFile() ? (char) 30 : 7) == 30) {
                                            if (file2.length() != 0) {
                                                String name = file2.getName();
                                                long parseLong = Long.parseLong(name.split("_")[0]);
                                                if ((parseLong >= this.mDiagnoseTask.fromTime ? '2' : Typography.less) != '<') {
                                                    int i3 = length + 37;
                                                    setMax = i3 % 128;
                                                    if (i3 % 2 != 0) {
                                                        int i4 = (parseLong > this.mDiagnoseTask.toTime ? 1 : (parseLong == this.mDiagnoseTask.toTime ? 0 : -1));
                                                        Object[] objArr = null;
                                                        int length2 = objArr.length;
                                                        if (i4 < 0) {
                                                        }
                                                    } else if (parseLong >= this.mDiagnoseTask.toTime) {
                                                    }
                                                    if (!this.mUploadFileNames.contains(name)) {
                                                        int i5 = setMax + 41;
                                                        length = i5 % 128;
                                                        int i6 = i5 % 2;
                                                        this.mUploadFiles.add(file2);
                                                        this.mUploadFileNames.add(name);
                                                        this.mFileTotalLength += file2.length();
                                                        this.mFileMinTime = Math.min(parseLong, this.mFileMinTime);
                                                        this.mFileMaxTime = Math.max(parseLong, this.mFileMaxTime);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    int i7 = length + 15;
                                    setMax = i7 % 128;
                                    int i8 = i7 % 2;
                                } catch (Throwable unused) {
                                    TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                                    String str = TAG;
                                    StringBuilder sb = new StringBuilder("fillUploadFileList: ");
                                    sb.append(file2.getAbsolutePath());
                                    traceLogger.error(str, sb.toString());
                                }
                            }
                        }
                        if (this.mUploadFiles.size() > 0) {
                            addDeviceInfoFile();
                        }
                        int i9 = length + 69;
                        setMax = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 62 / 0;
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        }
    }

    private void addDeviceInfoFile() {
        File file = new File(this.mContext.getFilesDir(), "deviceInfo.2nd");
        if (file.exists()) {
            if (!(file.length() <= 0)) {
                this.mUploadFiles.add(file);
                return;
            }
        }
        try {
            byte[] bytes = DeviceUtil.getDeviceInfo().getBytes(getMax(new int[]{0, 5, 55, 5}, !Process.supportsProcesses(), new byte[]{0, 1, 0, 1, 1}).intern());
            byte[] bArr = null;
            try {
                bArr = LoggingUtil.gzipDataByBytes(bytes, 0, bytes.length);
                int i = setMax + 117;
                length = i % 128;
                int i2 = i % 2;
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error(TAG, th.getMessage());
            }
            if (bArr != null) {
                byte[] encrypt = HybridEncryption.getInstance().encrypt(bArr, 0, bArr.length);
                byte[] secureSeed = HybridEncryption.getInstance().getSecureSeed();
                if ((encrypt != null ? 19 : 'C') == 19) {
                    int i3 = setMax + 107;
                    length = i3 % 128;
                    int i4 = i3 % 2;
                    if (secureSeed != null) {
                        if (secureSeed.length > 32767) {
                            TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
                            String str = TAG;
                            StringBuilder sb = new StringBuilder("the length of secure seed is too long: ");
                            sb.append(secureSeed.length);
                            innerTraceLogger.error(str, sb.toString());
                            return;
                        } else if (FileUtil.writeEncryptedContent(encrypt, secureSeed, file)) {
                            int i5 = setMax + 73;
                            length = i5 % 128;
                            if (i5 % 2 == 0) {
                                if (file.length() <= 0) {
                                    return;
                                }
                            } else if (file.length() <= 0) {
                                return;
                            }
                            this.mUploadFiles.add(file);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                int i6 = setMax + 37;
                length = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 43 / 0;
                }
            }
        } catch (IOException e) {
            LoggerFactory.getTraceLogger().error(TAG, e.getMessage());
        }
    }

    private static String getMax(int[] iArr, boolean z, byte[] bArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = new char[i2];
        System.arraycopy(getMax, i, cArr, 0, i2);
        if (bArr != null) {
            char[] cArr2 = new char[i2];
            int i5 = 0;
            char c = 0;
            while (true) {
                if ((i5 < i2 ? '+' : '\'') == '\'') {
                    break;
                }
                if (bArr[i5] == 1) {
                    cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                } else {
                    cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                }
                c = cArr2[i5];
                i5++;
            }
            cArr = cArr2;
        }
        if (i4 > 0) {
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, 0, cArr3, 0, i2);
            int i6 = i2 - i4;
            System.arraycopy(cArr3, 0, cArr, i6, i4);
            System.arraycopy(cArr3, i4, cArr, 0, i6);
        }
        if (z) {
            try {
                int i7 = setMax + 89;
                try {
                    length = i7 % 128;
                    if (i7 % 2 == 0) {
                    }
                    char[] cArr4 = new char[i2];
                    for (int i8 = 0; i8 < i2; i8++) {
                        cArr4[i8] = cArr[(i2 - i8) - 1];
                    }
                    cArr = cArr4;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (i3 > 0) {
            int i9 = length + 95;
            setMax = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (true) {
                if (i11 >= i2) {
                    break;
                }
                cArr[i11] = (char) (cArr[i11] - iArr[2]);
                i11++;
                int i12 = length + 43;
                setMax = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        return new String(cArr);
    }
}
