package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.tasks.i;

final class g extends f<ReviewInfo> {
    g(h hVar, i iVar) {
        super(hVar, new af("OnRequestInstallCallback"), iVar);
    }

    public final void a(Bundle bundle) throws RemoteException {
        super.a(bundle);
        this.b.b(ReviewInfo.a((PendingIntent) bundle.get("confirmation_intent")));
    }
}
