package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.convertFocusDirectionToLayoutDirection;

public class MixpanelPushNotificationDismissedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("com.mixpanel.push_notification_dismissed")) {
            convertFocusDirectionToLayoutDirection.setMax(context, intent, "$push_notification_dismissed");
        }
    }
}
