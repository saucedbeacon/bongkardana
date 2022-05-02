package com.google.android.play.core.splitinstall.testing;

import android.content.Intent;
import com.google.android.play.core.splitinstall.d;
import java.util.List;

final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f10998a;
    final /* synthetic */ List b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ List e;
    final /* synthetic */ FakeSplitInstallManager f;

    i(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, long j, boolean z, List list3) {
        this.f = fakeSplitInstallManager;
        this.f10998a = list;
        this.b = list2;
        this.c = j;
        this.d = z;
        this.e = list3;
    }

    public final void a() {
        this.f.l.addAll(this.f10998a);
        this.f.m.addAll(this.b);
        this.f.a(5, 0, Long.valueOf(this.c), Long.valueOf(this.c), (List<String>) null, (Integer) null, (List<String>) null);
    }

    public final void a(int i) {
        this.f.a(i);
    }

    public final void b() {
        if (!this.d) {
            this.f.a((List<Intent>) this.e, (List<String>) this.f10998a, (List<String>) this.b, this.c, true);
        }
    }
}
