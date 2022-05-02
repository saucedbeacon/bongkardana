package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.List;

final /* synthetic */ class b implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f10991a;
    private final int b;
    private final int c;
    private final Long d;
    private final Long e;
    private final List f;
    private final List g;

    b(Integer num, int i, int i2, Long l, Long l2, List list, List list2) {
        this.f10991a = num;
        this.b = i;
        this.c = i2;
        this.d = l;
        this.e = l2;
        this.f = list;
        this.g = list2;
    }

    public final SplitInstallSessionState a(SplitInstallSessionState splitInstallSessionState) {
        return FakeSplitInstallManager.a(this.f10991a, this.b, this.c, this.d, this.e, this.f, this.g, splitInstallSessionState);
    }
}
