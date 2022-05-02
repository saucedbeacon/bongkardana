package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.i;

final class b extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f9598a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b(Handler handler, i iVar) {
        super(handler);
        this.f9598a = iVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.f9598a.b(null);
    }
}
