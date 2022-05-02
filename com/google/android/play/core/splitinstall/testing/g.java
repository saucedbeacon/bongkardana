package com.google.android.play.core.splitinstall.testing;

import java.util.List;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FakeSplitInstallManager f10996a;
    private final long b;
    private final List c;
    private final List d;
    private final List e;

    g(FakeSplitInstallManager fakeSplitInstallManager, long j, List list, List list2, List list3) {
        this.f10996a = fakeSplitInstallManager;
        this.b = j;
        this.c = list;
        this.d = list2;
        this.e = list3;
    }

    public final void run() {
        this.f10996a.a(this.b, this.c, this.d, this.e);
    }
}
