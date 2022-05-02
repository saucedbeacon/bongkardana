package com.google.android.play.core.assetpacks;

final /* synthetic */ class di implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bb f10914a;

    private di(bb bbVar) {
        this.f10914a = bbVar;
    }

    static Runnable a(bb bbVar) {
        return new di(bbVar);
    }

    public final void run() {
        this.f10914a.c();
    }
}
