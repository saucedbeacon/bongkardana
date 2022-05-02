package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FakeSplitInstallManager f10995a;
    private final SplitInstallSessionState b;

    f(FakeSplitInstallManager fakeSplitInstallManager, SplitInstallSessionState splitInstallSessionState) {
        this.f10995a = fakeSplitInstallManager;
        this.b = splitInstallSessionState;
    }

    public final void run() {
        this.f10995a.a(this.b);
    }
}
