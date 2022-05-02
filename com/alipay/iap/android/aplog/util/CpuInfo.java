package com.alipay.iap.android.aplog.util;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CpuInfo {
    private static final int BUFFER_SIZE = 1000;
    private static final int MAX_ENTRY_COUNT = 10;
    private SimpleDateFormat TIME_FORMATTER = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.getDefault());
    private long mAppCpuTimeLast = 0;
    private final LinkedHashMap<Long, String> mCpuInfoEntries = new LinkedHashMap<Long, String>() {
        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry<Long, String> entry) {
            return size() > 10;
        }
    };
    private long mIdleLast = 0;
    private long mIoWaitLast = 0;
    private int mPid = 0;
    private long mSystemLast = 0;
    private long mTotalLast = 0;
    private long mUserLast = 0;

    public String getCpuRateInfo() {
        if (Build.VERSION.SDK_INT >= 26) {
            return "";
        }
        doSample();
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        doSample();
        StringBuilder sb = new StringBuilder();
        synchronized (this.mCpuInfoEntries) {
            for (Map.Entry next : this.mCpuInfoEntries.entrySet()) {
                sb.append(this.TIME_FORMATTER.format(Long.valueOf(((Long) next.getKey()).longValue())));
                sb.append(' ');
                sb.append((String) next.getValue());
            }
        }
        reset();
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007d A[SYNTHETIC, Splitter:B:37:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a A[SYNTHETIC, Splitter:B:44:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f A[Catch:{ all -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doSample() {
        /*
            r10 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            java.lang.String r4 = "/proc/stat"
            r3.<init>(r4)     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.lang.String r4 = ""
            if (r2 != 0) goto L_0x001d
            r2 = r4
        L_0x001d:
            int r5 = r10.mPid     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            if (r5 != 0) goto L_0x0027
            int r5 = android.os.Process.myPid()     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            r10.mPid = r5     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
        L_0x0027:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.lang.String r9 = "/proc/"
            r8.<init>(r9)     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            int r9 = r10.mPid     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            r8.append(r9)     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.lang.String r9 = "/stat"
            r8.append(r9)     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            r5.<init>(r6, r3)     // Catch:{ Exception -> 0x0065, all -> 0x0061 }
            java.lang.String r0 = r5.readLine()     // Catch:{ Exception -> 0x005f, all -> 0x005d }
            if (r0 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r4 = r0
        L_0x0053:
            r10.parse(r2, r4)     // Catch:{ Exception -> 0x005f, all -> 0x005d }
            r1.close()     // Catch:{ all -> 0x005c }
            r5.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            return
        L_0x005d:
            r2 = move-exception
            goto L_0x0063
        L_0x005f:
            r2 = move-exception
            goto L_0x0067
        L_0x0061:
            r2 = move-exception
            r5 = r0
        L_0x0063:
            r0 = r1
            goto L_0x0088
        L_0x0065:
            r2 = move-exception
            r5 = r0
        L_0x0067:
            r0 = r1
            goto L_0x006e
        L_0x0069:
            r2 = move-exception
            r5 = r0
            goto L_0x0088
        L_0x006c:
            r2 = move-exception
            r5 = r0
        L_0x006e:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "CpuInfo"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0087 }
            r1.error((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0080
            r0.close()     // Catch:{ all -> 0x0086 }
        L_0x0080:
            if (r5 == 0) goto L_0x0086
            r5.close()     // Catch:{ all -> 0x0086 }
        L_0x0086:
            return
        L_0x0087:
            r2 = move-exception
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            r0.close()     // Catch:{ all -> 0x0092 }
        L_0x008d:
            if (r5 == 0) goto L_0x0092
            r5.close()     // Catch:{ all -> 0x0092 }
        L_0x0092:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.CpuInfo.doSample():void");
    }

    private void reset() {
        this.mUserLast = 0;
        this.mSystemLast = 0;
        this.mIdleLast = 0;
        this.mIoWaitLast = 0;
        this.mTotalLast = 0;
        this.mAppCpuTimeLast = 0;
    }

    /* access modifiers changed from: package-private */
    public void parse(String str, String str2) {
        long j;
        long j2;
        String[] split = str.split(" ");
        if (split.length >= 9) {
            long parseLong = Long.parseLong(split[2]);
            long parseLong2 = Long.parseLong(split[3]);
            long parseLong3 = Long.parseLong(split[4]);
            long parseLong4 = Long.parseLong(split[5]);
            long parseLong5 = Long.parseLong(split[6]);
            long parseLong6 = parseLong2 + parseLong + parseLong3 + parseLong4 + parseLong5 + Long.parseLong(split[7]) + Long.parseLong(split[8]);
            String[] split2 = str2.split(" ");
            if (split2.length >= 17) {
                long parseLong7 = Long.parseLong(split2[13]) + Long.parseLong(split2[14]) + Long.parseLong(split2[15]) + Long.parseLong(split2[16]);
                if (this.mTotalLast != 0) {
                    StringBuilder sb = new StringBuilder();
                    long j3 = parseLong4 - this.mIdleLast;
                    j2 = parseLong4;
                    long j4 = parseLong6 - this.mTotalLast;
                    j = parseLong6;
                    sb.append("cpu:");
                    sb.append(((j4 - j3) * 100) / j4);
                    sb.append("% app:");
                    sb.append(((parseLong7 - this.mAppCpuTimeLast) * 100) / j4);
                    sb.append("% user:");
                    sb.append(((parseLong - this.mUserLast) * 100) / j4);
                    sb.append("% system:");
                    sb.append(((parseLong3 - this.mSystemLast) * 100) / j4);
                    sb.append("% ioWait:");
                    sb.append(((parseLong5 - this.mIoWaitLast) * 100) / j4);
                    sb.append("% ");
                    synchronized (this.mCpuInfoEntries) {
                        this.mCpuInfoEntries.put(Long.valueOf(System.currentTimeMillis()), sb.toString());
                    }
                } else {
                    j = parseLong6;
                    j2 = parseLong4;
                }
                this.mUserLast = parseLong;
                this.mSystemLast = parseLong3;
                this.mIdleLast = j2;
                this.mIoWaitLast = parseLong5;
                this.mTotalLast = j;
                this.mAppCpuTimeLast = parseLong7;
            }
        }
    }
}
