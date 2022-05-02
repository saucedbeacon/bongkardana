package com.alipay.iap.android.aplog.core.uploader;

import android.os.SystemClock;
import android.util.Log;
import com.alipay.iap.android.aplog.core.uploader.UserDiagnostician;
import com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback;
import java.util.Map;
import o.onActivityPostResumed;

public class HttpUploadRunnable implements Runnable {
    private static final int BUFFER_LENGTH = 8192;
    private static final String TAG;
    private static int[] getMax = null;
    private static int setMax = 0;
    private static int setMin = 1;
    private long mAlreadySentLength;
    private long mAlreadySentSpend;
    private UploadTaskStatusCallback mCallback;
    private UserDiagnostician.DiagnoseTask mDiagnoseTask;
    private String mFilePath;
    private Map<String, String> mHeaderParameters;
    private String mUrl;

    static void getMin() {
        getMax = new int[]{-324615084, 1321237036, 585574177, 821385850, -2101886452, 398003589, 567879144, 1423036057, -1065494223, -1079723808, 1432727951, 1364878542, -339624567, -1597449600, -945198642, 218603030, -1433856167, 826272135};
    }

    static {
        try {
            getMin();
            TAG = HttpUploadRunnable.class.getSimpleName();
            int i = setMin + 107;
            setMax = i % 128;
            if ((i % 2 != 0 ? (char) 10 : 21) != 21) {
                int i2 = 14 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    HttpUploadRunnable(String str, String str2, UserDiagnostician.DiagnoseTask diagnoseTask, UploadTaskStatusCallback uploadTaskStatusCallback) {
        try {
            this.mFilePath = str;
            this.mUrl = str2;
            try {
                this.mDiagnoseTask = diagnoseTask;
                this.mCallback = uploadTaskStatusCallback;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public void setHeaderParameters(Map<String, String> map) {
        int i = setMin + 87;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            this.mHeaderParameters = map;
            try {
                int i3 = setMin + 13;
                setMax = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r3v37, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r3v48 */
    /* JADX WARNING: type inference failed for: r3v49 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02eb A[SYNTHETIC, Splitter:B:104:0x02eb] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0308 A[RETURN] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void upload() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = r1.mFilePath
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 2
            if (r0 != 0) goto L_0x0316
            java.lang.String r0 = r1.mUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0015
            goto L_0x0316
        L_0x0015:
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r1.mFilePath
            r0.<init>(r3)
            long r3 = r0.length()
            int r4 = (int) r3
            boolean r3 = r0.exists()
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == r5) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            if (r4 != 0) goto L_0x004e
        L_0x0031:
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r0 = r1.mCallback
            if (r0 == 0) goto L_0x004d
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback$Code r2 = com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback.Code.NO_TARGET_FILE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.mFilePath
            r3.append(r4)
            java.lang.String r4 = " is not exist"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.onFail(r2, r3)
        L_0x004d:
            return
        L_0x004e:
            java.lang.String r3 = com.alipay.iap.android.aplog.util.NetUtil.getNetworkType()
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r7 = r1.mDiagnoseTask
            boolean r7 = r7.isForceUpload
            r8 = 0
            if (r7 == 0) goto L_0x0083
            int r7 = setMax
            int r7 = r7 + 93
            int r9 = r7 % 128
            setMin = r9
            int r7 = r7 % r2
            if (r7 != 0) goto L_0x0066
            r7 = 0
            goto L_0x0067
        L_0x0066:
            r7 = 1
        L_0x0067:
            java.lang.String r9 = "ForceUpload!"
            if (r7 == 0) goto L_0x0075
            com.alipay.iap.android.aplog.core.logger.TraceLogger r7 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r10 = TAG
            r7.info(r10, r9)
            goto L_0x00a8
        L_0x0075:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r7 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r10 = TAG
            r7.info(r10, r9)
            int r7 = r8.length     // Catch:{ all -> 0x0080 }
            goto L_0x00a8
        L_0x0080:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0083:
            java.lang.String r7 = "WIFI"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a8 }
            if (r7 != 0) goto L_0x00a8
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r7 = r1.mCallback     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x00a7
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r7 = r1.mCallback     // Catch:{ all -> 0x00a8 }
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback$Code r9 = com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback.Code.NET_NOT_MATCH     // Catch:{ all -> 0x00a8 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r10.<init>()     // Catch:{ all -> 0x00a8 }
            r10.append(r3)     // Catch:{ all -> 0x00a8 }
            java.lang.String r11 = " is no wifi network, can not upload"
            r10.append(r11)     // Catch:{ all -> 0x00a8 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00a8 }
            r7.onFail(r9, r10)     // Catch:{ all -> 0x00a8 }
        L_0x00a7:
            return
        L_0x00a8:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r7 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r9 = TAG
            java.lang.String r10 = "upload begin"
            r7.info(r9, r10)
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ all -> 0x02d9 }
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ all -> 0x02d9 }
            r10.<init>(r0)     // Catch:{ all -> 0x02d9 }
            r9.<init>(r10)     // Catch:{ all -> 0x02d9 }
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02d4 }
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x02d4 }
            java.lang.String r12 = r1.mUrl     // Catch:{ all -> 0x02d4 }
            r0.<init>(r12)     // Catch:{ all -> 0x02d4 }
            java.net.Proxy r12 = java.net.Proxy.NO_PROXY     // Catch:{ all -> 0x02d4 }
            java.net.URLConnection r0 = r0.openConnection(r12)     // Catch:{ all -> 0x02d4 }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ all -> 0x02d4 }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ all -> 0x02d4 }
            r12 = r0
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ all -> 0x02d4 }
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02d1 }
            long r13 = r13 - r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d1 }
            r0.<init>()     // Catch:{ all -> 0x02d1 }
            java.lang.String r15 = "url: "
            r0.append(r15)     // Catch:{ all -> 0x02d1 }
            java.lang.String r15 = r1.mUrl     // Catch:{ all -> 0x02d1 }
            r0.append(r15)     // Catch:{ all -> 0x02d1 }
            java.lang.String r15 = ", fileName: "
            r0.append(r15)     // Catch:{ all -> 0x02d1 }
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r15 = r1.mDiagnoseTask     // Catch:{ all -> 0x02d1 }
            java.lang.String r15 = r15.fileName     // Catch:{ all -> 0x02d1 }
            r0.append(r15)     // Catch:{ all -> 0x02d1 }
            java.lang.String r15 = ", connectSpend: "
            r0.append(r15)     // Catch:{ all -> 0x02d1 }
            r0.append(r13)     // Catch:{ all -> 0x02d1 }
            com.alipay.iap.android.aplog.core.logger.TraceLogger r13 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x02d1 }
            java.lang.String r14 = TAG     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02d1 }
            r13.info(r14, r0)     // Catch:{ all -> 0x02d1 }
            r12.setDoInput(r5)     // Catch:{ all -> 0x02d1 }
            r12.setDoOutput(r5)     // Catch:{ all -> 0x02d1 }
            r12.setUseCaches(r6)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "PUT"
            r12.setRequestMethod(r0)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "userid"
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r13 = r1.mDiagnoseTask     // Catch:{ all -> 0x02d1 }
            java.lang.String r13 = r13.userID     // Catch:{ all -> 0x02d1 }
            r12.addRequestProperty(r0, r13)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "taskType"
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r13 = r1.mDiagnoseTask     // Catch:{ all -> 0x02d1 }
            java.lang.String r13 = r13.taskType     // Catch:{ all -> 0x02d1 }
            r12.addRequestProperty(r0, r13)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "FileName"
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r13 = r1.mDiagnoseTask     // Catch:{ all -> 0x02d1 }
            java.lang.String r13 = r13.fileName     // Catch:{ all -> 0x02d1 }
            r12.addRequestProperty(r0, r13)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "NetworkType"
            r12.addRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "ClientID"
            com.alipay.iap.android.aplog.api.LogContext r3 = com.alipay.iap.android.aplog.core.LoggerFactory.getLogContext()     // Catch:{ all -> 0x02d1 }
            java.lang.String r3 = r3.getClientID()     // Catch:{ all -> 0x02d1 }
            r12.addRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "DeviceID"
            com.alipay.iap.android.aplog.api.LogContext r3 = com.alipay.iap.android.aplog.core.LoggerFactory.getLogContext()     // Catch:{ all -> 0x02d1 }
            java.lang.String r3 = r3.getDeviceID()     // Catch:{ all -> 0x02d1 }
            r12.addRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "Process"
            com.alipay.iap.android.aplog.api.ProcessInfo r3 = com.alipay.iap.android.aplog.core.LoggerFactory.getProcessInfo()     // Catch:{ all -> 0x02d1 }
            java.lang.String r3 = r3.getProcessAlias()     // Catch:{ all -> 0x02d1 }
            r12.addRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "ProductId"
            com.alipay.iap.android.aplog.api.LogContext r3 = com.alipay.iap.android.aplog.core.LoggerFactory.getLogContext()     // Catch:{ all -> 0x02d1 }
            java.lang.String r3 = r3.getProductID()     // Catch:{ all -> 0x02d1 }
            r12.addRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "ProductVer"
            com.alipay.iap.android.aplog.api.LogContext r3 = com.alipay.iap.android.aplog.core.LoggerFactory.getLogContext()     // Catch:{ all -> 0x02d1 }
            java.lang.String r3 = r3.getProductVersion()     // Catch:{ all -> 0x02d1 }
            r12.addRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mHeaderParameters     // Catch:{ all -> 0x02d1 }
            r3 = 35
            if (r0 == 0) goto L_0x0188
            r0 = 22
            goto L_0x018a
        L_0x0188:
            r0 = 35
        L_0x018a:
            if (r0 == r3) goto L_0x01c0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mHeaderParameters     // Catch:{ all -> 0x02d1 }
            int r0 = r0.size()     // Catch:{ all -> 0x02d1 }
            if (r0 <= 0) goto L_0x01c0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mHeaderParameters     // Catch:{ all -> 0x01c0 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x01c0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01c0 }
        L_0x019e:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x01c0 }
            if (r3 == 0) goto L_0x01c0
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x01c0 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x01c0 }
            java.lang.Object r13 = r3.getKey()     // Catch:{ all -> 0x01c0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x01c0 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x01c0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01c0 }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01c0 }
            if (r14 != 0) goto L_0x019e
            r12.addRequestProperty(r13, r3)     // Catch:{ all -> 0x01c0 }
            goto L_0x019e
        L_0x01c0:
            java.lang.String r0 = "Connection"
            java.lang.String r3 = "Keep-Alive"
            r12.setRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "Charset"
            java.lang.String r3 = ""
            int r3 = android.view.KeyEvent.keyCodeFromString(r3)     // Catch:{ all -> 0x02d1 }
            int r3 = 5 - r3
            r13 = 4
            int[] r13 = new int[r13]     // Catch:{ all -> 0x02d1 }
            r14 = -1414622288(0xffffffffabae93b0, float:-1.2404435E-12)
            r13[r6] = r14     // Catch:{ all -> 0x02d1 }
            r14 = -281907520(0xffffffffef326ec0, float:-5.522222E28)
            r13[r5] = r14     // Catch:{ all -> 0x02d1 }
            r14 = -554826175(0xffffffffdeee0641, float:-8.5757338E18)
            r13[r2] = r14     // Catch:{ all -> 0x02d1 }
            r14 = 3
            r15 = 814359132(0x308a225c, float:1.0050587E-9)
            r13[r14] = r15     // Catch:{ all -> 0x02d1 }
            java.lang.String r3 = setMax(r3, r13)     // Catch:{ all -> 0x02d1 }
            java.lang.String r3 = r3.intern()     // Catch:{ all -> 0x02d1 }
            r12.setRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "Content-Type"
            java.lang.String r3 = "application/octet-stream"
            r12.setRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "Content-Length"
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x02d1 }
            r12.setRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            java.lang.String r0 = "Cache-Control"
            java.lang.String r3 = "no-cache"
            r12.setRequestProperty(r0, r3)     // Catch:{ all -> 0x02d1 }
            r12.setFixedLengthStreamingMode(r4)     // Catch:{ all -> 0x02d1 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r12.setConnectTimeout(r0)     // Catch:{ all -> 0x02d1 }
            r0 = 60000(0xea60, float:8.4078E-41)
            r12.setReadTimeout(r0)     // Catch:{ all -> 0x02d1 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02d1 }
            r1.mAlreadySentSpend = r3     // Catch:{ all -> 0x02d1 }
            r12.connect()     // Catch:{ all -> 0x02d1 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x02d1 }
            java.io.OutputStream r0 = r12.getOutputStream()     // Catch:{ all -> 0x02d1 }
            r3.<init>(r0)     // Catch:{ all -> 0x02d1 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x02cf }
            int r4 = setMin
            int r4 = r4 + 103
            int r13 = r4 % 128
            setMax = r13
            int r4 = r4 % r2
        L_0x0238:
            int r4 = r9.read(r0)     // Catch:{ all -> 0x02cf }
            if (r4 < 0) goto L_0x0249
            r3.write(r0, r6, r4)     // Catch:{ all -> 0x02cf }
            long r13 = r1.mAlreadySentLength     // Catch:{ all -> 0x02cf }
            long r6 = (long) r4     // Catch:{ all -> 0x02cf }
            long r13 = r13 + r6
            r1.mAlreadySentLength = r13     // Catch:{ all -> 0x02cf }
            r6 = 0
            goto L_0x0238
        L_0x0249:
            r3.flush()     // Catch:{ all -> 0x02cf }
            int r0 = r12.getResponseCode()     // Catch:{ all -> 0x02cf }
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02cf }
            long r6 = r6 - r10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02cf }
            r4.<init>()     // Catch:{ all -> 0x02cf }
            java.lang.String r10 = "traficLength: "
            r4.append(r10)     // Catch:{ all -> 0x02cf }
            long r10 = r1.mAlreadySentLength     // Catch:{ all -> 0x02cf }
            r4.append(r10)     // Catch:{ all -> 0x02cf }
            java.lang.String r10 = ", responseCode: "
            r4.append(r10)     // Catch:{ all -> 0x02cf }
            r4.append(r0)     // Catch:{ all -> 0x02cf }
            java.lang.String r10 = ", spendTime: "
            r4.append(r10)     // Catch:{ all -> 0x02cf }
            r4.append(r6)     // Catch:{ all -> 0x02cf }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02cf }
            com.alipay.iap.android.aplog.core.logger.TraceLogger r6 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x02cf }
            java.lang.String r7 = TAG     // Catch:{ all -> 0x02cf }
            r6.info(r7, r4)     // Catch:{ all -> 0x02cf }
            r6 = 200(0xc8, float:2.8E-43)
            if (r0 != r6) goto L_0x02b3
            int r0 = setMin
            int r0 = r0 + 119
            int r6 = r0 % 128
            setMax = r6
            int r0 = r0 % r2
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r0 = r1.mCallback     // Catch:{ all -> 0x02cf }
            if (r0 == 0) goto L_0x02ba
            int r0 = setMax
            int r0 = r0 + 95
            int r6 = r0 % 128
            setMin = r6
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x02a0
            r0 = 0
            goto L_0x02a2
        L_0x02a0:
            r0 = 55
        L_0x02a2:
            if (r0 == 0) goto L_0x02aa
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r0 = r1.mCallback     // Catch:{ all -> 0x02cf }
            r0.onSuccess(r4)     // Catch:{ all -> 0x02cf }
            goto L_0x02ba
        L_0x02aa:
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r0 = r1.mCallback     // Catch:{ all -> 0x02cf }
            r0.onSuccess(r4)     // Catch:{ all -> 0x02cf }
            super.hashCode()     // Catch:{ all -> 0x02cf }
            goto L_0x02ba
        L_0x02b3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02cf }
            r1.callbackOnError(r0)     // Catch:{ all -> 0x02cf }
        L_0x02ba:
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r9)
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r3)
            r0 = 78
            if (r12 == 0) goto L_0x02c7
            r3 = 89
            goto L_0x02c9
        L_0x02c7:
            r3 = 78
        L_0x02c9:
            if (r3 == r0) goto L_0x02ef
            r12.disconnect()     // Catch:{ all -> 0x02ce }
        L_0x02ce:
            return
        L_0x02cf:
            r0 = move-exception
            goto L_0x02d7
        L_0x02d1:
            r0 = move-exception
            r3 = r8
            goto L_0x02d7
        L_0x02d4:
            r0 = move-exception
            r3 = r8
            r12 = r3
        L_0x02d7:
            r8 = r9
            goto L_0x02dc
        L_0x02d9:
            r0 = move-exception
            r3 = r8
            r12 = r3
        L_0x02dc:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0309 }
            r1.callbackOnError(r0)     // Catch:{ all -> 0x0309 }
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r8)
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r3)
            if (r12 == 0) goto L_0x02ef
            r12.disconnect()     // Catch:{ all -> 0x02ee }
        L_0x02ee:
            return
        L_0x02ef:
            int r0 = setMax
            int r0 = r0 + 19
            int r3 = r0 % 128
            setMin = r3
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x02fc
            r0 = 0
            goto L_0x02fd
        L_0x02fc:
            r0 = 1
        L_0x02fd:
            if (r0 == r5) goto L_0x0308
            r2 = 89
            r3 = 0
            int r7 = r2 / 0
            return
        L_0x0305:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0308:
            return
        L_0x0309:
            r0 = move-exception
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r8)
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r3)
            if (r12 == 0) goto L_0x0315
            r12.disconnect()     // Catch:{ all -> 0x0315 }
        L_0x0315:
            throw r0
        L_0x0316:
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r0 = r1.mCallback
            if (r0 == 0) goto L_0x032c
            int r0 = setMin
            int r0 = r0 + 107
            int r3 = r0 % 128
            setMax = r3
            int r0 = r0 % r2
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback r0 = r1.mCallback
            com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback$Code r2 = com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback.Code.PARAM_INVALID
            java.lang.String r3 = "HttpUpload: mFilePath or mUrl is null"
            r0.onFail(r2, r3)
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.HttpUploadRunnable.upload():void");
    }

    public void run() {
        int i = setMax + 69;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            upload();
            int i3 = setMax + 87;
            setMin = i3 % 128;
            if ((i3 % 2 == 0 ? '?' : '_') != '_') {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Throwable th) {
            callbackOnError(Log.getStackTraceString(th));
        }
    }

    /* access modifiers changed from: package-private */
    public void callbackOnError(Object obj) {
        long j;
        int i = setMin + 11;
        setMax = i % 128;
        if (i % 2 != 0) {
            UploadTaskStatusCallback uploadTaskStatusCallback = this.mCallback;
            Object[] objArr = null;
            int length = objArr.length;
            if (uploadTaskStatusCallback == null) {
                return;
            }
        } else if (this.mCallback == null) {
            return;
        }
        if (!(this.mAlreadySentSpend == 0)) {
            j = SystemClock.uptimeMillis() - this.mAlreadySentSpend;
        } else {
            int i2 = setMax + 113;
            setMin = i2 % 128;
            if ((i2 % 2 == 0 ? 'V' : 13) != 13) {
                int i3 = 46 / 0;
            }
            j = -1;
        }
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("sentLength: ");
            sb.append(this.mAlreadySentLength);
            sb.append(", alreadySentSpend: ");
            sb.append(j);
            sb.append(" [");
            sb.append(TAG);
            sb.append("] ");
            sb.append("fail: ");
            sb.append(obj);
            this.mCallback.onFail(UploadTaskStatusCallback.Code.RESULT_FAILURE, sb.toString());
        } catch (Exception e) {
            throw e;
        }
    }

    private static String setMax(int i, int[] iArr) {
        int i2;
        int[] iArr2;
        char[] cArr;
        char[] cArr2;
        int i3 = setMax + 33;
        setMin = i3 % 128;
        boolean z = false;
        if ((i3 % 2 == 0 ? ' ' : '9') != ' ') {
            cArr2 = new char[4];
            cArr = new char[(iArr.length << 1)];
            iArr2 = (int[]) getMax.clone();
            i2 = 0;
        } else {
            cArr2 = new char[4];
            cArr = new char[(iArr.length + 1)];
            iArr2 = (int[]) getMax.clone();
            i2 = 1;
        }
        while (i2 < iArr.length) {
            cArr2[0] = (char) (iArr[i2] >> 16);
            cArr2[1] = (char) iArr[i2];
            int i4 = i2 + 1;
            cArr2[2] = (char) (iArr[i4] >> 16);
            cArr2[3] = (char) iArr[i4];
            onActivityPostResumed.getMin(cArr2, iArr2, false);
            int i5 = i2 << 1;
            cArr[i5] = cArr2[0];
            cArr[i5 + 1] = cArr2[1];
            cArr[i5 + 2] = cArr2[2];
            cArr[i5 + 3] = cArr2[3];
            i2 += 2;
        }
        String str = new String(cArr, 0, i);
        int i6 = setMax + 71;
        setMin = i6 % 128;
        if (i6 % 2 != 0) {
            z = true;
        }
        if (z) {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }
}
