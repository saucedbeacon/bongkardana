package com.google.android.play.core.assetpacks;

import android.os.Bundle;

final /* synthetic */ class au implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final aw f10850a;
    private final Bundle b;
    private final AssetPackState c;

    au(aw awVar, Bundle bundle, AssetPackState assetPackState) {
        this.f10850a = awVar;
        this.b = bundle;
        this.c = assetPackState;
    }

    public final void run() {
        this.f10850a.a(this.b, this.c);
    }
}
