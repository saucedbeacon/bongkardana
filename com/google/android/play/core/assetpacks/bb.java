package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.ci;
import id.dana.contract.payasset.SceneType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

final class bb {

    /* renamed from: a  reason: collision with root package name */
    private static final af f10856a = new af("AssetPackStorage");
    private static final long b = TimeUnit.DAYS.toMillis(14);
    private static final long c = TimeUnit.DAYS.toMillis(28);
    private final Context d;
    private final dl e;

    bb(Context context, dl dlVar) {
        this.d = context;
        this.e = dlVar;
    }

    private final File a(String str, int i) {
        return new File(g(str), String.valueOf(i));
    }

    private static List<String> a(PackageInfo packageInfo, String str) {
        ArrayList arrayList = new ArrayList();
        if (packageInfo.splitNames == null) {
            return arrayList;
        }
        int i = (-Arrays.binarySearch(packageInfo.splitNames, str)) - 1;
        while (i < packageInfo.splitNames.length && packageInfo.splitNames[i].startsWith(str)) {
            arrayList.add(packageInfo.applicationInfo.splitSourceDirs[i]);
            i++;
        }
        return arrayList;
    }

    private static void a(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long b2 = b(file);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(b2)) && !file2.getName().equals("stale.tmp")) {
                    c(file2);
                }
            }
        }
    }

    private static long b(File file) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e2) {
            f10856a.a((Throwable) e2, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    private static boolean c(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File c2 : listFiles) {
                z &= c(c2);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    private final File g(String str) {
        return new File(i(), str);
    }

    private final File g(String str, int i, long j) {
        return new File(c(str, i, j), "merge.tmp");
    }

    private final List<File> g() {
        ArrayList arrayList = new ArrayList();
        try {
            if (i().exists()) {
                if (i().listFiles() != null) {
                    for (File file : i().listFiles()) {
                        if (!file.getCanonicalPath().equals(h().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e2) {
            f10856a.b("Could not process directory while scanning installed packs. %s", e2);
        }
    }

    private final File h() {
        return new File(i(), "_tmp");
    }

    private final File h(String str, int i, long j) {
        return new File(new File(new File(h(), str), String.valueOf(i)), String.valueOf(j));
    }

    private final File i() {
        return new File(this.d.getFilesDir(), "assetpacks");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.AssetLocation a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r9.d     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.Context r3 = r9.d     // Catch:{ NameNotFoundException -> 0x0013 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x0013 }
            goto L_0x001d
        L_0x0013:
            com.google.android.play.core.internal.af r2 = f10856a
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Could not find PackageInfo."
            r2.b(r4, r3)
            r2 = r0
        L_0x001d:
            r3 = 1
            if (r2 != 0) goto L_0x0022
            r4 = r0
            goto L_0x0087
        L_0x0022:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r5 >= r6) goto L_0x0035
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            java.lang.String r2 = r2.sourceDir
            r4.add(r2)
            goto L_0x0087
        L_0x0035:
            java.lang.String[] r5 = r2.splitNames
            if (r5 == 0) goto L_0x005b
            android.content.pm.ApplicationInfo r5 = r2.applicationInfo
            java.lang.String[] r5 = r5.splitSourceDirs
            if (r5 != 0) goto L_0x0040
            goto L_0x005b
        L_0x0040:
            java.lang.String[] r5 = r2.splitNames
            int r5 = java.util.Arrays.binarySearch(r5, r10)
            if (r5 >= 0) goto L_0x0054
            com.google.android.play.core.internal.af r5 = f10856a
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r1] = r10
            java.lang.String r7 = "Asset Pack '%s' is not installed."
            r5.a(r7, r6)
            goto L_0x0066
        L_0x0054:
            android.content.pm.ApplicationInfo r6 = r2.applicationInfo
            java.lang.String[] r6 = r6.splitSourceDirs
            r5 = r6[r5]
            goto L_0x0067
        L_0x005b:
            com.google.android.play.core.internal.af r5 = f10856a
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r1] = r10
            java.lang.String r7 = "No splits present for package %s."
            r5.a(r7, r6)
        L_0x0066:
            r5 = r0
        L_0x0067:
            if (r5 != 0) goto L_0x0073
            android.content.pm.ApplicationInfo r5 = r2.applicationInfo
            java.lang.String r5 = r5.sourceDir
            r4.add(r5)
            java.lang.String r5 = "config."
            goto L_0x0080
        L_0x0073:
            r4.add(r5)
            java.lang.String r5 = java.lang.String.valueOf(r10)
            java.lang.String r6 = ".config."
            java.lang.String r5 = r5.concat(r6)
        L_0x0080:
            java.util.List r2 = a((android.content.pm.PackageInfo) r2, (java.lang.String) r5)
            r4.addAll(r2)
        L_0x0087:
            if (r4 != 0) goto L_0x008a
            goto L_0x00cc
        L_0x008a:
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "assets"
            r2.<init>(r5, r11)
            java.lang.String r2 = r2.getPath()
            int r5 = r4.size()
            r6 = 0
        L_0x009a:
            r7 = 2
            if (r6 >= r5) goto L_0x00bc
            java.lang.Object r8 = r4.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            com.google.android.play.core.assetpacks.AssetLocation r7 = com.google.android.play.core.assetpacks.db.a((java.lang.String) r8, (java.lang.String) r2)     // Catch:{ IOException -> 0x00ad }
            int r6 = r6 + 1
            if (r7 == 0) goto L_0x009a
            r0 = r7
            goto L_0x00cc
        L_0x00ad:
            r10 = move-exception
            com.google.android.play.core.internal.af r2 = f10856a
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r1] = r8
            r4[r3] = r11
            java.lang.String r11 = "Failed to parse APK file '%s' looking for asset '%s'."
            r2.a((java.lang.Throwable) r10, (java.lang.String) r11, (java.lang.Object[]) r4)
            goto L_0x00cc
        L_0x00bc:
            com.google.android.play.core.internal.af r2 = f10856a
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r11
            r5[r3] = r10
            r5[r7] = r4
            java.lang.String r10 = "The asset %s is not present in Asset Pack %s. Searched in APKs: %s"
            r2.a(r10, r5)
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.bb.a(java.lang.String, java.lang.String):com.google.android.play.core.assetpacks.AssetLocation");
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final AssetLocation a(String str, String str2, AssetPackLocation assetPackLocation) {
        File file = new File(assetPackLocation.assetsPath(), str2);
        if (file.exists()) {
            return AssetLocation.a(file.getPath(), 0, file.length());
        }
        f10856a.a("The asset %s is not present in Asset Pack %s. Searched in folder: %s", str2, str, assetPackLocation.assetsPath());
        return null;
    }

    /* access modifiers changed from: package-private */
    public final File a(String str, int i, long j) {
        return new File(a(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final File a(String str, int i, long j, String str2) {
        return new File(new File(new File(h(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, AssetPackLocation> a() {
        HashMap hashMap = new HashMap();
        try {
            for (File next : g()) {
                AssetPackLocation b2 = b(next.getName());
                if (b2 != null) {
                    hashMap.put(next.getName(), b2);
                }
            }
        } catch (IOException e2) {
            f10856a.b("Could not process directory while scanning installed packs: %s", e2);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i, long j, int i2) throws IOException {
        File g = g(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        g.getParentFile().mkdirs();
        g.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(g);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    public final void a(List<String> list) {
        int a2 = this.e.a();
        List<File> g = g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            File file = g.get(i);
            if (!list.contains(file.getName()) && b(file) != ((long) a2)) {
                c(file);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        try {
            return c(str) != null;
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final AssetPackLocation b(String str) throws IOException {
        String c2 = c(str);
        if (c2 == null) {
            return null;
        }
        File file = new File(c2, SceneType.ASSETS);
        if (file.isDirectory()) {
            return AssetPackLocation.a(c2, file.getCanonicalPath());
        }
        f10856a.b("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final File b(String str, int i, long j) {
        return new File(a(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    public final File b(String str, int i, long j, String str2) {
        return new File(new File(new File(h(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Long> b() {
        HashMap hashMap = new HashMap();
        for (String next : a().keySet()) {
            hashMap.put(next, Long.valueOf(f(next)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final File c(String str, int i, long j) {
        return new File(h(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    public final File c(String str, int i, long j, String str2) {
        return new File(f(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final String c(String str) throws IOException {
        int length;
        File file = new File(i(), str);
        if (!file.exists()) {
            f10856a.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.e.a()));
        if (!file2.exists()) {
            f10856a.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.e.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f10856a.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.e.a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f10856a.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.e.a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        List<File> g = g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            File file = g.get(i);
            if (file.listFiles() != null) {
                a(file);
                long b2 = b(file);
                if (((long) this.e.a()) != b2) {
                    try {
                        new File(new File(file, String.valueOf(b2)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f10856a.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File a2 : file.listFiles()) {
                    a(a2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int d(String str, int i, long j) throws IOException {
        File g = g(str, i, j);
        if (!g.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(g);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e2) {
                    throw new bv("Merge checkpoint file corrupt.", (Exception) e2);
                }
            } else {
                throw new bv("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            ci.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final File d(String str, int i, long j, String str2) {
        return new File(f(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        List<File> g = g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            File file = g.get(i);
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    File file3 = new File(file2, "stale.tmp");
                    if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > c) {
                        c(file2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d(String str) {
        if (!g(str).exists()) {
            return true;
        }
        return c(g(str));
    }

    /* access modifiers changed from: package-private */
    public final int e(String str) {
        return (int) b(g(str));
    }

    /* access modifiers changed from: package-private */
    public final File e(String str, int i, long j) {
        return new File(new File(h(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    public final File e(String str, int i, long j, String str2) {
        return new File(f(str, i, j, str2), "slice.zip");
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (h().exists()) {
            for (File file : h().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > b) {
                    c(file);
                } else {
                    a(file);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final long f(String str) {
        return b(a(str, e(str)));
    }

    /* access modifiers changed from: package-private */
    public final File f(String str, int i, long j, String str2) {
        return new File(e(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        c(i());
    }

    /* access modifiers changed from: package-private */
    public final void f(String str, int i, long j) {
        if (h(str, i, j).exists()) {
            c(h(str, i, j));
        }
    }
}
