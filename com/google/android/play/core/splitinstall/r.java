package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

final class r implements d {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SplitInstallSessionState f9624a;
    final /* synthetic */ Intent b;
    final /* synthetic */ Context c;
    final /* synthetic */ t d;

    r(t tVar, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.d = tVar;
        this.f9624a = splitInstallSessionState;
        this.b = intent;
        this.c = context;
    }

    public final void a() {
        this.d.d.post(new s(this.d, this.f9624a, 5, 0));
    }

    public final void a(@SplitInstallErrorCode int i) {
        this.d.d.post(new s(this.d, this.f9624a, 6, i));
    }

    public final void b() {
        if (!this.b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.b.putExtra("triggered_from_app_after_verification", true);
            this.c.sendBroadcast(this.b);
            return;
        }
        this.d.f9596a.b("Splits copied and verified more than once.", new Object[0]);
    }
}
