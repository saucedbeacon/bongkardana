package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.play.core.internal.bq;
import java.io.File;
import java.util.Set;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private final c f9605a;

    a(c cVar) {
        this.f9605a = cVar;
    }

    static final synchronized void b(Context context, Set<File> set) {
        synchronized (a.class) {
            AssetManager assets = context.getAssets();
            for (File path : set) {
                bq.a((Object) assets, "addAssetPath", Integer.class, String.class, path.getPath());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[Catch:{ Exception -> 0x0041, all -> 0x0039 }, LOOP:0: B:10:0x0018->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(android.content.Context r5, java.util.Set<java.lang.String> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()     // Catch:{ Exception -> 0x000e }
            android.os.StrictMode.allowThreadDiskReads()     // Catch:{ Exception -> 0x000f }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ Exception -> 0x000f }
            goto L_0x000f
        L_0x000c:
            r5 = move-exception
            goto L_0x0048
        L_0x000e:
            r0 = 0
        L_0x000f:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            r1.<init>()     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
        L_0x0018:
            boolean r2 = r6.hasNext()     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r6.next()     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            com.google.android.play.core.splitcompat.c r3 = r4.f9605a     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            java.io.File r2 = r3.b((java.lang.String) r2)     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            r1.add(r2)     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            goto L_0x0018
        L_0x002e:
            b(r5, r1)     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            if (r0 == 0) goto L_0x0036
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000c }
        L_0x0036:
            r5 = 1
        L_0x0037:
            monitor-exit(r4)
            return r5
        L_0x0039:
            r5 = move-exception
            if (r0 != 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000c }
        L_0x0040:
            throw r5     // Catch:{ all -> 0x000c }
        L_0x0041:
            if (r0 == 0) goto L_0x004a
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000c }
            goto L_0x004a
        L_0x0048:
            monitor-exit(r4)
            throw r5
        L_0x004a:
            r5 = 0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.a.a(android.content.Context, java.util.Set):boolean");
    }
}
