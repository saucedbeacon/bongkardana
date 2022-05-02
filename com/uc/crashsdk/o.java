package com.uc.crashsdk;

import com.uc.crashsdk.b;
import java.io.File;

final class o extends b.a {
    o(String str) {
        super(str);
    }

    public final boolean a() {
        File file = new File(this.f9880a);
        if (!file.exists()) {
            return false;
        }
        file.delete();
        return true;
    }
}
