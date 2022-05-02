package com.google.android.play.core.splitcompat;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9612a = 0;
    private static final Pattern b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    private final c c;

    k(c cVar) throws IOException {
        this.c = cVar;
    }

    static /* synthetic */ Set a(k kVar, Set set, q qVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        kVar.a(qVar, set, new g(hashSet, qVar, zipFile));
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7 A[SYNTHETIC, Splitter:B:30:0x00a7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.android.play.core.splitcompat.q r8, com.google.android.play.core.splitcompat.h r9) throws java.io.IOException {
        /*
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00a3 }
            java.io.File r1 = r8.a()     // Catch:{ IOException -> 0x00a3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00a3 }
            r8.b()     // Catch:{ IOException -> 0x00a1 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ IOException -> 0x00a1 }
            r8.<init>()     // Catch:{ IOException -> 0x00a1 }
            java.util.Enumeration r1 = r0.entries()     // Catch:{ IOException -> 0x00a1 }
        L_0x0015:
            boolean r2 = r1.hasMoreElements()     // Catch:{ IOException -> 0x00a1 }
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r1.nextElement()     // Catch:{ IOException -> 0x00a1 }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ IOException -> 0x00a1 }
            java.lang.String r3 = r2.getName()     // Catch:{ IOException -> 0x00a1 }
            java.util.regex.Pattern r4 = b     // Catch:{ IOException -> 0x00a1 }
            java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch:{ IOException -> 0x00a1 }
            boolean r4 = r3.matches()     // Catch:{ IOException -> 0x00a1 }
            if (r4 == 0) goto L_0x0015
            r4 = 1
            java.lang.String r4 = r3.group(r4)     // Catch:{ IOException -> 0x00a1 }
            r5 = 2
            java.lang.String r3 = r3.group(r5)     // Catch:{ IOException -> 0x00a1 }
            java.lang.Object r5 = r8.get(r4)     // Catch:{ IOException -> 0x00a1 }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ IOException -> 0x00a1 }
            if (r5 != 0) goto L_0x004b
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ IOException -> 0x00a1 }
            r5.<init>()     // Catch:{ IOException -> 0x00a1 }
            r8.put(r4, r5)     // Catch:{ IOException -> 0x00a1 }
        L_0x004b:
            com.google.android.play.core.splitcompat.j r4 = new com.google.android.play.core.splitcompat.j     // Catch:{ IOException -> 0x00a1 }
            r4.<init>(r2, r3)     // Catch:{ IOException -> 0x00a1 }
            r5.add(r4)     // Catch:{ IOException -> 0x00a1 }
            goto L_0x0015
        L_0x0054:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x00a1 }
            r1.<init>()     // Catch:{ IOException -> 0x00a1 }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x00a1 }
            int r3 = r2.length     // Catch:{ IOException -> 0x00a1 }
            r4 = 0
        L_0x005d:
            if (r4 >= r3) goto L_0x0091
            r5 = r2[r4]     // Catch:{ IOException -> 0x00a1 }
            boolean r6 = r8.containsKey(r5)     // Catch:{ IOException -> 0x00a1 }
            if (r6 == 0) goto L_0x008e
            java.lang.Object r5 = r8.get(r5)     // Catch:{ IOException -> 0x00a1 }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ IOException -> 0x00a1 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x00a1 }
        L_0x0071:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x00a1 }
            if (r6 == 0) goto L_0x008e
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x00a1 }
            com.google.android.play.core.splitcompat.j r6 = (com.google.android.play.core.splitcompat.j) r6     // Catch:{ IOException -> 0x00a1 }
            java.lang.String r7 = r6.f9611a     // Catch:{ IOException -> 0x00a1 }
            boolean r7 = r1.containsKey(r7)     // Catch:{ IOException -> 0x00a1 }
            if (r7 == 0) goto L_0x0088
        L_0x0085:
            java.lang.String r6 = r6.f9611a     // Catch:{ IOException -> 0x00a1 }
            goto L_0x0071
        L_0x0088:
            java.lang.String r7 = r6.f9611a     // Catch:{ IOException -> 0x00a1 }
            r1.put(r7, r6)     // Catch:{ IOException -> 0x00a1 }
            goto L_0x0085
        L_0x008e:
            int r4 = r4 + 1
            goto L_0x005d
        L_0x0091:
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ IOException -> 0x00a1 }
            java.util.Collection r1 = r1.values()     // Catch:{ IOException -> 0x00a1 }
            r8.<init>(r1)     // Catch:{ IOException -> 0x00a1 }
            r9.a(r0, r8)     // Catch:{ IOException -> 0x00a1 }
            r0.close()     // Catch:{ IOException -> 0x00a1 }
            return
        L_0x00a1:
            r8 = move-exception
            goto L_0x00a5
        L_0x00a3:
            r8 = move-exception
            r0 = 0
        L_0x00a5:
            if (r0 == 0) goto L_0x00af
            r0.close()     // Catch:{ IOException -> 0x00ab }
            goto L_0x00af
        L_0x00ab:
            r9 = move-exception
            com.google.android.play.core.internal.ci.a(r8, r9)
        L_0x00af:
            goto L_0x00b1
        L_0x00b0:
            throw r8
        L_0x00b1:
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.k.a(com.google.android.play.core.splitcompat.q, com.google.android.play.core.splitcompat.h):void");
    }

    /* access modifiers changed from: private */
    public final void a(q qVar, Set<j> set, i iVar) throws IOException {
        for (j next : set) {
            File a2 = this.c.a(qVar.b(), next.f9611a);
            boolean z = false;
            if (a2.exists() && a2.length() == next.b.getSize()) {
                z = true;
            }
            iVar.a(next, a2, z);
        }
    }

    /* access modifiers changed from: package-private */
    public final Set<File> a() throws IOException {
        Set<q> d = this.c.d();
        for (String next : this.c.e()) {
            Iterator<q> it = d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().b().equals(next)) {
                        break;
                    }
                } else {
                    this.c.d(next);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (q next2 : d) {
            HashSet hashSet2 = new HashSet();
            a(next2, new f(this, hashSet2, next2));
            for (File next3 : this.c.e(next2.b())) {
                if (!hashSet2.contains(next3)) {
                    next3.getAbsolutePath();
                    next2.b();
                    next2.a().getAbsolutePath();
                    this.c.b(next3);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Set<File> a(q qVar) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        a(qVar, new e(this, qVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }
}
