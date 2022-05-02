package com.google.android.play.core.assetpacks;

final /* synthetic */ class at implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final aw f10849a;
    private final AssetPackState b;

    at(aw awVar, AssetPackState assetPackState) {
        this.f10849a = awVar;
        this.b = assetPackState;
    }

    public final void run() {
        this.f10849a.a(this.b);
    }
}
