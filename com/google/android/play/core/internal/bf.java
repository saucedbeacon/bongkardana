package com.google.android.play.core.internal;

import com.google.android.play.core.splitinstall.k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class bf implements au {
    bf() {
    }

    static az a() {
        return new bc();
    }

    public static void a(ClassLoader classLoader, Set<File> set, be beVar) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File parentFile : set) {
                hashSet.add(parentFile.getParentFile());
            }
            Object a2 = ba.a(classLoader);
            bp<List> a3 = bq.a(a2, "nativeLibraryDirectories", List.class);
            synchronized (k.class) {
                ArrayList arrayList = new ArrayList(a3.a());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                a3.a(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] a4 = beVar.a(a2, new ArrayList(hashSet), arrayList2);
            if (!arrayList2.isEmpty()) {
                bo boVar = new bo("Error in makePathElements");
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ci.a(boVar, (IOException) arrayList2.get(i));
                }
                throw boVar;
            }
            synchronized (k.class) {
                bq.b(a2, "nativeLibraryPathElements", Object.class).b(Arrays.asList(a4));
            }
        }
    }

    static be b() {
        return new bd();
    }

    public static boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return ba.a(classLoader, file, file2, z, a(), "zip", ba.b());
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        a(classLoader, set, b());
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return b(classLoader, file, file2, z);
    }
}
