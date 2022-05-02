package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class FirebaseMessaging$$Lambda$10 implements Continuation {
    private final FirebaseMessaging arg$1;

    FirebaseMessaging$$Lambda$10(FirebaseMessaging firebaseMessaging) {
        this.arg$1 = firebaseMessaging;
    }

    public final Object then(Task task) {
        this.arg$1.lambda$deleteToken$4$FirebaseMessaging(task);
        return null;
    }
}
