package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitcompat.c;
import com.google.android.play.core.splitcompat.p;
import com.google.android.play.core.splitinstall.d;
import com.google.android.play.core.splitinstall.f;
import java.util.List;
import java.util.concurrent.Executor;

public final class as implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9581a;
    private final c b;
    /* access modifiers changed from: private */
    public final at c;
    private final Executor d;
    private final p e;

    public as(Context context, Executor executor, at atVar, c cVar, p pVar) {
        this.f9581a = context;
        this.b = cVar;
        this.c = atVar;
        this.d = executor;
        this.e = pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b1, code lost:
        if (r13.c.a() == false) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd A[Catch:{ all -> 0x0019, all -> 0x00c6, Exception -> 0x00d1 }] */
    @com.google.android.play.core.splitinstall.model.SplitInstallErrorCode
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Integer a(java.util.List<android.content.Intent> r14) {
        /*
            r13 = this;
            r0 = -13
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00d1 }
            com.google.android.play.core.splitcompat.c r2 = r13.b     // Catch:{ Exception -> 0x00d1 }
            java.io.File r2 = r2.b()     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r3 = "rw"
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x00d1 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ Exception -> 0x00d1 }
            r2 = 0
            java.nio.channels.FileLock r3 = r1.tryLock()     // Catch:{ OverlappingFileLockException -> 0x001c }
            goto L_0x001d
        L_0x0019:
            r14 = move-exception
            goto L_0x00c0
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 == 0) goto L_0x00cb
            r2 = 0
            r4 = -11
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x00b6 }
        L_0x0026:
            boolean r5 = r14.hasNext()     // Catch:{ Exception -> 0x00b6 }
            if (r5 == 0) goto L_0x00ab
            java.lang.Object r5 = r14.next()     // Catch:{ Exception -> 0x00b6 }
            android.content.Intent r5 = (android.content.Intent) r5     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r6 = "split_id"
            java.lang.String r6 = r5.getStringExtra(r6)     // Catch:{ Exception -> 0x00b6 }
            android.content.Context r7 = r13.f9581a     // Catch:{ Exception -> 0x00b6 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x00b6 }
            android.net.Uri r5 = r5.getData()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r8 = "r"
            android.content.res.AssetFileDescriptor r5 = r7.openAssetFileDescriptor(r5, r8)     // Catch:{ Exception -> 0x00b6 }
            com.google.android.play.core.splitcompat.c r7 = r13.b     // Catch:{ Exception -> 0x00b6 }
            java.io.File r7 = r7.a((java.lang.String) r6)     // Catch:{ Exception -> 0x00b6 }
            boolean r8 = r7.exists()     // Catch:{ Exception -> 0x00b6 }
            if (r8 == 0) goto L_0x0062
            long r8 = r7.length()     // Catch:{ Exception -> 0x00b6 }
            long r10 = r5.getLength()     // Catch:{ Exception -> 0x00b6 }
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            boolean r8 = r7.exists()     // Catch:{ Exception -> 0x00b6 }
            if (r8 != 0) goto L_0x0026
        L_0x0068:
            com.google.android.play.core.splitcompat.c r8 = r13.b     // Catch:{ Exception -> 0x00b6 }
            java.io.File r6 = r8.b((java.lang.String) r6)     // Catch:{ Exception -> 0x00b6 }
            boolean r6 = r6.exists()     // Catch:{ Exception -> 0x00b6 }
            if (r6 != 0) goto L_0x0026
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00b6 }
            java.io.FileInputStream r5 = r5.createInputStream()     // Catch:{ Exception -> 0x00b6 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00b6 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a1 }
            r5.<init>(r7)     // Catch:{ all -> 0x00a1 }
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0097 }
        L_0x0086:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x0097 }
            if (r8 <= 0) goto L_0x0090
            r5.write(r7, r2, r8)     // Catch:{ all -> 0x0097 }
            goto L_0x0086
        L_0x0090:
            r5.close()     // Catch:{ all -> 0x00a1 }
            r6.close()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0026
        L_0x0097:
            r14 = move-exception
            r5.close()     // Catch:{ all -> 0x009c }
            goto L_0x00a0
        L_0x009c:
            r2 = move-exception
            com.google.android.play.core.internal.ci.a(r14, r2)     // Catch:{ all -> 0x00a1 }
        L_0x00a0:
            throw r14     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r14 = move-exception
            r6.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r2 = move-exception
            com.google.android.play.core.internal.ci.a(r14, r2)     // Catch:{ Exception -> 0x00b6 }
        L_0x00aa:
            throw r14     // Catch:{ Exception -> 0x00b6 }
        L_0x00ab:
            com.google.android.play.core.internal.at r14 = r13.c     // Catch:{ Exception -> 0x00b3 }
            boolean r14 = r14.a()     // Catch:{ Exception -> 0x00b3 }
            if (r14 != 0) goto L_0x00b8
        L_0x00b3:
            r2 = -11
            goto L_0x00b8
        L_0x00b6:
            r2 = -13
        L_0x00b8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0019 }
            r3.release()     // Catch:{ all -> 0x0019 }
            goto L_0x00cb
        L_0x00c0:
            if (r1 == 0) goto L_0x00ca
            r1.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r1 = move-exception
            com.google.android.play.core.internal.ci.a(r14, r1)     // Catch:{ Exception -> 0x00d1 }
        L_0x00ca:
            throw r14     // Catch:{ Exception -> 0x00d1 }
        L_0x00cb:
            if (r1 == 0) goto L_0x00d0
            r1.close()     // Catch:{ Exception -> 0x00d1 }
        L_0x00d0:
            return r2
        L_0x00d1:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.as.a(java.util.List):java.lang.Integer");
    }

    static /* synthetic */ void a(as asVar, d dVar) {
        try {
            if (!SplitCompat.a(p.a(asVar.f9581a))) {
                dVar.a(-12);
            } else {
                dVar.a();
            }
        } catch (Exception unused) {
            dVar.a(-12);
        }
    }

    static /* synthetic */ void a(as asVar, List list, d dVar) {
        Integer a2 = asVar.a((List<Intent>) list);
        if (a2 != null) {
            if (a2.intValue() == 0) {
                dVar.b();
            } else {
                dVar.a(a2.intValue());
            }
        }
    }

    public final void a(List<Intent> list, d dVar) {
        if (SplitCompat.a()) {
            this.d.execute(new ar(this, list, dVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
