package com.uc.crashsdk;

import com.uc.crashsdk.a.b;
import com.uc.crashsdk.f;
import java.io.File;
import java.util.Locale;

final class h extends f.C0040f {
    h(String str, f.e eVar) {
        super(str, eVar);
    }

    public final boolean a() {
        return b.a(new File(this.b), String.format(Locale.US, "%d %d %d %d", new Object[]{Long.valueOf(this.c.f9889a), Long.valueOf(this.c.b), Integer.valueOf(this.c.c), Integer.valueOf(this.c.d)}).getBytes());
    }
}
