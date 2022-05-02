package com.uc.crashsdk.a;

import com.uc.crashsdk.b;

final class g implements Runnable {
    g() {
    }

    public final void run() {
        synchronized (f.b) {
            String unused = f.f = null;
            boolean unused2 = f.b(!b.t());
            if (h.b(f.f)) {
                k.b(f.f);
            }
        }
    }
}
