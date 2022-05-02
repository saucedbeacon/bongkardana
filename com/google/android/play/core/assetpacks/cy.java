package com.google.android.play.core.assetpacks;

import android.content.Intent;

final /* synthetic */ class cy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cz f10903a;
    private final Intent b;

    cy(cz czVar, Intent intent) {
        this.f10903a = czVar;
        this.b = intent;
    }

    public final void run() {
        this.f10903a.a(this.b);
    }
}
