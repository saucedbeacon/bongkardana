package com.google.android.play.core.internal;

import android.os.IBinder;

final /* synthetic */ class ah implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    private final ap f9573a;

    ah(ap apVar) {
        this.f9573a = apVar;
    }

    public final void binderDied() {
        this.f9573a.c();
    }
}
