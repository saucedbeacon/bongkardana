package com.ta.audid;

import android.content.Context;
import android.text.TextUtils;
import com.ta.audid.f.d;
import com.ta.audid.f.e;
import com.ta.audid.g.m;
import java.io.File;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final a f9832a = new a();

    /* renamed from: a  reason: collision with other field name */
    private long f8819a = 0;

    /* renamed from: a  reason: collision with other field name */
    private com.ta.audid.b.a f8820a = null;

    /* renamed from: a  reason: collision with other field name */
    private File f8821a = null;

    /* renamed from: a  reason: collision with other field name */
    private String f8822a = "testKey";

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f8823a = false;
    private String b = "";

    /* renamed from: b  reason: collision with other field name */
    private boolean f8824b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private Context mContext = null;

    private a() {
    }

    public static a a() {
        return f9832a;
    }

    public synchronized void init() {
        if (!this.f8823a) {
            com.ta.audid.filesync.a.a().b(this.mContext);
            this.f8820a = new com.ta.audid.b.a(this.mContext, "utdid.db");
            d.a(this.mContext).start();
            this.d = com.ta.audid.d.d.h(this.mContext);
            this.e = com.ta.audid.d.d.i(this.mContext);
            this.f8823a = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.content.Context r0 = r1.mContext     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            if (r2 != 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            android.content.Context r0 = r2.getApplicationContext()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0017
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001b }
            r1.mContext = r2     // Catch:{ all -> 0x001b }
            monitor-exit(r1)
            return
        L_0x0017:
            r1.mContext = r2     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.a.a(android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        return;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(boolean r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 1
            r5.c = r6     // Catch:{ Exception -> 0x0066 }
            java.lang.String r2 = ""
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0066 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x0066 }
            r3[r0] = r4     // Catch:{ Exception -> 0x0066 }
            com.ta.audid.g.m.d(r2, r3)     // Catch:{ Exception -> 0x0066 }
            if (r6 == 0) goto L_0x0027
            android.content.Context r2 = r5.mContext     // Catch:{ Exception -> 0x0066 }
            com.ta.audid.f.d r2 = com.ta.audid.f.d.a(r2)     // Catch:{ Exception -> 0x0066 }
            r2.stop()     // Catch:{ Exception -> 0x0066 }
            com.ta.audid.filesync.a r2 = com.ta.audid.filesync.a.a()     // Catch:{ Exception -> 0x0066 }
            android.content.Context r3 = r5.mContext     // Catch:{ Exception -> 0x0066 }
            r2.c((android.content.Context) r3)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0039
        L_0x0027:
            com.ta.audid.filesync.a r2 = com.ta.audid.filesync.a.a()     // Catch:{ Exception -> 0x0066 }
            android.content.Context r3 = r5.mContext     // Catch:{ Exception -> 0x0066 }
            r2.b(r3)     // Catch:{ Exception -> 0x0066 }
            android.content.Context r2 = r5.mContext     // Catch:{ Exception -> 0x0066 }
            com.ta.audid.f.d r2 = com.ta.audid.f.d.a(r2)     // Catch:{ Exception -> 0x0066 }
            r2.start()     // Catch:{ Exception -> 0x0066 }
        L_0x0039:
            java.io.File r2 = r5.f8821a     // Catch:{ Exception -> 0x0066 }
            if (r2 != 0) goto L_0x0048
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            java.lang.String r3 = com.ta.audid.f.e.R()     // Catch:{ Exception -> 0x0066 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0066 }
            r5.f8821a = r2     // Catch:{ Exception -> 0x0066 }
        L_0x0048:
            java.io.File r2 = r5.f8821a     // Catch:{ Exception -> 0x0066 }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x0066 }
            if (r6 == 0) goto L_0x0059
            if (r2 != 0) goto L_0x0059
            java.io.File r6 = r5.f8821a     // Catch:{ Exception -> 0x0066 }
            r6.createNewFile()     // Catch:{ Exception -> 0x0066 }
            monitor-exit(r5)
            return
        L_0x0059:
            if (r6 != 0) goto L_0x0062
            if (r2 == 0) goto L_0x0062
            java.io.File r6 = r5.f8821a     // Catch:{ Exception -> 0x0066 }
            r6.delete()     // Catch:{ Exception -> 0x0066 }
        L_0x0062:
            monitor-exit(r5)
            return
        L_0x0064:
            r6 = move-exception
            goto L_0x0072
        L_0x0066:
            r6 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0064 }
            r1[r0] = r6     // Catch:{ all -> 0x0064 }
            com.ta.audid.g.m.d(r2, r1)     // Catch:{ all -> 0x0064 }
            monitor-exit(r5)
            return
        L_0x0072:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.a.a(boolean):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized boolean m1311a() {
        if (this.f8824b) {
            m.d("", Boolean.valueOf(this.c));
            return this.c;
        }
        try {
            if (this.f8821a == null) {
                this.f8821a = new File(e.R());
            }
            if (this.f8821a.exists()) {
                this.c = true;
                m.d("", "old mode file");
                boolean z = this.c;
                this.f8824b = true;
                return z;
            }
        } catch (Exception e2) {
            try {
                m.d("", e2);
            } catch (Throwable th) {
                this.f8824b = true;
                throw th;
            }
        }
        this.f8824b = true;
        this.c = false;
        m.d("", "new mode file");
        return this.c;
    }

    public void setDebug(boolean z) {
        m.setDebug(z);
    }

    public Context getContext() {
        return this.mContext;
    }

    /* renamed from: a  reason: collision with other method in class */
    public com.ta.audid.b.a m1309a() {
        return this.f8820a;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8822a = str;
        }
    }

    public String getAppkey() {
        return this.f8822a;
    }

    public void setAppChannel(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(566965551, oncanceled);
            onCancelLoad.getMin(566965551, oncanceled);
        }
        this.b = str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1310a() {
        return this.b;
    }

    public void a(long j) {
        this.f8819a = j - System.currentTimeMillis();
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m1308a() {
        return System.currentTimeMillis() + this.f8819a;
    }

    public String b() {
        StringBuilder sb = new StringBuilder("");
        sb.append(a());
        return sb.toString();
    }
}
