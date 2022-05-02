package com.google.android.play.core.internal;

import java.io.File;
import java.util.Set;

final class bn implements au {
    bn() {
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        bk.b(classLoader, set);
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return ba.a(classLoader, file, file2, z, bf.a(), "path", new bm());
    }
}
