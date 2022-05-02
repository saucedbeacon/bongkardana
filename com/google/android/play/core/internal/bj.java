package com.google.android.play.core.internal;

import java.io.File;

final class bj implements ay {
    bj() {
    }

    public final boolean a(Object obj, File file, File file2) {
        try {
            return !((Boolean) bq.a((Class) Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
