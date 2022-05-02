package com.alipay.iap.android.aplog.monitor.sampler;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CpuSampler extends AbstractSampler {
    private final int c = ((int) (((float) this.b) * 1.2f));
    private final LinkedHashMap<Long, String> d = new LinkedHashMap<>();
    private int e = 0;
    private long f = 0;
    private long g = 0;
    private long h = 0;
    private long i = 0;
    private long j = 0;
    private long k = 0;

    public CpuSampler(long j2) {
        super(j2);
    }

    public void a() {
        super.a();
        e();
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.d) {
            for (Map.Entry next : this.d.entrySet()) {
                sb.append(this.f10657a.format(Long.valueOf(((Long) next.getKey()).longValue())));
                sb.append(' ');
                sb.append((String) next.getValue());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public boolean a(long j2, long j3) {
        if (j3 - j2 <= this.b) {
            return false;
        }
        long j4 = j2 - this.b;
        long j5 = j2 + this.b;
        synchronized (this.d) {
            long j6 = 0;
            for (Map.Entry<Long, String> key : this.d.entrySet()) {
                long longValue = ((Long) key.getKey()).longValue();
                if (j4 < longValue && longValue < j5) {
                    if (j6 != 0 && longValue - j6 > ((long) this.c)) {
                        return true;
                    }
                    j6 = longValue;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC, Splitter:B:29:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068 A[Catch:{ all -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r10 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0060 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0060 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "/proc/stat"
            r3.<init>(r4)     // Catch:{ all -> 0x0060 }
            r2.<init>(r3)     // Catch:{ all -> 0x0060 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x005d }
            java.lang.String r4 = ""
            if (r2 != 0) goto L_0x001d
            r2 = r4
        L_0x001d:
            int r5 = r10.e     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x0027
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x005d }
            r10.e = r5     // Catch:{ all -> 0x005d }
        L_0x0027:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x005d }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x005d }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            java.lang.String r9 = "/proc/"
            r8.<init>(r9)     // Catch:{ all -> 0x005d }
            int r9 = r10.e     // Catch:{ all -> 0x005d }
            r8.append(r9)     // Catch:{ all -> 0x005d }
            java.lang.String r9 = "/stat"
            r8.append(r9)     // Catch:{ all -> 0x005d }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x005d }
            r7.<init>(r8)     // Catch:{ all -> 0x005d }
            r6.<init>(r7)     // Catch:{ all -> 0x005d }
            r5.<init>(r6, r3)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r5.readLine()     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r4 = r0
        L_0x0053:
            r10.a((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x005e }
            r1.close()     // Catch:{ all -> 0x005c }
            r5.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            return
        L_0x005d:
            r5 = r0
        L_0x005e:
            r0 = r1
            goto L_0x0061
        L_0x0060:
            r5 = r0
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            r0.close()     // Catch:{ all -> 0x006c }
        L_0x0066:
            if (r5 == 0) goto L_0x006c
            r5.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.monitor.sampler.CpuSampler.c():void");
    }

    private void e() {
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        long j2;
        long j3;
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
                if (this.j != 0) {
                    StringBuilder sb = new StringBuilder();
                    long j4 = parseLong4 - this.h;
                    j3 = parseLong4;
                    long j5 = parseLong6 - this.j;
                    j2 = parseLong6;
                    sb.append("cpu:");
                    sb.append(((j5 - j4) * 100) / j5);
                    sb.append("% app:");
                    sb.append(((parseLong7 - this.k) * 100) / j5);
                    sb.append("% [user:");
                    sb.append(((parseLong - this.f) * 100) / j5);
                    sb.append("% system:");
                    sb.append(((parseLong3 - this.g) * 100) / j5);
                    sb.append("% ioWait:");
                    sb.append(((parseLong5 - this.i) * 100) / j5);
                    sb.append("% ]");
                    synchronized (this.d) {
                        this.d.put(Long.valueOf(System.currentTimeMillis()), sb.toString());
                        if (this.d.size() > 10) {
                            Iterator<Map.Entry<Long, String>> it = this.d.entrySet().iterator();
                            if (it.hasNext()) {
                                this.d.remove((Long) it.next().getKey());
                            }
                        }
                    }
                } else {
                    j2 = parseLong6;
                    j3 = parseLong4;
                }
                this.f = parseLong;
                this.g = parseLong3;
                this.h = j3;
                this.i = parseLong5;
                this.j = j2;
                this.k = parseLong7;
            }
        }
    }
}
