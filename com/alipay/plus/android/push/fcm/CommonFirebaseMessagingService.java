package com.alipay.plus.android.push.fcm;

import com.alipay.plus.push.core.PushServiceInstance;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class CommonFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = CommonFirebaseMessagingService.class.getSimpleName();

    public void onMessageReceived(RemoteMessage remoteMessage) {
        PushServiceInstance.getPushService().dispatchMessage(remoteMessage);
    }
}
