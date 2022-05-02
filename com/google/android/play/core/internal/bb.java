package com.google.android.play.core.internal;

import java.io.File;
import java.util.Set;

final class bb implements au {
    bb() {
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        ba.b(classLoader, set);
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return ba.a(classLoader, file, file2, z, ba.a(), "zip", ba.b());
    }
}
