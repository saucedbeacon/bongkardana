package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

final /* synthetic */ class TopicsSubscriber$$Lambda$0 implements Callable {
    private final Context arg$1;
    private final ScheduledExecutorService arg$2;
    private final FirebaseMessaging arg$3;
    private final FirebaseInstallationsApi arg$4;
    private final Metadata arg$5;
    private final GmsRpc arg$6;

    TopicsSubscriber$$Lambda$0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, Metadata metadata, GmsRpc gmsRpc) {
        this.arg$1 = context;
        this.arg$2 = scheduledExecutorService;
        this.arg$3 = firebaseMessaging;
        this.arg$4 = firebaseInstallationsApi;
        this.arg$5 = metadata;
        this.arg$6 = gmsRpc;
    }

    public final Object call() {
        return TopicsSubscriber.lambda$createInstance$0$TopicsSubscriber(this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5, this.arg$6);
    }
}
