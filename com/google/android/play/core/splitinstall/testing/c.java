package com.google.android.play.core.splitinstall.testing;

import java.util.List;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FakeSplitInstallManager f10992a;
    private final List b;
    private final List c;

    c(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2) {
        this.f10992a = fakeSplitInstallManager;
        this.b = list;
        this.c = list2;
    }

    public final void run() {
        this.f10992a.a(this.b, this.c);
    }
}
