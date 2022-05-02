package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class ao implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ap f9578a;

    /* synthetic */ ao(ap apVar) {
        this.f9578a = apVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9578a.c.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f9578a.b((ag) new am(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f9578a.c.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f9578a.b((ag) new an(this));
    }
}
