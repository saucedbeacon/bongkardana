package com.google.android.play.core.assetpacks;

import android.os.Bundle;

final /* synthetic */ class av implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final aw f10851a;
    private final Bundle b;

    av(aw awVar, Bundle bundle) {
        this.f10851a = awVar;
        this.b = bundle;
    }

    public final void run() {
        this.f10851a.a(this.b);
    }
}
