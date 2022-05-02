package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;

final /* synthetic */ class FirebaseMessaging$$Lambda$2 implements OnSuccessListener {
    private final FirebaseMessaging arg$1;

    FirebaseMessaging$$Lambda$2(FirebaseMessaging firebaseMessaging) {
        this.arg$1 = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        this.arg$1.lambda$new$1$FirebaseMessaging((TopicsSubscriber) obj);
    }
}
