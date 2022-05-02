package com.alipay.iap.android.aplog.core.appender;

import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.util.FileUtil;
import java.io.File;

public abstract class AnalyticsLogAppender extends EncryptAppender {
    private static final String TAG = AnalyticsLogAppender.class.getName();

    public AnalyticsLogAppender(LogContext logContext, String str) {
        super(logContext, str);
    }

    /* access modifiers changed from: protected */
    public boolean writeFile(String str) {
        try {
            File file = getFile();
            TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("the saveFile is: ");
            sb.append(file.getAbsolutePath());
            innerTraceLogger.debug(str2, sb.toString());
            if (file != null) {
                FileUtil.writeFile(file, str, true);
            }
            return true;
        } catch (Throwable unused) {
            if (this.isAppendStringError) {
                return false;
            }
            this.isAppendStringError = true;
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r4.isGzipBytesError == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r4.isGzipBytesError = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0008 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0054 A[Catch:{ all -> 0x0061 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean onAppend(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            r1 = 0
            byte[] r5 = com.alipay.iap.android.aplog.util.LoggingUtil.gzipDataByBytes(r5, r6, r7)     // Catch:{ all -> 0x0008 }
            goto L_0x000f
        L_0x0008:
            boolean r5 = r4.isGzipBytesError     // Catch:{ all -> 0x006c }
            if (r5 != 0) goto L_0x000e
            r4.isGzipBytesError = r0     // Catch:{ all -> 0x006c }
        L_0x000e:
            r5 = r1
        L_0x000f:
            r6 = 0
            if (r5 != 0) goto L_0x0014
            monitor-exit(r4)
            return r6
        L_0x0014:
            java.io.File r7 = r4.getFile()     // Catch:{ all -> 0x006c }
            java.io.File r2 = r7.getParentFile()     // Catch:{ all -> 0x004e }
            boolean r2 = r2.exists()     // Catch:{ all -> 0x004e }
            if (r2 != 0) goto L_0x0029
            java.io.File r2 = r7.getParentFile()     // Catch:{ all -> 0x004e }
            r2.mkdirs()     // Catch:{ all -> 0x004e }
        L_0x0029:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x004e }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x004e }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x004c }
            r7.<init>(r2)     // Catch:{ all -> 0x004c }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ all -> 0x0049 }
            r3.<init>(r7)     // Catch:{ all -> 0x0049 }
            r3.write(r5)     // Catch:{ all -> 0x004a }
            r3.flush()     // Catch:{ all -> 0x004a }
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r3)     // Catch:{ all -> 0x006c }
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r7)     // Catch:{ all -> 0x006c }
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r2)     // Catch:{ all -> 0x006c }
            monitor-exit(r4)
            return r0
        L_0x0049:
            r3 = r1
        L_0x004a:
            r1 = r7
            goto L_0x0050
        L_0x004c:
            r3 = r1
            goto L_0x0050
        L_0x004e:
            r2 = r1
            r3 = r2
        L_0x0050:
            boolean r5 = r4.isAppendBytesError     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0056
            r4.isAppendBytesError = r0     // Catch:{ all -> 0x0061 }
        L_0x0056:
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r3)     // Catch:{ all -> 0x006c }
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r1)     // Catch:{ all -> 0x006c }
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r2)     // Catch:{ all -> 0x006c }
            monitor-exit(r4)
            return r6
        L_0x0061:
            r5 = move-exception
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r3)     // Catch:{ all -> 0x006c }
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r1)     // Catch:{ all -> 0x006c }
            com.alipay.iap.android.aplog.util.FileUtil.safeClose(r2)     // Catch:{ all -> 0x006c }
            throw r5     // Catch:{ all -> 0x006c }
        L_0x006c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.appender.AnalyticsLogAppender.onAppend(byte[], int, int):boolean");
    }
}
