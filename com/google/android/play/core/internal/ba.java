package com.google.android.play.core.internal;

import com.google.android.play.core.splitinstall.k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class ba implements au {
    ba() {
    }

    static az a() {
        return new aw();
    }

    static Object a(ClassLoader classLoader) {
        return bq.a((Object) classLoader, "pathList", Object.class).a();
    }

    static boolean a(ClassLoader classLoader, File file, File file2, boolean z, az azVar, String str, ay ayVar) {
        ArrayList arrayList = new ArrayList();
        Object a2 = a(classLoader);
        bp b = bq.b(a2, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) b.a());
        ArrayList arrayList2 = new ArrayList();
        for (Object a3 : asList) {
            arrayList2.add(bq.a(a3, str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || ayVar.a(a2, file2, file)) {
            b.a((Collection) Arrays.asList(azVar.a(a2, new ArrayList(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            bo boVar = new bo("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ci.a(boVar, (IOException) arrayList.get(i));
            }
            bq.b(a2, "dexElementsSuppressedExceptions", IOException.class).a((Collection) arrayList);
            throw boVar;
        }
        int length = String.valueOf(file2.getPath()).length();
        return false;
    }

    static ay b() {
        return new ax();
    }

    static void b(ClassLoader classLoader, Set<File> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File next : set) {
                int length = String.valueOf(next.getParentFile().getAbsolutePath()).length();
                hashSet.add(next.getParentFile());
            }
            bp b = bq.b(a(classLoader), "nativeLibraryDirectories", File.class);
            hashSet.removeAll(Arrays.asList((File[]) b.a()));
            synchronized (k.class) {
                hashSet.size();
                b.b(hashSet);
            }
        }
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        b(classLoader, set);
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return a(classLoader, file, file2, z, a(), "zip", b());
    }
}
