package com.google.android.play.core.internal;

import java.io.File;

final class ax implements ay {
    ax() {
    }

    public final boolean a(Object obj, File file, File file2) {
        return new File((String) bq.a((Class) obj.getClass(), String.class, File.class, file, File.class, file2)).exists();
    }
}
