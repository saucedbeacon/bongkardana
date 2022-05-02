package com.iap.ac.android.diagnoselog.storage;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.iap.ac.android.diagnoselog.core.DiagnoseLogContext;
import com.iap.ac.android.diagnoselog.core.TraceLog;
import com.iap.ac.android.loglite.utils.FileUtil;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DiagnoseFileStorage implements DiagnoseStorage {
    private static int equals = 1;
    public static final long g = TimeUnit.HOURS.toMillis(1);
    private static boolean getMax;
    private static int getMin;
    public static final long h = TimeUnit.DAYS.toMillis(7);
    public static final int i = 2;
    public static final Comparator<File> j = new a();
    private static boolean length;
    private static int setMax;
    private static char[] setMin;

    /* renamed from: a  reason: collision with root package name */
    public Context f9704a;
    public ThreadPoolExecutor b;
    public File c;
    public StringBuilder d;
    public File e;
    public String f;

    public static class a implements Comparator<File> {
        public final int compare(Object obj, Object obj2) {
            return ((File) obj).getName().compareTo(((File) obj2).getName());
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TraceLog f9705a;

        public b(TraceLog traceLog) {
            this.f9705a = traceLog;
        }

        public void run() {
            TraceLog traceLog = this.f9705a;
            if (traceLog != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(traceLog.h.format(new Date(System.currentTimeMillis())));
                sb.append(",");
                sb.append(traceLog.b);
                sb.append(",");
                sb.append(traceLog.f9703a);
                sb.append(",");
                sb.append(traceLog.g);
                sb.append(",");
                sb.append(traceLog.e);
                sb.append(":");
                sb.append(traceLog.f);
                sb.append(",");
                sb.append(traceLog.c);
                if (traceLog.d != null) {
                    sb.append(' ');
                    sb.append(traceLog.d.getMessage());
                }
                String obj = sb.toString();
                int length = DiagnoseFileStorage.this.d.length() + obj.length();
                int i = DiagnoseFileStorage.i;
                if (length + i > 32768) {
                    DiagnoseFileStorage diagnoseFileStorage = DiagnoseFileStorage.this;
                    diagnoseFileStorage.a(diagnoseFileStorage.d.toString(), DiagnoseFileStorage.this.b());
                    if (DiagnoseFileStorage.this.d.length() + obj.length() + i > 32768) {
                        DiagnoseFileStorage diagnoseFileStorage2 = DiagnoseFileStorage.this;
                        diagnoseFileStorage2.a(obj, diagnoseFileStorage2.b());
                        return;
                    }
                    StringBuilder sb2 = DiagnoseFileStorage.this.d;
                    sb2.append(obj);
                    sb2.append(MasLog.Constant.GAP);
                    return;
                }
                StringBuilder sb3 = DiagnoseFileStorage.this.d;
                sb3.append(obj);
                sb3.append(MasLog.Constant.GAP);
            }
        }
    }

    static {
        length();
        try {
            int i2 = equals + 77;
            setMax = i2 % 128;
            if ((i2 % 2 != 0 ? ' ' : 25) == ' ') {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public DiagnoseFileStorage(Context context, String str, ThreadPoolExecutor threadPoolExecutor) {
        try {
            this.f9704a = context;
            this.d = new StringBuilder(32768);
            this.b = threadPoolExecutor;
            this.f = str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    static void length() {
        getMin = 8;
        getMax = true;
        length = true;
        setMin = new char[]{']', '\\', 'N', '5', '@'};
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.File] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (android.text.TextUtils.equals(r8.c.getName(), r0) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File b() {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = g
            long r0 = r0 / r2
            long r0 = r0 * r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "_"
            r2.append(r0)
            java.lang.String r0 = r8.f
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.io.File r1 = r8.c
            r2 = 47
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0041
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 == 0) goto L_0x0041
            java.io.File r1 = r8.c     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x003f }
            boolean r1 = android.text.TextUtils.equals(r1, r0)     // Catch:{ Exception -> 0x003f }
            if (r1 != 0) goto L_0x00eb
            goto L_0x0041
        L_0x003f:
            r0 = move-exception
            throw r0
        L_0x0041:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "checkAndRollFile: "
            java.lang.String r1 = r5.concat(r1)
            java.lang.String r5 = "DiagnoseFileStorage"
            com.iap.ac.android.loglite.utils.LoggerWrapper.i(r5, r1)
            java.io.File r1 = r8.c
            r6 = 0
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x005d
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == r4) goto L_0x0061
            goto L_0x008b
        L_0x0061:
            int r1 = setMax
            int r1 = r1 + 67
            int r7 = r1 % 128
            equals = r7
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x006e
            r3 = 1
        L_0x006e:
            if (r3 == r4) goto L_0x007c
            java.lang.StringBuilder r1 = r8.d
            java.lang.String r1 = r1.toString()
            java.io.File r3 = r8.c
            r8.a(r1, r3)
            goto L_0x008b
        L_0x007c:
            java.lang.StringBuilder r1 = r8.d
            java.lang.String r1 = r1.toString()
            java.io.File r3 = r8.c
            r8.a(r1, r3)
            int r1 = r6.length     // Catch:{ all -> 0x0089 }
            goto L_0x008b
        L_0x0089:
            r0 = move-exception
            throw r0
        L_0x008b:
            java.io.File r1 = r8.e
            if (r1 != 0) goto L_0x00a5
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x009f }
            android.content.Context r3 = r8.f9704a     // Catch:{ all -> 0x009f }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "diagnoseLogs"
            r1.<init>(r3, r4)     // Catch:{ all -> 0x009f }
            r8.e = r1     // Catch:{ all -> 0x009f }
            goto L_0x00a5
        L_0x009f:
            r1 = move-exception
            java.lang.String r3 = "getCurrentLogsDir"
            com.iap.ac.android.loglite.utils.LoggerWrapper.e(r5, r3, r1)
        L_0x00a5:
            java.io.File r1 = r8.e     // Catch:{ all -> 0x00c7 }
            r3 = 20
            if (r1 == 0) goto L_0x00ae
            r4 = 20
            goto L_0x00b0
        L_0x00ae:
            r4 = 36
        L_0x00b0:
            if (r4 == r3) goto L_0x00b3
            goto L_0x00c8
        L_0x00b3:
            boolean r1 = r1.exists()     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x00bc
            r1 = 47
            goto L_0x00be
        L_0x00bc:
            r1 = 48
        L_0x00be:
            if (r1 == r2) goto L_0x00c1
            goto L_0x00c8
        L_0x00c1:
            java.io.File r1 = r8.e     // Catch:{ all -> 0x00c7 }
            r1.mkdirs()     // Catch:{ all -> 0x00c7 }
            goto L_0x00c8
        L_0x00c7:
        L_0x00c8:
            java.io.File r1 = r8.e
            if (r1 != 0) goto L_0x00cd
            return r6
        L_0x00cd:
            r8.a((java.io.File) r1)     // Catch:{ all -> 0x00da }
            int r3 = setMax
            int r3 = r3 + 9
            int r4 = r3 % 128
            equals = r4
            int r3 = r3 % 2
        L_0x00da:
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r0)
            r8.c = r3
            int r0 = equals
            int r0 = r0 + 51
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
        L_0x00eb:
            java.io.File r0 = r8.c
            int r1 = equals
            int r1 = r1 + r2
            int r2 = r1 % 128
            setMax = r2
            int r1 = r1 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.diagnoselog.storage.DiagnoseFileStorage.b():java.io.File");
    }

    public void a(TraceLog traceLog) {
        int i2 = setMax + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (!DiagnoseLogContext.b().e) {
            int i4 = equals + 55;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.b.execute(new b(traceLog));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.io.File r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0006
            r2 = 0
            goto L_0x0007
        L_0x0006:
            r2 = 1
        L_0x0007:
            if (r2 == 0) goto L_0x000a
            return
        L_0x000a:
            com.iap.ac.android.loglite.core.AnalyticsContext r2 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()     // Catch:{ all -> 0x00bf }
            boolean r2 = r2.isNeedEncryptLog()     // Catch:{ all -> 0x00bf }
            r3 = 0
            r4 = 2
            if (r2 == 0) goto L_0x005f
            int r2 = setMax
            int r2 = r2 + 9
            int r5 = r2 % 128
            equals = r5
            int r2 = r2 % r4
            if (r2 != 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 == 0) goto L_0x003a
            com.iap.ac.android.loglite.core.AnalyticsContext r2 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()     // Catch:{ all -> 0x00bf }
            com.iap.ac.android.loglite.core.LogEncryptClient r2 = r2.getLogEncryptClient()     // Catch:{ all -> 0x00bf }
            java.lang.String r2 = r2.encrypt(r9)     // Catch:{ all -> 0x00bf }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00bf }
            int r6 = r3.length     // Catch:{ all -> 0x00bf }
            if (r5 != 0) goto L_0x005f
            goto L_0x004c
        L_0x003a:
            com.iap.ac.android.loglite.core.AnalyticsContext r2 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()     // Catch:{ all -> 0x00bf }
            com.iap.ac.android.loglite.core.LogEncryptClient r2 = r2.getLogEncryptClient()     // Catch:{ all -> 0x00bf }
            java.lang.String r2 = r2.encrypt(r9)     // Catch:{ all -> 0x00bf }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00bf }
            if (r5 != 0) goto L_0x005f
        L_0x004c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "1_"
            r9.<init>(r5)     // Catch:{ all -> 0x00bf }
            r9.append(r2)     // Catch:{ all -> 0x00bf }
            java.lang.String r2 = "$$"
            r9.append(r2)     // Catch:{ all -> 0x00bf }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00bf }
        L_0x005f:
            r2 = 5
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x00bf }
            r5 = -123(0xffffffffffffff85, float:NaN)
            r2[r1] = r5     // Catch:{ all -> 0x00bf }
            r5 = -124(0xffffffffffffff84, float:NaN)
            r2[r0] = r5     // Catch:{ all -> 0x00bf }
            r5 = -125(0xffffffffffffff83, float:NaN)
            r2[r4] = r5     // Catch:{ all -> 0x00bf }
            r5 = -126(0xffffffffffffff82, float:NaN)
            r6 = 3
            r2[r6] = r5     // Catch:{ all -> 0x00bf }
            r5 = 4
            r7 = -127(0xffffffffffffff81, float:NaN)
            r2[r5] = r7     // Catch:{ all -> 0x00bf }
            int r5 = android.view.ViewConfiguration.getMinimumFlingVelocity()     // Catch:{ all -> 0x00bf }
            int r5 = r5 >> 16
            int r5 = 127 - r5
            java.lang.String r2 = getMin(r2, r5, r3, r3)     // Catch:{ all -> 0x00bf }
            java.lang.String r2 = r2.intern()     // Catch:{ all -> 0x00bf }
            byte[] r9 = r9.getBytes(r2)     // Catch:{ all -> 0x00bf }
            int r2 = r9.length     // Catch:{ all -> 0x00bf }
            byte[] r9 = com.iap.ac.android.loglite.utils.LoggingUtil.gzipDataByBytes(r9, r1, r2)     // Catch:{ all -> 0x00bf }
            r2 = 90
            if (r9 != 0) goto L_0x0098
            r3 = 59
            goto L_0x009a
        L_0x0098:
            r3 = 90
        L_0x009a:
            if (r3 == r2) goto L_0x00b2
            int r9 = setMax
            int r9 = r9 + r6
            int r10 = r9 % 128
            equals = r10
            int r9 = r9 % r4
            if (r9 != 0) goto L_0x00ac
            java.lang.StringBuilder r9 = r8.d
            r9.setLength(r0)
            return
        L_0x00ac:
            java.lang.StringBuilder r9 = r8.d
            r9.setLength(r1)
            return
        L_0x00b2:
            com.iap.ac.android.loglite.utils.FileUtil.writeFile(r10, r9, r0)     // Catch:{ all -> 0x00bf }
            int r9 = equals
            int r9 = r9 + 85
            int r10 = r9 % 128
            setMax = r10
            int r9 = r9 % r4
            goto L_0x00c7
        L_0x00bf:
            r9 = move-exception
            java.lang.String r10 = "DiagnoseFileStorage"
            java.lang.String r0 = "appendLogEvent"
            com.iap.ac.android.loglite.utils.LoggerWrapper.e(r10, r0, r9)     // Catch:{ all -> 0x00cd }
        L_0x00c7:
            java.lang.StringBuilder r9 = r8.d
            r9.setLength(r1)
            return
        L_0x00cd:
            r9 = move-exception
            java.lang.StringBuilder r10 = r8.d
            r10.setLength(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.diagnoselog.storage.DiagnoseFileStorage.a(java.lang.String, java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0 == 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = new java.lang.StringBuilder(" appender flush: ");
        r0.append(r2.d.length());
        com.iap.ac.android.loglite.utils.LoggerWrapper.v("DiagnoseFileStorage", r0.toString());
        a(r2.d.toString(), b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r2.d.length() == 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r2 = this;
            int r0 = equals
            int r0 = r0 + 45
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == r1) goto L_0x001b
            java.lang.StringBuilder r0 = r2.d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0032
            goto L_0x0027
        L_0x001b:
            java.lang.StringBuilder r0 = r2.d
            int r0 = r0.length()
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0032
        L_0x0027:
            int r0 = equals
            int r0 = r0 + 111
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            return
        L_0x0032:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " appender flush: "
            r0.<init>(r1)     // Catch:{ Exception -> 0x0059 }
            java.lang.StringBuilder r1 = r2.d     // Catch:{ Exception -> 0x0059 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0059 }
            r0.append(r1)     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = "DiagnoseFileStorage"
            com.iap.ac.android.loglite.utils.LoggerWrapper.v(r1, r0)     // Catch:{ Exception -> 0x0059 }
            java.lang.StringBuilder r0 = r2.d     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0059 }
            java.io.File r1 = r2.b()     // Catch:{ Exception -> 0x0059 }
            r2.a(r0, r1)     // Catch:{ Exception -> 0x0059 }
            return
        L_0x0059:
            r0 = move-exception
            throw r0
        L_0x005b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.diagnoselog.storage.DiagnoseFileStorage.a():void");
    }

    @VisibleForTesting
    public void a(File file) {
        try {
            if (file.isDirectory()) {
                File[] fileArr = null;
                try {
                    fileArr = file.listFiles();
                } catch (Throwable th) {
                    LoggerWrapper.e("DiagnoseFileStorage", "cleanExpiresFile", th);
                }
                if ((fileArr != null ? 'H' : 'X') != 'X') {
                    if ((fileArr.length != 0 ? '!' : 11) == '!') {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j2 = h;
                        long j3 = currentTimeMillis - j2;
                        long j4 = currentTimeMillis + j2;
                        int length2 = fileArr.length;
                        int i2 = 0;
                        while (true) {
                            if ((i2 < length2 ? 15 : 'M') == 'M') {
                                break;
                            }
                            int i3 = setMax + 23;
                            try {
                                equals = i3 % 128;
                                int i4 = i3 % 2;
                                File file2 = fileArr[i2];
                                if ((file2 != null ? 'Q' : 'I') != 'I') {
                                    int i5 = setMax + 111;
                                    equals = i5 % 128;
                                    int i6 = i5 % 2;
                                    if ((file2.exists() ? 'E' : 'T') != 'T') {
                                        int i7 = setMax + 107;
                                        equals = i7 % 128;
                                        int i8 = i7 % 2;
                                        if ((file2.isFile() ? 8 : '3') != '3') {
                                            try {
                                                String str = file2.getName().split("_")[0];
                                                if ((TextUtils.isDigitsOnly(str) ? 'N' : 'c') != 'c') {
                                                    long parseLong = Long.parseLong(str);
                                                    if (parseLong >= j3) {
                                                        int i9 = equals + 77;
                                                        setMax = i9 % 128;
                                                        int i10 = i9 % 2;
                                                        if (parseLong <= j4) {
                                                        }
                                                    }
                                                    file2.delete();
                                                    StringBuilder sb = new StringBuilder("cleanExpiresFile: ");
                                                    sb.append(file2.getName());
                                                    sb.append(" is too old !");
                                                    LoggerWrapper.e("DiagnoseFileStorage", sb.toString());
                                                    int i11 = setMax + 49;
                                                    equals = i11 % 128;
                                                    int i12 = i11 % 2;
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                }
                                i2++;
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                        if (FileUtil.getFolderSize(file) >= 33554432) {
                            try {
                                a(file.listFiles());
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public final void a(File[] fileArr) {
        File file;
        if (fileArr != null) {
            int i2 = setMax + 29;
            equals = i2 % 128;
            int i3 = i2 % 2;
            if (fileArr.length > 0) {
                Arrays.sort(fileArr, j);
                double length2 = (double) fileArr.length;
                Double.isNaN(length2);
                int floor = (int) Math.floor(length2 * 0.25d);
                int i4 = equals + 49;
                setMax = i4 % 128;
                int i5 = i4 % 2;
                for (int i6 = 0; i6 < floor; i6++) {
                    int i7 = equals + 37;
                    setMax = i7 % 128;
                    if (i7 % 2 != 0) {
                        file = fileArr[i6];
                        Object obj = null;
                        super.hashCode();
                        if ((file != null ? ':' : '_') != ':') {
                            continue;
                        }
                    } else {
                        file = fileArr[i6];
                        if (file == null) {
                            continue;
                        }
                    }
                    if (!file.exists()) {
                        continue;
                    } else {
                        int i8 = setMax + 113;
                        equals = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 32 / 0;
                            if (!file.isFile()) {
                            }
                        } else {
                            try {
                                if (!file.isFile()) {
                                }
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                        try {
                            file.delete();
                            StringBuilder sb = new StringBuilder("cleanExpiresFile: ");
                            sb.append(file.getName());
                            sb.append(" is too large !");
                            LoggerWrapper.e("DiagnoseFileStorage", sb.toString());
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    private static String getMin(byte[] bArr, int i2, int[] iArr, char[] cArr) {
        char[] cArr2 = setMin;
        int i3 = getMin;
        int i4 = 0;
        if ((length ? (char) 5 : 18) != 18) {
            int length2 = bArr.length;
            char[] cArr3 = new char[length2];
            int i5 = equals + 41;
            setMax = i5 % 128;
            int i6 = i5 % 2;
            while (true) {
                if ((i4 < length2 ? (char) 20 : 1) == 1) {
                    return new String(cArr3);
                }
                int i7 = equals + 113;
                setMax = i7 % 128;
                int i8 = i7 % 2;
                cArr3[i4] = (char) (cArr2[bArr[(length2 - 1) - i4] + i2] - i3);
                i4++;
            }
        } else if (getMax) {
            int length3 = cArr.length;
            char[] cArr4 = new char[length3];
            while (i4 < length3) {
                cArr4[i4] = (char) (cArr2[cArr[(length3 - 1) - i4] - i2] - i3);
                i4++;
            }
            return new String(cArr4);
        } else {
            int length4 = iArr.length;
            char[] cArr5 = new char[length4];
            while (i4 < length4) {
                int i9 = setMax + 101;
                equals = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr5[i4] = (char) (cArr2[iArr[(length4 + 0) * i4] >> i2] >>> i3);
                    i4 += 11;
                } else {
                    cArr5[i4] = (char) (cArr2[iArr[(length4 - 1) - i4] - i2] - i3);
                    i4++;
                }
            }
            return new String(cArr5);
        }
    }
}
