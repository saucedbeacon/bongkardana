package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class FirebaseMessaging$$Lambda$3 implements Runnable {
    private final FirebaseMessaging arg$1;
    private final TaskCompletionSource arg$2;

    FirebaseMessaging$$Lambda$3(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.arg$1 = firebaseMessaging;
        this.arg$2 = taskCompletionSource;
    }

    public final void run() {
        this.arg$1.lambda$getToken$2$FirebaseMessaging(this.arg$2);
    }
}
