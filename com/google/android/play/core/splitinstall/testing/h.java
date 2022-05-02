package com.google.android.play.core.splitinstall.testing;

import java.util.List;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FakeSplitInstallManager f10997a;
    private final List b;
    private final List c;
    private final List d;
    private final long e;

    h(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, List list3, long j) {
        this.f10997a = fakeSplitInstallManager;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = j;
    }

    public final void run() {
        this.f10997a.a(this.b, this.c, this.d, this.e);
    }
}
