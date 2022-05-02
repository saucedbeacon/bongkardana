package com.google.android.play.core.splitcompat;

import android.content.Context;
import com.google.android.play.core.splitinstall.t;

final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f9614a;

    m(Context context) {
        this.f9614a = context;
    }

    public final void run() {
        t.a(this.f9614a).a(true);
    }
}
