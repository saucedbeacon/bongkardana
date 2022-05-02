package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

final /* synthetic */ class FcmBroadcastProcessor$$Lambda$1 implements Callable {
    private final Context arg$1;
    private final Intent arg$2;

    FcmBroadcastProcessor$$Lambda$1(Context context, Intent intent) {
        this.arg$1 = context;
        this.arg$2 = intent;
    }

    public final Object call() {
        return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(this.arg$1, this.arg$2));
    }
}
