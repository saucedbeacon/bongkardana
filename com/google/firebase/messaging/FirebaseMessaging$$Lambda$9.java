package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.RequestDeduplicator;

final /* synthetic */ class FirebaseMessaging$$Lambda$9 implements RequestDeduplicator.GetTokenRequest {
    private final FirebaseMessaging arg$1;
    private final Task arg$2;

    FirebaseMessaging$$Lambda$9(FirebaseMessaging firebaseMessaging, Task task) {
        this.arg$1 = firebaseMessaging;
        this.arg$2 = task;
    }

    public final Task start() {
        return this.arg$1.lambda$blockingGetToken$8$FirebaseMessaging(this.arg$2);
    }
}
