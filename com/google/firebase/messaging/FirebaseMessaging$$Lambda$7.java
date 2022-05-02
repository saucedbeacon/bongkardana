package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class FirebaseMessaging$$Lambda$7 implements SuccessContinuation {
    private final String arg$1;

    FirebaseMessaging$$Lambda$7(String str) {
        this.arg$1 = str;
    }

    public final Task then(Object obj) {
        return ((TopicsSubscriber) obj).unsubscribeFromTopic(this.arg$1);
    }
}
