package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;

final /* synthetic */ class FirebaseMessaging$$Lambda$5 implements Continuation {
    private final FirebaseMessaging arg$1;
    private final ExecutorService arg$2;

    FirebaseMessaging$$Lambda$5(FirebaseMessaging firebaseMessaging, ExecutorService executorService) {
        this.arg$1 = firebaseMessaging;
        this.arg$2 = executorService;
    }

    public final Object then(Task task) {
        return this.arg$1.lambda$deleteToken$5$FirebaseMessaging(this.arg$2, task);
    }
}
