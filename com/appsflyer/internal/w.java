package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class w {

    /* renamed from: ˊ  reason: contains not printable characters */
    static final BitSet f8783 = new BitSet(6);

    /* renamed from: ˊॱ  reason: contains not printable characters */
    private static final Handler f8784 = new Handler(Looper.getMainLooper());
    @VisibleForTesting

    /* renamed from: ˋॱ  reason: contains not printable characters */
    private static volatile w f8785;

    /* renamed from: ʻ  reason: contains not printable characters */
    boolean f8786;

    /* renamed from: ʼ  reason: contains not printable characters */
    boolean f8787;

    /* renamed from: ʽ  reason: contains not printable characters */
    public final Runnable f8788 = new Runnable() {
        public final void run() {
            synchronized (w.this.f8789) {
                w.this.m1297();
            }
        }
    };

    /* renamed from: ˋ  reason: contains not printable characters */
    final Object f8789 = new Object();

    /* renamed from: ˎ  reason: contains not printable characters */
    public final Handler f8790;

    /* renamed from: ˏ  reason: contains not printable characters */
    final Map<y, y> f8791 = new HashMap(f8783.size());

    /* renamed from: ˏॱ  reason: contains not printable characters */
    public long f8792 = 0;

    /* renamed from: ͺ  reason: contains not printable characters */
    public int f8793 = 1;

    /* renamed from: ॱ  reason: contains not printable characters */
    final SensorManager f8794;

    /* renamed from: ॱˊ  reason: contains not printable characters */
    private final Map<y, Map<String, Object>> f8795 = new ConcurrentHashMap(f8783.size());
    /* access modifiers changed from: private */

    /* renamed from: ॱˋ  reason: contains not printable characters */
    public final Runnable f8796 = new Runnable() {
        public final void run() {
            synchronized (w.this.f8789) {
                if (w.this.f8793 == 0) {
                    int unused = w.this.f8793 = 1;
                }
                w.this.f8790.postDelayed(w.this.f8788, ((long) w.this.f8793) * 500);
            }
        }
    };

    /* renamed from: ॱॱ  reason: contains not printable characters */
    public final Runnable f8797 = new Runnable() {
        /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|4|5|6|(5:9|(1:14)(1:13)|(4:16|(1:18)|19|29)(1:28)|27|7)|20|21|22) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r10 = this;
                com.appsflyer.internal.w r0 = com.appsflyer.internal.w.this
                java.lang.Object r0 = r0.f8789
                monitor-enter(r0)
                com.appsflyer.internal.w r1 = com.appsflyer.internal.w.this     // Catch:{ all -> 0x0076 }
                r2 = 1
                android.hardware.SensorManager r3 = r1.f8794     // Catch:{ all -> 0x005f }
                r4 = -1
                java.util.List r3 = r3.getSensorList(r4)     // Catch:{ all -> 0x005f }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x005f }
            L_0x0013:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x005f }
                if (r4 == 0) goto L_0x005f
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x005f }
                android.hardware.Sensor r4 = (android.hardware.Sensor) r4     // Catch:{ all -> 0x005f }
                int r5 = r4.getType()     // Catch:{ all -> 0x005f }
                r6 = 0
                if (r5 < 0) goto L_0x0030
                java.util.BitSet r7 = com.appsflyer.internal.w.f8783     // Catch:{ all -> 0x005f }
                boolean r5 = r7.get(r5)     // Catch:{ all -> 0x005f }
                if (r5 == 0) goto L_0x0030
                r5 = 1
                goto L_0x0031
            L_0x0030:
                r5 = 0
            L_0x0031:
                if (r5 == 0) goto L_0x0013
                int r5 = r4.getType()     // Catch:{ all -> 0x005f }
                java.lang.String r7 = r4.getName()     // Catch:{ all -> 0x005f }
                java.lang.String r8 = r4.getVendor()     // Catch:{ all -> 0x005f }
                com.appsflyer.internal.y r9 = new com.appsflyer.internal.y     // Catch:{ all -> 0x005f }
                r9.<init>(r5, r7, r8)     // Catch:{ all -> 0x005f }
                java.util.Map<com.appsflyer.internal.y, com.appsflyer.internal.y> r5 = r1.f8791     // Catch:{ all -> 0x005f }
                boolean r5 = r5.containsKey(r9)     // Catch:{ all -> 0x005f }
                if (r5 != 0) goto L_0x0051
                java.util.Map<com.appsflyer.internal.y, com.appsflyer.internal.y> r5 = r1.f8791     // Catch:{ all -> 0x005f }
                r5.put(r9, r9)     // Catch:{ all -> 0x005f }
            L_0x0051:
                java.util.Map<com.appsflyer.internal.y, com.appsflyer.internal.y> r5 = r1.f8791     // Catch:{ all -> 0x005f }
                java.lang.Object r5 = r5.get(r9)     // Catch:{ all -> 0x005f }
                android.hardware.SensorEventListener r5 = (android.hardware.SensorEventListener) r5     // Catch:{ all -> 0x005f }
                android.hardware.SensorManager r7 = r1.f8794     // Catch:{ all -> 0x005f }
                r7.registerListener(r5, r4, r6)     // Catch:{ all -> 0x005f }
                goto L_0x0013
            L_0x005f:
                r1.f8786 = r2     // Catch:{ all -> 0x0076 }
                com.appsflyer.internal.w r1 = com.appsflyer.internal.w.this     // Catch:{ all -> 0x0076 }
                android.os.Handler r1 = r1.f8790     // Catch:{ all -> 0x0076 }
                com.appsflyer.internal.w r3 = com.appsflyer.internal.w.this     // Catch:{ all -> 0x0076 }
                java.lang.Runnable r3 = r3.f8796     // Catch:{ all -> 0x0076 }
                r4 = 100
                r1.postDelayed(r3, r4)     // Catch:{ all -> 0x0076 }
                com.appsflyer.internal.w r1 = com.appsflyer.internal.w.this     // Catch:{ all -> 0x0076 }
                r1.f8787 = r2     // Catch:{ all -> 0x0076 }
                monitor-exit(r0)     // Catch:{ all -> 0x0076 }
                return
            L_0x0076:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x007a
            L_0x0079:
                throw r1
            L_0x007a:
                goto L_0x0079
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.w.AnonymousClass1.run():void");
        }
    };

    /* renamed from: ᐝ  reason: contains not printable characters */
    public final Runnable f8798 = new Runnable() {
        public final void run() {
            synchronized (w.this.f8789) {
                if (w.this.f8787) {
                    w.this.f8790.removeCallbacks(w.this.f8797);
                    w.this.f8790.removeCallbacks(w.this.f8788);
                    w.this.m1297();
                    w.this.f8787 = false;
                }
            }
        }
    };

    static {
        f8783.set(1);
        f8783.set(2);
        f8783.set(4);
    }

    private w(@NonNull SensorManager sensorManager, Handler handler) {
        this.f8794 = sensorManager;
        this.f8790 = handler;
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    public static w m1292(Context context) {
        if (f8785 != null) {
            return f8785;
        }
        return m1293((SensorManager) context.getApplicationContext().getSystemService("sensor"), f8784);
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private static w m1293(SensorManager sensorManager, Handler handler) {
        if (f8785 == null) {
            synchronized (w.class) {
                if (f8785 == null) {
                    f8785 = new w(sensorManager, handler);
                }
            }
        }
        return f8785;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˏ  reason: contains not printable characters */
    public final void m1297() {
        try {
            if (!this.f8791.isEmpty()) {
                for (y next : this.f8791.values()) {
                    this.f8794.unregisterListener(next);
                    next.m1302(this.f8795, true);
                }
            }
        } catch (Throwable unused) {
        }
        this.f8793 = 0;
        this.f8786 = false;
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    public final List<Map<String, Object>> m1295() {
        for (y r1 : this.f8791.values()) {
            r1.m1302(this.f8795, true);
        }
        if (this.f8795.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.f8795.values());
    }

    @NonNull
    /* renamed from: ˎ  reason: contains not printable characters */
    public final List<Map<String, Object>> m1296() {
        synchronized (this.f8789) {
            if (!this.f8791.isEmpty() && this.f8786) {
                for (y r2 : this.f8791.values()) {
                    r2.m1302(this.f8795, false);
                }
            }
            if (this.f8795.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Collections.emptyList());
                return copyOnWriteArrayList;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(this.f8795.values());
            return copyOnWriteArrayList2;
        }
    }
}
