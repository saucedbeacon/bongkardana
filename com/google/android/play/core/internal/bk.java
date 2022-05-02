package com.google.android.play.core.internal;

import java.io.File;
import java.util.Set;

final class bk implements au {
    bk() {
    }

    static void b(ClassLoader classLoader, Set<File> set) {
        bf.a(classLoader, set, new bi());
    }

    static boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return ba.a(classLoader, file, file2, z, bf.a(), "path", new bj());
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        b(classLoader, set);
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return b(classLoader, file, file2, z);
    }
}
