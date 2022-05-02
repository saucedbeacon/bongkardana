package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

final class i extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.tasks.i f10934a;
    final /* synthetic */ j b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(j jVar, Handler handler, com.google.android.play.core.tasks.i iVar) {
        super(handler);
        this.b = jVar;
        this.f10934a = iVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f10934a.b(-1);
            this.b.h.a((PendingIntent) null);
        } else if (i != 2) {
            this.f10934a.b((Exception) new AssetPackException(-100));
        } else {
            this.f10934a.b(0);
        }
    }
}
