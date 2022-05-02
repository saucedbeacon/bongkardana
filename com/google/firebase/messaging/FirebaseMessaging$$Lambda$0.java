package com.google.firebase.messaging;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;

final /* synthetic */ class FirebaseMessaging$$Lambda$0 implements FirebaseInstanceIdInternal.NewTokenListener {
    private final FirebaseMessaging arg$1;

    FirebaseMessaging$$Lambda$0(FirebaseMessaging firebaseMessaging) {
        this.arg$1 = firebaseMessaging;
    }

    public final void onNewToken(String str) {
        this.arg$1.bridge$lambda$0$FirebaseMessaging(str);
    }
}
