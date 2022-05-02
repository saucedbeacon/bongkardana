package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.play.core.internal.as;
import com.google.android.play.core.internal.at;
import com.google.android.play.core.internal.av;
import com.google.android.play.core.internal.bo;
import com.google.android.play.core.splitinstall.l;
import com.google.android.play.core.splitinstall.o;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class SplitCompat {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<SplitCompat> f9604a = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */
    public final c b;
    private final Set<String> c = new HashSet();
    private final a d;

    private SplitCompat(Context context) {
        try {
            c cVar = new c(context);
            this.b = cVar;
            this.d = new a(cVar);
        } catch (PackageManager.NameNotFoundException e) {
            throw new bo((Throwable) e);
        }
    }

    public static boolean a() {
        return f9604a.get() != null;
    }

    public static boolean a(Context context) {
        return a(context, true);
    }

    private static boolean a(Context context, boolean z) {
        if (b()) {
            return false;
        }
        boolean compareAndSet = f9604a.compareAndSet((Object) null, new SplitCompat(context));
        SplitCompat splitCompat = f9604a.get();
        if (compareAndSet) {
            l.f9621a.a(new as(context, p.a(), new at(context, splitCompat.b, new av(), (byte[]) null), splitCompat.b, new p()));
            o.a(new l(splitCompat));
            p.a().execute(new m(context));
        }
        try {
            splitCompat.b(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x017f A[SYNTHETIC, Splitter:B:79:0x017f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void b(android.content.Context r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r10 == 0) goto L_0x0009
            com.google.android.play.core.splitcompat.c r0 = r8.b     // Catch:{ all -> 0x01d9 }
            r0.a()     // Catch:{ all -> 0x01d9 }
            goto L_0x0015
        L_0x0009:
            java.util.concurrent.Executor r0 = com.google.android.play.core.splitcompat.p.a()     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.splitcompat.n r1 = new com.google.android.play.core.splitcompat.n     // Catch:{ all -> 0x01d9 }
            r1.<init>(r8)     // Catch:{ all -> 0x01d9 }
            r0.execute(r1)     // Catch:{ all -> 0x01d9 }
        L_0x0015:
            java.lang.String r0 = r9.getPackageName()     // Catch:{ all -> 0x01d9 }
            r1 = 0
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01c7 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x01c7 }
            java.lang.String[] r3 = r2.splitNames     // Catch:{ NameNotFoundException -> 0x01c7 }
            if (r3 != 0) goto L_0x002c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x01c7 }
            r2.<init>()     // Catch:{ NameNotFoundException -> 0x01c7 }
            goto L_0x0032
        L_0x002c:
            java.lang.String[] r2 = r2.splitNames     // Catch:{ NameNotFoundException -> 0x01c7 }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ NameNotFoundException -> 0x01c7 }
        L_0x0032:
            com.google.android.play.core.splitcompat.c r0 = r8.b     // Catch:{ all -> 0x01d9 }
            java.util.Set r0 = r0.d()     // Catch:{ all -> 0x01d9 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x01d9 }
            r3.<init>()     // Catch:{ all -> 0x01d9 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x01d9 }
        L_0x0041:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01d9 }
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.q) r5     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = r5.b()     // Catch:{ all -> 0x01d9 }
            boolean r6 = r2.contains(r5)     // Catch:{ all -> 0x01d9 }
            if (r6 == 0) goto L_0x0041
            if (r10 == 0) goto L_0x005f
            com.google.android.play.core.splitcompat.c r6 = r8.b     // Catch:{ all -> 0x01d9 }
            r6.f(r5)     // Catch:{ all -> 0x01d9 }
            goto L_0x0062
        L_0x005f:
            r3.add(r5)     // Catch:{ all -> 0x01d9 }
        L_0x0062:
            r4.remove()     // Catch:{ all -> 0x01d9 }
            goto L_0x0041
        L_0x0066:
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x01d9 }
            if (r4 != 0) goto L_0x0078
            java.util.concurrent.Executor r4 = com.google.android.play.core.splitcompat.p.a()     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.splitcompat.o r5 = new com.google.android.play.core.splitcompat.o     // Catch:{ all -> 0x01d9 }
            r5.<init>(r8, r3)     // Catch:{ all -> 0x01d9 }
            r4.execute(r5)     // Catch:{ all -> 0x01d9 }
        L_0x0078:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x01d9 }
            r3.<init>()     // Catch:{ all -> 0x01d9 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x01d9 }
        L_0x0081:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01d9 }
            if (r5 == 0) goto L_0x009b
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.q) r5     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = r5.b()     // Catch:{ all -> 0x01d9 }
            boolean r6 = com.google.android.play.core.splitinstall.p.b(r5)     // Catch:{ all -> 0x01d9 }
            if (r6 != 0) goto L_0x0081
            r3.add(r5)     // Catch:{ all -> 0x01d9 }
            goto L_0x0081
        L_0x009b:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01d9 }
        L_0x009f:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x01d9 }
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x01d9 }
            boolean r5 = com.google.android.play.core.splitinstall.p.b(r4)     // Catch:{ all -> 0x01d9 }
            if (r5 != 0) goto L_0x009f
            r3.add(r4)     // Catch:{ all -> 0x01d9 }
            goto L_0x009f
        L_0x00b5:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x01d9 }
            int r4 = r0.size()     // Catch:{ all -> 0x01d9 }
            r2.<init>(r4)     // Catch:{ all -> 0x01d9 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01d9 }
        L_0x00c2:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x01d9 }
            if (r4 == 0) goto L_0x00f8
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.splitcompat.q r4 = (com.google.android.play.core.splitcompat.q) r4     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = r4.b()     // Catch:{ all -> 0x01d9 }
            boolean r5 = com.google.android.play.core.splitinstall.p.a(r5)     // Catch:{ all -> 0x01d9 }
            if (r5 != 0) goto L_0x00f4
            java.lang.String r5 = r4.b()     // Catch:{ all -> 0x01d9 }
            boolean r6 = com.google.android.play.core.splitinstall.p.a(r5)     // Catch:{ all -> 0x01d9 }
            if (r6 == 0) goto L_0x00e5
            java.lang.String r5 = ""
            goto L_0x00ee
        L_0x00e5:
            java.lang.String r6 = "\\.config\\."
            r7 = 2
            java.lang.String[] r5 = r5.split(r6, r7)     // Catch:{ all -> 0x01d9 }
            r5 = r5[r1]     // Catch:{ all -> 0x01d9 }
        L_0x00ee:
            boolean r5 = r3.contains(r5)     // Catch:{ all -> 0x01d9 }
            if (r5 == 0) goto L_0x00c2
        L_0x00f4:
            r2.add(r4)     // Catch:{ all -> 0x01d9 }
            goto L_0x00c2
        L_0x00f8:
            com.google.android.play.core.splitcompat.k r0 = new com.google.android.play.core.splitcompat.k     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.splitcompat.c r1 = r8.b     // Catch:{ all -> 0x01d9 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.internal.au r1 = com.google.android.play.core.internal.av.a()     // Catch:{ all -> 0x01d9 }
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch:{ all -> 0x01d9 }
            if (r10 == 0) goto L_0x0111
            java.util.Set r0 = r0.a()     // Catch:{ all -> 0x01d9 }
            r1.a(r3, r0)     // Catch:{ all -> 0x01d9 }
            goto L_0x012f
        L_0x0111:
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x01d9 }
        L_0x0115:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01d9 }
            if (r5 == 0) goto L_0x012f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.q) r5     // Catch:{ all -> 0x01d9 }
            java.util.Set r5 = r0.a(r5)     // Catch:{ all -> 0x01d9 }
            if (r5 != 0) goto L_0x012b
            r4.remove()     // Catch:{ all -> 0x01d9 }
            goto L_0x0115
        L_0x012b:
            r1.a(r3, r5)     // Catch:{ all -> 0x01d9 }
            goto L_0x0115
        L_0x012f:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x01d9 }
            r0.<init>()     // Catch:{ all -> 0x01d9 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x01d9 }
        L_0x0138:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01d9 }
            if (r5 == 0) goto L_0x0188
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.q) r5     // Catch:{ all -> 0x01d9 }
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x017b }
            java.io.File r7 = r5.a()     // Catch:{ IOException -> 0x017b }
            r6.<init>(r7)     // Catch:{ IOException -> 0x017b }
            java.lang.String r7 = "classes.dex"
            java.util.zip.ZipEntry r7 = r6.getEntry(r7)     // Catch:{ IOException -> 0x0179 }
            r6.close()     // Catch:{ IOException -> 0x0179 }
            if (r7 == 0) goto L_0x0171
            com.google.android.play.core.splitcompat.c r6 = r8.b     // Catch:{ all -> 0x01d9 }
            java.lang.String r7 = r5.b()     // Catch:{ all -> 0x01d9 }
            java.io.File r6 = r6.c((java.lang.String) r7)     // Catch:{ all -> 0x01d9 }
            java.io.File r7 = r5.a()     // Catch:{ all -> 0x01d9 }
            boolean r6 = r1.a(r3, r6, r7, r10)     // Catch:{ all -> 0x01d9 }
            if (r6 == 0) goto L_0x016d
            goto L_0x0171
        L_0x016d:
            r5.a()     // Catch:{ all -> 0x01d9 }
            goto L_0x0138
        L_0x0171:
            java.io.File r5 = r5.a()     // Catch:{ all -> 0x01d9 }
            r0.add(r5)     // Catch:{ all -> 0x01d9 }
            goto L_0x0138
        L_0x0179:
            r9 = move-exception
            goto L_0x017d
        L_0x017b:
            r9 = move-exception
            r6 = 0
        L_0x017d:
            if (r6 == 0) goto L_0x0187
            r6.close()     // Catch:{ IOException -> 0x0183 }
            goto L_0x0187
        L_0x0183:
            r10 = move-exception
            com.google.android.play.core.internal.ci.a(r9, r10)     // Catch:{ all -> 0x01d9 }
        L_0x0187:
            throw r9     // Catch:{ all -> 0x01d9 }
        L_0x0188:
            com.google.android.play.core.splitcompat.a.b(r9, r0)     // Catch:{ all -> 0x01d9 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x01d9 }
            r9.<init>()     // Catch:{ all -> 0x01d9 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x01d9 }
        L_0x0194:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x01d9 }
            if (r1 == 0) goto L_0x01b9
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x01d9 }
            com.google.android.play.core.splitcompat.q r1 = (com.google.android.play.core.splitcompat.q) r1     // Catch:{ all -> 0x01d9 }
            java.io.File r2 = r1.a()     // Catch:{ all -> 0x01d9 }
            boolean r2 = r0.contains(r2)     // Catch:{ all -> 0x01d9 }
            if (r2 == 0) goto L_0x01b5
            r1.b()     // Catch:{ all -> 0x01d9 }
            java.lang.String r1 = r1.b()     // Catch:{ all -> 0x01d9 }
            r9.add(r1)     // Catch:{ all -> 0x01d9 }
            goto L_0x0194
        L_0x01b5:
            r1.b()     // Catch:{ all -> 0x01d9 }
            goto L_0x0194
        L_0x01b9:
            java.util.Set<java.lang.String> r10 = r8.c     // Catch:{ all -> 0x01d9 }
            monitor-enter(r10)     // Catch:{ all -> 0x01d9 }
            java.util.Set<java.lang.String> r0 = r8.c     // Catch:{ all -> 0x01c4 }
            r0.addAll(r9)     // Catch:{ all -> 0x01c4 }
            monitor-exit(r10)     // Catch:{ all -> 0x01c4 }
            monitor-exit(r8)
            return
        L_0x01c4:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01d9 }
            throw r9     // Catch:{ all -> 0x01d9 }
        L_0x01c7:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x01d9 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01d9 }
            r2[r1] = r0     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "Cannot load data for application '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x01d9 }
            r10.<init>(r0, r9)     // Catch:{ all -> 0x01d9 }
            throw r10     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x01dd
        L_0x01dc:
            throw r9
        L_0x01dd:
            goto L_0x01dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.SplitCompat.b(android.content.Context, boolean):void");
    }

    private static boolean b() {
        return Build.VERSION.SDK_INT < 21;
    }

    /* access modifiers changed from: private */
    public final Set<String> c() {
        HashSet hashSet;
        synchronized (this.c) {
            hashSet = new HashSet(this.c);
        }
        return hashSet;
    }

    public static boolean install(@NonNull Context context) {
        return a(context, false);
    }

    public static boolean installActivity(@NonNull Context context) {
        if (b()) {
            return false;
        }
        SplitCompat splitCompat = f9604a.get();
        if (splitCompat != null) {
            return splitCompat.d.a(context, splitCompat.c());
        }
        throw new IllegalStateException("SplitCompat.installActivity can only be called if SplitCompat.install is first called at startup on application context.");
    }
}
