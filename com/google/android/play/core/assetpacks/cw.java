package com.google.android.play.core.assetpacks;

final /* synthetic */ class cw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cz f10901a;
    private final int b;
    private final String c;

    cw(cz czVar, int i, String str) {
        this.f10901a = czVar;
        this.b = i;
        this.c = str;
    }

    public final void run() {
        this.f10901a.b(this.b, this.c);
    }
}
