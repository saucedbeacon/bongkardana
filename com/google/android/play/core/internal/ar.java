package com.google.android.play.core.internal;

import android.content.Intent;
import com.google.android.play.core.splitinstall.d;
import java.util.List;

final class ar implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f9580a;
    final /* synthetic */ d b;
    final /* synthetic */ as c;

    ar(as asVar, List list, d dVar) {
        this.c = asVar;
        this.f9580a = list;
        this.b = dVar;
    }

    public final void run() {
        try {
            if (this.c.c.a((List<Intent>) this.f9580a)) {
                as.a(this.c, this.b);
            } else {
                as.a(this.c, this.f9580a, this.b);
            }
        } catch (Exception unused) {
            this.b.a(-11);
        }
    }
}
